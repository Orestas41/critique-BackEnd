# projectSakilaDemo - Film reviews webiste

Author: Orestas Dulinskas



## Packages Used (Runtime Requirements)

### Core Utilities

+ IntelliJ IDEA Community Edition 2021.3.1
+ MySqL Workbench 8.0 CE

### Extra Utilities

+ SonarCloud.io
+ Amazon AWS SDK 2.17.130
+ Cucumber 7.1.0
+ Jacoco 0.8.7
+ Mockito 1.10.19
+ Amazon AWS SecretManager SDK 1.12.159
+ Selenium 3.141.50
+ Apache Maven 2.22.0
+ Bonigarcia 5.0.3

##  Development Environment Set-Up

### **Bash Script**

    #!/bin/bash
    sudo apt update -y && sudo apt upgrade -y
    wget https://lumia41.s3.amazonaws.com/maven-unit-test.jar
    java -jar maven-unit-test.jar

## Software Design

### **Project management**

--

### **Architecture**

### Tree Diagram

    │   .gitignore
    │   HELP.md
    │   mvnw
    │   mvnw.cmd
    |   README.md
    │   pom.xml
    │
    ├───.github
    │   └───workflows
    │           build.yml
    │
    ├───.idea
    │   │   .gitignore
    │   │   compiler.xml
    │   │   encodings.xml
    │   │   jarRepositories.xml
    │   │   misc.xml
    │   │   uiDesigner.xml
    │   │   vcs.xml
    │   │   workspace.xml
    │   │
    │   └───artifacts
    │           demo_jar.xml
    │
    ├───.mvn
    │   └───wrapper
    │           maven-wrapper.jar
    │           maven-wrapper.properties
    │
    ├───out
    │   └───artifacts
    │       └───demo_jar
    │               demo.jar
    │
    ├───src
    │   ├───main
    │   │   ├───java
    │   │   │   ├───com
    │   │   │   │   └───example
    │   │   │   │       └───tsi
    │   │   │   │           └───orestas
    │   │   │   │               └───dulinskas
    │   │   │   │                   └───demo
    │   │   │   │                           Actor.java
    │   │   │   │                           ActorRepository.java
    │   │   │   │                           Customer.java
    │   │   │   │                           CustomerRepository.java
    │   │   │   │                           Film.java
    │   │   │   │                           FilmRepository.java
    │   │   │   │                           Review.java
    │   │   │   │                           ReviewRepository.java
    │   │   │   │                           SakilaDatabaseApplication.java
    │   │   │   │
    │   │   │   └───META-INF
    │   │   │           MANIFEST.MF
    │   │   │
    │   │   └───resources
    │   │       │   application.properties
    │   │       │
    │   │       ├───static
    │   │       └───templates
    │   └───test
    │       ├───java
    │       │   └───com
    │       │       └───example
    │       │           └───tsi
    │       │               └───orestas
    │       │                   └───dulinskas
    │       │                       └───demoTest
    │       │                               menuCucumberStepsDef.java
    │       │                               MockitoTest.java
    │       │                               PenislandTestTest.java
    │       │                               runCucumberTest.java
    │       │                               SakilaDatabaseApplicationTest.java
    │       │
    │       └───resources
    │           └───Cucumber
    │                   reviews.feature
    │
    └───target
        │   jacoco.exec
        │
        ├───classes
        │   │   application.properties
        │   │
        │   └───com
        │       └───example
        │           └───tsi
        │               └───orestas
        │                   └───dulinskas
        │                       └───demo
        │                               Actor.class
        │                               ActorRepository.class
        │                               Customer.class
        │                               CustomerRepository.class
        │                               Film.class
        │                               FilmRepository.class
        │                               Review.class
        │                               ReviewRepository.class
        │                               SakilaDatabaseApplication.class
        │
        ├───generated-sources
        │   └───annotations
        ├───generated-test-sources
        │   └───test-annotations
        ├───maven-status
        │   └───maven-compiler-plugin
        │       ├───compile
        │       │   └───default-compile
        │       │           createdFiles.lst
        │       │           inputFiles.lst
        │       │
        │       └───testCompile
        │           └───default-testCompile
        │                   createdFiles.lst
        │                   inputFiles.lst
        │
        ├───surefire-reports
        │       com.example.tsi.orestas.dulinskas.demoTest.MockitoTest.txt
        │       com.example.tsi.orestas.dulinskas.demoTest.SakilaDatabaseApplicationTest.txt
        │       TEST-com.example.tsi.orestas.dulinskas.demoTest.MockitoTest.xml
        │       TEST-com.example.tsi.orestas.dulinskas.demoTest.SakilaDatabaseApplicationTest.xml
        │
        └───test-classes
            ├───com
            │   └───example
            │       └───tsi
            │           └───orestas
            │               └───dulinskas
            │                   └───demoTest
            │                           menuCucumberStepsDef.class
            │                           MockitoTest.class
            │                           PenislandTestTest.class
            │                           runCucumberTest.class
            │                           SakilaDatabaseApplicationTest.class
            │
            └───Cucumber
                    reviews.feature

### Architecture design

Three tier monolithic structure

    Web layer - ??
    |
    Application layer - Java JDK 17
    |
    Database layer - MySqL Workbench 8.0 CE
    
## Risk Assessment

### **SWOT Analysis**
+ Strengths
    + Simple
    + Extensively tested
+ Weaknesses
    + Not a lot of features
    + Inexperienced developer
+ Opportunities
    + Adding more features
+ Threats
    + Inexperienced developer
    
### Risk assessment Matrix and Particular Issues

??

## Programming/Software Development

### **Version Control System**

#### **GitHub**

I have used git and github to manage and store different version with different branches created for different features.

Public Git Page <https://github.com/Orestas41/projectSakilaDemo>

Clone Link <https://github.com/Orestas41/projectSakilaDemo.git>

### **Tools used**

+ Jenkins
+ Microsoft 
+ Amazon Web Services (AWS)
+ Ubuntu ?.?
+ MySqL Workbench 8.0 CE

## Testing

### **Unit testing**

Overall Coverage 95.8%

## Systems Integration and Build

### **Jenkins**

### Jenkins Set-up

    #!/bin/bash
    sudo apt update -y && sudo apt upgrade -y
    sudo apt install openjdk-11-jdk -y
    curl -fsSL https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo tee /usr/share/keyrings/jenkins-keyring.asc > /dev/null
    echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] https://pkg.jenkins.io/debian-stable binary/ | sudo tee /etc/apt/sources.list.d/jenkins.list > /dev/null
    sudo apt-get update -y
    sudo apt-get install jenkins -y
    sudo systemctl daemon-reload
    sudo systemctl start jenkins
    sudo cat /var/lib/jenkins/secrets/initialAdminPassword

### Configuration script 

??

### **Features**

### Front Page

??

# Future Improvements

??

## References

??
