-- 4. determinare la durata massima, minima, media e totale dei film
SELECT
	max(f.length),
    min(f.length),
    avg(f.length),
    sum(f.length)
FROM
	film f