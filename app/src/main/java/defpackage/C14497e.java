package defpackage;

import javax.crypto.SecretKey;

/* renamed from: eٍٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14497e implements SecretKey {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC3066e f28683e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char[] f28684e;

    public C14497e(char[] cArr, EnumC3066e enumC3066e) {
        this.f28684e = cArr == null ? null : (char[]) cArr.clone();
        this.f28683e = enumC3066e;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PBKDF2";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.f28683e.ad(this.f28684e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.f28683e.vip();
    }
}
