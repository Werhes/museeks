package ua.itaysonlab.vkapi2.objects.podcasts;

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

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PodcastCatalogLongreadJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "owner_id", "owner_name", "photo", "published_date", "subtitle", "title", "url", "view_url", "views", "shares");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public PodcastCatalogLongreadJsonAdapter(C14172e c14172e) {
        Class cls = Integer.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(Long.TYPE, c3295e, "owner_id");
        this.license = c14172e.vip(String.class, c3295e, "owner_name");
        this.appmetrica = c14172e.vip(PodcastCover.class, c3295e, "photo");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        PodcastCatalogLongread podcastCatalogLongread = (PodcastCatalogLongread) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        int i = podcastCatalogLongread.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.subs(i, abstractC13345e, abstractC3442e, "owner_id");
        AbstractC8647e.crashlytics(podcastCatalogLongread.vip, this.metrica, abstractC3442e, "owner_name");
        String str = podcastCatalogLongread.metrica;
        AbstractC13345e abstractC13345e2 = this.license;
        abstractC13345e2.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("photo");
        this.appmetrica.purchase(abstractC3442e, podcastCatalogLongread.license);
        abstractC3442e.loadAd("published_date");
        AbstractC8647e.subs(podcastCatalogLongread.appmetrica, abstractC13345e, abstractC3442e, "subtitle");
        abstractC13345e2.purchase(abstractC3442e, podcastCatalogLongread.purchase);
        abstractC3442e.loadAd("title");
        abstractC13345e2.purchase(abstractC3442e, podcastCatalogLongread.billing);
        abstractC3442e.loadAd("url");
        abstractC13345e2.purchase(abstractC3442e, podcastCatalogLongread.yandex);
        abstractC3442e.loadAd("view_url");
        abstractC13345e2.purchase(abstractC3442e, podcastCatalogLongread.startapp);
        abstractC3442e.loadAd("views");
        AbstractC8647e.subs(podcastCatalogLongread.adcel, abstractC13345e, abstractC3442e, "shares");
        abstractC13345e.purchase(abstractC3442e, Integer.valueOf(podcastCatalogLongread.mopub));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PodcastCatalogLongread)";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x006c. Please report as an issue. */
    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        PodcastCover podcastCover = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        Long l = null;
        while (true) {
            Integer num5 = num;
            Long l2 = l;
            Integer num6 = num2;
            Integer num7 = num3;
            Integer num8 = num4;
            String str6 = str;
            PodcastCover podcastCover2 = podcastCover;
            boolean z12 = z;
            String str7 = str2;
            String str8 = str3;
            if (!abstractC17080e.Signature()) {
                String str9 = str4;
                String str10 = str5;
                abstractC17080e.advert();
                if ((!z12) & (num5 == null)) {
                    set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
                }
                if ((!z2) & (l2 == null)) {
                    set = AbstractC0869e.isPro("owner_id", "owner_id", abstractC17080e, set);
                }
                if ((!z3) & (str6 == null)) {
                    set = AbstractC0869e.isPro("owner_name", "owner_name", abstractC17080e, set);
                }
                if ((!z4) & (podcastCover2 == null)) {
                    set = AbstractC0869e.isPro("photo", "photo", abstractC17080e, set);
                }
                if ((!z5) & (num6 == null)) {
                    set = AbstractC0869e.isPro("published_date", "published_date", abstractC17080e, set);
                }
                if ((!z6) & (str7 == null)) {
                    set = AbstractC0869e.isPro("subtitle", "subtitle", abstractC17080e, set);
                }
                if ((!z7) & (str8 == null)) {
                    set = AbstractC0869e.isPro("title", "title", abstractC17080e, set);
                }
                if ((!z8) & (str9 == null)) {
                    set = AbstractC0869e.isPro("url", "url", abstractC17080e, set);
                }
                if ((!z9) & (str10 == null)) {
                    set = AbstractC0869e.isPro("view_url", "view_url", abstractC17080e, set);
                }
                if ((!z10) & (num7 == null)) {
                    set = AbstractC0869e.isPro("views", "views", abstractC17080e, set);
                }
                if ((!z11) & (num8 == null)) {
                    set = AbstractC0869e.isPro("shares", "shares", abstractC17080e, set);
                }
                if (set.size() == 0) {
                    return new PodcastCatalogLongread(num5.intValue(), l2.longValue(), str6, podcastCover2, num6.intValue(), str7, str8, str9, str10, num7.intValue(), num8.intValue());
                }
                throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
            }
            String str11 = str4;
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            String str12 = str5;
            AbstractC13345e abstractC13345e2 = this.license;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    str4 = str11;
                    num = num5;
                    l = l2;
                    num2 = num6;
                    num3 = num7;
                    num4 = num8;
                    str = str6;
                    podcastCover = podcastCover2;
                    z = z12;
                    str2 = str7;
                    str3 = str8;
                    str5 = str12;
                    break;
                case 0:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        str2 = str7;
                        str3 = str8;
                        z = true;
                        str5 = str12;
                        break;
                    } else {
                        num = (Integer) vip;
                        str4 = str11;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        str5 = str12;
                    }
                case 1:
                    Object vip2 = this.metrica.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("owner_id", "owner_id", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z2 = true;
                        str5 = str12;
                        break;
                    } else {
                        l = (Long) vip2;
                        str4 = str11;
                        num = num5;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        str5 = str12;
                    }
                case 2:
                    Object vip3 = abstractC13345e2.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("owner_name", "owner_name", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z3 = true;
                        str5 = str12;
                        break;
                    } else {
                        str = (String) vip3;
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        str5 = str12;
                    }
                case 3:
                    Object vip4 = this.appmetrica.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("photo", "photo", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z4 = true;
                        str5 = str12;
                        break;
                    } else {
                        podcastCover = (PodcastCover) vip4;
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        str5 = str12;
                    }
                case 4:
                    Object vip5 = abstractC13345e.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("published_date", "published_date", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z5 = true;
                        str5 = str12;
                        break;
                    } else {
                        num2 = (Integer) vip5;
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        str5 = str12;
                    }
                case 5:
                    Object vip6 = abstractC13345e2.vip(abstractC17080e);
                    if (vip6 == null) {
                        set = AbstractC0869e.subs("subtitle", "subtitle", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z6 = true;
                        str5 = str12;
                        break;
                    } else {
                        str2 = (String) vip6;
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str3 = str8;
                        str5 = str12;
                    }
                case 6:
                    Object vip7 = abstractC13345e2.vip(abstractC17080e);
                    if (vip7 == null) {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z7 = true;
                    } else {
                        str3 = (String) vip7;
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                    }
                    str5 = str12;
                    break;
                case 7:
                    Object vip8 = abstractC13345e2.vip(abstractC17080e);
                    if (vip8 == null) {
                        set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z8 = true;
                        str5 = str12;
                        break;
                    } else {
                        str4 = (String) vip8;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        str5 = str12;
                    }
                case 8:
                    Object vip9 = abstractC13345e2.vip(abstractC17080e);
                    if (vip9 != null) {
                        str5 = (String) vip9;
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        break;
                    } else {
                        set = AbstractC0869e.subs("view_url", "view_url", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z9 = true;
                        str5 = str12;
                        break;
                    }
                case 9:
                    Object vip10 = abstractC13345e.vip(abstractC17080e);
                    if (vip10 == null) {
                        set = AbstractC0869e.subs("views", "views", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z10 = true;
                        str5 = str12;
                        break;
                    } else {
                        num3 = (Integer) vip10;
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        str5 = str12;
                    }
                case 10:
                    Object vip11 = abstractC13345e.vip(abstractC17080e);
                    if (vip11 == null) {
                        set = AbstractC0869e.subs("shares", "shares", abstractC17080e, set);
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        num4 = num8;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        z11 = true;
                        str5 = str12;
                        break;
                    } else {
                        num4 = (Integer) vip11;
                        str4 = str11;
                        num = num5;
                        l = l2;
                        num2 = num6;
                        num3 = num7;
                        str = str6;
                        podcastCover = podcastCover2;
                        z = z12;
                        str2 = str7;
                        str3 = str8;
                        str5 = str12;
                    }
                default:
                    str4 = str11;
                    num = num5;
                    l = l2;
                    num2 = num6;
                    num3 = num7;
                    num4 = num8;
                    str = str6;
                    podcastCover = podcastCover2;
                    z = z12;
                    str2 = str7;
                    str3 = str8;
                    str5 = str12;
                    break;
            }
        }
    }
}
