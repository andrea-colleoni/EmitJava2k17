-- 5. elencare tutti i film con title, description e durata in ore (1 ora = 60 minuti)
SELECT
	f.title,
    f.description,
    concat(floor(f.length / 60), ' ore e ', f.length MOD 60, ' minuti') durata_ore
FROM
	film f