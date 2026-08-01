package defpackage;

import android.R;

/* renamed from: eؚٟٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7345e extends AbstractC17551e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f15070e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f15071e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f15072e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f15073e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f15074e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f15075e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f15076e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC2227e f15077e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f15078e;

    public C7345e(InterfaceC2227e interfaceC2227e) {
        super(interfaceC2227e);
        this.f15074e = true;
        this.f15077e = interfaceC2227e;
        int isPro = interfaceC2227e.isPro();
        this.f15078e = isPro;
        if (isPro != 8) {
            throw new IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.f15073e = new byte[interfaceC2227e.isPro()];
        this.f15071e = new byte[interfaceC2227e.isPro()];
        this.f15075e = new byte[interfaceC2227e.isPro()];
    }

    public static void license(int i, int i2, byte[] bArr) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    public static int metrica(int i, byte[] bArr) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        return this.f15077e.getAlgorithmName() + "/GCTR";
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        this.f15074e = true;
        this.f15076e = 0;
        this.f15072e = 0;
        boolean z2 = interfaceC3894e instanceof C11494e;
        InterfaceC2227e interfaceC2227e = this.f15077e;
        if (!z2) {
            reset();
            if (interfaceC3894e != null) {
                interfaceC2227e.init(true, interfaceC3894e);
                return;
            }
            return;
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        byte[] bArr = c11494e.f23095e;
        int length = bArr.length;
        byte[] bArr2 = this.f15073e;
        if (length < bArr2.length) {
            System.arraycopy(bArr, 0, bArr2, bArr2.length - bArr.length, bArr.length);
            for (int i = 0; i < bArr2.length - bArr.length; i++) {
                bArr2[i] = 0;
            }
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }
        reset();
        InterfaceC3894e interfaceC3894e2 = c11494e.f23094e;
        if (interfaceC3894e2 != null) {
            interfaceC2227e.init(true, interfaceC3894e2);
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return this.f15078e;
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        this.f15074e = true;
        this.f15076e = 0;
        this.f15072e = 0;
        byte[] bArr = this.f15071e;
        byte[] bArr2 = this.f15073e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.f15070e = 0;
        this.f15077e.reset();
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        processBytes(bArr, i, this.f15078e, bArr2, i2);
        return this.f15078e;
    }

    @Override // defpackage.AbstractC17551e
    public final byte vip(byte b) {
        int i = this.f15070e;
        byte[] bArr = this.f15075e;
        byte[] bArr2 = this.f15071e;
        if (i == 0) {
            boolean z = this.f15074e;
            InterfaceC2227e interfaceC2227e = this.f15077e;
            if (z) {
                this.f15074e = false;
                interfaceC2227e.tapsense(0, 0, bArr2, bArr);
                this.f15076e = metrica(0, bArr);
                this.f15072e = metrica(4, bArr);
            }
            int i2 = this.f15076e + R.attr.cacheColorHint;
            this.f15076e = i2;
            int i3 = this.f15072e;
            int i4 = i3 + R.attr.hand_minute;
            this.f15072e = i4;
            if (i4 < 16843012 && i4 > 0) {
                this.f15072e = i3 + R.attr.format;
            }
            license(i2, 0, bArr2);
            license(this.f15072e, 4, bArr2);
            interfaceC2227e.tapsense(0, 0, bArr2, bArr);
        }
        int i5 = this.f15070e;
        int i6 = i5 + 1;
        this.f15070e = i6;
        byte b2 = (byte) (b ^ bArr[i5]);
        int i7 = this.f15078e;
        if (i6 == i7) {
            this.f15070e = 0;
            System.arraycopy(bArr2, i7, bArr2, 0, bArr2.length - i7);
            System.arraycopy(bArr, 0, bArr2, bArr2.length - i7, i7);
        }
        return b2;
    }
}
