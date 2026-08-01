package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8550e implements InterfaceC5372e {
    public static final C8550e ad = new Object();
    public static final Object vip = AbstractC18039e.appmetrica(2, new C13117e(7));

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        InterfaceC9998e appmetrica = appmetrica();
        AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC5757e.metrica(appmetrica);
        abstractC15920e.isPro(ad.appmetrica(), 0, ((C17705e) obj).metrica);
        abstractC15920e.vip(appmetrica);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return (InterfaceC9998e) vip.getValue();
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e appmetrica = appmetrica();
        InterfaceC2043e metrica = interfaceC11754e.metrica(appmetrica);
        long j = 0;
        boolean z = false;
        while (true) {
            C8550e c8550e = ad;
            int yandex = metrica.yandex(c8550e.appmetrica());
            if (yandex == -1) {
                Unit unit = Unit.INSTANCE;
                metrica.vip(appmetrica);
                if (z) {
                    return new C17705e(j);
                }
                throw new C15691e("nanoseconds", appmetrica().ad());
            }
            if (yandex != 0) {
                AbstractC8230e.adcel(yandex);
                throw null;
            }
            j = metrica.firebase(c8550e.appmetrica(), 0);
            z = true;
        }
    }
}
