# Write your MySQL query statement below
SELECT id,
        CASE 
            WHEN p_id is NULL THEN 'Root'
            WHEN id  in (SELECT p_id FROM tree) THEN 'Inner'
            ELSE 'Leaf'
        END AS 'type'
FROM tree