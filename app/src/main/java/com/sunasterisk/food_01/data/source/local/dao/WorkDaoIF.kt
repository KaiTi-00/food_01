package com.sunasterisk.food_01.data.source.local.dao

import com.sunasterisk.food_01.data.model.Recipe

interface WorkDaoIF {
    fun getAllRecipes(): List<Recipe>

    fun addRecipe(recipe: Recipe): Boolean

    fun delRecipe(id: String): Boolean
}