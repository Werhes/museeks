package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3714e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f8299e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C1925e f8300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3714e(C1925e c1925e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f8299e = i;
        this.f8300e = c1925e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f8299e) {
            case 0:
                return new C3714e(this.f8300e, interfaceC5083e, 0);
            default:
                return new C3714e(this.f8300e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f8299e) {
            case 0:
                return ((C3714e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C3714e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f8299e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C1925e c1925e = this.f8300e;
                AbstractC5336e.purchase(c1925e.appmetrica, null, 0, new C1732e(c1925e, null, 2), 3);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                C1925e c1925e2 = this.f8300e;
                AbstractC5336e.purchase(c1925e2.appmetrica, null, 0, new C1732e(c1925e2, null, 2), 3);
                return Unit.INSTANCE;
        }
    }
}
