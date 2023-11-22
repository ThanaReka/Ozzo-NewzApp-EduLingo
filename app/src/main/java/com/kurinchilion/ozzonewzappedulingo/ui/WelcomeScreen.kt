@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.kurinchilion.ozzonewzappedulingo.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.kurinchilion.ozzonewzappedulingo.R
import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory


//class WelcomeScreen {
//}

val retrofit = Retrofit.Builder()
    .baseUrl("https://news.google.com/news/rss") // Replace with your API base URL
//    .addConverterFactory(GsonConverterFactory.create())
    .build()

// Step 4: Create an instance of the API service
//val apiService = retrofit.create(MyApiService::class.java)

//@Composable
//fun MyScreen() {
//    var selectedValue by remember { mutableStateOf("Default") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        // ExposedDropdownMenu
//        ExposedDropdownMenu(
//            selectedValue = selectedValue,
//            onValueChange = {
//                selectedValue = it
//            },
//            items = listOf("Option 1", "Option 2", "Option 3"),
//            modifier = Modifier.fillMaxWidth()
//        )
//
//        // Display the selected value (optional)
//        Text(text = "Selected: $selectedValue")
//    }
//}

@Composable
fun WelcomeScreen(

    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    Row (
        horizontalArrangement= Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
            modifier = modifier.padding(8.dp)
        ) {


            NewsCategory()

            LanguageSelection()

            Button(onClick = {
                navController.navigate("Second")
//                val apiRequest = MyApiRequest(selectedValue)
//                        // You should run this in a coroutine (e.g., with lifecycleScope.launch)
//                        val response = runBlocking {
//                            apiService.postData(apiRequest)
//                        }
//                        apiResponse = response
//                    },
            }) {
                Text(text = "Enter")
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsCategory() {

    var selectedValue by remember { mutableStateOf("Default") }

    var isExpanded by remember {
        mutableStateOf(false)
    }

    var category by remember {
        mutableStateOf("")
    }

    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { newValue ->
            isExpanded = newValue
        }
    ) {
        TextField(
            value = category,
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
            },
            placeholder = {
                Text(text = "News Category")
            },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
            modifier = Modifier.menuAnchor()
        )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = {
                isExpanded = false
            }
        ) {
            DropdownMenuItem(
                text = {
                    Text(text = "Canada")
                },
                onClick = {
                    category = "Canada"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "World")
                },
                onClick = {
                    category = "World"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Local")
                },
                onClick = {
                    category = "Local"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Sports")
                },
                onClick = {
                    category = "Sports"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Entertainment")
                },
                onClick = {
                    category = "Entertainment"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Sports")
                },
                onClick = {
                    category = "Sports"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Technology")
                },
                onClick = {
                    category = "Technology"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Business")
                },
                onClick = {
                    category = "Business"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Health")
                },
                onClick = {
                    category = "Health"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Science")
                },
                onClick = {
                    category = "Science"
                    isExpanded = false
                }
            )
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageSelection() {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    var language by remember {
        mutableStateOf("")
    }

    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { newValue ->
            isExpanded = newValue
        }
    ) {
        TextField(
            value = language,
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
            },
            placeholder = {
                Text(text = "Select a Language")
            },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
            modifier = Modifier.menuAnchor()
        )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = {
                isExpanded = false
            }
        ) {
            DropdownMenuItem(
                text = {
                    Text(text = "English")
                },
                onClick = {
                    language = "English"
                    isExpanded = false
                }
            )
            DropdownMenuItem(
                text = {
                    Text(text = "French")
                },
                onClick = {
                    language = "French"
                    isExpanded = false
                }
            )

            DropdownMenuItem(
                text = {
                    Text(text = "Spanish")
                },
                onClick = {
                    language = "Spanish"
                    isExpanded = false
                }
            )
        }
    }

}





