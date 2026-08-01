package defpackage;

import androidx.car.app.model.Alert;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819e {
    public static final C1819e ad = new Object();

    public final void ad(C5640e c5640e, C13770e c13770e, int i) {
        InterfaceC12864e interfaceC12864e;
        C5070e state;
        InterfaceC12864e vip;
        C13770e c13770e2 = c13770e;
        float f = c5640e.yandex;
        c13770e2.m3671package(2137486921);
        int i2 = i | (c13770e2.purchase(c5640e) ? 4 : 2);
        int i3 = 0;
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C13793e c13793e = c5640e.mopub;
            InterfaceC2566e interfaceC2566e = c5640e.advert;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            boolean purchase = c13770e2.purchase(c13793e) | c13770e2.purchase(interfaceC2566e);
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (purchase || m3681throw == c5170e) {
                m3681throw = AbstractC14533e.purchase(new C3411e(8, c5640e));
                c13770e2.m3682throws(m3681throw);
            }
            InterfaceC16132e ad2 = AbstractC3145e.ad(((C3618e) ((InterfaceC16132e) m3681throw).getValue()).ad, AbstractC11008e.metrica(c13770e2, 4), null, null, c13770e2, 0, 12);
            C2892e license = AbstractC16653e.license(-1658896622, new C11213e(20, c5640e), c13770e2);
            int i4 = 12;
            InterfaceC12864e interfaceC12864e2 = C0115e.f1276e;
            if (interfaceC2566e == null || interfaceC2566e.license()) {
                c13770e2.m3676strictfp(690075377);
                c13770e2.Signature(false);
                interfaceC12864e = interfaceC12864e2;
            } else {
                c13770e2.m3676strictfp(689460399);
                int i5 = i2 & 14;
                boolean z = i5 == 4;
                Object m3681throw2 = c13770e2.m3681throw();
                if (z || m3681throw2 == c5170e) {
                    m3681throw2 = new C10739e(i4, c5640e);
                    c13770e2.m3682throws(m3681throw2);
                }
                InterfaceC3239e vip2 = AbstractC6367e.vip(c13770e2, (Function1) m3681throw2);
                boolean z2 = i5 == 4;
                Object m3681throw3 = c13770e2.m3681throw();
                if (z2 || m3681throw3 == c5170e) {
                    m3681throw3 = new C11923e(c5640e, null, i3);
                    c13770e2.m3682throws(m3681throw3);
                }
                InterfaceC12864e c7980e = new C7980e(vip2, EnumC17426e.f34146e, true, null, false, AbstractC6367e.ad, (Function3) m3681throw3, false);
                c13770e2.Signature(false);
                interfaceC12864e = c7980e;
            }
            InterfaceC12864e premium = c5640e.ad.premium(interfaceC12864e);
            boolean purchase2 = c13770e2.purchase(ad2);
            Object m3681throw4 = c13770e2.m3681throw();
            if (purchase2 || m3681throw4 == c5170e) {
                m3681throw4 = new C17652e(ad2, 2);
                c13770e2.m3682throws(m3681throw4);
            }
            InterfaceC12864e metrica = AbstractC5750e.metrica(premium, (Function1) m3681throw4);
            Object m3681throw5 = c13770e2.m3681throw();
            if (m3681throw5 == c5170e) {
                m3681throw5 = new C2163e(6);
                c13770e2.m3682throws(m3681throw5);
            }
            InterfaceC12864e ad3 = AbstractC1147e.ad(metrica, false, (Function1) m3681throw5);
            Unit unit = Unit.INSTANCE;
            Object m3681throw6 = c13770e2.m3681throw();
            if (m3681throw6 == c5170e) {
                m3681throw6 = C15801e.f31115e;
                c13770e2.m3682throws(m3681throw6);
            }
            InterfaceC12864e ad4 = AbstractC0845e.ad(ad3, unit, (PointerInputEventHandler) m3681throw6);
            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e2.f27286case;
            int i6 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, ad4);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, license2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i6), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase3, C2721e.license);
            InterfaceC12864e metrica2 = AbstractC12447e.metrica(AbstractC3752e.appmetrica(interfaceC12864e2, c5640e.adcel));
            C5015e c5015e = AbstractC10560e.ad;
            if (interfaceC2566e != null && (state = interfaceC2566e.getState()) != null && (vip = AbstractC6437e.vip(metrica2, new C17972e(state, 0))) != null) {
                metrica2 = vip;
            }
            boolean z3 = (i2 & 14) == 4;
            Object m3681throw7 = c13770e2.m3681throw();
            if (z3 || m3681throw7 == c5170e) {
                m3681throw7 = new C6291e(0, c5640e);
                c13770e2.m3682throws(m3681throw7);
            }
            InterfaceC14468e interfaceC14468e = (InterfaceC14468e) m3681throw7;
            long j2 = c13793e.metrica;
            long j3 = c13793e.license;
            long j4 = c13793e.appmetrica;
            long j5 = c13793e.purchase;
            Function2 function2 = c5640e.vip;
            C1839e c1839e = c5640e.metrica;
            C1839e c1839e2 = c5640e.license;
            C8705e c8705e = AbstractC16497e.appmetrica;
            C9577e c9577e = c5640e.appmetrica;
            Function2 function22 = c5640e.purchase;
            InterfaceC12864e interfaceC12864e3 = metrica2;
            float f2 = c5640e.yandex;
            InterfaceC12123e interfaceC12123e = c5640e.startapp;
            Object m3681throw8 = c13770e2.m3681throw();
            if (m3681throw8 == c5170e) {
                m3681throw8 = new C0996e(12);
                c13770e2.m3682throws(m3681throw8);
            }
            AbstractC10560e.appmetrica(interfaceC12864e3, interfaceC14468e, j2, j3, j5, j4, function2, c1839e, null, c1839e2, (Function0) m3681throw8, c8705e, c9577e, 0, false, function22, license, f2, interfaceC12123e, c13770e, 0, 1600566);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(this, c5640e, i, 24);
        }
    }
}
