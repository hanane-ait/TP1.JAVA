# TPX – Strings and Arrays in Java

## Introduction

This repository contains the solutions of **TP1**.
Each exercise includes:
- a description of the problem,
- the proposed solution,
- screenshots showing the execution of the program.

---

##   Exercise 1:

###  Problem Description

We want to develop a Java program that manages students’ grades.
The program must:
- Store the grades entered from the keyboard in an array.
- Sort the grades and display them.
- Calculate and display the average of the grades.
- Determine and display the maximum grade and the minimum grade.
- Count the number of students who have a grade specified by the user.

---

###  Proposed Solution

The solution consists of::

1-Asking the user for the number of students.
2-Creating an array grades to store the grades.
3-Reading the grades from the keyboard and saving them in the array.
4-Displaying an interactive menu that allows the user to choose an operation.

The program uses:
- `Arrays.sort() to sort the grades.
- A loop to calculate the average.
- Comparisons to find the maximum and minimum grades.
- A loop to count the number of students who have a specific grade

---

###  Program Execution

Below are screenshots showing the execution of the program.

<img width="1148" height="545" alt="Image" src="https://github.com/user-attachments/assets/8d6e7f7b-aedc-46f9-a2b7-2583b9ae413d" />
<img width="401" height="91" alt="Image" src="https://github.com/user-attachments/assets/5665cc80-9945-4e20-a77b-42880d362176" />
<img width="438" height="114" alt="Image" src="https://github.com/user-attachments/assets/e8a63329-443c-429c-a378-abc922c66f41" />
<img width="487" height="123" alt="Image" src="https://github.com/user-attachments/assets/efe4e42d-9fcf-4e6e-a13f-c659ac387f7b" />

---

##  Exercise 2: 

###  Problem Description

We want to create a program that automatically conjugates a first-group French verb in the present indicative tense.
The program must ask the user to enter a verb, check that it ends with “er”, then display its conjugation with the corresponding personal pronouns, assuming that the verb is regular.

---

###  Proposed Solution

The solution consists of:

  1-Reading the verb entered by the user.

  2-Checking that the verb ends with the ending "er".

  3-Removing the ending "er" to obtain the verb stem.

  4-Adding the present indicative endings (e, es, e, ons, ez, ent) to the stem.

  5-Displaying the conjugated forms with the personal pronouns:
je, tu, il/elle, nous, vous, ils/elles.

  6-Displaying an error message if the verb is not a first-group verb.

---

###  Program Execution

<img width="909" height="372" alt="Image" src="https://github.com/user-attachments/assets/f057666a-2400-47f0-8099-8cb9ad01545a" />

---
##  Exercise 3:

###  Problem Description

The objective of this exercise is to design a Java program that allows the user to perform several operations on a character string entered from the keyboard.
The program must display a menu that lets the user choose between different operations such as entering a string, displaying it, reversing it, and counting the number of words.
After each operation, the program must return to the menu and display the message:
“Press any key to return to the menu.”
The program should continue running until the user chooses to exit

---

###  Proposed Solution

To solve this problem, an object-oriented approach is used.
A class is created to store the string and to define methods corresponding to each operation (enter, display, reverse, and word count).
The program uses a loop with a menu to allow repeated user interaction.
The number of words is calculated by considering spaces as separators and handling multiple consecutive spaces correctly.
After each operation, the program pauses and then returns to the menu until the user decides to exit.

---

###  Program Execution

Below are screenshots showing the execution of the program.

<img width="551" height="754" alt="Image" src="https://github.com/user-attachments/assets/fb912026-64e2-4547-855c-1148d40ccfe4" />

<img width="594" height="706" alt="Image" src="https://github.com/user-attachments/assets/873aa2de-de93-4578-aea2-bcdf58c9c50b" />

---
##  Exercise 4:

###  Problem Description

  The goal of this exercise is to write a Java program that analyzes a character string entered from the keyboard and counts the occurrences of each letter of the alphabet.
The program must not distinguish between uppercase and lowercase letters.
A one-dimensional array of size 26 is used to store the number of occurrences of each letter.
Only the letters that appear at least once in the text should be displayed.

---


###  Proposed Solution

The solution consists of reading the input string and converting it to a single case (uppercase) to avoid case sensitivity.
A 26-element integer array is used, where each index corresponds to a letter from A to Z.
The program scans the string character by character, checks whether each character is a letter, and increments the corresponding array element.
Finally, the program displays only the letters whose occurrence count is greater than zero, along with their respective frequencies.

---

###  Program Execution

Below are screenshots showing the execution of the program.

<img width="464" height="376" alt="Image" src="https://github.com/user-attachments/assets/cf5f5e90-47e4-4ebb-acc9-3ff3404b5268" />

---













