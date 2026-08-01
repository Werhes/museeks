package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8887e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C15921e f17847e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f17848e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f17849e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f17850e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Function4 f17851e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C12742e f17852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8887e(C13119e c13119e, Object obj, Function1 function1, C15921e c15921e, C12742e c12742e, Function4 function4) {
        super(2);
        this.f17849e = c13119e;
        this.f17848e = obj;
        this.f17850e = function1;
        this.f17847e = c15921e;
        this.f17852e = c12742e;
        this.f17851e = function4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Number) obj2).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            Function1 function1 = this.f17850e;
            C15921e c15921e = this.f17847e;
            Object obj3 = C2987e.ad;
            if (m3681throw == obj3) {
                m3681throw = (C2714e) function1.invoke(c15921e);
                c13770e.m3682throws(m3681throw);
            }
            C2714e c2714e = (C2714e) m3681throw;
            C13119e c13119e = this.f17849e;
            InterfaceC16490e purchase = c13119e.purchase();
            C0576e c0576e = c13119e.license;
            Object metrica = purchase.metrica();
            Object obj4 = this.f17848e;
            boolean billing = c13770e.billing(AbstractC7890e.billing(metrica, obj4));
            Object m3681throw2 = c13770e.m3681throw();
            if (billing || m3681throw2 == obj3) {
                m3681throw2 = AbstractC7890e.billing(c13119e.purchase().metrica(), obj4) ? C2128e.vip : ((C2714e) function1.invoke(c15921e)).vip;
                c13770e.m3682throws(m3681throw2);
            }
            C2128e c2128e = (C2128e) m3681throw2;
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == obj3) {
                m3681throw3 = new C17708e(AbstractC7890e.billing(obj4, c0576e.getValue()));
                c13770e.m3682throws(m3681throw3);
            }
            C17708e c17708e = (C17708e) m3681throw3;
            C18351e c18351e = c2714e.ad;
            boolean yandex = c13770e.yandex(c2714e);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex || m3681throw4 == obj3) {
                m3681throw4 = new C4840e(1, c2714e);
                c13770e.m3682throws(m3681throw4);
            }
            InterfaceC12864e purchase2 = AbstractC18127e.purchase(C0115e.f1276e, (Function3) m3681throw4);
            c17708e.f34708e.setValue(Boolean.valueOf(AbstractC7890e.billing(obj4, c0576e.getValue())));
            InterfaceC12864e premium = purchase2.premium(c17708e);
            boolean yandex2 = c13770e.yandex(obj4);
            Object m3681throw5 = c13770e.m3681throw();
            if (yandex2 || m3681throw5 == obj3) {
                m3681throw5 = new C17097e(6, obj4);
                c13770e.m3682throws(m3681throw5);
            }
            Function1 function12 = (Function1) m3681throw5;
            boolean purchase3 = c13770e.purchase(c2128e);
            Object m3681throw6 = c13770e.m3681throw();
            if (purchase3 || m3681throw6 == obj3) {
                m3681throw6 = new C1827e(2, c2128e);
                c13770e.m3682throws(m3681throw6);
            }
            AbstractC12640e.ad(c13119e, function12, premium, c18351e, c2128e, (Function2) m3681throw6, AbstractC16653e.license(-143346359, new C12122e(this.f17852e, obj4, c15921e, this.f17851e, 0), c13770e), c13770e, 12582912);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
