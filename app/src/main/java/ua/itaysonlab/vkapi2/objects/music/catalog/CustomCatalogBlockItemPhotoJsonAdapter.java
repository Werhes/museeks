package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomCatalogBlockItemPhotoJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("height", "url", "width", "id");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public CustomCatalogBlockItemPhotoJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "height");
        this.metrica = c14172e.vip(String.class, c3295e, "url");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("height");
        int i = customCatalogBlockItemPhoto.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.subs(i, abstractC13345e, abstractC3442e, "url");
        String str = customCatalogBlockItemPhoto.vip;
        AbstractC13345e abstractC13345e2 = this.metrica;
        abstractC13345e2.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("width");
        AbstractC8647e.subs(customCatalogBlockItemPhoto.metrica, abstractC13345e, abstractC3442e, "id");
        abstractC13345e2.purchase(abstractC3442e, customCatalogBlockItemPhoto.license);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CustomCatalogBlockItemPhoto)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        CustomCatalogBlockItemPhotoJsonAdapter customCatalogBlockItemPhotoJsonAdapter = this;
        abstractC17080e.license();
        Integer num = null;
        Integer num2 = null;
        Object obj = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        char c = 65535;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(customCatalogBlockItemPhotoJsonAdapter.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = customCatalogBlockItemPhotoJsonAdapter.vip;
                if (mo2308extends != 0) {
                    AbstractC13345e abstractC13345e2 = customCatalogBlockItemPhotoJsonAdapter.metrica;
                    if (mo2308extends == 1) {
                        Object vip = abstractC13345e2.vip(abstractC17080e);
                        if (vip == null) {
                            set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                            z2 = true;
                        } else {
                            str = (String) vip;
                        }
                    } else if (mo2308extends == 2) {
                        Object vip2 = abstractC13345e.vip(abstractC17080e);
                        if (vip2 == null) {
                            set = AbstractC0869e.subs("width", "width", abstractC17080e, set);
                            z3 = true;
                        } else {
                            num2 = (Integer) vip2;
                        }
                    } else if (mo2308extends == 3) {
                        Object vip3 = abstractC13345e2.vip(abstractC17080e);
                        if (vip3 == null) {
                            set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        } else {
                            obj = vip3;
                        }
                        c = 65527;
                    }
                } else {
                    Object vip4 = abstractC13345e.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("height", "height", abstractC17080e, set);
                        z = true;
                    } else {
                        num = (Integer) vip4;
                    }
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
            customCatalogBlockItemPhotoJsonAdapter = this;
        }
        abstractC17080e.advert();
        if ((!z) & (num == null)) {
            set = AbstractC0869e.isPro("height", "height", abstractC17080e, set);
        }
        if ((!z2) & (str == null)) {
            set = AbstractC0869e.isPro("url", "url", abstractC17080e, set);
        }
        if ((!z3) & (num2 == null)) {
            set = AbstractC0869e.isPro("width", "width", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (c == 65527) {
            return new CustomCatalogBlockItemPhoto(num.intValue(), num2.intValue(), str, (String) obj);
        }
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        String str2 = (String) obj;
        if ((c & '\b') != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        return new CustomCatalogBlockItemPhoto(intValue, intValue2, str, str2);
    }
}
