package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eَؙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14637e implements PublicKey, Key {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient AbstractC13156e f28871e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C14637e) {
            try {
                return Arrays.equals(this.f28871e.getEncoded(), ((C14637e) obj).f28871e.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f28871e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        try {
            return AbstractC12442e.isVip(this.f28871e.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
