package defpackage;

/* renamed from: eٖؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15968e extends AbstractC0821e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f31482e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f31483e;

    public C15968e(C3456e c3456e, byte[] bArr) {
        super((Object) c3456e, false);
        this.f31482e = AbstractC12442e.admob(0, 32, bArr);
        byte[] admob = AbstractC12442e.admob(32, bArr.length, bArr);
        this.f31483e = admob;
        if (admob.length == 0) {
            throw new IllegalArgumentException("encoding too short");
        }
    }

    public C15968e(C3456e c3456e, byte[] bArr, byte[] bArr2) {
        super((Object) c3456e, false);
        if (bArr == null) {
            throw new NullPointerException("rho cannot be null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("t1 cannot be null");
        }
        this.f31482e = AbstractC12442e.license(bArr);
        this.f31483e = AbstractC12442e.license(bArr2);
    }

    public final byte[] getEncoded() {
        return AbstractC12442e.adcel(this.f31482e, this.f31483e);
    }
}
