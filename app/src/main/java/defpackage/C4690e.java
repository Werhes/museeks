package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4690e extends AbstractC13109e {
    public C15008e amazon;
    public C18524e loadAd;

    @Override // defpackage.AbstractC13109e
    public final void license(boolean z) {
        super.license(z);
        if (z) {
            this.amazon = null;
            this.loadAd = null;
        }
    }

    @Override // defpackage.AbstractC13109e
    public final boolean metrica(C1292e c1292e, long j, C10312e c10312e) {
        byte[] bArr = c1292e.ad;
        C15008e c15008e = this.amazon;
        if (c15008e == null) {
            C15008e c15008e2 = new C15008e(17, bArr);
            this.amazon = c15008e2;
            C11445e ad = c15008e2.metrica(Arrays.copyOfRange(bArr, 9, c1292e.metrica), null).ad();
            ad.smaato = AbstractC8542e.amazon("audio/ogg");
            c10312e.f20361e = new C16975e(ad);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            C18524e c18524e = this.loadAd;
            if (c18524e != null) {
                c18524e.f36318e = j;
                c10312e.f20360e = c18524e;
            }
            ((C16975e) c10312e.f20361e).getClass();
            return false;
        }
        C16911e metrica = AbstractC8636e.metrica(c1292e);
        C15008e c15008e3 = new C15008e(c15008e.ad, c15008e.vip, c15008e.metrica, c15008e.license, c15008e.appmetrica, c15008e.billing, c15008e.yandex, c15008e.adcel, metrica, c15008e.advert);
        this.amazon = c15008e3;
        C18524e c18524e2 = new C18524e();
        c18524e2.f36317e = c15008e3;
        c18524e2.f36316e = metrica;
        c18524e2.f36318e = -1L;
        c18524e2.f36319e = -1L;
        this.loadAd = c18524e2;
        return true;
    }

    @Override // defpackage.AbstractC13109e
    public final long vip(C1292e c1292e) {
        byte[] bArr = c1292e.ad;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c1292e.m568protected(4);
            c1292e.m569this();
        }
        int startapp = AbstractC1328e.startapp(i, c1292e);
        c1292e.m571try(0);
        return startapp;
    }
}
