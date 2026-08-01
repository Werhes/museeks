package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10624e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7888e f20938e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20939e;

    public /* synthetic */ C10624e(C7888e c7888e, int i) {
        this.f20939e = i;
        this.f20938e = c7888e;
    }

    public /* synthetic */ C10624e(C7888e c7888e, int i, int i2) {
        this.f20939e = i2;
        this.f20938e = c7888e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        EnumC12505e enumC12505e;
        int i2 = this.f20939e;
        C5170e c5170e = C2987e.ad;
        C7888e c7888e = this.f20938e;
        switch (i2) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    int ordinal = ((EnumC12505e) c7888e.f15965e.getValue()).ordinal();
                    if (ordinal == 0) {
                        i = R.string.hs_source_queue;
                    } else if (ordinal == 1) {
                        i = R.string.hs_source_library;
                    } else if (ordinal == 2) {
                        i = R.string.hs_source_mix;
                    } else {
                        if (ordinal != 3) {
                            throw new C14803e(10);
                        }
                        i = R.string.hs_source_library_cached;
                    }
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C7888e c7888e2 = this.f20938e;
                    boolean booleanValue = ((Boolean) c7888e2.f15962e.getValue()).booleanValue();
                    boolean yandex = c13770e2.yandex(c7888e2);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        C0638e c0638e = new C0638e(1, c7888e2, C7888e.class, "toggleBtAutostart", "toggleBtAutostart(Z)V", 0, 0, 17);
                        c13770e2.m3682throws(c0638e);
                        m3681throw = c0638e;
                    }
                    AbstractC8844e.ad(booleanValue, (Function1) ((InterfaceC5261e) m3681throw), null, false, null, c13770e2, 0, 124);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C7888e c7888e3 = this.f20938e;
                    boolean booleanValue2 = ((Boolean) c7888e3.f15964e.getValue()).booleanValue();
                    boolean yandex2 = c13770e3.yandex(c7888e3);
                    Object m3681throw2 = c13770e3.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        C0638e c0638e2 = new C0638e(1, c7888e3, C7888e.class, "toggleNotificationAutostart", "toggleNotificationAutostart(Z)V", 0, 0, 18);
                        c13770e3.m3682throws(c0638e2);
                        m3681throw2 = c0638e2;
                    }
                    AbstractC8844e.ad(booleanValue2, (Function1) ((InterfaceC5261e) m3681throw2), null, false, null, c13770e3, 0, 124);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                c7888e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    C7888e c7888e4 = this.f20938e;
                    boolean yandex3 = c13770e4.yandex(c7888e4);
                    Object m3681throw3 = c13770e4.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        C12829e c12829e = new C12829e(0, c7888e4, C7888e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 0);
                        c13770e4.m3682throws(c12829e);
                        m3681throw3 = c12829e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw3), null, false, null, null, null, AbstractC8797e.vip, c13770e4, 1572864, 62);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean yandex4 = c13770e5.yandex(c7888e);
                    Object m3681throw4 = c13770e5.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e) {
                        m3681throw4 = new C10277e(c7888e, 0);
                        c13770e5.m3682throws(m3681throw4);
                    }
                    AbstractC1513e.license((Function0) m3681throw4, null, false, null, null, null, AbstractC8797e.adcel, c13770e5, 805306368, 510);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e, 0.0f, 8, 0.0f, 0.0f, 13);
                    C15492e c15492e = AbstractC11785e.ad;
                    InterfaceC12864e metrica = AbstractC16136e.metrica(AbstractC12447e.vip(loadAd, ((C7019e) c13770e6.adcel(c15492e)).metrica.license), ((C7019e) c13770e6.adcel(c15492e)).ad.amazon, AbstractC10432e.ad);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e6, 0);
                    long j = c13770e6.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e6.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e6, metrica);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e6.m3666import();
                    if (c13770e6.f27292implements) {
                        c13770e6.mopub(c7309e);
                    } else {
                        c13770e6.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e6, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e6, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e6, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e6, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e6, purchase, C2721e.license);
                    c13770e6.m3676strictfp(1419247126);
                    C15937e c15937e = EnumC12505e.f25047e;
                    Iterator it = c15937e.iterator();
                    while (it.hasNext()) {
                        EnumC12505e enumC12505e2 = (EnumC12505e) it.next();
                        float f = AbstractC11992e.ad;
                        C8872e ad2 = AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e6, 510);
                        boolean license = c13770e6.license(enumC12505e2.ordinal()) | c13770e6.yandex(c7888e);
                        Object m3681throw5 = c13770e6.m3681throw();
                        if (license || m3681throw5 == c5170e) {
                            enumC12505e = enumC12505e2;
                            m3681throw5 = new Celse(enumC12505e, c7888e, 14);
                            c13770e6.m3682throws(m3681throw5);
                        } else {
                            enumC12505e = enumC12505e2;
                        }
                        C13770e c13770e7 = c13770e6;
                        AbstractC16429e.ad(AbstractC16653e.license(357531513, new C11213e(6, enumC12505e), c13770e6), AbstractC9546e.license(c0115e, false, null, (Function0) m3681throw5, 15), null, null, null, AbstractC16653e.license(-1081289068, new C6949e(c7888e, enumC12505e, 17), c13770e6), ad2, 0.0f, 0.0f, c13770e7, 196614, 412);
                        c13770e6 = c13770e7;
                        if (enumC12505e.ordinal() != AbstractC6874e.billing(c15937e)) {
                            c13770e6.m3676strictfp(-1595155392);
                            AbstractC8141e.vip(null, 0.0f, 0L, c13770e6, 0, 7);
                        } else {
                            c13770e6.m3676strictfp(-1604364469);
                        }
                        c13770e6.Signature(false);
                    }
                    c13770e6.Signature(false);
                    c13770e6.Signature(true);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                c7888e.m2351strictfp((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
