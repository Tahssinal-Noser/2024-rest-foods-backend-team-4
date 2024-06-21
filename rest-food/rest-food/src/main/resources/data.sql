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
VALUES ('Pancakes', 'Fluffy pancakes served with syrup', 5.99, 'Main Course', true, 'https://images.unsplash.com/photo-1612182062633-9ff3b3598e96?q=80&w=2038&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Omelette', 'Three-egg omelette with cheese and ham', 6.99, 'Main Course', false, 'https://media1.tenor.com/m/9KRGW5zVtfsAAAAC/tahalka-omlet-omlet.gif');

-- Insert MenucardItems for 'Lunch Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Caesar Salad', 'Fresh romaine with Caesar dressing', 7.99, 'Salad', true, 'https://media1.tenor.com/m/dMGqNRgjioUAAAAC/veggie-love-foods.gif');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Grilled Chicken Sandwich', 'Grilled chicken breast on a bun', 8.99, 'Sandwich', false, 'https://media1.tenor.com/m/I9ZKdi0J3twAAAAd/doo-doo-doo.gif');

-- Insert MenucardItems for 'Dinner Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Steak', 'Grilled ribeye steak with garlic butter', 15.99, 'Main Course', true, 'https://media.tenor.com/f9Ek6QJFnrkAAAAM/parse-black.gif');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Spaghetti Bolognese', 'Pasta with a rich meat sauce', 12.99, 'Main Course', false, 'https://media1.tenor.com/m/r8OwOwPbI04AAAAd/tik-tok-tiktok.gif');

-- Insert MenucardItems for 'Dessert Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Chocolate Cake', 'Decadent chocolate cake with frosting', 4.99, 'Dessert', true, 'https://media1.tenor.com/m/2RXF7Z9kI3EAAAAC/pumpkin-scream.gif'
       );

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Ice Cream Sundae', 'Vanilla ice cream with toppings', 3.99, 'Dessert', false, 'https://unsplash.com/photos/8y2wZ7aVvsg');

-- Insert MenucardItems for 'Drinks Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Cappuccino', 'Espresso with steamed milk', 2.99, 'Drink', true, 'https://media.tenor.com/3ZBd-Plw7UUAAAAM/thug-shake-thug-shaker.gif');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Lemonade', 'Freshly squeezed lemonade', 1.99, 'Drink', false, 'https://media1.tenor.com/m/AdYGusMX2esAAAAC/welcome.gif');