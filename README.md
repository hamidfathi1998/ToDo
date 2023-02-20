<h1 align="center">ToDo</h1>
<p align="center">
  <a href="https://www.android.com"><img alt="License" src="https://img.shields.io/badge/platform-Android-yellow.svg"/></a>
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
  <img alt="API" src="https://github.com/wisnukurniawan/Compose-ToDo/actions/workflows/build.yml/badge.svg"/>
</p>

<p align="center">
🎯 "ToDo" app demonstrates modern Android app development with Jetpack Compose, Hilt, Material3, Coroutines, Flows, Room based on MVVM architecture. 
</p>
</br>

# Preview
### Light Mode
</br>
<p align="left">
 <a><img width="25%" height="420px"  src="preview/create_tasks.gif"></a>
 <a><img width="25%" height="420px"  src="preview/search.gif"></a>
 <a><img width="25%" height="420px"  src="preview/filter.gif"></a>
 <a><img width="25%" height="420px"  src="preview/more_action.gif"></a>
</p>
</br>

### Dark Mode
</br>
<p align="left">
 <a><img width="25%" height="420px"  src="preview/dark_mode.gif"></a>
</p>
</br>

# Architecture

"ToDo" is based on the MVVM architecture pattern, Repository pattern, Mapper pattern.

<img src="/preview/mvvm-pattern.png"/>


## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - A coroutine is a concurrency design pattern that you can use on Android to simplify code that executes asynchronously.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
    - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects that notify views when the underlying database changes.
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
    - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
    - [DataBinding](https://developer.android.com/topic/libraries/data-binding) - The Data Binding Library is a support library that allows you to bind UI components in your layouts to data sources in your app using a declarative format rather than programmatically.
    - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
- [RecyclerView Animators](https://github.com/wasabeef/recyclerview-animators) - About
  An Android Animation library which easily add itemanimator to RecyclerView items.

<br>

## Project Directory Structure
```
.
├── app
│   ├── src
│   │   └── main
|   |       ├──/java/com/example/todoapp
│   │       │       ├── data
│   │       │       │   ├── models
│   │       │       │   │   ├── Priority.kt
│   │       │       │   │   └── ToDoData.kt
│   │       │       │   ├── repository
│   │       │       │   │   └── ToDoRepository.kt
│   │       │       │   ├── viewmodel
│   │       │       │   │   └── ToDoViewModel.kt
│   │       │       │   ├── Converter.kt
│   │       │       │   ├── ToDoDao.kt
│   │       │       │   └── ToDoDatabase.kt
│   │       │       ├── fragments
│   │       │       │   ├── add
│   │       │       │   │   └── AddFragment.kt
│   │       │       │   ├── list
│   │       │       │   │   ├── adapter
│   │       │       │   │   │   ├── ListAdapter.kt
│   │       │       │   │   │   └── ToDoDiffUtil.kt
│   │       │       │   │   ├── ListFragment.kt
│   │       │       │   │   └── SwipeToDelete.kt
│   │       │       │   ├── update
│   │       │       │   │   └── UpdateFragment.kt
│   │       │       │   ├── BindingAdapters.kt
│   │       │       │   └── SharedViewModel.kt
│   │       │       ├── utils
│   │       │       │   └── Utils.kt
│   │       │       └── MainActivity.kt
│   │       ├── res
│   │       │   ├── anim
│   │       │   │   ├── from_left.xml
│   │       │   │   ├── from_right.xml
│   │       │   │   ├── to_left.xml
│   │       │   │   └── to_right.xml
│   │       │   ├── drawable
│   │       │   │   ├── custom_input.xml
│   │       │   │   ├── ic_add.xml
│   │       │   │   ├── ic_check.xml
│   │       │   │   ├── ic_launcher_background.xml
│   │       │   │   ├── ic_no_data.xml
│   │       │   │   ├── ic_save.xml
│   │       │   │   ├── ic_search.xml
│   │       │   │   └── item_background.xml
│   │       │   ├── layout
│   │       │   │   ├── activity_main.xml
│   │       │   │   ├── fragment_add.xml
│   │       │   │   ├── fragment_list.xml
│   │       │   │   ├── fragment_update.xml
│   │       │   │   └── row_layout.xml
│   │       │   ├── menu
│   │       │   │   ├── add_fragment_menu.xml
│   │       │   │   ├── list_fragment_menu.xml
│   │       │   │   └── update_fragment_menu.xml
│   │       │   ├── navigation
│   │       │   │   └── my_nav.xml
│   │       │   └── values
│   │       │       ├── colors.xml
│   │       │       ├── strings.xml
│   │       │       └── themes.xml
│   │       └── AndroidManifest.xml
│   ├── build.gradle
│   └── proguard-rules.pro
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
├── LICENSE
├── README.MD
└── settings.gradle
```
<br>

# About

A beautifully simple ToDo application that emphasises simplicity and ease of use. Whether you want a shopping list, grocery list or you just have lots of things to remember ToDo is built for you. ToDo is fully offline as it does not require internet connection. Also, ToDo is very fast and very light! The size of APK is lighter than 2 MB. It also supports Dark Mode.

Personally, I use ToDo app to save the urls of articles that I plan to read later. So, I can mark them as completed and everything is tracked also saved in the database. So, ToDo can be used in different situations. I hope it can solve your problem and make your life easier!

# Features

- Add, edit and delete tasks.
- Undo deleted tasks.
- Sort tasks by priority.
- Search for your tasks easily.
- Delete all tasks at once, delete all completed tasks at once, or delete a task by swiping it away.
- Beautiful animations and indicators.
- Dark/Light theme support.
- Multiple screen sizes support.
- Light that is less than 2 MB.
- Works without the internet.
- Simplicity that has only 2 screens.

## If this project helps you in anyway, show your love :heart: by putting a :star: on this project :v:

## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/hamidfathi1998/ToDo/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### - Contact - Let's become friend
- [Github](https://github.com/hamidfathi1998)
- [Linkedin](https://www.linkedin.com/in/hamidfathi1998/)

