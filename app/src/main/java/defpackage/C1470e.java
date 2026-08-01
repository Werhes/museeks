package defpackage;

/* renamed from: eؒۦۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1470e implements InterfaceC11306e, InterfaceC6931e, InterfaceC0554e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final byte[] f4309e = new byte[100];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f4310e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f4311e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f4312e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f4313e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8986e f4314e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f4315e;

    public C1470e(int i, byte[] bArr) {
        this.f4314e = new C8986e(AbstractC1433e.metrica("KMAC"), i, bArr);
        this.f4312e = i;
        this.f4311e = (i * 2) / 8;
    }

    public C1470e(C1470e c1470e) {
        this.f4314e = new C8986e(c1470e.f4314e);
        this.f4312e = c1470e.f4312e;
        this.f4311e = c1470e.f4311e;
        this.f4313e = c1470e.f4313e;
        this.f4310e = c1470e.f4310e;
        this.f4315e = c1470e.f4315e;
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C1470e(this);
    }

    @Override // defpackage.InterfaceC11306e
    public final int doFinal(byte[] bArr, int i) {
        boolean z = this.f4315e;
        C8986e c8986e = this.f4314e;
        if (z) {
            if (!this.f4310e) {
                throw new IllegalStateException("KMAC not initialized");
            }
            byte[] yandex = AbstractC6232e.yandex(this.f4311e * 8);
            c8986e.purchase(0, yandex.length, yandex);
        }
        int metrica = c8986e.metrica(i, this.f4311e, bArr);
        reset();
        return metrica;
    }

    @Override // defpackage.InterfaceC11306e
    public final String getAlgorithmName() {
        return "KMAC" + this.f4314e.getAlgorithmName().substring(6);
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return this.f4314e.getByteLength();
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f4311e;
    }

    @Override // defpackage.InterfaceC11306e
    public final int getMacSize() {
        return this.f4311e;
    }

    @Override // defpackage.InterfaceC11306e
    public final void init(InterfaceC3894e interfaceC3894e) {
        byte[] license = AbstractC12442e.license(((C14915e) interfaceC3894e).f29591e);
        this.f4313e = license;
        if (license.length > 255) {
            throw new IllegalArgumentException("key length must be between 0 and 2040 bits");
        }
        this.f4310e = true;
        reset();
    }

    public final void license(int i, byte[] bArr) {
        byte[] purchase = AbstractC6232e.purchase(i);
        update(purchase, 0, purchase.length);
        byte[] adcel = AbstractC12442e.adcel(AbstractC6232e.purchase(bArr.length * 8), bArr);
        update(adcel, 0, adcel.length);
        int length = i - ((purchase.length + adcel.length) % i);
        if (length <= 0 || length == i) {
            return;
        }
        while (true) {
            byte[] bArr2 = f4309e;
            if (length <= 100) {
                update(bArr2, 0, length);
                return;
            } else {
                update(bArr2, 0, 100);
                length -= 100;
            }
        }
    }

    @Override // defpackage.InterfaceC6931e
    public final int metrica(int i, int i2, byte[] bArr) {
        boolean z = this.f4315e;
        C8986e c8986e = this.f4314e;
        if (z) {
            if (!this.f4310e) {
                throw new IllegalStateException("KMAC not initialized");
            }
            byte[] yandex = AbstractC6232e.yandex(i2 * 8);
            c8986e.purchase(0, yandex.length, yandex);
        }
        int metrica = c8986e.metrica(0, i2, bArr);
        reset();
        return metrica;
    }

    @Override // defpackage.InterfaceC11306e
    public final void reset() {
        this.f4314e.reset();
        byte[] bArr = this.f4313e;
        if (bArr != null) {
            license(this.f4312e == 128 ? 168 : 136, bArr);
        }
        this.f4315e = true;
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte b) {
        if (!this.f4310e) {
            throw new IllegalStateException("KMAC not initialized");
        }
        this.f4314e.update(b);
    }

    @Override // defpackage.InterfaceC11306e
    public final void update(byte[] bArr, int i, int i2) {
        if (!this.f4310e) {
            throw new IllegalStateException("KMAC not initialized");
        }
        this.f4314e.purchase(i, i2, bArr);
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        C1470e c1470e = (C1470e) interfaceC0554e;
        this.f4314e.vip(c1470e.f4314e);
        this.f4312e = c1470e.f4312e;
        this.f4311e = c1470e.f4311e;
        this.f4310e = c1470e.f4310e;
        this.f4315e = c1470e.f4315e;
    }
}
