# the following functionality for the default implementation of the interface.

Java Documentation

Whether you are working on a new cutting edge app or simply ramping up on new technology, Java documentation has all the information you need to make your project a smashing success. Use the rich set of code samples, tutorials, developer guides, API documentation, and more to quickly develop your prototype and scale it up to a real world application.
Java Platform, Standard Edition (Java SE)
Java SE lets you develop and deploy Java applications on desktops and servers. Java SE and component technologies offer the rich user interface, performance, versatility, portability, and security that today's applications require.

Java SE Documentation

    Java SE Licensing Information

    Product License, Commercial Features and Terms, Java SE Licensing Information User Manual (LIUM), Readme Files, Release Notes, and information on Data Collection

    Java SE Technical Documentation

    Java SE Components Documentation

Java Embedded
Java ME Embedded is designed for resource-constrained devices like wireless modules for M2M, industrial control, smart-grid infrastructure, environmental sensors and tracking, and more.

Java ME Embedded documentation

Oracle Java SE Embedded delivers a secure, optimized runtime environment ideal for network-based devices.

Oracle Java SE Embedded and JDK for ARM documentation

Java Card technology provides a secure environment for applications that run on smart cards and other devices with very limited memory and processing capabilities.

Java Card documentation
Java Platform, Enterprise Edition (Java EE)
Java EE provides an API and runtime environment for developing and running large, multi-tiered, reliable, and secure enterprise applications that are portable and scalable and that integrate easily with legacy applications and data.

Java EE documentation

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- You may freely edit this file. See commented blocks below for -->
<!-- some examples of how to customize the build. -->
<!-- (If you delete it and reopen the project it will be recreated.) -->
<!-- By default, only the Clean and Build commands use this build script. -->
<!-- Commands such as Run, Debug, and Test only use this build script if -->
<!-- the Compile on Save feature is turned off for the project. -->
<!-- You can turn off the Compile on Save (or Deploy on Save) setting -->
<!-- in the project's Project Properties dialog box.-->
<project name="JavaSetItems" default="default" basedir=".">
    <description>Builds, tests, and runs the project JavaSetItems.</description>
    <import file="nbproject/build-impl.xml"/>
    <!--

    There exist several targets which are by default empty and which can be 
    used for execution of your tasks. These targets are usually executed 
    before and after some main targets. They are: 

      -pre-init:                 called before initialization of project properties
      -post-init:                called after initialization of project properties
      -pre-compile:              called before javac compilation
      -post-compile:             called after javac compilation
      -pre-compile-single:       called before javac compilation of single file
      -post-compile-single:      called after javac compilation of single file
      -pre-compile-test:         called before javac compilation of JUnit tests
      -post-compile-test:        called after javac compilation of JUnit tests
      -pre-compile-test-single:  called before javac compilation of single JUnit test
      -post-compile-test-single: called after javac compilation of single JUunit test
      -pre-jar:                  called before JAR building
      -post-jar:                 called after JAR building
      -post-clean:               called after cleaning build products

    (Targets beginning with '-' are not intended to be called on their own.)

    Example of inserting an obfuscator after compilation could look like this:

        <target name="-post-compile">
            <obfuscate>
                <fileset dir="${build.classes.dir}"/>
            </obfuscate>
        </target>

    For list of available properties check the imported 
    nbproject/build-impl.xml file. 


    Another way to customize the build is by overriding existing main targets.
    The targets of interest are: 

      -init-macrodef-javac:     defines macro for javac compilation
      -init-macrodef-junit:     defines macro for junit execution
      -init-macrodef-debug:     defines macro for class debugging
      -init-macrodef-java:      defines macro for class execution
      -do-jar:                  JAR building
      run:                      execution of project 
      -javadoc-build:           Javadoc generation
      test-report:              JUnit report generation

    An example of overriding the target for project execution could look like this:

        <target name="run" depends="JavaSetItems-impl.jar">
            <exec dir="bin" executable="launcher.exe">
                <arg file="${dist.jar}"/>
            </exec>
        </target>

    Notice that the overridden target depends on the jar target and not only on 
    the compile target as the regular run target does. Again, for a list of available 
    properties which you can use, check the target you are overriding in the
    nbproject/build-impl.xml file. 

    -->
</project>
```

