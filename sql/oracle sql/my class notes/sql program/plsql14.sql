begin
insert into tempp values(20,'before savepoint');
savepoint sp;
insert into tempp values(100, 'after savepoint');
 rollback to savepoint sp;
end;
/
