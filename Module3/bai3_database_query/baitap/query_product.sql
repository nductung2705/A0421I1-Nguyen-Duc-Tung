use b2_simple_product_management;
-- Them du lieu Khach Hang
select * from customer;
insert into customer (customer_name,customer_age) values('Minh Quan',10);
insert into customer (customer_name,customer_age) values('Ngoc Oanh',20);
insert into customer (customer_name,customer_age) values('Hong Ha',50);

-- Them du lieu San Pham
select * from product;
insert into product (product_name,product_price) values('May giat',3);
insert into product (product_name,product_price) values('Tu lanh',5);
insert into product (product_name,product_price) values('Dieu hoa',7);
insert into product (product_name,product_price) values('Quat',1);
insert into product (product_name,product_price) values('Bep dien',2);

-- Them du lieu bang Order
select * from `order`;
insert into `order`(customer_id,order_date,total_price) values(1,'2006-03-21',0);
insert into `order`(customer_id,order_date,total_price) values(2,'2006-03-23',0);
insert into `order`(customer_id,order_date,total_price) values(1,'2006-03-16',0);

-- Them du lieu bang order detail
select * from order_detail;
insert into order_detail (order_id,product_id,product_quantity) values(1,1,3);
insert into order_detail (order_id,product_id,product_quantity) values(1,3,7);
insert into order_detail (order_id,product_id,product_quantity) values(1,4,2);
insert into order_detail (order_id,product_id,product_quantity) values(2,1,1);
insert into order_detail (order_id,product_id,product_quantity) values(3,1,8);
insert into order_detail (order_id,product_id,product_quantity) values(2,5,4);
insert into order_detail (order_id,product_id,product_quantity) values(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select `order`.order_id,`order`.order_date,pro.product_price from `order` left join order_detail ord on `order`.order_id=ord.order_id inner join product pro on ord.product_id=pro.product_id;
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select cs.customer_name,pro.product_name from `order` inner join customer cs on `order`.customer_id=cs.customer_id inner join order_detail ordt on `order`.order_id=ordt.order_id left join product pro on ordt.product_id=pro.product_id
group by cs.customer_name,pro.product_name
order by cs.customer_name;
-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select customer_name from customer where customer_id not in(select customer_id from `order`);
-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select `order`.order_id,`order`.order_date,sum(pro.product_price*ord.product_quantity) as Total_bill from `order` left join order_detail ord on `order`.order_id=ord.order_id inner join product pro on ord.product_id=pro.product_id
group by `order`.order_id
order by `order`.order_date;







