<h1 align="center">ToDo</h1>
<p align="center">
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=18)
![build](https://github.com/wisnukurniawan/Compose-ToDo/actions/workflows/build.yml/badge.svg)
</p>

<p align="center">
🎯 "ToDo" app demonstrates modern Android app development with Jetpack Compose, Hilt, Material3, Coroutines, Flows, Room based on MVVM architecture. 
</p>
</br>

# Preview
### Light Mode
</br>
<p align="left">
 <a><img width="30%" height="180px"  src="preview/create_tasks.gif"></a>
 <a><img width="30%" height="180px"  src="preview/search.gif"></a>
 <a><img width="30%" height="180px"  src="preview/filter.png"></a>
 <a><img width="30%" height="180px"  src="preview/more_action.png"></a>
</p>
</br>
### Dark Mode
</br>
<p align="left">
 <a><img width="30%" height="180px"  src="gifs/dark_mode.gif"></a>
</p>
</br>

# Tech stack

- [Kotlin](https://kotlinlang.org/): first class programming language for native Android development.
- [Kotlin Coroutines](https://github.com/Kotlin/kotlinx.coroutines): structured concurrency.
- [Kotlin Flows](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/): reactive communication.
- [Material3](https://m3.material.io/): modern UI/UX guidelines and components.
- [Jetpack Compose](https://developer.android.com/jetpack/compose): modern, declarative way of building UI in Kotlin.
- [Jetpack Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle): observe Android lifecycles and handle UI states upon the lifecycle changes.
- [Jetpack ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel): manages UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
- [Jetpack DataStore Preferences](https://developer.android.com/topic/libraries/architecture/datastore): uses Kotlin Coroutines and Flows to store data asynchronously, consistently, and transactionally.
- [Room](https://developer.android.com/training/data-storage/room): SQLite abstraction and database solution.
- [Dagger Hilt](https://dagger.dev/hilt/): first class dependency injection for native Android development.
- [Compose Destinations](https://composedestinations.rafaelcosta.xyz/): a type-safe navigation for composables.

# Architecture

"ToDo" is based on the MVVM architecture pattern, Repository pattern, Mapper pattern.

<img src="/preview/mvvm-pattern.png"/>

# About

A beautifully simple ToDo application that emphasises simplicity and ease of use. Whether you want a shopping list, grocery list or you just have lots of things to remember ToDo is built for you. ToDo is fully offline as it does not require internet connection. Also, ToDo is very fast and very light! The size of APK is lighter than 2 MB. It also supports Dark Mode.

Personally, I use ToDo app to save the urls of articles that I plan to read later. So, I can mark them as completed and everything is tracked also saved in the database. So, ToDo can be used in different situations. I hope it can solve your problem and make your life easier!

# Features

- Add, edit and delete tasks.
- Undo deleted tasks.
- Mark tasks as completed. Completed tasks have "Checked/Done" indicator and it is possible to hide them from list.
- Mark tasks as "Important". Important tasks are listed first and they will have red "Warning" indicator.
- Hide completed tasks from the list.
- Sort tasks by name and by created date.
- Your preferences are saved.
- Search for your tasks easily.
- Delete all tasks at once, delete all completed tasks at once, or delete a task by swiping it away.
- Beautiful animations and indicators.
- Dark/Light theme support.
- Dynamic theme support.
- Multiple language support.
- Multiple screen sizes support.
- Light that is less than 2 MB.
- Works without the internet.
- Simplicity that has only five screens.
- Adaptive screens that change according to screen orientation.
- Completely robust to process death.
- Completely robust to configuration change.

## If this project helps you in anyway, show your love :heart: by putting a :star: on this project :v:

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/hamidfathi1998/ToDo/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### - Contact - Let's become friend
- [Github](https://github.com/hamidfathi1998)
- [Linkedin](https://www.linkedin.com/in/hamidfathi1998/)

