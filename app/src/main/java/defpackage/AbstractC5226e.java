package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۢۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5226e {
    public static CharSequence ad(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static void appmetrica(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void license(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static boolean metrica(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void purchase(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static boolean vip(View view) {
        return view.isAccessibilityHeading();
    }
}
