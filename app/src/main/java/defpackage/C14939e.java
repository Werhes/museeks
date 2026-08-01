package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14939e implements InterfaceC11678e {
    public final ViewConfiguration ad;

    public C14939e(ViewConfiguration viewConfiguration) {
        this.ad = viewConfiguration;
    }

    @Override // defpackage.InterfaceC11678e
    public final long ad() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.InterfaceC11678e
    public final float appmetrica() {
        return this.ad.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.InterfaceC11678e
    public final float billing() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC5666e.amazon(this.ad);
        }
        return 16.0f;
    }

    @Override // defpackage.InterfaceC11678e
    public final long license() {
        float f = 48;
        return AbstractC11160e.ad(f, f);
    }

    @Override // defpackage.InterfaceC11678e
    public final float metrica() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC5666e.loadAd(this.ad);
        }
        return 2.0f;
    }

    @Override // defpackage.InterfaceC11678e
    public final float purchase() {
        return this.ad.getScaledTouchSlop();
    }

    @Override // defpackage.InterfaceC11678e
    public final long vip() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
