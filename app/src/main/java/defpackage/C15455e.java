package defpackage;

import javax.crypto.SecretKey;

/* renamed from: eٕٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C15455e implements SecretKey {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f30537e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char[] f30538e;

    public C15455e(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.f30538e = cArr2;
        this.f30537e = z;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        boolean z = this.f30537e;
        char[] cArr = this.f30538e;
        return (z && cArr.length == 0) ? new byte[2] : AbstractC9276e.PKCS12PasswordToBytes(cArr);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS12";
    }
}
