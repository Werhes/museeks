package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16036e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f31582e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f31583e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31584e;

    public /* synthetic */ C16036e(int i, boolean z, boolean z2) {
        this.f31584e = i;
        this.f31583e = z;
        this.f31582e = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31584e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC15710e.vip(this.f31583e, this.f31582e, null, 60, c13770e, 3072, 4);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c13770e2.m3659default();
                } else if (this.f31583e) {
                    c13770e2.m3676strictfp(-2054547350);
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_lock_outline_16, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                    c13770e2.Signature(false);
                } else {
                    if (this.f31582e) {
                        c13770e2.m3676strictfp(-2054417708);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                    } else {
                        c13770e2.m3676strictfp(-2064578919);
                    }
                    c13770e2.Signature(false);
                }
                return Unit.INSTANCE;
        }
    }
}
