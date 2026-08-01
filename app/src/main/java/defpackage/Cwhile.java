package defpackage;

import java.util.Arrays;

/* renamed from: while, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cwhile {
    public final int ad;
    public final byte[] vip;

    public Cwhile(byte[] bArr) {
        this.ad = AbstractC12442e.isVip(bArr);
        this.vip = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cwhile)) {
            return false;
        }
        return Arrays.equals(this.vip, ((Cwhile) obj).vip);
    }

    public final int hashCode() {
        return this.ad;
    }
}
