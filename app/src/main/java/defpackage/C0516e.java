package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516e {
    public final Rect ad;
    public final Size metrica;
    public final Size vip;

    public C0516e(Rect rect, Size size, Size size2) {
        this.ad = rect;
        this.vip = size;
        this.metrica = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0516e)) {
            return false;
        }
        C0516e c0516e = (C0516e) obj;
        return AbstractC7890e.billing(this.ad, c0516e.ad) && AbstractC7890e.billing(this.vip, c0516e.vip) && AbstractC7890e.billing(this.metrica, c0516e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.ad + ", childSizeToScale=" + this.vip + ", originalSelectedChildSize=" + this.metrica + ')';
    }
}
