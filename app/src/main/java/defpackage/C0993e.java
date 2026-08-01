package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0993e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3059e f3437e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f3438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0993e(C3059e c3059e, int i) {
        super(1);
        this.f3438e = i;
        this.f3437e = c3059e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC6512e interfaceC6512e;
        InterfaceC6512e interfaceC6512e2;
        switch (this.f3438e) {
            case 0:
                InterfaceC16490e interfaceC16490e = (InterfaceC16490e) obj;
                EnumC10292e enumC10292e = EnumC10292e.f20311e;
                EnumC10292e enumC10292e2 = EnumC10292e.f20309e;
                boolean vip = interfaceC16490e.vip(enumC10292e, enumC10292e2);
                Object obj2 = null;
                C3059e c3059e = this.f3437e;
                if (vip) {
                    C4980e c4980e = c3059e.f7124e.ad.metrica;
                    if (c4980e != null) {
                        obj2 = c4980e.metrica;
                    }
                } else if (interfaceC16490e.vip(enumC10292e2, EnumC10292e.f20308e)) {
                    C4980e c4980e2 = c3059e.f7113e.ad.metrica;
                    if (c4980e2 != null) {
                        obj2 = c4980e2.metrica;
                    }
                } else {
                    obj2 = AbstractC15869e.license;
                }
                return obj2 == null ? AbstractC15869e.license : obj2;
            default:
                InterfaceC16490e interfaceC16490e2 = (InterfaceC16490e) obj;
                EnumC10292e enumC10292e3 = EnumC10292e.f20311e;
                EnumC10292e enumC10292e4 = EnumC10292e.f20309e;
                boolean vip2 = interfaceC16490e2.vip(enumC10292e3, enumC10292e4);
                C3059e c3059e2 = this.f3437e;
                if (vip2) {
                    C1223e c1223e = c3059e2.f7124e.ad.vip;
                    return (c1223e == null || (interfaceC6512e2 = c1223e.vip) == null) ? AbstractC15869e.metrica : interfaceC6512e2;
                }
                if (!interfaceC16490e2.vip(enumC10292e4, EnumC10292e.f20308e)) {
                    return AbstractC15869e.metrica;
                }
                C1223e c1223e2 = c3059e2.f7113e.ad.vip;
                return (c1223e2 == null || (interfaceC6512e = c1223e2.vip) == null) ? AbstractC15869e.metrica : interfaceC6512e;
        }
    }
}
