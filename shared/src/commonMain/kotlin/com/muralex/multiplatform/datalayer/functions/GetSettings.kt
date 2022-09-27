package com.muralex.multiplatform.datalayer.functions

import com.muralex.multiplatform.datalayer.Repository
import com.muralex.multiplatform.datalayer.objects.ArticleData
import com.muralex.multiplatform.datalayer.sources.localdb.checkBookmark
import com.muralex.multiplatform.datalayer.sources.localdb.deleteBookmark
import com.muralex.multiplatform.datalayer.sources.localdb.getBookmarksList
import com.muralex.multiplatform.datalayer.sources.localdb.insertBookmark
import com.muralex.multiplatform.datalayer.sources.localsettings.ApiDataSource
import com.muralex.multiplatform.datalayer.sources.localsettings.OpenFromList
import com.muralex.multiplatform.datalayer.sources.localsettings.SourceCountry
import com.muralex.multiplatform.datalayer.sources.localsettings.ThemeMode
import com.muralex.multiplatform.viewmodel.screens.favoriteslist.FavoriteListItem

suspend fun Repository.getThemeModeIndex(): Int = withRepoContext {
    val savedThemeMode = localSettings.savedThemeMode
    ThemeMode.valueOf(savedThemeMode.uppercase()).ordinal
}

suspend fun Repository.getOpenFromListIndex(): Int = withRepoContext {
    val saved = localSettings.openFromList
    OpenFromList.valueOf(saved.uppercase()).ordinal
}

suspend fun Repository.getSelectedCountryIndex(): Int = withRepoContext {
    val saved = localSettings.sourceCountry
    SourceCountry.valueOf(saved.uppercase()).ordinal
}

suspend fun Repository.getApiSourceIndex(): Int = withRepoContext {
    val saved = localSettings.apiDataSource
    ApiDataSource.valueOf(saved.uppercase()).ordinal
}



