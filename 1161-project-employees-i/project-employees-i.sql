# Write your MySQL query statement below
SELECT p.project_id ,
     round(avg(e.experience_years),2) AS average_years 
 FROM
     project p 
 JOIN 
     employee e  ON e.employee_id = p.employee_id
 GROUP BY
      p.project_id ;