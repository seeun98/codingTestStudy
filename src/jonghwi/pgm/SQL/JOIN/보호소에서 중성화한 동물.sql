-- 59045
SELECT o.animal_id, o.animal_type, o.name
from animal_outs o
         inner join animal_ins i on o.animal_id = i.animal_id
where (o.sex_upon_outcome like 'Spayed%' or o.sex_upon_outcome like 'Neutered%') and i.sex_upon_intake like 'Intact%'
order by o.animal_id