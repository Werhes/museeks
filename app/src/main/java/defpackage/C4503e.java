package defpackage;

import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eؖۦٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4503e implements PrivateKey, Key {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient byte[] f9769e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient String f9770e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public transient Cfinal f9771e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C5858e f9772e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4503e) {
            return Arrays.equals(getEncoded(), ((C4503e) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f9770e;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f9769e == null) {
            this.f9769e = AbstractC6532e.signatures(this.f9772e, this.f9771e);
        }
        return AbstractC12442e.license(this.f9769e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(getEncoded());
    }
}
