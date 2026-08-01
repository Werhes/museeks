package ua.itaysonlab.vkapi2.objects.music.catalog;

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
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomCatalogBlockItemJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("title", "subtitle", "image", "url", "id", "meta");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public CustomCatalogBlockItemJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "title");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "image");
        this.license = c14172e.vip(CustomCatalogBlockItemMeta.class, c3295e, "meta");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("title");
        String str = customCatalogBlockItem.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("subtitle");
        abstractC13345e.purchase(abstractC3442e, customCatalogBlockItem.vip);
        abstractC3442e.loadAd("image");
        this.metrica.purchase(abstractC3442e, customCatalogBlockItem.metrica);
        abstractC3442e.loadAd("url");
        abstractC13345e.purchase(abstractC3442e, customCatalogBlockItem.license);
        abstractC3442e.loadAd("id");
        abstractC13345e.purchase(abstractC3442e, customCatalogBlockItem.appmetrica);
        abstractC3442e.loadAd("meta");
        this.license.purchase(abstractC3442e, customCatalogBlockItem.purchase);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CustomCatalogBlockItem)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip != null) {
                        str = (String) vip;
                        break;
                    } else {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                        z = true;
                        break;
                    }
                case 1:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("subtitle", "subtitle", abstractC17080e, set);
                    } else {
                        obj = vip2;
                    }
                    i &= -3;
                    break;
                case 2:
                    obj2 = this.metrica.vip(abstractC17080e);
                    i &= -5;
                    break;
                case 3:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                    } else {
                        obj3 = vip3;
                    }
                    i &= -9;
                    break;
                case 4:
                    Object vip4 = abstractC13345e.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                    } else {
                        obj4 = vip4;
                    }
                    i &= -17;
                    break;
                case 5:
                    customCatalogBlockItemMeta = (CustomCatalogBlockItemMeta) this.license.vip(abstractC17080e);
                    break;
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("title", "title", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        Object obj5 = obj;
        if (i == -31) {
            return new CustomCatalogBlockItem(str, (String) obj5, (List) obj2, (String) obj3, (String) obj4, customCatalogBlockItemMeta);
        }
        String str2 = (String) obj5;
        List list = (List) obj2;
        String str3 = (String) obj3;
        String str4 = (String) obj4;
        if ((i & 2) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        List list2 = (i & 4) != 0 ? null : list;
        if ((i & 8) != 0) {
            str3 = BuildConfig.FLAVOR;
        }
        return new CustomCatalogBlockItem(str, str2, list2, str3, (i & 16) != 0 ? BuildConfig.FLAVOR : str4, customCatalogBlockItemMeta);
    }
}
