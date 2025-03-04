package io.hvk.meradostapp.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import io.hvk.meradostapp.model.lectureCategories
import io.hvk.meradostapp.ui.components.CategoryCard
import io.hvk.meradostapp.ui.components.SearchBar
import io.hvk.meradostapp.ui.theme.MeraDostAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onLectureClick: (String) -> Unit
) {
    var showSearch by remember { mutableStateOf(false) }
    var searchQuery by remember { mutableStateOf("") }

    val filteredCategories = remember(searchQuery) {
        if (searchQuery.isEmpty()) {
            lectureCategories
        } else {
            lectureCategories.filter { category ->
                category.title.contains(searchQuery, ignoreCase = true) ||
                        category.description.contains(searchQuery, ignoreCase = true) ||
                        category.content.any { content ->
                            content.hindi.contains(searchQuery, ignoreCase = true) ||
                                    content.english.contains(searchQuery, ignoreCase = true) ||
                                    content.pronunciation.contains(
                                        searchQuery,
                                        ignoreCase = true
                                    ) ||
                                    (content.example?.contains(
                                        searchQuery,
                                        ignoreCase = true
                                    ) == true)
                        }
            }
        }
    }
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Learn Hindi",
                        style = MaterialTheme.typography.headlineLarge,
                    )
                },
                actions = {
                    IconButton(onClick = { showSearch = !showSearch }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimary
                ),
            )
        },
        modifier = modifier
    ) { innerPadding ->
        Column(
            Modifier
                .padding(innerPadding)
        ) {
            AnimatedVisibility(
                visible = showSearch,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                SearchBar(
                    query = searchQuery,
                    onQueryChange = { searchQuery = it },
                    onSearchDismiss = {
                        showSearch = false
                        searchQuery = ""
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }

            // Categories Grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.padding(bottom = 80.dp)
            ) {
                items(filteredCategories) { category ->
                    CategoryCard(
                        category = category,
                        onClick = { onLectureClick(category.id) }
                    )
                }
            }

        }
        Spacer(Modifier.height(100.dp))
    }
}


@PreviewLightDark
@Composable
private fun Preview() {
    MeraDostAppTheme {
        HomeScreen { }
    }
}