package bruhcollective.itaysonlab.libvkmusic.objects.auth;

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
/* loaded from: classes.dex */
public final class VkConnectResponseJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("expires_in", "access_token", "refresh_token");
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public VkConnectResponseJsonAdapter(C14172e c14172e) {
        Class cls = Long.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "expires_in");
        this.metrica = c14172e.vip(String.class, c3295e, "access_token");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        VkConnectResponse vkConnectResponse = (VkConnectResponse) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("expires_in");
        AbstractC8647e.crashlytics(vkConnectResponse.ad, this.vip, abstractC3442e, "access_token");
        String str = vkConnectResponse.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("refresh_token");
        abstractC13345e.purchase(abstractC3442e, vkConnectResponse.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VkConnectResponse)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Set set = C3295e.f7451e;
        long j = 0;
        Object obj2 = null;
        int i = -1;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends != 0) {
                AbstractC13345e abstractC13345e = this.metrica;
                if (mo2308extends == 1) {
                    Object vip = abstractC13345e.vip(abstractC17080e);
                    if (vip == null) {
                        set = AbstractC0869e.subs("access_token", "access_token", abstractC17080e, set);
                    } else {
                        obj = vip;
                    }
                    i &= -3;
                } else if (mo2308extends == 2) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("refresh_token", "refresh_token", abstractC17080e, set);
                    } else {
                        obj2 = vip2;
                    }
                    i &= -5;
                }
            } else {
                Object vip3 = this.vip.vip(abstractC17080e);
                if (vip3 == null) {
                    set = AbstractC0869e.subs("expires_in", "expires_in", abstractC17080e, set);
                } else {
                    j = ((Number) vip3).longValue();
                }
                i &= -2;
            }
        }
        abstractC17080e.advert();
        if (set.size() == 0) {
            return i == -8 ? new VkConnectResponse(j, (String) obj, (String) obj2) : new VkConnectResponse(i, j, (String) obj, (String) obj2);
        }
        throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
    }
}
