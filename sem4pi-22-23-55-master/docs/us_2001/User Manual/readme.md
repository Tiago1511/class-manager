# User Manual: Creating Exams using createExam Grammar


## 1. Context
\
This user manual provides instructions on how to correctly write an exam using the createExam grammar. By following the guidelines outlined in this manual, you can ensure that your exam files adhere to the required format.

## 2. Exam Structure
> An exam consists of multiple sections, each containing different types of questions. The createExam grammar supports the following question types:
> * Multiple-choice questions
> * True/False questions
> * Text answer questions


## 3. Exam File Format
\
To create an exam using the createExam grammar, follow these steps:

>*1.* Open a plain text editor (e.g., Notepad, Sublime Text, or any other text editor of your choice).

>*2.* Start the exam file by providing the following information in the specified order:
>* Exam Name: Use the Exam: keyword followed by the name of the exam.
>* Exam Code: Use the Code: keyword followed by a unique code or identifier for the exam.
>* Total Marks: Use the TotalMarks: keyword followed by the total marks for the exam.
>* Passing Marks: Use the PassingMarks: keyword followed by the minimum marks required to pass the exam.
>* Duration: Use the Duration: keyword followed by the duration of the exam.

>*3.* Define the sections of the exam. Each section should include the following details:
>* Section Name: Use the Section: keyword followed by the name or title of the section.
>* Section Marks: Use the Marks: keyword followed by the marks allocated to the section.
>* Questions: Use the Questions: keyword to indicate the start of the questions for the section.

>*4.* For each section, add the specific types of questions based on the question types supported by the createExam grammar.


### 3.1 Multiple-choice Questions
\
To add multiple-choice questions to the exam, follow these guidelines:

>*1.* Use the Question Type: Multiple Choice keyword to indicate the start of a multiple-choice question block.

>*2.* Specify the marks allocated to the multiple-choice question block using the Marks: keyword followed by the marks.

>*3.* Add the multiple-choice questions with the following structure:
>* Question Text: Write the question text.
>* Answer Choices: Add the answer choices for the multiple-choice question.
>* Correct Answer: Use the Correct Answer: keyword followed by the correct answer choice.
>* Explanation: Provide an explanation or additional information about the question.


### 3.2 True or False Questions
\
 To include true/false questions in the exam, follow these guidelines:

>*1.* Use the Question Type: Boolean keyword to indicate the start of a true/false question block.

>*2.* Specify the marks allocated to the true/false question block using the Marks: keyword followed by the marks

>*3.* Add the true/false questions with the following structure:
>* Question Text: Write the true/false question.
>* Correct Answer: Use the Correct Answer: keyword followed by the correct answer choice.


### 3.3 Text Answer Questions
\
To include true/false questions in the exam, follow these guidelines:

>*1.* Use the Question Type: Text Answer keyword to indicate the start of a text answer question block

>*2.* Specify the marks allocated to the text answer question block using the Marks: keyword followed by the marks.

>*3.* Add the text answer questions with the following structure:
>* Question Text: Write the text answer question.
>* Correct Answer: Use the Correct Answer: keyword followed by the correct answer.


## 4. Exam Examples

[History >](../exams/humanities/historyExam.txt)
```
Exam: History
Code: HIST1
TotalMarks: 200
PassingMarks: 100
Duration: 30 minutes



Section: Ancient Civilizations
Marks: 60
Questions:

Question Type: Multiple Choice
Marks: 30
1. Which ancient civilization built the Great Pyramids of Giza?
   a. Egyptian civilization
   b. Mayan civilization
   c. Greek civilization
   d. Roman civilization
Correct Answer: a

Question Type: Multiple Choice
Marks: 30
2. The Indus Valley Civilization flourished in which present-day country?
   a. India
   b. China
   c. Egypt
   d. Iraq
Correct Answer: a


Section: World Wars
Marks: 60
Questions:

Question Type: Multiple Choice
Marks: 30
MC 1. When did World War I begin?
   a. 1914
   b. 1918
   c. 1939
   d. 1945
Correct Answer: b

Question Type: Multiple Choice
Marks: 30
2. Who was the leader of Nazi Germany during World War II?
   a. Adolf Hitler
   b. Joseph Stalin
   c. Winston Churchill
   d. Franklin D. Roosevelt
Correct Answer: a


Section: General Knowledge
Marks: 80
Questions:

Question Type: Text Answer
Marks: 40
1. What is the capital of France?
Correct Answer: Paris

Question Type: Text Answer
Marks: 40
2. Who is the inventor of Apple?
Correct Answer: Steve Jobs

````


[Biology >](../exams/sciences/biologyExam.txt)
````
Exam: Biology Test
Code: BIO1
TotalMarks: 200
PassingMarks: 100
Duration: 90 minutes


Section: Cell Biology
Marks: 80
Questions:

Question Type: Multiple Choice
Marks: 20
1. What is the basic unit of life?
a. Cell
b. Atom
c. Organ
d. Molecule
Correct Answer: a

Question Type: Boolean
Marks: 20
2. True or False: Plant cells have a cell wall.
Correct Answer: True

Question Type: Text Answer
Marks: 40
3. Describe the function of mitochondria.
Correct Answer: Mitochondria are responsible for producing energy in the form of ATP through cellular respiration.


Section: Genetics
Marks: 60
Questions:

Question Type: Text Answer
Marks: 30
1. What is the term for the passing of traits from parents to offspring?
Correct Answer: Heredity

Question Type: Boolean
Marks: 30
2. True or False: DNA stands for Deoxyribonucleic acid.
Correct Answer: True

Section: Ecology
Marks: 60
Questions:

Question Type: Text Answer
Marks: 40
1. What is the primary source of energy for most ecosystems?
Correct Answer: Sunlight

Question Type: Boolean
Marks: 20
2. True or False: Recycling is an example of sustainable environmental practice.
Correct Answer: True
````

[General Science >](../exams/sciences/generalExam.txt)
````
Exam: General Science
Code: GSCI1
TotalMarks: 200
PassingMarks: 100
Duration: 60 minutes


Section: Physics
Marks: 80
Questions:

Question Type: Multiple Choice
Marks: 20
1. Which of the following is an example of a scalar quantity?
a. Velocity
b. Force
c. Mass
d. Acceleration
Correct Answer: c

Question Type: Boolean
Marks: 40
2. True or False: Sound waves require a medium to travel through.
Correct Answer: True


Section: Chemistry
Marks: 60
Questions:

Question Type: Text Answer
Marks: 30
1. What is the chemical symbol for gold?
Correct Answer: Au

Question Type: Boolean
Marks: 30
2. True or False: An acid turns blue litmus paper red.
Correct Answer: True


Section: Biology
Marks: 80
Questions:

Question Type: Text Answer
Marks: 40
1. What is the largest organ in the human body?
Correct Answer: Skin

Question Type: Boolean
Marks: 40
2. True or False: Mitochondria are the powerhouse of the cell.
Correct Answer: True
````

# 5. Application 

### 1º The teacher enters his menu and selects exam menu

![Step 1](../User%20Manual/img.png) 


### 2º Enters the Exams menu and selects the exams' course
![Step 2](../User%20Manual/img_1.png)


### 3º After typing the file path the Exam is printed and saved (if valid)
![Step 3](../User%20Manual/img_2.png)