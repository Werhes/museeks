package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۨۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17447e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11439e f34169e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f34170e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34171e;

    public /* synthetic */ C17447e(InterfaceC8346e interfaceC8346e, C11439e c11439e, int i) {
        this.f34171e = i;
        this.f34170e = interfaceC8346e;
        this.f34169e = c11439e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.f34171e) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                int intValue = ((Number) obj2).intValue();
                C13770e c13770e = (C13770e) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (c13770e.purchase(c18055e) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= c13770e.license(intValue) ? 32 : 16;
                }
                if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
                    C12817e c12817e = (C12817e) this.f34170e.get(intValue);
                    c13770e.m3676strictfp(-1176047602);
                    C11439e c11439e = this.f34169e;
                    EnumC11342e m4167private = c11439e.m4167private();
                    AbstractC16049e m4166package = c11439e.m4166package();
                    String Signature = m4166package != null ? m4166package.Signature() : null;
                    boolean yandex = c13770e.yandex(c11439e) | c13770e.purchase(c12817e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C1021e(c11439e, c12817e, 7);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC0607e.ad(c12817e, m4167private, Signature, (Function0) m3681throw, c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e2 = (C18055e) obj;
                int intValue3 = ((Number) obj2).intValue();
                C13770e c13770e2 = (C13770e) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (c13770e2.purchase(c18055e2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= c13770e2.license(intValue3) ? 32 : 16;
                }
                if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
                    C14163e c14163e = (C14163e) this.f34170e.get(intValue3);
                    c13770e2.m3676strictfp(-1609949367);
                    C13964e billing = AbstractC16497e.billing(4);
                    C11439e c11439e2 = this.f34169e;
                    boolean yandex2 = c13770e2.yandex(c11439e2) | c13770e2.yandex(c14163e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C1021e(c11439e2, c14163e, 6);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e license = AbstractC9546e.license(c0115e, false, null, (Function0) m3681throw2, 15);
                    C4789e ad = AbstractC14801e.ad(billing, C5438e.f11672e, c13770e2, 6);
                    long j = c13770e2.f27286case;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, license);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    C15492e c15492e = AbstractC11785e.ad;
                    float f = 128;
                    AbstractC8461e.vip(c14163e.startapp, null, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, f), ((C7019e) c13770e2.adcel(c15492e)).metrica.license), new C6159e(((C7019e) c13770e2.adcel(c15492e)).ad.ads), new C6159e(((C7019e) c13770e2.adcel(c15492e)).ad.ads), C16477e.ad, c13770e2, 36912, 6, 31712);
                    AbstractC14489e.vip(c14163e.vip, AbstractC18007e.smaato(c0115e, f), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.adcel, c13770e2, 48, 24960, 110584);
                    c13770e2.Signature(true);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
