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
import defpackage.C2897e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioInfoJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("tracks", "apiId", "currentCluster", "clusters", "currentClusterId", "artist", "tag", "album", "track");
    public final AbstractC13345e adcel;
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e billing;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e startapp;
    public final AbstractC13345e vip;
    public final AbstractC13345e yandex;

    public RadioInfoJsonAdapter(C14172e c14172e) {
        C2897e purchase = AbstractC18453e.purchase(List.class, UmaTrack.class);
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(purchase, c3295e, "tracks");
        this.metrica = c14172e.vip(String.class, c3295e, "apiId");
        this.license = c14172e.vip(RadioCluster.class, c3295e, "currentCluster");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, RadioCluster.class), c3295e, "clusters");
        this.purchase = c14172e.vip(String.class, c3295e, "currentClusterId");
        this.billing = c14172e.vip(UmaArtist.class, c3295e, "artist");
        this.yandex = c14172e.vip(UmaTag.class, c3295e, "tag");
        this.startapp = c14172e.vip(UmaAlbum.class, c3295e, "album");
        this.adcel = c14172e.vip(UmaTrack.class, c3295e, "track");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        RadioInfo radioInfo = (RadioInfo) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("tracks");
        this.vip.purchase(abstractC3442e, radioInfo.ad);
        abstractC3442e.loadAd("apiId");
        this.metrica.purchase(abstractC3442e, radioInfo.vip);
        abstractC3442e.loadAd("currentCluster");
        this.license.purchase(abstractC3442e, radioInfo.metrica);
        abstractC3442e.loadAd("clusters");
        this.appmetrica.purchase(abstractC3442e, radioInfo.license);
        abstractC3442e.loadAd("currentClusterId");
        this.purchase.purchase(abstractC3442e, radioInfo.appmetrica);
        abstractC3442e.loadAd("artist");
        this.billing.purchase(abstractC3442e, radioInfo.purchase);
        abstractC3442e.loadAd("tag");
        this.yandex.purchase(abstractC3442e, radioInfo.billing);
        abstractC3442e.loadAd("album");
        this.startapp.purchase(abstractC3442e, radioInfo.yandex);
        abstractC3442e.loadAd("track");
        this.adcel.purchase(abstractC3442e, radioInfo.startapp);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(RadioInfo)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        List list = null;
        String str = null;
        RadioCluster radioCluster = null;
        List list2 = null;
        String str2 = null;
        UmaArtist umaArtist = null;
        UmaTag umaTag = null;
        UmaAlbum umaAlbum = null;
        UmaTrack umaTrack = null;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean z3 = z;
            if (!abstractC17080e.Signature()) {
                abstractC17080e.advert();
                if ((!z3) & (list == null)) {
                    set = AbstractC0869e.isPro("tracks", "tracks", abstractC17080e, set);
                }
                if ((!z2) & (str == null)) {
                    set = AbstractC0869e.isPro("apiId", "apiId", abstractC17080e, set);
                }
                if (set.size() == 0) {
                    return new RadioInfo(list, str, radioCluster, list2, str2, umaArtist, umaTag, umaAlbum, umaTrack);
                }
                throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
            }
            switch (abstractC17080e.mo2308extends(this.ad)) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = this.vip.vip(abstractC17080e);
                    if (vip != null) {
                        list = (List) vip;
                        break;
                    } else {
                        set = AbstractC0869e.subs("tracks", "tracks", abstractC17080e, set);
                        z = true;
                        break;
                    }
                case 1:
                    Object vip2 = this.metrica.vip(abstractC17080e);
                    if (vip2 != null) {
                        str = (String) vip2;
                        break;
                    } else {
                        set = AbstractC0869e.subs("apiId", "apiId", abstractC17080e, set);
                        z = z3;
                        z2 = true;
                        break;
                    }
                case 2:
                    radioCluster = (RadioCluster) this.license.vip(abstractC17080e);
                    break;
                case 3:
                    list2 = (List) this.appmetrica.vip(abstractC17080e);
                    break;
                case 4:
                    str2 = (String) this.purchase.vip(abstractC17080e);
                    break;
                case 5:
                    umaArtist = (UmaArtist) this.billing.vip(abstractC17080e);
                    break;
                case 6:
                    umaTag = (UmaTag) this.yandex.vip(abstractC17080e);
                    break;
                case 7:
                    umaAlbum = (UmaAlbum) this.startapp.vip(abstractC17080e);
                    break;
                case 8:
                    umaTrack = (UmaTrack) this.adcel.vip(abstractC17080e);
                    break;
            }
            z = z3;
        }
    }
}
