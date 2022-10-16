
select a.food_type, a.rest_id, a.rest_name, a.favorites
from rest_info a, (
    select max(favorites) max_favorites, food_type
    from rest_info
    group by food_type
) b
where a.food_type = b.food_type and a.favorites = b.max_favorites
order by food_type desc


select food_type, rest_id, rest_name, favorites
from rest_info
where (food_type, favorites) in (
    select food_type , max(favorites)
    from rest_info
    group by food_type
)
order by food_type desc