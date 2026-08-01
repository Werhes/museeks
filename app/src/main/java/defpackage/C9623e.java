package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٞؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9623e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19093e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19094e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f19095e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19096e;

    public /* synthetic */ C9623e(int i, Object obj, boolean z, boolean z2) {
        this.f19096e = i;
        this.f19095e = obj;
        this.f19094e = z;
        this.f19093e = z2;
    }

    public /* synthetic */ C9623e(boolean z, boolean z2, C2892e c2892e, int i) {
        this.f19096e = 2;
        this.f19094e = z;
        this.f19093e = z2;
        this.f19095e = c2892e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19096e;
        int i2 = 2;
        Object obj3 = this.f19095e;
        boolean z = this.f19093e;
        boolean z2 = this.f19094e;
        switch (i) {
            case 0:
                C17085e c17085e = (C17085e) obj3;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C0629e c0629e = new C0629e(new C12781e(0, 12, InterfaceC16132e.class, AbstractC3145e.ad(c17085e.ad(z2, false, z), AbstractC11008e.metrica(c13770e, 5), null, null, c13770e, 0, 12), "value", "getValue()Ljava/lang/Object;"));
                    C1299e c1299e = C1299e.ad;
                    InterfaceC16154e ad = AbstractC8949e.ad(c13770e, AbstractC17572e.vip);
                    float f = AbstractC2754e.ad;
                    AbstractC17074e.ad(AbstractC5750e.license(C0115e.f1276e, new C6538e(ad, c0629e, 21)), c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                return new C6571e(AbstractC11750e.ad(new C18084e(i2, (C12729e) obj, z2, z)), (EnumC3856e) ((C6656e) ((C13440e) obj3).ad.billing).getValue());
            default:
                ((Integer) obj2).getClass();
                AbstractC8230e.ad(z2, z, (C2892e) obj3, (C13770e) obj, AbstractC5190e.advert(385));
                return Unit.INSTANCE;
        }
    }
}
