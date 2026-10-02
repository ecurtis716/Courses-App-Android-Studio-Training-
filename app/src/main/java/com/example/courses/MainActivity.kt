package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courses.data.DataSource
import com.example.courses.model.Topic
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .statusBarsPadding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CoursesApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun CoursesApp(modifier: Modifier = Modifier) {
    TopicsList(
        topicsList = DataSource().loadTopics(),
    )
}

@Composable
fun TopicsList(topicsList: List<Topic>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(topicsList) { topic ->
            TopicCard(
                topic = topic,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun TopicCard(
    topic: Topic,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Row {
            Image(
                painter = painterResource(topic.imageResourceIdTopicImage),
                contentDescription = null,
                modifier = Modifier
                    .height(68.dp)
                    .width(68.dp)
            )
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 0.dp)
            ) {
                Text(
                    text = stringResource(topic.stringResourceIdTopicName),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                    Text(
                        text = topic.courseNumber.toString(),
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }
    }
}

//@Preview
@Composable
private fun TopicCardPreview() {
    TopicCard(Topic(R.string.architecture, R.drawable.architecture, 58))
}
