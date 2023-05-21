## Music Streaming RestApi
### Frameworks and Language used:
* Spring
* Spring boot
* Java

### Data Flow
* Controller : 
  * In this Application am used 2 controller
    * UserController
    * AdminController
    
* Service
  * In this Application am used 3 Service
    * UserSerivce
    * AdminsService
    * MusicService
   
* Repository
  * In this Application am used 4 Repository
    * IMusicUserRepository
    * IAdminMusicRepository
    * IUserStatusRepository
    * IMusicRepository
* Database
  * I used Myslq Database In this Application.
 
* SwaggerLink 
  * http://16.171.40.158:8080/swagger-ui/index.html#/
* LinkedIn
  * https://www.linkedin.com/feed/update/urn:li:activity:7041841734976241664/


### Project Summery

* This project is a music streaming service API that allows two types of users: Normal and Admin users. Admin users have the authority to perform CRUD (Create, Read, Update, and Delete) operations on songs, while normal users can only add songs to their playlists and perform CRUD operations on their playlists.

* The API is built using MySQL database to store songs and user playlists, and its IP address of the deployment link must be static to ensure its availability. Additionally, the API uses annotation-based validation to ensure that all user inputs are valid before being processed.

* The project structure includes a controller service and a repository, providing a clear separation of concerns and making the code more modular. Furthermore.

* To ensure data security and user data privacy, normal users cannot create or do CRUD operations on songs, and only Admin users have the necessary permissions to perform these actions. This ensures that the API is both secure and user-friendly.

* Overall, this project provides a scalable and secure API for music streaming services that allows users to manage their playlists effectively while ensuring the safety of their data.

### Photos 
  * Swagger UI :
    * Admin Controller
    ![image](https://user-images.githubusercontent.com/98683881/225428387-0b0113e3-9ea6-4604-8b5f-e540dd53f639.png)
    
    * User Controller
    ![image](https://user-images.githubusercontent.com/98683881/225428941-28496812-de97-48a7-9e6f-820d425997d5.png)


