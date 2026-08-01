package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0378e {
    public final byte[] ad;
    public boolean appmetrica;
    public C0378e billing;
    public AbstractC5679e license;
    public int metrica;
    public C0378e purchase;
    public int vip;

    public C0378e() {
        this.ad = new byte[8192];
        this.appmetrica = true;
        this.license = null;
    }

    public C0378e(byte[] bArr, int i, int i2, AbstractC5679e abstractC5679e) {
        this.ad = bArr;
        this.vip = i;
        this.metrica = i2;
        this.license = abstractC5679e;
        this.appmetrica = false;
    }

    public final int ad() {
        return this.ad.length - this.metrica;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eؘؚٗ, java.lang.Object] */
    public final C0378e appmetrica() {
        AbstractC5679e abstractC5679e = this.license;
        AbstractC5679e abstractC5679e2 = abstractC5679e;
        if (abstractC5679e == null) {
            C0378e c0378e = AbstractC16402e.ad;
            ?? obj = new Object();
            this.license = obj;
            abstractC5679e2 = obj;
        }
        int i = this.vip;
        int i2 = this.metrica;
        C10447e.license.incrementAndGet((C10447e) abstractC5679e2);
        Unit unit = Unit.INSTANCE;
        return new C0378e(this.ad, i, i2, abstractC5679e2);
    }

    public final void license(C0378e c0378e) {
        c0378e.billing = this;
        c0378e.purchase = this.purchase;
        C0378e c0378e2 = this.purchase;
        if (c0378e2 != null) {
            c0378e2.billing = c0378e;
        }
        this.purchase = c0378e;
    }

    public final byte metrica(int i) {
        return this.ad[this.vip + i];
    }

    public final void purchase(C0378e c0378e, int i) {
        if (!c0378e.appmetrica) {
            throw new IllegalStateException("only owner can write");
        }
        if (c0378e.metrica + i > 8192) {
            AbstractC5679e abstractC5679e = c0378e.license;
            if (abstractC5679e != null && ((C10447e) abstractC5679e).metrica > 0) {
                throw new IllegalArgumentException();
            }
            int i2 = c0378e.metrica;
            int i3 = c0378e.vip;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c0378e.ad;
            AbstractC1660e.admob(bArr, 0, i3, bArr, i2, 2);
            c0378e.metrica -= c0378e.vip;
            c0378e.vip = 0;
        }
        byte[] bArr2 = this.ad;
        byte[] bArr3 = c0378e.ad;
        int i4 = c0378e.metrica;
        int i5 = this.vip;
        AbstractC1660e.smaato(bArr2, i4, i5, bArr3, i5 + i);
        c0378e.metrica += i;
        this.vip += i;
    }

    public final int vip() {
        return this.metrica - this.vip;
    }
}
