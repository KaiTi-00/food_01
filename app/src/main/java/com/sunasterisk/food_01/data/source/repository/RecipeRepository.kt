package com.sunasterisk.food_01.data.source.repository

import com.sunasterisk.food_01.data.model.Recipe
import com.sunasterisk.food_01.data.source.data_source.RecipeDataSource
import com.sunasterisk.food_01.data.source.local.RecipeLocalDataSource
import com.sunasterisk.food_01.data.source.local.onDataLoadedCallBack
import com.sunasterisk.food_01.data.source.remote.OnFetchDataJsonListener
import com.sunasterisk.food_01.data.source.remote.RecipeRemoteDataSource

class RecipeRepository(
    private val remote: RecipeDataSource.Remote,
    private val local: RecipeDataSource.Local
) {
    private object Holder {
        val INSTANCE = RecipeRepository(
            remote = RecipeRemoteDataSource.instance,
            local = RecipeLocalDataSource.instance
        )
    }

    fun getRecipesByName(
        strFood: String?,
        listener: OnFetchDataJsonListener<MutableList<Recipe>>
    ) {
        remote.getRecipeByName(strFood, listener)
    }

    /*
     * Local
     * */
    fun getAllRecipeLocal(listener: onDataLoadedCallBack<MutableList<Recipe>>) {
        local.getAllRecipe(listener)
    }

    fun addRecipeLocal(recipe: Recipe, listener: onDataLoadedCallBack<Recipe>) {
        local.addRecipe(recipe, listener)
    }

    companion object {
        val instance: RecipeRepository by lazy { Holder.INSTANCE }
    }
}
