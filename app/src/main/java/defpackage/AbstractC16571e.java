package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۡۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16571e {
    public static final C17017e ad;
    public static final C9184e vip;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٕٗؐ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eٕٗؐ] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            ad = new Object();
        } else {
            ad = new Object();
        }
        vip = new C9184e(14, Float.class, "translationAlpha");
        new C9184e(15, Rect.class, "clipBounds");
    }

    public static void ad(View view, int i, int i2, int i3, int i4) {
        ad.inmobi(view, i, i2, i3, i4);
    }

    public static void vip(View view, int i) {
        ad.tapsense(view, i);
    }
}
