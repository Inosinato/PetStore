https://petstore3.swagger.io/#/

Solution implemented:
The solution was implemented using a combination of Java, Cucumber, Serenity and testNG, also used libraries like Lombok and Jackson to have more flexibility using a builder pattern for the body of requests.

Test cases list
User
POST
/user - Create user


Verify create a single user with all params
Verify create a single user with empty params
Verify create single user with empty username 
Verify create single user with empty id
Verify create single user with empty email
Verify create single user with empty password


POST
/user/createWithList - Creates list of users with given input array

Verify create a list of users with all params in list
Verify create a list of users with empty list
Verify create a list of users with the 100 user object


GET
/user/login - Logs user into the system

Verify user can login to the system
Verify user cannot login with correct username but incorrect password
Verify user cannot login with incorrect username but correct password
Verify user cannot login with incorrect username and incorrect password
Verify user cannot login with empty username and empty password

GET
/user/logout - Logs out current logged in user session

Verify user can logout



GET
/user/{username} - Get user by user name

Verify user can be fetch by username
Verify user cannot be fetch with non existing username
Verify user cannot be fetch with invalid username


PUT
/user/{username} - Update user

Verify user information can be updated
Verify id cannot be updated for user
Verify update endpoint with invalid username

DELETE
/user/{username} - Delete user

Verify delete endpoint with valid username
Verify delete endpoint with invalid username

Pet

PUT
/pet - Update an existing pet - (missing petId param in swagger)

Verify pet information can be updated


POST
/pet - Add a new pet to the store

Verify a new pet can be added with all information
Verify a new pet can be added without required fields
Verify a new pet cannot be added without required fields

GET
/pet/findByStatus - Finds Pets by status

Verify retrieve pets by using one status
Verify retrieve pets by using more than one status
Verify retrieve pets with invalid status



GET
/pet/findByTags - Finds Pets by tags

Verify retrieve pets by using one tag
Verify retrieve pets by using more than one tag
Verify retrieve pets with invalid tag



GET
/pet/{petId} - Find pet by ID

Verify retrieve pet information with valid id
Verify retrieve pet information with non existing id


POST
/pet/{petId} - Updates a pet in the store with form data

Verify a pet name can be modified with valid id
Verify a pet status can be modified with valid id
Verify a pet name and status can be modified with valid id
Verify a pet name cannot be modified with invalid id


DELETE
/pet/{petId} - Deletes a pet

Verify a pet can be deleted with valid id
Verify a pet cannot be deleted with invalid id


POST
/pet/{petId}/uploadImage - uploads an image

Verify a pet image can be added with valid id
Verify a pet image cannot be added for invalid id

Store

GET
/store/inventory - Returns pet inventories by status

Verify retrieval of inventory



POST
/store/order - Place an order for a pet

Verify an order can be placed in with all required params
Verify an order cannot be placed in with missing required params
Verify an order cannot be placed in with missing empty body

GET
/store/order/{orderId} - Find purchase order by ID

Verify an order can be retrieved using valid orderId
Verify an order cannot be retrieved using an invalid orderId


DELETE
/store/order/{orderId} - Delete purchase order by ID

Verify an order can be deleted using a valid orderId
Verify an order cannot be deleted using an invalid orderId


