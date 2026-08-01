package defpackage;

/* renamed from: eَؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9974e extends AbstractC0821e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C9714e f19704e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C7358e f19705e;

    public C9974e(C7942e c7942e, byte[] bArr) {
        super((Object) c7942e, true);
        int license = c7942e.metrica.license();
        int i = license * 4;
        if (bArr.length != i) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i2 = license * 2;
        this.f19704e = new C9714e(AbstractC12442e.admob(0, license, bArr), AbstractC12442e.admob(license, i2, bArr));
        int i3 = license * 3;
        this.f19705e = new C7358e(AbstractC12442e.admob(i2, i3, bArr), AbstractC12442e.admob(i3, i, bArr));
    }

    public C9974e(C7942e c7942e, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super((Object) c7942e, true);
        this.f19704e = new C9714e(bArr, bArr2);
        this.f19705e = new C7358e(bArr3, bArr4);
    }

    public final byte[] getEncoded() {
        C9714e c9714e = this.f19704e;
        byte[] bArr = c9714e.ad;
        byte[] bArr2 = c9714e.vip;
        C7358e c7358e = this.f19705e;
        return AbstractC12442e.smaato(new byte[][]{bArr, bArr2, c7358e.ad, c7358e.vip});
    }
}
