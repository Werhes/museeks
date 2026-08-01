package defpackage;

import java.util.Arrays;

/* renamed from: eۣؔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2963e implements mopub {
    public static final byte[] advert = new byte[15];
    public final C9562e ad;
    public int adcel;
    public final byte[] appmetrica;
    public byte[] billing;
    public final byte[] license;
    public final byte[] metrica;
    public int mopub;
    public final byte[] purchase;
    public long startapp;
    public final C0683e vip;
    public long yandex;

    /* JADX WARN: Type inference failed for: r1v9, types: [eٍٚ٘, eؘٖٓ] */
    public C2963e() {
        C0683e c0683e = new C0683e();
        this.metrica = new byte[32];
        this.license = new byte[12];
        this.appmetrica = new byte[80];
        this.purchase = new byte[16];
        this.adcel = 0;
        this.ad = new C13806e();
        this.vip = c0683e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[RETURN] */
    @Override // defpackage.mopub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(int r9, int r10, byte[] r11) {
        /*
            r8 = this;
            if (r11 == 0) goto L69
            if (r9 < 0) goto L61
            if (r10 < 0) goto L59
            int r0 = r11.length
            int r0 = r0 - r10
            if (r9 > r0) goto L51
            int r0 = r8.adcel
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L22
            if (r0 == r2) goto L2d
            r1 = 4
            if (r0 == r1) goto L25
            r1 = 5
            r2 = 6
            if (r0 == r1) goto L22
            if (r0 != r2) goto L1c
            goto L2d
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L22:
            r8.adcel = r2
            goto L2d
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "ChaCha20Poly1305 cannot be reused for encryption"
            r9.<init>(r10)
            throw r9
        L2d:
            if (r10 <= 0) goto L50
            long r0 = r8.yandex
            r2 = -9223372036854775808
            long r2 = r2 + r0
            long r4 = (long) r10
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r6 = r6 - r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L48
            long r0 = r0 + r4
            r8.yandex = r0
            eؑۥؓ r0 = r8.vip
            r0.update(r11, r9, r10)
            return
        L48:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Limit exceeded"
            r9.<init>(r10)
            throw r9
        L50:
            return
        L51:
            eؗؐٚ r9 = new eؗؐٚ
            java.lang.String r10 = "Input buffer too short"
            r9.<init>(r10)
            throw r9
        L59:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "'len' cannot be negative"
            r9.<init>(r10)
            throw r9
        L61:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "'inOff' cannot be negative"
            r9.<init>(r10)
            throw r9
        L69:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "'in' cannot be null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2963e.ad(int, int, byte[]):void");
    }

    public final void appmetrica(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i3 > bArr2.length - i2) {
            throw new RuntimeException("Output buffer too short");
        }
        this.ad.processBytes(bArr, i, i2, bArr2, i3);
        long j = this.startapp;
        long j2 = i2;
        if (Long.MIN_VALUE + j > (-9223371761976868928L) - j2) {
            throw new IllegalStateException("Limit exceeded");
        }
        this.startapp = j + j2;
    }

    @Override // defpackage.mopub
    public final int doFinal(byte[] bArr, int i) {
        int i2;
        if (bArr == null) {
            throw new NullPointerException("'out' cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        metrica();
        byte[] bArr2 = this.purchase;
        Arrays.fill(bArr2, (byte) 0);
        int i3 = this.adcel;
        byte[] bArr3 = this.appmetrica;
        C0683e c0683e = this.vip;
        if (i3 == 3) {
            int i4 = this.mopub;
            int i5 = i4 + 16;
            if (i > bArr.length - i5) {
                throw new RuntimeException("Output buffer too short");
            }
            if (i4 > 0) {
                appmetrica(bArr3, 0, i4, bArr, i);
                c0683e.update(bArr, i, this.mopub);
            }
            license(4);
            System.arraycopy(bArr2, 0, bArr, this.mopub + i, 16);
            i2 = i5;
        } else {
            if (i3 != 7) {
                throw new IllegalStateException();
            }
            int i6 = this.mopub;
            if (i6 < 16) {
                throw new Exception("data too short");
            }
            i2 = i6 - 16;
            if (i > bArr.length - i2) {
                throw new RuntimeException("Output buffer too short");
            }
            if (i2 > 0) {
                c0683e.update(bArr3, 0, i2);
                appmetrica(bArr3, 0, i2, bArr, i);
            }
            license(8);
            if (!AbstractC12442e.amazon(16, i2, bArr2, bArr3)) {
                throw new Exception("mac check in ChaCha20Poly1305 failed");
            }
        }
        purchase(false, true);
        return i2;
    }

    @Override // defpackage.mopub
    public final String getAlgorithmName() {
        return "ChaCha20Poly1305";
    }

    @Override // defpackage.mopub
    public final int getOutputSize(int i) {
        int max = Math.max(0, i) + this.mopub;
        int i2 = this.adcel;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return max + 16;
        }
        if (i2 == 5 || i2 == 6 || i2 == 7) {
            return Math.max(0, max - 16);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.mopub
    public final int getUpdateOutputSize(int i) {
        int max = Math.max(0, i) + this.mopub;
        int i2 = this.adcel;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 != 5 && i2 != 6 && i2 != 7) {
                throw new IllegalStateException();
            }
            max = Math.max(0, max - 16);
        }
        return max - (max % 64);
    }

    @Override // defpackage.mopub
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        C11494e c11494e;
        C14915e c14915e;
        byte[] bArr;
        if (interfaceC3894e instanceof smaato) {
            smaato smaatoVar = (smaato) interfaceC3894e;
            int i = smaatoVar.f36457e;
            if (128 != i) {
                throw new IllegalArgumentException(AbstractC1786e.admob(i, "Invalid value for MAC size: "));
            }
            c14915e = smaatoVar.f36455e;
            bArr = AbstractC12442e.license(smaatoVar.f36456e);
            c11494e = new C11494e(c14915e, bArr);
            this.billing = AbstractC12442e.license(smaatoVar.f36458e);
        } else {
            if (!(interfaceC3894e instanceof C11494e)) {
                throw new IllegalArgumentException("invalid parameters passed to ChaCha20Poly1305");
            }
            c11494e = (C11494e) interfaceC3894e;
            c14915e = (C14915e) c11494e.f23094e;
            bArr = c11494e.f23095e;
            this.billing = null;
        }
        if (c14915e == null) {
            if (this.adcel == 0) {
                throw new IllegalArgumentException("Key must be specified in initial init");
            }
        } else if (32 != c14915e.f29591e.length) {
            throw new IllegalArgumentException("Key must be 256 bits");
        }
        if (bArr == null || 12 != bArr.length) {
            throw new IllegalArgumentException("Nonce must be 96 bits");
        }
        int i2 = this.adcel;
        byte[] bArr2 = this.metrica;
        byte[] bArr3 = this.license;
        if (i2 != 0 && z && Arrays.equals(bArr3, bArr) && (c14915e == null || Arrays.equals(bArr2, c14915e.f29591e))) {
            throw new IllegalArgumentException("cannot reuse nonce for ChaCha20Poly1305 encryption");
        }
        if (c14915e != null) {
            byte[] bArr4 = c14915e.f29591e;
            if (bArr4.length != 32) {
                throw new IllegalArgumentException("len");
            }
            System.arraycopy(bArr4, 0, bArr2, 0, 32);
        }
        System.arraycopy(bArr, 0, bArr3, 0, 12);
        this.ad.init(true, c11494e);
        this.adcel = z ? 1 : 5;
        purchase(true, false);
    }

    public final void license(int i) {
        int i2 = ((int) this.startapp) & 15;
        C0683e c0683e = this.vip;
        if (i2 != 0) {
            c0683e.update(advert, 0, 16 - i2);
        }
        byte[] bArr = new byte[16];
        AbstractC3628e.subscription(0, this.yandex, bArr);
        AbstractC3628e.subscription(8, this.startapp, bArr);
        c0683e.update(bArr, 0, 16);
        c0683e.doFinal(this.purchase, 0);
        this.adcel = i;
    }

    public final void metrica() {
        int i;
        int i2 = this.adcel;
        byte[] bArr = advert;
        C0683e c0683e = this.vip;
        switch (i2) {
            case 1:
            case 2:
                int i3 = ((int) this.yandex) & 15;
                if (i3 != 0) {
                    c0683e.update(bArr, 0, 16 - i3);
                }
                i = 3;
                break;
            case 3:
            case 7:
                return;
            case 4:
                throw new IllegalStateException("ChaCha20Poly1305 cannot be reused for encryption");
            case 5:
            case 6:
                int i4 = ((int) this.yandex) & 15;
                if (i4 != 0) {
                    c0683e.update(bArr, 0, 16 - i4);
                }
                i = 7;
                break;
            default:
                throw new IllegalStateException();
        }
        this.adcel = i;
    }

    @Override // defpackage.mopub
    public final int processByte(byte b, byte[] bArr, int i) {
        metrica();
        int i2 = this.adcel;
        C0683e c0683e = this.vip;
        byte[] bArr2 = this.appmetrica;
        if (i2 == 3) {
            int i3 = this.mopub;
            bArr2[i3] = b;
            int i4 = i3 + 1;
            this.mopub = i4;
            if (i4 == 64) {
                appmetrica(bArr2, 0, 64, bArr, i);
                c0683e.update(bArr, i, 64);
                this.mopub = 0;
                return 64;
            }
        } else {
            if (i2 != 7) {
                throw new IllegalStateException();
            }
            int i5 = this.mopub;
            bArr2[i5] = b;
            int i6 = i5 + 1;
            this.mopub = i6;
            if (i6 == bArr2.length) {
                c0683e.update(bArr2, 0, 64);
                appmetrica(bArr2, 0, 64, bArr, i);
                System.arraycopy(bArr2, 64, bArr2, 0, 16);
                this.mopub = 16;
                return 64;
            }
        }
        return 0;
    }

    @Override // defpackage.mopub
    public final int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3;
        byte[] bArr4;
        int i4;
        int i5;
        int i6;
        byte[] bArr5 = bArr;
        int i7 = i;
        int i8 = i2;
        if (bArr5 == null) {
            throw new NullPointerException("'in' cannot be null");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("'inOff' cannot be negative");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        }
        if (i7 > bArr5.length - i8) {
            throw new RuntimeException("Input buffer too short");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("'outOff' cannot be negative");
        }
        if (bArr5 == bArr2 && AbstractC12442e.m3347class(i7, i8, i3, getUpdateOutputSize(i8))) {
            bArr5 = new byte[i8];
            System.arraycopy(bArr2, i7, bArr5, 0, i8);
            i7 = 0;
        }
        byte[] bArr6 = bArr5;
        metrica();
        int i9 = this.adcel;
        C0683e c0683e = this.vip;
        byte[] bArr7 = this.appmetrica;
        if (i9 != 3) {
            if (i9 != 7) {
                throw new IllegalStateException();
            }
            int i10 = 0;
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = this.mopub;
                bArr7[i12] = bArr6[i7 + i11];
                int i13 = i12 + 1;
                this.mopub = i13;
                if (i13 == bArr7.length) {
                    c0683e.update(bArr7, 0, 64);
                    appmetrica(bArr7, 0, 64, bArr2, i3 + i10);
                    System.arraycopy(bArr7, 64, bArr7, 0, 16);
                    this.mopub = 16;
                    i10 += 64;
                }
            }
            return i10;
        }
        if (this.mopub != 0) {
            while (i8 > 0) {
                i4 = i8 - 1;
                int i14 = this.mopub;
                int i15 = i7 + 1;
                bArr7[i14] = bArr6[i7];
                int i16 = i14 + 1;
                this.mopub = i16;
                if (i16 == 64) {
                    byte[] bArr8 = bArr7;
                    bArr4 = bArr2;
                    appmetrica(bArr8, 0, 64, bArr4, i3);
                    bArr3 = bArr8;
                    c0683e.update(bArr4, i3, 64);
                    this.mopub = 0;
                    i6 = i15;
                    i5 = 64;
                    break;
                }
                i8 = i4;
                i7 = i15;
                bArr7 = bArr7;
            }
        }
        bArr3 = bArr7;
        bArr4 = bArr2;
        i4 = i8;
        i5 = 0;
        i6 = i7;
        while (i4 >= 64) {
            int i17 = i3 + i5;
            appmetrica(bArr6, i6, 64, bArr4, i17);
            c0683e.update(bArr4, i17, 64);
            i6 += 64;
            i4 -= 64;
            i5 += 64;
        }
        if (i4 > 0) {
            System.arraycopy(bArr6, i6, bArr3, 0, i4);
            this.mopub = i4;
        }
        return i5;
    }

    public final void purchase(boolean z, boolean z2) {
        Arrays.fill(this.appmetrica, (byte) 0);
        if (z) {
            Arrays.fill(this.purchase, (byte) 0);
        }
        this.yandex = 0L;
        this.startapp = 0L;
        this.mopub = 0;
        switch (this.adcel) {
            case 1:
            case 5:
                break;
            case 2:
            case 3:
            case 4:
                this.adcel = 4;
                return;
            case 6:
            case 7:
            case 8:
                this.adcel = 5;
                break;
            default:
                throw new IllegalStateException();
        }
        if (z2) {
            this.ad.reset();
        }
        byte[] bArr = new byte[64];
        try {
            this.ad.processBytes(bArr, 0, 64, bArr, 0);
            this.vip.init(new C14915e(bArr, 0, 32));
            Arrays.fill(bArr, (byte) 0);
            byte[] bArr2 = this.billing;
            if (bArr2 != null) {
                ad(0, bArr2.length, bArr2);
            }
        } catch (Throwable th) {
            Arrays.fill(bArr, (byte) 0);
            throw th;
        }
    }

    @Override // defpackage.mopub
    public final byte[] vip() {
        return AbstractC12442e.license(this.purchase);
    }
}
