package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eٕٞؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15622e implements PublicKey, Key {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C3960e f30810e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15622e)) {
            return false;
        }
        C7358e c7358e = this.f30810e.f8842e;
        byte[] adcel = AbstractC12442e.adcel(c7358e.ad, c7358e.vip);
        C7358e c7358e2 = ((C15622e) obj).f30810e.f8842e;
        return Arrays.equals(adcel, AbstractC12442e.adcel(c7358e2.ad, c7358e2.vip));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+-".concat(AbstractC1433e.billing(((C7942e) this.f30810e.f3209e).vip));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f30810e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        C7358e c7358e = this.f30810e.f8842e;
        return AbstractC12442e.isVip(AbstractC12442e.adcel(c7358e.ad, c7358e.vip));
    }
}
