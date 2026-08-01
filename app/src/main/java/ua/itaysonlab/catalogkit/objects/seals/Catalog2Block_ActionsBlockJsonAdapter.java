package ua.itaysonlab.catalogkit.objects.seals;

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
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2Block_ActionsBlockJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "layout", "actions", "listen_events", "next_from");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public Catalog2Block_ActionsBlockJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "id");
        this.metrica = c14172e.vip(Catalog2Layout.class, c3295e, "layout");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2Button.class), c3295e, "actions");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, String.class), c3295e, "listen_events");
        this.purchase = c14172e.vip(String.class, c3295e, "next_from");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Catalog2Block.ActionsBlock actionsBlock = (Catalog2Block.ActionsBlock) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        this.vip.purchase(abstractC3442e, actionsBlock.ad);
        abstractC3442e.loadAd("layout");
        this.metrica.purchase(abstractC3442e, actionsBlock.vip);
        abstractC3442e.loadAd("actions");
        this.license.purchase(abstractC3442e, actionsBlock.metrica);
        abstractC3442e.loadAd("listen_events");
        this.appmetrica.purchase(abstractC3442e, actionsBlock.license);
        abstractC3442e.loadAd("next_from");
        this.purchase.purchase(abstractC3442e, actionsBlock.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Block.ActionsBlock)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Object obj2 = null;
        String str = null;
        Catalog2Layout catalog2Layout = null;
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        Object obj3 = null;
        while (true) {
            if (!abstractC17080e.Signature()) {
                break;
            }
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                    z = true;
                } else {
                    str = (String) vip;
                }
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("layout", "layout", abstractC17080e, set);
                    z2 = true;
                } else {
                    catalog2Layout = (Catalog2Layout) vip2;
                }
            } else if (mo2308extends == 2) {
                obj = this.license.vip(abstractC17080e);
                i &= -5;
            } else if (mo2308extends == 3) {
                obj3 = this.appmetrica.vip(abstractC17080e);
                i &= -9;
            } else if (mo2308extends == 4) {
                obj2 = this.purchase.vip(abstractC17080e);
                i &= -17;
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
        }
        if ((catalog2Layout == null) & (!z2)) {
            set = AbstractC0869e.isPro("layout", "layout", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i != -29) {
            return new Catalog2Block.ActionsBlock(str, catalog2Layout, (List) obj, (List) obj3, (String) obj2, i);
        }
        return new Catalog2Block.ActionsBlock(str, (String) obj2, (List) obj, (List) obj3, catalog2Layout);
    }
}
