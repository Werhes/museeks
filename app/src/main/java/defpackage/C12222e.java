package defpackage;

/* renamed from: eّؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12222e extends AbstractC0821e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7358e f24540e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C11883e f24541e;

    public C12222e(C4577e c4577e, C7358e c7358e, C11883e c11883e) {
        super((Object) c4577e, true);
        this.f24540e = c7358e;
        this.f24541e = c11883e;
    }

    public C12222e(C4577e c4577e, byte[] bArr) {
        super((Object) c4577e, true);
        int metrica = c4577e.vip.metrica();
        int i = metrica * 4;
        if (bArr.length != i) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i2 = metrica * 2;
        this.f24540e = new C7358e(AbstractC12442e.admob(0, metrica, bArr), AbstractC12442e.admob(metrica, i2, bArr));
        int i3 = metrica * 3;
        this.f24541e = new C11883e(AbstractC12442e.admob(i2, i3, bArr), AbstractC12442e.admob(i3, i, bArr), 7);
    }

    public final byte[] getEncoded() {
        C7358e c7358e = this.f24540e;
        byte[] bArr = c7358e.ad;
        byte[] bArr2 = c7358e.vip;
        C11883e c11883e = this.f24541e;
        return AbstractC12442e.smaato(new byte[][]{bArr, bArr2, (byte[]) c11883e.f23815e, (byte[]) c11883e.f23814e});
    }
}
