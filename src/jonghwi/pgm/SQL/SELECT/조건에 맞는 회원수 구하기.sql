-- 131535

SELECT count(age) users
from user_info
where age between 20 and 29
  and extract(year from joined) = 2021;