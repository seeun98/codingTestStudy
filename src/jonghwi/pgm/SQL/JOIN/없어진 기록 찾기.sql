-- 59042
SELECT o.animal_id, o.name
from animal_outs o
         left outer join animal_ins i on i.animal_id = o.animal_id
where i.animal_id is null
order by o.animal_id;