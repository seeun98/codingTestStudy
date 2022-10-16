-- 59411
SELECT o.animal_id, o.name
from animal_outs o
         inner join animal_ins i on o.animal_id = i.animal_id
order by (o.datetime - i.datetime) desc
    fetch first 2 rows only;