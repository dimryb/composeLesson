package space.rybakov.composelesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import space.rybakov.composelesson.ui.theme.Gray100


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray100)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.image_1, "Миша"),
                        ItemRowModel(R.drawable.image_2, "Мерлин"),
                        ItemRowModel(R.drawable.image_3, "Лена"),
                        ItemRowModel(R.drawable.image_4, "Маша"),
                        ItemRowModel(R.drawable.image_5, "Лера"),
                        ItemRowModel(R.drawable.image_6, "Фёдр"),
                        ItemRowModel(R.drawable.image_7, "Филип"),
                        ItemRowModel(R.drawable.image_8, "Сергей"),
                        ItemRowModel(R.drawable.image_9, "Алина"),
                        ItemRowModel(R.drawable.image_10, "Обезьян")
                    )
                ) { _, item ->
                    ItemRow(item = item)
                }
            }
        }
    }
}

