package com.sunasterisk.food_01.screen.home

import com.sunasterisk.food_01.data.model.Category
import com.sunasterisk.food_01.data.model.Recipe
import com.sunasterisk.food_01.utils.BasePresenter

class HomeContract {
    /**
     * View
     */
    interface View {
        fun onGetCategorySuccess(categories: MutableList<Category>)
        fun onError(exception: Exception?)
        fun onGetRecipeRandomSuccess(recipe: MutableList<Recipe>)
        fun onErrorRecipe(exception: Exception?)
    }

    /**
     * Presenter
     */
    interface Presenter : BasePresenter<View> {
        fun getCategory()
        fun getRecipeRandom()
    }
}
