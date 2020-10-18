package com.zzazzu.newjickbangcopy_201018

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zzazzu.newjickbangcopy_201018.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : BaseActivity() {

    lateinit var mRoomData : Room

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mRoomData = intent.getSerializableExtra("roomInfo") as Room

        priceTxt.text = mRoomData.getFormattedPrice()
        descriptionTxt.text = mRoomData.description

        addressTxt.text = mRoomData.address
        floorTxt.text = mRoomData.getFormattedFloor()


    }

}