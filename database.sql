START TRANSACTION;

DROP TABLE IF EXISTS 'personne';
CREATE TABLE IF NOT EXISTS 'personne' (
  'id' int(11) NOT NULL AUTO_INCREMENT,
  'nom' varchar(255) NOT NULL,
  'prenom' varchar(255) NOT NULL,
  'age' int(11) NOT NULL,
  PRIMARY KEY ('id')
) ENGINE=InnoDB AUTO_INCREMENT=1 ;

INSERT INTO 'personne' ('id', 'nom', 'prenom', 'age') VALUES
(1, 'Doe', 'John', 25),
(2, 'Doe', 'Jane', 23),
(3, 'Doe', 'Jack', 20),
(4, 'Doe', 'Jill', 18),
(5, 'Doe', 'Mike', 18),
(6, 'Doe', 'Adams', 18),
(7, 'Doe', 'Jack', 18),
(8, 'Doe', 'Jimmy', 18);

COMMIT;
