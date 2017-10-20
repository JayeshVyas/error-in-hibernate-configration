# error-in-hibernate-configration
I am very new to Spring, Hibernate. while working on hibernate I am facing the following problem. I also searched related tags on stackoverflow, but couldn't found any relevant post that solved my issues.
 I got the following error while executing the AddStudent.java file.
 
 Name: Jayesh Vyas
Degree: B.tech Completed
Phone: 9421345678
log4j:WARN No appenders could be found for logger (org.hibernate.cfg.Environment).
log4j:WARN Please initialize the log4j system properly.
Exception in thread "main" org.hibernate.exception.GenericJDBCException: Cannot open connection
	at org.hibernate.exception.SQLStateConverter.handledNonSpecificException(SQLStateConverter.java:103)
	at org.hibernate.exception.SQLStateConverter.convert(SQLStateConverter.java:91)
	at org.hibernate.exception.JDBCExceptionHelper.convert(JDBCExceptionHelper.java:43)
	at org.hibernate.exception.JDBCExceptionHelper.convert(JDBCExceptionHelper.java:29)
	at org.hibernate.jdbc.ConnectionManager.openConnection(ConnectionManager.java:420)
	at org.hibernate.jdbc.ConnectionManager.getConnection(ConnectionManager.java:144)
	at org.hibernate.jdbc.JDBCContext.connection(JDBCContext.java:119)
	at org.hibernate.transaction.JDBCTransaction.begin(JDBCTransaction.java:57)
	at org.hibernate.impl.SessionImpl.beginTransaction(SessionImpl.java:1326)
	at hibernatepractise.AddStudent.main(AddStudent.java:42)
Caused by: java.sql.SQLException: NL Exception was generated
	at oracle.jdbc.driver.SQLStateMapping.newSQLException(SQLStateMapping.java:70)
	at oracle.jdbc.driver.DatabaseError.newSQLException(DatabaseError.java:133)
	at oracle.jdbc.driver.DatabaseError.throwSqlException(DatabaseError.java:199)
	at oracle.jdbc.driver.DatabaseError.throwSqlException(DatabaseError.java:480)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:413)
	at oracle.jdbc.driver.PhysicalConnection.<init>(PhysicalConnection.java:508)
	at oracle.jdbc.driver.T4CConnection.<init>(T4CConnection.java:203)
	at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:33)
	at oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:510)
	at java.sql.DriverManager.getConnection(Unknown Source)
	at java.sql.DriverManager.getConnection(Unknown Source)
	at org.hibernate.connection.DriverManagerConnectionProvider.getConnection(DriverManagerConnectionProvider.java:110)
	at org.hibernate.jdbc.ConnectionManager.openConnection(ConnectionManager.java:417)
	... 5 more
Caused by: oracle.net.ns.NetException: NL Exception was generated
	at oracle.net.resolver.AddrResolution.resolveAddrTree(AddrResolution.java:613)
	at oracle.net.resolver.AddrResolution.resolveAndExecute(AddrResolution.java:403)
	at oracle.net.ns.NSProtocol.establishConnection(NSProtocol.java:630)
	at oracle.net.ns.NSProtocol.connect(NSProtocol.java:206)
	at oracle.jdbc.driver.T4CConnection.connect(T4CConnection.java:966)
	at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:292)
	... 13 more
