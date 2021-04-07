select * from movie_member
left outer join movie_details
on movie_member.movie_id = movie_details.id;

select * from movie_member
right outer join movie_details
on movie_member.movie_id = movie_details.id;

select distinct movie_member.ID, movie_member.first_name, movie_member.last_name
from movie_member
inner join movie_details
where movie_member.movie_id = (select movie_details.id
from movie_details where movie_details.Title = '3 idiots');

select * from movie_member
inner join movie_details
on movie_member.movie_id = movie_details.id;

select * from movie_member
left join movie_details
on movie_member.movie_id = movie_details.id;

select distinct * from movie_member
join movie_details
on movie_member.movie_id = movie_details.id;
