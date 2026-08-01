package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۛۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0564e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f2738e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14875e f2739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0564e(C14875e c14875e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f2738e = i;
        this.f2739e = c14875e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f2738e) {
            case 0:
                return new C0564e(this.f2739e, interfaceC5083e, 0);
            default:
                return new C0564e(this.f2739e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f2738e) {
            case 0:
                return ((C0564e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0564e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f2738e;
        C14875e c14875e = this.f2739e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                int i2 = C14875e.f29463e;
                C15420e c15420e = AbstractC6731e.ad;
                AbstractC5336e.purchase(c14875e, ExecutorC3603e.f8134e, 0, new C6626e(c14875e, null, 0), 2);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                c14875e.purchase();
                return Unit.INSTANCE;
        }
    }
}
