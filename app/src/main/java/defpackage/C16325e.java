package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eٖٛؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16325e implements PrivateKey, Key {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient Cfinal f32073e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient String f32074e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C1364e f32075e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16325e) {
            return Arrays.equals(getEncoded(), ((C16325e) obj).getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return this.f32074e;
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f32075e, this.f32073e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(getEncoded());
    }
}
