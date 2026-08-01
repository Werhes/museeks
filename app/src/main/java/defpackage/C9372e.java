package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eٍَٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9372e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f18633e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C9974e f18634e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9372e) {
            return Arrays.equals(this.f18634e.getEncoded(), ((C9372e) obj).f18634e.getEncoded());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f18634e, this.f18633e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(this.f18634e.getEncoded());
    }
}
