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
public final class AudioStreamMixJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "title", "description", "stream_mix", "is_tunable", "titles");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioStreamMixJsonAdapter(C14172e c14172e) {
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(String.class, c3295e, "id");
        this.metrica = c14172e.vip(AudioStreamMix.Link.class, c3295e, "stream_mix");
        this.license = c14172e.vip(Boolean.class, c3295e, "is_tunable");
        this.appmetrica = c14172e.vip(AudioStreamMix.Titles.class, c3295e, "titles");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioStreamMix audioStreamMix = (AudioStreamMix) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        String str = audioStreamMix.ad;
        AbstractC13345e abstractC13345e = this.vip;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("title");
        abstractC13345e.purchase(abstractC3442e, audioStreamMix.vip);
        abstractC3442e.loadAd("description");
        abstractC13345e.purchase(abstractC3442e, audioStreamMix.metrica);
        abstractC3442e.loadAd("stream_mix");
        this.metrica.purchase(abstractC3442e, audioStreamMix.license);
        abstractC3442e.loadAd("is_tunable");
        this.license.purchase(abstractC3442e, audioStreamMix.appmetrica);
        abstractC3442e.loadAd("titles");
        this.appmetrica.purchase(abstractC3442e, audioStreamMix.purchase);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioStreamMix)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.vip;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip != null) {
                        str = (String) vip;
                        break;
                    } else {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z = true;
                        break;
                    }
                case 1:
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("title", "title", abstractC17080e, set);
                    } else {
                        obj = vip2;
                    }
                    i &= -3;
                    break;
                case 2:
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("description", "description", abstractC17080e, set);
                    } else {
                        obj2 = vip3;
                    }
                    i &= -5;
                    break;
                case 3:
                    obj3 = this.metrica.vip(abstractC17080e);
                    i &= -9;
                    break;
                case 4:
                    obj4 = this.license.vip(abstractC17080e);
                    i &= -17;
                    break;
                case 5:
                    obj5 = this.appmetrica.vip(abstractC17080e);
                    i &= -33;
                    break;
            }
        }
        abstractC17080e.advert();
        if ((!z) & (str == null)) {
            set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        Object obj6 = obj;
        if (i == -63) {
            return new AudioStreamMix(str, (String) obj6, (String) obj2, (AudioStreamMix.Link) obj3, (Boolean) obj4, (AudioStreamMix.Titles) obj5);
        }
        String str2 = (String) obj6;
        String str3 = (String) obj2;
        AudioStreamMix.Link link = (AudioStreamMix.Link) obj3;
        Boolean bool = (Boolean) obj4;
        AudioStreamMix.Titles titles = (AudioStreamMix.Titles) obj5;
        if ((i & 2) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        if ((i & 4) != 0) {
            str3 = BuildConfig.FLAVOR;
        }
        if ((i & 8) != 0) {
            link = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        return new AudioStreamMix(str, str2, str3, link, bool, (i & 32) != 0 ? null : titles);
    }
}
