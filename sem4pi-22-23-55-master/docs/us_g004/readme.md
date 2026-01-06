# Technical Documentation

Before taking any action from this document, you should verify if you have Java and Maven installed and properly configured. 

[For more information...](environmentVariables.md)

## 1. How to Build
### Windows
| terminal                                                                               | Task Manager                                                    |
|----------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| 1º open the terminal                                                                   | 1º open the Task Manager                                        |
| 2º Navigate to the directory where the Maven project is located using the "cd" command | 2º Navigate to the directory where the Maven project is located |
| 3º write: .\build-all.bat                                                              | 3º Double click on the build-all file                           |                                                              |

**Script Explanation**

Here is an explanation of each line in this script:
```
ECHO OFF
ECHO make sure JAVA_HOME is set to JDK folder
ECHO make sure maven is on the system PATH
mvn %1 dependency:copy-dependencies package
```
1. **Echo off:** This command turns off command echoing in the command prompt. It prevents the commands in the script from being displayed on the screen as they are executed.

2. **ECHO make sure JAVA_HOME is set to JDK folder:** This command prints a message to the console, reminding the user to ensure that the JAVA_HOME environment variable is set to the path of the JDK installation.

3. **ECHO make sure maven is on the system PATH:** This command prints another message to the console, reminding the user to ensure that the mvn command is on the system's PATH environment variable.

4. **mvn %1 dependency:copy-dependencies package:** This command uses Maven to build the project, including copying its dependencies to a separate folder. The %1 parameter is a placeholder for an optional Maven command-line argument, which can be used to specify additional options for the build process.

### Linux

| terminal                                                                               |
|----------------------------------------------------------------------------------------|
| 1º open the terminal                                                                   |
| 2º Navigate to the directory where the Maven project is located using the "cd" command |
| 3º write: ./build-all.sh                                                               |

**Script Explanation**

Here's an explanation of each line in this bash script:
```
#!/usr/bin/env bash
ECHO OFF
ECHO make sure JAVA_HOME is set to JDK folder
ECHO make sure maven is on the system PATH
mvn $1 dependency:copy-dependencies package
```

1. **#!/usr/bin/env bash:** This is the shebang line that specifies the path to the shell interpreter to be used to execute the script. In this case, it's /usr/bin/env bash, which is a common way to reference the Bash shell.

2. **ECHO OFF:** This command is not a valid command in Bash. Instead, it's a command that would be used in Windows batch scripts to turn off command echoing in the command prompt.

3. **ECHO make sure JAVA_HOME is set to JDK folder:** This command prints a message to the console, reminding the user to ensure that the JAVA_HOME environment variable is set to the path of the JDK installation.

4. **ECHO make sure maven is on the system PATH:** This command prints another message to the console, reminding the user to ensure that the mvn command is on the system's PATH environment variable.

5. **mvn $1 dependency:copy-dependencies package:** This command uses Maven to build the project, including copying its dependencies to a separate folder. The $1 parameter is a placeholder for an optional Maven command-line argument, which can be used to specify additional options for the build process.

## 2. How to Execute Tests

### Linux

| terminal                                                                               |
|----------------------------------------------------------------------------------------|
| 1º open the terminal                                                                   |
| 2º Navigate to the directory where the Maven project is located using the "cd" command |
| 3º write: ./run-tets.sh                                                                |

**Script Explanation**

Here's an explanation of each line in this bash script:

```
#!/bin/bash

# Executa os testes unitários do Maven
mvn test
```

This script is very simple, it runs the mvn test command in the root folder of the Maven project. 

This command compiles the source code and unit tests of the project and runs the tests. If the tests pass successfully, the command returns 0, otherwise it returns an error code.

### Windows
| terminal                                                                               | Task Manager                                                    |
|----------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| 1º open the terminal                                                                   | 1º open the Task Manager                                        |
| 2º Navigate to the directory where the Maven project is located using the "cd" command | 2º Navigate to the directory where the Maven project is located |
| 3º write: .\run-tets.bat                                                               | 3º Double click on the run-test file                            |                                                              |

**Script Explanation**

Here's an explanation of each line in this bash script:

```
@echo off

REM Executa os testes unitários do Maven
mvn test
```
This script is very similar to the Linux script I provided earlier, with a few differences. 
1. **@echo off** command is used to disable the display of the script commands on the command prompt. 
2. **REM** command is used to add a comment to the script, which is ignored by the command interpreter. 
3. **mvn test** command is executed in the root folder of the Maven project. Just like in the previous script, this command compiles the source code and unit tests of the project and runs the tests. If the tests pass successfully, the command returns 0, otherwise it returns an error code.

## 3. How to Run

### Windows
| terminal                                                                               | Task Manager                                                    |
|----------------------------------------------------------------------------------------|-----------------------------------------------------------------|
| 1º open the terminal                                                                   | 1º open the Task Manager                                        |
| 2º Navigate to the directory where the Maven project is located using the "cd" command | 2º Navigate to the directory where the Maven project is located |
| 3º write: .\run-bootstrap.bat                                                          | 3º Double click on the run-bootstrap file                       |                                                              |
| 4º write: .\run-backoffice.bat                                                         | 4º Double click on the run-backoffice file                      |

**Script Explanation**

Here is an explanation of each line in this bootstrap script:

```
REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=base.app.bootstrap\target\base.app.bootstrap-1.4.0-SNAPSHOT.jar;base.app.bootstrap\target\dependency\*;

REM call the java VM, e.g, 
java -cp %BASE_CP% eapli.base.app.bootstrap.BaseBootstrap
```
1. *REM set the class path,:* This command is a Windows batch comment that describes what the following commands do. In this case, it's setting the classpath for the Java Virtual Machine (JVM).

2. *REM assumes the build was executed with maven copy-dependencies:* This command is another Windows batch comment that explains that the script assumes that the project was built with Maven's copy-dependencies goal, which copies all project dependencies to a directory.

3. *SET BASE_CP=base.app.bootstrap\target\base.app.bootstrap-1.4.0-SNAPSHOT.jar;base.app.bootstrap\target\dependency\*;:* This command sets the BASE_CP environment variable to the path of the application's bootstrap JAR file and its dependencies. The * character is a wildcard that represents all JAR files in the target\dependency directory.

4. *REM call the java VM, e.g,:* This command is another Windows batch comment that describes the next command, which calls the Java Virtual Machine (JVM).

5. *java -cp %BASE_CP% eapli.base.app.bootstrap.BaseBootstrap:* This command runs the java command with the -cp option, which sets the classpath to the value of the BASE_CP environment variable. It also specifies the name of the main class to run, which is eapli.base.app.bootstrap.BaseBootstrap.

**Script Explanation**

Here is an explanation of each line in this backoffice script:

```
REM set the class path,
REM assumes the build was executed with maven copy-dependencies
SET BASE_CP=base.app.backoffice.console\target\base.app.backoffice.console-1.4.0-SNAPSHOT.jar;base.app.backoffice.console\target\dependency\*;

REM call the java VM, e.g, 
java -cp %BASE_CP% eapli.base.app.backoffice.console.BaseBackoffice
```
1. *SET BASE_CP=base.app.backoffice.console\target\base.app.backoffice.console-1.4.0-SNAPSHOT.jar;base.app.backoffice.console\target\dependency\*;:* This command sets the BASE_CP environment variable to the path of the application's bootstrap JAR file and its dependencies. The * character is a wildcard that represents all JAR files in the target\dependency directory.

2. *REM call the java VM, e.g,:* This command is another Windows batch comment that describes the next command, which calls the Java Virtual Machine (JVM).

3. *java -cp %BASE_CP% eapli.base.app.backoffice.console.BaseBackoffice:* This command runs the java command with the -cp option, which sets the classpath to the value of the BASE_CP environment variable. It also specifies the name of the main class to run, which is eapli.base.app.backoffice.console.BaseBackoffice.
### Linux

| terminal                                                                               |
|----------------------------------------------------------------------------------------|
| 1º open the terminal                                                                   |
| 2º Navigate to the directory where the Maven project is located using the "cd" command |
| 3º write: ./run-bootstrap.sh                                                           |
| 4º write: ./run-backoffice.sh                                                          |
