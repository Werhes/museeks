package defpackage;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8049e {
    public static final long ad = ViewConfiguration.getTapTimeout();

    public static final boolean ad(AbstractC6102e abstractC6102e) {
        ViewParent parent = AbstractC13482e.crashlytics(abstractC6102e).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
