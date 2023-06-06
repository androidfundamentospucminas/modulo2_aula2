package com.walker.modulo2aula2androidfundamentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val TAG = "ActivityLifecycle::"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = BlankFragment()

        findViewById<Button>(R.id.buttonAdd).setOnClickListener {
            val fragmentTransation = supportFragmentManager.beginTransaction()
            fragmentTransation.replace(R.id.fragmentHost, fragment).commit()
        }

        findViewById<Button>(R.id.buttonRemove).setOnClickListener {
            val fragmentTransation = supportFragmentManager.beginTransaction()
            fragmentTransation.remove(fragment).commit()
        }

        println("$TAG${javaClass.simpleName} onCreate")
    }

    override fun onStart() {
        super.onStart()
        println("$TAG${javaClass.simpleName} onStart")
    }

    override fun onRestart() {
        super.onRestart()
        println("$TAG${javaClass.simpleName} onRestart")
    }

    override fun onResume() {
        super.onResume()
        println("$TAG${javaClass.simpleName} onResume")
    }

    override fun onPause() {
        super.onPause()
        println("$TAG${javaClass.simpleName} onPause")
    }

    override fun onStop() {
        super.onStop()
        println("$TAG${javaClass.simpleName} onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$TAG${javaClass.simpleName} onDestroy")
    }
}