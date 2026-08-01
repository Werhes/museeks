package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8532e implements InterfaceC15834e {
    public final InterfaceC17431e appmetrica;
    public final C9344e license;
    public volatile Object purchase;
    public final C2435e vip;
    public final int metrica = 4;
    public final long ad = C6913e.billing.getAndIncrement();

    public C8532e(InterfaceC9660e interfaceC9660e, C2435e c2435e, InterfaceC17431e interfaceC17431e) {
        this.license = new C9344e(interfaceC9660e);
        this.vip = c2435e;
        this.appmetrica = interfaceC17431e;
    }

    @Override // defpackage.InterfaceC15834e
    public final void ad() {
        this.license.f18615e = 0L;
        C0534e c0534e = new C0534e(this.license, this.vip);
        try {
            c0534e.ad();
            Uri loadAd = this.license.f18617e.loadAd();
            loadAd.getClass();
            this.purchase = this.appmetrica.metrica(loadAd, c0534e);
        } finally {
            AbstractC9413e.yandex(c0534e);
        }
    }

    @Override // defpackage.InterfaceC15834e
    public final void vip() {
    }
}
