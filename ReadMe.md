Start the DB first using below command.

C:\Users\blokesh\Documents\postgresql-12.0-1-windows-x64-binaries\pgsql\bin>pg_ctl -D ^"c^:^\Users^\blokesh^\postgressdatablokesh^" start

Then start the application.


mvn spring-boot:run

your application will be started on port 8080. you can make calls to api using http://localhost:8080/api/contacts
