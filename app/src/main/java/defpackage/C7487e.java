package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ۟ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7487e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15256e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f15257e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15533e f15258e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f15259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7487e(C15533e c15533e, InterfaceC12864e interfaceC12864e, Function2 function2, int i) {
        super(2);
        this.f15258e = c15533e;
        this.f15257e = interfaceC12864e;
        this.f15259e = function2;
        this.f15256e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int advert = AbstractC5190e.advert(this.f15256e | 1);
        AbstractC9464e.license(this.f15258e, this.f15257e, this.f15259e, (C13770e) obj, advert);
        return Unit.INSTANCE;
    }
}
