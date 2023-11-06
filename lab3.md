# `Lab Report 3`

## Bugs and Commands

## **Part 1** 

> ## 




## **Part 2**

> ## Researching `find` Commands

## `find -path`

I looked up find command options and came upon the link https://man7.org/linux/man-pages/man1/find.1.html
The website says that using this command will find files that match a pattern while ignoring metacharacters like `/` and `.`
The format is `find -path "<pattern>"` the pattern needs to be in quotes. This is different than our normal find command because it took in a directory path, so if the directory doesn't exist then there would be an error.

![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/ce75b3a2-9acf-4112-ac7d-d5e598fa9ab3)

In the previous lab we had to `grep` our find results to find all the paths that ended in `.txt`. In this instance if our path doesn't match a directory that exists it doesn't work.
![image](https://github.com/m3cortez/cse15l-lab-reports/assets/130080853/aa8a079e-8a28-4725-98ce-5a63e31eae73)

Now using the `-path` option, the command is now looking for any path that ends in `.txt`, without the specifcation of the exact file structure. 



