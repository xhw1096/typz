CREATE TABLE `t_xt_gnjs_oauth` (
  `ID` varchar(50) NOT NULL,
  `ROLE_ID` varchar(32) DEFAULT NULL,
  `CLIENT_ID` varchar(32) DEFAULT NULL,
  `ENABLED` int(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;