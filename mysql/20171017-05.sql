-- 5. determinare la durata massima, minima, media e totale dei film suddividendoli per rating
SELECT
	f.rating,
	max(f.length),
    min(f.length),
    avg(f.length),
    sum(f.length)
FROM
	film f
group BY
	f.rating