package defpackage;

import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eٌۤٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9096e implements PrivateKey {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public transient Cfinal f18216e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient C7770e f18217e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient Ctry f18218e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9096e) {
            C9096e c9096e = (C9096e) obj;
            if (this.f18218e.isVip(c9096e.f18218e) && Arrays.equals(this.f18217e.ad(), c9096e.f18217e.ad())) {
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
            return AbstractC1358e.license(this.f18217e, this.f18216e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (AbstractC12442e.isVip(this.f18217e.ad()) * 37) + AbstractC12442e.isVip(this.f18218e.f36491e);
    }
}
