//@formatter:off
/*
 * DO NOT FORMAT CODE!
 * Preferences > Editor > Code Style > Formatter Control
 *
 */
package reverb.com.nougatnavigationbar;

import android.content.res.XModuleResources;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;

/**
 * Code taken from https://github.com/prithvee/ANDROID-L-NAVBAR
 */
public class XposedMod implements IXposedHookZygoteInit, IXposedHookInitPackageResources {

    private static String MODULE_PATH = null;

    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {
        MODULE_PATH = startupParam.modulePath;
    }

    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable {
        if (!resparam.packageName.equals("com.android.systemui")) return;

        XModuleResources modRes = XModuleResources.createInstance(MODULE_PATH, resparam.res);
        try {
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_ime", modRes.fwd(R.drawable.n_back_down));} catch (Exception ignored) { }
       	    try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }
       	    try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_ime_land", modRes.fwd(R.drawable.n_back_down));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_side", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_side", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }


            //******************************htc icons**********************************//
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_back", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_recent_apps", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_home", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

       	    try {resparam.res.setReplacement("com.android.systemui", "drawable", "navigation_icon_down", modRes.fwd(R.drawable.n_back_down));} catch (Exception ignored) { }

            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }


            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_normal", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_normal", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_normal", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }


            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.white", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }


            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.blackgradation", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }


            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.whitegradation", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //******************************lg g2****************************//
            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_land", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_land_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_back_pressed_trans", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }


            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_land", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_land_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_home_pressed_trans", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_land", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_land_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.lge.systemui.theme.black", "drawable", "ic_sysbar_recent_pressed_trans", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }


            //*****************************miui******************************************//
            try {resparam.res.setReplacement("com.android.systemui", "drawable", "screen_key_back_settings", modRes.fwd(R.drawable.n_back));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "screen_key_recent_apps_settings", modRes.fwd(R.drawable.n_recents));} catch (Exception ignored) { }

            try {resparam.res.setReplacement("com.android.systemui", "drawable", "screen_key_home_settings", modRes.fwd(R.drawable.n_home));} catch (Exception ignored) { }

        } catch (Exception e){
            XposedBridge.log("Error hooking SystemUI resources\n" + e.getMessage());
        }
    }
}
