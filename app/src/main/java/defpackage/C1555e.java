package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1555e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f4430e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C14194e f4431e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Csynchronized f4432e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC17732e f4433e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C16317e f4434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1555e(C16317e c16317e, AbstractC17732e abstractC17732e, C14194e c14194e, Csynchronized csynchronized, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f4434e = c16317e;
        this.f4433e = abstractC17732e;
        this.f4431e = c14194e;
        this.f4432e = csynchronized;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C1555e c1555e = new C1555e(this.f4434e, this.f4433e, this.f4431e, this.f4432e, interfaceC5083e);
        c1555e.f4430e = obj;
        return c1555e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1555e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f4430e;
        C16317e c16317e = this.f4434e;
        InterfaceC5083e interfaceC5083e = null;
        AbstractC5336e.purchase(interfaceC18435e, null, 0, new C14869e(c16317e, this.f4433e, this.f4431e, interfaceC5083e, 16), 3);
        return AbstractC5336e.purchase(interfaceC18435e, null, 0, new C1853e(c16317e, this.f4432e, interfaceC5083e, 10), 3);
    }
}
