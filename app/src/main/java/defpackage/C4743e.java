package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eًؗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4743e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f10157e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C7432e f10158e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4743e) {
            return Arrays.equals(AbstractC12442e.license(this.f10158e.f15202e), AbstractC12442e.license(((C4743e) obj).f10158e.f15202e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(((C16331e) this.f10158e.f3209e).f32092e);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f10158e, this.f10157e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f10158e.f15202e));
    }
}
