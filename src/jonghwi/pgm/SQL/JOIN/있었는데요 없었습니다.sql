-- 59043
SELECT o.animal_id, o.name
from animal_outs o
         inner join animal_ins i on o.animal_id = i.animal_id
where i.datetime > o.datetime
order by i.datetime