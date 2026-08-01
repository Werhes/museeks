package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11581e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f23258e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f23259e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f23260e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23261e = 0;

    public /* synthetic */ C11581e(C2892e c2892e, C2892e c2892e2, Function2 function2) {
        this.f23259e = c2892e;
        this.f23258e = c2892e2;
        this.f23260e = function2;
    }

    public /* synthetic */ C11581e(C2892e c2892e, C2892e c2892e2, Function2 function2, int i) {
        this.f23259e = c2892e;
        this.f23258e = c2892e2;
        this.f23260e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        Integer num = (Integer) obj2;
        switch (this.f23261e) {
            case 0:
                int intValue = num.intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC5190e.vip(this.f23259e, this.f23258e, this.f23260e, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                AbstractC5190e.vip(this.f23259e, this.f23258e, this.f23260e, c13770e, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
