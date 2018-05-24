package com.imchooser.shell.base

import pres.zxh.a.n.framework.app.AFApplication
import pres.zxh.a.n.framework.block.xweb.x5.AFWebUtils

/**
 * <p>用一句话描述该文件做什么</p>
 * @version 1.0 Create 2018/4/16 09:11
 * @author:dreamlover  ©2018 zhangxinhe, All rights reserved.
 */

class JApplication : AFApplication() {

    override fun onCreate() {
        super.onCreate()
        AFWebUtils.init(this)
    }
}