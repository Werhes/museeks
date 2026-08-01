package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9352e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f18618e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C2419e f18619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9352e(C2419e c2419e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f18618e = i;
        this.f18619e = c2419e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f18618e) {
            case 0:
                return new C9352e(this.f18619e, interfaceC5083e, 0);
            default:
                return new C9352e(this.f18619e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f18618e) {
            case 0:
                return ((C9352e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C9352e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f18618e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C10520e c10520e = (C10520e) ((InterfaceC0740e) this.f18619e.startapp.getValue());
                return new Integer(c10520e.vip.nativeGetCounterValue(c10520e.metrica));
            default:
                AbstractC2003e.purchase(obj);
                C10520e c10520e2 = (C10520e) ((InterfaceC0740e) this.f18619e.startapp.getValue());
                return new Integer(c10520e2.vip.nativeIncrementAndGetCounterValue(c10520e2.metrica));
        }
    }
}
