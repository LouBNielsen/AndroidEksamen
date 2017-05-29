package dk.cphbusiness.template

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_homescreen.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.onClick

class HomeScreen : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)

        register.onClick {
            startActivity(intentFor<MainActivity>()) }

        sendSMSButton.onClick {
            startActivity(intentFor<PeopleActivity>()) }
    }
}
