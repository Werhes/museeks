package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C7091e extends AccessibilityNodeProvider {
    public final C15816e ad;

    public C7091e(C15816e c15816e) {
        this.ad = c15816e;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C8092e isVip = this.ad.isVip(i);
        if (isVip == null) {
            return null;
        }
        return isVip.ad;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.ad.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C8092e crashlytics = this.ad.crashlytics(i);
        if (crashlytics == null) {
            return null;
        }
        return crashlytics.ad;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.ad.mo1692protected(i, i2, bundle);
    }
}
