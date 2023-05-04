># Part 1

## The String Server Code

![image](https://user-images.githubusercontent.com/130080853/235424704-a659f7d7-0fc5-407f-8e26-afb26cf04f9a.png)

In my code I imported ArrayList to use the add method to add the new String from the query.
I also utilized the join method to add each word from the arraylist in there own indivdual line.
I used the getQuery and getPath methods to get their respective parts of the URL, the startsWith method
to make sure the Query was valid. I then used the split method to seperate the new String so I can add 
it to the ArrayList.

## The starting page

![image](https://user-images.githubusercontent.com/130080853/235424272-111afd15-247e-4eca-a9bf-0aa7e2bd9d3d.png)

## Adding "Test"

![image](https://user-images.githubusercontent.com/130080853/235424450-ea878788-a56d-4c85-9cac-5637577597e8.png)

The added string can generally be anything but if there is an = in that string when using the split method
the portion of the string after that will not be added.

## Adding "number=2"

![image](https://user-images.githubusercontent.com/130080853/235427056-4f5346c7-03c9-4dd3-82e6-bc0c64fb9790.png)

Each time this specific request is asked it changes the URL, the path, and the query. In the code the variable set assigned
to the query, the arraylist, and ultimately the returned string.
The newly added string updates the arraylist, but once the  string is returned, the page seen is represented by each string seperated by `\n` which indicates its own line

 ># Part 2

## Failure inducing code 

![image](https://user-images.githubusercontent.com/130080853/236075922-9da66d92-b0ba-4292-a733-e91da29b26a4.png)

## The test

![image](https://user-images.githubusercontent.com/130080853/236076157-648ded29-416a-48d8-9521-1629d924e997.png)

## Fixed Code

![image](https://user-images.githubusercontent.com/130080853/236076375-ccd95da1-c7e2-49d8-ac16-84ff3007ac8b.png)

The original code was using the contents of `newArray` to update `arr` even though the contents of `newArray` are empty. So I switched the order to have `arr`
update `newArray`. Then fixed the body of the for loop to switch the the corresponding indexes. Previously the code only updated the indexes ascending, with the indexes decending, leaving only half of the array reversed.

># Part 3

## What I learned from week 2-3

I have learned how to properly set up and modify a web server using the path and query of the URL. I also leanred more about bash commands and scripts, like using $1  to store command inputs and using bash scripts to save time on typing long commands. I have also learned to get more comfortable with JUnit to debug code as well.


