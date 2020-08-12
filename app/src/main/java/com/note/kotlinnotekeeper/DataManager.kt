package com.note.kotlinnotekeeper

class DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        //initialize the collection of courses automatically ones the application loads up
        initializeCourses()
    }

    private fun initializeCourses(){
        var course = CourseInfo("android_intents","Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async","Android Async Programming and services")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "Java_lang",title="Android Async Programming and services")
        courses.set(course.courseId, course)

        course = CourseInfo(title="Java Fundamentals: The core platform ", courseId = "java_core")
        courses.set(course.courseId, course)

    }
}