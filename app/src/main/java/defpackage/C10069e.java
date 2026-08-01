package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eَؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10069e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f19900e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C13865e f19901e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10069e) {
            return Arrays.equals(AbstractC12442e.license(this.f19901e.f27475e), AbstractC12442e.license(((C10069e) obj).f19901e.f27475e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(((C7795e) this.f19901e.f3209e).f15798e);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f19901e, this.f19900e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f19901e.f27475e));
    }
}
