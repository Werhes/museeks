package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0856e implements InterfaceC5372e {
    public static final C0856e ad = new Object();
    public static final C3859e vip = new C3859e("kotlin.time.Duration", C13337e.smaato);

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        long j = ((C14157e) obj).f27995e;
        C17647e c17647e = C14157e.f27993e;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long adcel = j < 0 ? C14157e.adcel(j) : j;
        long yandex = C14157e.yandex(adcel, EnumC15934e.HOURS);
        boolean z = false;
        int yandex2 = C14157e.purchase(adcel) ? 0 : (int) (C14157e.yandex(adcel, EnumC15934e.MINUTES) % 60);
        int yandex3 = C14157e.purchase(adcel) ? 0 : (int) (C14157e.yandex(adcel, EnumC15934e.SECONDS) % 60);
        int appmetrica = C14157e.appmetrica(adcel);
        if (C14157e.purchase(j)) {
            yandex = 9999999999999L;
        }
        boolean z2 = yandex != 0;
        boolean z3 = (yandex3 == 0 && appmetrica == 0) ? false : true;
        if (yandex2 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(yandex);
            sb.append('H');
        }
        if (z) {
            sb.append(yandex2);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C14157e.vip(sb, yandex3, appmetrica, 9, "S", true);
        }
        interfaceC5757e.remoteconfig(sb.toString());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C17647e c17647e = C14157e.f27993e;
        String pro = interfaceC11754e.pro();
        try {
            long smaato = AbstractC0326e.smaato(pro);
            if (smaato == C14157e.f27991e) {
                throw new IllegalStateException("invariant failed");
            }
            return new C14157e(smaato);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("Invalid ISO duration string format: '", pro, "'."), e);
        }
    }
}
