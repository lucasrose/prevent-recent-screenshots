package expo.modules.preventrecentscreenshots

import android.content.Context
import expo.modules.core.interfaces.Package
import expo.modules.core.interfaces.ReactActivityLifecycleListener

class AndroidListenerPackage : Package {
  override fun createReactActivityLifecycleListeners(activityContext: Context): List<ReactActivityLifecycleListener> {
    return listOf(PreventRecentScreenshotsActivityLifecycleListener())
  }
}