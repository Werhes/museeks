package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8464e {
    public static final C8464e ad = new Object();
    public static final float appmetrica;
    public static final float license;
    public static final float metrica;
    public static final float vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٍؔ, java.lang.Object] */
    static {
        float f = AbstractC11071e.ad;
        float f2 = AbstractC11071e.metrica;
        vip = 640;
        metrica = 56;
        float f3 = 125;
        license = f3;
        appmetrica = f3;
    }

    public final void ad(InterfaceC12864e interfaceC12864e, float f, float f2, InterfaceC16154e interfaceC16154e, long j, C13770e c13770e, final int i, final int i2) {
        InterfaceC12864e interfaceC12864e2;
        int i3;
        final float f3;
        final float f4;
        final InterfaceC16154e interfaceC16154e2;
        final long j2;
        final InterfaceC12864e interfaceC12864e3;
        InterfaceC12864e interfaceC12864e4;
        final float f5;
        final float f6;
        InterfaceC16154e interfaceC16154e3;
        long appmetrica2;
        c13770e.m3671package(-1364277227);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            interfaceC12864e2 = interfaceC12864e;
        } else {
            interfaceC12864e2 = interfaceC12864e;
            i3 = i | (c13770e.purchase(interfaceC12864e2) ? 4 : 2);
        }
        int i5 = i3 | 9648;
        if (c13770e.m3673protected(i5 & 1, (i5 & 9363) != 9362)) {
            c13770e.m3655case();
            if ((i & 1) == 0 || c13770e.isPro()) {
                InterfaceC12864e interfaceC12864e5 = i4 != 0 ? C0115e.f1276e : interfaceC12864e2;
                float f7 = AbstractC11071e.vip;
                interfaceC12864e4 = interfaceC12864e5;
                f5 = f7;
                f6 = AbstractC11071e.ad;
                interfaceC16154e3 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.appmetrica;
                appmetrica2 = AbstractC7893e.appmetrica(c13770e, 19);
            } else {
                c13770e.m3659default();
                f5 = f;
                f6 = f2;
                appmetrica2 = j;
                interfaceC12864e4 = interfaceC12864e2;
                interfaceC16154e3 = interfaceC16154e;
            }
            c13770e.admob();
            String vip2 = AbstractC9408e.vip(c13770e, R.string.m3c_bottom_sheet_drag_handle_description);
            InterfaceC12864e smaato = AbstractC12220e.smaato(interfaceC12864e4, 0.0f, AbstractC4229e.ad, 1);
            boolean purchase = c13770e.purchase(vip2);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new C18513e(vip2, 3);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC12121e.ad(AbstractC1147e.ad(smaato, false, (Function1) m3681throw), interfaceC16154e3, appmetrica2, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(-1039573072, new Function2() { // from class: eْٕۨ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        AbstractC17074e.ad(AbstractC18007e.adcel(C0115e.f1276e, f5, f6), c13770e2, 0);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, 12582912, 120);
            interfaceC16154e2 = interfaceC16154e3;
            j2 = appmetrica2;
            interfaceC12864e3 = interfaceC12864e4;
            f3 = f5;
            f4 = f6;
        } else {
            c13770e.m3659default();
            f3 = f;
            f4 = f2;
            interfaceC16154e2 = interfaceC16154e;
            j2 = j;
            interfaceC12864e3 = interfaceC12864e2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(interfaceC12864e3, f3, f4, interfaceC16154e2, j2, i, i2) { // from class: eَۢۥ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC16154e f20930e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ float f20931e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f20932e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ float f20933e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ int f20935e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ long f20936e;

                {
                    this.f20935e = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(196609);
                    C8464e.this.ad(this.f20932e, this.f20931e, this.f20933e, this.f20930e, this.f20936e, (C13770e) obj, advert, this.f20935e);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
