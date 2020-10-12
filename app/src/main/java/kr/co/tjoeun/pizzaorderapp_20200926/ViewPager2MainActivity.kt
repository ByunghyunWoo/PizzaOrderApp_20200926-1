package kr.co.tjoeun.pizzaorderapp_20200926

import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main_viewpager2.*
import kr.co.tjoeun.pizzaorderapp_20200926.adapters.MainViewPager2Adapter
import kr.co.tjoeun.pizzaorderapp_20200926.fragments.MyProfileFragment
import kr.co.tjoeun.pizzaorderapp_20200926.fragments.PizzaStoreRecyclerViewFragment

class ViewPager2MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_viewpager2)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {


    }

    override fun setValues() {


        val fragmentList = listOf(MyProfileFragment(), PizzaStoreRecyclerViewFragment())
        val adapter = MainViewPager2Adapter(this)
        adapter.fragmentList = fragmentList
        viewPager2_MainViewPager.adapter = adapter

        val tabTitles = listOf<String>("내 정보 설정", "피자 주문")
        TabLayoutMediator(viewPager2_MainTabLayout, viewPager2_MainViewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()

    }

}