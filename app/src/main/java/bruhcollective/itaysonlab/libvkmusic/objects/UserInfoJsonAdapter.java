package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC0869e;
import defpackage.AbstractC13345e;
import defpackage.AbstractC13480e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC8647e;
import defpackage.C14172e;
import defpackage.C14803e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserInfoJsonAdapter extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("apiId", "firstName", "lastName", "shareHash", "tags");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public UserInfoJsonAdapter(C14172e c14172e) {
        Class cls = Long.TYPE;
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(cls, c3295e, "apiId");
        this.metrica = c14172e.vip(String.class, c3295e, "firstName");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, UmaTag.class), c3295e, "tags");
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        UserInfo userInfo = (UserInfo) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("apiId");
        AbstractC8647e.crashlytics(userInfo.ad, this.vip, abstractC3442e, "firstName");
        String str = userInfo.vip;
        AbstractC13345e abstractC13345e = this.metrica;
        abstractC13345e.purchase(abstractC3442e, str);
        abstractC3442e.loadAd("lastName");
        abstractC13345e.purchase(abstractC3442e, userInfo.metrica);
        abstractC3442e.loadAd("shareHash");
        abstractC13345e.purchase(abstractC3442e, userInfo.license);
        abstractC3442e.loadAd("tags");
        this.license.purchase(abstractC3442e, userInfo.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UserInfo)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        long j = 0;
        Object obj2 = null;
        Object obj3 = null;
        Set set = C3295e.f7451e;
        int i = -1;
        Object obj4 = null;
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
                        set = AbstractC0869e.subs("firstName", "firstName", abstractC17080e, set);
                    } else {
                        obj = vip;
                    }
                    i &= -3;
                } else if (mo2308extends == 2) {
                    Object vip2 = abstractC13345e.vip(abstractC17080e);
                    if (vip2 == null) {
                        set = AbstractC0869e.subs("lastName", "lastName", abstractC17080e, set);
                    } else {
                        obj2 = vip2;
                    }
                    i &= -5;
                } else if (mo2308extends == 3) {
                    Object vip3 = abstractC13345e.vip(abstractC17080e);
                    if (vip3 == null) {
                        set = AbstractC0869e.subs("shareHash", "shareHash", abstractC17080e, set);
                    } else {
                        obj3 = vip3;
                    }
                    i &= -9;
                } else if (mo2308extends == 4) {
                    Object vip4 = this.license.vip(abstractC17080e);
                    if (vip4 == null) {
                        set = AbstractC0869e.subs("tags", "tags", abstractC17080e, set);
                    } else {
                        obj4 = vip4;
                    }
                    i &= -17;
                }
            } else {
                Object vip5 = this.vip.vip(abstractC17080e);
                if (vip5 == null) {
                    set = AbstractC0869e.subs("apiId", "apiId", abstractC17080e, set);
                } else {
                    j = ((Number) vip5).longValue();
                }
                i &= -2;
            }
        }
        abstractC17080e.advert();
        if (set.size() != 0) {
            throw new C14803e(AbstractC13480e.m3608try(set, "\n", null, null, null, 62), 8, (byte) 0);
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        List list = (List) obj4;
        return i == -32 ? new UserInfo(j, str, str2, str3, list) : new UserInfo(j, str, str2, str3, list, i);
    }
}
