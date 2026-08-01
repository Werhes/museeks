package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۧ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15864e extends WindowInsetsAnimation$Callback {
    public final /* synthetic */ AbstractActivityC8386e ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15864e(AbstractActivityC8386e abstractActivityC8386e) {
        super(0);
        this.ad = abstractActivityC8386e;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.ad.f17152e = false;
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.ad.f17152e = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        int amazon = C5275e.amazon(windowInsets.getInsets(WindowInsets.Type.ime()));
        int amazon2 = C5275e.amazon(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
        AbstractActivityC8386e abstractActivityC8386e = this.ad;
        if (abstractActivityC8386e.f17153e) {
            if (amazon2 != 0) {
                float f = amazon2;
                amazon = (int) (((1.0f - (Math.min(amazon, amazon2) / f)) * f) + amazon);
            }
            abstractActivityC8386e.f34700e.metrica(amazon);
            abstractActivityC8386e.f34700e.setPadding(0, 0, 0, amazon);
        }
        return windowInsets;
    }
}
