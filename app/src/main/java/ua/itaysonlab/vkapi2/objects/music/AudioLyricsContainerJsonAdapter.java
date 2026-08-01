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

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioLyricsContainerJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("md5", "lyrics", "credits");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioLyricsContainerJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "md5");
        this.metrica = c14172e.vip(AudioLyrics.class, c3295e, "lyrics");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioLyricsContainer audioLyricsContainer = (AudioLyricsContainer) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("md5");
        String str = audioLyricsContainer.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("lyrics");
        this.metrica.purchase(abstractC3442e, audioLyricsContainer.vip);
        abstractC3442e.loadAd("credits");
        abstractC13345e.purchase(abstractC3442e, audioLyricsContainer.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioLyricsContainer)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Set set = C3295e.f7451e;
        AudioLyrics audioLyrics = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("md5", "md5", abstractC17080e, set);
                        z = true;
                    } else {
                        str = (String) vip;
                    }
                } else if (mo2308extends == 1) {
                    Object vip2 = this.metrica.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("lyrics", "lyrics", abstractC17080e, set);
                        z2 = true;
                    } else {
                        audioLyrics = (AudioLyrics) vip2;
                    }
                } else if (mo2308extends == 2) {
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("credits", "credits", abstractC17080e, set);
                        z3 = true;
                    } else {
                        str2 = (String) vip3;
                    }
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("md5", "md5", abstractC17080e, set);
        }
        if ((!z2) & (audioLyrics == null)) {
            set = AbstractC0869e.isPro("lyrics", "lyrics", abstractC17080e, set);
        }
        if ((str2 == null) & (!z3)) {
            set = AbstractC0869e.isPro("credits", "credits", abstractC17080e, set);
        }
        if (set.size() == 0) {
            return new AudioLyricsContainer(str, audioLyrics, str2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
