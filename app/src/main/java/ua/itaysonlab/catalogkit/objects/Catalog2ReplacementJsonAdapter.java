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
import defpackage.C2897e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2ReplacementJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("from_block_ids", "to_blocks");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public Catalog2ReplacementJsonAdapter(C14172e c14172e) {
        C2897e purchase = AbstractC18453e.purchase(List.class, String.class);
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(purchase, c3295e, "from_block_ids");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2Block.class), c3295e, "to_blocks");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Catalog2Replacement catalog2Replacement = (Catalog2Replacement) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("from_block_ids");
        this.vip.purchase(abstractC3442e, catalog2Replacement.ad);
        abstractC3442e.loadAd("to_blocks");
        this.metrica.purchase(abstractC3442e, catalog2Replacement.vip);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Replacement)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        List list = null;
        boolean z = false;
        boolean z2 = false;
        Set set = C3295e.f7451e;
        List list2 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("from_block_ids", "from_block_ids", abstractC17080e, set);
                    z = true;
                } else {
                    list = (List) vip;
                }
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("to_blocks", "to_blocks", abstractC17080e, set);
                    z2 = true;
                } else {
                    list2 = (List) vip2;
                }
            }
        }
        abstractC17080e.advert();
        if ((!z) & (list == null)) {
            set = AbstractC0869e.isPro("from_block_ids", "from_block_ids", abstractC17080e, set);
        }
        if ((list2 == null) & (!z2)) {
            set = AbstractC0869e.isPro("to_blocks", "to_blocks", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new Catalog2Replacement(list, list2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
