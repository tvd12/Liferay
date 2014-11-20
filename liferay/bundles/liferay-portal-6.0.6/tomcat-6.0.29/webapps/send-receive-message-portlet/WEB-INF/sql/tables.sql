create table MS_MSMReceiver (
	userId LONG not null,
	messageId LONG not null,
	dateRecieved DATE null,
	msStatus BOOLEAN,
	primary key (userId, messageId)
);

create table MS_MSMSender (
	userId LONG not null,
	messageId LONG not null,
	dateSend DATE null,
	primary key (userId, messageId)
);

create table MS_MSMessage (
	messageId LONG not null primary key,
	message VARCHAR(75) null,
	dateCreated DATE null,
	msStatus BOOLEAN null
);