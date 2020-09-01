package com.sunasterisk.food_01.data.source.local.database

import com.sunasterisk.food_01.data.model.RecipeEntry

object AppDatabase {
        const val CREATE_TABLE_RECIPES = "CREATE TABLE ${RecipeEntry.OBJECT} (" +
                "${RecipeEntry.ID_RECIPE} INTEGER IDENTITY(1,1) PRIMARY KEY, " +
                "${RecipeEntry.NAME} TEXT, " +
                "${RecipeEntry.CATEGORY} TEXT, " +
                "${RecipeEntry.AREA} TEXT, " +
                "${RecipeEntry.INSTRUCTIONS} TEXT, " +
                "${RecipeEntry.TAGS} TEXT, " +
                "${RecipeEntry.URL_VIDEO} TEXT, " +
                "${RecipeEntry.URL_IMAGE} TEXT, " +
                "${RecipeEntry.INGRE1} TEXT, " +
                "${RecipeEntry.INGRE2} TEXT, " +
                "${RecipeEntry.INGRE3} TEXT, " +
                "${RecipeEntry.INGRE4} TEXT, " +
                "${RecipeEntry.INGRE5} TEXT, " +
                "${RecipeEntry.INGRE6} TEXT, " +
                "${RecipeEntry.INGRE7} TEXT, " +
                "${RecipeEntry.INGRE8} TEXT, " +
                "${RecipeEntry.INGRE9} TEXT, " +
                "${RecipeEntry.INGRE10} TEXT, " +
                "${RecipeEntry.MEASURE1} TEXT, " +
                "${RecipeEntry.MEASURE2} TEXT, " +
                "${RecipeEntry.MEASURE3} TEXT, " +
                "${RecipeEntry.MEASURE4} TEXT, " +
                "${RecipeEntry.MEASURE5} TEXT, " +
                "${RecipeEntry.MEASURE6} TEXT, " +
                "${RecipeEntry.MEASURE7} TEXT, " +
                "${RecipeEntry.MEASURE8} TEXT, " +
                "${RecipeEntry.MEASURE9} TEXT, " +
                "${RecipeEntry.MEASURE10} TEXT)"
}