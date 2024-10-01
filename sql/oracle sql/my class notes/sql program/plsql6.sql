declare
bbb number(5):=1;
aaa masteritem.itemno%type;
begin
 select qty_on_hand into aaa from master item where itemno=bbb;
if aaa>1000 then
update masteritem set qty_on_hand = aaa+20 where item no= bbb;
end if;
end;
/