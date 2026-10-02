package com.example.courses.model

/**
 * [Topic] is the data class to represent the Course name, image, and topic number.
 */
data class Topic(
    val stringResourceIdTopicName: Int,
    val imageResourceIdTopicImage: Int,
    val courseNumber: Int
)
