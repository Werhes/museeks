package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13884e extends AbstractC16858e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13915e f27515e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12597e f27516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13884e(C12597e c12597e, C13915e c13915e) {
        super(4);
        this.f27516e = c12597e;
        this.f27515e = c13915e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        C12597e c12597e = this.f27516e;
        c12597e.f25320e.set(intValue, intValue2, intValue3, intValue4);
        c12597e.f25318e.startapp(c12597e.f25313e, this.f27515e.f27594e, c12597e.f25320e);
        return Unit.INSTANCE;
    }
}
