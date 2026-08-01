package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f3644e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15036e f3645e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f3646e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100e(InterfaceC12864e interfaceC12864e, C15036e c15036e, boolean z, Function1 function1, int i) {
        super(2);
        this.f3646e = interfaceC12864e;
        this.f3645e = c15036e;
        this.f3647e = z;
        this.f3644e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        Function1 function1 = this.f3644e;
        AbstractC2803e.ad(this.f3646e, this.f3645e, this.f3647e, function1, (C13770e) obj, 391);
        return Unit.INSTANCE;
    }
}
