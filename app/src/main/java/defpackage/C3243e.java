package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3243e {
    public final EnumC13278e ad;
    public final C12040e vip;

    public C3243e(EnumC13278e enumC13278e, C12040e c12040e) {
        this.ad = enumC13278e;
        this.vip = c12040e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3243e)) {
            return false;
        }
        C3243e c3243e = (C3243e) obj;
        return this.ad == c3243e.ad && AbstractC7890e.billing(this.vip, c3243e.vip);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C12040e c12040e = this.vip;
        return hashCode + (c12040e == null ? 0 : c12040e.hashCode());
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.ad + ", error=" + this.vip + ')';
    }
}
