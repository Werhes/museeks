package defpackage;

import java.math.BigInteger;

/* renamed from: eؘؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0127e {
    public final BigInteger ad;
    public final BigInteger metrica;
    public final BigInteger vip;

    public C0127e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.ad = bigInteger;
        this.vip = bigInteger2;
        this.metrica = bigInteger3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0127e) {
            C0127e c0127e = (C0127e) obj;
            if (this.metrica.equals(c0127e.metrica) && this.ad.equals(c0127e.ad) && this.vip.equals(c0127e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.metrica.hashCode() ^ this.ad.hashCode()) ^ this.vip.hashCode();
    }
}
