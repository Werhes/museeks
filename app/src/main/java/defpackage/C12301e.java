package defpackage;

import java.math.BigInteger;

/* renamed from: eؘّْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12301e implements InterfaceC13441e {
    public final InterfaceC13441e ad;
    public final C2712e vip;

    public C12301e(InterfaceC13441e interfaceC13441e, C2712e c2712e) {
        this.ad = interfaceC13441e;
        this.vip = c2712e;
    }

    @Override // defpackage.InterfaceC13441e
    public final int ad() {
        return this.vip.ad[r1.length - 1] * this.ad.ad();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12301e)) {
            return false;
        }
        C12301e c12301e = (C12301e) obj;
        return this.ad.equals(c12301e.ad) && this.vip.equals(c12301e.vip);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.ad.hashCode();
        int[] iArr = this.vip.ad;
        if (iArr == null) {
            i = 0;
        } else {
            int length = iArr.length;
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * 257) ^ iArr[length];
            }
            i = i2;
        }
        return hashCode ^ Integer.rotateLeft(i, 16);
    }

    @Override // defpackage.InterfaceC13441e
    public final BigInteger vip() {
        return this.ad.vip();
    }
}
