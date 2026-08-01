package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٜؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6178e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C1925e f12949e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f12950e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12951e;

    public /* synthetic */ C6178e(InterfaceC8346e interfaceC8346e, C1925e c1925e, int i) {
        this.f12951e = i;
        this.f12950e = interfaceC8346e;
        this.f12949e = c1925e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String str;
        C18236e c18236e;
        int i2;
        String str2;
        C18236e c18236e2;
        switch (this.f12951e) {
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
                    InterfaceC12986e interfaceC12986e = (InterfaceC12986e) this.f12950e.get(intValue);
                    c13770e.m3676strictfp(-1455938537);
                    if (AbstractC7890e.billing(interfaceC12986e, C4436e.ad)) {
                        c13770e.m3676strictfp(-1455906019);
                        c13770e.Signature(false);
                    } else if (interfaceC12986e instanceof C11973e) {
                        c13770e.m3676strictfp(-1455838563);
                        c13770e.Signature(false);
                    } else {
                        boolean billing = AbstractC7890e.billing(interfaceC12986e, C10394e.ad);
                        C0115e c0115e = C0115e.f1276e;
                        if (billing) {
                            c13770e.m3676strictfp(-1455755204);
                            AbstractC1660e.metrica(AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), 16), c13770e, 6);
                            c13770e.Signature(false);
                        } else {
                            if (!(interfaceC12986e instanceof C13309e)) {
                                throw AbstractC1786e.loadAd(-739702420, c13770e, false);
                            }
                            c13770e.m3676strictfp(-1455436865);
                            C13309e c13309e = (C13309e) interfaceC12986e;
                            C9885e c9885e = c13309e.vip;
                            C18236e c18236e3 = c9885e.pro;
                            if (c18236e3 == null || (str = c18236e3.yandex) == null) {
                                List list = c9885e.inmobi;
                                str = (list == null || (c18236e = (C18236e) AbstractC13480e.m3604this(list)) == null) ? null : c18236e.yandex;
                            }
                            String str3 = c9885e.license;
                            Object m3681throw = c13770e.m3681throw();
                            C5170e c5170e = C2987e.ad;
                            if (m3681throw == c5170e) {
                                m3681throw = C11633e.f23364e;
                                c13770e.m3682throws(m3681throw);
                            }
                            String ad = AbstractC15203e.ad(c9885e, (Function1) m3681throw);
                            InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                            C1925e c1925e = this.f12949e;
                            boolean yandex = c13770e.yandex(interfaceC12986e) | c13770e.yandex(c1925e);
                            Object m3681throw2 = c13770e.m3681throw();
                            if (yandex || m3681throw2 == c5170e) {
                                m3681throw2 = new C15002e(c1925e, c13309e, 0);
                                c13770e.m3682throws(m3681throw2);
                            }
                            AbstractC1660e.ad(str, str3, ad, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw2, 15), c13770e, 0);
                            c13770e.Signature(false);
                        }
                    }
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
                    InterfaceC12986e interfaceC12986e2 = (InterfaceC12986e) this.f12950e.get(intValue3);
                    c13770e2.m3676strictfp(1527472044);
                    if (AbstractC7890e.billing(interfaceC12986e2, C4436e.ad)) {
                        c13770e2.m3676strictfp(1527511568);
                        c13770e2.Signature(false);
                    } else if (interfaceC12986e2 instanceof C11973e) {
                        c13770e2.m3676strictfp(1527575056);
                        c13770e2.Signature(false);
                    } else {
                        boolean billing2 = AbstractC7890e.billing(interfaceC12986e2, C10394e.ad);
                        C0115e c0115e2 = C0115e.f1276e;
                        if (billing2) {
                            c13770e2.m3676strictfp(1527653951);
                            AbstractC1660e.metrica(AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e2, 1.0f), 16), c13770e2, 6);
                            c13770e2.Signature(false);
                        } else {
                            if (!(interfaceC12986e2 instanceof C13309e)) {
                                throw AbstractC1786e.loadAd(-643463369, c13770e2, false);
                            }
                            c13770e2.m3676strictfp(1527943088);
                            C13309e c13309e2 = (C13309e) interfaceC12986e2;
                            C9885e c9885e2 = c13309e2.vip;
                            C18236e c18236e4 = c9885e2.pro;
                            if (c18236e4 == null || (str2 = c18236e4.yandex) == null) {
                                List list2 = c9885e2.inmobi;
                                str2 = (list2 == null || (c18236e2 = (C18236e) AbstractC13480e.m3604this(list2)) == null) ? null : c18236e2.yandex;
                            }
                            String str4 = c9885e2.license;
                            Object m3681throw3 = c13770e2.m3681throw();
                            C5170e c5170e2 = C2987e.ad;
                            if (m3681throw3 == c5170e2) {
                                m3681throw3 = C8865e.f17805e;
                                c13770e2.m3682throws(m3681throw3);
                            }
                            String ad2 = AbstractC15203e.ad(c9885e2, (Function1) m3681throw3);
                            InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e2, 1.0f);
                            C1925e c1925e2 = this.f12949e;
                            boolean yandex2 = c13770e2.yandex(interfaceC12986e2) | c13770e2.yandex(c1925e2);
                            Object m3681throw4 = c13770e2.m3681throw();
                            if (yandex2 || m3681throw4 == c5170e2) {
                                m3681throw4 = new C15002e(c1925e2, c13309e2, 1);
                                c13770e2.m3682throws(m3681throw4);
                            }
                            AbstractC1660e.ad(str2, str4, ad2, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw4, 15), c13770e2, 0);
                            c13770e2.Signature(false);
                        }
                    }
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
