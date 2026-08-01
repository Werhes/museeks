package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5927e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C1922e f12498e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f12499e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f12500e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12501e;

    public /* synthetic */ C5927e(List list, C1922e c1922e, InterfaceC3314e interfaceC3314e, int i) {
        this.f12501e = i;
        this.f12499e = list;
        this.f12498e = c1922e;
        this.f12500e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.f12501e) {
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
                    C10620e c10620e = (C10620e) this.f12499e.get(intValue);
                    c13770e.m3676strictfp(2001823287);
                    String str = c10620e.ad;
                    InterfaceC3314e interfaceC3314e = this.f12500e;
                    boolean billing = AbstractC7890e.billing(str, ((C16801e) interfaceC3314e.getValue()).f32938e);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    C2892e license = AbstractC16653e.license(-74934590, new C5196e(c10620e, 1), c13770e);
                    C2892e license2 = AbstractC16653e.license(-359483365, new C16323e(c10620e, 1), c13770e);
                    boolean purchase = c13770e.purchase(interfaceC3314e);
                    C1922e c1922e = this.f12498e;
                    boolean yandex = purchase | c13770e.yandex(c1922e) | c13770e.yandex(c10620e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C4862e(c1922e, c10620e, interfaceC3314e, 1);
                        c13770e.m3682throws(m3681throw);
                    }
                    c1922e.m729transient(license, license2, billing, m3681throw, metrica, AbstractC16653e.license(640240671, new C2077e(c1922e, c10620e, 6), c13770e), c13770e, 221238, 0);
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
                    C10620e c10620e2 = (C10620e) this.f12499e.get(intValue3);
                    c13770e2.m3676strictfp(1561623520);
                    String str2 = c10620e2.ad;
                    InterfaceC3314e interfaceC3314e2 = this.f12500e;
                    boolean billing2 = AbstractC7890e.billing(str2, ((C16801e) interfaceC3314e2.getValue()).f32938e);
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    C2892e license3 = AbstractC16653e.license(1088440889, new C5196e(c10620e2, 0), c13770e2);
                    C2892e license4 = AbstractC16653e.license(-1779992238, new C16323e(c10620e2, 0), c13770e2);
                    boolean purchase2 = c13770e2.purchase(interfaceC3314e2);
                    C1922e c1922e2 = this.f12498e;
                    boolean yandex2 = purchase2 | c13770e2.yandex(c1922e2) | c13770e2.yandex(c10620e2);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C4862e(c1922e2, c10620e2, interfaceC3314e2, 0);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    c1922e2.m729transient(license3, license4, billing2, m3681throw2, metrica2, null, c13770e2, 24630, 32);
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
