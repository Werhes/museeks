package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eُؚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0238e implements Key, PublicKey {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C12034e f1487e;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0238e)) {
            return false;
        }
        return Arrays.equals(AbstractC12442e.license(this.f1487e.f24060e), AbstractC12442e.license(((C0238e) obj).f1487e.f24060e));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f1487e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f1487e.f24060e));
    }
}
