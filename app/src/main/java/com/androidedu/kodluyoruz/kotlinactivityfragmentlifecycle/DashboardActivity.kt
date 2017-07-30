package com.androidedu.kodluyoruz.kotlinactivityfragmentlifecycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        val registerFragment: Fragment = RegisterFragment()

        fragmentTransaction.add(R.id.activity_dashboard_frmC, registerFragment)

        fragmentTransaction.commit()
    }
}
