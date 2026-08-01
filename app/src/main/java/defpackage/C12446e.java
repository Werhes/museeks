package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12446e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f24911e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2869e f24912e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f24913e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ float f24914e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f24915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12446e(float f, InterfaceC2869e interfaceC2869e, C15096e c15096e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f24914e = f;
        this.f24912e = interfaceC2869e;
        this.f24913e = c15096e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C12446e c12446e = new C12446e(this.f24914e, this.f24912e, this.f24913e, interfaceC5083e);
        c12446e.f24915e = obj;
        return c12446e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12446e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f24911e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C15709e c15709e = new C15709e(this.f24913e, (InterfaceC1719e) this.f24915e, 12);
            this.f24911e = 1;
            Object license = AbstractC7844e.license(0.0f, this.f24914e, this.f24912e, c15709e, this, 4);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (license == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }
}
