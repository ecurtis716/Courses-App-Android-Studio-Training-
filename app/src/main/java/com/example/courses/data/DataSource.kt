package com.example.courses.data

import com.example.courses.R
import com.example.courses.model.Topic

class DataSource {
    val topics = listOf(
        Topic(R.string.architecture, R.drawable.architecture, 58),
        Topic(R.string.crafts, R.drawable.crafts, 121),
        Topic(R.string.business, R.drawable.business, 78),
        Topic(R.string.culinary, R.drawable.culinary, 118),
        Topic(R.string.design, R.drawable.design, 423),
        Topic(R.string.fashion, R.drawable.fashion, 92),
        Topic(R.string.film, R.drawable.film, 165),
        Topic(R.string.gaming, R.drawable.gaming, 164),
        Topic(R.string.drawing, R.drawable.drawing, 326),
        Topic(R.string.lifestyle, R.drawable.lifestyle, 305),
        Topic(R.string.music, R.drawable.music, 212),
        Topic(R.string.painting, R.drawable.painting, 172),
        Topic(R.string.photography, R.drawable.photography, 321),
        Topic(R.string.tech, R.drawable.tech, 118)
    )

    fun loadTopics(): List<Topic> {
        return topics
    }
}