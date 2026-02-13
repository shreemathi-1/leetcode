-- Last updated: 2/13/2026, 3:15:50 PM
# Write your MySQL query statement below
 select class 
 from Courses 
 group by class having count(student)>=5