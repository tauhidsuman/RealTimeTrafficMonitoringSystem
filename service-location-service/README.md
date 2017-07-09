
Service Location Service

p.s The system shows car locations and car service locations.

**Description:**

  Service Location Service allows service station to upload their locations and end user to look up service locations


**Key Components:**

1. Spring Data Rest: provides rest interface with paging and sorting
2. Rest Hal Browser: provides an user interface to manage rest service
3. Jackson: convert java object to/from JSON
4. MongoDB database


**REST API:**
* HTTP GET: http://localhost:9001/serviceLocations{?page,size,sort}
* HTTP GET: http://localhost:9001/serviceLocations/search/findFirstByLocationNear{?location}
* HTTP POST: http://localhost:9001/bulk/serviceLocations
`upload service locations request body: JSON file with service locations`
* HTTP POST: http://localhost:9001/purge -> delete all service locations

**Data model:**
