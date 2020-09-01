package com.sunasterisk.food_01.data.source.local.dao

import com.sunasterisk.food_01.data.model.Recipe
import com.sunasterisk.food_01.data.model.RecipeEntry
import com.sunasterisk.food_01.data.source.local.database.DBHelper

class WorkDao private constructor( helper: DBHelper): WorkDaoIF{
    private val  writableDatabase = helper.writableDatabase
    private val readableDatabase = helper.readableDatabase

    override fun getAllRecipes(): List<Recipe> {
        val cursor = readableDatabase.query(RecipeEntry.OBJECT, null, null, null, null, null, null)
            .apply {
                moveToFirst()
            }
        return mutableListOf<Recipe>().apply {
            while (!cursor.isAfterLast) {
                add(Recipe(cursor))
                cursor.moveToNext()
            }
            cursor.close()
        }
    }

    override fun addRecipe(recipe: Recipe): Boolean {
        return writableDatabase.insert(
            RecipeEntry.OBJECT,
            null,
            recipe.putContentValues()
        ) > 0
    }

    override fun delRecipe(id: String): Boolean {
        return writableDatabase.delete(
            RecipeEntry.OBJECT,
            RecipeEntry.ID_RECIPE + " = ?",
            arrayOf(id)
        ) > 0
    }

    companion object {
        private var instance: WorkDao? = null

        fun getInstance(helper: DBHelper) =
            instance ?: WorkDao(helper).also { instance = it }
    }
}