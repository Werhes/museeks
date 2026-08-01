package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۚٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11248e extends AbstractC13345e {
    public final AbstractC13345e ad;

    public C11248e(AbstractC13345e abstractC13345e) {
        this.ad = abstractC13345e;
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            abstractC3442e.Signature();
        } else {
            this.ad.purchase(abstractC3442e, obj);
        }
    }

    public final String toString() {
        return this.ad + ".nullSafe()";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        if (abstractC17080e.crashlytics() != 9) {
            return this.ad.vip(abstractC17080e);
        }
        abstractC17080e.ads();
        return null;
    }
}
