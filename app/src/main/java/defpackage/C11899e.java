package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11899e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f23838e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f23839e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f23840e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11899e(InterfaceC3314e interfaceC3314e, InterfaceC3314e interfaceC3314e2, int i) {
        super(1);
        this.f23839e = i;
        this.f23838e = interfaceC3314e;
        this.f23840e = interfaceC3314e2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23839e) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                InterfaceC3314e interfaceC3314e = this.f23838e;
                interfaceC3314e.setValue(C15036e.ad((C15036e) interfaceC3314e.getValue(), 0.0f, 0.0f, 0.0f, floatValue, 7));
                ((Function1) this.f23840e.getValue()).invoke(interfaceC3314e.getValue());
                return Unit.INSTANCE;
            case 1:
                float floatValue2 = ((Number) obj).floatValue();
                InterfaceC3314e interfaceC3314e2 = this.f23838e;
                interfaceC3314e2.setValue(C15036e.ad((C15036e) interfaceC3314e2.getValue(), floatValue2, 0.0f, 0.0f, 0.0f, 14));
                ((Function1) this.f23840e.getValue()).invoke(interfaceC3314e2.getValue());
                return Unit.INSTANCE;
            default:
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) obj;
                this.f23838e.setValue(new C2152e(interfaceC0043e.mo211this(0L)));
                this.f23840e.setValue(new C12729e(interfaceC0043e.advert()));
                return Unit.INSTANCE;
        }
    }
}
