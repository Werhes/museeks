package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eِؖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4044e implements PublicKey, Key {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C16204e f8994e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4044e) {
            return Arrays.equals(AbstractC12442e.license(this.f8994e.f31825e), AbstractC12442e.license(((C4044e) obj).f8994e.f31825e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(((C10280e) this.f8994e.f3209e).ad);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f8994e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f8994e.f31825e));
    }
}
