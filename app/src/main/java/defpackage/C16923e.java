package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eَٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16923e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f33149e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C10052e f33150e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16923e) {
            return Arrays.equals(AbstractC12442e.license(this.f33150e.f19853e), AbstractC12442e.license(((C16923e) obj).f33150e.f19853e));
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Picnic";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f33150e, this.f33149e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(AbstractC12442e.license(this.f33150e.f19853e));
    }
}
