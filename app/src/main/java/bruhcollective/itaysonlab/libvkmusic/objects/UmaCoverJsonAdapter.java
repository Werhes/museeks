package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UmaCoverJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("avgColor", "accentColor", "url");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public UmaCoverJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "avgColor");
        this.metrica = c14172e.vip(String.class, c3295e, "url");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        UmaCover umaCover = (UmaCover) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("avgColor");
        String str = umaCover.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("accentColor");
        abstractC13345e.purchase(abstractC3442e, umaCover.vip);
        abstractC3442e.loadAd("url");
        this.metrica.purchase(abstractC3442e, umaCover.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaCover)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        String str2 = null;
        boolean z = false;
        Set set = C3295e.f7451e;
        String str3 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    str3 = (String) abstractC13345e.vip(abstractC17080e);
                } else if (mo2308extends == 1) {
                    str2 = (String) abstractC13345e.vip(abstractC17080e);
                } else if (mo2308extends == 2) {
                    Object vip = this.metrica.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                        z = true;
                    } else {
                        str = (String) vip;
                    }
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if ((str == null) & (!z)) {
            set = AbstractC0869e.isPro("url", "url", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new UmaCover(str3, str2, str);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
