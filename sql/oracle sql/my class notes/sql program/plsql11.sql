SQL
declare
aaa number:=10;
begin 
for i in 1..aaa
loop 
insert into tempp values(i,'infor');
end loop;
end;
/
