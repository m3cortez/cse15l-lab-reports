# Lab Report 1

## How to log into a course-specific account on ***ieng6***

> ## Install VS Code

Click the link and this will take you to the VS Code download website. Download and then install on you computer. Use all the sugessted settings. 

  [VS Code Download](https://code.visualstudio.com/)
  
  ![VS Code download](https://user-images.githubusercontent.com/130080853/230438667-9e57d50e-1387-4521-907a-5d16a6530d88.JPG)
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
  * You can also change between different terminals in the dropdown menu
  ![image](https://user-images.githubusercontent.com/130080853/230758557-e0fb7334-4e8e-463d-89c9-2d67a2a02f71.png)

  

  Once this is done you are ready to log in to a remote server
  
> ## Connecting to remote server

Type `ssh cs15lwi23zz@ieng6.ucsd.edu` into the terminal (this will begin to connect you to the remote server)

You should get a message warning about the authenticty of the server. This is your first time loging on so this is expected. Type `Y` to continue.

After you should be prompted for your password. Keep in mind your typing may not be visible but it is indeed typing.

> ## Running Commands
  ## These are some commands you can try out
  
  
  * `cd ~` (Change Directory)
  * `cd`
  * `ls -lat`(List)
  ![image](https://user-images.githubusercontent.com/130080853/230758795-1492b8b8-c73f-4290-b7d8-64aa86507c49.png)

  * `ls -a`
    ![image](https://user-images.githubusercontent.com/130080853/230758842-767a7c9b-b20e-4d4a-a42a-56b5c54c4940.png)

  * `ls <directory>`
  The directory is could be anything but an example could be `/home/linux/ieng6/cs15lsp23/abc` where `abc` is the username of another member (Access should be denied when running this command)
  ![image](https://user-images.githubusercontent.com/130080853/230758894-a1f5a27a-dbe3-4cf7-8f8f-8e6f1250edfe.png)

  * `cp /home/linux/ieng6/cs15lwi23/public/hello.txt ~/`
  * `cat /home/linux/ieng6/cs15lwi23/public/hello.txt`


