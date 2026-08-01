package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC1786e;
import defpackage.AbstractC3442e;
import defpackage.C14172e;
import defpackage.C16911e;
import defpackage.C3295e;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataResponseJsonAdapter<T> extends AbstractC13345e {
    public final C16911e ad = C16911e.firebase("data");
    public final AbstractC13345e vip;

    public DataResponseJsonAdapter(C14172e c14172e, Type[] typeArr) {
        this.vip = c14172e.vip(typeArr[0], C3295e.f7451e, "data");
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
        abstractC3442e.license();
        abstractC3442e.loadAd("data");
        this.vip.purchase(abstractC3442e, ((DataResponse) obj).ad);
        abstractC3442e.purchase();
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DataResponse)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        abstractC17080e.license();
        Object obj = null;
        while (abstractC17080e.Signature()) {
            int mo2308extends = abstractC17080e.mo2308extends(this.ad);
            if (mo2308extends == -1) {
                abstractC17080e.mo2305break();
                abstractC17080e.mo2314implements();
            } else if (mo2308extends == 0) {
                obj = this.vip.vip(abstractC17080e);
            }
        }
        abstractC17080e.advert();
        return new DataResponse(obj);
    }
}
