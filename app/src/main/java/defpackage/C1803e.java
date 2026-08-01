package defpackage;

/* renamed from: eٟؓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1803e extends C11570e {
    @Override // defpackage.C11570e, defpackage.InterfaceC11306e
    public final int doFinal(byte[] bArr, int i) {
        this.f23248e = ((this.f23248e >>> ((7 - this.f23243e) << 3)) >>> 8) | ((((this.f23246e << 3) + r9) & 255) << 56);
        metrica();
        this.f23250e ^= 238;
        int i2 = this.f23244e;
        ad(i2);
        long j = this.f23241e;
        long j2 = this.f23251e;
        long j3 = ((j ^ j2) ^ this.f23250e) ^ this.f23245e;
        this.f23251e = j2 ^ 221;
        ad(i2);
        long j4 = ((this.f23241e ^ this.f23251e) ^ this.f23250e) ^ this.f23245e;
        reset();
        AbstractC3628e.subscription(0, j3, bArr);
        AbstractC3628e.subscription(8, j4, bArr);
        return 16;
    }

    @Override // defpackage.C11570e, defpackage.InterfaceC11306e
    public final String getAlgorithmName() {
        return "SipHash128-" + this.f23249e + "-" + this.f23244e;
    }

    @Override // defpackage.C11570e, defpackage.InterfaceC11306e
    public final int getMacSize() {
        return 16;
    }

    @Override // defpackage.C11570e, defpackage.InterfaceC11306e
    public final void reset() {
        super.reset();
        this.f23251e ^= 238;
    }

    @Override // defpackage.C11570e
    public final long vip() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
