-- 59409
SELECT animal_id, name,
       case
           when SEX_UPON_INTAKE like 'Neutered%' then 'O'
           when SEX_UPON_INTAKE like 'Spayed%' then 'O'
           else 'X'
           end 중성화
from ANIMAL_INS
order by animal_id