package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16980e {
    public final String ad;
    public final C1900e vip;

    public C16980e(String str, C1900e c1900e) {
        this.ad = str;
        this.vip = c1900e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16980e)) {
            return false;
        }
        C16980e c16980e = (C16980e) obj;
        return this.ad.equals(c16980e.ad) && AbstractC7890e.billing(this.vip, c16980e.vip);
    }

    public final int hashCode() {
        int hashCode = ((this.ad.hashCode() * 31) - 1) * 31;
        C1900e c1900e = this.vip;
        return hashCode + (c1900e == null ? 0 : c1900e.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo(mimeType=" + this.ad + ", profile=-1, compatibleVideoProfile=" + this.vip + ')';
    }
}
