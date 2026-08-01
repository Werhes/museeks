package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5215e f5187e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5188e;

    public /* synthetic */ C1978e(C5215e c5215e, int i) {
        this.f5188e = i;
        this.f5187e = c5215e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5188e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, this.f5187e.vip), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C5215e c5215e = this.f5187e;
                    int i = c5215e.metrica;
                    String str = c5215e.license;
                    if (i != -1 || str.length() > 0) {
                        c13770e2.m3676strictfp(1073215183);
                        if (i != -1) {
                            str = AbstractC4653e.isVip(c13770e2, 1073302820, i, c13770e2, false);
                        } else {
                            c13770e2.m3676strictfp(1073409491);
                            c13770e2.Signature(false);
                        }
                        AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                        c13770e2.Signature(false);
                    } else {
                        c13770e2.m3676strictfp(1058073450);
                        c13770e2.Signature(false);
                    }
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C5215e c5215e2 = this.f5187e;
                    AbstractC5647e.vip(AbstractC12475e.metrica(c5215e2.ad, 0, c13770e3), AbstractC5297e.appmetrica(c13770e3, c5215e2.vip), null, 0L, c13770e3, 8, 12);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
