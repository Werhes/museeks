package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370e {
    public final LinkedHashMap ad;
    public final boolean metrica;
    public final List vip;

    public C0370e(LinkedHashMap linkedHashMap, List list, boolean z) {
        this.ad = linkedHashMap;
        this.vip = list;
        this.metrica = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0370e)) {
            return false;
        }
        C0370e c0370e = (C0370e) obj;
        return this.ad.equals(c0370e.ad) && AbstractC7890e.billing(this.vip, c0370e.vip) && this.metrica == c0370e.metrica;
    }

    public final int hashCode() {
        return AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip) + (this.metrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceResolveResult(tracks=");
        sb.append(this.ad);
        sb.append(", queue=");
        sb.append(this.vip);
        sb.append(", shouldSpawnIdLoad=");
        return AbstractC1786e.isVip(sb, this.metrica, ')');
    }
}
