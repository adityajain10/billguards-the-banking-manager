# billguards-The-Banking-Manager

## Introduction
In present times, all major economic transactions have started taking place digitally. The major trends of modern digital transactions is substantiated by use of database management. These databases can be accessed by anyone with specific rights, and perform certain actions on it. The data update is done almost automatically and is much faster. Users can, in present days can access their accounts directly without going to a bank, making transfers, transactions and accessing cash directly without standing in long queues as was prevalent earlier using ATM machines. On employee-side the data is much more organized, and accessing and performing actions on user accounts is easier for them. Due to this the bank has better work efficiency and customer experience improves as well.

## System Overview
###Product Perspective
BillGuards -The Banking Manager can be used by Bank Employees and/or Customers depending on bank policy. It can be used by several employees of the bank at the same time with required rights. It can be accessed using the BillGuards -The Banking Manager Application with graphical interface. Our Product consists mainly of two parts i.e. the Employee Work-Space (EWS) and the ATM Banking.
The system would deal with the internal banking functions like new account registration, withdrawal, deposit, money transfer etc. The ATM banking would be for direct access of customers, who could use it for Cash-Withdrawal, Transfers and Account-Summary. Both of them connect to a main database server for storing and retrieving the data of the Customers.

### Product Functionality
Our app provides little functionality as of now. As the idea is original, there are many more modules that can be developed and marketed according to the needs of the users. As of now the modules that are developed are:

1. Employee login section for existing user
2. Facility to add new branch, department
3. Adding new recruited employer with auto generated employee id
4. Adding new customer
5. Enquiry for account, employee, current balance, transaction
6. Different tables for employee and customer details such as name, address, bank balance.
7. Separate section for transaction details of facility to issue credit card to customers
8. Transactions: credit or debit money from account
9. Deleting existing account and employee
10. New employee ID, customer ID, transaction ID will be generated automatically

## Design and Implementation Constraints
1. GUI is only in English.
2. Login and password is used for identification of customer and there is no facility for guest.
3. BillGuards -The Banking Manager software version can be updated via the Internet in case of important security patches, new compatible devices, or for adding more functionality.
4. A user cannot use the subsystem if he has not registered for an account.

## Assumption and Dependencies
1. All users are assumed to be equipped with GUI terminals.
2. User has basic knowledge of computers.
3. User should have sufficient knowledge of English since the system interface will be in English.
4. The system will have simple and easy to use interfaces.
5. Provides accurate data.

## Product Functionalities

The Product Functionalities are as follows:

### For Admin/Employee
1. Login Issue Credit Card
2. Balance enquiry
3. Fund transfer
4. View/ Edit EmployeeDetails
5. Add Department
6. View statement
7. View transaction

### For Customer
1. Login
2. Balance Enquiry
3. View Statement
4. View Transaction

## Interface
### User Interfaces
The first interface is the log-in screen. This is where the user has a specific Username and Password so that they can gain access to the database. If the login is verified with the database, then user will get access to various functions like Transactions, Balance, Credit Cards, and Departments etc. However, if the login is not verified, then user will be asked to try again with correct credentials.

### Hardware Interfaces
For BillGuards -The Banking Manager, an encrypted pen drive will be used which will be provided to the client that will be used in his/her login. At the login time, the pen drive has to be inserted in order to facilitate the login. BillGuards -The Banking Manager requires an entry-level PC for smaller number of bank accounts (like, when data is being stored locally). For larger no. of bank accounts, a server class machine is recommended.
* Microsoft Windows XP Professional SP3/Vista SP1/Windows 7 Professional:
* Processor: 800MHz Intel Pentium III or equivalent
* Memory: 512 MB
* Disk space: 750 MB of free disk space

### Software Interfaces
BillGuards -The Banking Manager can run on any recent version of Windows, Linux etc. System will use JDBC Bridge for database connectivity with JAVA using NetBeans as front end. It requires following development tools:
* JDBC
* Java SQL connector
* Java development Tool Kits for working with java server pages.

### Communications Interfaces
System will use JDBC Bridge for database connectivity with JAVA using NetBeans as front end.
* The programming involved to establish a JDBC connection is fairly simple. Here are four steps:
#### Import JDBC Packages
Add import statements to your Java program to import required classes in your Java code.

#### Register JDBC Driver
This step causes the JVM to load the desired driver implementation into memory so it can fulfill your JDBC requests.

#### Database URL Formulation
This is to create a properly formatted address that points to the database to which you wish to connect.

#### Create Connection Object
Finally, code a call to the DriverManager object's getConnection( ) method to establish actual database connection


## Performance
The most important factor in the working of the whole project is its Connectivity with the Server.

* Speed: The system should be made as fast as possible to reduce response time.

* Throughput: The throughput should be as high as possible. We should be able to attain maximum output in minimum time.

* Capacity: We should try to make it accessible to maximum users at a time.

* Resource Utilization: Resources are modified according to user requirements.

## Safety and Security
The Central Server comprises of the MySql Server 4.17. Both are open source software solutions and the best among their fields. They have their respective Security Mechanism which would prevent any unauthorised access or exploitation of the Server.

### Login requirements
* Users will be provided access to the system after they are registered by their recruitment officers
* Users will be logging into the system using their ID and one time password emailed to them.
* On login they will be asked to change their passwords

### Password
* Passwords must have a minimum length of 8 characters
* Passwords must meet at least 3 out of the 4 requirements for quality:
1. at least 1 lower case letter
2. at least 1 upper case letter
3. at least 1 number
4. At least 1 special character (?, *, %)

*  Password should not contain the user’s first name, middle name, last name, or username.
*  Passwords on sensitive IT systems must be changed, at a minimum, every 90 days.

### Inactivity timeouts
* System should timeout when there is no activity for five minutes.

## Restrictions, limitations, and constraints
In order for the BillGuards-The Banking Manager to be downloaded and installed ,the user must be using a mobile device running Windows Operating System version 8 and above, as well as having access to the Windows Marketplace. All development for the app was done on Windows 10 machines. Testing of the application was done on Windows 10. As long as the Windows Marketplace is available to Microsoft’s Windows Operating System users, the software will be marketable, maintainable and functional to both users and developers.

### Testing Issues

#### Classes of tests
We will conduct first tests on each individual app within the system as separate entities using the Windows. Once each individual app is tested thoroughly, the package will the built together and tested as a whole. All known valid input will be tested as well as known invalid input. A more comprehensive overview of our testing strategies will be included in our testing specification documentation.

#### Expected software response
Each test performed will be clearly observed as either failing or succeeding.
