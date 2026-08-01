package bruhcollective.itaysonlab.libvkmusic.objects;

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

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioClusterJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("clusterId", "cover", "artists", "tags", "name");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public RadioClusterJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "clusterId");
        this.metrica = c14172e.vip(UmaCover.class, c3295e, "cover");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, UmaArtist.class), c3295e, "artists");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, UmaTag.class), c3295e, "tags");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        RadioCluster radioCluster = (RadioCluster) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("clusterId");
        String str = radioCluster.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("cover");
        this.metrica.purchase(abstractC3442e, radioCluster.vip);
        abstractC3442e.loadAd("artists");
        this.license.purchase(abstractC3442e, radioCluster.metrica);
        abstractC3442e.loadAd("tags");
        this.appmetrica.purchase(abstractC3442e, radioCluster.license);
        abstractC3442e.loadAd("name");
        abstractC13345e.purchase(abstractC3442e, radioCluster.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(RadioCluster)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        boolean z;
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        String str = null;
        UmaCover umaCover = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends != 0) {
                    z = z2;
                    if (mo2308extends == 1) {
                        Object vip = this.metrica.vip(abstractC17080e);
                        if (vip == null) {
                            set = AbstractC0869e.subs("cover", "cover", abstractC17080e, set);
                            z2 = z;
                            z3 = true;
                        } else {
                            umaCover = (UmaCover) vip;
                        }
                    } else if (mo2308extends == 2) {
                        list = (List) this.license.vip(abstractC17080e);
                    } else if (mo2308extends == 3) {
                        list2 = (List) this.appmetrica.vip(abstractC17080e);
                    } else if (mo2308extends == 4) {
                        Object vip2 = abstractC13345e.vip(abstractC17080e);
                        if (vip2 == null) {
                            set = AbstractC0869e.subs("name", "name", abstractC17080e, set);
                            z2 = z;
                            z4 = true;
                        } else {
                            str2 = (String) vip2;
                        }
                    }
                } else {
                    z = z2;
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("clusterId", "clusterId", abstractC17080e, set);
                        z2 = true;
                    } else {
                        str = (String) vip3;
                    }
                }
            } else {
                z = z2;
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
            z2 = z;
        }
        abstractC17080e.advert();
        if ((!z2) & (str == null)) {
            set = AbstractC0869e.isPro("clusterId", "clusterId", abstractC17080e, set);
        }
        if ((!z3) & (umaCover == null)) {
            set = AbstractC0869e.isPro("cover", "cover", abstractC17080e, set);
        }
        if ((!z4) & (str2 == null)) {
            set = AbstractC0869e.isPro("name", "name", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new RadioCluster(str, umaCover, list, list2, str2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
