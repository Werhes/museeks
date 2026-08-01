package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14897e {
    public final View ad;

    public C14897e(View view) {
        this.ad = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14897e) || !AbstractC7890e.billing(this.ad, ((C14897e) obj).ad)) {
            return false;
        }
        C13664e c13664e = C13664e.f27089e;
        return c13664e.equals(c13664e);
    }

    public final int hashCode() {
        return AbstractC1786e.mopub(2, AbstractC1786e.mopub(3, ((this.ad.hashCode() * 31) + 1) * 31, 29791), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalloonPlacement(anchor=");
        sb.append(this.ad);
        sb.append(", subAnchors=");
        sb.append(C13664e.f27089e);
        sb.append(", align=");
        return AbstractC4653e.ads(sb, "TOP", ", xOff=0, yOff=0, type=", "DROPDOWN", ", width=0, height=0)");
    }
}
