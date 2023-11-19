# `Lab Report 3`

## Bugs and Commands

## **Part 1** 

> ## Bugs

## failure inducing input

  ```
      @Test
   public void testReverseInPlaceReg() {
   int[] input1 = {3,2,1};
   ArrayExamples.reverseInPlace(input1);
   assertArrayEquals(new int[]{1,2,3}, input1);
   }
```

## non-failure inducing input

   ```
      @Test
   public void testReverseInPlaceReg() {
   int[] input1 = {3};
   ArrayExamples.reverseInPlace(input1);
   assertArrayEquals(new int[]{3}, input1);
   }
```

## Sympton Output

```
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore ArrayTests
JUnit version 4.13.2
..E
Time: 0.013
There was 1 failure:
1) testReverseInPlaceReg(ArrayTests)
arrays first differed at element [2]; expected:<3> but was:<1>
        at org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:78)
        at org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:28)
        at org.junit.Assert.internalArrayEquals(Assert.java:534)
        at org.junit.Assert.assertArrayEquals(Assert.java:418)
       at org.junit.Assert.assertArrayEquals(Assert.java:429)
        at ArrayTests.testReverseInPlaceReg(ArrayTests.java:16)
        ... 30 trimmed
Caused by: java.lang.AssertionError: expected:<3> but was:<1>
        at org.junit.Assert.fail(Assert.java:89)
        at org.junit.Assert.failNotEquals(Assert.java:835)
        at org.junit.Assert.assertEquals(Assert.java:120)
        at org.junit.Assert.assertEquals(Assert.java:146)
        at org.junit.internal.ExactComparisonCriteria.assertElementsEqual(ExactComparisonCriteria.java:8)
        at org.junit.internal.ComparisonCriteria.arrayEquals(ComparisonCriteria.java:76)
        ... 36 more
FAILURES!!!
Tests run: 2,  Failures: 1
```

## Before and after Bug fix

> Before

```
static void reverseInPlace(int[] arr) {
   for(int i = 0; i < arr.length/2; i += 1) {
      arr[i] = arr[arr.length - i - 1];
      }
  }
```

> After

```
static void reverseInPlace(int[] arr) {
   for(int i = 0; i < arr.length/2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
      }
  }
```

> Explaination

In the before code we would change the current index element to the element if the array was reversed, but in doing so we lose the data of what the previous element was. 
In the after code I created a temp variable to store the value of the curr index element. I would then do the switch from the before code. This time I remember to not only change the current index but also the corresponding index towards the end of the array.

## **Part 2**

> ## Researching `find` Commands

## `find -path`

I looked up find command options and came upon the link https://man7.org/linux/man-pages/man1/find.1.html. Here is says that `find -path` searches for paths that match a pattern. Using this option it ignores special characters like `/` and `.`. 

```
$ find -path "*plos*med"
./technical/plos/pmed.0010008.txt
./technical/plos/pmed.0010010.txt
./technical/plos/pmed.0010012.txt
...
```

Here I am searching for files in the `technical/plos` directory that have the keyword "med". This is useful because I can search for specific patterns in all the file paths of the my current directory. It is similar to the `grep` command but instead of searching a text file, I am searching recursivly all the file paths in my current directory. 

```
$ find -path "*gov*.com*"
./technical/government/About_LSC/commission_report.txt
./technical/government/Alcohol_Problems/DraftRecom-PDF.txt
./technial/government/Media/grants_fail_to_come.txt
./technical/government/Media/Low-income_children.txt
./technical/government/Post_Rate_Comm/Cohenetal_comparision.txt
...
```

In this example, I am searching the government folder and getting the paths that reference the keyword "com". This command in general is helpful especially if the file structure is unknown or if it is too long to use a regular find command. 


## `find -delete`

Again I got my information from https://man7.org/linux/man-pages/man1/find.1.html after searching for "find command options". The purpose of this command is to delete the files provided by the find command. This doesn't work for directories that have items in them. 

`$ find -path "*911*chapter-1.txt" -delete`<br>

In this example I decided to combine the `-path` option with `-delete`. This command doesn't output anything in the terminal, but when you look back at the files it will show that the file or files you found using the find command will be deleted. 

`$ find -path "*911report" -delete`<br>

When `find` only gives you directories the `-delete` option will cause an error saying that you can't delete directories. This is because only empty directories can be delete.

## `find -size`

I got the information of this option from the same website https://man7.org/linux/man-pages/man1/find.1.html. Here it says that this command helps find files that are less than or equal to the amount of units of space specified. The valid units are `b` , `c`, `w`, `k`, `M`, `G` which represent different sized units of space. 
```
$ find technical/ -size -10G
technical/plos/pmed.0020208.txt
technical/plos/pmed.0020209.txt
technical/plos/pmed.0020210.txt
technical/plos/pmed.0020212.txt
technical/plos/pmed.0020216.txt
...
```

Here I used the find command to specify the files that are less than or equal to 10 gigabytes of space. This brings us every file since none are over 10 gigabytes

```
$ find technical/ -size -1c
technical/
technical/911report
technical/biomed
technical/government
technical/government/About_LSC
technical/government/Alcohol_Problems
technical/government/Env_Prot_Agen
technical/government/Gen_Account_Office
technical/Media
technical/Post_Rate_Comm
technical/plos
...
```

 In this example I now search for paths that are less than or equal to 1 byte. This ends up returning just paths to directories. Since the directories themselves are less than equals to 1 byte of space. 



## `find -type`

I also got this information from the same website https://man7.org/linux/man-pages/man1/find.1.html. Here it says that the `-type` option helps find file paths of certain types. The valid types are `b`,`c`,`d`,`p`,`f`,`l`,`s`,`D`. 

```
$ find technical/ -type d
technical/
technical/911report
technical/biomed
technical/government
technical/government/About_LSC
technical/government/Alcohol_Problems
technical/government/Env_Prot_Agen
technical/government/Gen_Account_Office
technical/Media
technical/Post_Rate_Comm
technical/plos
...
```

In this example I am the `-type d` means I am looking for directories. So my put is all the directories and sub directories of `/technical`. 

```
$ find technical/911report -type f
technical/911report/chapter-10.txt
technical/911report/chapter-11.txt
technical/911report/chapter-12.txt
technical/911report/chapter-13.1.txt
technical/911report/chapter-13.2.txt
technical/911report/chapter-13.3.txt
technical/911report/chapter-13.4.txt
...
```

Now in this example `type f` is refering to all regular files. So the command is asking for all the files in `technical/911report`. 

