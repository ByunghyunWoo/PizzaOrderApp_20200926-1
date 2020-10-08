package kr.co.tjoeun.pizzaorderapp_20200926

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizzaorderapp_20200926.adapters.MainViewPager2Adapter

class ViewPager2MainActivity : BaseActivity() {

    lateinit var mViewPagerAdapter: MainViewPager2Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_viewpager2)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        mViewPagerAdapter = MainViewPager2Adapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)

    }

}