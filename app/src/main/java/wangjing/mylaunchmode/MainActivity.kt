package wangjing.mylaunchmode

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when (v?.id) {
            R.id.btnJump ->
                Toast.makeText(this, "跳转", Toast.LENGTH_LONG).show()
            R.id.btnJump2 ->
                Toast.makeText(this, "跳转222", Toast.LENGTH_LONG).show()

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview.text = "sdfadsfds" //直接使用布局中定义的id，不需要获取
//        btnJump.setOnClickListener {
//            Toast.makeText(this, "跳转", Toast.LENGTH_LONG).show()
//        }
        
        btnJump.setOnClickListener(this)
        btnJump2.setOnClickListener(this)
    }
}
