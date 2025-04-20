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

//The ORDER BY keyword is used to sort the result-set in ascending or descending order.
SELECT column1, column2, ...
FROM table_name
ORDER BY column1, column2, ... ASC|DESC;

//Example
//Sort the products by price:
SELECT * FROM Products
ORDER BY Price;


//Sort the products from highest to lowest price:
SELECT * FROM Products
ORDER BY Price DESC;

//Sort the products alphabetically by ProductName:
SELECT * FROM Products
ORDER BY ProductName;

//Sort the products by ProductName in reverse order:
SELECT * FROM Products
ORDER BY ProductName DESC;

//The following SQL statement selects all customers from the "Customers" table,
//sorted by the "Country" and the "CustomerName" column. This means that it orders by Country,
//but if some rows have the same Country, it orders them by CustomerName:
SELECT * FROM Customers
ORDER BY Country, CustomerName;

//The following SQL statement selects all customers from the "Customers" table,
//sorted ascending by the "Country" and descending by the "CustomerName" column:
SELECT * FROM Customers
ORDER BY Country ASC, CustomerName DESC;