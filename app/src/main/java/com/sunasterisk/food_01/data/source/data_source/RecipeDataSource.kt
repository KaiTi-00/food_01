package com.sunasterisk.food_01.data.source.data_source

import com.sunasterisk.food_01.data.model.Recipe
import com.sunasterisk.food_01.data.source.local.onDataLoadedCallBack
import com.sunasterisk.food_01.data.source.remote.OnFetchDataJsonListener

interface RecipeDataSource {
    interface Local {
        fun getAllRecipe(listener: onDataLoadedCallBack<MutableList<Recipe>>)

        fun addRecipe(recipe: Recipe, listener: onDataLoadedCallBack<Recipe>)
    }

    interface Remote {
        fun getRecipeByName(
            strFood: String?,
            listener: OnFetchDataJsonListener<MutableList<Recipe>>
        )
    }
}
