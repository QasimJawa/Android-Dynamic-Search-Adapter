package stacktex.mobin.search.model

import stacktex.mobin.search.adapter.DynamicSearchAdapter

data class SearchModel3(val data: String) : DynamicSearchAdapter.Searchable {
    override fun getSearchCriteria(): String {
        return data
    }
}