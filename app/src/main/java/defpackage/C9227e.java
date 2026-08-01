package defpackage;

/* renamed from: eٍؔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9227e implements InterfaceC0293e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f18424e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC7559e f18425e;

    public C9227e(InterfaceC7559e interfaceC7559e, int i) {
        this.f18425e = interfaceC7559e;
        this.f18424e = i;
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        InterfaceC7559e interfaceC7559e = this.f18425e;
        byte[] bArr2 = new byte[interfaceC7559e.getDigestSize()];
        interfaceC7559e.doFinal(bArr2, 0);
        int i2 = this.f18424e;
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return i2;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return this.f18425e.getAlgorithmName() + "/" + (this.f18424e * 8);
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f18424e;
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        this.f18425e.reset();
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        this.f18425e.update(b);
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        this.f18425e.update(bArr, i, i2);
    }
}
