package defpackage;

import java.security.SecureRandom;

/* renamed from: eٟٓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14154e {
    public final C11467e Signature;
    public SecureRandom ad;
    public final int adcel;
    public final int advert;
    public final int amazon;
    public final int appmetrica;
    public final int billing;
    public final int license;
    public final int loadAd;
    public final int metrica;
    public final int mopub;
    public final int purchase;
    public final int smaato;
    public final int startapp;
    public final C4285e vip;
    public final int yandex;

    public C14154e(int i) {
        this.metrica = i;
        if (i == 2) {
            this.billing = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalArgumentException(AbstractC1634e.smaato("K: ", i, " is not supported for Crystals Kyber"));
                }
                this.billing = 2;
                this.appmetrica = 160;
                this.purchase = i * 352;
                this.loadAd = 32;
                int i2 = i * 384;
                this.license = i2;
                int i3 = i2 + 32;
                this.yandex = i3;
                this.startapp = i2;
                int i4 = this.purchase + this.appmetrica;
                this.adcel = i4;
                this.mopub = i3;
                this.advert = i2 + i3 + 64;
                this.smaato = i4;
                this.amazon = i4;
                this.Signature = new C11467e(19);
                this.vip = new C4285e(this);
            }
            this.billing = 2;
        }
        this.appmetrica = 128;
        this.purchase = i * 320;
        this.loadAd = 32;
        int i22 = i * 384;
        this.license = i22;
        int i32 = i22 + 32;
        this.yandex = i32;
        this.startapp = i22;
        int i42 = this.purchase + this.appmetrica;
        this.adcel = i42;
        this.mopub = i32;
        this.advert = i22 + i32 + 64;
        this.smaato = i42;
        this.amazon = i42;
        this.Signature = new C11467e(19);
        this.vip = new C4285e(this);
    }

    public final boolean ad(byte[] bArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.metrica; i2++) {
            int i3 = i2 * 384;
            int i4 = -1;
            for (int i5 = 0; i5 < 128; i5++) {
                int i6 = (i5 * 3) + i3;
                int i7 = bArr[i6] & 255;
                int i8 = bArr[i6 + 1] & 255;
                i4 = i4 & (((short) ((i7 | (i8 << 8)) & 4095)) - 3329) & (((short) ((((bArr[i6 + 2] & 255) << 4) | (i8 >> 4)) & 4095)) - 3329);
            }
            i &= i4;
        }
        return i < 0;
    }

    public final byte[][] vip(byte[] bArr, byte[] bArr2) {
        C4285e c4285e = this.vip;
        C14154e c14154e = (C14154e) c4285e.yandex;
        char c = 5;
        C9831e c9831e = new C9831e(c14154e, 5);
        C9831e c9831e2 = new C9831e(c14154e, 5);
        C9831e c9831e3 = new C9831e(c14154e, 5);
        byte[] bArr3 = new byte[64];
        C11467e c11467e = (C11467e) c4285e.startapp;
        int i = c4285e.ad;
        int length = bArr.length;
        byte[] bArr4 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr4, 0, length);
        bArr4[length] = (byte) i;
        C9147e c9147e = (C9147e) c11467e.f23070e;
        c9147e.purchase(0, bArr4.length, bArr4);
        c9147e.doFinal(bArr3, 0);
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        System.arraycopy(bArr3, 0, bArr5, 0, 32);
        System.arraycopy(bArr3, 32, bArr6, 0, 32);
        C9831e[] c9831eArr = new C9831e[i];
        for (int i2 = 0; i2 < i; i2++) {
            c9831eArr[i2] = new C9831e(c14154e, 5);
        }
        c4285e.license(c9831eArr, bArr5, false);
        int i3 = 0;
        byte b = 0;
        while (i3 < i) {
            ((C9831e[]) c9831e.license)[i3].m2678class(b, bArr6);
            b = (byte) (b + 1);
            i3++;
            c = c;
        }
        char c2 = c;
        for (int i4 = 0; i4 < i; i4++) {
            ((C9831e[]) c9831e3.license)[i4].m2678class(b, bArr6);
            b = (byte) (b + 1);
        }
        c9831e.m2714transient();
        c9831e3.m2714transient();
        for (int i5 = 0; i5 < i; i5++) {
            C9831e.m2671new(((C9831e[]) c9831e2.license)[i5], c9831eArr[i5], c9831e, c14154e);
            C9831e c9831e4 = ((C9831e[]) c9831e2.license)[i5];
            for (int i6 = 0; i6 < 256; i6++) {
                ((short[]) c9831e4.license)[i6] = AbstractC7890e.mopub(((short[]) c9831e4.license)[i6] * 1353);
            }
            c9831e4.getClass();
        }
        for (int i7 = 0; i7 < c9831e2.vip; i7++) {
            ((C9831e[]) c9831e2.license)[i7].billing(((C9831e[]) c9831e3.license)[i7]);
        }
        for (int i8 = 0; i8 < c9831e2.vip; i8++) {
            ((C9831e[]) c9831e2.license)[i8].m2710synchronized();
        }
        byte[] bArr7 = new byte[c4285e.vip];
        byte[] m2679const = c9831e2.m2679const();
        int i9 = c4285e.metrica;
        System.arraycopy(m2679const, 0, bArr7, 0, i9);
        System.arraycopy(bArr5, 0, bArr7, i9, 32);
        byte[][] bArr8 = {bArr7, c9831e.m2679const()};
        int i10 = this.startapp;
        byte[] bArr9 = new byte[i10];
        System.arraycopy(bArr8[1], 0, bArr9, 0, i10);
        byte[] bArr10 = new byte[32];
        byte[] bArr11 = bArr8[0];
        C9147e c9147e2 = (C9147e) this.Signature.f23069e;
        c9147e2.purchase(0, bArr11.length, bArr11);
        c9147e2.doFinal(bArr10, 0);
        int i11 = this.yandex;
        byte[] bArr12 = new byte[i11];
        System.arraycopy(bArr8[0], 0, bArr12, 0, i11);
        int i12 = i11 - 32;
        byte[] admob = AbstractC12442e.admob(0, i12, bArr12);
        byte[] admob2 = AbstractC12442e.admob(i12, i11, bArr12);
        byte[] adcel = AbstractC12442e.adcel(bArr, bArr2);
        byte[][] bArr13 = new byte[6];
        bArr13[0] = admob;
        bArr13[1] = admob2;
        bArr13[2] = bArr9;
        bArr13[3] = bArr10;
        bArr13[4] = bArr2;
        bArr13[c2] = adcel;
        return bArr13;
    }
}
