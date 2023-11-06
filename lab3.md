# `Lab Report 3`

## Bugs and Commands

## **Part 1** 

> ## Bugs

## failure inducing input

`  @Test 
	public void testReverseInPlaceReg() {
    int[] input1 = {3,2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2,3}, input1);
	}
 `



## **Part 2**

> ## Researching `find` Commands

## `find -path`

I looked up find command options and came upon the link https://man7.org/linux/man-pages/man1/find.1.html. Here is says that `find -path` searches for paths that match a pattern. Using this option it ignores special characters like `/` and `.`. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/c01f2ca4-754c-4961-8122-57aaba23ac6b)

Here I am searching for files in the `technical/plos` directory that have the keyword "med". This is useful because I can search for specific patterns in all the file paths of the my current directory. It is similar to the `grep` command but instead of searching a text file, I am searching recursivly all the file paths in my current directory. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/7d347f8a-407e-4750-94c8-5bbb191062b5)

In this example, I am searching the government folder and getting the paths that reference the keyword "com". This command in general is helpful especially if the file structure is unknown or if it is too long to use a regular find command. 


## `find -delete`

Again I got my information from https://man7.org/linux/man-pages/man1/find.1.html after searching for "find command options". The purpose of this command is to delete the files provided by the find command. This doesn't work for directories that have items in them. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/847c530f-07fd-4657-b998-9f66ff077428)

In this example I decided to combine the `-path` option with `-delete`. This command doesn't output anything in the terminal, but when you look back at the files it will show that the file or files you found using the find command will be deleted. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/a1a13642-65d1-4046-bb94-963d9739bb8b)

When `find` only gives you directories the `-delete` option will cause an error saying that you can't delete directories. This is because only empty directories can be delete.

## `find -size`

I got the information of this option from the same website https://man7.org/linux/man-pages/man1/find.1.html. Here it says that this command helps find files that are less than or equal to the amount of units of space specified. The valid units are `b` , `c`, `w`, `k`, `M`, `G` which represent different sized units of space. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/397591be-68d8-4823-90c7-4bbd5c2a6117)

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/bd0b8398-d77a-4b27-b3e8-ee77581f2f25)

Here I used the find command to specify the files that are less than or equal to 10 gigabytes of space. This brings us every file since none are over 10 gigabytes

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/14f20413-e016-481e-a35c-46dd1ba85c55)

 In this example I now search for paths that are less than or equal to 1 byte. This ends up returning just paths to directories. Since the directories themselves are less than equals to 1 byte of space. 



## `find -type`

I also got this information from the same website https://man7.org/linux/man-pages/man1/find.1.html. Here it says that the `-type` option helps find file paths of certain types. The valid types are `b`,`c`,`d`,`p`,`f`,`l`,`s`,`D`. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/a6561e90-94b7-4039-b683-aca919086f89)

In this example I am the -type d` means I am looking for directories. So my put is all the directories and sub directories of `/technical`. 

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/aa4c4e34-aa00-4c25-8f62-f5cc088d0412)

Now in this example `type f` is refering to all regular files. So the command is asking for all the files in `technical/911report`. 

