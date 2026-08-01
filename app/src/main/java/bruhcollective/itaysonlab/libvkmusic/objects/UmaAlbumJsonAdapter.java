package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C13664e;
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
public final class UmaAlbumJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("name", "apiId", "cover", "artists", "tags");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public UmaAlbumJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "name");
        this.metrica = c14172e.vip(Long.TYPE, c3295e, "apiId");
        this.license = c14172e.vip(UmaCover.class, c3295e, "cover");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, UmaArtist.class), c3295e, "artists");
        this.purchase = c14172e.vip(AbstractC18453e.purchase(List.class, UmaTag.class), c3295e, "tags");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        UmaAlbum umaAlbum = (UmaAlbum) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("name");
        this.vip.purchase(abstractC3442e, umaAlbum.ad);
        abstractC3442e.loadAd("apiId");
        AbstractC8647e.crashlytics(umaAlbum.vip, this.metrica, abstractC3442e, "cover");
        this.license.purchase(abstractC3442e, umaAlbum.metrica);
        abstractC3442e.loadAd("artists");
        this.appmetrica.purchase(abstractC3442e, umaAlbum.license);
        abstractC3442e.loadAd("tags");
        this.purchase.purchase(abstractC3442e, umaAlbum.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaAlbum)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        Long l;
        abstractC17080e.license();
        Long l2 = null;
        Object obj = null;
        String str = null;
        UmaCover umaCover = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        int i = -1;
        boolean z2 = false;
        boolean z3 = false;
        Object obj2 = null;
        while (true) {
            l = l2;
            if (!abstractC17080e.Signature()) {
                break;
            }
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                    l2 = l;
                    z = true;
                } else {
                    str = (String) vip;
                }
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("apiId", "apiId", abstractC17080e, set);
                    l2 = l;
                    z2 = true;
                } else {
                    l2 = (Long) vip2;
                }
            } else if (mo2308extends == 2) {
                Object vip3 = this.license.vip(abstractC17080e);
                if (vip3 == null) {
                    set = AbstractC0869e.subs("cover", "cover", abstractC17080e, set);
                    l2 = l;
                    z3 = true;
                } else {
                    umaCover = (UmaCover) vip3;
                }
            } else if (mo2308extends == 3) {
                obj2 = this.appmetrica.vip(abstractC17080e);
                i &= -9;
            } else if (mo2308extends == 4) {
                obj = this.purchase.vip(abstractC17080e);
                i &= -17;
            }
            l2 = l;
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("name", "name", abstractC17080e, set);
        }
        if ((!z2) & (l == null)) {
            set = AbstractC0869e.isPro("apiId", "apiId", abstractC17080e, set);
        }
        if ((!z3) & (umaCover == null)) {
            set = AbstractC0869e.isPro("cover", "cover", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        Object obj3 = obj;
        long longValue = l.longValue();
        if (i == -25) {
            return new UmaAlbum(str, longValue, umaCover, (List) obj2, (List) obj3);
        }
        List list = (List) obj2;
        List list2 = (List) obj3;
        int i2 = i & 8;
        C13664e c13664e = C13664e.f27089e;
        if (i2 != 0) {
            list = c13664e;
        }
        return new UmaAlbum(str, longValue, umaCover, list, (i & 16) != 0 ? c13664e : list2);
    }
}
