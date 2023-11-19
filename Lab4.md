# `Lab Report 4`

# Vim

>## Step 4

Log in to `ieng6` by typing `ssh cs15lfa23rt@ieng6.ucsd.edu<enter>` 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/4336f27e-4a69-45f6-ba48-4b2cb0ce273c)


>## Step 5

Clone the repository using the ssh url by typing `git clone git@github.com:m3cortez/lab7.git<enter>`

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/af74e7a2-4356-45e4-9687-4670b1991b84)

After type `cd lab7<enter>` to change into the directory

>## Step 6

Then run the intial test by typing `bash test.sh<enter>`

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/5254c1f8-e0ea-49b1-9ce1-41590692196e)


>## Step 7

Next to fix the code type `vim ListExamples.java<enter>` to begin editing the file. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/4bc7212c-9a79-4416-8997-c4b6a489bf19)


Then type `/index1<enter>`. This is going to search the file for all instances that match "index1". To move between the different time they show up type `nnnnnnnnn` or type `n` 9 times. Then press `e` to move to the end of the word "index1". Then type `r2` to replace the character with a "2". After save the file by pressing `:wq<enter>

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/d32920ac-4a63-41fd-a7cb-6cb1a258e793)


>## Step 8

Then rerun the test to show it succeeds by typing `bash test.sh<enter>`

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/43681a21-0e40-495e-8a0d-417b614a852b)


>## Step 9

Then to add and commit these changes type `git commit -a -m <commit message> <enter>`

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/f925b0da-15a8-455b-a404-d7d142f44b57)

