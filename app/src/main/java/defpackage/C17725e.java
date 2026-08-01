package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17725e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13870e f34757e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f34758e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ long f34759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17725e(AbstractC13870e abstractC13870e, long j, int i) {
        super(1);
        this.f34758e = i;
        this.f34757e = abstractC13870e;
        this.f34759e = j;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v15, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function12;
        long j;
        int ordinal;
        long j2;
        switch (this.f34758e) {
            case 0:
                C3059e c3059e = (C3059e) this.f34757e;
                int ordinal2 = ((EnumC10292e) obj).ordinal();
                long j3 = this.f34759e;
                if (ordinal2 == 0) {
                    C4980e c4980e = c3059e.f7124e.ad.metrica;
                    if (c4980e != null && (function1 = c4980e.vip) != null) {
                        j3 = ((C12729e) function1.invoke(new C12729e(j3))).ad;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new C14803e(10);
                    }
                    C4980e c4980e2 = c3059e.f7113e.ad.metrica;
                    if (c4980e2 != null && (function12 = c4980e2.vip) != null) {
                        j3 = ((C12729e) function12.invoke(new C12729e(j3))).ad;
                    }
                }
                return new C12729e(j3);
            case 1:
                EnumC10292e enumC10292e = (EnumC10292e) obj;
                C3059e c3059e2 = (C3059e) this.f34757e;
                if (c3059e2.f7119e != null && c3059e2.m1229e() != null && !AbstractC7890e.billing(c3059e2.f7119e, c3059e2.m1229e()) && (ordinal = enumC10292e.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        throw new C14803e(10);
                    }
                    C4980e c4980e3 = c3059e2.f7113e.ad.metrica;
                    if (c4980e3 != null) {
                        Function1 function13 = c4980e3.vip;
                        long j4 = this.f34759e;
                        long j5 = ((C12729e) function13.invoke(new C12729e(j4))).ad;
                        InterfaceC8079e m1229e = c3059e2.m1229e();
                        EnumC7792e enumC7792e = EnumC7792e.f15794e;
                        j = C11490e.metrica(m1229e.ad(j4, j5, enumC7792e), c3059e2.f7119e.ad(j4, j5, enumC7792e));
                        return new C11490e(j);
                    }
                }
                j = 0;
                return new C11490e(j);
            case 2:
                EnumC10292e enumC10292e2 = (EnumC10292e) obj;
                C3059e c3059e3 = (C3059e) this.f34757e;
                C1223e c1223e = c3059e3.f7124e.ad.vip;
                long j6 = this.f34759e;
                long j7 = 0;
                long j8 = c1223e != null ? ((C11490e) c1223e.ad.invoke(new C12729e(j6))).ad : 0L;
                C1223e c1223e2 = c3059e3.f7113e.ad.vip;
                long j9 = c1223e2 != null ? ((C11490e) c1223e2.ad.invoke(new C12729e(j6))).ad : 0L;
                int ordinal3 = enumC10292e2.ordinal();
                if (ordinal3 == 0) {
                    j7 = j8;
                } else if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        throw new C14803e(10);
                    }
                    j7 = j9;
                }
                return new C11490e(j7);
            default:
                C5760e c5760e = (C5760e) this.f34757e;
                if (AbstractC7890e.billing(obj, c5760e.f12187e.ad())) {
                    j2 = C12729e.vip(c5760e.f12190e, AbstractC7572e.ad) ? this.f34759e : c5760e.f12190e;
                } else {
                    InterfaceC16132e interfaceC16132e = (InterfaceC16132e) c5760e.f12187e.license.billing(obj);
                    j2 = interfaceC16132e != null ? ((C12729e) interfaceC16132e.getValue()).ad : 0L;
                }
                return new C12729e(j2);
        }
    }
}
