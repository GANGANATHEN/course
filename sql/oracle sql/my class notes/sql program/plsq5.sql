declare
 aaa number(5);
 bbb number(5);
 t number(5);
begin 
 t = &bbb;
select qty_on_hand into aaa from masteritem where itemno = t;
if aaa>1000 then
update masteritem set qty_on_hand = aaa+20 where item no = t;
end if;
end;
/