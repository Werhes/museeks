package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٙۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C2746e c2746e = (C2746e) obj;
        c17790e.m4424case(c2746e.ad());
        int i = c2746e.f6650e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 2, Integer.valueOf(i));
        }
        int i2 = c2746e.f6651e;
        if (i2 != 0) {
            AbstractC11069e.yandex.adcel(c17790e, 1, Integer.valueOf(i2));
        }
    }

    @Override // defpackage.AbstractC11069e
    public final Object metrica(C17546e c17546e) {
        long license = c17546e.license();
        int i = 0;
        int i2 = 0;
        while (true) {
            int billing = c17546e.billing();
            if (billing == -1) {
                return new C2746e(i, i2, c17546e.appmetrica(license));
            }
            if (billing == 1) {
                AbstractC11069e.yandex.getClass();
                i = c17546e.amazon();
            } else if (billing != 2) {
                c17546e.smaato(billing);
            } else {
                AbstractC11069e.billing.getClass();
                i2 = c17546e.amazon();
            }
        }
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C2746e c2746e = (C2746e) obj;
        int license = c2746e.ad().license();
        int i = c2746e.f6651e;
        if (i != 0) {
            license += AbstractC11069e.yandex.advert(1, Integer.valueOf(i));
        }
        int i2 = c2746e.f6650e;
        return i2 != 0 ? AbstractC8647e.signatures(i2, AbstractC11069e.billing, 2, license) : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C2746e c2746e = (C2746e) obj;
        int i = c2746e.f6651e;
        if (i != 0) {
            AbstractC11069e.yandex.startapp(c0444e, 1, Integer.valueOf(i));
        }
        int i2 = c2746e.f6650e;
        if (i2 != 0) {
            AbstractC11069e.billing.startapp(c0444e, 2, Integer.valueOf(i2));
        }
        c0444e.m356try(c2746e.ad());
    }
}
