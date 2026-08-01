package defpackage;

/* renamed from: eٕۡۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15790e extends AbstractC17551e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final byte[] f31102e = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f31103e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C11494e f31104e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C18286e f31105e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C14915e f31106e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f31107e;

    public C15790e(InterfaceC2227e interfaceC2227e) {
        super(interfaceC2227e);
        this.f31103e = 0L;
        this.f31105e = new C18286e(interfaceC2227e, interfaceC2227e.isPro() * 8);
    }

    @Override // defpackage.InterfaceC2227e
    public final String getAlgorithmName() {
        String algorithmName = this.f31105e.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    @Override // defpackage.InterfaceC2227e
    public final void init(boolean z, InterfaceC3894e interfaceC3894e) {
        byte[] bArr;
        C11494e c11494e;
        C11494e c11494e2;
        this.f31103e = 0L;
        C18286e c18286e = this.f31105e;
        c18286e.init(z, interfaceC3894e);
        this.f31107e = z;
        if (interfaceC3894e instanceof C11494e) {
            C11494e c11494e3 = (C11494e) interfaceC3894e;
            InterfaceC3894e interfaceC3894e2 = c11494e3.f23094e;
            byte[] bArr2 = c11494e3.f23095e;
            interfaceC3894e = interfaceC3894e2;
            bArr = bArr2;
        } else {
            bArr = null;
        }
        if (interfaceC3894e instanceof C12219e) {
            interfaceC3894e = ((C12219e) interfaceC3894e).f24537e;
        }
        if (interfaceC3894e instanceof C1794e) {
            interfaceC3894e = ((C1794e) interfaceC3894e).f4854e;
        }
        C14915e c14915e = (C14915e) interfaceC3894e;
        this.f31106e = c14915e;
        if (c14915e == null && (c11494e2 = this.f31104e) != null) {
            this.f31106e = (C14915e) c11494e2.f23094e;
        }
        this.f31104e = new C11494e(this.f31106e, (bArr != null || (c11494e = this.f31104e) == null) ? AbstractC12442e.license(c18286e.f35743e) : c11494e.f23095e);
    }

    @Override // defpackage.InterfaceC2227e
    public final int isPro() {
        return this.f31105e.f35749e;
    }

    @Override // defpackage.InterfaceC2227e
    public final void reset() {
        this.f31103e = 0L;
        C11494e c11494e = this.f31104e;
        C18286e c18286e = this.f31105e;
        if (c11494e == null) {
            c18286e.reset();
        } else {
            this.f31106e = (C14915e) c11494e.f23094e;
            c18286e.init(this.f31107e, c11494e);
        }
    }

    @Override // defpackage.InterfaceC2227e
    public final int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        C18286e c18286e = this.f31105e;
        processBytes(bArr, i, c18286e.f35749e, bArr2, i2);
        return c18286e.f35749e;
    }

    @Override // defpackage.AbstractC17551e
    public final byte vip(byte b) {
        long j = this.f31103e;
        C18286e c18286e = this.f31105e;
        if (j > 0 && (j & 1023) == 0) {
            InterfaceC2227e interfaceC2227e = c18286e.f34404e;
            interfaceC2227e.init(false, this.f31106e);
            byte[] bArr = new byte[32];
            int isPro = interfaceC2227e.isPro();
            for (int i = 0; i < 32; i += isPro) {
                interfaceC2227e.tapsense(i, i, f31102e, bArr);
            }
            C14915e c14915e = new C14915e(bArr, 0, 32);
            this.f31106e = c14915e;
            interfaceC2227e.init(true, c14915e);
            byte[] license = AbstractC12442e.license(c18286e.f35743e);
            interfaceC2227e.tapsense(0, 0, license, license);
            c18286e.init(this.f31107e, new C11494e(this.f31106e, license));
        }
        this.f31103e++;
        return c18286e.vip(b);
    }
}
