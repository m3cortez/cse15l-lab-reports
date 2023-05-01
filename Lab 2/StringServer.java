import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a group of strings that will be manipulated by
    // various requests.
    ArrayList<String> result = new ArrayList<>();

    public String handleRequest(URI url) {
        String query = url.getQuery();

        if (url.getPath().equals("/")) {
            return String.join("\n", result);
        } 
        else if (url.getPath().contains("/add")) {
            if(query.startsWith("s=")) {
                result.add(query.split("=")[1]);
                return String.join("\n", result);
            }
        } else {
            return "404 Not Found!";
        }
        return String.join("\n", result);
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
