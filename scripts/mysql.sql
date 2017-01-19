--球队表
create table a8_team(
id bigint(20) unsigned not null AUTO_INCREMENT,
name varchar(64) default '',
shortName varchar(64) default '',
enName varchar(64) default '',
logo varchar(256) default '',
establishDate datetime default null,
coach varchar(64) default '',
`desc` text,
type tinyint(3) default 0,
webSite varchar(256) default '',
createTime datetime default now(),
state tinyint(3) default 0,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--球员表
create table `a8_player`(
`id` bigint(20) unsigned not null AUTO_INCREMENT,
`name` varchar(64) default '',
`shortName` varchar(64) default '',
`enName`  varchar(64) default '',
`country`  varchar(64) default '',
`birthDay`  datetime default null,
`avatar` varchar(256) default '',
`type`   tinyint(3) default 0,
`desc` text,
`CreateTime` datetime default now(),
`state`  tinyint(3) default 0,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


--联赛表
create table `a8_league`(
`id` bigint(20) unsigned not null AUTO_INCREMENT,
`name` varchar(64) default '',
logo varchar(256) default '',
`type`   tinyint(3) default 0,
`desc` text,
`CreateTime` datetime default now(),
`state`  tinyint(3) default 0,
PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;