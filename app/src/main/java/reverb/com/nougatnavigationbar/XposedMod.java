package reverb.com.nougatnavigationbar;

import android.content.res.Resources;
import android.content.res.XModuleResources;
import android.content.res.XResForwarder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

import javax.xml.xpath.XPath;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;
import de.robv.android.xposed.callbacks.XC_LayoutInflated;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class XposedMod implements IXposedHookLoadPackage, IXposedHookZygoteInit, IXposedHookInitPackageResources {
    private static String MODULE_PATH = null;
    public int fakeHomeResId, fakeRecentsResId, fakeBackResId;

    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {
        MODULE_PATH = startupParam.modulePath;
    }


    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        if(!loadPackageParam.packageName.equals("com.android.systemui")) {
            return;
        }
    }

    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable {
        if (!resparam.packageName.equals("com.android.systemui"))
            return;

        XModuleResources modRes = XModuleResources.createInstance(MODULE_PATH, resparam.res);
        /*fakeHomeResId = resparam.res.addResource(modRes, R.drawable.sh_home);
        fakeRecentsResId = resparam.res.addResource(modRes, R.drawable.sh_recents);
        fakeBackResId = resparam.res.addResource(modRes, R.drawable.sh_back);*/

        XResForwarder homeButton = modRes.fwd(R.drawable.sh_home);
        XResForwarder recentButton = modRes.fwd(R.drawable.sh_recents);
        XResForwarder backButton = modRes.fwd(R.drawable.sh_back);
        XResForwarder downButton = modRes.fwd(R.drawable.sh_down);

        try {
            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_ime", downButton);
            } catch (Exception e) {
            }
            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back", backButton);
            } catch (Exception e) {
            }
            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_ime_land", downButton);
            } catch (Exception e) {
            }

            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_land", backButton);
            } catch (Exception e) {
            }
            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_side", backButton);
            } catch (Exception e) {
            }

            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_land", homeButton);
            } catch (Exception e) {
            }

            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent", recentButton);
            } catch (Exception e) {
            }
            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_land", recentButton);
            } catch (Exception e) {
            }
            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_side", recentButton);
            } catch (Exception e) {
            }

            try {
                resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home", homeButton);
            } catch (Exception e) {
            }
        } catch (Exception e){

        }
    }
}
