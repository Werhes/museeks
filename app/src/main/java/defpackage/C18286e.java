package defpackage;

import java.util.Arrays;

/* renamed from: eٟ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18286e extends AbstractC17551e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f35742e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f35743e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f35744e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f35745e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f35746e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f35747e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC2227e f35748e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f35749e;

    public C18286e(InterfaceC2227e interfaceC2227e, int i) {
        super(interfaceC2227e);
        this.f35748e = null;
        if (i > interfaceC2227e.isPro() * 8 || i < 8 || i % 8 != 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("CFB", i, " not supported"));
        }
        this.f35748e = interfaceC2227e;
        int i2 = i / 8;
        this.f35749e = i2;
        this.f35744e = new byte[interfaceC2227e.isPro()];
        this.f35743e = new byte[interfaceC2227e.isPro()];
        this.f35746e = new byte[interfaceC2227e.isPro()];
        this.f35742e = new byte[i2];
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        return this.f35748e.getAlgorithmName() + "/CFB" + (this.f35749e * 8);
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        this.f35745e = z;
        boolean z2 = interfaceC3894e instanceof C11494e;
        InterfaceC2227e interfaceC2227e = this.f35748e;
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
        byte[] bArr2 = this.f35744e;
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
        return this.f35749e;
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        byte[] bArr = this.f35743e;
        byte[] bArr2 = this.f35744e;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        Arrays.fill(this.f35742e, (byte) 0);
        this.f35747e = 0;
        this.f35748e.reset();
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        processBytes(bArr, i, this.f35749e, bArr2, i2);
        return this.f35749e;
    }

    @Override // defpackage.AbstractC17551e
    public final byte vip(byte b) {
        boolean z = this.f35745e;
        InterfaceC2227e interfaceC2227e = this.f35748e;
        byte[] bArr = this.f35743e;
        byte[] bArr2 = this.f35746e;
        byte[] bArr3 = this.f35742e;
        int i = this.f35749e;
        if (z) {
            if (this.f35747e == 0) {
                interfaceC2227e.tapsense(0, 0, bArr, bArr2);
            }
            int i2 = this.f35747e;
            byte b2 = (byte) (b ^ bArr2[i2]);
            int i3 = i2 + 1;
            this.f35747e = i3;
            bArr3[i2] = b2;
            if (i3 == i) {
                this.f35747e = 0;
                System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                System.arraycopy(bArr3, 0, bArr, bArr.length - i, i);
            }
            return b2;
        }
        if (this.f35747e == 0) {
            interfaceC2227e.tapsense(0, 0, bArr, bArr2);
        }
        int i4 = this.f35747e;
        bArr3[i4] = b;
        int i5 = i4 + 1;
        this.f35747e = i5;
        byte b3 = (byte) (b ^ bArr2[i4]);
        if (i5 == i) {
            this.f35747e = 0;
            System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
            System.arraycopy(bArr3, 0, bArr, bArr.length - i, i);
        }
        return b3;
    }
}
