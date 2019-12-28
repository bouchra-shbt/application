-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- 
Client :  127.0.0.1
-- Généré le :  Jeu 14 Décembre 2017 à 14:30
-- 
Version du serveur :  5.6.15-log
-- 
Version de PHP :  5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";

SET time_zone = "+00:00";



/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;

/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;

/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;

/*!40101 SET NAMES utf8 */;


--
-- Base de données :  `reservation`
--

-- --------------------------------------------------------

--
-- 
Structure de la table `chambre`
--

CREATE TABLE IF NOT EXISTS `salle` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `n_chambre` varchar(20) NOT NULL,
  `dispo` varchar(20) 
NOT NULL,
  PRIMARY KEY (`id`)
) 
ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=17 ;


--
-- Contenu de la table `chambre`
--

INSERT INTO `salle` (`id`, `n_chambre`, `dispo`) VALUES
(1, 'S01', 'nondisponible'),

(2, 'S02', 'nondisponible'),
(3, 'S03', 'disponible'),
(4, 'S04', 'nondisponible'),
(5, 'S05', 'disponible');


-- --------------------------------------------------------

--
-- 
Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `salle` varchar(50) NOT NULL,
  
PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `nom`, `salle`) 
VALUES
(1, 'fatima', 'S03'),
(2, 'WAFAA', 'S02'),
(3, 'kacem', 'S05'),
(4, 'hakim', 'S03'),
(5, 'hichem', 'S01'),
(6, 'kacim', 'S02'),
(7, 'racim', 'S01');


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */
;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
