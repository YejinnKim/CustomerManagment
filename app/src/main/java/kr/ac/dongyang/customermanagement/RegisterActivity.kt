package kr.ac.dongyang.customermanagement

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        var grade1 = arrayOf("일반고객", "A등급고객", "S등급고객", "VIP고객")
        var spinner = findViewById<Spinner>(R.id.edGrade)
        var adapter: ArrayAdapter<String>
        adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, grade1)
        spinner.adapter = adapter

        rButton1.setOnClickListener {
            var name = edName.text.toString()
            var sex = ""
            if (rb1.isChecked) {
                sex = "남"
            } else {
                sex = "여"
            }
            var phone = edPhone.text.toString()
            var email = edEmail.text.toString()
            var city = edCity.text.toString()
            var grade = spinner.getSelectedItem().toString()
            var myHelper = MyDBHelper(this)
            var sqlDB = myHelper.writableDatabase
            var insertSql = "insert into customerTBL(name, sex, phone, email, city, grade) values ('"+name+"', '"+sex+"', '"+phone+"', '"+email+"', '"+city+"', '"+grade+"')"
            sqlDB.execSQL(insertSql)

            Toast.makeText(applicationContext, "insert ok" + name, Toast.LENGTH_SHORT).show()
            sqlDB.close()
        }
    }
}