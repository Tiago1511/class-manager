# US G005

## 1. Context

This task is assigned for the first time and aims to configure the project structure to facilitate and accelerate the
development of upcoming user stories. Specifically, the system should support data persistence either in-memory or in a
relational database (RDB), with the ability to initialize default data.

## 2. Requirements

As the project manager, I want the team to configure the project structure to support data persistence in both in-memory
and RDBs. The solution should enable in-memory database solutions to be used during development and testing, but the
final deployment must use a persistent relational database. The system should also support initializing default data.

## 3. Analysis

To achieve the requirements, the team analyzed several options for data persistence and compared their advantages and
disadvantages. In-memory databases were found to be more suitable for development and testing, while RDBs were more
suitable for final deployment. The team also identified the need for a configuration setup that allows for easily
switching between in-memory and RDB persistence.
## 4. Design

The solution design adopted to fulfill the requirements is as follows:

- A configuration setup that allows for easily switching between in-memory and RDB persistence;
- An interface for data access that abstracts the underlying persistence mechanism;

- Implementation of "tests" to validate the functionality, including tests for initializing default data;

The main artifacts supporting the design include a sequence diagram illustrating the flow of data access, a class
diagram showing the main classes involved, and a domain model outlining the entities and their relationships.

## 5. Implementation

The persistence.xml file was updated by the team to configure the persistence layer of the project. The file specifies
which provider is being used (Hibernate), the name of the persistence unit (eapli.base), and the classes that are being
mapped for persistence.

In this case, the application is using the H2 database and the properties specify the JDBC URL, username, password, and
driver.

    <properties>
      <!--<property name="javax.persistence.jdbc.url" value="jdbc:h2:tcp://localhost/~/base"/>-->
      <!-- Base de dados docker do dei-->
      <property name="javax.persistence.jdbc.url" value="jdbc:h2:tcp://vsgate-s2.dei.isep.ipp.pt:10621/BaseDados;MV_STORE=FALSE;AUTO_SERVER=true;DB_CLOSE_ON_EXIT=FALSE;"/>
      <!--<property name="javax.persistence.jdbc.url" value="jdbc:h2:~\base;MV_STORE=FALSE;AUTO_SERVER=true;"/>-->

      <property name="javax.persistence.jdbc.user" value="sa"/>
      <property name="javax.persistence.jdbc.password" value="eapli"/>
      <property name="javax.persistence.jdbc.driver" value="org.h2.Driver"/>
      <!-- <property name="javax.persistence.schema-generation.database.action" value="drop-and-create"/> -->
      <!-- <property name="eclipselink.logging.level" value="FINE"/> -->
      <!-- <property name = "hibernate.show_sql" value = "true" /> -->
      <property name="hibernate.dialect" value="org.hibernate.dialect.H2Dialect"/>

    </properties>

It was also added code to the bootstrap, bellow there's a documentation of the bootstrap.

[Bootstrap Documentation](bootstrap.md)


## 6. Integration/Demonstration

To integrate this functionality with other parts/components of the system, the team updated the project structure to
include the necessary classes and dependencies for data persistence using either "in memory" or a relational database.

To demonstrate this functionality, the team created sample code to show how to initialize default data using the
persistence configuration. The team also provided documentation explaining how to set up and configure the persistence
layer, including how to switch between the "in memory" and relational database modes.

To execute and demonstrate this functionality, the following steps are required:

1. Set up and configure the persistence layer according to the provided documentation.

2. Run the sample code provided to initialize default data.

3. Verify that the data is persisted either "in memory" or in the relational database, depending on the configuration
   used.

4. Use the system normally and verify that the persistence layer is correctly used and working as expected.

## 7. Observations

There's no other observations to report.