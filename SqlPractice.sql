//The SELECT statement is used to select data from a database.
SELECT CustomerName, City FROM Customers;

//Return all the columns from the Customers table
SELECT * FROM Customers;

//The SELECT DISTINCT statement is used to return only distinct (different) values.
SELECT DISTINCT Country FROM Customers;

//By using the DISTINCT keyword in a function called COUNT, we can return the number of different countries.
SELECT COUNT(DISTINCT Country) FROM Customers;


//Example
SELECT Count(*) AS DistinctCountries
FROM (SELECT DISTINCT Country FROM Customers);

//The WHERE clause is used to filter records.
SELECT column1, column2, ...
FROM table_name
WHERE condition;

//Example
//Select all customers from Mexico:
SELECT * FROM Customers
WHERE Country='Mexico';

//Select all customers where customer id is 1:
SELECT * FROM Customers
WHERE CustomerID=1;

//Operators in The WHERE Clause
//Select all customers with a CustomerID greater than 80:
SELECT * FROM Customers
WHERE CustomerID > 80;

Operator	Description
=	Equal	
>	Greater than	
<	Less than	
>=	Greater than or equal	
<=	Less than or equal	
<>	Not equal. Note: In some versions of SQL this operator may be written as !=	
BETWEEN	Between a certain range	
LIKE	Search for a pattern	
IN	To specify multiple possible values for a column