package com.sunasterisk.food_01.data.source.local

import com.sunasterisk.food_01.data.model.Recipe
import com.sunasterisk.food_01.data.source.data_source.RecipeDataSource
import com.sunasterisk.food_01.data.source.remote.OnFetchDataJsonListener
import com.sunasterisk.food_01.data.source.remote.RecipeRemoteDataSource

class RecipeLocalDataSource: RecipeDataSource.Local{
    private object Holder {
        val INSTANCE = RecipeLocalDataSource()
    }

    companion object{
        val instance: RecipeLocalDataSource by lazy { Holder.INSTANCE}
    }

    override fun getAllRecipe(listener: onDataLoadedCallBack<MutableList<Recipe>>) {
        TODO("Not yet implemented")
    }

    override fun addRecipe(recipe: Recipe, listener: onDataLoadedCallBack<Recipe>) {
        TODO("Not yet implemented")
    }
}
