# Here's how to install Java and Maven environment variables on Windows:

## Installing Java and create Environment Variables
- Download and install version 11 of the Java Development Kit (JDK) from the official website: https://www.oracle.com/java/technologies/javase-downloads.html
- If you downloaded the zip version you must extract it
- After installing JDK, navigate to the installation directory and copy the path.
- In the "System" window, click on "Advanced system settings" on the left side.
- In the "System Properties" window, click on the "Environment Variables" button at the bottom.
- Under "System Variables", click on "New" and add a new variable called "JAVA_HOME" with the path of your JDK installation directory as the value.
- Then, under "System Variables" again, find the "Path" variable and click on "Edit".
- In the "Edit Environment Variable" window, click on "New" and add "%JAVA_HOME%\bin" to the path. This will ensure that the Java binaries are added to the system path.
- Click "OK" to save the changes and close all windows.

## Installing Maven and create Environment Variables:
- Download and install the latest version of Apache Maven from the official website: https://maven.apache.org/download.cgi
- After installing Maven, navigate to the installation directory and copy the path.
- In the "System" window, click on "Advanced system settings" on the left side.
- Under "System Variables", click on "New" and add a new variable called "M2_HOME" with the path of your Maven installation directory as the value.
- Then, under "System Variables" again, find the "Path" variable and click on "Edit".
- In the "Edit Environment Variable" window, click on "New" and add "%M2_HOME%\bin" to the path. This will ensure that the Maven binaries are added to the system path.
- Click "OK" to save the changes and close all windows.

### Alert
You should test them by opening a command prompt and typing "java -version" and "maven -version" to verify that both are installed correctly.

Must have command prompt closed.

# Here's how to install Java and Maven environment variables on Linux:

A script was created with the aim of simplifying the whole process.

Here's a simple script that installs Java and Maven and sets up environment variables on Linux:

```
#!/bin/bash

# Instalar o Java
sudo apt-get update
sudo apt-get install -y default-jdk

# Instalar o Maven
sudo apt-get update
sudo apt-get install -y maven

# Configurar as variáveis de ambiente para o Java e o Maven
echo "export JAVA_HOME=/usr/lib/jvm/default-java" >> ~/.bashrc
echo "export M2_HOME=/usr/share/maven" >> ~/.bashrc
echo "export PATH=$PATH:$M2_HOME/bin" >> ~/.bashrc

# Atualizar as variáveis de ambiente
source ~/.bashrc

# Verificar se a instalação foi bem-sucedida
java -version
mvn -version
````
This script does the following:

1. Updates the apt-get package list
2. Installs Java (default-jdk) and Maven
3. Sets up necessary environment variables in the ~/.bashrc file
4. Updates the current environment variables
5. Checks if the installation was successful by displaying the versions of Java and Maven.

**To use the script**, simply give it execute permission with the command chmod +x environmentVariables.sh and run it with ./environmentVariables.sh.

You should test them by opening a command prompt and typing "java -version" and "mvn -version" to verify that both are installed correctly.