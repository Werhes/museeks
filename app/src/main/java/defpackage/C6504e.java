package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٛٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6504e extends AbstractC2799e {
    public final C0216e ad;
    public final C17933e license;
    public final C9823e metrica;
    public final List vip;

    public C6504e(C0216e c0216e, List list, C9823e c9823e, C17933e c17933e) {
        this.ad = c0216e;
        this.vip = list;
        this.metrica = c9823e;
        this.license = c17933e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6504e)) {
            return false;
        }
        C6504e c6504e = (C6504e) obj;
        return this.ad.equals(c6504e.ad) && this.vip.equals(c6504e.vip) && AbstractC7890e.billing(this.metrica, c6504e.metrica) && this.license.equals(c6504e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((((this.metrica.hashCode() + AbstractC17861e.billing(this.ad.hashCode() * 31, 31, this.vip)) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.ad + ", sharedCameraIds=" + this.vip + ", graphListener=" + this.metrica + ", isPrewarm=false, isForegroundObserver=" + this.license + ')';
    }
}
