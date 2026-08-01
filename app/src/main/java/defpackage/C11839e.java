package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11839e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16330e f23749e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23750e;

    public /* synthetic */ C11839e(C16330e c16330e, int i) {
        this.f23750e = i;
        this.f23749e = c16330e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String isVip;
        String isVip2;
        switch (this.f23750e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    C16330e c16330e = this.f23749e;
                    if (c16330e.purchase() > 0) {
                        c13770e.m3676strictfp(-747634571);
                        c13770e.Signature(false);
                        isVip = c16330e.purchase() + "...";
                    } else {
                        isVip = AbstractC4653e.isVip(c13770e, -747549321, R.string.vkx_hold_on_act, c13770e, false);
                    }
                    AbstractC14489e.vip(isVip, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C16330e c16330e2 = this.f23749e;
                    if (c16330e2.purchase() > 0) {
                        c13770e2.m3676strictfp(1087176465);
                        c13770e2.Signature(false);
                        isVip2 = c16330e2.purchase() + "...";
                    } else {
                        isVip2 = AbstractC4653e.isVip(c13770e2, 1087261715, R.string.vkx_hold_on_act, c13770e2, false);
                    }
                    AbstractC14489e.vip(isVip2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
