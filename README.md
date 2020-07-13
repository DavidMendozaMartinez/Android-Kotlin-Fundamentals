# Android Kotlin Fundamentals

Android Kotlin Fundamentals course.

## Description

The Android Kotlin Fundamentals course was created by the Google Developers Training team. In the course, you learn Android Kotlin programming concepts and build a variety of apps.

The Android Kotlin Fundamentals course materials include:

* [Course codelabs](https://developer.android.com/courses/kotlin-android-fundamentals/toc)
* [Starter apps](https://github.com/google-developer-training/android-kotlin-fundamentals-starter-apps) and [solution code](https://github.com/google-developer-training/android-kotlin-fundamentals-apps) in GitHub for apps that you create in the codelabs

You can find more information [here](https://developer.android.com/courses/kotlin-android-fundamentals/overview).

## Prerequisites

This course assumes that you know (or can quickly learn) the Kotlin programming language. To take the Android Kotlin Fundamentals course, we recommend that you have at least two years of experience in a full-fledged object-oriented programming language such as Java, C++, or Smalltalk.

You should be familiar with all the concepts, tools, and vocabulary taught in Udacity's free [Kotlin Bootcamp for Programmers](https://www.udacity.com/course/kotlin-bootcamp-for-programmers--ud9011) course.

You should also be comfortable navigating GitHub and familiar with the following concepts:

* Basic multithreading and exception handling.
* How code is built, compiled, and executed, in general terms.

It also helps to have an idea of what functional programming is, but it's not required.

## What does the course cover?

We recommend that you take the Android Kotlin Fundamentals codelabs in sequence, but it's not a requirement.

### Lesson 1: Build your first app

Lesson 1 teaches you how to set up Android Studio to use Kotlin and how to build apps. You start with "Hello World" and move up to an app that uses image files and a click handler. You learn how Android projects are structured, how to use and modify views in your Kotlin Android app, and how to make sure your apps are backward-compatible. You also learn about API levels and the Android Jetpack libraries.

[Start Lesson 1](https://codelabs.developers.google.com/codelabs/kotlin-android-training-install-studio/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 2: Layouts

In Lesson 2, you learn how to use the Android Studio Layout Editor to create linear layouts and constraint layouts. You create apps that get and display user input, respond to user taps, and change the visibility and color of views. This lesson also teaches you how to use data binding to eliminate inefficient calls to the findViewById() method.

[Start Lesson 2](https://codelabs.developers.google.com/codelabs/kotlin-android-training-linear-layout/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 3: Navigation

In Lesson 3, you learn how to create useful navigation in an app. You create a fragment and add it to an app, then add navigation to the app using the Android Studio navigation graph. You add a navigation drawer and an options menu to your app, and you work with the app's back stack, changing the destination of the system Back button. Finally, you learn how to invoke an external activity from within the app.

[Start Lesson 3](https://codelabs.developers.google.com/codelabs/kotlin-android-training-create-and-add-fragment/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 4: Activity and fragment lifecycles

In Lesson 4, you learn about the activity and fragment lifecycles, and you learn how to manage complex lifecycle situations. You work with a starter app that contains several bugs related to the Android lifecycle. You add logging to the app to better understand the app's lifecycle events, and you fix the bugs that the app contains and add some enhancements to the app. You also learn about Android Jetpack's lifecycle library, which can help you manage lifecycle events with code that's better organized and easier to maintain.

[Start Lesson 4](https://codelabs.developers.google.com/codelabs/kotlin-android-training-lifecycles-logging/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 5: Architecture components

Lesson 5 teaches you how to use ViewModel and LiveData objects. You learn how to use ViewModel objects to enable data to survive configuration changes such as screen rotations. You convert an app's UI data into encapsulated LiveData and add observer methods that are notified when the value of the LiveData changes.

You also integrate LiveData and ViewModel with data binding so that the views in your layout communicate directly with ViewModel objects, without using the app's fragments to relay information. This technique simplifies your code and eliminates the need for click handlers in the UI controllers.

[Start Lesson 5](https://codelabs.developers.google.com/codelabs/kotlin-android-training-view-model/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 6: Room database and coroutines

Lesson 6 teaches you how to use the Room database library. Room takes care of many of the chores of setting up and configuring a database, and simplifies the code for interacting with the database. You learn how to use Kotlin coroutines to move database operations away from the main thread, and you learn more about using ViewModel and LiveData with app navigation.

[Start Lesson 6](https://codelabs.developers.google.com/codelabs/kotlin-android-training-room-database/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 7: RecyclerView

Lesson 7 teaches you how to use a RecyclerView to efficiently display lists and grids of items. For complex lists and grids, you learn ways to make RecyclerView more efficient and your code easier to maintain and extend. You learn how to make items in a RecyclerView clickable. You also learn how to add more than one view holder and layout to lists and grids in a RecyclerView, for example, to add a header in your app.

[Start Lesson 7](https://codelabs.developers.google.com/codelabs/kotlin-android-training-recyclerview-fundamentals/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 8: Connecting to the internet

Lesson 8 teaches you how to use community-developed libraries to connect to a web service to retrieve and display data. You learn how to handle potential network errors and use the Glide library to load and display photos from the internet. You also build a RecyclerView and use it to display a grid of images.

[Start Lesson 8](https://codelabs.developers.google.com/codelabs/kotlin-android-training-internet-data/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 9: Repository

Lesson 9 teaches you how to add a repository to abstract the data layer and provide a clean API to the rest of the app in your Android Kotlin app. You also learn how to use WorkManager to schedule background tasks in an efficient and optimized way.

[Start Lesson 9](https://codelabs.developers.google.com/codelabs/kotlin-android-training-repository/index.html?index=..%2F..android-kotlin-fundamentals#0)

### Lesson 10: Designing for everyone

This lesson teaches the basics of Android app design. It introduces themes and styles, material design, and how to make your app more accessible to everyone.

[Start Lesson 10](https://codelabs.developers.google.com/codelabs/kotlin-android-training-styles-and-themes/index.html?index=..%2F..android-kotlin-fundamentals#0)