# `Lab Report 5`

# Debugging Scenario

>## Original Post

I am running on ieng6 and this is the lab3 repository. The files are 
![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/f079003c-c1f0-48f1-8fe8-8a3894495341)

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/dea5fe5a-3bdb-4acd-afe9-c112f7710de4)
My test.sh file.
![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/efe51257-fa06-4c5d-8160-2eba5f7d8624)
Here I am running my test.sh bash script. The script is running junit tests for ArrayTests.java. The from the error there seems to be something wrong says the junit can't be found but the path is seems correct.

>## TA Response

"Usage: javac <option> <sourcefiles>" It seems to be an issue with the format of the command. Try javac --help and look into the  -cp option. 

>## Response

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/fbe7eedb-2f12-4c23-835d-355e47f4f325)
Ran the command. it seems I need the -cp option to specify where my junit files. 

>## The Fix

To fix it I should edit the test.sh file to include -cp as an option to both the javac and java commands

>## Step 9

Then to add and commit these changes type `git commit -a -m <commit message> <enter>`

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/f925b0da-15a8-455b-a404-d7d142f44b57)
