# Write your MySQL query statement below
SELECT results 
FROM (
    SELECT u.name as results
    FROM Users u 
    JOIN MovieRating mr
    ON u.user_id = mr.user_id
    GROUP BY mr.user_id,u.name
    ORDER BY COUNT(*) DESC , u.name
    LIMIT 1
) as a

UNION ALL 

SELECT results 
FROM (
    SELECT m.title as results
    from MovieRating mr
    JOIN Movies m
    ON mr.movie_id = m.movie_id
    WHERE mr.created_at >= '2020-02-01'
        AND mr.created_at < '2020-03-01'
    GROUP BY mr.movie_id, m.title
    ORDER BY avg(mr.rating) DESC , m.title
    LIMIT 1
) as b