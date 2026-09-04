# Write your MySQL query statement below
select id,
    CASE
        WHEN id % 2 = 1 AND id < (SELECT MAX(id) from Seat)
            THEN (SELECT student FROM Seat s2 WHERE s2.id = s1.id + 1)

        WHEN id % 2 = 0
            THEN (SELECT student FROM Seat s2 WHERE s2.id = s1.id - 1)

        ELSE student
    END as student

FROM Seat s1;