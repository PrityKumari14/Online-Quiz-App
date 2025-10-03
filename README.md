# Online Quiz App (Console-Based)

##  Project Overview

This is a **Java console-based quiz application**.
The app allows users to answer multiple-choice questions, calculates their score, and shows the result at the end.
It’s a simple project to understand **Java classes, lists, user input, and condition checking**.

---

##  Objective

* Create a mini quiz application using **Java and console input/output**.
* Learn how to store questions, accept answers, and calculate scores.

---

##  Tools & Technologies

* **Java** (JDK 8 )
* **Console/Terminal** (VS Code terminal, or Command Prompt)

---

##  Code Explanation

1. **`Question` Class**

   * Stores the question text, options, and the correct answer.
   * Contains a method `checkAnswer()` to verify user input.

2. **`OnlineQuizApp` Class (Main)**

   * Uses a **List of questions** (`ArrayList<Question>`) to store multiple quiz questions.
   * Displays each question with four options (A, B, C, D).
   * Accepts user input using `Scanner`.
   * Compares the user’s answer with the correct one.
   * Keeps track of the score.
   * At the end, displays the **final score**.

3. **User Input & Scoring**

   * The user enters answers as `A`, `B`, `C`, or `D`.
   * Correct answers increase the score.
   * At the end, the app prints:

     ```
     --- Quiz Finished ---
     Your Score: X/Y
     ```

---

##  How to Run the Project

1. Open terminal/command prompt in your project folder.
2. Compile the Java file:

   ```
   javac OnlineQuizApp.java
   ```
3. Run the program:

   ```
   java OnlineQuizApp
   ```
4. Answer the questions by typing `A`, `B`, `C`, or `D`.
5. At the end, your score will be displayed.

---

##  Sample Run

```
Q1. Which language is platform independent?
A. C
B. C++
C. Java
D. Python
Enter your answer (A/B/C/D): C
 Correct!

Q2. Which keyword is used to inherit a class in Java?
A. this
B. super
C. extends
D. implements
Enter your answer (A/B/C/D): D
 Wrong! Correct Answer: C

--- Quiz Finished ---
Your Score: 1/2
```

---

##  Features

* Easy-to-use console interface.
* Multiple-choice questions.
* Score tracking system.
* Extendable → Just add more questions to the list.

---
