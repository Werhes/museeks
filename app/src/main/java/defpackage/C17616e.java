package defpackage;

/* renamed from: eؚ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17616e implements InterfaceC6931e, InterfaceC7559e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final byte[] f34491e = AbstractC1433e.metrica("TupleHash");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f34492e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f34493e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8986e f34494e;

    public C17616e(int i, int i2) {
        this.f34494e = new C8986e(f34491e, i, null);
        this.f34493e = (i2 + 7) / 8;
        reset();
    }

    public C17616e(C17616e c17616e) {
        this.f34494e = new C8986e(c17616e.f34494e);
        this.f34493e = c17616e.f34493e;
        this.f34492e = c17616e.f34492e;
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C17616e(this);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        boolean z = this.f34492e;
        C8986e c8986e = this.f34494e;
        if (z) {
            byte[] yandex = AbstractC6232e.yandex(this.f34493e * 8);
            c8986e.purchase(0, yandex.length, yandex);
            this.f34492e = false;
        }
        int metrica = c8986e.metrica(i, this.f34493e, bArr);
        reset();
        return metrica;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "TupleHash" + this.f34494e.getAlgorithmName().substring(6);
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return this.f34494e.getByteLength();
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f34493e;
    }

    @Override // defpackage.InterfaceC6931e
    public final int metrica(int i, int i2, byte[] bArr) {
        boolean z = this.f34492e;
        C8986e c8986e = this.f34494e;
        if (z) {
            byte[] yandex = AbstractC6232e.yandex(this.f34493e * 8);
            c8986e.purchase(0, yandex.length, yandex);
            this.f34492e = false;
        }
        int metrica = c8986e.metrica(0, i2, bArr);
        reset();
        return metrica;
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        this.f34494e.reset();
        this.f34492e = true;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        byte[] adcel = AbstractC12442e.adcel(AbstractC6232e.purchase(8L), new byte[]{b});
        this.f34494e.purchase(0, adcel.length, adcel);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        byte[] adcel = bArr.length == i2 ? AbstractC12442e.adcel(AbstractC6232e.purchase(i2 * 8), bArr) : AbstractC12442e.adcel(AbstractC6232e.purchase(i2 * 8), AbstractC12442e.admob(i, i2 + i, bArr));
        this.f34494e.purchase(0, adcel.length, adcel);
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        C17616e c17616e = (C17616e) interfaceC0554e;
        C8986e c8986e = c17616e.f34494e;
        C8986e c8986e2 = this.f34494e;
        c8986e2.vip(c8986e);
        this.f34493e = (c8986e2.f11447e * 2) / 8;
        this.f34492e = c17616e.f34492e;
    }
}
