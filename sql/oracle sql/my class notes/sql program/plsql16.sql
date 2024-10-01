declare
aaa number :=10;
begin 
insert into tempp values(aaa,'rollback');
rollback;
insert into tempp values(aaa+90,'commit');
commit;
end;
/