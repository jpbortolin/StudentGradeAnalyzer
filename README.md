# Student Grade Analyzer

A simple Java console application developed to analyze student grades and generate a performance report.

This project was created as part of my Java learning journey, focusing on programming logic, conditional statements, loops, input validation, and basic mathematical operations.

## Features

- Register the number of students in a class.
- Validate student grades between 0 and 10.
- Classify students based on their grades:
  - **Approved:** Grade greater than or equal to 7.0.
  - **Recovery:** Grade between 5.0 and 6.9.
  - **Failed:** Grade below 5.0.
- Calculate the class average.
- Identify the highest and lowest grades.
- Calculate the approval percentage.
- Generate a final performance report.

## Technologies

- Java
- Java Scanner
- Git & GitHub

## Project Structure

```text
StudentGradeAnalyzer/
├── src/
│   └── StudentGradeAnalyzer.java
└── README.md
```

## How to Run

**1. Clone the repository**

```bash
git clone https://github.com/jpbortolin/StudentGradeAnalyzer.git
```

**2. Navigate to the project directory**

```bash
cd StudentGradeAnalyzer
```

**3. Compile the Java file**

```bash
javac src/StudentGradeAnalyzer.java
```

**4. Run the application**

```bash
java -cp src StudentGradeAnalyzer
```

## Example Output

```text
===== SISTEMA DE ANÁLISE DE NOTAS =====

Digite a quantidade de alunos: 3

Aluno 1
Digite a nota: 8.5

Aluno 2
Digite a nota: 6.0

Aluno 3
Digite a nota: 4.0

========== RELATÓRIO FINAL ==========

Total de alunos: 3
Média geral: 6.2

Aprovados: 1
Recuperação: 1
Reprovados: 1

Maior nota: 8.5
Menor nota: 4.0

Percentual de aprovação: 33.3%

=====================================
```

## Learning Objectives

This project helped me practice and reinforce:

- `for` loops for processing multiple students.
- `while` loops for input validation.
- `if/else` statements for grade classification.
- Counters and accumulators.
- Arithmetic operations and percentage calculations.
- Comparing values to identify minimum and maximum grades.
- Organizing a Java console application.

## Future Improvements

- Refactor the application using Object-Oriented Programming (OOP).
- Implement classes to represent students and their grades.
- Support multiple classes and subjects.
- Store student information using collections.
- Add file persistence or database integration.