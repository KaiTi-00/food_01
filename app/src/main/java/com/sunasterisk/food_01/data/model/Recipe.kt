package com.sunasterisk.food_01.data.model

import android.content.ContentValues
import android.database.Cursor

data class Recipe(
    val idRecipe: String = "",
    val name: String = "",
    val category: String = "",
    val area: String = "",
    val instructions: String = "",
    val urlImage: String = "",
    val tags: String = "",
    val urlVideo: String = "",
    val ingre1: String = "",
    val ingre2: String = "",
    val ingre3: String = "",
    val ingre4: String = "",
    val ingre5: String = "",
    val ingre6: String = "",
    val ingre7: String = "",
    val ingre8: String = "",
    val ingre9: String = "",
    val ingre10: String = "",
    val measure1: String = "",
    val measure2: String = "",
    val measure3: String = "",
    val measure4: String = "",
    val measure5: String = "",
    val measure6: String = "",
    val measure7: String = "",
    val measure8: String = "",
    val measure9: String = "",
    val measure10: String = ""
){
    constructor(cursor: Cursor): this (
        idRecipe = cursor.getString(cursor.getColumnIndex(RecipeEntry.ID_RECIPE)),
        name = cursor.getString(cursor.getColumnIndex(RecipeEntry.NAME)),
        category = cursor.getString(cursor.getColumnIndex(RecipeEntry.CATEGORY)),
        area = cursor.getString(cursor.getColumnIndex(RecipeEntry.AREA)),
        instructions = cursor.getString(cursor.getColumnIndex(RecipeEntry.INSTRUCTIONS)),
        tags = cursor.getString(cursor.getColumnIndex(RecipeEntry.TAGS)),
        urlImage = cursor.getString(cursor.getColumnIndex(RecipeEntry.URL_IMAGE)),
        urlVideo = cursor.getString(cursor.getColumnIndex(RecipeEntry.URL_VIDEO)),
        ingre1 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE1)),
        ingre2 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE2)),
        ingre3 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE3)),
        ingre4 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE4)),
        ingre5 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE5)),
        ingre6 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE6)),
        ingre7 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE7)),
        ingre8 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE8)),
        ingre9 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE9)),
        ingre10 = cursor.getString(cursor.getColumnIndex(RecipeEntry.INGRE10)),
        measure1 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE1)),
        measure2 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE2)),
        measure3 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE3)),
        measure4 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE4)),
        measure5 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE5)),
        measure6 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE6)),
        measure7 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE7)),
        measure8 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE8)),
        measure9 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE9)),
        measure10 = cursor.getString(cursor.getColumnIndex(RecipeEntry.MEASURE10))
    )

    fun putContentValues() = ContentValues().apply {
        put(RecipeEntry.ID_RECIPE, idRecipe)
        put(RecipeEntry.NAME, name)
        put(RecipeEntry.CATEGORY, category)
        put(RecipeEntry.AREA, area)
        put(RecipeEntry.INSTRUCTIONS, instructions)
        put(RecipeEntry.TAGS, tags)
        put(RecipeEntry.URL_IMAGE, urlImage)
        put(RecipeEntry.URL_VIDEO, urlVideo)
        put(RecipeEntry.INGRE1, ingre1)
        put(RecipeEntry.INGRE2, ingre2)
        put(RecipeEntry.INGRE3, ingre3)
        put(RecipeEntry.INGRE4, ingre4)
        put(RecipeEntry.INGRE5, ingre5)
        put(RecipeEntry.INGRE6, ingre6)
        put(RecipeEntry.INGRE7, ingre7)
        put(RecipeEntry.INGRE8, ingre8)
        put(RecipeEntry.INGRE9, ingre9)
        put(RecipeEntry.INGRE10, ingre10)
        put(RecipeEntry.MEASURE1, measure1)
        put(RecipeEntry.MEASURE2, measure2)
        put(RecipeEntry.MEASURE3, measure3)
        put(RecipeEntry.MEASURE4, measure4)
        put(RecipeEntry.MEASURE5, measure5)
        put(RecipeEntry.MEASURE6, measure6)
        put(RecipeEntry.MEASURE7, measure7)
        put(RecipeEntry.MEASURE8, measure8)
        put(RecipeEntry.MEASURE9, measure9)
        put(RecipeEntry.MEASURE10, measure10)
    }
}

object RecipeEntry {
    const val OBJECT = "meals"
    const val ID_RECIPE = "idMeal"
    const val NAME = "strMeal"
    const val CATEGORY = "strCategory"
    const val AREA = "strArea"
    const val INSTRUCTIONS = "strInstructions"
    const val URL_IMAGE = "strMealThumb"
    const val TAGS = "strTags"
    const val URL_VIDEO = "strYoutube"
    const val INGRE1 = "strIngredient1"
    const val INGRE2 = "strIngredient2"
    const val INGRE3 = "strIngredient3"
    const val INGRE4 = "strIngredient4"
    const val INGRE5 = "strIngredient5"
    const val INGRE6 = "strIngredient6"
    const val INGRE7 = "strIngredient7"
    const val INGRE8 = "strIngredient8"
    const val INGRE9 = "strIngredient9"
    const val INGRE10 = "strIngredient10"
    const val MEASURE1 = "strMeasure1"
    const val MEASURE2 = "strMeasure2"
    const val MEASURE3 = "strMeasure3"
    const val MEASURE4 = "strMeasure4"
    const val MEASURE5 = "strMeasure5"
    const val MEASURE6 = "strMeasure6"
    const val MEASURE7 = "strMeasure7"
    const val MEASURE8 = "strMeasure8"
    const val MEASURE9 = "strMeasure9"
    const val MEASURE10 = "strMeasure10"
}
