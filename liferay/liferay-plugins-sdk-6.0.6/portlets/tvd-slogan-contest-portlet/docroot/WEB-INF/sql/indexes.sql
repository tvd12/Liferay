create index IX_D8443F25 on TVDSlogan_Slogan (companyId);
create index IX_4BAC4AE7 on TVDSlogan_Slogan (groupId);
create index IX_F9C0B2CD on TVDSlogan_Slogan (groupId, status);
create index IX_614C5082 on TVDSlogan_Slogan (sloganText);
create index IX_C3556B31 on TVDSlogan_Slogan (uuid_);
create unique index IX_43271099 on TVDSlogan_Slogan (uuid_, groupId);