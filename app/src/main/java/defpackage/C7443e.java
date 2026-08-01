package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7443e extends C11827e {
    @Override // defpackage.C9821e
    public final void yandex(View view, Rect rect) {
        rect.set(((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics().getBounds());
    }
}
