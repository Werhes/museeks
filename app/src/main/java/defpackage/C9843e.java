package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9843e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19433e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f19434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9843e(InterfaceC3314e interfaceC3314e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f19433e = i;
        this.f19434e = interfaceC3314e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f19433e) {
            case 0:
                return new C9843e(this.f19434e, interfaceC5083e, 0);
            default:
                return new C9843e(this.f19434e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f19433e) {
            case 0:
                return ((C9843e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9843e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f19433e) {
            case 0:
                AbstractC2003e.purchase(obj);
                this.f19434e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                this.f19434e.setValue(new C12130e());
                return Unit.INSTANCE;
        }
    }
}
