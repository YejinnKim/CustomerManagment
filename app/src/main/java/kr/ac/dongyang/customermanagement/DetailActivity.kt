package kr.ac.dongyang.customermanagement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail)

        var intent1 = intent

        var id = intent1.getIntExtra("id", 0)
        var name = intent1.getStringExtra("name")
        var sex = intent1.getStringExtra("sex")
        var phone = intent1.getStringExtra("phone")
        var email = intent1.getStringExtra("email")
        var city = intent1.getStringExtra("city")
        var grade = intent1.getStringExtra("grade")

        dNo.text = id.toString()
        dName.text = name
        dSex.text = sex
        dPhone.text = phone
        dEmail.text = email
        dCity.text = city
        dGrade.text = grade

    }
}