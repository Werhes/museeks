package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eٌٌؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6278e implements PrivateKey, Key {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient Cfinal f13087e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient C2185e f13088e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient Ctry f13089e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6278e) {
            C6278e c6278e = (C6278e) obj;
            if (this.f13089e.isVip(c6278e.f13089e) && Arrays.equals(AbstractC12442e.license(this.f13088e.f5549e), AbstractC12442e.license(c6278e.f13088e.f5549e))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            C2185e c2185e = this.f13088e;
            String str = c2185e.f29816e;
            return AbstractC1358e.license(c2185e, this.f13087e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (AbstractC12442e.isVip(AbstractC12442e.license(this.f13088e.f5549e)) * 37) + AbstractC12442e.isVip(this.f13089e.f36491e);
    }
}
