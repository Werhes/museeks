package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eٍَٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9480e implements PublicKey, Key {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C18542e f18819e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9480e) {
            return Arrays.equals(AbstractC12442e.license(this.f18819e.f36385e), AbstractC12442e.license(((C9480e) obj).f18819e.f36385e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(((C16331e) this.f18819e.f3209e).f32092e);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f18819e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f18819e.f36385e));
    }
}
