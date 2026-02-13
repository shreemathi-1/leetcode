-- Last updated: 2/13/2026, 3:16:38 PM
# Write your MySQL query statement below
select c.name as Customers 
from Customers c left join Orders o 
on c.id = o.customerId 
where o.id is null ;