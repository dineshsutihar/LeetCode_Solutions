

SELECT e1.name
FROM Employee e1
WHERE e1.id IN (
    SELECT e2.managerId
    FROM Employee e2
    GROUP BY e2.managerId
    HAVING COUNT(*) >= 5
);
