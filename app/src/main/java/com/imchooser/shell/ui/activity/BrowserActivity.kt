package com.imchooser.shell.ui.activity


import com.imchooser.shell.R
import com.tencent.smtt.sdk.WebView
import kotlinx.android.synthetic.main.activity_browser.*
import pres.zxh.a.n.framework.base.activity.AFBaseWebActivity
import pres.zxh.a.n.framework.base.annotation.definition.view.AFContentView
import pres.zxh.a.n.framework.block.xweb.x5.AFWebView

/**
 * <p>用一句话描述该文件做什么</p>
 * @version 1.0 Create 2018/4/16 09:15
 * @author:dreamlover  ©2018 zhangxinhe, All rights reserved.
 */

@AFContentView(R.layout.activity_browser)
class BrowserActivity: AFBaseWebActivity() {

    /**
     * 初始化
     */
    override fun initializationContentAfter() {

    }

    /**
     * js 调用对象 JsBridge
     */
    override fun bridgeInterface(view: WebView?) {
    }


    override fun onCustomPageFinished(view: WebView?, url: String?) {

    }

    /**
     * 加载地址
     */
    override fun getWebUrl(): String {
        return "http://www.baidu.com"
    }

    override fun shouldOverrideUrlLoadingCustom(view: WebView?, url: String?): Boolean {
        return false
    }

    /**
     * webview 对象
     */
    override fun createWebView(): AFWebView? {
        return browserView
    }



}