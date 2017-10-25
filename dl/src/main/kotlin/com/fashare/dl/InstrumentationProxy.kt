package com.fashare.dl

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import com.fashare.dl.extension.logd

/**
 * <pre>
 *     author : jinliangshan
 *     e-mail : jinliangshan@chexiang.com
 *     desc   :
 * </pre>
 */
class InstrumentationProxy(val base: Instrumentation): Instrumentation(){
//        , InstrumentationInternal{

//    override fun newActivity(clazz: Class<*>?, context: Context?, token: IBinder?, application: Application?, intent: Intent?, info: ActivityInfo?, title: CharSequence?, parent: Activity?, id: String?, lastNonConfigurationInstance: Any?): Activity {
//        logd("newActivity long: " + clazz?.canonicalName)
//        return base.newActivity(ProxyActivity::class.java, context, token, application, intent, info, title, parent, id, lastNonConfigurationInstance)
//    }
//
    override fun newActivity(cl: ClassLoader?, className: String?, intent: Intent?): Activity {
        logd("newActivity short: " + className)
        return base.newActivity(DL.dl, className, intent)
    }

//    override fun execStartActivity(
//            who: Context, contextThread: IBinder, token: IBinder, target: Activity,
//            intent: Intent, requestCode: Int, options: Bundle): ActivityResult? {
//        logd("execStartActivity long: " + target.javaClass.canonicalName)
//
//        return try {
//            Reflect.on(base).call("execStartActivity",
//                    who, contextThread, token, target,
//                    intent, requestCode, options).get<ActivityResult?>()
//        } catch (e: Exception){
//            loge("execStartActivity long: " + e.toString())
//            null
//        }
//    }
//
//    override fun execStartActivity(
//            who: Context, contextThread: IBinder, token: IBinder, target: Activity,
//            intent: Intent, requestCode: Int): ActivityResult? {
//        logd("execStartActivity short: " + target.javaClass.canonicalName)
//
//        return try {
//            Reflect.on(base).call("execStartActivity",
//                    who, contextThread, token, target,
//                    intent, requestCode).get<ActivityResult?>()
//        } catch (e: Exception){
//            loge("execStartActivity short: " + e.toString())
//            null
//        }
//    }
}

///**
// * copy from Small
// */
//interface InstrumentationInternal {
//    fun execStartActivity(
//            who: Context, contextThread: IBinder, token: IBinder, target: Activity,
//            intent: Intent, requestCode: Int, options: android.os.Bundle): Instrumentation.ActivityResult?
//
//    fun execStartActivity(
//            who: Context, contextThread: IBinder, token: IBinder, target: Activity,
//            intent: Intent, requestCode: Int): Instrumentation.ActivityResult?
//}
