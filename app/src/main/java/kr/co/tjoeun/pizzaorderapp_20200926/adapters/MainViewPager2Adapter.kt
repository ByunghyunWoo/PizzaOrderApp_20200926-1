package kr.co.tjoeun.pizzaorderapp_20200926.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class MainViewPager2Adapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    var fragmentList = listOf<Fragment>()

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {

        return fragmentList[position]
//        return when(position) {
//            0 -> PizzaStoreRecyclerViewFragment()
//            else -> MyProfileFragment()
//        }

    }





}