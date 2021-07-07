package com.algebra.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val programmingLanguages: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addProgrammingLanguages()
        val rvLanguagesList : RecyclerView = findViewById( R.id.rvLanguagesList )

        rvLanguagesList.layoutManager = LinearLayoutManager( this )
        rvLanguagesList.adapter = LanguagesAdapter( programmingLanguages, this )
    }

    private fun addProgrammingLanguages( ) {
        programmingLanguages.add("Java")
        programmingLanguages.add("Kotlin")
        programmingLanguages.add("C")
        programmingLanguages.add("C++")
        programmingLanguages.add("C#")
        programmingLanguages.add("Python")
        programmingLanguages.add("Javascript")
        programmingLanguages.add("Go")
        programmingLanguages.add("Typescript")
        programmingLanguages.add("NodeJS")
        programmingLanguages.add("React")
        programmingLanguages.add("Spring")
        programmingLanguages.add("Angular")
        programmingLanguages.add("Objective C")
        programmingLanguages.add("Vue")
        programmingLanguages.add("Groovy")
        programmingLanguages.add("Ruby")
        programmingLanguages.add("Scala")
        programmingLanguages.add("Ruby on Rails")
        programmingLanguages.add("React Native")
        programmingLanguages.add("Ionic")
        programmingLanguages.add("Cordova")
        programmingLanguages.add("T-SQL")
        programmingLanguages.add("Sql")
        programmingLanguages.add("Bash")
        programmingLanguages.add("F#")
        programmingLanguages.add("PSQL")
        programmingLanguages.add("Mongo")
        programmingLanguages.add("Django")
    }

}
