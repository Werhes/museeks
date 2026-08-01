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
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2ButtonJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("action", "section_id", "owner_id", "block_id", "mix_id", "entity_id", "options", "title", "description", "is_following", "ref_layout_name", "ref_items_count", "ref_data_type", "images", "foreground_images");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public Catalog2ButtonJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(Catalog2ButtonAction.class, c3295e, "action");
        this.metrica = c14172e.vip(String.class, c3295e, "section_id");
        this.license = c14172e.vip(Long.class, c3295e, "owner_id");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, Catalog2ReplacementOption.class), c3295e, "options");
        this.purchase = c14172e.vip(Boolean.class, c3295e, "is_following");
        this.billing = c14172e.vip(Integer.class, c3295e, "ref_items_count");
        this.yandex = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "images");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        Catalog2Button catalog2Button = (Catalog2Button) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("action");
        this.vip.purchase(abstractC3442e, catalog2Button.ad);
        abstractC3442e.loadAd("section_id");
        String str = catalog2Button.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("owner_id");
        this.license.purchase(abstractC3442e, catalog2Button.metrica);
        abstractC3442e.loadAd("block_id");
        abstractC13345e.purchase(abstractC3442e, catalog2Button.license);
        abstractC3442e.loadAd("mix_id");
        abstractC13345e.purchase(abstractC3442e, catalog2Button.appmetrica);
        abstractC3442e.loadAd("entity_id");
        abstractC13345e.purchase(abstractC3442e, catalog2Button.purchase);
        abstractC3442e.loadAd("options");
        this.appmetrica.purchase(abstractC3442e, catalog2Button.billing);
        abstractC3442e.loadAd("title");
        abstractC13345e.purchase(abstractC3442e, catalog2Button.yandex);
        abstractC3442e.loadAd("description");
        abstractC13345e.purchase(abstractC3442e, catalog2Button.startapp);
        abstractC3442e.loadAd("is_following");
        this.purchase.purchase(abstractC3442e, catalog2Button.adcel);
        abstractC3442e.loadAd("ref_layout_name");
        abstractC13345e.purchase(abstractC3442e, catalog2Button.mopub);
        abstractC3442e.loadAd("ref_items_count");
        this.billing.purchase(abstractC3442e, catalog2Button.advert);
        abstractC3442e.loadAd("ref_data_type");
        abstractC13345e.purchase(abstractC3442e, catalog2Button.smaato);
        abstractC3442e.loadAd("images");
        List list = catalog2Button.amazon;
        AbstractC13345e abstractC13345e2 = this.yandex;
        abstractC13345e2.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("foreground_images");
        abstractC13345e2.purchase(abstractC3442e, catalog2Button.loadAd);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Catalog2Button)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        String str;
        abstractC17080e.license();
        ?? r6 = 0;
        Catalog2ButtonAction catalog2ButtonAction = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        List list = null;
        List list2 = null;
        Object obj9 = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        Long l = null;
        int i = -1;
        String str2 = null;
        while (true) {
            Long l2 = l;
            if (!abstractC17080e.Signature()) {
                String str3 = str2;
                String str4 = r6;
                abstractC17080e.advert();
                if ((!z) & (catalog2ButtonAction == null)) {
                    set = AbstractC0869e.isPro("action", "action", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (i == -32767) {
                    return new Catalog2Button(catalog2ButtonAction, (String) obj9, l2, str3, str4, (String) obj, (List) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (String) obj6, (Integer) obj7, (String) obj8, list, list2);
                }
                return new Catalog2Button(catalog2ButtonAction, (String) obj9, l2, str3, str4, (String) obj, (List) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (String) obj6, (Integer) obj7, (String) obj8, list, list2, i);
            }
            String str5 = str2;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.yandex;
            Object obj10 = r6;
            AbstractC13345e abstractC13345e2 = this.metrica;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 0:
                    Object vip = this.vip.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("action", "action", abstractC17080e, set);
                        str = str5;
                        z = true;
                        l = l2;
                        str2 = str;
                        r6 = obj10;
                        break;
                    } else {
                        catalog2ButtonAction = (Catalog2ButtonAction) vip;
                        str = str5;
                        l = l2;
                        str2 = str;
                        r6 = obj10;
                    }
                case 1:
                    obj9 = abstractC13345e2.vip(abstractC17080e);
                    i &= -3;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 2:
                    i &= -5;
                    str2 = str5;
                    l = this.license.vip(abstractC17080e);
                    r6 = obj10;
                    break;
                case 3:
                    i &= -9;
                    str = abstractC13345e2.vip(abstractC17080e);
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 4:
                    r6 = abstractC13345e2.vip(abstractC17080e);
                    i &= -17;
                    str2 = str5;
                    l = l2;
                    break;
                case 5:
                    obj = abstractC13345e2.vip(abstractC17080e);
                    i &= -33;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 6:
                    obj2 = this.appmetrica.vip(abstractC17080e);
                    i &= -65;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 7:
                    obj3 = abstractC13345e2.vip(abstractC17080e);
                    i &= -129;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 8:
                    obj4 = abstractC13345e2.vip(abstractC17080e);
                    i &= -257;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 9:
                    obj5 = this.purchase.vip(abstractC17080e);
                    i &= -513;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 10:
                    obj6 = abstractC13345e2.vip(abstractC17080e);
                    i &= -1025;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 11:
                    obj7 = this.billing.vip(abstractC17080e);
                    i &= -2049;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 12:
                    obj8 = abstractC13345e2.vip(abstractC17080e);
                    i &= -4097;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 13:
                    ?? vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == 0) {
                        set = AbstractC0869e.subs("images", "images", abstractC17080e, set);
                    } else {
                        list = vip2;
                    }
                    i &= -8193;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                case 14:
                    ?? vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == 0) {
                        set = AbstractC0869e.subs("foreground_images", "foreground_images", abstractC17080e, set);
                    } else {
                        list2 = vip3;
                    }
                    i &= -16385;
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
                default:
                    str = str5;
                    l = l2;
                    str2 = str;
                    r6 = obj10;
                    break;
            }
        }
    }
}
