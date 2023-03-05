# chatgpt-whisper-spring-boot
A demo app to show how to integrate ChatGPT and Whisper API into Spring Boot Microservice.  Please check out my Medium article for details. Link to come.

### API Key
Be sure to add your OpenAI API Key to application.yml, replace the existing placeholder on line 7 "################" with your API key.

### Run the app
You can run the app by executing command:
```
mvn spring-boot:run
```

### How to access the running app?
Use Postman, you can launch the app by navigating to these two endpoints:
* localhost:8500/api/v1/chat
* localhost:8500/api/v1/transcription
