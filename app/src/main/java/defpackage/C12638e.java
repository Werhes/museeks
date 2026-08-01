package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٞۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12638e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f25355e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f25356e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25357e;

    public /* synthetic */ C12638e(C2892e c2892e, Function2 function2, int i) {
        this.f25357e = i;
        this.f25356e = c2892e;
        this.f25355e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25357e;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    float f = ((C15765e) c13770e.adcel(AbstractC7562e.metrica)).f31051e;
                    if (Float.isNaN(f)) {
                        f = 0;
                    }
                    float f2 = f - AbstractC10244e.license;
                    float f3 = AbstractC1981e.license;
                    C15765e c15765e = new C15765e(f3 - f2);
                    C15765e c15765e2 = new C15765e(0);
                    C15765e c15765e3 = new C15765e(f3);
                    if (c15765e2.compareTo(c15765e3) > 0) {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + c15765e3 + " is less than minimum " + c15765e2 + '.');
                    }
                    if (c15765e.compareTo(c15765e2) < 0) {
                        c15765e = c15765e2;
                    } else if (c15765e.compareTo(c15765e3) > 0) {
                        c15765e = c15765e3;
                    }
                    AbstractC1981e.vip(c15765e.f31051e, AbstractC16653e.license(-459506658, new C12638e(this.f25356e, this.f25355e, 1), c13770e), c13770e, 390);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    this.f25356e.invoke(c13770e, 0);
                    Function2 function2 = this.f25355e;
                    if (function2 == null) {
                        c13770e.m3676strictfp(-1102003461);
                    } else {
                        c13770e.m3676strictfp(795735494);
                        function2.invoke(c13770e, 0);
                    }
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
