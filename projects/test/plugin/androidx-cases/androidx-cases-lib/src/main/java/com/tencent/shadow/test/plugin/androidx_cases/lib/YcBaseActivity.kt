/*
package com.tencent.shadow.test.plugin.androidx_cases.lib

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.paging.PagingData
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.hc.hcc.yc.manager.YcActivityManager
import kotlinx.coroutines.launch

*/
/**
 *
 *//*

abstract class YcBaseActivity<VB : ViewBinding>() : AppCompatActivity() {
    //反射方式实现会慢60ms以上，弃用
    //    protected val viewBinding: VB by lazy {
    //        val type = javaClass.genericSuperclass as ParameterizedType
    //        val aClass = type.actualTypeArguments[0] as Class<*>
    //        val method = aClass.getDeclaredMethod("inflate", LayoutInflater::class.java)
    //        method.invoke(null, layoutInflater) as VB
    //    }
    protected lateinit var mViewBinding: VB
        private set

    protected abstract fun createViewBinding(): VB
    protected fun getLayout(): LayoutInflater = LayoutInflater.from(this)
    protected abstract fun initView(savedInstanceState: Bundle?)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        YcActivityManager.addActivity(this)
        mViewBinding = createViewBinding()
        setContentView(mViewBinding.root)
        initView(savedInstanceState)
    }

    override fun onDestroy() {
        YcActivityManager.finishActivity(this)
        super.onDestroy()
    }
    protected fun launch(block: suspend () -> Unit) =
        lifecycleScope.launch {
            block()
        }
    protected fun launchWhenCreated(block: suspend () -> Unit) =
        lifecycleScope.launchWhenCreated {
            block()
        }

    protected fun viewBind(block: VB.(VB) -> Unit) {
        mViewBinding.apply { block(this) }
    }

    protected fun AppCompatActivity.startActivity(cls: Class<*>) {
        startActivity(Intent(this, cls))
    }

    protected fun <Data : Any, VH : RecyclerView.ViewHolder> PagingDataAdapter<Data, VH>.submitDataYc(pagingData: PagingData<Data>) {
        lifecycleScope.launch {
            this@submitDataYc.submitData(pagingData)
        }
    }

    protected fun <T> LiveData<T>.observe(observer: Observer<T>) {
        this.observe(this@YcBaseActivity, observer)
    }

    protected fun startResultYc(intent: Intent, success: ((result: ActivityResult) -> Unit)? = null) {
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            success?.let { it1 ->
                if (it.resultCode != Activity.RESULT_OK) { //安装apk失败
                    it1(it)
                }
            }
        }.launch(intent)
    }
}*/
