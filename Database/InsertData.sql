﻿use restaurantData;
-- Dữ liệu mẫu
select * from Role

insert into Role VALUES ('MG', N'Quản Lý');
insert into Role VALUES ('SV', N'Phục vụ');
insert into Role VALUES ('CS', N'Thu ngân');
insert into Role VALUES ('KS', N'Bếp');
go


select * FROM Employees
insert into Employees (FullName, [Password], Email, ID_role,SEX, birthday, PhoneNumber) VALUES (N'Admin BaoHuynh', 'admin123', 'huynhbaomts2004@gmail.com', 'MG',1,'2004-06-24','0388319013');
insert into Employees (FullName, [Password], Email, ID_role,SEX, birthday, PhoneNumber) VALUES (N'Bé Hoa', 'admin123', 'huynhbaomts2004@gmail.com', 'SV',1,'2004-06-24','0388319013');
insert into Employees (FullName, [Password], Email, ID_role,SEX, birthday, PhoneNumber) VALUES (N'Bé Bò', 'admin123', 'huynhbaomts2004@gmail.com', 'KS',1,'2004-06-24','0388319013');
insert into Employees (FullName, [Password], Email, ID_role,SEX, birthday, PhoneNumber) VALUES (N'Bé Bé', 'admin123', 'huynhbaomts2004@gmail.com', 'CS',1,'2004-06-24','0388319013');

update Employees set Password = '240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9' where Password = 'admin123'

select * from Areas
insert into Areas (AreaName) values ('Khu A');
insert into Areas (AreaName) values ('Khu B');
insert into Areas (AreaName) values (N'Mang về');




select * from Tables
DELETE FROM Tables;

insert into Tables (TableName, ID_Area, IsOccupied) values ('A01', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A02', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A03', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A04', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A05', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A06', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A07', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A08', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A09', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A10', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A11', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A12', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A14', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A15', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A16', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A17', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A18', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A19', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A20', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A21', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A22', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A23', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A24', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A25', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A26', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A27', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A28', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A23', 1, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('A23', 1, 0);


-- Khu B
insert into Tables (TableName, ID_Area, IsOccupied) values ('B01', 2,0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('B02', 2, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('B03', 2, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('B04', 2, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('B05', 2, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('B06', 2, 0);
insert into Tables (TableName, ID_Area, IsOccupied) values ('B07', 2, 0);

-- Mang về
insert into Tables (TableName, ID_Area, IsOccupied) values (N'Khách lẻ', 3, 0);


-- Inset Đơn hàng

select * from Orders
insert into Orders(ID_Table, ID_Employee, OrderDate, NumberOfGuests, IsPaid) 
values (55, 100003, GETDATE(), 5, 1);

insert into Orders(ID_Table, ID_Employee, OrderDate, NumberOfGuests, IsPaid) 
values (55, 100003, GETDATE(), 5, 0);

select * from Products



select * from OrderDetail
insert into OrderDetail(ID_Order, ID_Item, Quantity, Price, TotalPrice) 
values()


