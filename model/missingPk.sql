SET CLIENT_ENCODING TO 'ISO-8859-1';

start transaction;

alter table discussions
add column dis_id SERIAL PRIMARY KEY; 

alter table morts
add column mor_id SERIAL PRIMARY KEY; 

alter table logs
add column log_id SERIAL PRIMARY KEY; 

commit;