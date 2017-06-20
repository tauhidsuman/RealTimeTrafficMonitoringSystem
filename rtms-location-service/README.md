# Location Service

Description:
  Location service allows end user to upload their locations and look up car locations.

Key Components:

  Spring Data Rest: provides rest interface with paging and sorting
  Rest Hal Browser: provides an user interface to manage rest service
  Jackson: convert java object to/from JSON
  H2 database: in-memory database

REST API:
  HTTP GET: http://localhost:8080/locations/search/findByServiceType{?type,page,size,sort}
  HTTP GET: http://localhost:8080/locations/search/vin{?vin,page,size,sort}
  HTTP POST: http://localhost:8080/fleet -> upload car locations
    body: JSON file with car locations
  HTTP POST: http://localhost:8080/purge -> delete all car locations
    body: empty

Data model:
  Location
    -id:Long
    -unitInfo:UnitInfo
    -unitFault:UnitFault
    -latitude:double
    -longitude:double
    ...
  PS. use the @Embedded and @AttributeOverride to map an object rather than many attributes to columns 