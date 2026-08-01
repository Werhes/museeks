package defpackage;

import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eُؚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7079e implements PublicKey, Key {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient byte[] f14534e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient String f14535e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C17060e f14536e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7079e) {
            return Arrays.equals(getEncoded(), ((C7079e) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f14535e;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        if (this.f14534e == null) {
            this.f14534e = AbstractC6532e.tapsense(this.f14536e);
        }
        return AbstractC12442e.license(this.f14534e);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(getEncoded());
    }
}
