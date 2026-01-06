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