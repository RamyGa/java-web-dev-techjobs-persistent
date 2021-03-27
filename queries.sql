## Part 1: Test it with SQL
SELECT * FROM job;
## Part 2: Test it with SQL

SELECT * FROM employer WHERE location = 'St. Louis City';

## Part 3: Test it with SQL
DROP TABLE techjobs.job;

## Part 4: Test it with SQL
SELECT skill.name, skill.description FROM techjobs.skill INNER JOIN job_skills
WHERE skill.id = job_skills.skills_id AND job_skills.jobs_id IS NOT NULL ORDER BY skill.name ASC;
