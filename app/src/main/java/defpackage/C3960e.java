package defpackage;

/* renamed from: eٍؚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3960e extends AbstractC0821e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C7358e f8842e;

    public C3960e(C7942e c7942e, byte[] bArr) {
        super((Object) c7942e, false);
        int license = c7942e.metrica.license();
        int i = license * 2;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f8842e = new C7358e(AbstractC12442e.admob(0, license, bArr), AbstractC12442e.admob(license, i, bArr));
    }
}
