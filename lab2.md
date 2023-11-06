# `Lab Report 2`

## Servers and SSH Keys

## **Part 1** 

> ## String Server Code

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/99b5fb00-1c3d-43a6-af26-e2211fe86928)

> ## First instace using `/add-message`

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/56497650-e858-42ca-a87e-d31901158795)

In our String Server code it calls on our `handleRequest` method which takes in the url of the website. Then uses `getpath()` then `equals(/)` to check when we are at the home page. In this case we added the path `/add-message`. Where in the code we check for using the `getPath()` and `contains()` method. Then using the `getQuery()` and `split()` methods we check for the our query and then split it. We use `equals()` to check that our query argument is `s`. I also use the `Integer.toString()` method to keep to track of number of messages and to convert that to a string. I also use the `String.format()` method to then return the number of the line and the word added.

In the code the arguments used are the path `/add-message` which is used to indentify in the code that we want to add a message. Then `?s=Hello World!` is used to indentify our query. The `s` in our query is checked to decide whether to continue to add a message. And the the portion after the `=`, in this case `Hello World!` is our message that will be added. I have 3 main fields, `int line` used to keep track of the number of messages, and `String str, word`. `str` is used to keep track of all the messages and `word` is used to keep track of the new message.

In this specific request the `line` field is change to increment by 1. The `word` field is changed to `Hello World!` and then the `str` field kept track of all changes, which in this cases is `1. Hello World!`.

> ## Second instance using `/add-message`

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/33d58661-cf9e-43dd-b18d-a805279474bc)

In this request the same methods are called. We `getPath` is used to get `/add-message`, then use the `equals` method to check that the path is valid, then the `getQuery` to get `?s=Hello!!!`, then using the split method to our parameters `s` and `Hello!!!`. We use again the `equals` method to check that our paramter `s` is the valid paramter. 

Then in the String Server code`getPath` method takes returns the path, which can be `/` or `/add-message` in this case. The   `getQuery` method returns the query which in this case is `?s=Hello!!!`. From our 3 fields our line field is updated again to give us 2, our `word` field is updated to `Hello!!!`, then our `str` field is updated to 
`1. Hello World!
2. Hello!!!`

In this request the `line` field was updated from 1 to 2 from our last request. The word field was updated from `Hello World!` to `Hello!!!`, and lastly the `str` field was updated from `1. Hello World` to 
`1. Hello World!
2. Hello!!!`
  
## **Part 2**

The path to the private key for your SSH key for logging into ieng6 (on your computer or on the home directory of the lab computer)
The path to the public key for your SSH key for logging into ieng6 (within your account on ieng6)
A terminal interaction where you log into ieng6 with your course-specific account without being asked for a password.

>## Path to private key

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/00a8503d-b8ec-456c-a1da-963063a8df23)


>## Path to public key on ieng6 account

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/45e3ac28-6b02-49d0-ab0d-db25219f46be)


>## ieng6 login with no password

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/ccdca1a1-9982-4742-8b5b-85fdf795c869)


## **Part 3**

From these last 2 labs I learned more about how the NumberServer and the String Server work. I didn't know exactly what methods were being used in the code. Now I know that the get methods for the Query and the Path. I also know more about `String.format()`. Using the `%s`, `%d` and other variations, which I think is going to be more helpful in writing code.
