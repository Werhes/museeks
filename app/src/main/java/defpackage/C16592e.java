package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16592e {
    public final byte[] ad;
    public final boolean appmetrica;
    public C16592e billing;
    public boolean license;
    public int metrica;
    public C16592e purchase;
    public int vip;

    public C16592e() {
        this.ad = new byte[8192];
        this.appmetrica = true;
        this.license = false;
    }

    public C16592e(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.ad = bArr;
        this.vip = i;
        this.metrica = i2;
        this.license = z;
        this.appmetrica = z2;
    }

    public final C16592e ad() {
        C16592e c16592e = this.purchase;
        C16592e c16592e2 = c16592e != this ? c16592e : null;
        C16592e c16592e3 = this.billing;
        c16592e3.purchase = c16592e;
        this.purchase.billing = c16592e3;
        this.purchase = null;
        this.billing = null;
        return c16592e2;
    }

    public final void license(C16592e c16592e, int i) {
        if (!c16592e.appmetrica) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = c16592e.metrica;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c16592e.license) {
                throw new IllegalArgumentException();
            }
            int i4 = c16592e.vip;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c16592e.ad;
            AbstractC1660e.admob(bArr, 0, i4, bArr, i2, 2);
            c16592e.metrica -= c16592e.vip;
            c16592e.vip = 0;
        }
        byte[] bArr2 = c16592e.ad;
        int i5 = c16592e.metrica;
        int i6 = this.vip;
        AbstractC1660e.smaato(this.ad, i5, i6, bArr2, i6 + i);
        c16592e.metrica += i;
        this.vip += i;
    }

    public final C16592e metrica() {
        this.license = true;
        return new C16592e(this.ad, this.vip, this.metrica, true, false);
    }

    public final void vip(C16592e c16592e) {
        c16592e.billing = this;
        c16592e.purchase = this.purchase;
        this.purchase.billing = c16592e;
        this.purchase = c16592e;
    }
}
