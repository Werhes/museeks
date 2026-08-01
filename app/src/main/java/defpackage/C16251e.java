package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16251e {
    public static final C16251e ad = new Object();
    public static boolean license;
    public static final ArrayList metrica;
    public static final SharedPreferences vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖٖٜ, java.lang.Object] */
    static {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        vip = vKXApplication.getSharedPreferences("VKXHintSystem", 0);
        metrica = new ArrayList();
    }

    public static void license(EnumC14893e enumC14893e) {
        SharedPreferences.Editor edit = vip.edit();
        edit.putBoolean(enumC14893e.name(), true);
        edit.apply();
    }

    public static boolean metrica(EnumC14893e enumC14893e) {
        return vip.getBoolean(enumC14893e.name(), false);
    }

    public final synchronized void ad(View view, EnumC14893e enumC14893e) {
        if (metrica(enumC14893e)) {
            return;
        }
        VKXApplication.f36529e.post(new RunnableC11247e(view, enumC14893e, 14));
    }

    public final synchronized void vip() {
        ArrayList arrayList = metrica;
        if (arrayList.isEmpty()) {
            license = false;
            return;
        }
        C6571e c6571e = (C6571e) arrayList.remove(0);
        View view = (View) c6571e.f13544e;
        C16200e c16200e = new C16200e((EnumC14893e) c6571e.f13543e, view, 5);
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC10917e(c16200e, view, 2));
        } else {
            c16200e.invoke();
        }
    }
}
