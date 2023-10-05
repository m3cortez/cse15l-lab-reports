# `Lab Report 1`

## Remote Access and FileSystem

> ## Examples using `cd`, `ls`, `cat` command lines

<br> </br>

## **Examples using no arguments**

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/514a4b78-7aac-465e-bd7a-9c889ea0cf25)

  Here typing `cd` into the command line give us no output, but using `pwd` we can see that typing the command directed our current directory to the home directory.

<br> </br>

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/4021f54a-a8f3-4bcd-943a-916200d59785)

  Here typing `ls` into the command line gives us any files or folders in our current directory. In this case we only see the `lecture1` folder because it is the only file in our current directory. (our home directory in this case)
  
<br></br>

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/75d7111d-dbea-4e4a-bf11-1f5e4de7b67e)

  Here typing `cat` into the command lines brings us to a new line, but now anything we type is under this `cat` command. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/4226ae49-4d00-44b6-8432-1df85b49fdf8)

  So after pressing enter what ever you wrote will be printed again. That is because it the input to `cat` in what ever you type in the line. The output would just be reading what you wrote. You will stay in this mode until you exit which you can do by pressing `ctrl` + `D`. 
  
  <br></br>
  
## **Examples using a path to a directory as an argument**

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/6bc98983-6927-4dfa-902f-93ec3d88812f)

Here typing `cd <path to a directory` will change current directory to the directory path give. In this case from our home directory we change to the messages directory in the `lecture1` folder 

<br></br>

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/56ee6178-c88e-4fa7-8fbc-e734b75ea935)

Here typing `ls <path to directory>` will list all files and directories in the directory path we provided. In this case it list all the `.txt` files inside the messages directory. Our current directory is not changed.

<br></br>

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/b54daa80-6c70-48d3-8f03-16a3364c1920)

Here typing `cat <path to directory>` will give us an output saying that our path is a directory. This is an error because we can't `cat` directories.

<br></br>

## **Examples using a path to a file as an argument**

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/50940d96-5618-44e4-9d00-28ac068107aa)

Here typing `cd <path to file>` will give us an output saying that our path is a file. This is an error because `cd` (change directories) only works for directories.

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/a739dc95-4480-4512-9974-025c4a603850)

Here typing `ls <path to file>` will gives an output which is simply the file path we used. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/2f292da6-ce18-4435-b4b9-63a8ec751061)

Here typing `cat <path to file>` will print out the contents of the file we provided. In this case the `en-ko.txt` file has the Korean translation for "Hello World!".
