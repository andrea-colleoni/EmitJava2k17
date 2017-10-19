-- 2. contare i film suddividendoli per rating
SELECT
	f.rating,
	count(*)
FROM
	film f
group BY
	f.rating