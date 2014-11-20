create index IX_8DE2271D on MS_MSMReceiver (userId);
create index IX_851064C8 on MS_MSMReceiver (userId, dateRecieved);

create index IX_111A32E9 on MS_MSMSender (messageId);
create index IX_24BFDB63 on MS_MSMSender (userId);
create index IX_3D32456D on MS_MSMSender (userId, dateSend);