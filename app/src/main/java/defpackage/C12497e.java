package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12497e extends AbstractC13345e {
    public static final C9981e metrica = new C9981e(2);
    public final AbstractC13345e ad;
    public final /* synthetic */ int vip;

    public C12497e(AbstractC13345e abstractC13345e, int i) {
        this.vip = i;
        this.ad = abstractC13345e;
    }

    public final Collection billing() {
        switch (this.vip) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        switch (this.vip) {
            case 0:
                abstractC3442e.ad();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    this.ad.purchase(abstractC3442e, it.next());
                }
                ((C12867e) abstractC3442e).crashlytics(1, 2, ']');
                return;
            default:
                abstractC3442e.ad();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    this.ad.purchase(abstractC3442e, it2.next());
                }
                ((C12867e) abstractC3442e).crashlytics(1, 2, ']');
                return;
        }
    }

    public final String toString() {
        return this.ad + ".collection()";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        switch (this.vip) {
            case 0:
                Collection billing = billing();
                abstractC17080e.ad();
                while (abstractC17080e.Signature()) {
                    ((ArrayList) billing).add(this.ad.vip(abstractC17080e));
                }
                abstractC17080e.purchase();
                return billing;
            default:
                Collection billing2 = billing();
                abstractC17080e.ad();
                while (abstractC17080e.Signature()) {
                    billing2.add(this.ad.vip(abstractC17080e));
                }
                abstractC17080e.purchase();
                return billing2;
        }
    }
}
