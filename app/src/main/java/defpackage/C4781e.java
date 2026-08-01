package defpackage;

import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4781e {
    public final long ad;
    public final int metrica;
    public final long vip;

    public C4781e(int i, long j, long j2) {
        AbstractC2301e.billing(j < j2);
        this.ad = j;
        this.vip = j2;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4781e.class == obj.getClass()) {
            C4781e c4781e = (C4781e) obj;
            if (this.ad == c4781e.ad && this.vip == c4781e.vip && this.metrica == c4781e.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.ad), Long.valueOf(this.vip), Integer.valueOf(this.metrica));
    }

    public final String toString() {
        String str = AbstractC9413e.ad;
        Locale locale = Locale.US;
        StringBuilder inmobi = AbstractC1786e.inmobi(this.ad, "Segment: startTimeMs=", ", endTimeMs=");
        inmobi.append(this.vip);
        inmobi.append(", speedDivisor=");
        inmobi.append(this.metrica);
        return inmobi.toString();
    }
}
