-- Last updated: 2/13/2026, 3:16:44 PM
# Write your MySQL query statement belowselct 
select p.firstName,p.lastName,a.city , a.state from Person p left join Address a on p.personId = a.personId;