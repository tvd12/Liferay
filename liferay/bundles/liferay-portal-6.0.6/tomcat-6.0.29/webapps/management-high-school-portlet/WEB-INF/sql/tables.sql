create table TY_TYClass (
	classId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	classCode VARCHAR(75) null,
	classGroup INTEGER,
	className VARCHAR(75) null,
	modifiedDate DATE null,
	userId LONG
);

create table TY_TYClassStudent (
	courses INTEGER not null,
	studentId LONG not null,
	classId LONG,
	primary key (courses, studentId)
);

create table TY_TYClassUserRole (
	courses INTEGER not null,
	classId LONG not null,
	userId LONG not null,
	roleId LONG not null,
	status INTEGER,
	primary key (courses, classId, userId, roleId)
);

create table TY_TYSubjectClassUserRole (
	courses INTEGER not null,
	subjectId BIGINT not null,
	classId BIGINT not null,
	userId BIGINT not null,
	roleId BIGINT not null,
	status INTEGER,
	primary key (courses, subjectId, classId, userId, roleId)
) engine InnoDB;

create table TY_TYStudent (
	studentId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	studentLastName VARCHAR(75) null,
	studentFirstName VARCHAR(75) null,
	studentGroup1 INTEGER,
	studentGroup2 INTEGER,
	studentGroup3 INTEGER,
	male BOOLEAN,
	birthDay DATE null,
	emailAddress VARCHAR(75) null,
	emailPassword VARCHAR(75) null,
	address VARCHAR(75) null,
	fatherName VARCHAR(75) null,
	fatherPhone VARCHAR(75) null,
	motherName VARCHAR(75) null,
	motherPhone VARCHAR(75) null,
	studentCode VARCHAR(75) null,
	loginCount INTEGER,
	dateLogin DATE null,
	passwordEncrypt BOOLEAN,
	question VARCHAR(75) null,
	answer VARCHAR(75) null,
	regId VARCHAR(200) null
);

create table TY_TYSubject (
	subjectId BIGINT not null primary key,
	companyId BIGINT,
	groupId	BIGINT,
	subjectCode VARCHAR(75) null,
	subjectName VARCHAR(75) null,
	description VARCHAR(75) null
) engine InnoDB;

create table TY_TYSubjectUserRole (
	courses INT not null,
	subjectId BIGINT not null,
	userId BIGINT not null,
	roleId BIGINT not null,
	primary key (courses, groupId, subjectId, userId, roleId)
) engine InnoDB;

create table TY_TYStudentPoint (
   courses INT NOT NULL,
   semester INT NOT NULL,
   studentId BIGINT NOT NULL,
   subjectId BIGINT NOT NULL,
   pointType INT NOT NULL,
   pointIndex INT NOT NULL,
   pointFactor INT NOT NULL,
   point FLOAT NULL,
   modifiedDate DATETIME NULL,
   userId BIGINT NULL,
   primary key(courses, semester, studentId, subjectId, pointType, pointIndex, pointFactor)
) engine InnoDB;

create table TY_TYStudentPointReserve (
   courses INT NOT NULL,
   semester INT NOT NULL,
   studentId BIGINT NOT NULL,
   subjectId BIGINT NOT NULL,
   pointType INT NOT NULL,
   pointIndex INT NOT NULL,
   pointFactor INT NOT NULL,
   point FLOAT NULL,
   modifiedDate DATETIME NULL,
   userId BIGINT NULL,
   primary key(courses, semester, studentId, subjectId, pointType, pointIndex, pointFactor)
) engine InnoDB;

create table TY_TYStudentConduct (
   courses INT NOT NULL,
   semester INT NOT NULL,
   studentId BIGINT NOT NULL,
   conduct INT NOT NULL,
   modifiedDate DATETIME NULL,
   userId BIGINT NULL,
   primary key(courses, semester, studentId)
) engine InnoDB;

create table TY_TYTeacher (
	teacherId BIGINT NOT NULL,
	teacherDegree VARCHAR(30) NULL,
	teacherCertificate VARCHAR(30) NULL,
	userId BIGINT NULL,
	primary key(teacherId)
) engine InnoDB;


create table TY_TYPrioritySubject(
	courses INT NOT NULL,
	subjectId BIGINT NOT NULL,
	studentId BIGINT NOT NULL,
	isSpecial BOOLEAN NULL,
	extra INT NULL,
	primary key(courses, subjectId, studentId)
) engine InnoDB;

create table TY_Semester (
	companyId BIGINT NOT NULL,
	groupId BIGINT NOT NULL,
	semesterId INT NOT NULL,
	status INT NULL,
	primary key(companyId, groupId, semesterId)
) engine InnoDB;

create table TY_TYMessages (
	messageId BIGINT NOT NULL,
	companyId BIGINT NULL,
	groupId BIGINT NULL,
	actionId BIGINT NULL,
	userId BIGINT NULL,
	classId BIGINT NULL,
	subjectId BIGINT NULL,
	happenDate DATETIME NULL,
	primary key(messageId)
) engine InnoDB;