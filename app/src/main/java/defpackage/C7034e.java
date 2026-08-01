package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eٍؚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7034e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f14396e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C0625e f14397e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7034e) {
            return Arrays.equals(AbstractC12442e.license(this.f14397e.f2853e), AbstractC12442e.license(((C7034e) obj).f14397e.f2853e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(((C10280e) this.f14397e.f3209e).ad);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f14397e, this.f14396e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f14397e.f2853e));
    }
}
