package defpackage;

/* renamed from: eَؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11570e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f23241e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f23242e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f23245e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f23247e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f23250e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f23251e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f23248e = 0;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f23243e = 0;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f23246e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f23249e = 2;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f23244e = 4;

    public C11570e() {
    }

    public C11570e(int i) {
    }

    public static long license(int i, long j) {
        return (j >>> (-i)) | (j << i);
    }

    public final void ad(int i) {
        long j = this.f23241e;
        long j2 = this.f23251e;
        long j3 = this.f23250e;
        long j4 = this.f23245e;
        for (int i2 = 0; i2 < i; i2++) {
            long j5 = j + j2;
            long j6 = j3 + j4;
            long license = license(13, j2) ^ j5;
            long license2 = license(16, j4) ^ j6;
            long j7 = j6 + license;
            j = license(32, j5) + license2;
            j2 = license(17, license) ^ j7;
            j4 = license(21, license2) ^ j;
            j3 = license(32, j7);
        }
        this.f23241e = j;
        this.f23251e = j2;
        this.f23250e = j3;
        this.f23245e = j4;
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        AbstractC3628e.subscription(0, vip(), bArr);
        return 8;
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return "SipHash-" + this.f23249e + "-" + this.f23244e;
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return 8;
    }

    @Override // defpackage.InterfaceC11306e
    public final void init(InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        if (bArr.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f23242e = AbstractC3628e.loadAd(0, bArr);
        this.f23247e = AbstractC3628e.loadAd(8, bArr);
        reset();
    }

    public final void metrica() {
        this.f23246e++;
        this.f23245e ^= this.f23248e;
        ad(this.f23249e);
        this.f23241e ^= this.f23248e;
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        long j = this.f23242e;
        this.f23241e = 8317987319222330741L ^ j;
        long j2 = this.f23247e;
        this.f23251e = 7237128888997146477L ^ j2;
        this.f23250e = j ^ 7816392313619706465L;
        this.f23245e = 8387220255154660723L ^ j2;
        this.f23248e = 0L;
        this.f23243e = 0;
        this.f23246e = 0;
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte b) {
        this.f23248e = (this.f23248e >>> 8) | ((b & 255) << 56);
        int i = this.f23243e + 1;
        this.f23243e = i;
        if (i == 8) {
            metrica();
            this.f23243e = 0;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = i2 & (-8);
        int i4 = this.f23243e;
        char c = '8';
        long j = 255;
        int i5 = 0;
        if (i4 == 0) {
            while (i5 < i3) {
                this.f23248e = AbstractC3628e.loadAd(i + i5, bArr);
                metrica();
                i5 += 8;
            }
            while (i5 < i2) {
                long j2 = this.f23248e >>> 8;
                this.f23248e = j2;
                this.f23248e = j2 | ((bArr[i + i5] & 255) << 56);
                i5++;
            }
            this.f23243e = i2 - i3;
            return;
        }
        int i6 = i4 << 3;
        int i7 = 0;
        while (i7 < i3) {
            long loadAd = AbstractC3628e.loadAd(i + i7, bArr);
            this.f23248e = (this.f23248e >>> (-i6)) | (loadAd << i6);
            metrica();
            this.f23248e = loadAd;
            i7 += 8;
            c = c;
            j = j;
        }
        char c2 = c;
        long j3 = j;
        while (i7 < i2) {
            long j4 = this.f23248e >>> 8;
            this.f23248e = j4;
            this.f23248e = j4 | ((bArr[i + i7] & j3) << c2);
            int i8 = this.f23243e + 1;
            this.f23243e = i8;
            if (i8 == 8) {
                metrica();
                this.f23243e = 0;
            }
            i7++;
        }
    }

    public long vip() {
        this.f23248e = ((this.f23248e >>> ((7 - this.f23243e) << 3)) >>> 8) | ((((this.f23246e << 3) + r2) & 255) << 56);
        metrica();
        this.f23250e ^= 255;
        ad(this.f23244e);
        long j = ((this.f23241e ^ this.f23251e) ^ this.f23250e) ^ this.f23245e;
        reset();
        return j;
    }
}
