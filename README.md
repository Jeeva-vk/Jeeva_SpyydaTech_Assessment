# Spyyda Tech – Coding Assessment  
Author: <Jeeva>

This repository contains solutions for all six use cases given in the Spyyda Tech Coding Round.  
The solutions are implemented in Java using simple and efficient code. Each program
is placed in a separate file and can run independently.
I have done all the questions in visual code editor so it created extra files during compilation.
The main logic code are presented in Filename.java not in .class files

---

# Folder Structure

SpyydaTech_Assessment/
|
|-- WordFrequencyCounter.java
|-- BalancedBracketsValidator.java
|-- LibraryManagement.java
|-- LISLength.java
|-- URLShortener.java
|-- CalculatorHistory.java
|-- README.md

---

# How to Run (Java)

1. Install Java JDK 17+  
2. Open folder in VS Code or run from terminal
3. Compile:  javac FileName.java
4. Run    : java FileName.java
5. Run only FileName.java file not .class file



Each program asks for input during execution.

---

# Short Logic Explanation (Summary)

## 1. Word Frequency Counter
The program converts the sentence to lowercase, splits it into words, removes punctuation, and uses a
HashMap to count how many times each word occurs. Sorting is done by frequency, giving a clean output
of word → count.

## 2. Bracket Validator
It is a stack-based approach. Opening brackets are pushed, and closing brackets are matched with
the top of the stack. Any mismatch means invalid. Empty stack at the end means balanced.

## 3. Library Management System
Books are stored in an ArrayList as objects containing id, title, author and quantity. The program
supports add, search, borrow and return functions. Each operation modifies the in-memory list. A
console menu allows testing all features.

## 4. Longest Increasing Subsequence 
The classic O(n log n) binary-search based LIS algorithm is implemented. A helper list keeps track of
potential sequence endings. The length of this list gives the LIS length.

## 5. URL Shortener Logic
A short random 6-character code is generated for a given URL. Two HashMaps store both URL→code and
code→URL mappings. This lets the system shorten URLs and retrieve the original link instantly.

## 6. Calculator With History
A simple (+, -, *, /) calculator where each computation is stored in an ArrayList. The user can request
past history any time. The calculator supports repeated run until exit.

---

# Notes.
- No external libraries used.
- Each file runs independently through a main method.
- Efficient and easy understndable code


