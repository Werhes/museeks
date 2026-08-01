package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۟ۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9791e extends AbstractC6690e {
    public final AbstractC17475e appmetrica;
    public final int[] billing;
    public final AbstractC17475e purchase;
    public final int[] yandex;

    public C9791e(C1410e c1410e, C1410e c1410e2, int[] iArr) {
        AbstractC2301e.billing(c1410e.f4224e == iArr.length);
        this.appmetrica = c1410e;
        this.purchase = c1410e2;
        this.billing = iArr;
        this.yandex = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.yandex[iArr[i]] = i;
        }
    }

    @Override // defpackage.AbstractC6690e
    public final int ad(boolean z) {
        if (Signature()) {
            return -1;
        }
        if (z) {
            return this.billing[0];
        }
        return 0;
    }

    @Override // defpackage.AbstractC6690e
    public final Object advert(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC6690e
    public final int appmetrica(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == metrica(z)) {
            if (i2 == 2) {
                return ad(z);
            }
            return -1;
        }
        if (!z) {
            return i + 1;
        }
        return this.billing[this.yandex[i] + 1];
    }

    @Override // defpackage.AbstractC6690e
    public final int loadAd() {
        return this.appmetrica.size();
    }

    @Override // defpackage.AbstractC6690e
    public final int metrica(boolean z) {
        if (Signature()) {
            return -1;
        }
        AbstractC17475e abstractC17475e = this.appmetrica;
        if (!z) {
            return abstractC17475e.size() - 1;
        }
        return this.billing[abstractC17475e.size() - 1];
    }

    @Override // defpackage.AbstractC6690e
    public final int mopub(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == ad(z)) {
            if (i2 == 2) {
                return metrica(z);
            }
            return -1;
        }
        if (!z) {
            return i - 1;
        }
        return this.billing[this.yandex[i] - 1];
    }

    @Override // defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        C6158e c6158e2 = (C6158e) this.purchase.get(i);
        c6158e.startapp(c6158e2.ad, c6158e2.vip, c6158e2.metrica, c6158e2.license, c6158e2.appmetrica, c6158e2.billing, c6158e2.purchase);
        return c6158e;
    }

    @Override // defpackage.AbstractC6690e
    public final C11501e smaato(int i, C11501e c11501e, long j) {
        C11501e c11501e2 = (C11501e) this.appmetrica.get(i);
        c11501e.vip(c11501e2.ad, c11501e2.metrica, c11501e2.license, c11501e2.appmetrica, c11501e2.purchase, c11501e2.billing, c11501e2.yandex, c11501e2.startapp, c11501e2.adcel, c11501e2.advert, c11501e2.smaato, c11501e2.amazon, c11501e2.loadAd, c11501e2.Signature);
        c11501e.mopub = c11501e2.mopub;
        return c11501e;
    }

    @Override // defpackage.AbstractC6690e
    public final int vip(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.AbstractC6690e
    public final int yandex() {
        return this.purchase.size();
    }
}
