--Author: Sandeep Pareek.
--Create schema for T_NOTE table

CREATE TABLE `T_NOTE` (
  `id` bigint(20) unsigned NOT NULL,
  `description` varchar(255) NOT NULL DEFAULT '',
  `header` varchar(255) NOT NULL DEFAULT '',
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;