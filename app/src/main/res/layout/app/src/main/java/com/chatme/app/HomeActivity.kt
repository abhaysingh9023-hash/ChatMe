package com.chatme.app

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val roomList = findViewById<LinearLayout>(R.id.roomList)

        // Demo room data
        val rooms = listOf("Music Lounge", "Game Zone", "Talk World", "Chill with Friends", "Chat Lovers")

        // Dynamically create room cards
        for (room in rooms) {
            val roomView = TextView(this)
            roomView.text = room
            roomView.setPadding(24, 24, 24, 24)
            roomView.textSize = 18f
            roomView.setTextColor(getColor(android.R.color.white))
            roomView.setBackgroundColor(getColor(android.R.color.darker_gray))
            roomView.setOnClickListener {
                val intent = Intent(this, RoomActivity::class.java)
                intent.putExtra("ROOM_NAME", room)
                startActivity(intent)
            }
            val params = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            params.setMargins(0, 12, 0, 12)
            roomList.addView(roomView, params)
        }
    }
}
