# Location Service

Description:<br />
  Location service allows end user to upload their locations and look up car locations.

Key Components:<br />
  Spring Data Rest: provides rest interface with paging and sorting<br />
  Rest Hal Browser: provides an user interface to manage rest service<br />
  Jackson: convert java object to/from JSON<br />
  H2 database: in-memory database<br />

REST API:<br />
  HTTP GET: http://localhost:8080/locations/search/findByServiceType{?type,page,size,sort}<br />
  HTTP GET: http://localhost:8080/locations/search/vin{?vin,page,size,sort}<br />
  HTTP POST: http://localhost:8080/fleet -> upload car locations<br />
    body: JSON file with car locations<br />
  HTTP POST: http://localhost:8080/purge -> delete all car locations<br />
    body: empty<br />

Data model:<br />
  Location<br />
    -id:Long<br />
    -unitInfo:UnitInfo<br />
    -unitFault:UnitFault<br />
    -latitude:double<br />
    -longitude:double<br />
    ...<br />
  PS. use the @Embedded and @AttributeOverride to map an object rather than many attributes to columns
