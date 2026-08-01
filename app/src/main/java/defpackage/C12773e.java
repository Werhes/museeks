package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12773e {
    public AbstractC12564e ad;

    public C12773e(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.ad = new C3109e(AbstractC9564e.vip(i, interpolator, j));
        } else {
            this.ad = new AbstractC12564e(i, interpolator, j);
        }
    }
}
