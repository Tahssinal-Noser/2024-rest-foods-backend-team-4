-- Insert Menucards

INSERT INTO Menucard (name) VALUES ('Breakfast Menu');
INSERT INTO Menucard (name) VALUES ('Lunch Menu');
INSERT INTO Menucard (name) VALUES ('Dinner Menu');
INSERT INTO Menucard (name) VALUES ('Dessert Menu');
INSERT INTO Menucard (name) VALUES ('Drinks Menu');

INSERT INTO restaurant_table (capacity) VALUES (4);
INSERT INTO restaurant_table (capacity) VALUES (2);
INSERT INTO restaurant_table (capacity) VALUES (6);
INSERT INTO restaurant_table (capacity) VALUES (4);
INSERT INTO restaurant_table (capacity) VALUES (8);

-- Insert MenucardItems for 'Breakfast Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Pancakes', 'Fluffy pancakes served with syrup', 5.99, 'Main Course', true, 'https://cdn.loveandlemons.com/wp-content/uploads/2022/09/oatmeal-pancakes.jpg');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Omelette', 'Three-egg omelette with cheese and ham', 6.99, 'Main Course', false, 'https://www.olivetomato.com/wp-content/uploads/2016/02/SAM4952-1.jpg');

-- Insert MenucardItems for 'Lunch Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Caesar Salad', 'Fresh romaine with Caesar dressing', 7.99, 'Salad', true, 'https://media.chefdehome.com/740/0/0/caesar/classic-caesar-salad.jpg');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Grilled Chicken Sandwich', 'Grilled chicken breast on a bun', 8.99, 'Sandwich', false, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQZhTwlZBa102MTTXyRsKMn2BLsipUDpnoeQ&s');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Pizza Margherita', 'Classic pizza with tomato sauce and mozzarella', 10.99, 'Main Course', true, 'https://images.ctfassets.net/nw5k25xfqsik/64VwvKFqxMWQORE10Tn8pY/200c0538099dc4d1cf62fd07ce59c2af/20220211142754-margherita-9920.jpg?w=1024');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Turkey Club Sandwich', 'Turkey, bacon, lettuce, and tomato on toast', 9.99, 'Sandwich', false, 'https://www.jennieo.com/wp-content/uploads/2019/11/image-recipe_turkey-club-sandwich.jpg');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Roast Beef Sandwich', 'Roast beef with horseradish sauce on a bun', 9.99, 'Sandwich', false, 'https://food.fnr.sndimg.com/content/dam/images/food/fullset/2021/09/02/KC2905_Upstate-Style-Roast-Beef-Sandwich_s4x3.jpg.rend.hgtvcom.616.462.suffix/1630607591313.jpeg');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Lasagna', 'Baked pasta with meat sauce and cheese', 12.99, 'Main Course', false, 'https://www.mygfguide.com/wp-content/uploads/2020/11/lasagne-cover-image-scaled-720x720.jpg');

-- Insert MenucardItems for 'Dinner Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Steak', 'Grilled ribeye steak with garlic butter', 15.99, 'Main Course', true, 'https://www.allrecipes.com/thmb/3cixVDmAtbb2hYxoFLVJ4VPQ7rA=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/143809-best-steak-marinade-in-existence-ARMag-1x1-1-8105b6b8e5cb4931ba8061f0425243dd.jpg');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Spaghetti Bolognese', 'Pasta with a rich meat sauce', 12.99, 'Main Course', false, 'https://www.slimmingeats.com/blog/wp-content/uploads/2010/04/spaghetti-bolognese-36-720x720.jpg');

-- Insert MenucardItems for 'Dessert Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Chocolate Cake', 'Decadent chocolate cake with frosting', 4.99, 'Dessert', true, 'https://hips.hearstapps.com/hmg-prod/images/chocolate-cake-index-64b83bce2df26.jpg?crop=0.6668359143606668xw:1xh;center,top&resize=1200:*'
       );

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Ice Cream Sundae', 'Vanilla ice cream with toppings', 3.99, 'Dessert', false, 'https://assets.rbl.ms/21919567/origin.jpg');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Cheesecake', 'Creamy cheesecake with graham cracker crust', 6.99, 'Dessert', false, 'https://sugarspunrun.com/wp-content/uploads/2019/01/Best-Cheesecake-Recipe-2-1-of-1-4-500x375.jpg');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Tiramisu', 'Italian dessert with coffee and mascarpone', 5.99, 'Dessert', false, 'https://tastesbetterfromscratch.com/wp-content/uploads/2017/04/Tiramisu-15-500x500.jpg');

-- Insert MenucardItems for 'Drinks Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Cappuccino', 'Espresso with steamed milk', 2.99, 'Drink', true, 'https://methodicalcoffee.com/cdn/shop/articles/cap.jpg?v=1684507364');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Lemonade', 'Freshly squeezed lemonade', 1.99, 'Drink', false, 'https://i2.wp.com/lmld.org/wp-content/uploads/2022/04/Lemonade-4.jpg');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Mojito', 'Rum, mint, lime, and soda water', 7.99, 'Drink', false, 'https://www.liquor.com/thmb/MJRVqf-itJGY90nwUOYGXnyG-HA=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/mojito-720x720-primary-6a57f80e200c412e9a77a1687f312ff7.jpg');