package defpackage;

/* renamed from: eٍّؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0957e extends AbstractC0821e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f3395e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f3396e;

    public C0957e(C12532e c12532e, byte[] bArr) {
        super((Object) c12532e, false);
        C14154e ad = c12532e.ad();
        if (bArr.length != ad.yandex) {
            throw new IllegalArgumentException("'encoding' has invalid length");
        }
        byte[] admob = AbstractC12442e.admob(0, bArr.length - 32, bArr);
        this.f3395e = admob;
        this.f3396e = AbstractC12442e.admob(bArr.length - 32, bArr.length, bArr);
        if (!ad.ad(admob)) {
            throw new IllegalArgumentException("Modulus check failed for ML-KEM public key");
        }
    }

    public C0957e(C12532e c12532e, byte[] bArr, byte[] bArr2) {
        super((Object) c12532e, false);
        C14154e ad = c12532e.ad();
        if (bArr.length != ad.license) {
            throw new IllegalArgumentException("'t' has invalid length");
        }
        if (bArr2.length != 32) {
            throw new IllegalArgumentException("'rho' has invalid length");
        }
        byte[] license = AbstractC12442e.license(bArr);
        this.f3395e = license;
        this.f3396e = AbstractC12442e.license(bArr2);
        if (!ad.ad(license)) {
            throw new IllegalArgumentException("Modulus check failed for ML-KEM public key");
        }
    }
}
