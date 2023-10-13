package com.example.optionmenurayyan

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater:MenuInflater = menuInflater
        inflater.inflate(R.menu.example_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.item1 ->  {
                showToast("Item 1 Selected")
                return true
            }
            R.id.item2 -> {
                showToast("Item 2 Selected")
                return true
            }
            R.id.item3 -> {
                showToast("Item 3 Selected")
                return true
            }
            R.id.subitem1 -> {
                showToast("Sub Item 1 Selected")
                return true
            }
            R.id.subitem2 -> {
                showToast("Sub Item 2 Selected")
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}