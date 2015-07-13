<h1> WHACK -  Grant Management System RESTFul API data access </h1>

Created by <b>Pas Apicella</b>

WHACK grants management system api's

<h2> Spring MVC Web UI </h2>

The uploaded code includes a Spring MVC web UI which simply shows the total number of grants and grantpayments at this stage. 
It's the default landing page of the application as follows

```
http://whack-grantsmanagement.mybluemix.net/
```

![alt tag](https://dl.dropboxusercontent.com/u/15829935/bluemix-docs/images/whack-1.png)

<h2> RESTful API calls </h2>

- View a single grant by GRANTID

```
curl http://whack-grantsmanagement.mybluemix.net/viewgrant?grantid=1
```

- View all GRANTS

```
curl http://whack-grantsmanagement.mybluemix.net/grants
```

- View payments for a GRANT by GRANTID

```
curl http://whack-grantsmanagement.mybluemix.net/viewpayments?grantid=2
```

<h2> Cloud Integration API's </h2>

The API's above have been added to a cloud integration service and visible in the Catalog as private API's within the Organization.

The following image shows how you can view Custom Api's such as those above in the catalog

![alt tag](https://dl.dropboxusercontent.com/u/15829935/bluemix-docs/images/whack-2.png)

Pas Apicella [pasapi at au1.ibm.com] is a Bluemix Technical Specialist at IBM Australia