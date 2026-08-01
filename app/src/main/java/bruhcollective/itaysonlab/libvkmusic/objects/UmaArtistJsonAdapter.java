package bruhcollective.itaysonlab.libvkmusic.objects;

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

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UmaArtistJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("shareHash", "name", "apiId", "avatar", "isAutoGenCover", "isRadioCapable", "isLiked", "relevantArtistsNames", "vkId", "umaTags");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public UmaArtistJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "shareHash");
        this.metrica = c14172e.vip(String.class, c3295e, "name");
        this.license = c14172e.vip(Long.TYPE, c3295e, "apiId");
        this.appmetrica = c14172e.vip(UmaCover.class, c3295e, "avatar");
        this.purchase = c14172e.vip(Boolean.TYPE, c3295e, "isAutoGenCover");
        this.billing = c14172e.vip(Boolean.class, c3295e, "isRadioCapable");
        this.yandex = c14172e.vip(AbstractC18453e.purchase(List.class, String.class), c3295e, "relevantArtistsNames");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        UmaArtist umaArtist = (UmaArtist) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("shareHash");
        String str = umaArtist.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("name");
        this.metrica.purchase(abstractC3442e, umaArtist.vip);
        abstractC3442e.loadAd("apiId");
        AbstractC8647e.crashlytics(umaArtist.metrica, this.license, abstractC3442e, "avatar");
        this.appmetrica.purchase(abstractC3442e, umaArtist.license);
        abstractC3442e.loadAd("isAutoGenCover");
        AbstractC8647e.m2459native(umaArtist.appmetrica, this.purchase, abstractC3442e, "isRadioCapable");
        Boolean bool = umaArtist.purchase;
        AbstractC13345e abstractC13345e2 = this.billing;
        abstractC13345e2.purchase(abstractC3442e, bool);
        abstractC3442e.loadAd("isLiked");
        abstractC13345e2.purchase(abstractC3442e, umaArtist.billing);
        abstractC3442e.loadAd("relevantArtistsNames");
        this.yandex.purchase(abstractC3442e, umaArtist.yandex);
        abstractC3442e.loadAd("vkId");
        abstractC13345e.purchase(abstractC3442e, umaArtist.startapp);
        abstractC3442e.loadAd("umaTags");
        abstractC13345e.purchase(abstractC3442e, umaArtist.adcel);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaArtist)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0041. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Long l = null;
        String str = null;
        String str2 = null;
        UmaCover umaCover = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        Boolean bool3 = null;
        while (true) {
            Long l2 = l;
            Boolean bool4 = bool3;
            String str5 = str;
            if (!abstractC17080e.Signature()) {
                String str6 = str2;
                abstractC17080e.advert();
                if ((!z) & (str6 == null)) {
                    set = AbstractC0869e.isPro("name", "name", abstractC17080e, set);
                }
                if ((!z2) & (l2 == null)) {
                    set = AbstractC0869e.isPro("apiId", "apiId", abstractC17080e, set);
                }
                if ((!z3) & (umaCover == null)) {
                    set = AbstractC0869e.isPro("avatar", "avatar", abstractC17080e, set);
                }
                if ((!z4) & (bool4 == null)) {
                    set = AbstractC0869e.isPro("isAutoGenCover", "isAutoGenCover", abstractC17080e, set);
                }
                if (set.size() == 0) {
                    return new UmaArtist(str5, str6, l2.longValue(), umaCover, bool4.booleanValue(), bool, bool2, list, str3, str4);
                }
                throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
            }
            String str7 = str2;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.billing;
            boolean z5 = z;
            AbstractC13345e abstractC13345e2 = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    str2 = str7;
                    l = l2;
                    bool3 = bool4;
                    str = str5;
                    z = z5;
                    break;
                case 0:
                    str = (String) abstractC13345e2.vip(abstractC17080e);
                    str2 = str7;
                    l = l2;
                    bool3 = bool4;
                    z = z5;
                    break;
                case 1:
                    Object vip = this.metrica.vip(abstractC17080e);
                    if (vip != null) {
                        str2 = (String) vip;
                        l = l2;
                        bool3 = bool4;
                        str = str5;
                        z = z5;
                        break;
                    } else {
                        set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                        str2 = str7;
                        l = l2;
                        bool3 = bool4;
                        str = str5;
                        z = true;
                        break;
                    }
                case 2:
                    Object vip2 = this.license.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("apiId", "apiId", abstractC17080e, set);
                        str2 = str7;
                        l = l2;
                        bool3 = bool4;
                        str = str5;
                        z2 = true;
                        z = z5;
                        break;
                    } else {
                        l = (Long) vip2;
                        str2 = str7;
                        bool3 = bool4;
                        str = str5;
                        z = z5;
                    }
                case 3:
                    Object vip3 = this.appmetrica.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("avatar", "avatar", abstractC17080e, set);
                        str2 = str7;
                        l = l2;
                        bool3 = bool4;
                        str = str5;
                        z3 = true;
                        z = z5;
                        break;
                    } else {
                        umaCover = (UmaCover) vip3;
                        str2 = str7;
                        l = l2;
                        bool3 = bool4;
                        str = str5;
                        z = z5;
                    }
                case 4:
                    Object vip4 = this.purchase.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("isAutoGenCover", "isAutoGenCover", abstractC17080e, set);
                        str2 = str7;
                        l = l2;
                        bool3 = bool4;
                        str = str5;
                        z4 = true;
                        z = z5;
                        break;
                    } else {
                        bool3 = (Boolean) vip4;
                        str2 = str7;
                        l = l2;
                        str = str5;
                        z = z5;
                    }
                case 5:
                    bool = (Boolean) abstractC13345e.vip(abstractC17080e);
                    str2 = str7;
                    l = l2;
                    bool3 = bool4;
                    str = str5;
                    z = z5;
                    break;
                case 6:
                    bool2 = (Boolean) abstractC13345e.vip(abstractC17080e);
                    str2 = str7;
                    l = l2;
                    bool3 = bool4;
                    str = str5;
                    z = z5;
                    break;
                case 7:
                    list = (List) this.yandex.vip(abstractC17080e);
                    str2 = str7;
                    l = l2;
                    bool3 = bool4;
                    str = str5;
                    z = z5;
                    break;
                case 8:
                    str3 = (String) abstractC13345e2.vip(abstractC17080e);
                    str2 = str7;
                    l = l2;
                    bool3 = bool4;
                    str = str5;
                    z = z5;
                    break;
                case 9:
                    str4 = (String) abstractC13345e2.vip(abstractC17080e);
                    str2 = str7;
                    l = l2;
                    bool3 = bool4;
                    str = str5;
                    z = z5;
                    break;
                default:
                    str2 = str7;
                    l = l2;
                    bool3 = bool4;
                    str = str5;
                    z = z5;
                    break;
            }
        }
    }
}
