package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18534e {
    public static WindowInsets ad(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static void metrica(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static CharSequence vip(View view) {
        return view.getStateDescription();
    }
}
