create index IX_6A5D9A9A on TY_Semester (companyId, groupId);
create index IX_A18C9F80 on TY_Semester (companyId, groupId, status);

create index IX_7BCE3182 on TY_TYClass (classId, groupId, companyId);
create index IX_B9F77C1 on TY_TYClass (companyId, groupId);
create index IX_883F6AB7 on TY_TYClass (companyId, groupId, classGroup, className);

create index IX_AF0BAE43 on TY_TYClassStudent (courses, classId);
create index IX_E6139E06 on TY_TYClassStudent (courses, studentId);

create index IX_52B434BB on TY_TYClassUserRole (courses, classId);
create index IX_BCF8E920 on TY_TYClassUserRole (courses, classId, roleId);
create index IX_4D4D7107 on TY_TYClassUserRole (courses, userId, roleId);

create index IX_E125C0F3 on TY_TYMessages (companyId, groupId);

create index IX_16389004 on TY_TYStudent (companyId, groupId);
create index IX_32F135B0 on TY_TYStudent (companyId, groupId, emailAddress);
create index IX_49385158 on TY_TYStudent (companyId, groupId, studentFirstName);
create index IX_34E8A574 on TY_TYStudent (companyId, groupId, studentFirstName, studentLastName);
create index IX_2DA25899 on TY_TYStudent (companyId, groupId, studentGroup1);
create index IX_2DA25C5A on TY_TYStudent (companyId, groupId, studentGroup2);
create index IX_2DA2601B on TY_TYStudent (companyId, groupId, studentGroup3);
create index IX_6EB01448 on TY_TYStudent (companyId, groupId, studentLastName);

create index IX_BEAA7D80 on TY_TYStudentConduct (courses, semester, studentId);

create index IX_A0D191A0 on TY_TYStudentPoint (courses, semester, studentId, subjectId, pointType, pointFactor);
create index IX_E83EB4CA on TY_TYStudentPoint (courses, semester, studentId, subjectId, pointType, pointIndex, pointFactor);

create index IX_BA6B136C on TY_TYStudentPointReserve (courses, semester, studentId, subjectId, pointType, pointFactor);
create index IX_7B07E496 on TY_TYStudentPointReserve (courses, semester, studentId, subjectId, pointType, pointIndex, pointFactor);

create index IX_FD0C2835 on TY_TYSubject (companyId, groupId);
create index IX_27162D14 on TY_TYSubject (companyId, groupId, subjectCode);
create index IX_391A4A32 on TY_TYSubject (companyId, groupId, subjectName);

create index IX_475FDAA0 on TY_TYSubjectClassUserRole (courses, subjectId, userId, roleId);
create index IX_5661E635 on TY_TYSubjectClassUserRole (courses, userId, roleId);

create index IX_922A5563 on TY_TYSubjectUserRole (courses, subjectId);
create index IX_137E1C8 on TY_TYSubjectUserRole (courses, subjectId, roleId);
create index IX_DE7E1D13 on TY_TYSubjectUserRole (courses, userId, roleId);

create index IX_80F22A3 on TY_TYTeacher (userId);