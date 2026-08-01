package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

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
public final class MainArtistJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "domain", "name", "photo", "is_cached");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public MainArtistJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "id");
        this.metrica = c14172e.vip(String.class, c3295e, "name");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "photo");
        this.appmetrica = c14172e.vip(Boolean.TYPE, c3295e, "is_cached");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        MainArtist mainArtist = (MainArtist) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        String str = mainArtist.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("domain");
        abstractC13345e.purchase(abstractC3442e, mainArtist.vip);
        abstractC3442e.loadAd("name");
        this.metrica.purchase(abstractC3442e, mainArtist.metrica);
        abstractC3442e.loadAd("photo");
        this.license.purchase(abstractC3442e, mainArtist.license);
        abstractC3442e.loadAd("is_cached");
        this.appmetrica.purchase(abstractC3442e, Boolean.valueOf(mainArtist.appmetrica));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(MainArtist)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        Set set = C3295e.f7451e;
        int i = -1;
        Object obj2 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    str = (String) abstractC13345e.vip(abstractC17080e);
                } else if (mo2308extends == 1) {
                    obj = abstractC13345e.vip(abstractC17080e);
                    i &= -3;
                } else if (mo2308extends == 2) {
                    Object vip = this.metrica.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                        z = true;
                    } else {
                        str2 = (String) vip;
                    }
                } else if (mo2308extends == 3) {
                    obj2 = this.license.vip(abstractC17080e);
                    i &= -9;
                } else if (mo2308extends == 4) {
                    Object vip2 = this.appmetrica.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("is_cached", "is_cached", abstractC17080e, set);
                    } else {
                        z2 = ((Boolean) vip2).booleanValue();
                    }
                    i &= -17;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if ((str2 == null) & (!z)) {
            set = AbstractC0869e.isPro("name", "name", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        String str3 = (String) obj;
        List list = (List) obj2;
        return i == -27 ? new MainArtist(str, str3, str2, list, z2) : new MainArtist(str, str3, str2, list, z2, i);
    }
}
