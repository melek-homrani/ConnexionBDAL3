START TRANSACTION;

DROP TABLE IF EXISTS personne;
CREATE TABLE IF NOT EXISTS personne
(
    id     int(11)      NOT NULL AUTO_INCREMENT,
    nom    varchar(255) NOT NULL,
    prenom varchar(255) NOT NULL,
    age    int(11)      NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1;

INSERT INTO personne (id, nom, prenom, age)
VALUES (1, 'Doe', 'John', 25),
       (2, 'Doe', 'Jane', 23),
       (3, 'Doe', 'Jack', 20),
       (4, 'Doe', 'Jill', 18),
       (5, 'Doe', 'Mike', 18),
       (6, 'Doe', 'Adams', 18),
       (7, 'Doe', 'Jack', 18),
       (8, 'Doe', 'Jimmy', 18);

DROP TABLE IF EXISTS utilisateur;
CREATE TABLE IF NOT EXISTS utilisateur
(
    id             int(11)      NOT NULL AUTO_INCREMENT,
    nom            varchar(255) NOT NULL,
    prenom         varchar(255) NOT NULL,
    age            int(11)      NOT NULL,
    nomUtilisateur varchar(255) NOT NULL,
    email          varchar(255) NOT NULL,
    motDePasse     varchar(255) NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1;

INSERT INTO utilisateur (id, nom, prenom, age, nomUtilisateur, email, motDePasse)
VALUES (1, 'Doe', 'John', 25, 'johndoe', 'johndoe@esprit.tn', 'johndoe');

DROP TABLE IF EXISTS formation;
CREATE TABLE IF NOT EXISTS formation
(
    id          int(11)      NOT NULL AUTO_INCREMENT,
    sujet       varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    difficulte  varchar(255) NOT NULL,
    duree       int(11)      NOT NULL,
    idCategorie int(11)      NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1;

INSERT INTO formation (id, sujet, description, difficulte, duree, idCategorie)
values ('1', 'PHP', 'PHP est un langage de programmation libre, principalement utilisé pour produire des pages Web dynamiques via un serveur HTTP, mais pouvant également fonctionner comme nimporte quel langage interprété de façon locale.', 'Facile', '20', '1'),
       ('2', 'JAVA', 'Java est un langage de programmation orienté objet créé par James Gosling et Patrick Naughton, employés de Sun Microsystems, avec le soutien de Bill Joy (cofondateur de Sun Microsystems en 1982), présenté officiellement le 23 mai 1995 au SunWorld.', 'Moyen', '30', '1'),
       ('3', 'C++', 'Le C++ est un langage de programmation compilé permettant la programmation sous de multiples paradigmes (comme la programmation procédurale, la programmation orientée objet ou la programmation générique).', 'Difficile', '40', '1'),
       ('4', 'HTML', 'HTML, sigle de HyperText Markup Language, est le format de données conçu pour représenter les pages web.', 'Facile', '20', '2'),
       ('5', 'CSS', 'Les feuilles de style en cascade, généralement appelées CSS de langlais Cascading Style Sheets, forment un langage informatique qui décrit la présentation des documents HTML et XML.', 'Moyen', '30', '2'),
       ('6', 'JavaScript', 'JavaScript est un langage de programmation de scripts principalement employé dans les pages web interactives mais aussi coté serveur.', 'Difficile', '40', '2'),
       ('7', 'MySQL', 'MySQL est un système de gestion de bases de données relationnelles (SGBDR).', 'Facile', '20', '3'),
       ('8', 'Oracle', 'Oracle est un système de gestion de base de données relationnelle (SGBDR) qui depuis les années 2000 sest imposé comme un outil incontournable dans le monde professionnel.', 'Moyen', '30', '3'),
       ('9', 'SQL Server', 'Microsoft SQL Server est un système de gestion de base de données (SGBD) en langage SQL incorporant entre autres un SGBDR (SGBD relationnel ») développé et commercialisé par la société Microsoft.', 'Difficile', '40', '3');

DROP TABLE IF EXISTS categorie;
CREATE TABLE IF NOT EXISTS categorie
(
    id          int(11)      NOT NULL AUTO_INCREMENT,
    nom         varchar(255) NOT NULL,
    description varchar(255) NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1;

INSERT INTO categorie (id, nom, description)
VALUES (1, 'Langage de programmation', 'Un langage de programmation est un langage formel conçu pour formuler des algorithmes et produire des programmes informatiques qui les appliquent.'),
       (2, 'Langage de balisage', 'Un langage de balisage est un langage informatique utilisé pour lécriture de documents comportant des balises, cest-à-dire des portions de texte encadrées par des chevrons ouvrants et fermants < et >.'),
       (3, 'Système de gestion de base de données', 'Un système de gestion de base de données (abr. SGBD) est un logiciel système destiné à stocker et à partager des informations dans une base de données, en garantissant la qualité, la pérennité et la confidentialité des informations, tout en cachant la complexité des opérations.');
COMMIT;
