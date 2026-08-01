package defpackage;

import java.util.Hashtable;

/* renamed from: eٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15460e implements InterfaceC2227e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final Hashtable f30542e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final byte[] f30543e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f30545e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int[] f30546e = null;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f30544e = f30543e;

    static {
        byte[] bArr = {4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12};
        f30543e = bArr;
        Hashtable hashtable = new Hashtable();
        f30542e = hashtable;
        hashtable.put(AbstractC1433e.billing("Default"), bArr);
        hashtable.put(AbstractC1433e.billing("E-TEST"), new byte[]{4, 2, 15, 5, 9, 1, 0, 8, 14, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, 14, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, 14, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, 14, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, 14, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, 14, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, 14, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, 14, 7, 10, 15, 4, 1, 8});
        hashtable.put(AbstractC1433e.billing("E-A"), new byte[]{9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4});
        hashtable.put(AbstractC1433e.billing("E-B"), new byte[]{8, 4, 11, 1, 3, 5, 0, 9, 2, 14, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, 14, 14, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, 14, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, 14, 3, 8, 3, 2, 6, 4, 13, 14, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, 14, 0, 4, 11, 14, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12});
        hashtable.put(AbstractC1433e.billing("E-C"), new byte[]{1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, 14, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, 14, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, 14, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, 14, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, 14, 6, 15, 10, 7, 12, 9, 11, 1, 8, 14, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, 14, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, 14, 12, 6, 1, 11, 13, 9, 3, 8});
        hashtable.put(AbstractC1433e.billing("E-D"), new byte[]{15, 12, 2, 10, 6, 4, 5, 0, 7, 9, 14, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, 14, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, 14, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, 14, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, 14, 15, 1, 8, 0, 15, 3, 2, 5, 14, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, 14, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, 14});
        hashtable.put(AbstractC1433e.billing("Param-Z"), new byte[]{12, 4, 6, 2, 10, 5, 11, 9, 14, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, 14, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, 14, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, 14, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, 14, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, 14, 0, 8, 14, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, 14, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2});
        hashtable.put(AbstractC1433e.billing("D-TEST"), new byte[]{4, 10, 9, 2, 13, 8, 0, 14, 6, 11, 1, 12, 7, 15, 5, 3, 14, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, 14, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, 14, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, 14, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, 14, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, 14, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, 14, 6, 11, 8, 12});
        hashtable.put(AbstractC1433e.billing("D-A"), new byte[]{10, 4, 5, 6, 8, 1, 3, 7, 13, 12, 14, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, 14, 10, 8, 7, 15, 12, 14, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, 14, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, 14, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, 14, 12, 3, 13, 14, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, 14, 13, 0, 2, 12});
    }

    public C15460e() {
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    public static void appmetrica(int i, int i2, byte[] bArr) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    public static byte[] license(String str) {
        byte[] bArr = (byte[]) f30542e.get(AbstractC1433e.billing(str));
        if (bArr != null) {
            return AbstractC12442e.license(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    public static int vip(int i, byte[] bArr) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    public final int ad(int i, int i2) {
        int i3 = i2 + i;
        byte[] bArr = this.f30544e;
        int i4 = bArr[i3 & 15] + (bArr[((i3 >> 4) & 15) + 16] << 4) + (bArr[((i3 >> 8) & 15) + 32] << 8) + (bArr[((i3 >> 12) & 15) + 48] << 12) + (bArr[((i3 >> 16) & 15) + 64] << 16) + (bArr[((i3 >> 20) & 15) + 80] << 20) + (bArr[((i3 >> 24) & 15) + 96] << 24) + (bArr[((i3 >> 28) & 15) + 112] << 28);
        return (i4 << 11) | (i4 >>> 21);
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        return "GOST28147";
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (interfaceC3894e instanceof C1794e) {
            C1794e c1794e = (C1794e) interfaceC3894e;
            byte[] bArr = c1794e.f4853e;
            if (bArr.length != 128) {
                throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
            }
            this.f30544e = AbstractC12442e.license(bArr);
            InterfaceC3894e interfaceC3894e2 = c1794e.f4854e;
            if (interfaceC3894e2 != null) {
                this.f30546e = metrica(z, ((C14915e) interfaceC3894e2).f29591e);
            }
        } else if (interfaceC3894e instanceof C14915e) {
            this.f30546e = metrica(z, ((C14915e) interfaceC3894e).f29591e);
        } else if (interfaceC3894e != null) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to GOST28147 init - ", interfaceC3894e));
        }
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return 8;
    }

    public final int[] metrica(boolean z, byte[] bArr) {
        this.f30545e = z;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i = 0; i != 8; i++) {
            iArr[i] = vip(i * 4, bArr);
        }
        return iArr;
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int i4;
        int[] iArr = this.f30546e;
        if (iArr == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        int vip = vip(i, bArr);
        int vip2 = vip(i + 4, bArr);
        int i5 = 7;
        if (this.f30545e) {
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = 0;
                while (i7 < 8) {
                    int ad = vip2 ^ ad(vip, iArr[i7]);
                    i7++;
                    int i8 = vip;
                    vip = ad;
                    vip2 = i8;
                }
            }
            i3 = vip2;
            i4 = vip;
            while (i5 > 0) {
                int ad2 = i3 ^ ad(i4, iArr[i5]);
                i5--;
                i3 = i4;
                i4 = ad2;
            }
        } else {
            int i9 = 0;
            while (i9 < 8) {
                int ad3 = vip2 ^ ad(vip, iArr[i9]);
                i9++;
                int i10 = vip;
                vip = ad3;
                vip2 = i10;
            }
            i3 = vip2;
            i4 = vip;
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = 7;
                while (i12 >= 0 && (i11 != 2 || i12 != 0)) {
                    int ad4 = i3 ^ ad(i4, iArr[i12]);
                    i12--;
                    i3 = i4;
                    i4 = ad4;
                }
            }
        }
        int ad5 = i3 ^ ad(i4, iArr[0]);
        appmetrica(i4, i2, bArr2);
        appmetrica(ad5, i2 + 4, bArr2);
        return 8;
    }
}
