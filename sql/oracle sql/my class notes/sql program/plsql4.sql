declare
 aaa number(5);
 bbb number(5):=1;
begin 
select qty_on_hand into aaa from masteritem where itemno=bbb;
if aaa>1000 then
 update masteritem set qty_on_hand = aaa+1 where itemno = bbb;
else
 update masteritem set qty_on_hand = aaa+10 where itemno = bbb;
end if;
end;
/
