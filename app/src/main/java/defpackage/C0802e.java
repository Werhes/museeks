package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eؒؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0802e implements PrivateKey {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient Cfinal f3191e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Ctry f3192e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C2047e f3193e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0802e) {
            C0802e c0802e = (C0802e) obj;
            if (this.f3192e.isVip(c0802e.f3192e) && Arrays.equals(this.f3193e.ad(), c0802e.f3193e.ad())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f3193e, this.f3191e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (AbstractC12442e.isVip(this.f3193e.ad()) * 37) + AbstractC12442e.isVip(this.f3192e.f36491e);
    }
}
