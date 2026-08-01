package defpackage;

import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۛؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0551e {
    public static float ad(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static void appmetrica(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC5014e.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC5014e, viewTreeObserverOnGlobalLayoutListenerC5014e);
        }
    }

    public static float license(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float metrica(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static float vip(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }
}
