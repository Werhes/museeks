package ua.itaysonlab.vkapi2.objects.music.playlist.album;

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
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioAlbumJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "owner_id", "access_key", "title", "thumb", "main_color");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e purchase;
    public final AbstractC13345e vip;

    public AudioAlbumJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(Integer.class, c3295e, "id");
        this.metrica = c14172e.vip(Long.class, c3295e, "owner_id");
        this.license = c14172e.vip(String.class, c3295e, "access_key");
        this.appmetrica = c14172e.vip(String.class, c3295e, "title");
        this.purchase = c14172e.vip(AlbumThumb.class, c3295e, "thumb");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioAlbum audioAlbum = (AudioAlbum) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        this.vip.purchase(abstractC3442e, audioAlbum.ad);
        abstractC3442e.loadAd("owner_id");
        this.metrica.purchase(abstractC3442e, audioAlbum.vip);
        abstractC3442e.loadAd("access_key");
        String str = audioAlbum.metrica;
        AbstractC13345e abstractC13345e = this.license;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("title");
        this.appmetrica.purchase(abstractC3442e, audioAlbum.license);
        abstractC3442e.loadAd("thumb");
        this.purchase.purchase(abstractC3442e, audioAlbum.appmetrica);
        abstractC3442e.loadAd("main_color");
        abstractC13345e.purchase(abstractC3442e, audioAlbum.purchase);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioAlbum)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        Integer num = null;
        Long l = null;
        String str = null;
        String str2 = null;
        AlbumThumb albumThumb = null;
        String str3 = null;
        boolean z = false;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.license;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    num = (Integer) this.vip.vip(abstractC17080e);
                    break;
                case 1:
                    l = (Long) this.metrica.vip(abstractC17080e);
                    break;
                case 2:
                    str = (String) abstractC13345e.vip(abstractC17080e);
                    break;
                case 3:
                    Object vip = this.appmetrica.vip(abstractC17080e);
                    if (vip != null) {
                        str2 = (String) vip;
                        break;
                    } else {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                        z = true;
                        break;
                    }
                case 4:
                    albumThumb = (AlbumThumb) this.purchase.vip(abstractC17080e);
                    break;
                case 5:
                    str3 = (String) abstractC13345e.vip(abstractC17080e);
                    break;
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str2 == null)) {
            set = AbstractC0869e.isPro("title", "title", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new AudioAlbum(num, l, str, str2, albumThumb, str3, false);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
