package defpackage;

/* renamed from: eؒٔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1061e extends AbstractC0821e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C11883e f3588e;

    public C1061e(C4577e c4577e, C11883e c11883e) {
        super((Object) c4577e, false);
        this.f3588e = c11883e;
    }

    public C1061e(C4577e c4577e, byte[] bArr) {
        super((Object) c4577e, false);
        int metrica = c4577e.vip.metrica();
        int i = metrica * 2;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f3588e = new C11883e(AbstractC12442e.admob(0, metrica, bArr), AbstractC12442e.admob(metrica, i, bArr), 7);
    }

    public final byte[] getEncoded() {
        C11883e c11883e = this.f3588e;
        return AbstractC12442e.adcel((byte[]) c11883e.f23815e, (byte[]) c11883e.f23814e);
    }

    public final byte[] metrica() {
        return AbstractC12442e.license((byte[]) this.f3588e.f23815e);
    }
}
