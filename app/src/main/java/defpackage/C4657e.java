package defpackage;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eؗؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4657e implements PublicKey, Key {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient byte[] f9984e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient String f9985e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C9884e f9986e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4657e) {
            return Arrays.equals(getEncoded(), ((C4657e) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f9985e;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f9984e == null) {
            this.f9984e = AbstractC6532e.tapsense(this.f9986e);
        }
        return AbstractC12442e.license(this.f9984e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(getEncoded());
    }
}
