package kr.co.tjoeun.pizzaorderapp_20200926.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_pizza_store_recycler_view.*
import kr.co.tjoeun.pizzaorderapp_20200926.R
import kr.co.tjoeun.pizzaorderapp_20200926.ViewStoreDetailActivity
import kr.co.tjoeun.pizzaorderapp_20200926.adapters.RecyclerViewStoreAdapter
import kr.co.tjoeun.pizzaorderapp_20200926.datas.Store

class PizzaStoreRecyclerViewFragment : Fragment() {

    val mPizzaStoreList = ArrayList<Store>()

    lateinit var mRecyclerViewStoreAdapter: RecyclerViewStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_recycler_view, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPizzaStoreList.add(
            Store(
                "피자헛",
                "1588-5588",
                "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"
            )
        )
        mPizzaStoreList.add(
            Store(
                "파파존스",
                "1577-8080",
                "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"
            )
        )
        mPizzaStoreList.add(
            Store(
                "미스터피자",
                "1577-0077",
                "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"
            )
        )
        mPizzaStoreList.add(
            Store(
                "도미노피자",
                "1577-3082",
                "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"
            )
        )
        mPizzaStoreList.add(
            Store(
                "피자헛",
                "1588-5588",
                "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"
            )
        )
        mPizzaStoreList.add(
            Store(
                "파파존스",
                "1577-8080",
                "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"
            )
        )
        mPizzaStoreList.add(
            Store(
                "미스터피자",
                "1577-0077",
                "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"
            )
        )
        mPizzaStoreList.add(
            Store(
                "도미노피자",
                "1577-3082",
                "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"
            )
        )
        mPizzaStoreList.add(
            Store(
                "피자헛",
                "1588-5588",
                "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"
            )
        )
        mPizzaStoreList.add(
            Store(
                "파파존스",
                "1577-8080",
                "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"
            )
        )
        mPizzaStoreList.add(
            Store(
                "미스터피자",
                "1577-0077",
                "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"
            )
        )
        mPizzaStoreList.add(
            Store(
                "도미뇨피자",
                "1577-0000",
                "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"
            )
        )
        // 왜 추가가 안됨???????


        mRecyclerViewStoreAdapter =
            RecyclerViewStoreAdapter(context!!, R.layout.store_recycler_item, mPizzaStoreList)
        pizzaStoreRecyclerView.adapter = mRecyclerViewStoreAdapter



//        pizzaStoreRecyclerView.setItemClickListener { parent, view, position, id ->
//
//            클릭된 피자가게가 어떤 가게인지, position을 이용해서 추출.
//            val clickedStore = mPizzaStoreList[position]
//
//            상세 조회 화면으로 (가게데이터를 통째로 들고) 이동
//            val myIntent = Intent(context, ViewStoreDetailActivity::class.java)
//            Store클래스에 Serializable 속성을 부여했기 때문에 통째로 첨부 가능.
//            myIntent.putExtra("storeData", clickedStore)
//            startActivity(myIntent)


//        미션: 리싸이클러뷰 항목 클릭이벤트 구현
    }

}

