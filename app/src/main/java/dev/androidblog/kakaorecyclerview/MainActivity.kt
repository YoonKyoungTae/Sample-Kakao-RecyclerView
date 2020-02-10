package dev.androidblog.kakaorecyclerview

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_board_list.layoutManager = LinearLayoutManager(this)
        rv_board_list.adapter = BoardListAdapter()
        rv_board_list.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)

                if (newState == 1) {
                    iv_shadow.visibility = View.VISIBLE
                    iv_shadow.animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade_in)
                } else if (newState == 0) {
                    if (!rv_board_list.canScrollVertically(-1)) {
                        iv_shadow.visibility = View.GONE
                        iv_shadow.animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade_out)
                    }
                }

//                스크롤 탑에서는 작동하지 않는 로직
//                if (!rv_board_list.canScrollVertically(-1)) {
//                        iv_shadow.animation = AnimationUtils.loadAnimation(activity, R.anim.fade_out)
//                        iv_shadow.visibility = View.GONE
//                }  else {
//                    iv_shadow.visibility = View.VISIBLE
//                    iv_shadow.animation = AnimationUtils.loadAnimation(activity, R.anim.fade_in)
//                }
            }

        })
    }
}
