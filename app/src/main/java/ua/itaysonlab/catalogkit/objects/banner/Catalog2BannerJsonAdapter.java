package ua.itaysonlab.catalogkit.objects.banner;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2BannerJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "click_action", "buttons", "images", "text", "title", "subtext", "image_mode");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public Catalog2BannerJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(Catalog2BannerClickActionRoot.class, c3295e, "click_action");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2Button.class), c3295e, "buttons");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "images");
        this.purchase = c14172e.vip(String.class, c3295e, "text");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Catalog2Banner catalog2Banner = (Catalog2Banner) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        AbstractC8647e.subs(catalog2Banner.ad, this.vip, abstractC3442e, "click_action");
        this.metrica.purchase(abstractC3442e, catalog2Banner.vip);
        abstractC3442e.loadAd("buttons");
        this.license.purchase(abstractC3442e, catalog2Banner.metrica);
        abstractC3442e.loadAd("images");
        this.appmetrica.purchase(abstractC3442e, catalog2Banner.license);
        abstractC3442e.loadAd("text");
        String str = catalog2Banner.appmetrica;
        AbstractC13345e abstractC13345e = this.purchase;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("title");
        abstractC13345e.purchase(abstractC3442e, catalog2Banner.purchase);
        abstractC3442e.loadAd("subtext");
        abstractC13345e.purchase(abstractC3442e, catalog2Banner.billing);
        abstractC3442e.loadAd("image_mode");
        abstractC13345e.purchase(abstractC3442e, catalog2Banner.yandex);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Banner)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        char c = 65535;
        boolean z = false;
        Integer num = null;
        boolean z2 = false;
        Object obj = null;
        Catalog2BannerClickActionRoot catalog2BannerClickActionRoot = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.purchase;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = this.vip.vip(abstractC17080e);
                    if (vip != null) {
                        num = (Integer) vip;
                        break;
                    } else {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z = true;
                        break;
                    }
                case 1:
                    catalog2BannerClickActionRoot = (Catalog2BannerClickActionRoot) this.metrica.vip(abstractC17080e);
                    break;
                case 2:
                    obj = this.license.vip(abstractC17080e);
                    c = 65531;
                    break;
                case 3:
                    Object vip2 = this.appmetrica.vip(abstractC17080e);
                    if (vip2 != null) {
                        list = (List) vip2;
                        break;
                    } else {
                        set = AbstractC0869e.subs("images", "images", abstractC17080e, set);
                        z2 = true;
                        break;
                    }
                case 4:
                    str = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 5:
                    str2 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 6:
                    str3 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 7:
                    str4 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
            }
        }
        abstractC17080e.advert();
        if ((!z) & (num == null)) {
            set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
        }
        if ((!z2) & (list == null)) {
            set = AbstractC0869e.isPro("images", "images", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        Object obj2 = obj;
        int intValue = num.intValue();
        if (c == 65531) {
            return new Catalog2Banner(intValue, catalog2BannerClickActionRoot, (List) obj2, list, str, str2, str3, str4);
        }
        return new Catalog2Banner(intValue, catalog2BannerClickActionRoot, (c & 4) != 0 ? null : (List) obj2, list, str, str2, str3, str4);
    }
}
