package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomCatalogBlockItemMetaJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("icon", "content_type");
    public final AbstractC13345e vip;

    public CustomCatalogBlockItemMetaJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(String.class, C3295e.f7451e, "icon");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = (CustomCatalogBlockItemMeta) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("icon");
        String str = customCatalogBlockItemMeta.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("content_type");
        abstractC13345e.purchase(abstractC3442e, customCatalogBlockItemMeta.vip);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CustomCatalogBlockItemMeta)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        String str2 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    str = (String) abstractC13345e.vip(abstractC17080e);
                } else if (mo2308extends == 1) {
                    str2 = (String) abstractC13345e.vip(abstractC17080e);
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        return new CustomCatalogBlockItemMeta(str, str2);
    }
}
