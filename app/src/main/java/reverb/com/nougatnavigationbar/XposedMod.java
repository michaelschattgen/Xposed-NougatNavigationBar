package reverb.com.nougatnavigationbar;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

import javax.xml.xpath.XPath;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;
import de.robv.android.xposed.callbacks.XC_LayoutInflated;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class XposedMod implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        XposedBridge.log("we are in SystemUI!");
        if(!loadPackageParam.packageName.equals("com.android.systemui")) {
            return;
        }

        boolean isLgDevice = Build.MANUFACTURER.toLowerCase(Locale.getDefault()).equals("lge");
        Class<?> NavigationBarView = null;

        if(isLgDevice) {
            try {
                NavigationBarView = XposedHelpers.findClass("com.android.systemui.statusbar.phone.LGNavigationBarView", loadPackageParam.classLoader);
            } catch (XposedHelpers.ClassNotFoundError e) {
                NavigationBarView = XposedHelpers.findClass("com.android.systemui.statusbar.phone.NavigationBarView", loadPackageParam.classLoader);
            }
        } else {
            NavigationBarView = XposedHelpers.findClass("com.android.systemui.statusbar.phone.NavigationBarView", loadPackageParam.classLoader);
        }

        XC_MethodHook methodHook = new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                try{
                    ImageView imageView = (ImageView) XposedHelpers.callMethod(param.thisObject, "getHomeButton");
                    imageView.setImageResource(R.drawable.down);
                } catch (NoSuchMethodError e2) {
                    // Custom rom maybe?
                    return;
                }
            }
        };

        XposedHelpers.findAndHookMethod(NavigationBarView, "onFinishInflate", methodHook);
        XposedHelpers.findAndHookMethod(NavigationBarView, "reorient", methodHook);

        if(!isLgDevice){
            XposedHelpers.findAndHookMethod(NavigationBarView, "getIcons", Resources.class, new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    try{
                        XposedHelpers.setObjectField(param.thisObject, "mHomeIcon", R.drawable.down);
                        XposedHelpers.setObjectField(param.thisObject, "mHomeLandIcon", R.drawable.down);
                    } catch (NoSuchFieldError e) {

                    }
                }
            });
        }
    }
}
