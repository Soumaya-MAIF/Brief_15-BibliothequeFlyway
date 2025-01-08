INSERT INTO genre (nom) VALUES ('Science Fiction'),('Fantasy'),('Mystery');

INSERT INTO livre (titre, auteur) VALUES ('Dune', 'Frank Herbert'),('The Hobbit', 'J.R.R. Tolkien'),('Sherlock Holmes', 'Arthur Conan Doyle');

INSERT INTO emprunteur (nom, email) VALUES ('Alice Dupont', 'alice.dupont@example.com'),('Bob Martin', 'bob.martin@example.com'),('Charlie Durand', 'charlie.durand@example.com');

INSERT INTO emprunt (livre_id, emprunteur_id) VALUES (1, 1),(2, 2),(3, 3);