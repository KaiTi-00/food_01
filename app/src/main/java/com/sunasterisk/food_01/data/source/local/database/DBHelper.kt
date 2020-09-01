package com.sunasterisk.food_01.data.source.local.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.sunasterisk.food_01.data.model.RecipeEntry

class DBHelper private constructor(context: Context) : SQLiteOpenHelper(context, RecipeEntry.OBJECT, null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.run {
            execSQL(AppDatabase.CREATE_TABLE_RECIPES)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.run {
            execSQL("DROP TABLE IF EXISTS" + AppDatabase.CREATE_TABLE_RECIPES)
        }
        onCreate(db)
    }

    companion object {
        private var  instance: DBHelper? = null

        fun getInstance(context: Context) = instance?: DBHelper(context).also {
            instance = it
        }
    }
}