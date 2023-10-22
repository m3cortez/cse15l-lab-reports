# `Lab Report 1`

## Remote Access and FileSystem

> ## Examples using `cd`, `ls`, `cat` command lines


## **Examples using no arguments**

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/514a4b78-7aac-465e-bd7a-9c889ea0cf25)

  Before using our command our working directory is the `lecture1` directory. Typing `cd` with no argument into the command line give us no output, but using `pwd` we can see that typing the command directed our current directory to the home directory. This is not an error because it doesn't follow the logic of the command. In english `cd` with no arguments is meant to change directory to nothing, so it makes sense to keep our same directory because we didnt directed to anything, but instead it always directs us to our home directory



![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/4021f54a-a8f3-4bcd-943a-916200d59785)

  Before using our command our working directory is our home directory. Here typing `ls` with no arguments into the command line gives us any files or folders in our current directory. In this case we only see the `lecture1` folder because it is the only file/directory in our current directory. (our home directory in this case). Our working directory stays the same. This is not an error because the arguments to `ls` is a directory path, which we get from combining our working directory with the relative path of our argument. So without an argument the path `ls` uses is our working direcctory.
  


![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/75d7111d-dbea-4e4a-bf11-1f5e4de7b67e)

  Before using our command our working directory is our home directory. Here typing `cat` with no arguments into the command lines brings us to a new line, but now anything we type is under this `cat` command. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/4226ae49-4d00-44b6-8432-1df85b49fdf8)

  So after pressing enter what ever you wrote will be printed again. That is because it the input to `cat` in what ever you type in the line. The output would just be reading what you wrote. You will stay in this mode until you exit which you can do by pressing `ctrl` + `D`. This is an error because without using `ctrl` + `d` this program would run indefinataly. 

  
  
## **Examples using a path to a directory as an argument**

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/6bc98983-6927-4dfa-902f-93ec3d88812f)

Before using our command our working directory is our home directory. Here typing `cd <path to a directory` will change our current directory to the directory path give. In this case we change from our home directory  to the messages directory in the `lecture1` directory. This is not an error because our argument `lecture1/messages` is exactly where our our directory is changed to relative to our working directory which in this case is our home directory. 



![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/56ee6178-c88e-4fa7-8fbc-e734b75ea935)

Before using our command our working directory is our home directory. Here typing `ls <path to directory>` will list all files and directories in the directory path we provided. In this case we directed it to the `lecture`/messages` path which contains four `.txt` files. Our output from running the command is the list of all the `.txt` files inside the messages directory. This is not an error because the command correctly listed the names of the files in the messages directory.



![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/b54daa80-6c70-48d3-8f03-16a3364c1920)

Before using our command our working directory is our home directory. Here typing `cat <path to directory>` will give us an output saying that our path is a directory. In this case the argument is to the `lecture1/messages` directory. This is an error because we can't `cat` directories so were are giving an invalid input to the command.

>

## **Examples using a path to a file as an argument**

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/50940d96-5618-44e4-9d00-28ac068107aa)

Before using our command our working directory is our home directory. Here typing `cd <path to file>` will give us an output saying that our path is a file. In this case the argument is the path to the `en-ko.txt` files. This is an error because `cd` (change directories) only works for directories. So using a path to a file is an error because it's an invalid input.

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/a739dc95-4480-4512-9974-025c4a603850)

Before using our command our working directory is our home directory. Here typing `ls <path to file>` will gives an output which is simply the file path we used. In this case it is the path to the `en-ko.txt` file. This is not an error. The command simply gives us the contents of files/directories in directories and outputs the relative path of the files.

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/2f292da6-ce18-4435-b4b9-63a8ec751061)

Before using our command our working directory is our home directory. Here typing `cat <path to file>` will print out the contents of the file we provided. In this case the `en-ko.txt` file has the Korean translation for "Hello World!". This is not a error becauses the command executed exactly how it was supposed to.
