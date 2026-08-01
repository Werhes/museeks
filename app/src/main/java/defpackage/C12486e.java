package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxtv.VkxTvEntrypoint;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12486e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2243e f24997e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24998e;

    public /* synthetic */ C12486e(C2243e c2243e, int i) {
        this.f24998e = i;
        this.f24997e = c2243e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f24998e;
        C2243e c2243e = this.f24997e;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = VkxTvEntrypoint.f36765e;
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC11160e.metrica(AbstractC18007e.metrica, AbstractC10432e.ad, null, AbstractC16653e.license(-1043441068, new C17871e(28, c2243e), c13770e), c13770e, 58);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = VkxTvEntrypoint.f36765e;
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C6032e c6032e = AbstractC0906e.ad;
                    C15492e c15492e = AbstractC17878e.ad;
                    C1839e c1839e = ((C10375e) c13770e2.adcel(c15492e)).startapp;
                    C1839e c1839e2 = AbstractC16795e.license;
                    C1839e appmetrica = c1839e.appmetrica(c1839e2);
                    C1839e appmetrica2 = ((C10375e) c13770e2.adcel(c15492e)).yandex.appmetrica(c1839e2);
                    AbstractC8210e.ad(c6032e, null, new C10375e(((C10375e) c13770e2.adcel(c15492e)).license.appmetrica(c1839e2), ((C10375e) c13770e2.adcel(c15492e)).appmetrica.appmetrica(c1839e2), ((C10375e) c13770e2.adcel(c15492e)).purchase.appmetrica(c1839e2), ((C10375e) c13770e2.adcel(c15492e)).billing.appmetrica(c1839e2), appmetrica2, appmetrica, 32263), AbstractC16653e.license(1504246607, new C12486e(c2243e, objArr == true ? 1 : 0), c13770e2), c13770e2, 3078, 2);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
