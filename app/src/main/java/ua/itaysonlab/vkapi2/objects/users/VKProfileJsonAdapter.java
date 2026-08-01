package ua.itaysonlab.vkapi2.objects.users;

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
public final class VKProfileJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("id", "first_name", "last_name", "photo_base", "name", "is_followed", "can_follow");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public VKProfileJsonAdapter(C14172e c14172e) {
        Class cls = Long.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "id");
        this.metrica = c14172e.vip(String.class, c3295e, "first_name");
        this.license = c14172e.vip(Boolean.class, c3295e, "is_followed");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        VKProfile vKProfile = (VKProfile) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("id");
        AbstractC8647e.crashlytics(vKProfile.ad, this.vip, abstractC3442e, "first_name");
        String str = vKProfile.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("last_name");
        abstractC13345e.purchase(abstractC3442e, vKProfile.metrica);
        abstractC3442e.loadAd("photo_base");
        abstractC13345e.purchase(abstractC3442e, vKProfile.license);
        abstractC3442e.loadAd("name");
        abstractC13345e.purchase(abstractC3442e, vKProfile.appmetrica);
        abstractC3442e.loadAd("is_followed");
        Boolean bool = vKProfile.purchase;
        AbstractC13345e abstractC13345e2 = this.license;
        abstractC13345e2.purchase(abstractC3442e, bool);
        abstractC3442e.loadAd("can_follow");
        abstractC13345e2.purchase(abstractC3442e, vKProfile.billing);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKProfile)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Long l = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Set set = C3295e.f7451e;
        int i = -1;
        boolean z = false;
        Object obj5 = null;
        Object obj6 = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            AbstractC13345e abstractC13345e = this.license;
            AbstractC13345e abstractC13345e2 = this.metrica;
            switch (mo2308extends) {
                case -1:
                    abstractC17080e.mo2305break();
                    abstractC17080e.mo2314implements();
                    break;
                case 0:
                    Object vip = this.vip.vip(abstractC17080e);
                    if (vip != null) {
                        l = (Long) vip;
                        break;
                    } else {
                        set = AbstractC0869e.subs("id", "id", abstractC17080e, set);
                        z = true;
                        break;
                    }
                case 1:
                    obj5 = abstractC13345e2.vip(abstractC17080e);
                    i &= -3;
                    break;
                case 2:
                    obj6 = abstractC13345e2.vip(abstractC17080e);
                    i &= -5;
                    break;
                case 3:
                    obj = abstractC13345e2.vip(abstractC17080e);
                    i &= -9;
                    break;
                case 4:
                    obj2 = abstractC13345e2.vip(abstractC17080e);
                    i &= -17;
                    break;
                case 5:
                    obj3 = abstractC13345e.vip(abstractC17080e);
                    i &= -33;
                    break;
                case 6:
                    obj4 = abstractC13345e.vip(abstractC17080e);
                    i &= -65;
                    break;
            }
        }
        abstractC17080e.advert();
        if ((!z) & (l == null)) {
            set = AbstractC0869e.isPro("id", "id", abstractC17080e, set);
        }
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        if (i == -127) {
            return new VKProfile(l.longValue(), (String) obj5, (String) obj6, (String) obj, (String) obj2, (Boolean) obj3, (Boolean) obj4);
        }
        return new VKProfile(l.longValue(), (String) obj5, (String) obj6, (String) obj, (String) obj2, (Boolean) obj3, (Boolean) obj4, i);
    }
}
