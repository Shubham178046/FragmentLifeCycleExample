package com.example.fragmentlifecycleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentlifecycleexample.Fragment.FragmentOne
import com.example.fragmentlifecycleexample.Fragment.FragmentThree
import com.example.fragmentlifecycleexample.Fragment.FragmentTwo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentOne.setOnClickListener { FragmentLoad(FragmentOne()) }
        fragmentTwo.setOnClickListener { FragmentLoad(FragmentTwo()) }
        fragmentThree.setOnClickListener { FragmentLoad(FragmentThree()) }
    }

    fun FragmentLoad(fragment: Fragment)
    {
        if (fragment != null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit()
        }
    }
}