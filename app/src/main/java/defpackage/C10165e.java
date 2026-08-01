package defpackage;

import java.util.Arrays;

/* renamed from: eٌٍَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10165e {
    public final byte[] ad;
    public final int vip;

    public C10165e(int i, byte[] bArr) {
        this.ad = AbstractC12442e.license(bArr);
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10165e)) {
            return false;
        }
        C10165e c10165e = (C10165e) obj;
        if (c10165e.vip != this.vip) {
            return false;
        }
        return Arrays.equals(this.ad, c10165e.ad);
    }

    public final int hashCode() {
        return AbstractC12442e.isVip(this.ad) ^ this.vip;
    }
}
