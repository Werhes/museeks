package defpackage;

import android.R;
import java.util.Arrays;

/* renamed from: e٘ۛۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18009e implements InterfaceC1196e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final long[] f35303e = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final byte[][] f35304e = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f35305e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public long f35306e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f35307e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public long f35308e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f35309e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long[] f35310e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public long f35311e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f35312e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f35313e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f35314e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final long[] f35315e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f35316e;

    public C18009e(int i) {
        this.f35314e = 64;
        this.f35309e = null;
        this.f35307e = null;
        this.f35312e = null;
        this.f35305e = null;
        this.f35316e = 0;
        this.f35315e = new long[16];
        this.f35310e = null;
        this.f35313e = 0L;
        this.f35308e = 0L;
        this.f35311e = 0L;
        this.f35306e = 0L;
        if (i < 8 || i > 512 || i % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f35305e = new byte[128];
        this.f35314e = i / 8;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        license();
    }

    public C18009e(C18009e c18009e) {
        this.f35314e = 64;
        this.f35309e = null;
        this.f35307e = null;
        this.f35312e = null;
        this.f35305e = null;
        this.f35316e = 0;
        this.f35315e = new long[16];
        this.f35310e = null;
        this.f35313e = 0L;
        this.f35308e = 0L;
        this.f35311e = 0L;
        this.f35306e = 0L;
        this.f35316e = c18009e.f35316e;
        this.f35305e = AbstractC12442e.license(c18009e.f35305e);
        this.f35312e = AbstractC12442e.license(c18009e.f35312e);
        this.f35314e = c18009e.f35314e;
        this.f35310e = AbstractC12442e.purchase(c18009e.f35310e);
        this.f35307e = AbstractC12442e.license(c18009e.f35307e);
        this.f35309e = AbstractC12442e.license(c18009e.f35309e);
        this.f35313e = c18009e.f35313e;
        this.f35308e = c18009e.f35308e;
        this.f35311e = c18009e.f35311e;
    }

    public final void ad(long j, long j2, int i, int i2, int i3, int i4) {
        long[] jArr = this.f35315e;
        long j3 = jArr[i] + jArr[i2] + j;
        jArr[i] = j3;
        long rotateRight = Long.rotateRight(jArr[i4] ^ j3, 32);
        jArr[i4] = rotateRight;
        long j4 = jArr[i3] + rotateRight;
        jArr[i3] = j4;
        long rotateRight2 = Long.rotateRight(jArr[i2] ^ j4, 24);
        jArr[i2] = rotateRight2;
        long j5 = jArr[i] + rotateRight2 + j2;
        jArr[i] = j5;
        long rotateRight3 = Long.rotateRight(jArr[i4] ^ j5, 16);
        jArr[i4] = rotateRight3;
        long j6 = jArr[i3] + rotateRight3;
        jArr[i3] = j6;
        jArr[i2] = Long.rotateRight(jArr[i2] ^ j6, 63);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = this.f35314e;
        if (i > length - i2) {
            throw new RuntimeException("output buffer too short");
        }
        this.f35311e = -1L;
        long j = this.f35313e;
        int i3 = this.f35316e;
        long j2 = j + i3;
        this.f35313e = j2;
        if (i3 > 0 && j2 == 0) {
            this.f35308e++;
        }
        byte[] bArr2 = this.f35305e;
        vip(0, bArr2);
        Arrays.fill(bArr2, (byte) 0);
        Arrays.fill(this.f35315e, 0L);
        int i4 = i2 >>> 3;
        int i5 = i2 & 7;
        long[] jArr = this.f35310e;
        int i6 = i;
        for (int i7 = 0; i7 < i4; i7++) {
            AbstractC3628e.subscription(i6, jArr[i7], bArr);
            i6 += 8;
        }
        if (i5 > 0) {
            byte[] bArr3 = new byte[8];
            AbstractC3628e.subscription(0, this.f35310e[i4], bArr3);
            System.arraycopy(bArr3, 0, bArr, (i + i2) - i5, i5);
        }
        Arrays.fill(this.f35310e, 0L);
        reset();
        return i2;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "BLAKE2b";
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return 128;
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f35314e;
    }

    public final void license() {
        if (this.f35310e == null) {
            this.f35310e = r1;
            long[] jArr = f35303e;
            long j = jArr[4];
            long[] jArr2 = {jArr[0] ^ (this.f35314e | R.attr.theme), jArr[1], jArr[2] ^ 0, jArr[3], j, jArr[5]};
            byte[] bArr = this.f35309e;
            if (bArr != null) {
                jArr2[4] = j ^ AbstractC3628e.loadAd(0, bArr);
                long[] jArr3 = this.f35310e;
                jArr3[5] = jArr3[5] ^ AbstractC3628e.loadAd(8, bArr);
            }
            long[] jArr4 = this.f35310e;
            long j2 = jArr[6];
            jArr4[6] = j2;
            jArr4[7] = jArr[7];
            byte[] bArr2 = this.f35307e;
            if (bArr2 != null) {
                jArr4[6] = j2 ^ AbstractC3628e.loadAd(0, bArr2);
                long[] jArr5 = this.f35310e;
                jArr5[7] = jArr5[7] ^ AbstractC3628e.loadAd(8, bArr2);
            }
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        this.f35316e = 0;
        this.f35311e = 0L;
        this.f35306e = 0L;
        this.f35313e = 0L;
        this.f35308e = 0L;
        this.f35310e = null;
        byte[] bArr = this.f35305e;
        Arrays.fill(bArr, (byte) 0);
        byte[] bArr2 = this.f35312e;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f35316e = 128;
        }
        license();
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f35316e;
        int i2 = 128 - i;
        byte[] bArr = this.f35305e;
        if (i2 != 0) {
            bArr[i] = b;
            this.f35316e = i + 1;
            return;
        }
        long j = this.f35313e + 128;
        this.f35313e = j;
        if (j == 0) {
            this.f35308e++;
        }
        vip(0, bArr);
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = b;
        this.f35316e = 1;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || i2 == 0) {
            return;
        }
        int i4 = this.f35316e;
        byte[] bArr2 = this.f35305e;
        if (i4 != 0) {
            i3 = 128 - i4;
            if (i3 >= i2) {
                System.arraycopy(bArr, i, bArr2, i4, i2);
                this.f35316e += i2;
            }
            System.arraycopy(bArr, i, bArr2, i4, i3);
            long j = this.f35313e + 128;
            this.f35313e = j;
            if (j == 0) {
                this.f35308e++;
            }
            vip(0, bArr2);
            this.f35316e = 0;
            Arrays.fill(bArr2, (byte) 0);
        } else {
            i3 = 0;
        }
        int i5 = i2 + i;
        int i6 = i5 - 128;
        int i7 = i + i3;
        while (i7 < i6) {
            long j2 = this.f35313e + 128;
            this.f35313e = j2;
            if (j2 == 0) {
                this.f35308e++;
            }
            vip(i7, bArr);
            i7 += 128;
        }
        i2 = i5 - i7;
        System.arraycopy(bArr, i7, bArr2, 0, i2);
        this.f35316e += i2;
    }

    public final void vip(int i, byte[] bArr) {
        C18009e c18009e = this;
        long[] jArr = c18009e.f35310e;
        int length = jArr.length;
        int i2 = 0;
        long[] jArr2 = c18009e.f35315e;
        System.arraycopy(jArr, 0, jArr2, 0, length);
        int length2 = c18009e.f35310e.length;
        long[] jArr3 = f35303e;
        System.arraycopy(jArr3, 0, jArr2, length2, 4);
        jArr2[12] = c18009e.f35313e ^ jArr3[4];
        jArr2[13] = c18009e.f35308e ^ jArr3[5];
        jArr2[14] = c18009e.f35311e ^ jArr3[6];
        jArr2[15] = jArr3[7] ^ c18009e.f35306e;
        long[] jArr4 = new long[16];
        AbstractC3628e.Signature(i, bArr, jArr4);
        int i3 = 0;
        while (i3 < 12) {
            byte[][] bArr2 = f35304e;
            byte[] bArr3 = bArr2[i3];
            long[] jArr5 = jArr4;
            int i4 = i3;
            c18009e.ad(jArr4[bArr3[0]], jArr4[bArr3[1]], 0, 4, 8, 12);
            byte[] bArr4 = bArr2[i4];
            ad(jArr5[bArr4[2]], jArr5[bArr4[3]], 1, 5, 9, 13);
            byte[] bArr5 = bArr2[i4];
            ad(jArr5[bArr5[4]], jArr5[bArr5[5]], 2, 6, 10, 14);
            byte[] bArr6 = bArr2[i4];
            ad(jArr5[bArr6[6]], jArr5[bArr6[7]], 3, 7, 11, 15);
            byte[] bArr7 = bArr2[i4];
            ad(jArr5[bArr7[8]], jArr5[bArr7[9]], 0, 5, 10, 15);
            byte[] bArr8 = bArr2[i4];
            ad(jArr5[bArr8[10]], jArr5[bArr8[11]], 1, 6, 11, 12);
            byte[] bArr9 = bArr2[i4];
            ad(jArr5[bArr9[12]], jArr5[bArr9[13]], 2, 7, 8, 13);
            byte[] bArr10 = bArr2[i4];
            long j = jArr5[bArr10[14]];
            long j2 = jArr5[bArr10[15]];
            c18009e = this;
            c18009e.ad(j, j2, 3, 4, 9, 14);
            i3 = i4 + 1;
            jArr4 = jArr5;
        }
        while (true) {
            long[] jArr6 = c18009e.f35310e;
            if (i2 >= jArr6.length) {
                return;
            }
            jArr6[i2] = (jArr6[i2] ^ jArr2[i2]) ^ jArr2[i2 + 8];
            i2++;
        }
    }
}
