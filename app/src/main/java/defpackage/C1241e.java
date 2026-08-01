package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1241e {
    public final String ad;
    public final long vip;

    public C1241e(long j, String str) {
        this.ad = str;
        this.vip = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1241e) {
            C1241e c1241e = (C1241e) obj;
            if (AbstractC5729e.vip(this.ad, c1241e.ad)) {
                if (AbstractC5729e.vip(Long.valueOf(this.vip), Long.valueOf(c1241e.vip))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ad, Long.valueOf(this.vip)});
    }
}
