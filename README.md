# RealTimeTrafficMonitoringSystem
**All rights are reserved by original author or authors or ross**

**Service Start Sequence**
1. docker-compose up
2. sh ./start-eureka.sh
3. sh ./start-hystrix.sh
4. sh ./start-location-simulator.sh
5. sh ./start-location-ingest.sh
6. sh ./start-location-updater.sh
7. sh ./start-fleet-location-service.sh
8. go to fleet location service folder and run sh ./upload-fleet.sh
9. sh ./start-service-location-service.sh
10. go to to service location service folder and run sh ./upload-serviceLocations.sh
11. sh ./start-dashboard.sh

**User Interface**
1. Open Dashboard UI on http://localhost:8080
2. Open Simulator UI on http://localhost:9005
3. Click run simulation
4. Open Eureka UI on http://localhost:8761
5. Open RabbitMQ UI on http://localhost:15672

**Service Architecture**

![Alt text](https://raw.githubusercontent.com/Caden94/RealTimeTrafficMonitoringSystem/master/Architecture.png "System Architecture")
