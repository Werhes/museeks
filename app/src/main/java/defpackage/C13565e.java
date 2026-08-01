package defpackage;

import java.lang.reflect.Type;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۡٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13565e extends AbstractC13345e {
    public final Type ad;
    public AbstractC13345e license;
    public final Object metrica;
    public final String vip;

    public C13565e(Type type, String str, Object obj) {
        this.ad = type;
        this.vip = str;
        this.metrica = obj;
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        AbstractC13345e abstractC13345e = this.license;
        if (abstractC13345e == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        abstractC13345e.purchase(abstractC3442e, obj);
    }

    public final String toString() {
        AbstractC13345e abstractC13345e = this.license;
        return abstractC13345e != null ? abstractC13345e.toString() : super.toString();
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        AbstractC13345e abstractC13345e = this.license;
        if (abstractC13345e != null) {
            return abstractC13345e.vip(abstractC17080e);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }
}
