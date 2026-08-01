package bruhcollective.itaysonlab.libvkmusic.methods.uma;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaAlbum;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaPlaylist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
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
public final class UmaSearch_PreapiJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("myMusicTracks", "tracks", "albums", "artists", "playlist");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public UmaSearch_PreapiJsonAdapter(C14172e c14172e) {
        C2897e purchase = AbstractC18453e.purchase(List.class, UmaTrack.class);
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(purchase, c3295e, "myMusicTracks");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, UmaAlbum.class), c3295e, "albums");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, UmaArtist.class), c3295e, "artists");
        this.appmetrica = c14172e.vip(AbstractC18453e.purchase(List.class, UmaPlaylist.class), c3295e, "playlist");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        UmaSearch$Preapi umaSearch$Preapi = (UmaSearch$Preapi) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("myMusicTracks");
        List list = umaSearch$Preapi.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("tracks");
        abstractC13345e.purchase(abstractC3442e, umaSearch$Preapi.vip);
        abstractC3442e.loadAd("albums");
        this.metrica.purchase(abstractC3442e, umaSearch$Preapi.metrica);
        abstractC3442e.loadAd("artists");
        this.license.purchase(abstractC3442e, umaSearch$Preapi.license);
        abstractC3442e.loadAd("playlist");
        this.appmetrica.purchase(abstractC3442e, umaSearch$Preapi.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UmaSearch.Preapi)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Set set = C3295e.f7451e;
        int i = -1;
        Object obj5 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("myMusicTracks", "myMusicTracks", abstractC17080e, set);
                    } else {
                        obj = vip;
                    }
                    i &= -2;
                } else if (mo2308extends == 1) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("tracks", "tracks", abstractC17080e, set);
                    } else {
                        obj5 = vip2;
                    }
                    i &= -3;
                } else if (mo2308extends == 2) {
                    Object vip3 = this.metrica.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("albums", "albums", abstractC17080e, set);
                    } else {
                        obj2 = vip3;
                    }
                    i &= -5;
                } else if (mo2308extends == 3) {
                    Object vip4 = this.license.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("artists", "artists", abstractC17080e, set);
                    } else {
                        obj3 = vip4;
                    }
                    i &= -9;
                } else if (mo2308extends == 4) {
                    Object vip5 = this.appmetrica.vip(abstractC17080e);
                    if (vip5 == null) {
                        set = AbstractC0869e.subs("playlist", "playlist", abstractC17080e, set);
                    } else {
                        obj4 = vip5;
                    }
                    i &= -17;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if (set.size() == 0) {
            return i == -32 ? new UmaSearch$Preapi((List) obj, (List) obj5, (List) obj2, (List) obj3, (List) obj4) : new UmaSearch$Preapi((List) obj, (List) obj5, (List) obj2, (List) obj3, (List) obj4, i);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
