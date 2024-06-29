create table FA1
(
    Class varchar(3) not null,
    Sec varchar(1),
    Roll int(2),
    MathBio int(2) not null,
    Phy int(2) not null,
    Chem int(2) not null,
    Eng int(2) not null,
    IP_PE int(2) not null
);
create table FA2
(
    Class varchar(3) not null,
    Sec varchar(1),
    Roll int(2),
    MathBio int(2) not null,
    Phy int(2) not null,
    Chem int(2) not null,
    Eng int(2) not null,
    IP_PE int(2) not null
);
create table FA3
(
    Class varchar(3) not null,
    Sec varchar(1),
    Roll int(2),
    MathBio int(2) not null,
    Phy int(2) not null,
    Chem int(2) not null,
    Eng int(2) not null,
    IP_PE int(2) not null
);
create table FA4
(
    Class varchar(3) not null,
    Sec varchar(1),
    Roll int(2),
    MathBio int(2) not null,
    Phy int(2) not null,
    Chem int(2) not null,
    Eng int(2) not null,
    IP_PE int(2) not null
);
create table SA1
(
    Class varchar(3) not null,
    Sec varchar(1),
    Roll int,
    MathBio int(2) not null,
    Phy int(2) not null,
    Chem int(2) not null,
    Eng int(2) not null,
    IP_PE int(2) not null
);
create table SA2
(
    Class varchar(3) not null,
    Sec varchar(1),
    Roll int(2),
    MathBio int(2) not null,
    Phy int(2) not null,
    Chem int(2) not null,
    Eng int(2) not null,
    IP_PE int(2) not null
);
/*----------------------------------------------------------------------------*/
insert into fa1 values("XI", "A", 1, 88,89,80,87,100);
insert into fa1 values("XI", "A", 2, 78,79,70,77,70);
insert into fa1 values("XII", "A", 1, 88,89,80,87,100);
insert into fa1 values("XII", "A", 2, 78,79,70,77,70);
/*----------------------------------------------------------------------------*/
insert into fa2 values("XI", "A", 1, 88,89,80,87,100);
insert into fa2 values("XI", "A", 2, 78,79,70,77,70);
insert into fa2 values("XII", "A", 1, 88,89,80,87,100);
insert into fa2 values("XII", "A", 2, 78,79,70,77,70);
/*----------------------------------------------------------------------------*/
insert into fa3 values("XI", "A", 1, 88,89,80,87,100);
insert into fa3 values("XI", "A", 2, 78,79,70,77,70);
insert into fa3 values("XII", "A", 1, 88,89,80,87,100);
insert into fa3 values("XII", "A", 2, 78,79,70,77,70);
/*----------------------------------------------------------------------------*/
insert into fa4 values("XI", "A", 1, 88,89,80,87,100);
insert into fa4 values("XI", "A", 2, 78,79,70,77,70);
insert into fa4 values("XII", "A", 1, 88,89,80,87,100);
insert into fa4 values("XII", "A", 2, 78,79,70,77,70);

/*----------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------*/

insert into sa1 values("XI", "A", 1, 88,99,70,85,55);
insert into sa1 values("XI", "A", 2, 78,89,70,77,70);
insert into sa1 values("XII", "A", 1, 98,89,68,87,99);
insert into sa1 values("XII", "A", 2, 78,79,70,87,70);
/*----------------------------------------------------------------------------*/
insert into sa2 values("XI", "A", 1, 88,89,80,87,90);
insert into sa2 values("XI", "A", 2, 78,89,70,88,70);
insert into sa2 values("XII", "A", 1, 78,89,80,87,98);
insert into sa2 values("XII", "A", 2, 89,79,80,77,80);