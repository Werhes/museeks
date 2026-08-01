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

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioChartInfoJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("position", "state");
    public final AbstractC13345e vip;

    public AudioChartInfoJsonAdapter(C14172e c14172e) {
        this.vip = c14172e.vip(Integer.TYPE, C3295e.f7451e, "position");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        AudioChartInfo audioChartInfo = (AudioChartInfo) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("position");
        int i = audioChartInfo.ad;
        AbstractC13345e abstractC13345e = this.vip;
        AbstractC8647e.subs(i, abstractC13345e, abstractC3442e, "state");
        abstractC13345e.purchase(abstractC3442e, Integer.valueOf(audioChartInfo.vip));
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioChartInfo)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Integer num = null;
        Set set = C3295e.f7451e;
        boolean z = false;
        int i = 0;
        char c = 65535;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends != -1) {
                AbstractC13345e abstractC13345e = this.vip;
                if (mo2308extends == 0) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("position", "position", abstractC17080e, set);
                        z = true;
                    } else {
                        num = (Integer) vip;
                    }
                } else if (mo2308extends == 1) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("state", "state", abstractC17080e, set);
                    } else {
                        i = ((Number) vip2).intValue();
                    }
                    c = 65533;
                }
            } else {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            }
        }
        abstractC17080e.advert();
        if ((num == null) & (!z)) {
            set = AbstractC0869e.isPro("position", "position", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        int intValue = num.intValue();
        if (c == 65533) {
            return new AudioChartInfo(intValue, i);
        }
        return new AudioChartInfo(intValue, (c & 2) == 0 ? i : -1);
    }
}
