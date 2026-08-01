package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9984e {
    public final LinkedHashMap ad;
    public final int metrica;
    public final LinkedHashMap vip;

    public C9984e(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        this.ad = linkedHashMap;
        this.vip = linkedHashMap2;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9984e)) {
            return false;
        }
        C9984e c9984e = (C9984e) obj;
        return this.ad.equals(c9984e.ad) && this.vip.equals(c9984e.vip) && this.metrica == c9984e.metrica;
    }

    public final int hashCode() {
        return AbstractC17861e.yandex(this.vip, this.ad.hashCode() * 31, 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.ad);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.vip);
        sb.append(", maxSupportedFrameRate=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }
}
