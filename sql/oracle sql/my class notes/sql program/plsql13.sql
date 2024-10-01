While loop
declare
 i number:=1;
begin
 while i<10
loop 
if i=5
then 
goto myproc;
end if;
dbms_output.put_line(i);
i:=i+1;
end loop;
<<myproc>>
dbms_output.put_line('myprog');
end;
/