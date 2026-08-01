package defpackage;

import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eٍٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9644e implements PrivateKey, Key {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient byte[] f19116e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient String f19117e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public transient Cfinal f19118e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C11035e f19119e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9644e) {
            return Arrays.equals(getEncoded(), ((C9644e) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f19117e;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f19116e == null) {
            this.f19116e = AbstractC6532e.signatures(this.f19119e, this.f19118e);
        }
        return AbstractC12442e.license(this.f19116e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(getEncoded());
    }
}
