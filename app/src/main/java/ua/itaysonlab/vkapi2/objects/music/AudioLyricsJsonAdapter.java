package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C13664e;
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
/* loaded from: classes3.dex */
public final class AudioLyricsJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("timestamps", "text", "language");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioLyricsJsonAdapter(C14172e c14172e) {
        C2897e purchase = AbstractC18453e.purchase(List.class, AudioLyricTimestamp.class);
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(purchase, c3295e, "timestamps");
        this.metrica = c14172e.vip(AbstractC18453e.purchase(List.class, String.class), c3295e, "text");
        this.license = c14172e.vip(String.class, c3295e, "language");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioLyrics audioLyrics = (AudioLyrics) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("timestamps");
        this.vip.purchase(abstractC3442e, audioLyrics.ad);
        abstractC3442e.loadAd("text");
        this.metrica.purchase(abstractC3442e, audioLyrics.vip);
        abstractC3442e.loadAd("language");
        this.license.purchase(abstractC3442e, audioLyrics.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioLyrics)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        String str = null;
        Object obj = null;
        boolean z = false;
        Set set = C3295e.f7451e;
        int i = -1;
        Object obj2 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                Object vip = this.vip.vip(abstractC17080e);
                if (vip == null) {
                    set = AbstractC0869e.subs("timestamps", "timestamps", abstractC17080e, set);
                } else {
                    obj2 = vip;
                }
                i &= -2;
            } else if (mo2308extends == 1) {
                Object vip2 = this.metrica.vip(abstractC17080e);
                if (vip2 == null) {
                    set = AbstractC0869e.subs("text", "text", abstractC17080e, set);
                } else {
                    obj = vip2;
                }
                i &= -3;
            } else if (mo2308extends == 2) {
                Object vip3 = this.license.vip(abstractC17080e);
                if (vip3 == null) {
                    set = AbstractC0869e.subs("language", "language", abstractC17080e, set);
                    z = true;
                } else {
                    str = (String) vip3;
                }
            }
        }
        abstractC17080e.advert();
        if ((str == null) & (!z)) {
            set = AbstractC0869e.isPro("language", "language", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i == -4) {
            return new AudioLyrics((List) obj2, (List) obj, str);
        }
        List list = (List) obj2;
        List list2 = (List) obj;
        int i2 = i & 1;
        C13664e c13664e = C13664e.f27089e;
        if (i2 != 0) {
            list = c13664e;
        }
        if ((i & 2) != 0) {
            list2 = c13664e;
        }
        return new AudioLyrics(list, list2, str);
    }
}
