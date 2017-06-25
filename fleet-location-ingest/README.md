Location Ingest (message producer)

**Description:**

Location Ingest is a message producer. It revices the location information from 
Location Simulator based on REST API. Then, it build the message based on the location
information and send the message to the message channel.

**Key Components**
1.  RabbitMQ
2.  Spring Cloud

**REST API**

* POST positionInfo to /api/locations

**RabbitMQ**

You can inspect the messages being send to RabbitMQ using it Dashboard application:

	http://localhost:15672/ -> username: guest, password: guest

