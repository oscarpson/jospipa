package com.joslabs.jospipa

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import kotlinx.android.synthetic.main.activity_message.*
import kotlinx.android.synthetic.main.content_message.*

class MessageActivity : AppCompatActivity() {
private lateinit var mymodel :Mylivemodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        setSupportActionBar(toolbar)
        mymodel= ViewModelProviders.of(this).get(Mylivemodel::class.java)
        mymodel.mystring.observe(this, Observer { t-> Log.e("testlive",t) })
        btntest.setOnClickListener{

                mymodel.mystring.value=edt_name.text.toString()}

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
