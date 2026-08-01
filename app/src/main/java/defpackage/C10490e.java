package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10490e {
    public final C16786e ad;
    public final boolean vip;

    public C10490e(C16786e c16786e, boolean z) {
        this.ad = c16786e;
        this.vip = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10490e) {
            C10490e c10490e = (C10490e) obj;
            if (c10490e.ad.equals(this.ad) && c10490e.vip == this.vip) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.vip).hashCode();
    }
}
