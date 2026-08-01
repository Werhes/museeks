package defpackage;

/* renamed from: eؔۧؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3006e implements InterfaceC1196e, InterfaceC0554e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17980e f7054e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC0300e f7055e;

    public C3006e(int i, int i2) {
        C17980e c17980e = new C17980e(i, i2);
        this.f7054e = c17980e;
        this.f7055e = EnumC0300e.f2305e;
        c17980e.appmetrica(null);
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
    }

    public C3006e(C3006e c3006e) {
        this.f7054e = new C17980e(c3006e.f7054e);
        this.f7055e = c3006e.f7055e;
        int i = c3006e.f7054e.f35265e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C3006e(this);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        return this.f7054e.license(bArr, i);
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        StringBuilder sb = new StringBuilder("Skein-");
        C17980e c17980e = this.f7054e;
        sb.append(c17980e.f35269e.f12984e * 8);
        sb.append("-");
        sb.append(c17980e.f35265e * 8);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return this.f7054e.f35269e.f12984e;
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f7054e.f35265e;
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        C17980e c17980e = this.f7054e;
        long[] jArr = c17980e.f35267e;
        long[] jArr2 = c17980e.f35264e;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        c17980e.startapp(48);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        C17980e c17980e = this.f7054e;
        byte[] bArr = c17980e.f35268e;
        bArr[0] = b;
        C10379e c10379e = c17980e.f35266e;
        if (c10379e == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
        c10379e.m2801break(bArr, 0, 1, c17980e.f35264e);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        C17980e c17980e = this.f7054e;
        C10379e c10379e = c17980e.f35266e;
        if (c10379e == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
        c10379e.m2801break(bArr, i, i2, c17980e.f35264e);
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        this.f7054e.vip(((C3006e) interfaceC0554e).f7054e);
    }
}
