-- 59040
SELECT ANIMAL_TYPE, count(*) from animal_ins
group by ANIMAL_TYPE
order by ANIMAL_TYPE;
