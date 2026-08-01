package defpackage;

/* renamed from: eؙّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6213e implements InterfaceC2227e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final int[] f12976e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final int[] f12977e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final int[] f12978e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int[] f12979e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long[] f12980e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long[] f12981e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f12982e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long[] f12983e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f12984e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f12985e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final AbstractC11130e f12986e;

    static {
        int[] iArr = new int[80];
        f12977e = iArr;
        f12979e = new int[iArr.length];
        f12976e = new int[iArr.length];
        f12978e = new int[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = f12977e;
            if (i >= iArr2.length) {
                return;
            }
            f12979e[i] = i % 17;
            iArr2[i] = i % 9;
            f12976e[i] = i % 5;
            f12978e[i] = i % 3;
            i++;
        }
    }

    public C6213e(int i) {
        C1805e c1805e;
        long[] jArr = new long[5];
        this.f12983e = jArr;
        int i2 = i / 8;
        this.f12984e = i2;
        int i3 = i2 / 8;
        this.f12982e = i3;
        this.f12981e = new long[i3];
        long[] jArr2 = new long[(i3 * 2) + 1];
        this.f12980e = jArr2;
        if (i == 256) {
            c1805e = new C1805e(1, jArr2, jArr);
        } else if (i == 512) {
            c1805e = new C1805e(2, jArr2, jArr);
        } else {
            if (i != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            c1805e = new C1805e(0, jArr2, jArr);
        }
        this.f12986e = c1805e;
    }

    public static long license(int i, long j, long j2) {
        long j3 = j ^ j2;
        return (j3 << (-i)) | (j3 >>> i);
    }

    public static long metrica(int i, long j, long j2) {
        return ((j >>> (-i)) | (j << i)) ^ j2;
    }

    public final void ad(boolean z, long[] jArr, long[] jArr2) {
        long[] jArr3;
        this.f12985e = z;
        if (jArr != null) {
            int length = jArr.length;
            int i = this.f12982e;
            if (length != i) {
                throw new IllegalArgumentException(AbstractC1634e.smaato("Threefish key must be same size as block (", i, " words)"));
            }
            long j = 2004413935125273122L;
            int i2 = 0;
            while (true) {
                jArr3 = this.f12980e;
                if (i2 >= i) {
                    break;
                }
                long j2 = jArr[i2];
                jArr3[i2] = j2;
                j ^= j2;
                i2++;
            }
            jArr3[i] = j;
            System.arraycopy(jArr3, 0, jArr3, i + 1, i);
        }
        if (jArr2 != null) {
            if (jArr2.length != 2) {
                throw new IllegalArgumentException("Tweak must be 2 words.");
            }
            long j3 = jArr2[0];
            long[] jArr4 = this.f12983e;
            jArr4[0] = j3;
            long j4 = jArr2[1];
            jArr4[1] = j4;
            jArr4[2] = j3 ^ j4;
            jArr4[3] = j3;
            jArr4[4] = j4;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        return "Threefish-" + (this.f12984e * 8);
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        long[] jArr;
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException(AbstractC8703e.remoteconfig("Invalid parameter passed to Threefish init - ", interfaceC3894e));
        }
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        if (bArr != null) {
            int length = bArr.length;
            int i = this.f12984e;
            if (length != i) {
                throw new IllegalArgumentException(AbstractC1634e.smaato("Threefish key must be same size as block (", i, " bytes)"));
            }
            jArr = new long[this.f12982e];
            AbstractC3628e.Signature(0, bArr, jArr);
        } else {
            jArr = null;
        }
        ad(z, jArr, null);
        getAlgorithmName();
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return this.f12984e;
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = this.f12984e;
        if (i + i3 > bArr.length) {
            throw new RuntimeException("Input buffer too short");
        }
        if (i2 + i3 > bArr2.length) {
            throw new RuntimeException("Output buffer too short");
        }
        long[] jArr = this.f12981e;
        AbstractC3628e.Signature(i, bArr, jArr);
        vip(jArr, jArr);
        AbstractC3628e.remoteconfig(i2, bArr2, jArr);
        return i3;
    }

    public final void vip(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.f12980e;
        int i = this.f12982e;
        if (jArr3[i] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i) {
            throw new RuntimeException("Input buffer too short");
        }
        if (jArr2.length != i) {
            throw new RuntimeException("Output buffer too short");
        }
        boolean z = this.f12985e;
        AbstractC11130e abstractC11130e = this.f12986e;
        if (z) {
            abstractC11130e.mo689finally(jArr, jArr2);
        } else {
            abstractC11130e.mo690return(jArr, jArr2);
        }
    }
}
