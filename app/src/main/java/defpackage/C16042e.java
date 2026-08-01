package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16042e implements InterfaceC2227e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Serializable f31594e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f31595e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f31596e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f31597e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f31598e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f31599e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f31600e;

    public static C14851e vip(ArrayDeque arrayDeque, int i, boolean z) {
        C14851e c14851e;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c14851e = null;
                break;
            }
            c14851e = (C14851e) it.next();
            if (c14851e.ad == i && c14851e.metrica == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C14851e c14851e2 = (C14851e) it.next();
            if (z) {
                c14851e2.vip--;
            } else {
                c14851e2.vip++;
            }
        }
        return c14851e;
    }

    public byte ad(byte b, int i) {
        return (byte) (b ^ ((byte[]) this.f31600e)[i]);
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return ((InterfaceC2227e) this.f31599e).getAlgorithmName() + "/OpenPGPCFB";
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        this.f31595e = z;
        reset();
        ((InterfaceC2227e) this.f31599e).init(true, interfaceC3894e);
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return ((InterfaceC2227e) this.f31599e).isPro();
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
        this.f31598e = 0;
        byte[] bArr = (byte[]) this.f31597e;
        byte[] bArr2 = (byte[]) this.f31594e;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        ((InterfaceC2227e) this.f31599e).reset();
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = this.f31596e;
        byte[] bArr3 = (byte[]) this.f31594e;
        InterfaceC2227e interfaceC2227e = (InterfaceC2227e) this.f31599e;
        byte[] bArr4 = (byte[]) this.f31600e;
        int i4 = 0;
        int i5 = 2;
        if (this.f31595e) {
            if (i + i3 > bArr.length) {
                throw new RuntimeException("input buffer too short");
            }
            if (i2 + i3 > bArr2.length) {
                throw new RuntimeException("output buffer too short");
            }
            int i6 = this.f31598e;
            if (i6 > i3) {
                int i7 = i3 - 2;
                byte ad = ad(bArr[i], i7);
                bArr2[i2] = ad;
                bArr3[i7] = ad;
                int i8 = i3 - 1;
                byte ad2 = ad(bArr[i + 1], i8);
                bArr2[i2 + 1] = ad2;
                bArr3[i8] = ad2;
                interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                while (i5 < i3) {
                    int i9 = i5 - 2;
                    byte ad3 = ad(bArr[i + i5], i9);
                    bArr2[i2 + i5] = ad3;
                    bArr3[i9] = ad3;
                    i5++;
                }
            } else {
                if (i6 == 0) {
                    interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                    while (i4 < i3) {
                        byte ad4 = ad(bArr[i + i4], i4);
                        bArr2[i2 + i4] = ad4;
                        bArr3[i4] = ad4;
                        i4++;
                    }
                    this.f31598e += i3;
                    return i3;
                }
                if (i6 == i3) {
                    interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                    bArr2[i2] = ad(bArr[i], 0);
                    bArr2[i2 + 1] = ad(bArr[i + 1], 1);
                    int i10 = i3 - 2;
                    System.arraycopy(bArr3, 2, bArr3, 0, i10);
                    System.arraycopy(bArr2, i2, bArr3, i10, 2);
                    interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                    while (i5 < i3) {
                        int i11 = i5 - 2;
                        byte ad5 = ad(bArr[i + i5], i11);
                        bArr2[i2 + i5] = ad5;
                        bArr3[i11] = ad5;
                        i5++;
                    }
                    this.f31598e += i3;
                }
            }
            return i3;
        }
        if (i + i3 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + i3 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        int i12 = this.f31598e;
        if (i12 > i3) {
            byte b = bArr[i];
            int i13 = i3 - 2;
            bArr3[i13] = b;
            bArr2[i2] = ad(b, i13);
            byte b2 = bArr[i + 1];
            int i14 = i3 - 1;
            bArr3[i14] = b2;
            bArr2[i2 + 1] = ad(b2, i14);
            interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
            while (i5 < i3) {
                byte b3 = bArr[i + i5];
                int i15 = i5 - 2;
                bArr3[i15] = b3;
                bArr2[i2 + i5] = ad(b3, i15);
                i5++;
            }
        } else {
            if (i12 == 0) {
                interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                while (i4 < i3) {
                    int i16 = i + i4;
                    bArr3[i4] = bArr[i16];
                    bArr2[i2 + i4] = ad(bArr[i16], i4);
                    i4++;
                }
                this.f31598e += i3;
                return i3;
            }
            if (i12 == i3) {
                interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                byte b4 = bArr[i];
                byte b5 = bArr[i + 1];
                bArr2[i2] = ad(b4, 0);
                bArr2[i2 + 1] = ad(b5, 1);
                int i17 = i3 - 2;
                System.arraycopy(bArr3, 2, bArr3, 0, i17);
                bArr3[i17] = b4;
                bArr3[i3 - 1] = b5;
                interfaceC2227e.tapsense(0, 0, bArr3, bArr4);
                while (i5 < i3) {
                    byte b6 = bArr[i + i5];
                    int i18 = i5 - 2;
                    bArr3[i18] = b6;
                    bArr2[i2 + i5] = ad(b6, i18);
                    i5++;
                }
                this.f31598e += i3;
            }
        }
        return i3;
    }
}
