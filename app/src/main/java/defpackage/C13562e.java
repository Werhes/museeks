package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13562e {
    public char Signature;
    public final Menu ad;
    public int adcel;
    public int admob;
    public CharSequence ads;
    public CharSequence advert;
    public char amazon;
    public ActionProviderVisibilityListenerC0616e applovin;
    public final /* synthetic */ C17683e firebase;
    public String inmobi;
    public String isPro;
    public int isVip;
    public int loadAd;
    public CharSequence mopub;
    public CharSequence premium;
    public boolean pro;
    public boolean remoteconfig;
    public boolean signatures;
    public int smaato;
    public int startapp;
    public int subscription;
    public int tapsense;
    public boolean yandex;
    public ColorStateList subs = null;
    public PorterDuff.Mode crashlytics = null;
    public int vip = 0;
    public int metrica = 0;
    public int license = 0;
    public int appmetrica = 0;
    public boolean purchase = true;
    public boolean billing = true;

    public C13562e(C17683e c17683e, Menu menu) {
        this.firebase = c17683e;
        this.ad = menu;
    }

    public final Object ad(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.firebase.metrica.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void vip(MenuItem menuItem) {
        C17683e c17683e = this.firebase;
        Context context = c17683e.metrica;
        boolean z = false;
        menuItem.setChecked(this.remoteconfig).setVisible(this.pro).setEnabled(this.signatures).setCheckable(this.subscription >= 1).setTitleCondensed(this.advert).setIcon(this.smaato);
        int i = this.tapsense;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.isPro != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c17683e.license == null) {
                c17683e.license = C17683e.ad(context);
            }
            Object obj = c17683e.license;
            String str = this.isPro;
            MenuItemOnMenuItemClickListenerC10667e menuItemOnMenuItemClickListenerC10667e = new MenuItemOnMenuItemClickListenerC10667e();
            menuItemOnMenuItemClickListenerC10667e.vip = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC10667e.metrica = cls.getMethod(str, MenuItemOnMenuItemClickListenerC10667e.license);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC10667e);
            } catch (Exception e) {
                StringBuilder applovin = AbstractC8703e.applovin("Couldn't resolve menu item onClick handler ", str, " in class ");
                applovin.append(cls.getName());
                InflateException inflateException = new InflateException(applovin.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.subscription >= 2) {
            if (menuItem instanceof C9995e) {
                C9995e c9995e = (C9995e) menuItem;
                c9995e.f19746e = (c9995e.f19746e & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC4494e) {
                MenuItemC4494e menuItemC4494e = (MenuItemC4494e) menuItem;
                InterfaceMenuItemC4281e interfaceMenuItemC4281e = menuItemC4494e.f9756e;
                try {
                    if (menuItemC4494e.f9755e == null) {
                        menuItemC4494e.f9755e = interfaceMenuItemC4281e.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC4494e.f9755e.invoke(interfaceMenuItemC4281e, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.inmobi;
        if (str2 != null) {
            menuItem.setActionView((View) ad(str2, C17683e.appmetrica, c17683e.ad));
            z = true;
        }
        int i2 = this.isVip;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ActionProviderVisibilityListenerC0616e actionProviderVisibilityListenerC0616e = this.applovin;
        if (actionProviderVisibilityListenerC0616e != null) {
            if (menuItem instanceof InterfaceMenuItemC4281e) {
                ((InterfaceMenuItemC4281e) menuItem).ad(actionProviderVisibilityListenerC0616e);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.ads;
        boolean z2 = menuItem instanceof InterfaceMenuItemC4281e;
        if (z2) {
            ((InterfaceMenuItemC4281e) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC11815e.m3244break(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.premium;
        if (z2) {
            ((InterfaceMenuItemC4281e) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC11815e.m3265static(menuItem, charSequence2);
        }
        char c = this.amazon;
        int i3 = this.loadAd;
        if (z2) {
            ((InterfaceMenuItemC4281e) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC11815e.m3274try(menuItem, c, i3);
        }
        char c2 = this.Signature;
        int i4 = this.admob;
        if (z2) {
            ((InterfaceMenuItemC4281e) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC11815e.m3266strictfp(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.crashlytics;
        if (mode != null) {
            if (z2) {
                ((InterfaceMenuItemC4281e) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC11815e.m3252final(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.subs;
        if (colorStateList != null) {
            if (z2) {
                ((InterfaceMenuItemC4281e) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC11815e.m3246catch(menuItem, colorStateList);
            }
        }
    }
}
