package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eِٞۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11889e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f23819e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient AbstractC13156e f23820e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11889e)) {
            return false;
        }
        try {
            return Arrays.equals(this.f23820e.getEncoded(), ((C11889e) obj).f23820e.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f23820e, this.f23819e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        try {
            return AbstractC12442e.isVip(this.f23820e.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
