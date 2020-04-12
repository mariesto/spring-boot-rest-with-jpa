DROP TABLE IF EXISTS tour, tour_package;

CREATE TABLE tour(
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL,
    price INT NOT NULL,
    duration VARCHAR(250) NOT NULL,
    keywords VARCHAR(250) NOT NULL,
    difficulty VARCHAR(15) NOT NULL,
    region VARCHAR(25) NOT NULL
);

CREATE TABLE tour_package(
    code VARCHAR(250) PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

INSERT INTO tour(title, description, price, duration, keywords, difficulty, region) VALUES
    ('Big Sur Retreat', 'Big Sur is big country that takes you to the most majestic part of the Pacific Coast and show you secret trails and spectacular scenery.', 750, '3 days', 'Hiking, National Parks, Big Sur', 'Medium', 'Central Coast'),
    ('The Death Valley Survivors Trek', 'Need more of a challenge? Take this tour to the hottest place in North America: Death Valley. Due to extreme temperatures (120 degrees and higher) in the summer months, this tour is only offered November through April.', 250, '2 days', 'Valley, National Parks, Camping', 'Difficult', 'Northern California');

INSERT INTO tour_package(code, name) VALUES
    ('BC', 'Backpack Cal'),
    ('CC', 'California Calm'),
    ('DS', 'From Desert to Sea'),
    ('TC', 'Taste of California');