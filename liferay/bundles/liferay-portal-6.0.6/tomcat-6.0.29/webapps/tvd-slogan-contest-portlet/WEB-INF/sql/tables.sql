create table TVDSlogan_Slogan (
	uuid_ VARCHAR(75) null,
	sloganId BIGINT not null primary key,
	sloganDate DATE null,
	sloganText VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	companyId BIGINT,
	groupId BIGINT,
	userId BIGINT
) engine InnoDB;