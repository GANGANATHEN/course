declare 
aaa number:=10;
begin 
for i in reverse 1..aaa
loop
dbms_output.put_line(i);
end loop;
end;
/