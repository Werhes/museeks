package defpackage;

import javax.crypto.SecretKey;

/* renamed from: eٗٚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17109e implements SecretKey {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final EnumC3066e f33467e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final char[] f33468e;

    public C17109e(char[] cArr, EnumC3066e enumC3066e) {
        char[] cArr2 = new char[cArr.length];
        this.f33468e = cArr2;
        this.f33467e = enumC3066e;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.f33467e.ad(this.f33468e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.f33467e.vip();
    }
}
