package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7154e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f14645e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1251e f14646e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14647e;

    public /* synthetic */ C7154e(C1251e c1251e, InterfaceC12864e interfaceC12864e, int i, int i2) {
        this.f14647e = i2;
        this.f14646e = c1251e;
        this.f14645e = interfaceC12864e;
    }

    public /* synthetic */ C7154e(InterfaceC12864e interfaceC12864e, C1251e c1251e) {
        this.f14647e = 0;
        this.f14645e = interfaceC12864e;
        this.f14646e = c1251e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f14647e;
        InterfaceC12864e interfaceC12864e = this.f14645e;
        C1251e c1251e = this.f14646e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C9630e c9630e = AbstractC6271e.ad;
                    AbstractC11160e.metrica(this.f14645e, null, AbstractC6271e.ad(((C6032e) c13770e.adcel(AbstractC12491e.ad)).adcel(), 0L, c13770e, 0, 2), AbstractC16653e.license(-1278699168, new C6599e(3, c1251e), c13770e), c13770e, 54);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                c1251e.ad(interfaceC12864e, (C13770e) obj, AbstractC5190e.advert(7));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                c1251e.yandex(interfaceC12864e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                c1251e.billing(interfaceC12864e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
