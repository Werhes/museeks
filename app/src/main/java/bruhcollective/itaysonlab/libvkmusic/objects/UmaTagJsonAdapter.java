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
public final class UmaTagJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("name", "apiId", "cover", "relevantArtistsNames");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public UmaTagJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "name");
        this.metrica = c14172e.vip(Long.TYPE, c3295e, "apiId");
        this.license = c14172e.vip(UmaCover.class, c3295e, "cover");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, String.class), c3295e, "relevantArtistsNames");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        UmaTag umaTag = (UmaTag) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("name");
        this.vip.purchase(abstractC3442e, umaTag.ad);
        abstractC3442e.loadAd("apiId");
        AbstractC8647e.crashlytics(umaTag.vip, this.metrica, abstractC3442e, "cover");
        this.license.purchase(abstractC3442e, umaTag.metrica);
        abstractC3442e.loadAd("relevantArtistsNames");
        this.appmetrica.purchase(abstractC3442e, umaTag.license);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaTag)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        boolean z = false;
        char c = 65535;
        boolean z2 = false;
        String str = null;
        Long l = null;
        boolean z3 = false;
        UmaCover umaCover = null;
        Object obj = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                    z = true;
                } else {
                    str = (String) vip;
                }
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("apiId", "apiId", abstractC17080e, set);
                    z2 = true;
                } else {
                    l = (Long) vip2;
                }
            } else if (mo2308extends == 2) {
                Object vip3 = this.license.vip(abstractC17080e);
                if (vip3 == null) {
                    set = AbstractC0869e.subs("cover", "cover", abstractC17080e, set);
                    z3 = true;
                } else {
                    umaCover = (UmaCover) vip3;
                }
            } else if (mo2308extends == 3) {
                obj = this.appmetrica.vip(abstractC17080e);
                c = 65527;
            }
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
        long longValue = l.longValue();
        List list = (List) obj;
        if (c == 65527) {
            return new UmaTag(str, longValue, umaCover, list);
        }
        if ((c & '\b') != 0) {
            list = null;
        }
        return new UmaTag(str, longValue, umaCover, list);
    }
}
