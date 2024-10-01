begin
<<mainloop>>
for i in 1..10
loop 
<<subloop>>
for j in 1..10
loop 
dbms_output.put_line(j);
exit mainloop when j=5;
end loop subloop;
end loop mainloop;
end;
/