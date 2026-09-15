# Write your MySQL query statement below
SELECT d.name as Department , e.name as Employee , e.salary
FROM Employee e
JOIN Department d
ON e.departmentId  = d.id
WHERE e.salary = (
    SELECT Max(salary)
    FROM Employee
    WHERE departmentId = e.departmentId 
)