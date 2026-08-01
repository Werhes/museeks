package ua.itaysonlab.vkapi2.objects.music;

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
public final class AudioWidgetItemJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("photo", "title", "type", "subtitle", "url");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioWidgetItemJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(AlbumThumb.class, c3295e, "photo");
        this.metrica = c14172e.vip(String.class, c3295e, "title");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioWidgetItem audioWidgetItem = (AudioWidgetItem) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("photo");
        this.vip.purchase(abstractC3442e, audioWidgetItem.ad);
        abstractC3442e.loadAd("title");
        String str = audioWidgetItem.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("type");
        abstractC13345e.purchase(abstractC3442e, audioWidgetItem.metrica);
        abstractC3442e.loadAd("subtitle");
        abstractC13345e.purchase(abstractC3442e, audioWidgetItem.license);
        abstractC3442e.loadAd("url");
        abstractC13345e.purchase(abstractC3442e, audioWidgetItem.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioWidgetItem)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        boolean z;
        boolean z2;
        AlbumThumb albumThumb;
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        AlbumThumb albumThumb2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            z = z3;
            z2 = z4;
            if (!abstractC17080e.Signature()) {
                break;
            }
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                albumThumb = albumThumb2;
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends != 0) {
                AbstractC13345e abstractC13345e = this.metrica;
                albumThumb = albumThumb2;
                if (mo2308extends == 1) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                        z4 = z2;
                        albumThumb2 = albumThumb;
                        z3 = true;
                    } else {
                        str = (String) vip;
                    }
                } else if (mo2308extends == 2) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("type", "type", abstractC17080e, set);
                        z3 = z;
                        albumThumb2 = albumThumb;
                        z4 = true;
                    } else {
                        str2 = (String) vip2;
                    }
                } else if (mo2308extends == 3) {
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("subtitle", "subtitle", abstractC17080e, set);
                        z3 = z;
                        z4 = z2;
                        albumThumb2 = albumThumb;
                        z5 = true;
                    } else {
                        str3 = (String) vip3;
                    }
                } else if (mo2308extends == 4) {
                    Object vip4 = abstractC13345e.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("url", "url", abstractC17080e, set);
                        z3 = z;
                        z4 = z2;
                        albumThumb2 = albumThumb;
                        z6 = true;
                    } else {
                        str4 = (String) vip4;
                    }
                }
            } else {
                albumThumb2 = (AlbumThumb) this.vip.vip(abstractC17080e);
                z3 = z;
                z4 = z2;
            }
            z3 = z;
            z4 = z2;
            albumThumb2 = albumThumb;
        }
        AlbumThumb albumThumb3 = albumThumb2;
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("title", "title", abstractC17080e, set);
        }
        if ((!z2) & (str2 == null)) {
            set = AbstractC0869e.isPro("type", "type", abstractC17080e, set);
        }
        if ((!z5) & (str3 == null)) {
            set = AbstractC0869e.isPro("subtitle", "subtitle", abstractC17080e, set);
        }
        if ((!z6) & (str4 == null)) {
            set = AbstractC0869e.isPro("url", "url", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new AudioWidgetItem(albumThumb3, str, str2, str3, str4);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
