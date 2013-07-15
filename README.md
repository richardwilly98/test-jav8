test-jav8
=========

Small test app for Java integration with V8

## Install Jav8 in local Maven repository:
```
lib/mvn install:install-file -Dfile=jav8-jsr223-win-amd64-0.6.jar -DgroupId=lu.flier -DartifactId=jav8 -Dversion=0.6 -Dpackaging=jar
```

## Run the app:
```
mvn exec:java -Dexec.mainClass="com.github.richardwilly98.App"
```