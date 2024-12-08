 Was making a robot game in java, and I needed to use an AI but most of them are paid.
 So I'm going to try to make a neural network totally free and I'm not interested in receiving recognition. 
 I put a creative commons license, I don't know if I have to do anything else. 
 In terms of name I had thought of Leibniz as the mathematician, but leibnix sounds more computer-oriented. 
 I do it in spring java maven api rest because that's what I know.
 I don't know if the spring java maven part is well done.
 I'm only interested in the neural network working well.
 The ds_store were added automatically because I use a mac, but they are of no use.


my java installed:


<img width="567" alt="Captura de pantalla 2024-12-07 a la(s) 21 57 18" src="https://github.com/user-attachments/assets/bde0b3dc-44de-48aa-8514-e8af4aba1014">


## How to run the application


As an IDE for java I use visual studio code


<img width="71" alt="Captura de pantalla 2024-12-07 a la(s) 22 25 37" src="https://github.com/user-attachments/assets/bf9eab6c-4857-4331-a1e7-d7f4ae120235">


How to run the application from Visual Studio
We must stand on the main class: LeibnixApplication

<img width="360" alt="Captura de pantalla 2024-12-07 a la(s) 22 20 35" src="https://github.com/user-attachments/assets/4608f56c-4556-492b-8f4d-fc27f8bda2de">


how to run with visual studio:


<img width="305" alt="Captura de pantalla 2024-12-07 a la(s) 22 17 34" src="https://github.com/user-attachments/assets/39de8ac9-1d11-473b-a65b-35b403b83838">


What is displayed in Visual Studio to know if the app works:

<img width="208" alt="Captura de pantalla 2024-12-07 a la(s) 22 19 19" src="https://github.com/user-attachments/assets/dd673b19-881c-49b8-8a3f-9d951025ee2c">


<img width="592" alt="Captura de pantalla 2024-12-07 a la(s) 22 19 08" src="https://github.com/user-attachments/assets/edd8f07f-e551-4057-a002-618b84ed6352">



How to run from terminal:


standing on the directory where the pom.xml is:


<img width="429" alt="Captura de pantalla 2024-12-07 a la(s) 22 42 45" src="https://github.com/user-attachments/assets/27c3fce6-7cd5-4717-abeb-b0723d4b372a">

Run the command:


 ```
mvn spring-boot:run
 ```


<img width="509" alt="Captura de pantalla 2024-12-07 a la(s) 22 42 15" src="https://github.com/user-attachments/assets/74e4b5cb-4053-4d61-b689-1ae15a1d5db2">


<img width="1024" alt="Captura de pantalla 2024-12-07 a la(s) 22 41 52" src="https://github.com/user-attachments/assets/d746dc04-f5e4-4e48-b241-536771312d51">


## Endpoints


Base url
 ```
localhost:8080
 ```

Ping: to know if the API is working.
 ```
GET /ping
 ```


Body response:
 ```
{
response: "pong"
}
 ```
