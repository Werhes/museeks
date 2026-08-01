package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eّۛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12750e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f25508e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C5351e f25509e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12750e) {
            return Arrays.equals(AbstractC12442e.license(this.f25509e.f11472e), AbstractC12442e.license(((C12750e) obj).f25509e.f11472e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NTRU";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f25509e, this.f25508e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f25509e.f11472e));
    }
}
