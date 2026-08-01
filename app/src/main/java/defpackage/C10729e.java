package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10729e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f21130e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f21131e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f21132e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C15036e f21133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10729e(InterfaceC12864e interfaceC12864e, C15036e c15036e, Function1 function1, int i, int i2) {
        super(2);
        this.f21132e = i2;
        this.f21131e = interfaceC12864e;
        this.f21133e = c15036e;
        this.f21130e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f21132e;
        C13770e c13770e = (C13770e) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC10589e.ad(this.f21131e, this.f21133e, this.f21130e, c13770e, 7);
                return Unit.INSTANCE;
            default:
                AbstractC18489e.vip(this.f21131e, this.f21133e, this.f21130e, c13770e, 7);
                return Unit.INSTANCE;
        }
    }
}
