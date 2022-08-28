# Lab 1, CS 114, Fundamentals of Computing I
## 1. Names and Places
The goal in this exercise is to develop a program that will print out a list of student names together with other information for each. The _tab character_ (an escape sequence) is helpful in getting the list to line up nicely. A program with only two names is in the file `Names.java`.

```java
// ************************************************************
//    Names.java
//
//    Prints a list of student names with their hometowns and
//    intended major
// ************************************************************
public class Names {
    // --------------------------
    //  main prints the list
    // --------------------------
    public static void main (String[] args) {
        System.out.println ();
        System.out.println (" \tName\t\tHometown") ;
        System.out.println ("\t====\t\t========");
        System.out.println ("\tSally\t\tRoanoke");
        System.out.println ("\tAlexander\tWashington");
        System.out.println ();
    }
}
```

1. Save `Names.java` to a local directory. Compile and run it to see how it works.
2. Modify the program so that your name and hometown and the name and hometown of at least two classmates sitting near
you in lab also are printed. Save, compile, and run the program. Make sure the columns line up.
3. Modify the program to add a third column with the intended major of each person (assume Sally’s major is Computer
Science and Alexander’s major is Math). Be sure to add a label at the top of the third column and be sure everything is lined up (use tab characters!).

---

## 2. A Table of Student Grades
Write a Java program that prints a table with a list of at least 5 students together with their grades earned (lab points, bonus points, and the total) in the format below.

```java
///////////////////\\\\\\\\\\\\\\\\\\\
==          Student Points          ==
\\\\\\\\\\\\\\\\\\\///////////////////

Name        Lab       Bonus    Total
----        ---       -----    -----
Joe         43        7        50
William     50        8        58
Mary Sue    39        10       49
```

The requirements for the program are as follows:

1. Save `StudentGrades.java` to a local directory. Compile and run it to see that it works.
2. Print the border on the top as illustrated (using the forward slash and back slash characters).
3. Use tab characters to get your columns aligned, and use the + operator both for addition and string concatenation.
4. Make up your own student names and points — the ones shown are just for illustration purposes. You need 5 names in total, including the ones already provided.

---

## 3. Correct Syntax Errors
Carefully study `Error2.java` and then find and correct all of its syntax errors. Compile and run the final program.

---
