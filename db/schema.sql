create table if not exists role (
    id serial primary key not null,
    name varchar(50) not null unique
);

create table if not exists room (
    id serial primary key not null,
    name varchar(200) not null unique
);

create table if not exists person (
    id serial primary key not null,
    login varchar(100) not null unique,
    role_id int references role(id)
);

create table if not exists message (
    id serial primary key not null,
    textMessage varchar(2000) not null,
    created timestamp without time zone not null default now(),
    person_id int references person(id),
    room_id int references room(id)
)
