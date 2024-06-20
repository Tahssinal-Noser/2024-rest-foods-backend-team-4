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
INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Pancakes', 'Fluffy pancakes served with syrup', 5.99, 'Main Course', true);

INSERT INTO menucard_Item (name, description, price, category, chefs_choice)
VALUES ('Omelette', 'Three-egg omelette with cheese and ham', 6.99, 'Main Course', false);

-- Insert MenucardItems for 'Lunch Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Caesar Salad', 'Fresh romaine with Caesar dressing', 7.99, 'Salad', true);

INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Grilled Chicken Sandwich', 'Grilled chicken breast on a bun', 8.99, 'Sandwich', false);

-- Insert MenucardItems for 'Dinner Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Steak', 'Grilled ribeye steak with garlic butter', 15.99, 'Main Course', true);

INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Spaghetti Bolognese', 'Pasta with a rich meat sauce', 12.99, 'Main Course', false);

-- Insert MenucardItems for 'Dessert Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Chocolate Cake', 'Decadent chocolate cake with frosting', 4.99, 'Dessert', true);

INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Ice Cream Sundae', 'Vanilla ice cream with toppings', 3.99, 'Dessert', false);

-- Insert MenucardItems for 'Drinks Menu'
INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Cappuccino', 'Espresso with steamed milk', 2.99, 'Drink', true);

INSERT INTO menucard_item (name, description, price, category, chefs_choice)
VALUES ('Lemonade', 'Freshly squeezed lemonade', 1.99, 'Drink', false);

