# cognizant
deepskilling
Week 1 — Design Patterns and Principles

Java FSE Deep Skilling (Digital Nurture 5.0)

This folder contains two mandatory hands-on exercises from the tracker spreadsheet:


Exercise 1: Implementing the Singleton Pattern → singleton/
Exercise 2: Implementing the Factory Method Pattern → factory/



How to Compile & Run (no IDE needed)

Prerequisites

Install the JDK (not just JRE) — https://adoptium.net or sudo apt install default-jdk
Verify with: javac -version and java -version

Exercise 1 — Singleton

bashcd singleton
javac DatabaseConnection.java SingletonDemo.java
java SingletonDemo

Expected output (key line):

conn1 == conn2 ? true
SUCCESS: Both references point to the same Singleton instance.

Exercise 2 — Factory Method

bashcd factory
javac Notification.java EmailNotification.java SMSNotification.java PushNotification.java NotificationFactory.java FactoryDemo.java
java FactoryDemo

Expected output (key lines):

[EMAIL] Sending email notification: ...
[SMS] Sending SMS notification: ...
[PUSH] Sending push notification: ...
Expected error caught: Unknown notification type: FAX


How to Run in an IDE (IntelliJ / Eclipse / VS Code)


Open the singleton or factory folder as a Java project (or add as a source root).
Right-click the *Demo.java file → Run.
