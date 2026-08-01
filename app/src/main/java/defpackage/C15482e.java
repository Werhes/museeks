package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15482e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30574e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C2347e f30575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15482e(C2347e c2347e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f30574e = i;
        this.f30575e = c2347e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f30574e) {
            case 0:
                return new C15482e(this.f30575e, interfaceC5083e, 0);
            default:
                return new C15482e(this.f30575e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f30574e) {
            case 0:
                return ((C15482e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C15482e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f30574e;
        C2347e c2347e = this.f30575e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                c2347e.purchase();
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                int i2 = C2347e.f5874e;
                InterfaceC15632e interfaceC15632e = (InterfaceC15632e) c2347e.f5875e.getValue();
                int i3 = AbstractC7603e.ad[c2347e.firebase().ordinal()];
                c2347e.f5879e.setValue((i3 == 1 && (interfaceC15632e instanceof C12281e)) ? new C10705e(((C12281e) interfaceC15632e).ad) : i3 == 2 ? C18020e.ad : C5510e.ad);
                return Unit.INSTANCE;
        }
    }
}
