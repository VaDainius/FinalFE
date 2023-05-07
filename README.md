# FinalFE
This is Front-End part of final project. 
Project idea - all type Helmet e-shop. A page, where you can either buy or sell your helmet.

Important!! All files are in master branch.

TO START:
1. Clone to your local folder;
2. Start 'APP' in top-right or 'BaigiamsisFeApplication' in 'ca.BaigiamasisFE' where SpringBootApplication is allocated.

Front-end part includes:
1. Spring Security;
2. Communication between both Back-End and Database.

There are three posible roles: Admin, User and Reader.
Reader is just a basic customer, which can swipe through all possible products, buy them.
User is more privileged customer, who must be registered and logged in with unique credentials. User can buy or post his own products to sell. He/she is also abble to    update excisting helmets.
Admin has access to all roles, can see all registered users, can delete excisting users.

So far available endpoints
for ADMIN:
* localhost://8080/admin/allUsers - to get all users
* localhost://8080/admin/allUsers/{username} - to delete user by it's username

for USER:
* 

General:
* localhost://8080/register/newUser - to register new User
* localhost://8080/login - basic login
* localhost://8080/main - home page / main page
* localhost://8080/helmets - returns all helmets
* localhost://8080/helmets/price/{price} - search by price
* localhost://8080/helmets/size/{size - search by size
* localhost://8080/helmets/color/{color} - search by color
* localhost://8080/helmets/type/{type} - search by type

