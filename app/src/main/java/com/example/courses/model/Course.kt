package com.example.courses.model

/**
 * [Course] is the data class to represent the Course name, image, and topic number.
 */
data class Course(
    val stringResourceIdCourseName: Int,
    val imageResourceIdCourseImage: Int,
    val topicNumber: Int
)
