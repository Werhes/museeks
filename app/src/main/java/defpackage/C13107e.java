package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13107e {
    public final int ad;
    public final ArrayList vip;

    public C13107e(int i, ArrayList arrayList) {
        this.ad = i;
        this.vip = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13107e)) {
            return false;
        }
        C13107e c13107e = (C13107e) obj;
        return this.ad == c13107e.ad && this.vip.equals(c13107e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad * 31);
    }

    public final String toString() {
        return "MiniPlayerTrackElements(index=" + this.ad + ", elements=" + this.vip + ')';
    }
}
