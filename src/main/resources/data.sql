insert into user_details(id, name, birth_date) values(10001, 'Paaks', current_date());

insert into user_details(id, name, birth_date) values(10002, 'Seventeen', current_date());

insert into user_details(id, name, birth_date) values(10003, 'BTS', current_date());

insert into post(id, description, user_id) values(20001, 'I want to play tennis', 10001);

insert into post(id, description, user_id) values(20002, 'I want to learn French', 10002);

insert into post(id, description, user_id) values(20003, 'I want to learn Spanish', 10003);

insert into post(id, description, user_id) values(20004, 'Seventeen is amazing!!!', 10001);

insert into todo(id, username, description, target_date, done) values(10001, 'paaks', 'Get AWS Certified', current_date(), false);

insert into todo(id, username, description, target_date, done) values(10002, 'paaks', 'Learn DevOps', current_date(), false);

insert into todo(id, username, description, target_date, done) values(10003, 'paaks', 'Learn Full Stack Development', current_date(), false);