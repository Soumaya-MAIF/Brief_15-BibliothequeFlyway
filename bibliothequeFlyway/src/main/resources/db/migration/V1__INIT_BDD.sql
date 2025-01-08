CREATE TABLE emprunteur(

    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255),
    email VARCHAR(255)

);

CREATE TABLE genre(

    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255)


);

CREATE TABLE livre(

    id INT AUTO_INCREMENT PRIMARY KEY,
    titre VARCHAR(255),
    auteur VARCHAR(255)

);


CREATE TABLE livre_genre(

    livre_id INT,
    genre_id INT ,
    FOREIGN KEY (livre_id) REFERENCES livre(id),
    FOREIGN KEY (genre_id) REFERENCES genre(id)

);

CREATE TABLE emprunt(

    livre_id INT,
    emprunteur_id INT ,
    FOREIGN KEY (livre_id) REFERENCES livre(id),
    FOREIGN KEY (emprunteur_id) REFERENCES emprunteur(id)

);