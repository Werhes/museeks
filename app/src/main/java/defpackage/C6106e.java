package defpackage;

import java.math.RoundingMode;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؐۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6106e implements InterfaceC13782e {
    public final InterfaceC5483e ad;
    public final int appmetrica;
    public int billing;
    public final C16975e license;
    public final C18437e metrica;
    public long purchase;
    public final InterfaceC18147e vip;
    public long yandex;

    public C6106e(InterfaceC5483e interfaceC5483e, InterfaceC18147e interfaceC18147e, C18437e c18437e, String str, int i) {
        this.ad = interfaceC5483e;
        this.vip = interfaceC18147e;
        this.metrica = c18437e;
        int i2 = c18437e.ad;
        int i3 = c18437e.vip;
        int i4 = (c18437e.license * i2) / 8;
        int i5 = c18437e.metrica;
        if (i5 != i4) {
            throw C15125e.ad(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int max = Math.max(i4, i6 / 10);
        this.appmetrica = max;
        C11445e c11445e = new C11445e();
        c11445e.smaato = AbstractC8542e.amazon("audio/wav");
        c11445e.amazon = AbstractC8542e.amazon(str);
        c11445e.yandex = i7;
        c11445e.startapp = i7;
        c11445e.loadAd = max;
        c11445e.f23018class = i2;
        c11445e.f23021interface = i3;
        c11445e.f23020goto = i;
        this.license = new C16975e(c11445e);
    }

    @Override // defpackage.InterfaceC13782e
    public final void ad(long j) {
        this.purchase = j;
        this.billing = 0;
        this.yandex = 0L;
    }

    @Override // defpackage.InterfaceC13782e
    public final void metrica(int i, long j) {
        C4401e c4401e = new C4401e(this.metrica, 1, i, j);
        this.ad.pro(c4401e);
        C16975e c16975e = this.license;
        InterfaceC18147e interfaceC18147e = this.vip;
        interfaceC18147e.billing(c16975e);
        interfaceC18147e.license(c4401e.appmetrica);
    }

    @Override // defpackage.InterfaceC13782e
    public final boolean vip(InterfaceC2283e interfaceC2283e, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.billing) < (i2 = this.appmetrica)) {
            int purchase = this.vip.purchase(interfaceC2283e, (int) Math.min(i2 - i, j2), true);
            if (purchase == -1) {
                j2 = 0;
            } else {
                this.billing += purchase;
                j2 -= purchase;
            }
        }
        C18437e c18437e = this.metrica;
        int i3 = c18437e.metrica;
        int i4 = this.billing / i3;
        if (i4 > 0) {
            long j3 = this.purchase;
            long j4 = this.yandex;
            long j5 = c18437e.vip;
            String str = AbstractC9413e.ad;
            long m2555import = j3 + AbstractC9413e.m2555import(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.billing - i5;
            this.vip.ad(m2555import, 1, i5, i6, null);
            this.yandex += i4;
            this.billing = i6;
        }
        return j2 <= 0;
    }
}
