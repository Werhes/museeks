package defpackage;

/* renamed from: eؒ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1364e extends AbstractC0821e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f4155e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f4156e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final byte[] f4157e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f4158e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f4159e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f4160e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f4161e;

    public C1364e(C1364e c1364e, int i) {
        super(c1364e.f3209e, true);
        this.f4156e = c1364e.f4156e;
        this.f4161e = c1364e.f4161e;
        this.f4160e = c1364e.f4160e;
        this.f4158e = c1364e.f4158e;
        this.f4155e = c1364e.f4155e;
        this.f4157e = c1364e.f4157e;
        this.f4159e = i;
    }

    public C1364e(C12532e c12532e, byte[] bArr, C0957e c0957e) {
        super((Object) c12532e, true);
        C14154e ad = c12532e.ad();
        int i = ad.yandex;
        int i2 = ad.startapp;
        if (bArr.length == 64) {
            byte[][] vip = ad.vip(AbstractC12442e.admob(0, 32, bArr), AbstractC12442e.admob(32, bArr.length, bArr));
            this.f4156e = vip[2];
            this.f4158e = vip[3];
            this.f4155e = vip[4];
            this.f4161e = vip[0];
            this.f4160e = vip[1];
            this.f4157e = vip[5];
        } else {
            this.f4156e = AbstractC12442e.admob(0, i2, bArr);
            this.f4161e = AbstractC12442e.admob(i2, (i2 + i) - 32, bArr);
            int i3 = (i - 32) + i2;
            int i4 = i3 + 32;
            this.f4160e = AbstractC12442e.admob(i3, i4, bArr);
            int i5 = i3 + 64;
            this.f4158e = AbstractC12442e.admob(i4, i5, bArr);
            this.f4155e = AbstractC12442e.admob(i5, i3 + 96, bArr);
            this.f4157e = null;
        }
        if (c0957e != null && (!AbstractC12442e.loadAd(this.f4161e, c0957e.f3395e) || !AbstractC12442e.loadAd(this.f4160e, c0957e.f3396e))) {
            throw new IllegalArgumentException("passed in public key does not match private values");
        }
        this.f4159e = this.f4157e != null ? 0 : 2;
    }

    public C1364e(C12532e c12532e, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super((Object) c12532e, true);
        this.f4156e = AbstractC12442e.license(bArr);
        this.f4158e = AbstractC12442e.license(bArr2);
        this.f4155e = AbstractC12442e.license(bArr3);
        this.f4161e = AbstractC12442e.license(bArr4);
        this.f4160e = AbstractC12442e.license(bArr5);
        this.f4157e = AbstractC12442e.license(bArr6);
        this.f4159e = 0;
    }

    public final byte[] getEncoded() {
        return AbstractC12442e.smaato(new byte[][]{this.f4156e, this.f4161e, this.f4160e, this.f4158e, this.f4155e});
    }

    public final C1364e metrica(int i) {
        if (this.f4159e == i) {
            return this;
        }
        if (i == 0 || i == 1) {
            if (this.f4157e == null) {
                throw new IllegalStateException("no seed available");
            }
        } else if (i != 2) {
            throw new IllegalArgumentException("unknown format");
        }
        return new C1364e(this, i);
    }
}
