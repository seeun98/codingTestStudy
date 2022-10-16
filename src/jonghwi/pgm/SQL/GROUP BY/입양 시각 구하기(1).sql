-- 59412
SELECT to_number(to_char(datetime,'HH24')) hour, count(*)
from animal_outs
where to_number(to_char(datetime,'HH24')) between 9 and 19
group by to_char(datetime,'HH24')
order by hour