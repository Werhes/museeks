package defpackage;

import java.util.Arrays;

/* renamed from: eُؙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10847e extends AbstractC17551e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f21483e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f21484e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f21485e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f21486e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC2227e f21487e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f21488e;

    public C10847e(InterfaceC2227e interfaceC2227e) {
        super(interfaceC2227e);
        this.f21487e = interfaceC2227e;
        this.f21485e = new byte[interfaceC2227e.isPro()];
        this.f21484e = new byte[interfaceC2227e.isPro()];
        this.f21486e = new byte[interfaceC2227e.isPro()];
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        return this.f21487e.getAlgorithmName() + "/KCTR";
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        this.f21488e = true;
        if (!(interfaceC3894e instanceof C11494e)) {
            throw new IllegalArgumentException("invalid parameter passed");
        }
        C11494e c11494e = (C11494e) interfaceC3894e;
        byte[] bArr = c11494e.f23095e;
        byte[] bArr2 = this.f21485e;
        int length = bArr2.length - bArr.length;
        Arrays.fill(bArr2, (byte) 0);
        System.arraycopy(bArr, 0, bArr2, length, bArr.length);
        InterfaceC3894e interfaceC3894e2 = c11494e.f23094e;
        if (interfaceC3894e2 != null) {
            this.f21487e.init(true, interfaceC3894e2);
        }
        reset();
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return this.f21487e.isPro();
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        boolean z = this.f21488e;
        InterfaceC2227e interfaceC2227e = this.f21487e;
        if (z) {
            interfaceC2227e.tapsense(0, 0, this.f21485e, this.f21484e);
        }
        interfaceC2227e.reset();
        this.f21483e = 0;
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int length = bArr.length - i;
        InterfaceC2227e interfaceC2227e = this.f21487e;
        if (length < interfaceC2227e.isPro()) {
            throw new RuntimeException("input buffer too short");
        }
        if (bArr2.length - i2 < interfaceC2227e.isPro()) {
            throw new RuntimeException("output buffer too short");
        }
        processBytes(bArr, i, interfaceC2227e.isPro(), bArr2, i2);
        return interfaceC2227e.isPro();
    }

    @Override // defpackage.AbstractC17551e
    public final byte vip(byte b) {
        int i = this.f21483e;
        byte[] bArr = this.f21484e;
        byte[] bArr2 = this.f21486e;
        if (i != 0) {
            int i2 = i + 1;
            this.f21483e = i2;
            byte b2 = (byte) (b ^ bArr2[i]);
            if (i2 == bArr.length) {
                this.f21483e = 0;
            }
            return b2;
        }
        int i3 = 0;
        while (i3 < bArr.length) {
            int i4 = i3 + 1;
            byte b3 = (byte) (bArr[i3] + 1);
            bArr[i3] = b3;
            if (b3 != 0) {
                break;
            }
            i3 = i4;
        }
        this.f21487e.tapsense(0, 0, bArr, bArr2);
        int i5 = this.f21483e;
        this.f21483e = i5 + 1;
        return (byte) (b ^ bArr2[i5]);
    }
}
