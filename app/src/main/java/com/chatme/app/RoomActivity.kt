package com.chatme.app

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RoomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val roomNameView = findViewById<TextView>(R.id.roomName)
        val chatContainer = findViewById<LinearLayout>(R.id.chatContainer)

        val roomName = intent.getStringExtra("ROOM_NAME")
        roomNameView.text = roomName ?: "Voice Room"

        // Example chat
        val chats = listOf("Rahul: Hello everyone!", "Priya: Hi Rahul!", "Karan: Let's play music!")
        for (chat in chats) {
            val chatView = TextView(this)
            chatView.text = chat
            chatView.setTextColor(getColor(android.R.color.white))
            chatView.textSize = 16f
            chatContainer.addView(chatView)
        }
    }
}
