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
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioStreamMix_TitlesJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("common_state", "playing_state");
    public final AbstractC13345e vip;

    public AudioStreamMix_TitlesJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(String.class, C3295e.f7451e, "common_state");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioStreamMix.Titles titles = (AudioStreamMix.Titles) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("common_state");
        String str = titles.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("playing_state");
        abstractC13345e.purchase(abstractC3442e, titles.vip);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioStreamMix.Titles)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Set set = C3295e.f7451e;
        int i = -1;
        Object obj2 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("common_state", "common_state", abstractC17080e, set);
                    } else {
                        obj = vip;
                    }
                    i &= -2;
                } else if (mo2308extends == 1) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("playing_state", "playing_state", abstractC17080e, set);
                    } else {
                        obj2 = vip2;
                    }
                    i &= -3;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i == -4) {
            return new AudioStreamMix.Titles((String) obj, (String) obj2);
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        if ((i & 1) != 0) {
            str = BuildConfig.FLAVOR;
        }
        if ((i & 2) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        return new AudioStreamMix.Titles(str, str2);
    }
}
