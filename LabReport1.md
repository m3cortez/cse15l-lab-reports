# Lab Report 1

## How to log into a course-specific account on ***ieng6***

> ## Install VS Code

Click the link and this will take you to the VS Code download website. Download and then install on you computer. Use all the sugessted settings. 

  [VS Code Download](https://code.visualstudio.com/)
  
  ![VS Code Download](https://user-images.githubusercontent.com/130080853/230762952-95549bec-5ffb-4b2d-96c4-6a10d15f18fd.png)
---
> ## Download Git

Next you will download Git which will be used to access the remote server. Use the link to download git and install on your computer. Use all the suggested settings.

  [Git for Windows](https://gitforwindows.org/)
  
  ![Git download](https://user-images.githubusercontent.com/130080853/230439320-03449890-4e59-4a3a-b058-4e3d1b617ec8.JPG)
---
> ## Using Git Bash on VS Code

  * Open VS Code
  * Open the Terminal " ctrl + ` "
  * Open command Pallete using `ctrl + Shift + p`
  
    ![image](https://user-images.githubusercontent.com/130080853/230758498-25081ce9-e668-4b13-a55c-4cfa0398d5fe.png)
    
  * Type `Default Profile` and then click on the option
  * Select Git Bash from the options
  
  ![image](https://user-images.githubusercontent.com/130080853/230758530-bff8f831-7292-46e6-8fea-f7feed67d611.png)
  
  * Then click the `+` icon on the terminal (this will open a new terminal which will load git)
  
  ![image](https://user-images.githubusercontent.com/130080853/230758546-a7fc1082-fa22-460c-8145-e4497ed88b66.png)
  
  * You can also change between different terminals in the dropdown menu\
    ![image](https://user-images.githubusercontent.com/130080853/230758557-e0fb7334-4e8e-463d-89c9-2d67a2a02f71.png)

  

  Once this is done you are ready to log in to a remote server
  
> ## Connecting to remote server

Type `ssh cs15lwi23zz@ieng6.ucsd.edu` into the terminal 
`wi23zz` should be replace with the informaiton of your specific student account. (this will begin to connect you to the remote server)

You should get a message warning about the authenticty of the server. This is your first time loging on so this is expected. Type `Y` to continue.
After you should be prompted for your password. 

![image](https://user-images.githubusercontent.com/130080853/233894529-ae167e07-d04a-4fba-a2e8-5414eaf0a8da.png)

Keep in mind your typing may not be visible but it is indeed typing.
Once logged in you should be given some general information about the account and your system

![image](https://user-images.githubusercontent.com/130080853/233895361-25b63ba1-a4f3-4390-87df-8a141efd4fbb.png)


> ## Running Commands
  ## These are some commands you can try out
  
  
  * `cd ~` (Change Directory) 
  * `cd <Directory path>` This will change your wroking directory to the one entered
  * `ls -lat`(List) This will give you a list of available directories and extra information about them
  ![image](https://user-images.githubusercontent.com/130080853/230758795-1492b8b8-c73f-4290-b7d8-64aa86507c49.png)

  * `ls -a` This command will do the same, but will give you a shorter version. This also just gives you directories starting with `.` or the hidden directories
  
    ![image](https://user-images.githubusercontent.com/130080853/230758842-767a7c9b-b20e-4d4a-a42a-56b5c54c4940.png)

  * `ls <directory>`
  The directory is could be anything but an example could be `/home/linux/ieng6/cs15lsp23/abc` where `abc` is the username of another member (Access should be denied   when running this command) What ever directory entered will list what ever is in that directory
  For example typing `/home/linux/ieng6/cs15lsp23` will list all possible accounts
  
  ![image](https://user-images.githubusercontent.com/130080853/230758894-a1f5a27a-dbe3-4cf7-8f8f-8e6f1250edfe.png)

  * `cp /home/linux/ieng6/cs15lwi23/public/hello.txt ~/` this will copy the files to a directory
  * `cat /home/linux/ieng6/cs15lwi23/public/hello.txt` This will read the files and directories inside the given path
  In this example `hello.txt` does not exist and therefore cannot be copied or read by the commands
  
  ![image](https://user-images.githubusercontent.com/130080853/233901260-7376d21d-e3bf-4561-8c44-98f6a9c2a97b.png)
  
  An example where `cat <directory>` works is with `cat .bash_history` here it reads all the previous commands inputed, which is stored in this directory
  
  ![image](https://user-images.githubusercontent.com/130080853/233902625-d9b1b785-1a8a-4cf6-b2b1-f3b49d360dae.png)




