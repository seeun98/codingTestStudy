-- 59041
SELECT name, count(*) from animal_ins
where name is not null
group by name
having count(*) >=2
order by name;