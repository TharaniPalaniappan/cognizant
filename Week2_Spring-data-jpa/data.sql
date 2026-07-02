-- Create Country Table

CREATE TABLE IF NOT EXISTS country (
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(100)
);

-- Sample Data

INSERT INTO country VALUES ('IN','India');
INSERT INTO country VALUES ('US','United States');
INSERT INTO country VALUES ('GB','United Kingdom');
INSERT INTO country VALUES ('AU','Australia');
INSERT INTO country VALUES ('CA','Canada');
INSERT INTO country VALUES ('ZA','South Africa');
INSERT INTO country VALUES ('ZM','Zambia');
INSERT INTO country VALUES ('ZW','Zimbabwe');
INSERT INTO country VALUES ('LU','Luxembourg');
INSERT INTO country VALUES ('DJ','Djibouti');
INSERT INTO country VALUES ('BV','Bouvet Island');
INSERT INTO country VALUES ('GP','Guadeloupe');
INSERT INTO country VALUES ('GS','South Georgia and the South Sandwich Islands');
INSERT INTO country VALUES ('SS','South Sudan');
INSERT INTO country VALUES ('TF','French Southern Territories');
INSERT INTO country VALUES ('UM','United States Minor Outlying Islands');
