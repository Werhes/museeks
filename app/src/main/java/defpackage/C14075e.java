package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14075e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f27825e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f27826e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f27827e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f27828e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27829e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f27830e;

    public /* synthetic */ C14075e(C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C2892e c2892e4, C2892e c2892e5) {
        this.f27827e = c2892e;
        this.f27826e = c2892e2;
        this.f27828e = c2892e3;
        this.f27825e = c2892e4;
        this.f27830e = c2892e5;
    }

    public /* synthetic */ C14075e(Function2 function2, Function2 function22, C2892e c2892e, Function2 function23, Function2 function24, int i) {
        this.f27827e = function2;
        this.f27826e = function22;
        this.f27828e = c2892e;
        this.f27825e = function23;
        this.f27830e = function24;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27829e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC16429e.vip(this.f27827e, this.f27826e, this.f27828e, this.f27825e, this.f27830e, c13770e, 384);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC16429e.vip(this.f27827e, this.f27826e, this.f27828e, this.f27825e, this.f27830e, (C13770e) obj, AbstractC5190e.advert(385));
                return Unit.INSTANCE;
        }
    }
}
