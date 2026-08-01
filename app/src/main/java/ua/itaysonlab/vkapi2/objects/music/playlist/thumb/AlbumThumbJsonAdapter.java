package ua.itaysonlab.vkapi2.objects.music.playlist.thumb;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlbumThumbJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("photo_135", "photo_270", "photo_300", "photo_600", "photo_1200");
    public final AbstractC13345e vip;

    public AlbumThumbJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(String.class, C3295e.f7451e, "photo_135");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AlbumThumb albumThumb = (AlbumThumb) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("photo_135");
        String str = albumThumb.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("photo_270");
        abstractC13345e.purchase(abstractC3442e, albumThumb.vip);
        abstractC3442e.loadAd("photo_300");
        abstractC13345e.purchase(abstractC3442e, albumThumb.metrica);
        abstractC3442e.loadAd("photo_600");
        abstractC13345e.purchase(abstractC3442e, albumThumb.license);
        abstractC3442e.loadAd("photo_1200");
        abstractC13345e.purchase(abstractC3442e, albumThumb.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AlbumThumb)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        int i = -1;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    obj = abstractC13345e.vip(abstractC17080e);
                    i &= -2;
                } else if (mo2308extends == 1) {
                    obj2 = abstractC13345e.vip(abstractC17080e);
                    i &= -3;
                } else if (mo2308extends == 2) {
                    obj3 = abstractC13345e.vip(abstractC17080e);
                    i &= -5;
                } else if (mo2308extends == 3) {
                    obj4 = abstractC13345e.vip(abstractC17080e);
                    i &= -9;
                } else if (mo2308extends == 4) {
                    obj5 = abstractC13345e.vip(abstractC17080e);
                    i &= -17;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        String str4 = (String) obj4;
        String str5 = (String) obj5;
        return i == -32 ? new AlbumThumb(str, str2, str3, str4, str5) : new AlbumThumb(str, str2, str3, str4, str5, i);
    }
}
