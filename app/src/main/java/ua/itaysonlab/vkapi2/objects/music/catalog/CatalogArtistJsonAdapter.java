package ua.itaysonlab.vkapi2.objects.music.catalog;

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
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.Genre;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogArtistJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("name", "id", "domain", "photo", "photos", "genres", "is_album_cover", "is_followed", "can_follow");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public CatalogArtistJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "name");
        this.metrica = c14172e.vip(String.class, c3295e, "domain");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, CustomCatalogBlockItemPhoto.class), c3295e, "photo");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, CatalogArtistPhotosContainer.class), c3295e, "photos");
        this.purchase = c14172e.vip(AbstractC18453e.purchase(List.class, Genre.class), c3295e, "genres");
        this.billing = c14172e.vip(Boolean.TYPE, c3295e, "is_album_cover");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        CatalogArtist catalogArtist = (CatalogArtist) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("name");
        String str = catalogArtist.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("id");
        abstractC13345e.purchase(abstractC3442e, catalogArtist.vip);
        abstractC3442e.loadAd("domain");
        this.metrica.purchase(abstractC3442e, catalogArtist.metrica);
        abstractC3442e.loadAd("photo");
        this.license.purchase(abstractC3442e, catalogArtist.license);
        abstractC3442e.loadAd("photos");
        this.appmetrica.purchase(abstractC3442e, catalogArtist.appmetrica);
        abstractC3442e.loadAd("genres");
        this.purchase.purchase(abstractC3442e, catalogArtist.purchase);
        abstractC3442e.loadAd("is_album_cover");
        boolean z = catalogArtist.billing;
        AbstractC13345e abstractC13345e2 = this.billing;
        AbstractC8647e.m2459native(z, abstractC13345e2, abstractC3442e, "is_followed");
        AbstractC8647e.m2459native(catalogArtist.yandex, abstractC13345e2, abstractC3442e, "can_follow");
        abstractC13345e2.purchase(abstractC3442e, Boolean.valueOf(catalogArtist.startapp));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(CatalogArtist)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0034. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            boolean z6 = z;
            if (!abstractC17080e.Signature()) {
                boolean z7 = z2;
                String str4 = str;
                abstractC17080e.advert();
                if ((!z6) & (str4 == null)) {
                    set = AbstractC0869e.isPro("name", "name", abstractC17080e, set);
                }
                if ((!z7) & (str2 == null)) {
                    set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
                }
                if (set.size() != 0) {
                    throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
                }
                if (i == -449) {
                    return new CatalogArtist(str4, str2, str3, list, list2, list3, z3, z4, z5);
                }
                if ((i & 64) != 0) {
                    z3 = false;
                }
                if ((i & 128) != 0) {
                    z4 = false;
                }
                if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    z5 = false;
                }
                return new CatalogArtist(str4, str2, str3, list, list2, list3, z3, z4, z5);
            }
            boolean z8 = z2;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            String str5 = str;
            AbstractC13345e abstractC13345e2 = this.billing;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
                case 0:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip != null) {
                        str = (String) vip;
                        z2 = z8;
                        z = z6;
                        break;
                    } else {
                        set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                        z2 = z8;
                        z = true;
                        str = str5;
                        break;
                    }
                case 1:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z = z6;
                        z2 = true;
                        str = str5;
                        break;
                    } else {
                        str2 = (String) vip2;
                        z2 = z8;
                        z = z6;
                        str = str5;
                    }
                case 2:
                    str3 = (String) this.metrica.vip(abstractC17080e);
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
                case 3:
                    list = (List) this.license.vip(abstractC17080e);
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
                case 4:
                    list2 = (List) this.appmetrica.vip(abstractC17080e);
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
                case 5:
                    list3 = (List) this.purchase.vip(abstractC17080e);
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
                case 6:
                    Object vip3 = abstractC13345e2.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("is_album_cover", "is_album_cover", abstractC17080e, set);
                    } else {
                        z3 = ((Boolean) vip3).booleanValue();
                    }
                    i &= -65;
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
                case 7:
                    Object vip4 = abstractC13345e2.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("is_followed", "is_followed", abstractC17080e, set);
                    } else {
                        z4 = ((Boolean) vip4).booleanValue();
                    }
                    i &= -129;
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
                case 8:
                    Object vip5 = abstractC13345e2.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("can_follow", "can_follow", abstractC17080e, set);
                    } else {
                        z5 = ((Boolean) vip5).booleanValue();
                    }
                    i &= -257;
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
                default:
                    z2 = z8;
                    z = z6;
                    str = str5;
                    break;
            }
        }
    }
}
