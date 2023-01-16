## phonebook_telran

This is a demo project which purpose is to demonstrate the usage of Selenide wrapper, Page Object pattern and usage of
the Faker library which generates random test data. Demo website: http://phonebook.telran-edu.de:8080/

## Tests

Project has a document Login.feature which contains the following tests:

* Login with an existing user
* Input incorrect email
* Input password less than 8 characters
* Input password more than 8 characters

Project has a document PasswordRecovery.feature which contains the following tests:

* Password recovery with existing user
* Password recovery with nonexisting user

Project has a document AddContact.feature which contains the following tests:

* Clicking on the Add new contact button really opens the window for adding a contact
* Adding a new contact

## Prerequisites Software/Tools

1. Java Development Kit (Java 17)
2. Java Runtime Environment
3. Maven [ http://maven.apache.org/ ]
4. Git [ http://git-scm.com/downloads ]
5. JUnit 4
6. Faker
7. Cucumber
8. Selenide

## Installation and Test Run

Clone repository and perform the following command:

`mvn test`

## Contributors

Zhamsaranova Natalia zamsaranovanatala@gmail.com