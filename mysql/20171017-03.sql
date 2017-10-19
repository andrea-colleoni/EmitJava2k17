-- 3. contare i film suddividendoli per rental_duration
SELECT
	f.rental_duration,
	count(*)
FROM
	film f
group BY
	f.rental_duration