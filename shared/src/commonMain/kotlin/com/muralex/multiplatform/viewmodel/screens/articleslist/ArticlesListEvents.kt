package com.muralex.multiplatform.viewmodel.screens.articleslist

import com.muralex.multiplatform.viewmodel.Events

/********** EVENT functions, called directly by the UI layer **********/

fun Events.selectFavorite(countryName: String) = screenCoroutine {
    // todo set favorite
    // update state with new favorites map, after toggling the value for the specified country

    stateManager.updateScreen(ArticlesListState::class) { it }
}

fun Events.openBottomSheet(countryName: String) = screenCoroutine {
    stateManager.updateScreen(ArticlesListState::class) { state ->
        state.copy(bottomSheetState = BottomSheetState(true))
    }
}

fun Events.resetBottomSheet() = screenCoroutine {

    stateManager.updateScreen(ArticlesListState::class) { state ->
        state.copy(bottomSheetState = BottomSheetState(false))
    }
}
