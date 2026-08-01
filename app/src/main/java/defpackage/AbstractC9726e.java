package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9726e {
    public static C12948e ad(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C12948e yandex = C12948e.yandex(null, rootWindowInsets);
        C2893e c2893e = yandex.ad;
        c2893e.isPro(yandex);
        View rootView = view.getRootView();
        c2893e.license(rootView);
        c2893e.Signature(rootView);
        c2893e.admob();
        return yandex;
    }
}
