package defpackage;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eَؗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4969e implements PublicKey, Key {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient byte[] f10533e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient String f10534e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C0957e f10535e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4969e) {
            return Arrays.equals(getEncoded(), ((C4969e) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f10534e;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f10533e == null) {
            this.f10533e = AbstractC6532e.tapsense(this.f10535e);
        }
        return AbstractC12442e.license(this.f10533e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(getEncoded());
    }
}
