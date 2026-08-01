package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2SectionJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "title", "next_from", "blocks", "actions");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public Catalog2SectionJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "id");
        this.metrica = c14172e.vip(String.class, c3295e, "next_from");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2Block.class), c3295e, "blocks");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2Button.class), c3295e, "actions");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Catalog2Section catalog2Section = (Catalog2Section) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        String str = catalog2Section.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("title");
        abstractC13345e.purchase(abstractC3442e, catalog2Section.vip);
        abstractC3442e.loadAd("next_from");
        this.metrica.purchase(abstractC3442e, catalog2Section.metrica);
        abstractC3442e.loadAd("blocks");
        this.license.purchase(abstractC3442e, catalog2Section.license);
        abstractC3442e.loadAd("actions");
        this.appmetrica.purchase(abstractC3442e, catalog2Section.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Section)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        int i = -1;
        Object obj2 = null;
        String str = null;
        String str2 = null;
        Set set = C3295e.f7451e;
        int i2 = -1;
        boolean z = false;
        boolean z2 = false;
        Object obj3 = null;
        while (true) {
            if (!abstractC17080e.Signature()) {
                break;
            }
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != i) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z = true;
                    } else {
                        str = (String) vip;
                    }
                } else if (mo2308extends == 1) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                        z2 = true;
                    } else {
                        str2 = (String) vip2;
                    }
                } else if (mo2308extends == 2) {
                    obj = this.metrica.vip(abstractC17080e);
                    i2 &= -5;
                } else if (mo2308extends == 3) {
                    obj3 = this.license.vip(abstractC17080e);
                    i2 &= -9;
                } else if (mo2308extends == 4) {
                    obj2 = this.appmetrica.vip(abstractC17080e);
                    i2 &= -17;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
            i = -1;
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
        }
        if ((str2 == null) & (!z2)) {
            set = AbstractC0869e.isPro("title", "title", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return i2 == -29 ? new Catalog2Section(str, str2, (String) obj, (List) obj3, (List) obj2) : new Catalog2Section(str, str2, (String) obj, (List) obj3, (List) obj2, i2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
