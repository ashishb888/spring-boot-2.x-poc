# Ask Github sample project

With the server running, the interactive API documentation will be available at http://localhost:8080/swagger-ui.html

# Assignment

The task is to make the supplied code work - the supplied code being a local endpoint, that will talk to GitHub to get user favorites.

This assignment should be considered time-slotted. You should try to get as far as possible within approximately three hours.

**This task is intended to be challenging - only top programmers are expected to finish all parts of this assignment in 3 hours, while writing production-grade code!**

The assignment will test:

1. Your Java skills
2. Your ability to use and provide APIs
3. Your ability to use the SpringBoot framework

Your solution will be evaluated based on the quality of the produced code, as much as the finished result. 

Aim towards producing production grade code, rather than maximising the amount of features.

A few hints as to what we consider production grade code:

* Thoughtful application of 3rd party libraries
* Considering separation of concerns
* Error handling
* Usage of SpringBoot built in features
* Applying sensible naming
* Formatting code for readability

## The goal

Start the server with `./gradlew bootrun`, then the behavior should be the following. 
The username `"bob"` here is just a placeholder, the endpoint should work for any github user.

``` shell-interaction
curl --silent -X GET "http://localhost:8080/favorites/bob" | jq

{
  "username": "bob",
  "favorites": [
    "excid3/jumpstart",
    "xotahal/react-native-material-ui"
  ]
}                                                                                                                                                                
``` 

The list of favorites should be built from the API response of https://api.github.com/users/bob/starred. 
