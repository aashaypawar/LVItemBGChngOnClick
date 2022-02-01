package org.geeksforgeeks.lvitembgchngonclick

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mList = arrayOf("Android", "IOS", "Windows", "BlackberryOS", "WebOS", "Ubuntu", "Windows7", "Max OS X")

        val mListView = findViewById<ListView>(R.id.list_view_1)
        mListView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mList)

        mListView.onItemClickListener = AdapterView.OnItemClickListener { _, view, _, _ ->
            view.setBackgroundColor(Color.RED)
        }
    }
}