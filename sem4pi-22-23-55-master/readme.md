[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10488088&assignment_repo_type=AssignmentRepo)
# Project eCourse

## 1. Description of the Project

Learning Systems (LS) is an IT company that specializes in developing learning solutions. 

Due to the pandemic and remote working, LS identified new opportunities to support remote learning and plans to explore a new software solution called eCourse using a minimum viable product (MVP) approach. 

The platform should support teachers, students, and managers and include Automated Exams and Shared Boards features. 

LS aims to develop a functional prototype in three months that validates the main ideas in the document and can be the basis for a commercial system.

## 2. Planning and Technical Documentation

[Planning and Technical Documentation](docs/readme.md)

## 3. How to Build

### Windows
| terminal                                                                               | Task Manager                                                    |
|----------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| 1º open the terminal                                                                   | 1º open the Task Manager                                        |
| 2º Navigate to the directory where the Maven project is located using the "cd" command | 2º Navigate to the directory where the Maven project is located |
| 3º write: .\build-all.bat                                                              | 3º Double click on the build-all file                           |                                                              |

### Linux

| terminal                                                                               |
|----------------------------------------------------------------------------------------|
| 1º open the terminal                                                                   |
| 2º Navigate to the directory where the Maven project is located using the "cd" command |
| 3º write: ./build-all.sh                                                               |


## 4. How to Execute Tests

### Windows
| terminal                                                                               | Task Manager                                                    |
|----------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| 1º open the terminal                                                                   | 1º open the Task Manager                                        |
| 2º Navigate to the directory where the Maven project is located using the "cd" command | 2º Navigate to the directory where the Maven project is located |
| 3º write: .\run-tets.bat                                                               | 3º Double click on the run-test file                            |                                                              |

### Linux

| terminal                                                                               |
|----------------------------------------------------------------------------------------|
| 1º open the terminal                                                                   |
| 2º Navigate to the directory where the Maven project is located using the "cd" command |
| 3º write: ./run-tets.sh                                                                |


## 5. How to Run

### Windows
| terminal                                                                               | Task Manager                                                    |
|----------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| 1º open the terminal                                                                   | 1º open the Task Manager                                        |
| 2º Navigate to the directory where the Maven project is located using the "cd" command | 2º Navigate to the directory where the Maven project is located |
| 3º write: .\run-bootstrap.bat                                                          | 3º Double click on the run-bootstrap file                       |                                                              |
| 4º write: .\run-backoffice.bat                                                         | 4º Double click on the run-backoffice file                      |
### Linux

| terminal                                                                               |
|----------------------------------------------------------------------------------------|
| 1º open the terminal                                                                   |
| 2º Navigate to the directory where the Maven project is located using the "cd" command |
| 3º write: ./run-bootstrap.sh                                                           |
| 4º write: ./run-backoffice.sh                                                          |


## 6. How to Install/Deploy into Another Machine (or Virtual Machine)

**Install**

To install, you must first follow the [us_g004 documentation](docs/us_g004/readme.md) related to the environment variables.

After the first step, you must download the project from GitHub if you do not already have it on your machine, so that you can then run it.

**Deploy**

There is no problem in running the program on your machine because everything will be in sync due to JPA and the relational database.

Now you must follow the steps presented in the previous topics, How to Build and How to Run, according to your machine.

Finally, you must log in with your user credentials and thus be able to use the application's functionalities according to your role.

## 7. How to Generate PlantUML Diagrams

To generate plantuml diagrams for documentation execute the script (for the moment, only for linux/unix/macos):

    ./generate-plantuml-diagrams.sh


