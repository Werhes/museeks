package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٝؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8074e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f16375e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f16376e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13119e f16377e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6512e f16378e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f16379e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f16380e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8074e(C13119e c13119e, InterfaceC12864e interfaceC12864e, InterfaceC6512e interfaceC6512e, Function1 function1, C2892e c2892e, int i) {
        super(2);
        this.f16377e = c13119e;
        this.f16376e = interfaceC12864e;
        this.f16378e = interfaceC6512e;
        this.f16375e = function1;
        this.f16380e = c2892e;
        this.f16379e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC9180e.ad(this.f16377e, this.f16376e, this.f16378e, this.f16375e, this.f16380e, (C13770e) obj, AbstractC5190e.advert(this.f16379e | 1));
        return Unit.INSTANCE;
    }
}
