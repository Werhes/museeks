package defpackage;

import java.io.Serializable;

/* renamed from: eٕٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15639e implements InterfaceC2227e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f30839e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f30840e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f30841e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f30842e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f30843e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f30844e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Serializable f30845e;

    public void ad(byte[] bArr) {
        byte[] bArr2 = (byte[]) this.f30839e;
        int i = this.f30843e - this.f30841e;
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr2, bArr2.length - i, bArr3, 0, i);
        System.arraycopy(bArr3, 0, (byte[]) this.f30839e, 0, i);
        System.arraycopy(bArr, 0, (byte[]) this.f30839e, i, this.f30843e - i);
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return "GOST3412_2015/CBC";
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        r0.init(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r7 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r7 != null) goto L13;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[], java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[], java.lang.Object, java.io.Serializable] */
    @Override // defpackage.InterfaceC2227e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(boolean r6, defpackage.InterfaceC3894e r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f30844e
            eؑٞۛ r0 = (defpackage.C0462e) r0
            int r1 = r5.f30841e
            r5.f30842e = r6
            boolean r2 = r7 instanceof defpackage.C11494e
            r3 = 0
            if (r2 == 0) goto L3a
            eِٟؔ r7 = (defpackage.C11494e) r7
            byte[] r2 = r7.f23095e
            int r4 = r2.length
            if (r4 < r1) goto L32
            int r1 = r2.length
            r5.f30843e = r1
            byte[] r4 = new byte[r1]
            r5.f30839e = r4
            byte[] r1 = new byte[r1]
            r5.f30845e = r1
            byte[] r1 = defpackage.AbstractC12442e.license(r2)
            r5.f30845e = r1
            java.lang.Object r2 = r5.f30839e
            byte[] r2 = (byte[]) r2
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r3, r2, r3, r4)
            eٟؖؖ r7 = r7.f23094e
            if (r7 == 0) goto L4d
            goto L4a
        L32:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Parameter m must blockSize <= m"
            r6.<init>(r7)
            throw r6
        L3a:
            r5.f30843e = r1
            byte[] r2 = new byte[r1]
            r5.f30839e = r2
            byte[] r1 = new byte[r1]
            r5.f30845e = r1
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r3, r2, r3, r4)
            if (r7 == 0) goto L4d
        L4a:
            r0.init(r6, r7)
        L4d:
            r6 = 1
            r5.f30840e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15639e.init(boolean, eٟؖؖ):void");
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return this.f30841e;
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
        if (this.f30840e) {
            byte[] bArr = (byte[]) this.f30845e;
            System.arraycopy(bArr, 0, (byte[]) this.f30839e, 0, bArr.length);
        }
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        C0462e c0462e = (C0462e) this.f30844e;
        int i3 = this.f30841e;
        if (this.f30842e) {
            byte[] Signature = AbstractC12442e.Signature(i3, (byte[]) this.f30839e);
            if (bArr.length < i3 + i) {
                i3 = bArr.length - i;
            }
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr3, 0, i3);
            byte[] bArr4 = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                bArr4[i4] = (byte) (bArr3[i4] ^ Signature[i4]);
            }
            byte[] bArr5 = new byte[i3];
            c0462e.tapsense(0, 0, bArr4, bArr5);
            System.arraycopy(bArr5, 0, bArr2, i2, i3);
            if (bArr2.length > i2 + i3) {
                ad(bArr5);
            }
            return i3;
        }
        byte[] Signature2 = AbstractC12442e.Signature(i3, (byte[]) this.f30839e);
        if (bArr.length < i3 + i) {
            i3 = bArr.length - i;
        }
        byte[] bArr6 = new byte[i3];
        System.arraycopy(bArr, i, bArr6, 0, i3);
        byte[] bArr7 = new byte[i3];
        c0462e.tapsense(0, 0, bArr6, bArr7);
        byte[] bArr8 = new byte[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            bArr8[i5] = (byte) (bArr7[i5] ^ Signature2[i5]);
        }
        System.arraycopy(bArr8, 0, bArr2, i2, i3);
        if (bArr2.length > i2 + i3) {
            ad(bArr6);
        }
        return i3;
    }
}
