package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15916e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f31360e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ long f31361e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31362e;

    public /* synthetic */ C15916e(long j, Function2 function2, int i) {
        this.f31362e = 3;
        this.f31361e = j;
        this.f31360e = function2;
    }

    public /* synthetic */ C15916e(long j, Function2 function2, int i, byte b) {
        this.f31362e = i;
        this.f31361e = j;
        this.f31360e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        Integer num = (Integer) obj2;
        switch (this.f31362e) {
            case 0:
                int intValue = num.intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC1101e.ad(AbstractC8703e.loadAd(this.f31361e, AbstractC0608e.ad), this.f31360e, c13770e, 8);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                int intValue2 = num.intValue();
                if (c13770e.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC2754e.license(this.f31361e, this.f31360e, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                int intValue3 = num.intValue();
                if (c13770e.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC2754e.license(this.f31361e, this.f31360e, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                AbstractC2754e.license(this.f31361e, this.f31360e, c13770e, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
