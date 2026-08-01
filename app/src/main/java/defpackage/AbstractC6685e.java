package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6685e {
    public static final C13789e ad = new C13789e(0.4f, 0.0f, 0.2f, 1.0f);

    public static final void ad(InterfaceC12864e interfaceC12864e, final long j, final float f, final float f2, C13770e c13770e, final int i, final int i2) {
        InterfaceC12864e interfaceC12864e2;
        int i3;
        C13770e c13770e2;
        final InterfaceC12864e interfaceC12864e3;
        InterfaceC12864e interfaceC12864e4;
        InterfaceC12864e interfaceC12864e5;
        c13770e.m3671package(-398914254);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            interfaceC12864e2 = interfaceC12864e;
        } else if ((i & 6) == 0) {
            interfaceC12864e2 = interfaceC12864e;
            i3 = i | (c13770e.purchase(interfaceC12864e2) ? 4 : 2);
        } else {
            interfaceC12864e2 = interfaceC12864e;
            i3 = i;
        }
        int i5 = i3 | (c13770e.appmetrica(j) ? 32 : 16);
        if (c13770e.m3673protected(i5 & 1, (i5 & 1171) != 1170)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                interfaceC12864e4 = i4 != 0 ? C0115e.f1276e : interfaceC12864e2;
            } else {
                c13770e.m3659default();
                interfaceC12864e4 = interfaceC12864e2;
            }
            c13770e.admob();
            C13121e c13121e = new C13121e(((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo497instanceof(f), 0.0f, 2, 0, null, 26);
            C17719e adcel = AbstractC11906e.adcel(c13770e, 1);
            C15239e c15239e = AbstractC5616e.license;
            boolean z = true;
            C4298e billing = AbstractC11906e.billing(adcel, 0, 5, AbstractC9546e.vip, AbstractC12696e.vip(AbstractC12696e.yandex(6660, 2, c15239e), 0, 0L, 6), null, c13770e, 33208, 16);
            C4298e purchase = AbstractC11906e.purchase(adcel, 0.0f, 286.0f, AbstractC12696e.vip(AbstractC12696e.yandex(1332, 2, c15239e), 0, 0L, 6), null, c13770e, 4536, 8);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C3114e(14);
                c13770e.m3682throws(m3681throw);
            }
            C4298e purchase2 = AbstractC11906e.purchase(adcel, 0.0f, 290.0f, AbstractC12696e.vip(AbstractC12696e.metrica((Function1) m3681throw), 0, 0L, 6), null, c13770e, 4536, 8);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C3114e(16);
                c13770e.m3682throws(m3681throw2);
            }
            C4298e purchase3 = AbstractC11906e.purchase(adcel, 0.0f, 290.0f, AbstractC12696e.vip(AbstractC12696e.metrica((Function1) m3681throw2), 0, 0L, 6), null, c13770e, 4536, 8);
            c13770e2 = c13770e;
            InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC2206e.appmetrica(interfaceC12864e4), f2);
            boolean purchase4 = c13770e2.purchase(billing) | c13770e2.purchase(purchase2) | c13770e2.purchase(purchase3) | c13770e2.purchase(purchase);
            if ((((i5 & 112) ^ 48) <= 32 || !c13770e2.appmetrica(j)) && (i5 & 48) != 32) {
                z = false;
            }
            boolean yandex = purchase4 | z | c13770e2.yandex(c13121e);
            Object m3681throw3 = c13770e2.m3681throw();
            if (yandex || m3681throw3 == c5170e) {
                interfaceC12864e5 = startapp;
                C12343e c12343e = new C12343e(billing, purchase2, purchase3, purchase, f, f2, j, c13121e, 0);
                c13770e2.m3682throws(c12343e);
                m3681throw3 = c12343e;
            } else {
                interfaceC12864e5 = startapp;
            }
            AbstractC18366e.ad(interfaceC12864e5, (Function1) m3681throw3, c13770e2, 0);
            interfaceC12864e3 = interfaceC12864e4;
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
            interfaceC12864e3 = interfaceC12864e2;
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eؑ۟ۧ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC6685e.ad(InterfaceC12864e.this, j, f, f2, (C13770e) obj, AbstractC5190e.advert(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
