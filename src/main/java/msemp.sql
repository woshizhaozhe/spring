create database msemp;
use msemp;
create table emp(empno int primary key auto_increment,
ename varchar(32),job varchar(32),mgr int,hiredate varchar(32),
sal double, comm double,deptno int);
insert into EMP (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (7369, 'SMITH', 'CLERK', 7902, '17-12-1980', 800, null, 20);
insert into EMP (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (7499, 'ALLEN', 'SALESMAN', 7698, '20-02-1981', 1600, 300, 30);
insert into EMP (empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (7521, 'WARD', 'SALESMAN', 7698, '22-02-1981', 1250, 500, 30);