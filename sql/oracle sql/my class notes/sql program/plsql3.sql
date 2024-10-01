declare
 aaa number(5);
begin 
select qty_on_hand into aaa from masteritem where itemno=1;
if aaa>1000
then 
update masteritem set qty_on_hand = aaa+20 where itemno=1;
elsif aaa=1000
then
update masteritem set qty_on_hand = aaa+15 where itemno=1;
else
update masteritem set qty_on_hand = aaa+10 where itemno =1;
end if;
end;
/