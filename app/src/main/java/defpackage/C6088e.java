package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6088e {
    public final C9485e ad;
    public final Map vip;

    public C6088e(C9485e c9485e, Map map) {
        this.ad = c9485e;
        this.vip = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6088e)) {
            return false;
        }
        C6088e c6088e = (C6088e) obj;
        return AbstractC7890e.billing(this.ad, c6088e.ad) && AbstractC7890e.billing(this.vip, c6088e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "CameraGraphCreationResult(config=" + this.ad + ", streamConfigMap=" + this.vip + ')';
    }
}
