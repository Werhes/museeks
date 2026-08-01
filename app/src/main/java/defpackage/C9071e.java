package defpackage;

/* renamed from: eٌۢۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9071e extends AbstractC9567e {
    public C9071e() {
        this(EnumC0300e.f2305e);
    }

    public C9071e(EnumC0300e enumC0300e) {
        super(enumC0300e);
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C9071e(C9071e c9071e) {
        super(c9071e);
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
    }

    @Override // defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C9071e(this);
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
        reset();
        return 48;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "SHA-384";
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return 48;
    }

    @Override // defpackage.AbstractC9567e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        this.f19000e = -3766243637369397544L;
        this.f18999e = 7105036623409894663L;
        this.f18994e = -7973340178411365097L;
        this.f18997e = 1526699215303891257L;
        this.f18990e = 7436329637833083697L;
        this.f18995e = -8163818279084223215L;
        this.f18988e = -2662702644619276377L;
        this.f18987e = 5167115440072839076L;
    }

    @Override // defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        yandex((C9071e) interfaceC0554e);
    }
}
