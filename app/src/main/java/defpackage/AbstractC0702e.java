package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۦٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0702e {
    public static final C13789e ad = new C13789e(0.4f, 0.0f, 0.2f, 1.0f);

    public static final void ad(InterfaceC12864e interfaceC12864e, final long j, final float f, final float f2, C13770e c13770e, final int i) {
        C13770e c13770e2;
        final InterfaceC12864e interfaceC12864e2;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(1804565159);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= c13770e.appmetrica(j) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                interfaceC12864e3 = C0115e.f1276e;
            } else {
                c13770e.m3659default();
                interfaceC12864e3 = interfaceC12864e;
            }
            c13770e.admob();
            C13121e c13121e = new C13121e(((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo497instanceof(f), 0.0f, 2, 0, null, 26);
            C17719e adcel = AbstractC11906e.adcel(c13770e, 1);
            C15239e c15239e = AbstractC5616e.license;
            int i3 = i2;
            C4298e billing = AbstractC11906e.billing(adcel, 0, 5, AbstractC9546e.vip, AbstractC12696e.vip(AbstractC12696e.yandex(6660, 2, c15239e), 0, 0L, 6), null, c13770e, 33208, 16);
            C4298e purchase = AbstractC11906e.purchase(adcel, 0.0f, 286.0f, AbstractC12696e.vip(AbstractC12696e.yandex(1332, 2, c15239e), 0, 0L, 6), null, c13770e, 4536, 8);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C3114e(15);
                c13770e.m3682throws(m3681throw);
            }
            C4298e purchase2 = AbstractC11906e.purchase(adcel, 0.0f, 290.0f, AbstractC12696e.vip(AbstractC12696e.metrica((Function1) m3681throw), 0, 0L, 6), null, c13770e, 4536, 8);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C3114e(17);
                c13770e.m3682throws(m3681throw2);
            }
            C4298e purchase3 = AbstractC11906e.purchase(adcel, 0.0f, 290.0f, AbstractC12696e.vip(AbstractC12696e.metrica((Function1) m3681throw2), 0, 0L, 6), null, c13770e, 4536, 8);
            c13770e2 = c13770e;
            InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC2206e.appmetrica(interfaceC12864e3), f2);
            boolean purchase4 = c13770e2.purchase(billing) | c13770e2.purchase(purchase2) | c13770e2.purchase(purchase3) | c13770e2.purchase(purchase) | ((((i3 & 112) ^ 48) > 32 && c13770e2.appmetrica(j)) || (i3 & 48) == 32) | c13770e2.yandex(c13121e);
            Object m3681throw3 = c13770e2.m3681throw();
            if (purchase4 || m3681throw3 == c5170e) {
                C12343e c12343e = new C12343e(billing, purchase2, purchase3, purchase, f, f2, j, c13121e, 1);
                c13770e2.m3682throws(c12343e);
                m3681throw3 = c12343e;
            }
            AbstractC18366e.ad(startapp, (Function1) m3681throw3, c13770e2, 0);
            interfaceC12864e2 = interfaceC12864e3;
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؔٚٗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0702e.ad(InterfaceC12864e.this, j, f, f2, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
