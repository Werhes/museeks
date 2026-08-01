package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC18453e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VKResponseWithItemsJsonAdapter<T> extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("items", "count", "profiles", "groups", "next_from");
    public final AbstractC13345e appmetrica;
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public VKResponseWithItemsJsonAdapter(C14172e c14172e, Type[] typeArr) {
        Type type = typeArr[0];
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(type, c3295e, "items");
        this.metrica = c14172e.vip(Integer.class, c3295e, "count");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, VKProfile.class), c3295e, "profiles");
        this.appmetrica = c14172e.vip(String.class, c3295e, "next_from");
        int length = typeArr.length;
        if (length != 1) {
            throw new IllegalArgumentException(AbstractC1786e.admob(length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received "));
        }
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("items");
        this.vip.purchase(abstractC3442e, vKResponseWithItems.ad);
        abstractC3442e.loadAd("count");
        this.metrica.purchase(abstractC3442e, vKResponseWithItems.vip);
        abstractC3442e.loadAd("profiles");
        List list = vKResponseWithItems.metrica;
        AbstractC13345e abstractC13345e = this.license;
        abstractC13345e.purchase(abstractC3442e, list);
        abstractC3442e.loadAd("groups");
        abstractC13345e.purchase(abstractC3442e, vKResponseWithItems.license);
        abstractC3442e.loadAd("next_from");
        this.appmetrica.purchase(abstractC3442e, vKResponseWithItems.appmetrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKResponseWithItems)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        int i = -1;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                obj3 = this.vip.vip(abstractC17080e);
                i &= -2;
            } else if (mo2308extends != 1) {
                AbstractC13345e abstractC13345e = this.license;
                if (mo2308extends == 2) {
                    obj2 = abstractC13345e.vip(abstractC17080e);
                    i &= -5;
                } else if (mo2308extends == 3) {
                    obj4 = abstractC13345e.vip(abstractC17080e);
                    i &= -9;
                } else if (mo2308extends == 4) {
                    obj5 = this.appmetrica.vip(abstractC17080e);
                    i &= -17;
                }
            } else {
                obj = this.metrica.vip(abstractC17080e);
                i &= -3;
            }
        }
        abstractC17080e.advert();
        if (i == -32) {
            return new VKResponseWithItems(obj3, (Integer) obj, (List) obj2, (List) obj4, (String) obj5);
        }
        return new VKResponseWithItems(obj3, (Integer) obj, (List) obj2, (List) obj4, (String) obj5, i);
    }
}
