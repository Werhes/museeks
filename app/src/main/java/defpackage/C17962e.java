package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eّ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17962e implements PublicKey {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient C5529e f35207e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient Ctry f35208e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17962e) {
            C17962e c17962e = (C17962e) obj;
            if (this.f35208e.isVip(c17962e.f35208e) && Arrays.equals(this.f35207e.ad(), c17962e.f35207e.ad())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC0111e.ad(this.f35207e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (AbstractC12442e.isVip(this.f35207e.ad()) * 37) + AbstractC12442e.isVip(this.f35208e.f36491e);
    }
}
