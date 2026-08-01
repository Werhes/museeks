package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۨ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6093e implements InterfaceC5169e {
    public final InterfaceC4719e ad;
    public final int metrica;
    public final InterfaceC17873e vip;

    public C6093e(InterfaceC4719e interfaceC4719e, InterfaceC17873e interfaceC17873e, int i) {
        this.ad = interfaceC4719e;
        this.vip = interfaceC17873e;
        this.metrica = i;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // defpackage.InterfaceC5169e
    public final void ad() {
        InterfaceC4719e interfaceC4719e = this.ad;
        Drawable loadAd = interfaceC4719e.loadAd();
        InterfaceC17873e interfaceC17873e = this.vip;
        InterfaceC4082e amazon = interfaceC17873e.amazon();
        boolean z = interfaceC17873e instanceof C16455e;
        C15198e c15198e = new C15198e(loadAd, amazon != null ? AbstractC15143e.ad(amazon, interfaceC4719e.startapp().getResources()) : null, interfaceC17873e.license().remoteconfig, this.metrica, (z && ((C16455e) interfaceC17873e).billing) ? false : true);
        if (z) {
            interfaceC4719e.ad(AbstractC15143e.vip(c15198e));
        } else {
            if (!(interfaceC17873e instanceof C10574e)) {
                throw new C14803e(10);
            }
            interfaceC4719e.metrica(AbstractC15143e.vip(c15198e));
        }
    }
}
