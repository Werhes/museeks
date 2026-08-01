package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: eُۥؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11374e implements InterfaceC1196e, InterfaceC0554e, InterfaceC6931e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int[] f22887e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f22888e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f22889e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int[] f22890e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f22891e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public long f22892e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int[] f22893e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f22894e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f22895e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f22896e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f22897e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int[] f22898e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f22899e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f22900e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Stack f22901e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f22902e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final byte[] f22886e = {2, 6, 3, 10, 7, 0, 4, 13, 1, 11, 12, 5, 9, 14, 15, 8};

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final int[] f22885e = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    public C11374e() {
        this.f22900e = new byte[64];
        int[] iArr = new int[8];
        this.f22893e = iArr;
        this.f22890e = new int[8];
        this.f22898e = new int[16];
        this.f22887e = new int[16];
        this.f22902e = new byte[16];
        this.f22901e = new Stack();
        this.f22896e = 32;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
        System.arraycopy(f22885e, 0, iArr, 0, 8);
        this.f22897e = 0;
    }

    public C11374e(C11374e c11374e) {
        this.f22900e = new byte[64];
        this.f22893e = new int[8];
        this.f22890e = new int[8];
        this.f22898e = new int[16];
        this.f22887e = new int[16];
        this.f22902e = new byte[16];
        this.f22901e = new Stack();
        this.f22896e = c11374e.f22896e;
        vip(c11374e);
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C11374e(this);
    }

    public final void adcel() {
        int[] iArr = this.f22898e;
        int i = iArr[15] | 8;
        iArr[15] = i;
        this.f22889e = i;
        this.f22888e = iArr[14];
        this.f22892e = 0L;
        this.f22899e = true;
        this.f22891e = -1L;
        System.arraycopy(iArr, 0, this.f22890e, 0, 8);
    }

    public final void appmetrica(int i, byte[] bArr) {
        int[] iArr;
        Stack stack;
        purchase(64, false);
        int[] iArr2 = this.f22887e;
        AbstractC3628e.smaato(i, bArr, iArr2);
        license();
        if (this.f22894e == 0) {
            long j = this.f22892e;
            while (true) {
                iArr = this.f22890e;
                stack = this.f22901e;
                if (j <= 0 || (j & 1) == 1) {
                    break;
                }
                System.arraycopy((int[]) stack.pop(), 0, iArr2, 0, 8);
                System.arraycopy(iArr, 0, iArr2, 8, 8);
                billing();
                license();
                j >>= 1;
            }
            int[] iArr3 = new int[8];
            System.arraycopy(iArr, 0, iArr3, 0, Math.min(iArr.length, 8));
            stack.push(iArr3);
        }
    }

    public final void billing() {
        int[] iArr = this.f22893e;
        int[] iArr2 = this.f22898e;
        System.arraycopy(iArr, 0, iArr2, 0, 8);
        System.arraycopy(f22885e, 0, iArr2, 8, 4);
        iArr2[12] = 0;
        iArr2[13] = 0;
        iArr2[14] = 64;
        iArr2[15] = this.f22897e | 4;
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        int i2 = this.f22896e;
        metrica(i, i2, bArr);
        return i2;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "BLAKE3";
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return 64;
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f22896e;
    }

    public final void license() {
        byte[] bArr;
        byte b = 0;
        while (true) {
            bArr = this.f22902e;
            if (b >= bArr.length) {
                break;
            }
            bArr[b] = b;
            b = (byte) (b + 1);
        }
        int i = 0;
        while (true) {
            startapp();
            if (i >= 6) {
                break;
            }
            for (byte b2 = 0; b2 < bArr.length; b2 = (byte) (b2 + 1)) {
                bArr[b2] = f22886e[bArr[b2]];
            }
            i++;
        }
        boolean z = this.f22899e;
        int[] iArr = this.f22890e;
        int[] iArr2 = this.f22898e;
        if (!z) {
            for (int i2 = 0; i2 < 8; i2++) {
                iArr[i2] = iArr2[i2] ^ iArr2[i2 + 8];
            }
            return;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i3 + 8;
            iArr2[i3] = iArr2[i3] ^ iArr2[i4];
            iArr2[i4] = iArr2[i4] ^ iArr[i3];
        }
        AbstractC3628e.startapp(this.f22900e, iArr2);
        this.f22895e = 0;
    }

    @Override // defpackage.InterfaceC6931e
    public final int metrica(int i, int i2, byte[] bArr) {
        int i3;
        if (i > bArr.length - i2) {
            throw new RuntimeException("output buffer too short");
        }
        boolean z = this.f22899e;
        int[] iArr = this.f22890e;
        byte[] bArr2 = this.f22900e;
        if (!z) {
            purchase(this.f22895e, true);
            int[] iArr2 = this.f22887e;
            AbstractC3628e.smaato(0, bArr2, iArr2);
            license();
            while (true) {
                Stack stack = this.f22901e;
                if (stack.isEmpty()) {
                    break;
                }
                System.arraycopy((int[]) stack.pop(), 0, iArr2, 0, 8);
                System.arraycopy(iArr, 0, iArr2, 8, 8);
                billing();
                if (stack.isEmpty()) {
                    adcel();
                }
                license();
            }
        }
        if (i2 >= 0) {
            long j = this.f22891e;
            if (j < 0 || i2 <= j) {
                int i4 = this.f22895e;
                if (i4 < 64) {
                    int min = Math.min(i2, 64 - i4);
                    System.arraycopy(bArr2, this.f22895e, bArr, i, min);
                    this.f22895e += min;
                    i += min;
                    i3 = i2 - min;
                } else {
                    i3 = i2;
                }
                while (i3 > 0) {
                    this.f22892e++;
                    int[] iArr3 = this.f22898e;
                    System.arraycopy(iArr, 0, iArr3, 0, 8);
                    System.arraycopy(f22885e, 0, iArr3, 8, 4);
                    long j2 = this.f22892e;
                    iArr3[12] = (int) j2;
                    iArr3[13] = (int) (j2 >> 32);
                    iArr3[14] = this.f22888e;
                    iArr3[15] = this.f22889e;
                    license();
                    int min2 = Math.min(i3, 64);
                    System.arraycopy(bArr2, 0, bArr, i, min2);
                    this.f22895e += min2;
                    i += min2;
                    i3 -= min2;
                }
                this.f22891e -= i2;
                reset();
                return i2;
            }
        }
        throw new IllegalArgumentException("Insufficient bytes remaining");
    }

    public final void purchase(int i, boolean z) {
        int[] iArr = this.f22894e == 0 ? this.f22893e : this.f22890e;
        int[] iArr2 = this.f22898e;
        System.arraycopy(iArr, 0, iArr2, 0, 8);
        System.arraycopy(f22885e, 0, iArr2, 8, 4);
        long j = this.f22892e;
        iArr2[12] = (int) j;
        iArr2[13] = (int) (j >> 32);
        iArr2[14] = i;
        int i2 = this.f22897e;
        int i3 = this.f22894e;
        int i4 = i2 + (i3 == 0 ? 1 : 0) + (z ? 2 : 0);
        iArr2[15] = i4;
        int i5 = i3 + i;
        this.f22894e = i5;
        if (i5 >= 1024) {
            this.f22892e = j + 1;
            this.f22894e = 0;
            iArr2[15] = i4 | 2;
        }
        if (z && this.f22901e.isEmpty()) {
            adcel();
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        this.f22892e = 0L;
        this.f22894e = 0;
        this.f22895e = 0;
        this.f22899e = false;
        Arrays.fill(this.f22900e, (byte) 0);
    }

    public final void startapp() {
        yandex(0, 0, 4, 8, 12);
        yandex(1, 1, 5, 9, 13);
        yandex(2, 2, 6, 10, 14);
        yandex(3, 3, 7, 11, 15);
        yandex(4, 0, 5, 10, 15);
        yandex(5, 1, 6, 11, 12);
        yandex(6, 2, 7, 8, 13);
        yandex(7, 3, 4, 9, 14);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        if (this.f22899e) {
            throw new IllegalStateException("Already outputting");
        }
        byte[] bArr = this.f22900e;
        if (bArr.length - this.f22895e == 0) {
            appmetrica(0, bArr);
            Arrays.fill(bArr, (byte) 0);
            this.f22895e = 0;
        }
        int i = this.f22895e;
        bArr[i] = b;
        this.f22895e = i + 1;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        if (this.f22899e) {
            throw new IllegalStateException("Already outputting");
        }
        int i4 = this.f22895e;
        byte[] bArr2 = this.f22900e;
        if (i4 != 0) {
            i3 = 64 - i4;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.f22895e += i2;
                return;
            } else {
                System.arraycopy(bArr, i, bArr2, i4, i3);
                appmetrica(0, bArr2);
                this.f22895e = 0;
                Arrays.fill(bArr2, (byte) 0);
            }
        } else {
            i3 = 0;
        }
        int i5 = (i + i2) - 64;
        int i6 = i3 + i;
        while (i6 < i5) {
            appmetrica(i6, bArr);
            i6 += 64;
        }
        int i7 = (i2 - i6) + i;
        System.arraycopy(bArr, i6, bArr2, 0, i7);
        this.f22895e += i7;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        C11374e c11374e = (C11374e) interfaceC0554e;
        this.f22892e = c11374e.f22892e;
        this.f22894e = c11374e.f22894e;
        this.f22897e = c11374e.f22897e;
        this.f22899e = c11374e.f22899e;
        this.f22891e = c11374e.f22891e;
        this.f22889e = c11374e.f22889e;
        this.f22888e = c11374e.f22888e;
        int[] iArr = c11374e.f22890e;
        int[] iArr2 = this.f22890e;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = c11374e.f22893e;
        int[] iArr4 = this.f22893e;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        int[] iArr5 = c11374e.f22887e;
        int[] iArr6 = this.f22887e;
        System.arraycopy(iArr5, 0, iArr6, 0, iArr6.length);
        Stack stack = this.f22901e;
        stack.clear();
        Iterator it = c11374e.f22901e.iterator();
        while (it.hasNext()) {
            stack.push(AbstractC12442e.appmetrica((int[]) it.next()));
        }
        byte[] bArr = c11374e.f22900e;
        byte[] bArr2 = this.f22900e;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f22895e = c11374e.f22895e;
    }

    public final void yandex(int i, int i2, int i3, int i4, int i5) {
        int i6 = i << 1;
        int[] iArr = this.f22898e;
        int i7 = iArr[i2];
        int i8 = iArr[i3];
        int i9 = i6 + 1;
        byte[] bArr = this.f22902e;
        byte b = bArr[i6];
        int[] iArr2 = this.f22887e;
        int i10 = i8 + iArr2[b] + i7;
        iArr[i2] = i10;
        int rotateRight = Integer.rotateRight(iArr[i5] ^ i10, 16);
        iArr[i5] = rotateRight;
        int i11 = iArr[i4] + rotateRight;
        iArr[i4] = i11;
        int rotateRight2 = Integer.rotateRight(iArr[i3] ^ i11, 12);
        iArr[i3] = rotateRight2;
        int i12 = rotateRight2 + iArr2[bArr[i9]] + iArr[i2];
        iArr[i2] = i12;
        int rotateRight3 = Integer.rotateRight(i12 ^ iArr[i5], 8);
        iArr[i5] = rotateRight3;
        int i13 = iArr[i4] + rotateRight3;
        iArr[i4] = i13;
        iArr[i3] = Integer.rotateRight(iArr[i3] ^ i13, 7);
    }
}
