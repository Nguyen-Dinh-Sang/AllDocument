select *
from thisinh
where matruong = 'SGU'
	and namduthi = '2022'
	
select sobaodanh
from ketqua
where diem > 8

select *
from thisinh
where sobaodanh in (select sobaodanh
					from ketqua
					where diem > 8)