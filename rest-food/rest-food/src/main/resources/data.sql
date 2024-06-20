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
VALUES ('Pancakes', 'Fluffy pancakes served with syrup', 5.99, 'Main Course', true, 'https://unsplash.com/photos/6VhPY27jdps');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Omelette', 'Three-egg omelette with cheese and ham', 6.99, 'Main Course', false, 'https://unsplash.com/photos/EwKXn5CapA4');

-- Insert MenucardItems for 'Lunch Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Caesar Salad', 'Fresh romaine with Caesar dressing', 7.99, 'Salad', true, 'https://unsplash.com/photos/Ov5_8aKp88c');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Grilled Chicken Sandwich', 'Grilled chicken breast on a bun', 8.99, 'Sandwich', false, 'https://unsplash.com/photos/ACniUW6FfJ8');

-- Insert MenucardItems for 'Dinner Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Steak', 'Grilled ribeye steak with garlic butter', 15.99, 'Main Course', true, 'https://unsplash.com/photos/cXyCa2TL9B8');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Spaghetti Bolognese', 'Pasta with a rich meat sauce', 12.99, 'Main Course', false, 'https://unsplash.com/photos/GFKPATimbvM');

-- Insert MenucardItems for 'Dessert Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Chocolate Cake', 'Decadent chocolate cake with frosting', 4.99, 'Dessert', true, 'https://unsplash.com/photos/_B2JK1NprqE');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Ice Cream Sundae', 'Vanilla ice cream with toppings', 3.99, 'Dessert', false, 'https://unsplash.com/photos/8y2wZ7aVvsg');

-- Insert MenucardItems for 'Drinks Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Cappuccino', 'Espresso with steamed milk', 2.99, 'Drink', true, 'https://unsplash.com/photos/pGM4sjt_BdQ');

INSERT INTO menucard_item (name, description, price, category, chefs_choice, image)
VALUES ('Lemonade', 'Freshly squeezed lemonade', 1.99, 'Drink', false, 'https://unsplash.com/photos/Rf3-eUED8ow');
