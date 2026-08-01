package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8228e {
    public static final C2892e ad = new C2892e(2050363127, false, new C14498e(27));

    public static final void ad(final EnumC10483e enumC10483e, final C2892e c2892e, final C2892e c2892e2, final C2892e c2892e3, final InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-1044974553);
        int i2 = i | (c13770e.license(enumC10483e.ordinal()) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 16384 : 8192);
        if (c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            final int startapp = AbstractC4533e.startapp(60, c13770e, 6, 0);
            AbstractC11261e.vip(AbstractC16653e.license(-1053555375, new Function3() { // from class: eؕٗۚ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final C13610e c13610e = (C13610e) obj;
                    C13770e c13770e2 = (C13770e) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= c13770e2.purchase(c13610e) ? 4 : 2;
                    }
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                        int i3 = startapp;
                        boolean license = c13770e2.license(i3);
                        Object m3681throw = c13770e2.m3681throw();
                        if (license || m3681throw == C2987e.ad) {
                            m3681throw = new C17028e(i3, 15);
                            c13770e2.m3682throws(m3681throw);
                        }
                        Function1 function1 = (Function1) m3681throw;
                        final C2892e c2892e4 = c2892e;
                        final C2892e c2892e5 = c2892e3;
                        final C2892e c2892e6 = c2892e2;
                        AbstractC7572e.vip(EnumC10483e.this, interfaceC12864e, function1, null, "[AbsolutionNP] Scene", null, AbstractC16653e.license(-798152234, new Function4() { // from class: eِْؖ
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                C0246e c0246e = (C0246e) obj4;
                                C13770e c13770e3 = (C13770e) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                int ordinal = ((EnumC10483e) obj5).ordinal();
                                C13610e c13610e2 = c13610e;
                                if (ordinal == 0) {
                                    c13770e3.m3676strictfp(-814177199);
                                    C2892e.this.invoke(c13610e2, c0246e, c13770e3, Integer.valueOf((intValue2 << 3) & 112));
                                    c13770e3.Signature(false);
                                } else if (ordinal == 1) {
                                    c13770e3.m3676strictfp(-813992749);
                                    c2892e6.invoke(c13610e2, c0246e, c13770e3, Integer.valueOf((intValue2 << 3) & 112));
                                    c13770e3.Signature(false);
                                } else if (ordinal == 2) {
                                    c13770e3.m3676strictfp(-814084044);
                                    c2892e5.invoke(c13610e2, c0246e, c13770e3, Integer.valueOf((intValue2 << 3) & 112));
                                    c13770e3.Signature(false);
                                } else {
                                    if (ordinal != 3) {
                                        throw AbstractC1786e.loadAd(1774850267, c13770e3, false);
                                    }
                                    c13770e3.m3676strictfp(-813900834);
                                    AbstractC17074e.ad(AbstractC18007e.metrica, c13770e3, 6);
                                    c13770e3.Signature(false);
                                }
                                return Unit.INSTANCE;
                            }
                        }, c13770e2), c13770e2, 1597440, 40);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, 6);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0773e(enumC10483e, c2892e, c2892e2, c2892e3, interfaceC12864e, i, 0);
        }
    }

    public static String appmetrica(int i) {
        return i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
    }

    public static final AbstractC11110e license(Iterable iterable) {
        AbstractC11110e abstractC11110e = iterable instanceof AbstractC11110e ? (AbstractC11110e) iterable : null;
        if (abstractC11110e != null) {
            return abstractC11110e;
        }
        InterfaceC16210e interfaceC16210e = iterable instanceof InterfaceC16210e ? (InterfaceC16210e) iterable : null;
        AbstractC11110e m1421class = interfaceC16210e != null ? ((C4009e) interfaceC16210e).m1421class() : null;
        if (m1421class != null) {
            return m1421class;
        }
        boolean z = iterable instanceof Collection;
        C10327e c10327e = C10327e.f20377e;
        if (z) {
            return c10327e.mo2797class((Collection) iterable);
        }
        C4009e mo2798interface = c10327e.mo2798interface();
        AbstractC13480e.inmobi(mo2798interface, iterable);
        return mo2798interface.m1421class();
    }

    public static final InterfaceC8346e metrica(List list) {
        InterfaceC8346e interfaceC8346e = list instanceof InterfaceC8346e ? (InterfaceC8346e) list : null;
        return interfaceC8346e == null ? license(list) : interfaceC8346e;
    }

    public static final void vip(C12890e c12890e, InterfaceC14576e interfaceC14576e, AbstractC4457e abstractC4457e, float f, C13973e c13973e, C11964e c11964e, AbstractC4970e abstractC4970e) {
        ArrayList arrayList = c12890e.yandex;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C4864e c4864e = (C4864e) arrayList.get(i);
            c4864e.ad.applovin(interfaceC14576e, abstractC4457e, f, c13973e, c11964e, abstractC4970e);
            interfaceC14576e.loadAd(0.0f, c4864e.ad.adcel());
        }
    }
}
