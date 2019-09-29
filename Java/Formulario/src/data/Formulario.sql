-- --------------------------------------------------------
-- Servidor:                     localhost
-- Versão do servidor:           5.7.24 - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para formulario
CREATE DATABASE IF NOT EXISTS `formulario` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `formulario`;

-- Copiando estrutura para tabela formulario.tb_endereco
CREATE TABLE IF NOT EXISTS `tb_endereco` (
  `id_endereco` int(11) NOT NULL AUTO_INCREMENT,
  `en_rua` varchar(50) NOT NULL DEFAULT '0',
  `en_bairro` varchar(15) NOT NULL DEFAULT '0',
  `en_cidade` varchar(15) NOT NULL DEFAULT '0',
  `en_uf` char(4) DEFAULT NULL,
  `en_cep` char(9) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_endereco`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela formulario.tb_pessoa
CREATE TABLE IF NOT EXISTS `tb_pessoa` (
  `id_pessoa` int(11) NOT NULL AUTO_INCREMENT,
  `ps_nome` varchar(50) DEFAULT NULL,
  `ps_dtnasc` char(10) DEFAULT NULL,
  `id_endereco` int(11) DEFAULT NULL,
  `id_rg` int(11) DEFAULT NULL,
  `ps_fres` varchar(50) DEFAULT NULL,
  `ps_fcel` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_pessoa`),
  UNIQUE KEY `id_endereco` (`id_endereco`),
  UNIQUE KEY `id_rg` (`id_rg`),
  CONSTRAINT `FK_tb_pessoa_tb_endereco` FOREIGN KEY (`id_endereco`) REFERENCES `tb_endereco` (`id_endereco`),
  CONSTRAINT `FK_tb_pessoa_tb_rg` FOREIGN KEY (`id_rg`) REFERENCES `tb_rg` (`id_rg`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela formulario.tb_rg
CREATE TABLE IF NOT EXISTS `tb_rg` (
  `id_rg` int(11) NOT NULL AUTO_INCREMENT,
  `rg_numero` double DEFAULT NULL,
  `rg_npai` varchar(50) DEFAULT NULL,
  `rg_nmae` varchar(50) DEFAULT NULL,
  `rg_dtexp` char(10) DEFAULT NULL,
  `rg_oem` char(5) DEFAULT NULL,
  PRIMARY KEY (`id_rg`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
