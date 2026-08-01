package defpackage;

/* renamed from: eؚْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13252e extends AbstractC0821e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f26287e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f26288e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final byte[] f26289e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final byte[] f26290e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int f26291e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f26292e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final byte[] f26293e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f26294e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f26295e;

    public C13252e(C3456e c3456e, byte[] bArr, C15968e c15968e) {
        super((Object) c3456e, true);
        C6831e ad = c3456e.ad(null);
        int i = ad.purchase;
        int i2 = ad.appmetrica;
        if (bArr.length == 32) {
            byte[][] vip = ad.vip(bArr);
            this.f26288e = vip[0];
            this.f26292e = vip[1];
            this.f26287e = vip[2];
            this.f26295e = vip[3];
            this.f26294e = vip[4];
            this.f26290e = vip[5];
            this.f26293e = vip[6];
            this.f26289e = vip[7];
        } else {
            byte[] admob = AbstractC12442e.admob(0, 32, bArr);
            this.f26288e = admob;
            this.f26292e = AbstractC12442e.admob(32, 64, bArr);
            this.f26287e = AbstractC12442e.admob(64, 128, bArr);
            int i3 = (ad.billing * i2) + 128;
            byte[] admob2 = AbstractC12442e.admob(128, i3, bArr);
            this.f26295e = admob2;
            int i4 = (i2 * i) + i3;
            byte[] admob3 = AbstractC12442e.admob(i3, i4, bArr);
            this.f26294e = admob3;
            byte[] admob4 = AbstractC12442e.admob(i4, (i * 416) + i4, bArr);
            this.f26290e = admob4;
            C2691e c2691e = new C2691e(ad);
            C9770e c9770e = new C9770e(ad);
            C12916e c12916e = new C12916e(ad);
            C12916e c12916e2 = new C12916e(ad);
            C12916e c12916e3 = new C12916e(ad);
            AbstractC11267e.yandex(c12916e3, c9770e, c12916e, admob4, admob2, admob3, ad);
            c2691e.m1043interface(admob);
            C9770e c9770e2 = new C9770e(ad);
            c9770e.amazon(c9770e2);
            c9770e2.ads();
            c2691e.m1046throw(c12916e2, c9770e2);
            c12916e2.m3414class();
            c12916e2.ads();
            c12916e2.adcel(c12916e);
            c12916e2.admob();
            c12916e2.firebase(c12916e3);
            this.f26293e = AbstractC11267e.billing(c12916e2, ad);
            this.f26289e = null;
        }
        if (c15968e != null && !AbstractC12442e.loadAd(this.f26293e, AbstractC12442e.license(c15968e.f31483e))) {
            throw new IllegalArgumentException("passed in public key does not match private values");
        }
        this.f26291e = this.f26289e != null ? 0 : 2;
    }

    public C13252e(C3456e c3456e, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        super((Object) c3456e, true);
        this.f26288e = AbstractC12442e.license(bArr);
        this.f26292e = AbstractC12442e.license(bArr2);
        this.f26287e = AbstractC12442e.license(bArr3);
        this.f26295e = AbstractC12442e.license(bArr4);
        this.f26294e = AbstractC12442e.license(bArr5);
        this.f26290e = AbstractC12442e.license(bArr6);
        this.f26293e = AbstractC12442e.license(bArr7);
        this.f26289e = AbstractC12442e.license(bArr8);
        this.f26291e = bArr8 != null ? 0 : 2;
    }

    public C13252e(C13252e c13252e, int i) {
        super(c13252e.f3209e, true);
        this.f26288e = c13252e.f26288e;
        this.f26292e = c13252e.f26292e;
        this.f26287e = c13252e.f26287e;
        this.f26295e = c13252e.f26295e;
        this.f26294e = c13252e.f26294e;
        this.f26290e = c13252e.f26290e;
        this.f26293e = c13252e.f26293e;
        this.f26289e = c13252e.f26289e;
        this.f26291e = i;
    }

    public final byte[] getEncoded() {
        return AbstractC12442e.smaato(new byte[][]{this.f26288e, this.f26292e, this.f26287e, this.f26295e, this.f26294e, this.f26290e});
    }

    public final C13252e metrica(int i) {
        if (this.f26291e == i) {
            return this;
        }
        if (i == 0 || i == 1) {
            if (this.f26289e == null) {
                throw new IllegalStateException("no seed available");
            }
        } else if (i != 2) {
            throw new IllegalArgumentException("unknown format");
        }
        return new C13252e(this, i);
    }
}
