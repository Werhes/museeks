package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۟ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9786e extends C7140e implements Function2 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f19335e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9786e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f19335e = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19335e) {
            case 0:
                ((C2892e) this.f14619e).ad((C13770e) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                C8933e c8933e = (C8933e) this.f14619e;
                boolean vip = c8933e.vip();
                C2616e c2616e = c8933e.purchase;
                float f = 0.0f;
                if (!vip) {
                    if (c8933e.ad() > c8933e.billing.purchase()) {
                        ((Function0) c8933e.vip.getValue()).invoke();
                    }
                    AbstractC5336e.purchase(c8933e.ad, null, 0, new C2415e(c8933e, 0.0f, null), 3);
                    if (c2616e.purchase() == 0.0f || floatValue < 0.0f) {
                        floatValue = 0.0f;
                    }
                    c2616e.startapp(0.0f);
                    f = floatValue;
                }
                return new Float(f);
            case 2:
                long j = ((C11422e) obj).ad;
                C10469e c10469e = (C10469e) this.f14619e;
                AbstractC5336e.purchase(c10469e.f20674e.metrica(), null, 0, new C9358e(c10469e, j, null, 2), 3);
                return Unit.INSTANCE;
            default:
                long j2 = ((C11422e) obj).ad;
                C10469e c10469e2 = (C10469e) this.f14619e;
                AbstractC5336e.purchase(c10469e2.f20674e.metrica(), null, 0, new C9358e(c10469e2, j2, null, 1), 3);
                return Unit.INSTANCE;
        }
    }
}
