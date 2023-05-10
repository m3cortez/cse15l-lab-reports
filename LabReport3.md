# `Lab Report 3` 

I chose to find interesting and alterantive ways to use the `grep` command. The following options to use `grep` are all from using ChatGPT. <br/>
For specifics I prompted ChatGPT with `Is there any alternative ways to use the grep command in bash?` and by asking `How is the grep command normally used in bash?`.<br/>
<br/>
<br/>
>## Using `grep` to search for a string through an entire directory

By using this format ```grep -r <string> <directory>```<br/>
The command will search for that string in this directory and all of its subdirectories.

> **Example 1**

Command Line:

`grep -r "1999" technical`

Output: </br>

```
technical/911report/chapter-11.txt:            In the period between December 1999 and early January 2000, information about
technical/911report/chapter-13.3.txt:                terrorism between 1999 and July 2001, with special attention on domestic
technical/911report/chapter-13.4.txt:                about the maritime operation sometime in late 1999 and credited Nashiri as its
technical/911report/chapter-13.4.txt:                Arabia in 1999 and 2000 to meet with Saudi officials on terrorist financing
. . . 
```

This continues on for many more lines but the important takeaway with this command is that for each line, it gives us the path used and the line that matched our search. Although not shown this goes through every directory in technical. `technical/911report` , `technical/biomed`, `technical/government` and `technical/plos`. This specific command is helpful because it searches for all the times the date 1999 is used.

> **Example 2**

Command Line:

`grep -r "Broderick" technical`

Output: </br>

```
technical/biomed/1471-2377-1-2.txt:        Massachusetts. In 1998, Broderick et al [ 5] hypothesized
technical/biomed/1471-2377-1-2.txt:        recent estimates of Broderick et al [ 5] and Williams et
technical/biomed/1471-2377-1-2.txt:        Broderick et al [ 5] and Williams et al [ 8] by
technical/government/About_LSC/commission_report.txt:Broderick, Jr. Edna Fairbanks-Williams F.Wm. McCalpin Maria Luisa
technical/government/About_LSC/State_Planning_Special_Report.txt:Hulett H. Askew John T. Broderick, Jr. John N. Erlenborn Edna
technical/government/About_LSC/State_Planning_Special_Report.txt:Justice John T. Broderick and Ernestine Watlington, the Task Force
technical/government/About_LSC/State_Planning_Special_Report.txt:Justice Broderick delivered an interim report from the Task
technical/government/About_LSC/State_Planning_Special_Report.txt:September 8, 2001, in Alexandria, Va. Broderick reported that the
technical/government/Gen_Account_Office/d0269g.txt:calboml@gao.gov,or Tom Broderick, Assistant Director,
technical/government/Gen_Account_Office/d0269g.txt:Mail: Tom Broderick, Assistant Director
technical/government/Gen_Account_Office/d0269g.txt:Tom Broderick, (202) 512-8705 Marie Novak, (202) 512-4079
```

In this example it better shows that the command is look through **every** subdirectory. I lookes in technical then government and even into the directorys in there as well. For this specific command using the name of an important person can help find all the mentions of their name in related text. Essentially the `-r option gives way to specify out search using grep.

>## Using `grep` to search for a string while ignoring specific files

By using this format `grep <string> <directory>/* --exclude=<file>`<br/>
The command will search for that string in this directory while excluding a file of your choice

> **Example 1**

Command Line:

`grep "September" technical/911report/* --exclude=chapter-1*.txt`

Output: </br>
```
  technical/911report/chapter-2.txt:                most militant opponents. But after September 1996, when first Jalalabad and then
technical/911report/chapter-3.txt:                immigration authorities at John F. Kennedy International Airport in September 1992
technical/911report/chapter-3.txt:                in September 2001, one year after Watson presented his plan to field executives,
technical/911report/chapter-3.txt:                years before September 11, terrorism seldom registered as important. To the extent
technical/911report/chapter-3.txt:                number of hearings on terrorism from January 1998 to September 2001. The Senate
technical/911report/chapter-3.txt:                the attacks of September 11, perhaps in part because of the classified natu
  . . . 
  ```

In this exmple I am searching for the string "September" while excluding the chapters that start with starting with a 1. This leaves me with the text from chapters 2-9 and the preface. Again with this command it gives us the file path and the line that matched the search. This option gives even more specifications to the grep search.

> **Example 2**

Command Line:

`grep -r "viruses" technical/plos --exclude=journal.pbio.*`

Output: </br>
  
```
technical/plos/pmed.0010036.txt:        acute phase of infection in humans and animals exposed to AIDS-associated retroviruses
technical/plos/pmed.0010041.txt:        against viruses that are normally cleared or controlled by the immune system [9].
technical/plos/pmed.0010048.txt:        viruses circulating in the population,” says Walker.
technical/plos/pmed.0020015.txt:        are usually associated with viruses [28] and of documented, virus-associated pneumonia
technical/plos/pmed.0020036.txt:        possible using live viruses attenuated by specific mutations or by pharmacological
technical/plos/pmed.0020117.txt:        rapidly increasing number of established and emerging recombinant viruses, it is subtype B
technical/plos/pmed.0020117.txt:        critical issue is whether viruses from some subtypes or particular regions are more likely
technical/plos/pmed.0020117.txt:        people with non-subtype-B viruses, and also could help decide how patients with
technical/plos/pmed.0020117.txt:        questions: first, whether the mutations that cause drug resistance in subtype B viruses
technical/plos/pmed.0020117.txt:        also develop in non-subtype-B viruses exposed to antiretroviral drugs, and second, whether 
. . .
```

Another example where searching "viruses" in the plos directory but excluding the journal entries and only outputing the pmed text files.

>## Using `grep` to search for a snippet of lines that match the search

By using this format `grep -C <number_of_lines> <string> <file>`<br/>
The command will search for that string in this file while allowing for a number of lines before and after the line that matches our search

> **Example 1**

Command Line:

`grep -C 3 "Plane" technical/911report/*`

Output: </br>
  
```
technical/911report/chapter-1.txt-
technical/911report/chapter-1.txt-    Unidentified Female Voice: They have what?
technical/911report/chapter-1.txt-
technical/911report/chapter-1.txt:    Boston Center: Planes, as in plural.
technical/911report/chapter-1.txt-
technical/911report/chapter-1.txt-    Boston Center: It sounds like, we're talking to New York, that there's another one aimed at the World Trade Center.
technical/911report/chapter-1.txt-
  ```

In this example the line that actually matched the search was the middle line `technical/911report/chapter-1.txt:    Boston Center: Planes, as in plural.`. Using the -C option allow me to mention the previous lines and the lines afterwards. This could be useful went searching for context, especially since some lines cut sentences off.

> **Example 2**

Command Line:

`grep -C 1 "Task Force" technical/911report/*`

Output: </br>

```
technical/911report/chapter-8.txt-            The FBI agent who handled the case in conjunction with the INS representative on the
technical/911report/chapter-8.txt:                Minneapolis Joint Terrorism Task Force suspected that Moussaoui might be planning to
technical/911report/chapter-8.txt-                hijack a plane. Minneapolis and FBI headquarters debated whether Moussaoui should be
  ```

Again the examples shows that grep finds the line with "Task Force", but this time only allowing 1 line before and after the searched.

>## Using `grep` to search for the text that match the a number of digits

By using this format `grep <string [#_number_range]> <file_or_directory>`<br/>
The command will search for that string in these files and will return the path any files that match the search and fit the range

> **Example 1**

Command Line:

`grep "199[0-5]" technical/plos/*`

Output: </br>

```
technical/plos/journal.pbio.0020001.txt:        output between the developing and already developed countries (Gibbs 1995; May 1997;
technical/plos/journal.pbio.0020001.txt:        the world (Gibbs 1995; May 1997; Alonso and Fernández-Juricic 2001; Vohora and Vohora
technical/plos/journal.pbio.0020001.txt:        number of their publications between 1990 and 1997 by 36% and 70%, respectively, which is a
technical/plos/journal.pbio.0020001.txt:        publications between the developed world and the developing world from 1990 until 2000,
technical/plos/journal.pbio.0020001.txt:        the number of publications from 1990 until 2000, with the United States contributing the 
  . . .
  ```

In this example output gives us any lines that range from 1990-1995. This could be useful when trying to narrow down a search but not wanting to match the search entirely. Without this we would have also gotten lines from 1996-1999. 

> **Example 2**

Command Line:

`grep "[000-999] C.E." technical/plos/*`

Output: </br>

```
  technical/plos/journal.pbio.0020439.txt:        From the time of the ancient Greek physician Galen (131–201 C.E.) until William Harvey
technical/plos/journal.pbio.0020439.txt:        period from 300 B.C.E. to 200 C.E. (in a work by Chiu Chang Suan Shu called 
  ```

Lastly in this example we could also add any large number into the brackets. This is useful becasue now we can incorperate numbers into our grep search to further narrow down the output. This could also be used with any other pattern that has numbers present like maybe journal entries or chapters.


