declare 
aaa number(5);
begin 
 select qty_on_hand into aaa from masteritem where itemno=1;
 update masteritem set qty_on_hand = aaa+10 where itemno =1;
end;
Conditonal Control In PL/SQL:
if <condition> then
 <action>
elsIf <condition> Then
 <action>
else
 <action>
end if;
/