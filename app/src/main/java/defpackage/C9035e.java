package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۠ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9035e {
    public final AbstractC17475e ad;
    public final long metrica;
    public final int vip;

    public C9035e(int i, long j, List list) {
        this.ad = AbstractC17475e.remoteconfig(list);
        this.vip = i;
        this.metrica = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9035e)) {
            return false;
        }
        C9035e c9035e = (C9035e) obj;
        return this.ad.equals(c9035e.ad) && this.vip == c9035e.vip && this.metrica == c9035e.metrica;
    }

    public final int hashCode() {
        return AbstractC1561e.metrica(this.metrica) + (((this.ad.hashCode() * 31) + this.vip) * 31);
    }
}
