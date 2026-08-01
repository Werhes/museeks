package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4710e implements InterfaceC1272e {
    public int adcel;
    public C11016e advert;
    public long amazon;
    public InterfaceC5483e appmetrica;
    public int mopub;
    public InterfaceC18147e purchase;
    public int smaato;
    public C15008e startapp;
    public C17750e yandex;
    public final byte[] ad = new byte[42];
    public final C1292e vip = new C1292e(0, new byte[32768]);
    public final boolean metrica = false;
    public final C14829e license = new C14829e(0);
    public int billing = 0;

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        if (j == 0) {
            this.billing = 0;
        } else {
            C11016e c11016e = this.advert;
            if (c11016e != null) {
                c11016e.ads(j2);
            }
        }
        this.amazon = j2 != 0 ? -1L : 0L;
        this.smaato = 0;
        this.vip.m564extends(0);
    }

    @Override // defpackage.InterfaceC1272e
    public final boolean metrica(InterfaceC2283e interfaceC2283e) {
        C17750e m4119while = new C16089e(13).m4119while(interfaceC2283e, C7931e.license, 0);
        if (m4119while != null) {
            int length = m4119while.ad.length;
        }
        C1292e c1292e = new C1292e(4);
        ((C14446e) interfaceC2283e).billing(c1292e.ad, 0, 4, false);
        return c1292e.subs() == 1716281667;
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.appmetrica = interfaceC5483e;
        this.purchase = interfaceC5483e.Signature(0, 1);
        interfaceC5483e.mopub();
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Type inference failed for: r16v3, types: [eُٕٚ, eٌٕۗ] */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(defpackage.InterfaceC2283e r32, defpackage.C14829e r33) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4710e.vip(eَؔؐ, eٜٔؓ):int");
    }
}
