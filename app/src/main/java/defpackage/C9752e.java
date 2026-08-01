package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eٍْۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9752e implements PublicKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient C7319e f19276e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient Ctry f19277e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9752e) {
            C9752e c9752e = (C9752e) obj;
            if (this.f19277e.isVip(c9752e.f19277e) && Arrays.equals(AbstractC12442e.license(this.f19276e.f14990e), AbstractC12442e.license(c9752e.f19276e.f14990e))) {
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
            C7319e c7319e = this.f19276e;
            return (c7319e.f29816e != null ? AbstractC0111e.ad(c7319e) : new C3780e(new C16527e(InterfaceC3408e.ad, new C11717e(new C16527e(this.f19277e))), AbstractC12442e.license(this.f19276e.f14990e))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (AbstractC12442e.isVip(AbstractC12442e.license(this.f19276e.f14990e)) * 37) + AbstractC12442e.isVip(this.f19277e.f36491e);
    }
}
