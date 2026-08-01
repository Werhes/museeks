package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۘٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2045e extends AbstractC10347e {
    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-2067202460);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C2892e c2892e = AbstractC16481e.ad;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                Cvolatile cvolatile = new Cvolatile(0, this, C2045e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 20);
                c13770e.m3682throws(cvolatile);
                m3681throw = cvolatile;
            }
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C7444e(this, 0);
                c13770e.m3682throws(m3681throw2);
            }
            Function1 function1 = (Function1) m3681throw2;
            c13770e2 = c13770e;
            AbstractC11575e.ad(c2892e, function0, null, function1, c13770e2, 6, 4);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C11213e(this, i, 2);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m759strictfp(final int i, final int i2, C13770e c13770e, final int i3) {
        c13770e.m3671package(-378375937);
        int i4 = (c13770e.license(i2) ? 32 : 16) | i3;
        if (c13770e.m3673protected(i4 & 1, (i4 & 19) != 18)) {
            AbstractC16429e.ad(AbstractC16653e.license(1275655005, new C2172e(i2, 0, (byte) 0), c13770e), AbstractC18007e.metrica(C0115e.f1276e, 1.0f), null, null, AbstractC16653e.license(-1539796895, new C2172e(i, 1, (byte) 0), c13770e), null, null, 0.0f, 0.0f, c13770e, 24630, 492);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(i, i2, i3) { // from class: eٗ٘ٚ

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ int f33407e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ int f33408e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(7);
                    C2045e.this.m759strictfp(this.f33408e, this.f33407e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
