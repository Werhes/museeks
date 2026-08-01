package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5196e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10620e f11107e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11108e;

    public /* synthetic */ C5196e(C10620e c10620e, int i) {
        this.f11108e = i;
        this.f11107e = c10620e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f11108e) {
            case 0:
                InterfaceC10799e interfaceC10799e = (InterfaceC10799e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(interfaceC10799e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    String str = this.f11107e.vip;
                    InterfaceC12864e mopub = AbstractC12220e.mopub(interfaceC10799e.ad(C0115e.f1276e, 1.0f, true), 16);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(str, mopub, ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.yandex, c13770e, 0, 0, 131064);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC10799e interfaceC10799e2 = (InterfaceC10799e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e2.purchase(interfaceC10799e2) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    String str2 = this.f11107e.vip;
                    InterfaceC12864e mopub2 = AbstractC12220e.mopub(interfaceC10799e2.ad(C0115e.f1276e, 1.0f, true), 16);
                    C15492e c15492e2 = AbstractC11785e.ad;
                    AbstractC14489e.vip(str2, mopub2, ((C7019e) c13770e2.adcel(c15492e2)).ad.admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e2)).vip.yandex, c13770e2, 0, 0, 131064);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
