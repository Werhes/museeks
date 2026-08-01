package defpackage;

import android.widget.RemoteViews;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3237e {
    public final RemoteViews ad;
    public final C2158e vip;

    public C3237e(RemoteViews remoteViews, C2158e c2158e) {
        this.ad = remoteViews;
        this.vip = c2158e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3237e)) {
            return false;
        }
        C3237e c3237e = (C3237e) obj;
        return AbstractC7890e.billing(this.ad, c3237e.ad) && AbstractC7890e.billing(this.vip, c3237e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.ad + ", view=" + this.vip + ')';
    }
}
