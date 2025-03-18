1. Query to retrieve rows with dates in range

Select column from table
Where column
between '2023-01-01' and '2023-07-03';

--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --
2. to combine result sets of two or more Select statements

Select * table1
union Select column from table2;

note : union all for duplicate values as well coz union removes duplicates

--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --
3. to retrieve specific data from table

Select specific_column1, specific_column2 from table;
exa: Select first_name, second_name from employee_table;

--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --
4. query to create employee_table 

create employee_table(
    empId int,
    empName varchar(40),
    empAge int,
    empAddress varchar(40),
    empSal int
);

--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --
5. delete all rows in table without disturbing the structure

truncate table employee_table;

--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --
6. retrieve max value from a column

Select max(specific_column1) from table1;

--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --
7. combine two rows using left join

Select left.column, right.column
from left_column left
left join right_column right on left.column = right.column;