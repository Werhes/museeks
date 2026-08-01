package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17840e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f34946e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f34947e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f34948e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34949e = 0;

    public /* synthetic */ C17840e(float f, EnumC7792e enumC7792e, C2892e c2892e) {
        float f2 = AbstractC1981e.ad;
        this.f34947e = f;
        this.f34946e = enumC7792e;
        this.f34948e = c2892e;
    }

    public /* synthetic */ C17840e(C4254e c4254e, float f, C4271e c4271e) {
        this.f34946e = c4254e;
        this.f34947e = f;
        this.f34948e = c4271e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34949e;
        Object obj3 = this.f34948e;
        float f = this.f34947e;
        Object obj4 = this.f34946e;
        int i2 = 1;
        switch (i) {
            case 0:
                float f2 = AbstractC1981e.metrica;
                EnumC7792e enumC7792e = (EnumC7792e) obj4;
                C2892e c2892e = (C2892e) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC18268e.vip(null, AbstractC16497e.billing(f2), AbstractC16497e.billing(f), null, 0, 0, AbstractC16653e.license(879927511, new C8937e(enumC7792e, c2892e, 24), c13770e), c13770e, 1572864, 57);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C4254e c4254e = (C4254e) obj4;
                C4271e c4271e = (C4271e) obj3;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C16005e c16005e = AbstractC9083e.ad;
                    long j = C3618e.startapp;
                    long j2 = C3618e.appmetrica;
                    C13793e purchase = AbstractC9083e.purchase(j, 0L, j2, j2, j2, c13770e2, 34);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                    boolean metrica2 = c13770e2.metrica(f);
                    Object m3681throw = c13770e2.m3681throw();
                    if (metrica2 || m3681throw == C2987e.ad) {
                        m3681throw = new C11499e(i2, f);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC10560e.license(AbstractC6401e.ad, AbstractC12322e.purchase(metrica, c4254e, (Function1) m3681throw), AbstractC16653e.license(1437092090, new C13815e(c4271e), c13770e2), null, 0.0f, null, purchase, null, null, c13770e2, 390, 440);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
