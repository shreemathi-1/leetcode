-- Last updated: 2/13/2026, 3:16:42 PM
# Write your MySQL query statement below
select 
    max(salary) as SecondHighestSalary
from 
    Employee 
 where salary < (select max(salary) from Employee)     ;