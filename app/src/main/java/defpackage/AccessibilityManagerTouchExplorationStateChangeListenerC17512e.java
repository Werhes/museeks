package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC17512e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0211e f34343e;

    public AccessibilityManagerTouchExplorationStateChangeListenerC17512e(C0211e c0211e) {
        this.f34343e = c0211e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC17512e) {
            return this.f34343e.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC17512e) obj).f34343e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34343e.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        C12801e c12801e = (C12801e) this.f34343e.f1457e;
        AutoCompleteTextView autoCompleteTextView = c12801e.yandex;
        if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
            return;
        }
        CheckableImageButton checkableImageButton = c12801e.license;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
