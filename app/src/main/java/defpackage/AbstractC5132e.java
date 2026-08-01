package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5132e {
    public static final C15534e ad = new C15534e(true, 30);

    public static final void ad(InterfaceC10601e interfaceC10601e, C17828e c17828e, C13770e c13770e, int i) {
        C13770e c13770e2;
        Context context;
        c13770e.m3671package(1904307118);
        int i2 = (c13770e.purchase(interfaceC10601e) ? 4 : 2) | i | (c13770e.yandex(c17828e) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c13770e.m3676strictfp(-1009482584);
                context = (Context) c13770e.adcel(AbstractC2676e.vip);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1009433480);
                c13770e.Signature(false);
                context = null;
            }
            boolean yandex = c13770e.yandex(c17828e) | ((i2 & 14) == 4) | c13770e.yandex(context);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new Cthrows(15, c17828e, context, interfaceC10601e);
                c13770e.m3682throws(m3681throw);
            }
            c13770e2 = c13770e;
            AbstractC3435e.vip(null, null, (Function1) m3681throw, c13770e2, 0, 3);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(interfaceC10601e, c17828e, i, 26);
        }
    }

    public static final void license(int i, C2892e c2892e, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i2;
        c13770e.m3671package(1392105195);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC17202e.ad(interfaceC12864e, AbstractC2844e.ad, c2892e, c13770e, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4430e(interfaceC12864e, c2892e, i, 2);
        }
    }

    public static final void metrica(InterfaceC10601e interfaceC10601e, InterfaceC1403e interfaceC1403e, Function0 function0, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c13770e.purchase(interfaceC10601e) : c13770e.yandex(interfaceC10601e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c13770e.purchase(interfaceC1403e) : c13770e.yandex(interfaceC1403e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        boolean z = false;
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && c13770e.purchase(interfaceC1403e));
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (z2 || m3681throw == c5170e) {
                m3681throw = new C14115e(new C7988e(6, new C5625e(interfaceC1403e, function0, 10)));
                c13770e.m3682throws(m3681throw);
            }
            C14115e c14115e = (C14115e) m3681throw;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && c13770e.yandex(interfaceC10601e))) {
                z = true;
            }
            Object m3681throw2 = c13770e.m3681throw();
            if (z || m3681throw2 == c5170e) {
                m3681throw2 = new C10479e(19, interfaceC10601e);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC12710e.ad(c14115e, (Function0) m3681throw2, ad, AbstractC16653e.license(1315155414, new C1743e(interfaceC1403e, interfaceC10601e, 25), c13770e), c13770e, 3456, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 11, interfaceC10601e, interfaceC1403e, function0);
        }
    }

    public static final void vip(final int i, final long j, C13770e c13770e, final int i2) {
        final int i3;
        int i4;
        C2846e subscription;
        Function2 function2;
        c13770e.m3671package(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (c13770e.license(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c13770e.appmetrica(j) ? 32 : 16;
        }
        if (c13770e.m3673protected(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
            boolean purchase = ((i4 & 14) == 4) | c13770e.purchase(context);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (purchase || m3681throw == obj) {
                m3681throw = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                c13770e.m3682throws(m3681throw);
            }
            int intValue = ((Number) m3681throw).intValue();
            if (intValue == -1) {
                subscription = c13770e.subscription();
                if (subscription != null) {
                    final int i5 = 1;
                    function2 = new Function2() { // from class: eٍٗۗ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i6 = i5;
                            C13770e c13770e2 = (C13770e) obj2;
                            ((Integer) obj3).getClass();
                            switch (i6) {
                                case 0:
                                    AbstractC5132e.vip(i3, j, c13770e2, AbstractC5190e.advert(i2 | 1));
                                    return Unit.INSTANCE;
                                default:
                                    AbstractC5132e.vip(i3, j, c13770e2, AbstractC5190e.advert(i2 | 1));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    subscription.license = function2;
                }
                return;
            }
            AbstractC10727e metrica = AbstractC12475e.metrica(intValue, 0, c13770e);
            boolean z = (i4 & 112) == 32;
            Object m3681throw2 = c13770e.m3681throw();
            if (z || m3681throw2 == obj) {
                m3681throw2 = j == 16 ? null : new C2815e(j, 5);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17074e.ad(AbstractC1596e.metrica(AbstractC18007e.startapp(C0115e.f1276e, AbstractC16226e.adcel), metrica, null, C16477e.vip, 0.0f, (C2815e) m3681throw2, 22), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        subscription = c13770e.subscription();
        if (subscription != null) {
            final int i6 = 0;
            function2 = new Function2() { // from class: eٍٗۗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i62 = i6;
                    C13770e c13770e2 = (C13770e) obj2;
                    ((Integer) obj3).getClass();
                    switch (i62) {
                        case 0:
                            AbstractC5132e.vip(i, j, c13770e2, AbstractC5190e.advert(i2 | 1));
                            return Unit.INSTANCE;
                        default:
                            AbstractC5132e.vip(i, j, c13770e2, AbstractC5190e.advert(i2 | 1));
                            return Unit.INSTANCE;
                    }
                }
            };
            subscription.license = function2;
        }
    }
}
