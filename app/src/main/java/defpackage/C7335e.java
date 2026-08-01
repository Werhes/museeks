package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٞۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7335e extends AbstractC16997e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final AbstractC9615e f15001e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final List f15002e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final String f15003e;

    public C7335e(AbstractC9615e abstractC9615e, int i) {
        super(false, 3);
        this.f15001e = abstractC9615e;
        this.f15002e = abstractC9615e.mopub();
        this.f15003e = abstractC9615e.smaato();
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-1750070200);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(1951022605, new C5323e(this), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C5323e(this, i);
        }
    }
}
