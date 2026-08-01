package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

/* renamed from: eٌۙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8947e implements PrivateKey, Key {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public transient Cfinal f17963e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient C14074e f17964e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8947e)) {
            return false;
        }
        C14074e c14074e = this.f17964e;
        byte[] mopub = AbstractC12442e.mopub(c14074e.f27823e, c14074e.f27824e, c14074e.f27822e);
        C14074e c14074e2 = ((C8947e) obj).f17964e;
        return Arrays.equals(mopub, AbstractC12442e.mopub(c14074e2.f27823e, c14074e2.f27824e, c14074e2.f27822e));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC1433e.billing(((C5539e) this.f17964e.f3209e).f11860e);
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC1358e.license(this.f17964e, this.f17963e).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        C14074e c14074e = this.f17964e;
        return AbstractC12442e.isVip(AbstractC12442e.mopub(c14074e.f27823e, c14074e.f27824e, c14074e.f27822e));
    }
}
