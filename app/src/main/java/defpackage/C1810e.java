package defpackage;

import java.math.BigInteger;

/* renamed from: eؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1810e implements InterfaceC13441e {
    public final BigInteger ad;

    public C1810e(BigInteger bigInteger) {
        this.ad = bigInteger;
    }

    @Override // defpackage.InterfaceC13441e
    public final int ad() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1810e) {
            return this.ad.equals(((C1810e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    @Override // defpackage.InterfaceC13441e
    public final BigInteger vip() {
        return this.ad;
    }
}
