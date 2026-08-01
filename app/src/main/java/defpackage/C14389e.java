package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eٓۦۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14389e implements PublicKey, Key {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C14593e f28461e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14389e) {
            return Arrays.equals(AbstractC12442e.license(this.f28461e.f28796e), AbstractC12442e.license(((C14389e) obj).f28461e.f28796e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(((C5539e) this.f28461e.f3209e).f11860e);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f28461e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f28461e.f28796e));
    }
}
