package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.ui.ThemedRecyclerView;
import ua.itaysonlab.vkxreborn.ui.ThemedScrollView;
import ua.itaysonlab.vkxreborn.ui.ThemedViewPager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17440e implements InterfaceC16294e {
    public static final C17440e ad = new Object();

    @Override // defpackage.InterfaceC16294e
    public final void ad(Context context) {
        Throwable th;
        C5852e c5852e;
        int i = 1;
        int i2 = 0;
        AbstractC1129e.license = (context.getResources().getConfiguration().uiMode & 48) == 32;
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        if (vKXApplication == null) {
            VKXApplication vKXApplication2 = C1059e.f3557e;
            Log.w("LiquidNavigation", "You are passing a non-application for initialization, this can lead to memory leaks");
        }
        C1059e.f3557e = vKXApplication;
        AbstractC10532e.ad = vKXApplication;
        AbstractC10532e.vip = vKXApplication.getResources();
        LayoutInflater.from(vKXApplication);
        LayoutInflater.from(AbstractC10532e.ad);
        Handler handler = AbstractC15933e.ad;
        vKXApplication.getDir("themes", 0).mkdirs();
        AbstractC15933e.billing = vKXApplication.getSharedPreferences("liquidengine", 0);
        ArrayList arrayList = AbstractC15933e.license;
        arrayList.clear();
        arrayList.add(C17094e.appmetrica);
        arrayList.addAll(AbstractC15933e.purchase);
        String string = AbstractC15933e.billing.getString("selected_theme", null);
        if (string != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C17094e c17094e = (C17094e) it.next();
                if (c17094e.vip.equals(string) && !AbstractC15933e.appmetrica.vip.equals(c17094e.vip)) {
                    AbstractC15933e.vip(c17094e, null, false);
                    break;
                }
            }
        }
        Iterator it2 = AbstractC15933e.yandex.iterator();
        if (it2.hasNext()) {
            throw AbstractC5087e.m1747goto(it2);
        }
        AbstractC6959e.f14257e = vKXApplication.getSharedPreferences("liquid_system_theme", 0);
        C12328e c12328e = AbstractC2890e.ad;
        C13197e c13197e = new C13197e(AbstractC8636e.appmetrica(context.getAssets().open("theme_catalog.json")));
        try {
            C8028e c8028e = AbstractC0232e.license;
            c8028e.getClass();
            c5852e = (C5852e) AbstractC4508e.metrica(c8028e, C5852e.Companion.serializer(), new C9428e(c13197e, i));
            try {
                c13197e.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                c13197e.close();
            } catch (Throwable th4) {
                AbstractC13362e.license(th3, th4);
            }
            th = th3;
            c5852e = null;
        }
        if (th != null) {
            throw th;
        }
        for (C13669e c13669e : c5852e.metrica) {
            AbstractC2890e.ad.ad(c13669e);
            for (C12560e c12560e : c13669e.vip) {
                AbstractC2890e.metrica.mopub(Integer.valueOf(c12560e.ad), c12560e);
            }
        }
        for (C14513e c14513e : c5852e.license) {
            AbstractC2890e.vip.ad(c14513e);
            for (C5181e c5181e : c14513e.vip) {
                AbstractC2890e.license.mopub(Integer.valueOf(c5181e.ad), c5181e);
            }
        }
        int i3 = 3;
        C17424e c17424e = new C17424e(3);
        c17424e.f34141e = new C14391e(450.0f, 0.85f);
        C1059e.setSpringModule(c17424e);
        C1059e.setDefaultTransformer(InterfaceC17022e.f33347e);
        AbstractC15933e.vip = InterfaceC3337e.f7534e;
        SparseIntArray sparseIntArray = AbstractC10532e.metrica;
        sparseIntArray.put(R.layout.abc_alert_dialog_material, R.layout.mdc_alert);
        sparseIntArray.put(R.layout.mtrl_alert_dialog, R.layout.mdc_alert);
        sparseIntArray.put(R.layout.preference_category_material, R.layout.mdc_pref_category);
        sparseIntArray.put(R.layout.preference_widget_switch, R.layout.mdc_switch);
        int i4 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = InterfaceC14080e.ad;
        if (sparseArray.indexOfKey(android.R.attr.drawableTint) >= 0) {
            sparseArray.remove(android.R.attr.drawableTint);
        }
        AbstractC17056e.ad(android.R.attr.drawableTint, new C13574e(i2));
        if (i4 >= 28) {
            if (sparseArray.indexOfKey(android.R.attr.outlineSpotShadowColor) >= 0) {
                sparseArray.remove(android.R.attr.outlineSpotShadowColor);
            }
            AbstractC17056e.ad(android.R.attr.outlineSpotShadowColor, new C15900e(0));
            if (sparseArray.indexOfKey(android.R.attr.outlineAmbientShadowColor) >= 0) {
                sparseArray.remove(android.R.attr.outlineAmbientShadowColor);
            }
            AbstractC17056e.ad(android.R.attr.outlineAmbientShadowColor, new C15900e(1));
        }
        if (sparseArray.indexOfKey(R.attr.cardBackgroundColor) >= 0) {
            sparseArray.remove(R.attr.cardBackgroundColor);
        }
        AbstractC17056e.ad(R.attr.cardBackgroundColor, new C13574e(8));
        if (sparseArray.indexOfKey(R.attr.tabIndicatorColor) >= 0) {
            sparseArray.remove(R.attr.tabIndicatorColor);
        }
        AbstractC17056e.ad(R.attr.tabIndicatorColor, new C13574e(9));
        if (sparseArray.indexOfKey(R.attr.boxBackgroundColor) >= 0) {
            sparseArray.remove(R.attr.boxBackgroundColor);
        }
        AbstractC17056e.ad(R.attr.boxBackgroundColor, new C13574e(10));
        if (sparseArray.indexOfKey(R.attr.rippleColor) >= 0) {
            sparseArray.remove(R.attr.rippleColor);
        }
        AbstractC17056e.ad(R.attr.rippleColor, new C13574e(11));
        if (sparseArray.indexOfKey(android.R.attr.buttonTint) >= 0) {
            sparseArray.remove(android.R.attr.buttonTint);
        }
        AbstractC17056e.ad(android.R.attr.buttonTint, new C13574e(12));
        if (sparseArray.indexOfKey(R.attr.tint) >= 0) {
            sparseArray.remove(R.attr.tint);
        }
        AbstractC17056e.ad(R.attr.tint, new C13574e(i));
        if (sparseArray.indexOfKey(R.attr.drawableTint) >= 0) {
            sparseArray.remove(R.attr.drawableTint);
        }
        AbstractC17056e.ad(R.attr.drawableTint, new C13574e(2));
        if (sparseArray.indexOfKey(R.attr.itemIconTint) >= 0) {
            sparseArray.remove(R.attr.itemIconTint);
        }
        AbstractC17056e.ad(R.attr.itemIconTint, new C13574e(i3));
        if (sparseArray.indexOfKey(R.attr.itemIconTint) >= 0) {
            sparseArray.remove(R.attr.itemIconTint);
        }
        AbstractC17056e.ad(R.attr.itemIconTint, new C13574e(4));
        if (sparseArray.indexOfKey(R.attr.iconTint) >= 0) {
            sparseArray.remove(R.attr.iconTint);
        }
        AbstractC17056e.ad(R.attr.iconTint, new C13574e(5));
        if (sparseArray.indexOfKey(R.attr.hintTextColor) >= 0) {
            sparseArray.remove(R.attr.hintTextColor);
        }
        AbstractC17056e.ad(R.attr.hintTextColor, new C13574e(6));
        if (sparseArray.indexOfKey(R.attr.strokeColor) >= 0) {
            sparseArray.remove(R.attr.strokeColor);
        }
        AbstractC17056e.ad(R.attr.strokeColor, new C13574e(7));
        AbstractC10532e.yandex.add(new Object());
        AbstractC10532e.ad(RecyclerView.class, ThemedRecyclerView.class);
        AbstractC10532e.ad(ViewPager.class, ThemedViewPager.class);
        if (i4 >= 29) {
            AbstractC10532e.ad(ScrollView.class, ThemedScrollView.class);
        }
        AbstractC15933e.vip(AbstractC17378e.ad(), null, false);
    }
}
