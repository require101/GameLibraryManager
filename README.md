# GameLibraryManager
*Easier Planning for Better Gaming*

Official Design Docuemnt:
```sh
https://docs.google.com/document/d/1dQRY9pJxz25hqba-wcnSN5TplSxzZrK5cBl_xGRUkZI/edit?usp=sharing
```

## I. Introduction
The Game Library Manager application is a third-party enterprise-level system developed by three motivated students at the University of Cincinnati. The application allows users with an existing account on the Steam game client to organize their game library and keep track of their gaming progress. The user will be able to login to the application with their Steam credentials and import their game library into the application to be viewed in an organized fashion. From there, they will have the ability to perform three main functions: rate a game using a simple like/dislike mechanism, add additional detail to a game entry such as the number of playthroughs completed or the number of trophies earned, and mark a game from their library as complete. Thanks to our intricate database, even if users loGg out of the application, their manual changes to their game library will persist and reappear upon relogin. Our hope is to be able to take the data intrinsically collected by the Steam client and add more user-generated information to visually designate the user’s true gaming backlog. In doing so, gamers will no longer be left unsatisfied by completing games on Steam because they will have a centralized repository where they can manage their backlog size and continuously watch as their incomplete games list dwindles. The Game Library Manager features a minimalist and intuitive design that stresses simplicity and matches the style of Steam itself. 

## II. Storyboard
Our Storyboard can be accessed from  two locations, in two formats. We have also added mockup images of the key pages directly to this document.
##### Fluid UI
- https://www.fluidui.com/editor/live/preview/cF9tQkdUMFZtR2FXVHh1aXB5Zjllb01KN25tUERKVG5tUA==
##### PowerPoint
- https://drive.google.com/file/d/1AwX2YLZ1m8OqDTuf5WsFB4qHGcgdzjv7/view?usp=sharing

## III. Functional Requirements
In order for our application to be successful, it needs to satisfy the following requirements:

**1. As a User, I want to be able to see my library of games from Steam, so that I can rate them. For example:**
>Given I am a User, when I enter my steam ID, then my complete steam library is pulled into my profile.
>Given I am a User, when I enter an incorrect steam ID, then the UI properly reflects that no profile could be found.
>Given I am a User with no game(s) in my library, when I enter my steam ID, then the UI properly reflects that I have no games associated with my account.
>Given I am a User with game(s) in my library, when I rate them positively, then the game’s rating increases within my profile.
>Given I am a User with game(s) in my library, when I rate them negatively, then the game’s rating decreases within my profile.

**2. As a User, I want to be able to see my library of games from Steam, so that I can mark them as in-progress, complete**
>Given I am a User with game(s) in my library, when I mark the game as complete, then the UI should show the game in my completed list.
>Given I am a User with game(s) in my library, when I mark the game as in progress, then the UI should show the the game as in progress.

**3. As a User, I want to be able to see my library of games that are incomplete, so that I can play them.**
>Given I am a User with incomplete games, when I go to my game library and sort by incomplete, then I can see the incomplete games.

**4. As a User, I want to be able to select an individual game from the library, so that I can add additional information about my progress to it.**
>Given I am a User with game(s) in my library, when I select an individual game, then the UI should display a new screen where I can add the cost of the game.
>Given I am a User with game(s) in my library, when I select an individual game, then the UI should display a new screen where I can add the number of playthroughs I completed.
>Given I am a User with game(s) in my library, when I select an individual game, then the UI should display a new screen where I can add the % of side missions I completed.
>Given I am a User with game(s) in my library, when I select an individual game, then the UI should display a new screen where I can add the number of game endings I attained.

**5. As a User, I want to be able to select an individual game from the library, so that I can view specific details about it.**
>Given I am a User with game(s) in my library, when I select an individual game, then the UI should display a screen with existing and newly added details from the database.

**6. As a User, I want to be able to see any changes I made after I log out and log back in, so that I can continue organizing my game library from where I left off.**
>Given I am a User who has logged in, made edits to my library, and logged out, when I log back into the system, I should be able to see all of the changes I made in previous logins.

## IV. Scrumy.com Link
Below is the current version of our project plan. Using iterative development, and Agile methodology, we divide work into a series of Sprints focusing on a number of user stories and tasks. We will add more to this in the future as development progresses.
- https://scrumy.com/game-library-manager

## V. Scrum Roles
1. UI Specialist - **Hai Vu**
2. Business Logic and Persistence Specialist - **Samuel Curry**
3. Product Owner/Scrum Master/Github Administrator - **Yusuf Said**

## VI. Technical Requirements

* Firebase Project (```serviceAccount.json```)
* Steam API Key 

## VII. Installation
In the root folder of the directory, place the ```serviceAccount.json``` from firebase.

In ```/java/resources``` edit ```application.example.properties``` and rename it to ```application.properties```.

Place your steam API key in the ```steamAPIKey``` property in the ```application.properties```.

Build the project, and it should run on ```http://localhost:8080```.
