use mydb;
create table bank(acc_no integer unique,acc_holder varchar(20),ifsc_code varchar(20),branch varchar(10),
acc_type varchar(10),balance numeric(12,2),pin numeric(4)unique);
