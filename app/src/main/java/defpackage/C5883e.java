package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eؘۚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5883e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f12430e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C1463e f12431e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5883e) {
            return Arrays.equals(AbstractC12442e.license(this.f12431e.f4305e), AbstractC12442e.license(((C5883e) obj).f12431e.f4305e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(this.f12431e.f4304e.ad);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f12431e, this.f12430e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f12431e.f4305e));
    }
}
