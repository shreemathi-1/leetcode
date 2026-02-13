-- Last updated: 2/13/2026, 3:16:39 PM
# Write your MySQL query statement below
select email 
from Person
group by email 
having COUNT(email)>1;
