/* Write your PL/SQL query statement below */
select product_name, year, price from Sales join Product  using(product_id);

