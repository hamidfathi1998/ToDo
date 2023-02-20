package ir.hfathi.todo.data.models

import androidx.room.Database
import androidx.room.RoomDatabase
import ir.hfathi.todo.data.ToDoDao

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}