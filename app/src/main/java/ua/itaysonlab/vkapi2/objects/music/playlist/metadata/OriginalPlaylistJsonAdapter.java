package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

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
public final class OriginalPlaylistJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("owner_id", "playlist_id", "access_key");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public OriginalPlaylistJsonAdapter(C14172e c14172e) {
        Class cls = Long.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "owner_id");
        this.metrica = c14172e.vip(Integer.TYPE, c3295e, "playlist_id");
        this.license = c14172e.vip(String.class, c3295e, "access_key");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        OriginalPlaylist originalPlaylist = (OriginalPlaylist) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("owner_id");
        AbstractC8647e.crashlytics(originalPlaylist.ad, this.vip, abstractC3442e, "playlist_id");
        AbstractC8647e.subs(originalPlaylist.vip, this.metrica, abstractC3442e, "access_key");
        this.license.purchase(abstractC3442e, originalPlaylist.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(OriginalPlaylist)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Long l = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        Set set = C3295e.f7451e;
        Integer num = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("owner_id", "owner_id", abstractC17080e, set);
                    z = true;
                } else {
                    l = (Long) vip;
                }
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("playlist_id", "playlist_id", abstractC17080e, set);
                    z2 = true;
                } else {
                    num = (Integer) vip2;
                }
            } else if (mo2308extends == 2) {
                str = (String) this.license.vip(abstractC17080e);
            }
        }
        abstractC17080e.advert();
        if ((!z) & (l == null)) {
            set = AbstractC0869e.isPro("owner_id", "owner_id", abstractC17080e, set);
        }
        if ((num == null) & (!z2)) {
            set = AbstractC0869e.isPro("playlist_id", "playlist_id", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new OriginalPlaylist(l.longValue(), num.intValue(), str);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
