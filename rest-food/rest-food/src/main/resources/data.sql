-- Delete existing data
DELETE FROM menucarditem;
DELETE FROM menucard;

-- Reset sequences
ALTER SEQUENCE menucard_id_seq RESTART WITH 1;
ALTER SEQUENCE menucarditem_id_seq RESTART WITH 1;

-- Insert Menucards
INSERT INTO Menucard (name) VALUES ('Breakfast Menu');
INSERT INTO Menucard (name) VALUES ('Lunch Menu');
INSERT INTO Menucard (name) VALUES ('Dinner Menu');
INSERT INTO Menucard (name) VALUES ('Dessert Menu');
INSERT INTO Menucard (name) VALUES ('Drinks Menu');

-- Insert MenucardItems for Breakfast Menu
INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Pancakes', 'Fluffy pancakes with syrup', 5.99, 'Main Course', true, 1);

INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Scrambled Eggs', 'Scrambled eggs with bacon', 4.99, 'Main Course', false, 1);

-- Insert MenucardItems for Lunch Menu
INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Chicken Sandwich', 'Grilled chicken sandwich with fries', 7.99, 'Main Course', true, 2);

INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Caesar Salad', 'Caesar salad with grilled chicken', 6.99, 'Salad', false, 2);

-- Insert MenucardItems for Dinner Menu
INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Steak', 'Grilled steak with mashed potatoes', 14.99, 'Main Course', true, 3);

INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Spaghetti Bolognese', 'Spaghetti with Bolognese sauce', 11.99, 'Main Course', false, 3);

-- Insert MenucardItems for Dessert Menu
INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Chocolate Cake', 'Rich chocolate cake', 4.99, 'Dessert', true, 4);

INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Ice Cream', 'Vanilla ice cream with chocolate sauce', 3.99, 'Dessert', false, 4);

-- Insert MenucardItems for Drinks Menu
INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Coffee', 'Freshly brewed coffee', 2.99, 'Drink', true, 5);

INSERT INTO MenucardItem (name, description, price, category, chefsChoice, menucard_id)
VALUES ('Orange Juice', 'Freshly squeezed orange juice', 3.49, 'Drink', false, 5);
