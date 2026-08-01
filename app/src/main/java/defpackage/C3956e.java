package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eؘؚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3956e implements PublicKey, Key {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C18338e f8822e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3956e) {
            return Arrays.equals(AbstractC12442e.license(this.f8822e.f36010e), AbstractC12442e.license(((C3956e) obj).f8822e.f36010e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(((C7795e) this.f8822e.f3209e).f15798e);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f8822e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f8822e.f36010e));
    }
}
