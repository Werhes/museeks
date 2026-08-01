package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eٍّۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12384e implements PublicKey, Key {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C10020e f24809e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12384e) {
            return Arrays.equals(AbstractC12442e.license(this.f24809e.f19794e), AbstractC12442e.license(((C12384e) obj).f24809e.f19794e));
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
            return AbstractC0111e.ad(this.f24809e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f24809e.f19794e));
    }
}
