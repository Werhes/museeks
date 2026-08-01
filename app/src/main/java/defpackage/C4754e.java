package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4754e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10167e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C14307e f10168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4754e(C14307e c14307e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f10167e = i;
        this.f10168e = c14307e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f10167e) {
            case 0:
                return new C4754e(this.f10168e, interfaceC5083e, 0);
            case 1:
                return new C4754e(this.f10168e, interfaceC5083e, 1);
            case 2:
                return new C4754e(this.f10168e, interfaceC5083e, 2);
            case 3:
                return new C4754e(this.f10168e, interfaceC5083e, 3);
            case 4:
                return new C4754e(this.f10168e, interfaceC5083e, 4);
            case 5:
                return new C4754e(this.f10168e, interfaceC5083e, 5);
            case 6:
                return new C4754e(this.f10168e, interfaceC5083e, 6);
            default:
                return new C4754e(this.f10168e, interfaceC5083e, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f10167e) {
            case 0:
                return ((C4754e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C4754e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C4754e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C4754e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C4754e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C4754e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C4754e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4754e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f10167e) {
            case 0:
                AbstractC2003e.purchase(obj);
                this.f10168e.metrica();
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                this.f10168e.license();
                return Unit.INSTANCE;
            case 2:
                AbstractC2003e.purchase(obj);
                this.f10168e.license();
                return Unit.INSTANCE;
            case 3:
                AbstractC2003e.purchase(obj);
                this.f10168e.metrica();
                return Unit.INSTANCE;
            case 4:
                AbstractC2003e.purchase(obj);
                this.f10168e.license();
                return Unit.INSTANCE;
            case 5:
                AbstractC2003e.purchase(obj);
                this.f10168e.license();
                return Unit.INSTANCE;
            case 6:
                AbstractC2003e.purchase(obj);
                this.f10168e.metrica();
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                this.f10168e.license();
                return Unit.INSTANCE;
        }
    }
}
