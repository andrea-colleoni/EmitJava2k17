SELECT `first_name` , 1
FROM `actor`
UNION all -- duplicati compresi
-- union -- duplicati non compresi
SELECT `last_name`, 2
from actor


SELECT	
    f.*,
    (select avg(rental_rate) from film)
FROM
	film f inner JOIN
    film_category fc
    on f.film_id = fc.film_id
WHERE
	fc.category_id = (select category_id from category where name = 'Action')