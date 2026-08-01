package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10456e {
    public final EnumC0646e ad;
    public final Integer vip;

    public /* synthetic */ C10456e(C0642e c0642e) {
        this.ad = (EnumC0646e) c0642e.f2880e;
        this.vip = (Integer) c0642e.f2879e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10456e)) {
            return false;
        }
        C10456e c10456e = (C10456e) obj;
        return AbstractC5729e.vip(this.ad, c10456e.ad) && AbstractC5729e.vip(this.vip, c10456e.vip) && AbstractC5729e.vip(null, null) && AbstractC5729e.vip(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ad, this.vip, null, null});
    }
}
