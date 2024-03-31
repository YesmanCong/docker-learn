-- create table public.t_sys_users
create table if not exists public.t_sys_users ();
-- add table public.t_sys_users columns
alter table public.t_sys_users add column if not exists "user_id" serial;
alter table public.t_sys_users add column if not exists "user_code" varchar(30) NULL;
alter table public.t_sys_users add column if not exists "authenticator" varchar(250) NULL;
alter table public.t_sys_users add column if not exists "name" varchar(30) NULL;
alter table public.t_sys_users add column if not exists "email" varchar(50) NULL;
alter table public.t_sys_users add column if not exists "mobile" varchar(30) NULL;
alter table public.t_sys_users add column if not exists "create_time" varchar(32) NULL;
alter table public.t_sys_users add column if not exists "status" int2 NULL;
alter table public.t_sys_users add column if not exists "update_time" varchar(30) NULL;
alter table public.t_sys_users add column if not exists "login_time" varchar(30) NULL;
alter table public.t_sys_users add column if not exists "login_num" int8 NULL;
alter table public.t_sys_users add column if not exists "update_password_time" varchar(32) NULL;
-- add table public.t_sys_users constraints
alter table public.t_sys_users drop constraint if exists "t_sys_users_pk";
alter table public.t_sys_users add constraint "t_sys_users_pk" primary key ("user_id");
-- add table public.t_sys_users indexes.