package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4467e extends AbstractC16858e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f9673e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f9674e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f9675e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f9676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4467e(InterfaceC12864e interfaceC12864e, Function2 function2, int i, int i2) {
        super(2);
        this.f9675e = i2;
        this.f9674e = interfaceC12864e;
        this.f9673e = function2;
        this.f9676e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f9675e;
        C13770e c13770e = (C13770e) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC18275e.license(this.f9674e, this.f9673e, c13770e, AbstractC5190e.advert(this.f9676e | 1));
                return Unit.INSTANCE;
            default:
                AbstractC10576e.ad(AbstractC5190e.advert(this.f9676e | 1), (C2892e) this.f9673e, c13770e, this.f9674e);
                return Unit.INSTANCE;
        }
    }
}
