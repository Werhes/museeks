package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eؔۙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2823e implements PublicKey, Key {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C14077e f6785e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2823e) {
            return Arrays.equals(AbstractC12442e.license(this.f6785e.f27832e), AbstractC12442e.license(((C2823e) obj).f6785e.f27832e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(this.f6785e.f27831e.ad);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f6785e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f6785e.f27832e));
    }
}
