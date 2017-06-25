Location Updater (message consumer)

**Description:**

Location Updater is message consumer. It recieves message from the message channel and 
update the location information within the database. Meanwhile, it pushs the location 
to the front end for real-time monitoring.

**Key Components**
1.  Web Socket
2.  RabbitMQ
3.  Spring Cloud
4.  Jackson: Object Mapper Bean is used to convert Json String to the Object.
5.  Stomp: provide a STOMP client for web browser

**RabbitMQ**

You can inspect the messages being send from RabbitMQ using it Dashboard application:

	http://localhost:15672/ -> username: guest, password: guest

