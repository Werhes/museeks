package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14406e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f28491e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Catalog2Layout.SynthOpenCacheSearch f28492e;

    public C14406e(AbstractC15876e abstractC15876e, Catalog2Layout.SynthOpenCacheSearch synthOpenCacheSearch) {
        this.f28492e = synthOpenCacheSearch;
        this.f28491e = abstractC15876e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Number) obj2).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
            Catalog2Layout.SynthOpenCacheSearch synthOpenCacheSearch = this.f28492e;
            String str = synthOpenCacheSearch.ad;
            AbstractC15876e abstractC15876e = this.f28491e;
            boolean yandex = c13770e.yandex(abstractC15876e) | c13770e.purchase(synthOpenCacheSearch);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C7213e(abstractC15876e, synthOpenCacheSearch);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC0865e.appmetrica(str, (Function0) m3681throw, c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
