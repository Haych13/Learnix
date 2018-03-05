---------------- Welcome to Learnix!: ----------------

Learnix is an open-source program made with JavaFX to help you 
learn how to use the Command Line Interface on GNU/Linux devices. 
Most of what's learnt here will also work on Unix and WSL.


---------------- Install Requirements: ----------------

Windows and MacOS - Java 9 JRE:
https://www.oracle.com/java/java9.html


GNU/Linux - Oracle Java 9 JRE*:

sudo add-apt-repository ppa:webupd8team/java

sudo apt update

sudo apt install oracle-java9-installer

sudo apt install oracle-java9-set-default


Check your version with 

java -version


---------------- * ----------------


*(JavaFX is not installed by default on OpenJDK, hence the requirement for Oracle Java 9, 
although the JavaFX project itself is open source and is part of the OpenJDK project. You can build an open version
of OpenJDK (including JavaFX)** completely from source which has no dependencies on the Oracle JDK or closed source code. 
There are currently no Linux distributions that already offer an OpenJFX package.) 

Although some distros will let you install JFX with:
sudo apt-get install openjfx

**https://wiki.openjdk.java.net/display/OpenJFX/Building+OpenJFX
