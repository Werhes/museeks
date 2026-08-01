package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۜۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14984e {
    public final String ad;
    public final ArrayList vip;

    public C14984e(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.ad = str;
        this.vip = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14984e)) {
            return false;
        }
        C14984e c14984e = (C14984e) obj;
        return this.ad.equals(c14984e.ad) && this.vip.equals(c14984e.vip);
    }

    public final int hashCode() {
        return ((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.ad + ", usedDates=" + this.vip + "}";
    }
}
