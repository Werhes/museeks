package defpackage;

import java.util.Arrays;

/* renamed from: eٟؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4678e {
    public final byte[] ad;
    public final int vip;

    public C4678e(byte[] bArr, int i, int i2) {
        this.ad = AbstractC12442e.license(bArr);
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4678e)) {
            return false;
        }
        C4678e c4678e = (C4678e) obj;
        if (c4678e.vip != this.vip) {
            return false;
        }
        return Arrays.equals(this.ad, c4678e.ad);
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(this.ad) ^ this.vip;
    }
}
