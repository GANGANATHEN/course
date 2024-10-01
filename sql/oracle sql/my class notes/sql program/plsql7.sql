declare
aaa masteritem%rowtype;
begin
 select qty_on_hand into aaa from masteritem where itemno=3;
if aaa > 1000
 then
update masteritem set qty_on_hand = aaa +20 where itemno = 3;
else
update masteritem set qty_on_hand = aaa + 10 where itemno = 3;
end if;
end;
/