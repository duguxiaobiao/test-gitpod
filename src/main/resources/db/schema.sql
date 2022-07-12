CREATE DATABASE IF NOT EXISTS test_gitpod;

ALTER DATABASE test_gitpod
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

USE test_gitpod;

CREATE TABLE IF NOT EXISTS `t_user` (
    `id` int(11) NOT NULL,
    `name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
