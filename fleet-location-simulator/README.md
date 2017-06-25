Location Simulator

**Description:**
Location simulator is a car location generator. This generator will generate
various car location simulators based on the configuration file(fixture.json and directions.json).

**Key Components:**
1. google-maps-services: get coordinates according to the directions.json
2. multi-threading: each car location simulator instance is a thread and it will
keep updating location. Once location updated, it will sent to fleet-location-ingest
by using REST template
