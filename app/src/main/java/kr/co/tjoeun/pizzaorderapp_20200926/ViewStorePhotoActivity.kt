package kr.co.tjoeun.pizzaorderapp_20200926

import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_store_photo.storeFullImg
import kr.co.tjoeun.pizzaorderapp_20200926.datas.Store

class ViewStorePhotoActivity : BaseActivity() {

    lateinit var mStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_photo)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        storeFullImg.setOnClickListener {
            finish()
        }
    }

    override fun setValues() {
        mStore = intent.getSerializableExtra("storeData1") as Store
        Glide.with(mContext).load(mStore.logoUrl).into(storeFullImg)

    }
}