WITH TotalUsers AS (
    SELECT COUNT(*) AS total_users FROM Users
)
SELECT 
    r.contest_id,
    ROUND(COUNT(DISTINCT r.user_id) * 100.0 / t.total_users, 2) AS percentage
FROM Register r
CROSS JOIN TotalUsers t
GROUP BY r.contest_id, t.total_users
ORDER BY percentage DESC, contest_id ASC;
