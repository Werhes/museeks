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

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VKResponseJsonAdapter<T> extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("response", "error", "execute_errors");
    public final AbstractC13345e license;
    public final AbstractC13345e metrica;
    public final AbstractC13345e vip;

    public VKResponseJsonAdapter(C14172e c14172e, Type[] typeArr) {
        Type type = typeArr[0];
        C3295e c3295e = C3295e.f7451e;
        this.vip = c14172e.vip(type, c3295e, "response");
        this.metrica = c14172e.vip(VKError.class, c3295e, "error");
        this.license = c14172e.vip(AbstractC18453e.purchase(List.class, VKError.class), c3295e, "execute_errors");
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
        VKResponse vKResponse = (VKResponse) obj;
        abstractC3442e.license();
        abstractC3442e.loadAd("response");
        this.vip.purchase(abstractC3442e, vKResponse.ad);
        abstractC3442e.loadAd("error");
        this.metrica.purchase(abstractC3442e, vKResponse.vip);
        abstractC3442e.loadAd("execute_errors");
        this.license.purchase(abstractC3442e, vKResponse.metrica);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKResponse)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        int i = -1;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                obj = this.vip.vip(abstractC17080e);
                i &= -2;
            } else if (mo2308extends == 1) {
                obj2 = this.metrica.vip(abstractC17080e);
                i &= -3;
            } else if (mo2308extends == 2) {
                obj3 = this.license.vip(abstractC17080e);
                i &= -5;
            }
        }
        abstractC17080e.advert();
        if (i == -8) {
            return new VKResponse(obj, (VKError) obj2, (List) obj3);
        }
        VKError vKError = (VKError) obj2;
        List list = (List) obj3;
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            vKError = null;
        }
        return new VKResponse(obj, vKError, (i & 4) == 0 ? list : null);
    }
}
