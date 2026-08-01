package ua.itaysonlab.catalogkit.objects.seals;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2Layout_ExtendedHeaderJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("title", "subtitle", "style");
    public final AbstractC13345e vip;

    public Catalog2Layout_ExtendedHeaderJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(String.class, C3295e.f7451e, "title");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Catalog2Layout.ExtendedHeader extendedHeader = (Catalog2Layout.ExtendedHeader) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("title");
        String str = extendedHeader.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("subtitle");
        abstractC13345e.purchase(abstractC3442e, extendedHeader.vip);
        abstractC3442e.loadAd("style");
        abstractC13345e.purchase(abstractC3442e, extendedHeader.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Layout.ExtendedHeader)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    str = (String) abstractC13345e.vip(abstractC17080e);
                } else if (mo2308extends == 1) {
                    str2 = (String) abstractC13345e.vip(abstractC17080e);
                } else if (mo2308extends == 2) {
                    str3 = (String) abstractC13345e.vip(abstractC17080e);
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        return new Catalog2Layout.ExtendedHeader(str, str2, str3);
    }
}
