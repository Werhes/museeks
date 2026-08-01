package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۦۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4516e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C12692e f9791e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f9792e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5178e f9793e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C13182e f9794e;

    public C4516e(C13182e c13182e, String str, C12692e c12692e, InterfaceC5178e interfaceC5178e) {
        this.f9794e = c13182e;
        this.f9792e = str;
        this.f9791e = c12692e;
        this.f9793e = interfaceC5178e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Number) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(24), C5438e.f11668e, c13770e, 54);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
            InterfaceC5685e.mopub.getClass();
            Function0 function0 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            C13182e c13182e = this.f9794e;
            C11952e c11952e = c13182e.f26176e;
            String str = this.f9792e;
            Object obj4 = c11952e.get(str);
            EnumC10584e enumC10584e = EnumC10584e.f20884e;
            Object obj5 = C2987e.ad;
            if (obj4 == enumC10584e) {
                c13770e.m3676strictfp(1445903424);
                AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_add, 0, c13770e);
                long j2 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.remoteconfig;
                InterfaceC12864e startapp = AbstractC18007e.startapp(c0115e, 18);
                boolean yandex = c13770e.yandex(c13182e) | c13770e.purchase(str);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == obj5) {
                    m3681throw = new C18167e(c13182e, str, 0);
                    c13770e.m3682throws(m3681throw);
                }
                AbstractC5647e.vip(metrica, "Undo", AbstractC9546e.license(startapp, false, null, (Function0) m3681throw, 15), j2, c13770e, 56, 0);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(1446581239);
                AbstractC10727e metrica2 = AbstractC12475e.metrica(R.drawable.ic_delete_outline_android_28, 0, c13770e);
                long j3 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.remoteconfig;
                InterfaceC12864e startapp2 = AbstractC18007e.startapp(c0115e, 18);
                boolean yandex2 = c13770e.yandex(c13182e) | c13770e.purchase(str);
                Object m3681throw2 = c13770e.m3681throw();
                if (yandex2 || m3681throw2 == obj5) {
                    m3681throw2 = new C18167e(c13182e, str, 1);
                    c13770e.m3682throws(m3681throw2);
                }
                AbstractC5647e.vip(metrica2, "Delete", AbstractC9546e.license(startapp2, false, null, (Function0) m3681throw2, 15), j3, c13770e, 56, 0);
                c13770e.Signature(false);
            }
            InterfaceC5178e interfaceC5178e = this.f9793e;
            boolean yandex3 = c13770e.yandex(interfaceC5178e);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex3 || m3681throw3 == obj5) {
                m3681throw3 = new C13682e(interfaceC5178e, 0);
                c13770e.m3682throws(m3681throw3);
            }
            Function1 function1 = (Function1) m3681throw3;
            boolean yandex4 = c13770e.yandex(interfaceC5178e);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex4 || m3681throw4 == obj5) {
                m3681throw4 = new C17814e(interfaceC5178e, 0);
                c13770e.m3682throws(m3681throw4);
            }
            InterfaceC12864e billing = AbstractC5542e.billing(this.f9791e, null, function1, (Function0) m3681throw4, 19);
            Object m3681throw5 = c13770e.m3681throw();
            if (m3681throw5 == obj5) {
                m3681throw5 = C2997e.f7038e;
                c13770e.m3682throws(m3681throw5);
            }
            AbstractC0014e.metrica((Function0) m3681throw5, billing, false, null, null, null, AbstractC15390e.Signature, c13770e, 1572870, 60);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
