package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۥؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12868e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f25706e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ EnumC9603e f25707e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25708e;

    public /* synthetic */ C12868e(EnumC9603e enumC9603e, InterfaceC16132e interfaceC16132e, int i) {
        this.f25708e = i;
        this.f25707e = enumC9603e;
        this.f25706e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25708e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC5647e.ad(AbstractC3421e.billing(), null, AbstractC1376e.ad(C0115e.f1276e, ((EnumC9603e) this.f25706e.getValue()) == this.f25707e ? 1.0f : 0.0f), 0L, c13770e, 48, 8);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (((EnumC9603e) this.f25706e.getValue()) == this.f25707e) {
                        c13770e2.m3676strictfp(1208576388);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                    } else {
                        c13770e2.m3676strictfp(1184353732);
                    }
                    c13770e2.Signature(false);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
