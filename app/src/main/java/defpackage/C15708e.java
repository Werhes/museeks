package defpackage;

/* renamed from: eٕٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15708e extends AbstractC9567e {
    public C15708e() {
        this(EnumC0300e.f2305e);
    }

    public C15708e(EnumC0300e enumC0300e) {
        super(enumC0300e);
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C15708e(C15708e c15708e) {
        super(c15708e);
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C15708e(this);
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        startapp();
        AbstractC3628e.admob(i, this.f19000e, bArr);
        AbstractC3628e.admob(i + 8, this.f18999e, bArr);
        AbstractC3628e.admob(i + 16, this.f18994e, bArr);
        AbstractC3628e.admob(i + 24, this.f18997e, bArr);
        AbstractC3628e.admob(i + 32, this.f18990e, bArr);
        AbstractC3628e.admob(i + 40, this.f18995e, bArr);
        AbstractC3628e.admob(i + 48, this.f18988e, bArr);
        AbstractC3628e.admob(i + 56, this.f18987e, bArr);
        reset();
        return 64;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "SHA-512";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 64;
    }

    @Override // defpackage.AbstractC9567e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        this.f19000e = 7640891576956012808L;
        this.f18999e = -4942790177534073029L;
        this.f18994e = 4354685564936845355L;
        this.f18997e = -6534734903238641935L;
        this.f18990e = 5840696475078001361L;
        this.f18995e = -7276294671716946913L;
        this.f18988e = 2270897969802886507L;
        this.f18987e = 6620516959819538809L;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        yandex((C15708e) interfaceC0554e);
    }
}
