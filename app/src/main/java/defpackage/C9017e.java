package defpackage;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;

/* renamed from: eٌ۟۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9017e implements PublicKey {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Ctry f18080e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C17464e f18081e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9017e) {
            C9017e c9017e = (C9017e) obj;
            try {
                if (this.f18080e.isVip(c9017e.f18080e)) {
                    if (Arrays.equals(this.f18081e.getEncoded(), c9017e.f18081e.getEncoded())) {
                        return true;
                    }
                }
            } catch (IOException unused) {
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
            return AbstractC0111e.ad(this.f18081e).getEncoded();
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
            return (AbstractC12442e.isVip(this.f18081e.getEncoded()) * 37) + AbstractC12442e.isVip(this.f18080e.f36491e);
        } catch (IOException unused) {
            return AbstractC12442e.isVip(this.f18080e.f36491e);
        }
    }
}
