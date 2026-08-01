package ua.itaysonlab.vkapi2.objects.music;

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
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioLyricTimestampJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("begin", "end", "line", "interlude");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public AudioLyricTimestampJsonAdapter(C14172e c14172e) {
        Class cls = Long.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "begin");
        this.metrica = c14172e.vip(String.class, c3295e, "line");
        this.license = c14172e.vip(Boolean.TYPE, c3295e, "interlude");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioLyricTimestamp audioLyricTimestamp = (AudioLyricTimestamp) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("begin");
        long j = audioLyricTimestamp.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.crashlytics(j, abstractC13345e, abstractC3442e, "end");
        AbstractC8647e.crashlytics(audioLyricTimestamp.vip, abstractC13345e, abstractC3442e, "line");
        this.metrica.purchase(abstractC3442e, audioLyricTimestamp.metrica);
        abstractC3442e.loadAd("interlude");
        this.license.purchase(abstractC3442e, Boolean.valueOf(audioLyricTimestamp.license));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioLyricTimestamp)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Long l = null;
        Object obj = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Set set = C3295e.f7451e;
        int i = -1;
        Long l2 = null;
        while (true) {
            if (!abstractC17080e.Signature()) {
                break;
            }
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("begin", "begin", abstractC17080e, set);
                        z = true;
                    } else {
                        l = (Long) vip;
                    }
                } else if (mo2308extends == 1) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("end", "end", abstractC17080e, set);
                        z2 = true;
                    } else {
                        l2 = (Long) vip2;
                    }
                } else if (mo2308extends == 2) {
                    Object vip3 = this.metrica.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("line", "line", abstractC17080e, set);
                    } else {
                        obj = vip3;
                    }
                    i &= -5;
                } else if (mo2308extends == 3) {
                    Object vip4 = this.license.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("interlude", "interlude", abstractC17080e, set);
                    } else {
                        z3 = ((Boolean) vip4).booleanValue();
                    }
                    i &= -9;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if ((!z) & (l == null)) {
            set = AbstractC0869e.isPro("begin", "begin", abstractC17080e, set);
        }
        if ((!z2) & (l2 == null)) {
            set = AbstractC0869e.isPro("end", "end", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i == -13) {
            return new AudioLyricTimestamp(l.longValue(), l2.longValue(), (String) obj, z3);
        }
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        String str = (String) obj;
        if ((i & 4) != 0) {
            str = BuildConfig.FLAVOR;
        }
        return new AudioLyricTimestamp(longValue, longValue2, str, (i & 8) != 0 ? false : z3);
    }
}
