package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2ReplacementOptionJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("replacement_id", "text", "icon", "selected");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public Catalog2ReplacementOptionJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "replacement_id");
        this.metrica = c14172e.vip(String.class, c3295e, "icon");
        this.license = c14172e.vip(Integer.class, c3295e, "selected");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Catalog2ReplacementOption catalog2ReplacementOption = (Catalog2ReplacementOption) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("replacement_id");
        String str = catalog2ReplacementOption.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("text");
        abstractC13345e.purchase(abstractC3442e, catalog2ReplacementOption.vip);
        abstractC3442e.loadAd("icon");
        this.metrica.purchase(abstractC3442e, catalog2ReplacementOption.metrica);
        abstractC3442e.loadAd("selected");
        this.license.purchase(abstractC3442e, catalog2ReplacementOption.license);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2ReplacementOption)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        char c = 65535;
        boolean z = false;
        String str = null;
        boolean z2 = false;
        String str2 = null;
        Object obj = null;
        Integer num = null;
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
                        set = AbstractC0869e.subs("replacement_id", "replacement_id", abstractC17080e, set);
                        z = true;
                    } else {
                        str = (String) vip;
                    }
                } else if (mo2308extends == 1) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("text", "text", abstractC17080e, set);
                        z2 = true;
                    } else {
                        str2 = (String) vip2;
                    }
                } else if (mo2308extends == 2) {
                    obj = this.metrica.vip(abstractC17080e);
                    c = 65531;
                } else if (mo2308extends == 3) {
                    num = (Integer) this.license.vip(abstractC17080e);
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
            i = -1;
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("replacement_id", "replacement_id", abstractC17080e, set);
        }
        if ((str2 == null) & (!z2)) {
            set = AbstractC0869e.isPro("text", "text", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        String str3 = (String) obj;
        if (c == 65531) {
            return new Catalog2ReplacementOption(str, str2, str3, num);
        }
        return new Catalog2ReplacementOption(str, str2, (c & 4) != 0 ? null : str3, num);
    }
}
