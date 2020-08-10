## Android Automated Testing Framework

This is the home page for the Android Automated Testing Framework.

The following list can serve as a starting point for the available documentation of this project:

* [Project Overview](#ProjectOverview)

* [Quick Installation Guide](#QuickInstallationGuide)

* User Guide 	
	* [Installation Guide](#InstallationGuide) 
	* [Features](#Features)
	* [Implementation Guide](#ImplementationGuide)
    * [How to Contribute](#HowToContribute)
	* [Integration with other technologies](#IntegrationWithOtherTechonologies)
	
* [Release Notes](#ReleaseNotes)

* [Other Resources](#OtherResources)

Tech Documentation
* [Architecture Diagram](#ArchitectureDiagram)
* [Code and Naming Conventions](#CodeAndNamingConventions)
* [Packaging Technology](#PackagingTechnology)
* [File and Folder Structure and Organization](#FileAndFolderStructureAndOrganization)
* [Features – Dev Guide](#FeaturesDevGuide)
* [Extending this framework](#ExtendingThisFramework)
* [Dark (undocumented) features](#Dark)
* [Updates and Upcoming features](#UpdatesAndUpcomingfeatures)
* [Updating libraries, packages and referents](#UpdatingLibraries)
* [General Test Plant](#TestingStrategy)
	* [Testing Strategy](#TestingStrategy)
	* [Issue and Defect Management](#Issues)
	* [Root Cause Analysis](#RootCauseAnalysis)

<a name="ProjectOverview"></a>
## Project Overview

### Purpose
The purpose of this project is to provide a way for Automated TestingEngineers to easily create automated test scripts in Java language for Android Apps by means of an easy-to-setup /easy-to-use framework. 

The framework allows test engineers to focus their valuable time on script development
instead of automation setup and configuration. It also allows scripts to be run over multiple environments and using different sets of test data with trivial changes in the configuration files.

This framework can be extended or customized, if you want to add a new feature or your project has specific needs, please see the how-to contribute section or contact the team.


### Recommended Use

This framework is better fitted for projects that have the following characteristics:

### Project Context

* Android-native apps
* Windows / Linux / MacOs development environment.

### Tech Stack

* Java Programming language
* Maven
* Junit
* Appium/Selenium

### Team 

* At least 1 year of experience with Java programming language.
* At least 1 year of experience testing mobile applications.
* At least 1 year of experience in QA.

### Project state

* Stable or additive(progressively evolving) UI
* At least one testing environment (Production testing is no recommended)
* CI/CD pipeline implemented (optional)

### Not Recommended Use

This framework is not recommended for projects with the following characteristics:

* Real-Time/ Life-support/ Life-threatening Applications
* Applications for Android Clones of Forked OS
* Graphic-intensive video game apps

<a name="QuickInstallationGuide"></a>
## Quick installation Guide
### Steps

1. Download Java JDK according to your OS and processor architecture(x86 or x64) and install it. You can download it from the following link:
[Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

2. Create a new environment variable called JAVA_HOME and make sure to point it to the Java JDK location (Commonly located in C:\ProgramFiles\Java%JDK_Version%)

3. Download and install Appium Desktop. You can download it from the following link: 
[Appium](http://appium.io)

4. Download IntelliJ IDEA (IDE for Java Developers) according to your processor architecture(x86 or x64). [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/)

5. Download and install Android Studio. Once installed make sure to update it to the latest version. You can download it from the following link:
[Android Studio](https://developer.android.com/studio)

6. Create a new environment variable called ANDROID_HOME and make sure to point it to the Android Studio SDK location (Commonly located in C:\Users%user%\AppData\Local\Android\Sdk)

7. Update the "Path" environment variable and add these two paths:%ANDROID_HOME%\platform-tools and %ANDROID_HOME%\tools

8. Download from git the framework's repository and open it from IntelliJ IDEA.

<a name="InstallationGuide"></a>
## Installation Guide

### Introduction 

To work with this framework is necessary to install some programs. In this document are all the steps detailed of how to install every needed software. The duration of the installation process is around 1 to 2.5 hours depending on the issues during the installation.

### Prerequisites

It is important that your local environment has:

1. Administrative user rights (vetted by Security)
2. USB Ports Enabled (for connectivity with a real device) (vetted by Security)
3. Internet Connectivity
4. An Intel CPU with at least i5 7th Gen 
5. 16 GB of RAM
6. 2 GB of free Hard Drive space

You will also need to ask this project administrator for:

1. Git credentials. (Bitbucket)
2. TestRail credentials
3. Kobiton Plattform credentials

### Steps

### Install Java JDK
1. Download Java JDK according to your OS and processor architecture(x86 or x64) and install it. You can download it from the following link:
[Java JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)

2. Once Downloaded, go to its folder location and double click on the jdk.exe file. A screen like the following will be displayed: 

	![installation wizard JDK](Assets/img/JDK/jdk_1.png "installation wizard JDK")

3. In this case the default JDK installation options will be used, so, click 
 "Next" until the following screen appears:

	![finish installation JDK](Assets/img/JDK/jdk_2.png "finish installation JDK")

4. Once the installation is completed, click on the "Close" button.

### Set the JAVE_HOME environment variable

1. In the windows search bar look for **This PC** and right-click on it. Then, go to **Properties>Advanced system settings>Environment Variables**. A screen like
the following will be displayed:

	![Environment variables window](Assets/img/JAVA_HOME/java_home1.png "Environment variables window")

2. Click the "New" button located below the **System variables** section. A screen with variable name and value fields will be displayed. The Variable name field will be
JAVA_HOME and the variable value field will be the JDK path location, commonly is located in the following path:
**C:\Program Files\Java\jdk[java-version]**

	![Adding new environment variable](Assets/img/JAVA_HOME/java_home2.png "Adding new environment variable")


3. Click "OK" to save the variable

	![Save new environment variable](Assets/img/JAVA_HOME/java_home3.png "Save new environment variable")


### Install Appium Desktop

1. Download Appium, you can download it from the following link: [Appium Desktop](https://github.com/appium/appium-desktop/releases)

2. Once downloaded, go to its folder location and double click on the appium.exe file. A screen like the following will be displayed:

	![Installing appium](Assets/img/Appium/AppiumInstallation1.png "Installing appium")

3. Check "the only for me" option if you want to install appium only for the current user. Otherwise check "Anyone who uses this computer (all users)" option to
install it in all machine users. Next, click on the "Install" button.

	![Installing appium](Assets/img/Appium/AppiumInstallation1.png "Installing appium")

4. Once the installation is completed, click on the "Finish" button.

	![Finish appium installation](Assets/img/Appium/AppiumInstallation2.png "Finish appium installation")

### Install Android Studio

1. Download Android Studio according to your OS and processor architecture(x86 or x64) and install it. You can download it from the following link: [Android Studio](https://developer.android.com/studio)

2. Once downloaded, go to its folder location and double click on the android studio.exe file. A screen like the following will be displayed:

	![Installing Android Studio](Assets/img/AndroidStudio/AndroidStudio1.png "Installing Android Studio")

3. In this case the default Android Studio installation options will be used, so,click "Next" until the following screen appears:

	![Installing Android Studio](Assets/img/AndroidStudio/AndroidStudio2.png "Installing Android Studio")


4. Click "Install" and wait for the installation to be completed. Once the installation has been completed click "Next". A screen like the following will be displayed:

	![Installing Android Studio](Assets/img/AndroidStudio/AndroidStudio3.png "Installing Android Studio")

5. Be sure to mark the Start Android Studio checkbox and then click "Finish". Click "Next"until the following screen is displayed:

	![Installing Android Studio](Assets/img/AndroidStudio/AndroidStudio4.png "Installing Android Studio")

6. Finally click "Finish"

### Set the ANDROID_HOME environment variable

1. In the windows search bar look for **This PC** and right click on it. Then, go to **Properties>Advanced system settings>Environment Variables**. A screen like
the following will be displayed:

	![ANDROID_HOME environment variable](Assets/img/AndroidStudio/AndroidHome1.png "ANDROID_HOME environment variable")

2. Click the "New" button located below the **System variables** section. A screen with variable name and value fields will be displayed. The Variable name field will be
ANDROID_HOME and the variable value field will be the ANDROID SDK path location, commonly is located in the following path: **C:\Users\user_name\AppData\Local\Android\Sdk**

	![ANDROID_HOME environment variable](Assets/img/AndroidStudio/AndroidHome2.png "ANDROID_HOME environment variable")


3. Click "OK" to save the variable

	![ANDROID_HOME environment variable](Assets/img/AndroidStudio/AndroidHome2.png "ANDROID_HOME environment variable")

4. Update the "Path" variable adding **%ANDROID_HOME%\platform-tools** and **%ANDROID_HOME%\tools** like is shown in the following image:
	
	![ANDROID_HOME environment variable](Assets/img/AndroidStudio/AndroidHome3.png "ANDROID_HOME environment variable")

5. Click "OK" to save the variable


### Android Virtual Device

**Note:** This step is needed only for those collaborators who doesn't have a physical Android mobile device

1. Open Android Studio and go to **Configure>AVD Manager**. A screen like the following will be displayed:
   
   ![AVD](Assets/img/AndroidStudio/ADVDEVICE1.png "AVD")


2. Click "Create Virtual Device" and promptly a screen with showing a list of all the virtual devices available. Select one and click "Next"

   ![AVD](Assets/img/AndroidStudio/ADVDEVICE2.png "AVD")

3. A list of all the android API available for the virtual device will appear. Click "Download" in one of them to start the download

   ![AVD](Assets/img/AndroidStudio/ADVDEVICE3.png "AVD")

4. Once the API has been downloaded click "Next" and screen with all the virtual devices configuration will appear. Click "Finish" to complete de virtual device configuration.

   ![AVD](Assets/img/AndroidStudio/ADVDEVICE4.png "AVD")

### Configure Kobiton

1. Go to the following address: [https://portal.kobiton.com/apps](https://portal.kobiton.com/apps) and login, then the following screen should be displayed.

	![Kobiton](Assets/img/Kobiton/Kobiton1.png "Kobiton")

2. Click "Add a new app", Promptly will appear a dialog and select **the path where is located the apk"** and click "Open" and then after a few seconds the app should be uploaded.

3. Click on the uploaded version and copy the App ID because it's gonna be used as a parameter(-DkobitonStore) in the project.

	![Kobiton](Assets/img/Kobiton/Kobiton2.png "Kobiton")
	
4. Go to the following address: [https://portal.kobiton.com/devices](https://portal.kobiton.com/devices) and select a device by clicking on the icon with 3 dots.

	![Kobiton](Assets/img/Kobiton/Kobiton3.png "Kobiton")

5. Click "Automation Settings" and copy the device name and the kobitonServerUrl because they are gonna be used as a parameter in the project.

	![Kobiton](Assets/img/Kobiton/Kobiton4.png "Kobiton")
	![Kobiton](Assets/img/Kobiton/Kobiton5.png "Kobiton")


### Intellij Idea 

1. Download Intellij Idea from [https://www.jetbrains.com/es-es/idea/download/#section=windows](https://www.jetbrains.com/es-es/idea/download/#section=windows) 

2. Once downloaded, go to its folder location, extract it and then double click idealC.exe. A screen like the following will be displayed:

   ![Installing Intellij Idea](Assets/img/IntelliJ/Intellij1.png "Installing Intellij Idea") 
   
3. In this case, the default IntelliJ installation options will be used, so, click "Next" and then on the "Install" and the following screen should appear:

	![Installing Intellij Idea](Assets/img/IntelliJ/Intellij2.png "Installing Intellij Idea")
	
	Check the option:"Run IntelliJ IDEA Community Edition" and then click on the "Finish" button to start Intellij Idea.
  
4. After IntelliJ Idea starts, go to **File>Open**. Promptly  will appear a dialog and select **the path where is located the framework"** and click "Ok"

   ![Installing Intellij Idea](Assets/img/IntelliJ/Intellij3.png "Installing Intellij Idea")    

5. In the **Project View** located on the left side, click on **Slm_slf_suite_android**. It will unfold some folders and files, right-click on pom.xml file then select **Maven>Download Sources**. Maven will start to download all the dependencies needed to start to work with the framework.

6. Click "Add Configuration" to start with the project configuration. Promptly will appear a dialog, click on the plus icon and then select "Maven" 

	![Installing Intellij Idea](Assets/img/IntelliJ/Intellij4.png "Installing Intellij Idea")   
	![Installing Intellij Idea](Assets/img/IntelliJ/Intellij5.png "Installing Intellij Idea")   

7. Enter a name for the Run Configuration and enter the following parameters:
	
	![Installing Intellij Idea](Assets/img/IntelliJ/Intellij7.png "Installing Intellij Idea")
	
	**Note:** The kobiton-store and the device name should be updated depending on the app version and the device that is being used.	

<a name="Features"></a>
## Features

The following section details the features available for the framework. We are constantly innovating and extending the Framework's capabilities. Be sure to check this list and the [release notes](/Release-Notes) frequently. For a condensed list, see the Features Table at the end of this section.

###  Reporting capabilities 
- Reporting software is used to gather data across sources (inventory, sales, conversion, web traffic, social media impressions, time spent, and so on) and then organize it in a visual way for users to read and interpret. Reports can even go further beyond interpreting data into tables or graphs automatically so that information can be easily digested in a fashionable way.
- Once an automated test script runs successfully, 2 HTML reports are generated so that information can be easily read and understood by the user.

###  Data Driven
- This methodology allows data to be executed seamlessly, allowing faster execution as business data needed is independent of the rest of the application.

###  Allows Multi Environment
- Having multiple environments enables a team to work on parallel development efforts. This app needs to pass many cycles like the development phase, testing, and production before saling to the public.

###  Evidence of execution
- Video and screenshots permit the app to validate that execution was made, this is done to facilitate information and isolate critical information to the dev team.

###  Capture Screenshot
- This app has the ability to take screenshot, particularly useful for automated testing and reporting test evidence. 

### Supports Page Object Model
- Page Object Model (POM) is a programmer-friendly framework that focuses clear and clean code that facilitates changes in testing and interface implementation.

### Low complexity to execute scripts  
- This app has a low difficulty to execute tests since:    
    - *Page Object Model* is supported
	- *Singletons* are used as structures to share information across screens

###  Supports calls to the APIS to get and validate information displayed in the app
- This framework has the ability to make calls to the apis in order to get information and ensure that that information is displayed properly in the SUT (System Under Test).

###  Multi-Platform
- This framework can be used in your Windows, Ubuntu or Mac PC.

###  Configuration type: Properties File
- Having a Property config file means that any changes or acclarations are easier and faster to understand for both the developer team and users.

###  Data-Driven Input Format: Properties file And TestRail.
- All the test data is stored in TestRail in order that anyone who has access to the TestRail can see and update this test data.

###  Locator types	
- Locators in Selenium are the building blocks for scripts, there are many locators and they help to identify GUI elements across the web. Things like a web element name or ID may be accessed through different and special locators.

###  JENKINS
- This app makes use of: Jenkins Pipeline, this is a tool that simplifies the development workflow, as it helps the team lead manage releases and manage the team members work output.

###  System dependencies or restrictions
Selenium, extend report,javax.mail-api, json-simple, spring-core, spring-context.

###  Supported Test Levels: Integration, System and E2E
- System testing is the type of testing to check the behavior of a complete fully integrated software product based on the software requirements specification (SRS) document. The main focus of this testing is to evaluate Business / Functional / End-user requirements.

###  Supported Types: Functional
- This app supports Functional Testing, with the purpose to test each function of the software application The purpose of Functional tests is to test each function of the software application by providing appropriate input, verifying the output against the Functional requirements. 

###  Automation Driver (Appium / Selenium)
- All of the automation frameworks used in this app are Open source
    - Appium is designed to test mobile applications. 
    - Selenium is probably the most popular open-source test automation framework for web applications

###  Integration with Test Management Tools 
This app makes use of TestRail.
- TestRail is a web-based test management tool used by testers, developers and other stakeholders to manage, track and organize software testing efforts.

###  Post-license support
Updates are not available after licensing ends.

###  Post-engagement use of testware 
This framework can be used for test case maintenance and execution after the licensing ends.

###  Extensive User Documentation and community support
- User documentation is important because it provides a avenue for users to learn:
- How to use your software
- Features of your software
- Tips and tricks of your software
- How to resolve common problems with your software

This framework has comprehensive guides for installation, setup and implementation.

###  Technical Documentation 	
- Technical documentation in software engineering is the umbrella term that encompasses all written documents and materials dealing with software product development. The team in charge of this project has a commitment to produce up-to-date documentation on the architecture, features and other technical aspects, which in turn helps keeping this Framework stable, relevant and innovative.

## Features Table
|Feature| Available from Version|
|--|--|
| Component based: Appium | 1.0 |
| Data Driven | 1.0 |
| Supports Page Object Model | 1.0 |
| Multi Platform | 1.0 |
| Configuration type: Properties File | 1.0 |
| Data Driven Input Format: TestRail| 1.0 |
| Allows Multi Environment | 1.0 |
| Reporting capabilities | 1.0 |
| Capture Screenshot | 1.0 |
| Evidence of execution | 1.0 |
| Step by Step log | 1.0 |
| Supported Test Levels: Integration, System and E2E | 1.0 |
| Automation Driver (Appium / Selenium) | 1.0 |
| Low complexity to execute scripts | 1.0 |
| Integration with CI Tools | 1.0 |
| Integration with Test Management Tools | 1.0 |
| Extensive User Documentation and community support | 1.0 |
| Technical Documentation | 1.0 |

<a name="ImplementationGuide"></a>
## Implementation Guide

### Introduction
This section will guide you on how to implement some of the most commonly used features of this framework. 

### Assertions
An assertion is a boolean expression at a specific point in a program which will be true unless there is a bug in the program. This allows us to verify that an expected result will align with the actual outcome of a test process.

### Example
```java
Assert.isTrue(login.passed);
```

### Data-Driven
This methodology allows data to be executed seamlessly, allowing faster execution as business data needed is independent of the rest of the application.

### Example: 
we use cucumber so in the "Examples" section we can add different test data to run the same scenario.
```
  Scenario Outline: - Validate that the user can login with valid credentials

    Given The user navigates to Login screen <TestCaseId>
    When The user <user> enters his app login credentials
    When The user clicks on the login button
    Then The user should land on cinema select screen

    @13524 @SmokeTest
    Examples:
      | user                                           | TestCaseId |
      | registered_user_with_a_saved_citibanamex_card  | 13524      |
	  | registered_user_with_a_saved_citibanamex_card1 | 13524      |
```

### Reporting & Logging 
The reporting capabilities of the framework are enabled by ExtentReports and Maven Cucumber Reporting.

### ExtentReports
In this case we used extent report 2.40.2 version.

```xml
<!-- pom.xml -->
<dependency>
    <groupId>com.relevantcodes</groupId>
    <artifactId>extentreports</artifactId>
    <version>2.40.2</version>
</dependency>
```

### Maven Cucumber Reporting
We also use Maven Cucumber Reporting 5.0.02 version.

```xml
 <plugin>
	<groupId>net.masterthought</groupId>
	<artifactId>maven-cucumber-reporting</artifactId>
	<version>5.0.0</version>
	<executions>                   
		....
	</executions>
 </plugin>
```

### Insert screenshot
To add a screenshot, simply call the following method. The screenshot will be added automatically to the reports.

### Example:

```java
TestCaseResultDTO.getTestCaseResultDTO().getEvidence().add(getScreenShotAsFile())
```
		
### Create new scenarios or test cases
you can re-use the steps that are already created in the features files to create new scenarios and put them in another feature file.

### Example of steps

```
The user clicks on the login button
```
You can also use tags to group test cases.

### Example
The following scenario has multiple tags that allow us to filter in a more specific way the test cases
```
  Then The user validates the information in My Order Summary Screen for the flow <FlowType>

  @15795 @SmokeTest @PaymentFlow @RegisteredUser @FoodOrder @SavedCitiBanamex
    Examples:
      | MovieInformation             | ConcessionsToBuy | User                                          | FlowType | TestCaseId |
      | movie_traditional_experience | concession_1     | registered_user_with_a_saved_citibanamex_card | Food     | 15795      |
```

### Extending the framework by tasks.

### Example: Publish the results of the test cases in TestRail.

1. Create a class and implement the interface IRunAfterScenario, this task will be called automatically by the framework

```java
public class PublishResultInTestRail implements IRunAfterScenario {

    @Override
    public void Execute(Scenario scenario) {       
        
        if (scenario.isFailed()) {            
		 //....
        }else{
		 //....
		}
    }
}
```

2. The framework has a task system that was built using spring-core framework, the following code will call all the tasks of the project.

```java
    @After
    public void afterScenario(Scenario scenario) {
        Map<String, IRunAfterScenario> tasks = appContext.getBeansOfType(IRunAfterScenario.class);

        for (String key : tasks.keySet()) {
            tasks.get(key).Execute(scenario);
        }
    }
```

### Sharing information across screens

The framework has some DTO classes that help to share information across screens. These DTOS implement the singleton design pattern.

### Example: 

```java
public class UserDTO {

 private static UserDTO user;

    private String name;
    private String lastName;
    private String email;
    private String password;

    private UserDTO() {
    }

    public static UserDTO getUserDTO() {
        if (user == null) {
            user = new UserDTO();
        }
        return user;
    }
	
	//Getters and Setters
}	
```

<a name="HowToContribute"></a>
## How To Contribute

### Introduction

This piece of software is ment to help Test Engineers to automate Test Scripts for Android mobile applications. See the [Project Overview](#ProjectOverview) page for more information. 

### What you need to know

This framework is developed in Java, so it's very important that you have a good understanding of Object Oriented Programming, have advanced Java knowledge and know, Maven and Appium.

Everything in this project (from the code to the documentation) is in English, so you must have great reading and writting skills in this language. Also, note that all documentation is written in Wiki Pages using [Markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet).

### What you need to read

To extend this Framework you need to know about its architecture, conventions and SDLC. Please read all the available technical documentation before reaching to the team.

Here are some of the main aspects of the project:
* The branching strategy used for this project is called [Git flow](https://guides.github.com/introduction/flow/) be sure, you understand it before starting.
* The naming and code conventions used are described [here](#CodeAndNamingConventions)

### What you need to install

To start contributing to the code of this project, first there are a couple of things you need to have in your development environment:
Please see the following section: [Installation Guide](#InstallationGuide) 

### What you need to have

It is important that your local environment has:

1. Administrative user rights (vetted by Security)
2. USB Ports Enabled (for connectivity with a real device) (vetted by Security)
3. Internet Connectivity
4. An Intel CPU with at least i5 7th Gen 
5. 16 GB of RAM
6. 2 GB of free Hard Drive space

You will also need to ask this project administrator for:

1. Git credentials. (Bitbucket)
2. Jenkins credentials
3. TestRail credentials
4. Kobiton Plattform credentials

<a name="IntegrationWithOtherTechonologies"></a>
## Integration With Other Technologies



### Kobiton

This framework is capable of running the tests using devices from the kobiton platform.

The following code launches the test in a kobiton device.

```java
REAL_DRIVER = new IOSDriver(new URL("https://mcarcini123:6806ad2c-a602-4aee-aeeb-032317dcf411@api.kobiton.com/wd/hub"), capabilities);
```


### TestRail

This framework publishes the result of each test in TestRail.

The following task publish the result of each test in TestRail, this task uses the class "TestRailUtil", This class makes the calls to the TestRail API

```java
public class PublishResultInTestRail implements IRunAfterScenario {
 TestRailUtil testRailUtil;
    PropertiesUtil testRailProperties;

    public PublishResultInTestRail(){
        testRailUtil = new TestRailUtil("testRail.properties");
        testRailProperties = testRailUtil.getTestRailProperties();
    }

    @Override
    public void Execute(Scenario scenario) {
		//publish the result in TestRail
	}
}
```

<a name="ReleaseNotes"></a>
## Release Notes

### Release 1.0.0
August/10/2020

### Changes and Updates
- Created Wiki Pages for Overall Project Information

### Main Contributors
* Marco Carcini

<a name="OtherResources"></a>
## Other Resources

### Useful links

* [Appium Commands](http://appium.io/docs/en/commands/mobile-command/)
* [Cheat Sheet for Selenium Automation](https://www.cppbuzz.com/selenium/cheat-sheet-for-selenium-automation)
* [Git Cheat Sheet](https://education.github.com/git-cheat-sheet-education.pdf)


## Tech Documentation

### Introduction 
The Cucumber Mobile framework was designed to allow the integration for Android using open source libraries alongside Appium for the interface with the devices and Maven for dependencies management, also the use of Gherkin language makes the test-ware generate very easy to understand by non-technical people.

<a name="ArchitectureDiagram"></a>
## Architecture Diagram

TODO: Add architectural diagram

<a name="CodeAndNamingConventions"></a>
## Code and Naming Conventions

### Common Ground:

- 80% of the lifetime cost of a piece of software goes to maintenance.
- Prioritize coding readability instead of code complexity.
- Code conventions improve the readability of the software, allowing engineers to understand new code more quickly and thoroughly.

### File Organization:

- A file consists of sections that should be separated by blank lines and an optional comment identifying each section. 
- Files longer than 2000 lines are cumbersome and should be avoided.
- Java source files have the following ordering:    
    1. Package and Import statements; for example:
        ```
            package PackageName; 
            import java.io.File; 
            import java.net.*;
            import static org.junit.Assert.assertEquals;
        ```
    2. Class and interface declarations.

### Indentation:

- Well executed Indentation is primordial for code legibility
- Four spaces should be used as the unit of indentation. The exact construction of the indentation(spaces vs. tabs) is unspecified. Tabs must be set exactly every 8 spaces (not 4).
- Avoid lines longer than 80 characters, since they’re not handled well by many terminals and tools.

### Comments:

- Comments should be used to give overviews of code and provide additional information that is not readily available in the code itself. 
- Comments should contain only information that is relevant to reading and understanding the program.

### Declarations

- One declaration per line is recommended since it encourages commenting. Example:
    ```
    //Recomended: 
        int level;
        int size;
    //Wrong:
    int level, getSize();
  ```
  
- Bracket should act in a new line as such:
    ```
    //Recomended:
        public Method() { 
            int int1;             // beginning of method block
            if (condition) {      
                int int2;         // beginning of "if" block
                ...
            }
        }
    //Avoid:
        public Method() {
            int int1;             // beginning of method block
            if (condition) 
            {                     
            int int2;             // beginning of "if" block
            ...
            }
        }
    ```

### White Space
- Blank lines improve readability by setting off sections of code that are logically related. 
- Two blank lines should always be used in the following circumstances:
    1. Between sections of a source file.
    2. Between class and interface definitions.
- One blank line should always be used in the following circumstances:
    1. Between methods.
    2. Between the local variables in a method and its first statement.
    3. Before a block or single-line comment.
    4. Between logical sections inside a method to improve readability.

### Naming conventions:
- Meaningful and understandable variables name helps anyone to understand the reason of using it. 
- Avoid the use of digits in variable names.
- Use plural names if it is semantically appropriate.
- One character variable names should only be used in loops or for temporary variables.

| Identifier Type  | Rule |
| ------------- | ------------- |
| Classes  | PascalCase  |
| Method Name  | camelCase  |
| methodParameters (Object object)  | camelCase  |
| methodParameters (int number)  | camelCase  |
| localVariable  | camelCase  |
| fieldName  | camelCase  |
| Constant Name  | PascalCase  |
| Properties Name  | PascalCase  |
| Delegate Name  | PascalCase  |
| Enum Type Name  | camelCase  |

### Recommendations
- Aim for low Cohesion and High Coupling
- Avoid using comments if possible, we should aim to have a readable and understandable code.
- Avoid using an object to access a class (static) variable or method. Use a class name instead. For example:
     ```
        classMethod();          //OK 
        AClass.classMethod();   //Ok
  
        anObject.classMethod(); //AVOID!
     ```

- Numerical constants (literals) should not be coded directly, except for -1, 0, and 1, which can appear in a for loop as counter values.

###Java Source File Example
```
package MobileController;

import static supportMobile.ReadJsonFileParameters.readParametersFile; import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit; import java.io.BufferedReader;
import org.openqa.selenium.Platform; import org.openqa.selenium.WebDriver; import org.openqa.selenium.remote.*;

public class MobileEngine {
    public AppiumDriver driver; 
    private Object workStation; 
    private int excelRow = 2; 
    public String defect ;
    public boolean passed = false;
    
    public AppiumDriver getDriver() {
        return driver;
    }

    public void setDriver(AppiumDriver driver) { 
        this.driver = driver;
    }

    public MobileEngine(String strPathConfigFile, String excelPath, int excelRow) { 
        this.excelPath = excelPath;
        this.excelRow = excelRow;
        this.strPathConfigFile = strPathConfigFile;
    }

    public void runSetup() throws Exception { this.passed = false;
        this.defect = "initialize";
        if (strPathConfigFile.isEmpty()) {
            this.defect = "the configuration file is empty or null";
            return; 
        }
    
    //Read Parameters Files
        if (!ReadParametersFile(strPathConfigFile)){
            return; 
        }
        ...
    }

    public void setMobileLocal() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities(); ...
    }

    public boolean createHtmlLogFile(String strClassName) {
        if (strPathResults.isEmpty() || strClassName.isEmpty()) { 
            return false;
        }
        HtmlTemplate.fileName = strClassName; 
        HtmlTemplate.pathName = this.strPathResults; 
        if (!HtmlTemplate.Initialize()) {
            System.out.println("Error on Open Html File"); 
        }
        return true; 
    }

    try {
        String strRoot = Paths.get(".").toAbsolutePath().normalize().toString();
        strRoot = strRoot.replace("\\", "/"); System.out.println(strRoot);
        ExcelWorkbook = Framework_Env.dataPath;
        if (ExcelWorkbook.toLowerCase().indexOf("c:") == -1 ) {
            ExcelWorkbook = strRoot + ExcelWorkbook; }
            System.out.println("RunSetup "+ ExcelWorkbook);
            File file = new File(ExcelWorkbook);
            if (!(file.exists() )) {
                this.defect = "Excel path does not exist : " + ExcelWorkbook;
                return false;
            }
        ...
        return true;
    } catch (Exception e) {
        // TODO Auto-generated catch block this.defect = e.getMessage(); return false;
    } 
}
```

<a name="PackagingTechnology"></a>
## Packaging Technology

# MAVEN 
Apache Maven is a software project management and build management tool for Java Frameworks. 

## Why Maven?
- Central repository to get dependencies.
- Maintaining common structure across the organization. Flexibility in Integrating with CI tools.
- Plugins for Test framework execution.
 
For Maven configuration follow the installation guide
### Standard project structure use 
Under this directory you will notice the following standard project structure. 
The src/test/java directory contains the project source code, the src/test/java directory contains the test source, and the pom.xml

```
|-- pom.xml 
-- src
    -- main
    |    -- java
    |        -- com
    |            -- mycompany
    |                 -- app
    |                     -- App.java
    -- test
    |    -- java
    |        -- com
    |            -- mycompany
    |                  -- app
    |                     -- AppTest.java
```

## The POM 
POM stands for "Project Object Model". It is an XML representation of a Maven project held in a file named pom.xml 

The POM contains all necessary information about a project, as well as configurations of plugins to be used during the build process. 
Also contains at least the following fields and they are mandatory:
- groupId: GroupId will identify your project uniquely across all projects.
- artifactId: An artifact is a file, usually a JAR, that gets deployed to a Maven repository.
- version: Changes should be versioned, and this element keeps those versions in line. The three elements given above point to a specific version of a project, letting Maven know who we are dealing with, and when in its software lifecycle we want them.
```
<xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
http://maven.apache.org/xsd/maven-4.0.0.xsd"> 
    <modelVersion>4.0.0</modelVersion>
    <groupId>org.codehaus.mojo</groupId> 
    <artifactId>my-project</artifactId> 
    <version>1.0</version>
</project>
```
### Dependencies 
The cornerstone of the POM is its dependency list. Most projects depend on others to build and run correctly. 
If all Maven does for you is manage this list, you have gained a lot. 
Maven downloads and links the dependencies on compilation, as well as on other goals that require them.

```
    <dependency> 
        <groupId>junit</groupId> 
        <artifactId>junit</artifactId> 
        <version>4.12</version> 
        <type>jar</type> 
        <scope>test</scope> 
        <optional>true</optional>
    </dependency> 
    ...
</dependencies>
```
Maven uses a repository that is a directory where all the project jars, library jar, plugins or any other project-specific artifacts are stored and can be used by Maven easily. To search any dependence use maven repository.
For more information about Maven follow the next link: https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

<a name="FileAndFolderStructureAndOrganization"></a>
## File and Folder Structure and Organization

The following tree is the structure of the framework and how its file and folders are organized:
```
slm_slf_suite_android
| .gitignore
| README.md
|
+---CucumberAndroidTesting
|  | .classpath
|  | .project
|  |  pom.xml
|  |
|  +---src
|  |    \---test
|  |        \---java
|  |             \---com
|  |                  \---softtek
|  |                       \---dto
|  |                            \---CartDTO.java	
|  |                            \---MovieDTO.java	
|  |                            \---MoviesByCinemaJson.java
|  |                            \---OrderDTO.java	
|  |                            \---ProductDTO.java
|  |                            \---SeatsByCinemaAndSessionDTO.java
|  |                            \---TestCaseResultDTO.java
|  |                            \---TicketJson.java	
|  |                            \---UserDTO.java
|  |                            \---Versions.java
|  |                       \---enums
|  |                            \---TestRailStatus.java
|  |                       \--Infrastructure
|  |                            \---Tasks
|  |                                \---Impl
|  |                                    \---afterescenario
|  |                                        \---PublishResultInCucumberReport.java
|  |                                        \---PublishResultInExtentReport.java
|  |                                        \---PublishResultInTestRail.java
|  |                                \---IRunAfterScenario.java    
|  |                       \---pages
|  |                            \---AddConcessionPage.java	
|  |                            \---BillboardPage.java
|  |                            \---CancelOrderPage.java
|  |                            \---CartPage.java	
|  |                            \---ChooseSeatsPage.java
|  |                            \---ChooseTicketsPage.java
|  |                            \---CorePage.java
|  |                            \---HamburgerMenuPage.java	
|  |                            \---LoginPage.java
|  |                            \---MainPage.java
|  |                            \---MyOrdersPage.java	
|  |                            \---MyOrderSummaryPage.java	
|  |                            \---OrderConfirmationPage.java
|  |                            \---OrderDetailPage.java
|  |                            \---PasswordResetPage.java
|  |                            \---PaymentProcessPage.java
|  |                            \---PersonalInformationPage.java
|  |                            \---PreOrderDetailPage.java
|  |                            \---ProfilePage.java	
|  |                            \---ProfileSettingsPage.java
|  |                            \---PromotionsPage.java
|  |                            \---RecoverPasswordPage.java
|  |                            \---RegisterPage.java
|  |                            \---SelectCinemaPage.java
|  |                       \---steps
|  |                            \---AddConcessionSteps.java
|  |                            \---BillboardSteps.java
|  |                            \---CartSteps.java
|  |                            \---ChooseSeatsSteps.java
|  |                            \---ChooseTicketSteps.java
|  |                            \---CoreSteps.java
|  |                            \---HamburgerMenuSteps.java
|  |                            \---Hooks.java
|  |                            \---LoginSteps.java
|  |                            \---MyOrdersSteps.java
|  |                            \---MyOrderSummarySteps.java
|  |                            \---OrderConfirmationSteps.java
|  |                            \---OrderDetailSteps.java
|  |                            \---PasswordResetSteps.java
|  |                            \---PaymentProcessSteps.java
|  |                            \---PersonalInformationSteps.java
|  |                            \---PreOrderDetailSteps.java
|  |                            \---ProfileSteps.java
|  |                            \---PromotionsSteps.java
|  |                            \---RecoverPasswordSteps.java
|  |                            \---RegisterUserSteps.java
|  |                            \---SelectCinemaSteps.java 
|  |                       \---utils
|  |                            \---testrail
|  |                                \---api
|  |                                    \---APIClient.java
|  |                                    \---APIException.java
|  |                                \---TestRailUtil.java
|  |                            \---ConstantsMessages.java
|  |                            \---CucumberReportUtil.java
|  |                            \---DateUtil.java
|  |                            \---EndpointUtil.java
|  |                            \---ExtentReportUtils.java
|  |                            \---GmailUtil.java
|  |                            \---KeywordActions.java
|  |                            \---PropertiesUtil.java
|  |                            \---SharedDriver.java
|  |                            \---StringInterpolation.java
|  |                            \---TestStateHolder.java
|  |                            \---UtilImage.java
|  |                       \---RunCucumberTest.java
|  |             \---resources
|  |                       \---E2E
|  |                            \---PurchaseConcessions.feature
|  |                            \---PurchaseMixOrder.feature
|  |                            \---PurchaseTickets.feature
|  |                       \---SpecificFunctionality
|  |                            \---Billboard.feature
|  |                            \---CancelOrder.feature
|  |                            \---Login.feature
|  |                            \---MyOrders.feature
|  |                            \---OrderDetailPage.feature
|  |                            \---PartialPayments.feature
|  |                            \---PayingWithPoints.feature
|  |                            \---PaymentMethods.feature
|  |                            \---PersonalInformationPage.feature
|  |                            \---Profile.feature
|  |                            \---Promotions.feature
|  |                            \---RegisterUser.feature
|  |                            \---ResetPassword.feature
|  |                       \---applicationContext.xml
|  |                       \---gmail.properties
|  |                       \---html-config.xml
|  |                       \---testData.properties
|  |                       \---testRail.properties
```


<a name="FeaturesDevGuide"></a>
## Features – Dev Guide

#### dto Folder
Classes declared here contains the objects that we have using through the test execution and some information got by the endpoints

#### endpoints Folder
Classes declared here contains all the endpoints and paths needed to perform the requests.

#### pages Folder
Classes declared here contains the structure of each of the pages (screens) that the tests uses.

#### utils Folder
Classes declared here contains utility logic to help doing additional processes on the tests.
 
#### resources Folder
This folder is located in the following path src/test/resources. Here are all the feature files containing the test cases.

<a name="ExtendingThisFramework"></a>
## Extending this framework

Please see the following section: [Implementation Guide](#ImplementationGuide)

<a name="Dark"></a>
## Dark (undocumented) features

<a name="UpdatesAndUpcomingfeatures"></a>
## Updates and Upcoming features

<a name="UpdatingLibraries"></a>
## Updating libraries, packages and referents

- Selenium, cucumber, json-simple, log4j, appium, jackson-core, rest-assured, junit, javax-mail, extentreports.

<a name="TestingStrategy"></a>
## Testing Strategy

Los casos de prueba, así como los resultados de las ejecuciones serán concentrados en Test Rail. Los Casos de
prueba estarán asociados al Product Backlog Item (PBI) a través de su identificador de Jira.

Cada inicio de ciclo se cargará el Plan de Pruebas del Sprint en Test rail y se desarrollarán los casos de prueba de
acuerdo con el formato (plantilla) disponible por la propia herramienta.

Los resultados de la ejecución de cada plan deberán también ser almacenados en el Plan de Pruebas de cada ciclo
ya sea para pruebas manuales o automatizadas.

<a name="Issues"></a>
## Issue and Defect Management

Los defectos se definen como eventos en los que el producto se comporta de manera inconsistente con los criterios
de aceptación, Los defectos deberán ser registrados en Jira.

Los defectos válidos deben registrarse con al menos la siguiente información:
* Breve descripción
* Descripción detallada
* Criticidad
* Prioridad
* Ambiente donde se encontró.
* Versión del Build o Release donde se detectó
* Condiciones y pasos para reproducir.
* Resultados actuales
* Resultados previstos

<a name="RootCauseAnalysis"></a>
## Root Cause Analysis

Cuando se encuentra un defecto en un entorno en un entorno menor al de producción:
* Los ingenieros de control de calidad indicarán que el defecto fue encontrado por el proceso
* Los ingenieros de desarrollo de software ejecutarán un proceso de 5 razones para formalizar e identificar la
causa raíz.
Cuando se encuentra un defecto en un entorno de producción:
* Los ingenieros de control de calidad realizarán un proceso de 5 por qué para encontrar la causa de la fuga del
defecto.
* Los ingenieros de desarrollo de software ejecutarán un proceso de 5 razones para formalizar e identificar la
causa raíz.
* Los ingenieros de desarrollo de software proporcionarán un informe de impacto

