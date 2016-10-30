#Development Manual for TicTacToe

##Please follow these steps to be able to run the TicTacToe: <br />

###1. Create GitHub Account
If you don't have a GitHub account already you'll have to create one before you start since all our code is stored at GitHub. You can create an account here --> https://www.github.com/join?source=header-home.


###2. Setup the Ubuntu Server <br />
If you don't have the Ubuntu Server setup already please start by following this Ubuntu Setup Manual: 
[Setup directions](https://github.com/KontrolAltDelete/TicTacToe/blob/Documentation/docs/pdfs/2016-advania-setup.pdf)
. <br />

###3. Clone repository to your Ubuntu user account <br />
Sign in to the Ubuntu Server as the user you created with the command __ssh your_username@82.221.48.15__.<br />

After you have signed in you can clone the repository from git at the root of the Server.
To clone the repository you use the command __git clone https://github.com/KontrolAltDelete/TicTacToe.git__. <br /> <br />

##Other informations <br />
We are currently running our tests through Travis CI and have connected Travis CI and GitHub. You can find our Travis CI repository under the link: https://travis-ci.org/KontrolAltDelete/TicTacToe. <br />
Travis runs all code commited to our GitHub repository and checks it for errors.<br />
You should be able to sign in to Travis CI with your GitHub account.<br />

###To build project <br />
We have already done all settings needed for the build with gradle in the Ubuntu server so all you need to do to build the code is to write __./gradlew build__ in your command line. Then the project will build and tell you if the build was succsesfull or not. <br />
If you are not building the project from the Ubuntu server then you can still use the command __./gradlew build__ to build the project. If your computer doesn't contain gradle the wrapper will automaticly download it when you do the command.<br />

##Congratulations! Now you can start to code the project with us :smile:! <br />


