# Overview

The Flashcard App is a simple, yet effective tool designed to help users create and manage their own flashcards for studying. 
The app is built using Kotlin and Android Studio, offering an intuitive user interface for managing flashcard sets. Users can 
create flashcards with questions and answers, which are saved locally for persistence.

This app is aimed at helping me practice Android app development in Kotlin while implementing core concepts like user interactivity 
and local storage.

How to Use the App

Open the app to see a list of your flashcard sets.
Click on "Create New Flashcard Set" to input a new question and answer.
The newly created flashcard set will appear on the main screen.
The flashcards are saved locally, so they will persist even when the app is closed.
Purpose for Creating the App

This app was created to improve my skills as a software engineer in the field of mobile development. By building this app, 
I gained hands-on experience in using Kotlin, managing data persistence with SharedPreferences, and creating an interactive 
user interface.


[Software Demo Video](https://ooo.mmhmm.app/watch/z_6Hw8Lf6xfVNfcl8Dvxkf)

# Development Environment

Tools Used:

Android Studio: This is the primary IDE for developing Android applications. It provides a rich environment for coding, 
debugging, and testing Android apps. Android Studio supports Kotlin, which is the primary language I used for this app.

Emulator: During development, I tested the app using the Android Emulator in Android Studio. The emulator mimics an 
Android device, allowing you to run and interact with your app without needing a physical device.

Git: I used Git for version control, keeping track of changes to my code over time and allowing me to collaborate 
with others if needed.

* Programming Language:

  * Kotlin: The primary language used for this app is Kotlin. Kotlin is the preferred language for Android development as it is 
  modern, concise, and fully interoperable with Java. It offers features like null safety, extension functions, and data classes, 
  which make the development process smoother and safer. Kotlin integrates seamlessly with Android Studio, making it an excellent 
  choice for mobile development.

* Libraries:

  * Android SDK: The Android Software Development Kit (SDK) is a collection of libraries, tools, and APIs required for Android development. 
  The SDK provides access to a range of Android features like UI components, networking, data storage, and more.

  * AndroidX Libraries: These are a set of support libraries provided by Google to ensure that Android applications work seamlessly across 
  different device versions and screen sizes. AndroidX libraries include components like RecyclerView, ConstraintLayout, and others that 
  make it easier to build modern Android UIs.

  *  SharedPreferences: SharedPreferences is a lightweight mechanism provided by Android to store key-value pairs of data. In this app, I used 
  SharedPreferences to store user-created flashcards so that their data persists even after the app is closed or the phone is turned off.

* UI Design:

  * XML Layouts: The user interface of the app was designed using XML (Extensible Markup Language). XML is used to define the structure and 
  layout of the app's screens. I used various UI components like EditText, Button, and GridView to create the interactive screens where users
  can enter data and view their flashcards.

  * Material Design: For the app’s styling, I used components from the Android Material Design library, which provides a set of design principles 
   and components for creating visually appealing and user-friendly mobile apps.

# Useful Websites

{Make a list of websites that you found helpful in this project}
* [Building an android app with kotlin]([https://medium.com/@atushar580/building-an-android-quiz-app-with-kotlin-a-step-by-step-guide-6361391eecad])
* [Kotlin Documentation]([http://url.link.goes.here](https://kotlinlang.org/docs/getting-started.html))

# Future Work

* Allow users to edit or delete flashcard sets.
* Implement flashcard quiz functionality.
* Enhance the UI with better design and animations.
* Optimize performance and error handling for larger datasets.
