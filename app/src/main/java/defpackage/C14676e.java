package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14676e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f28922e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ float f28923e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f28924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14676e(C15096e c15096e, float f, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f28924e = c15096e;
        this.f28923e = f;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C14676e c14676e = new C14676e(this.f28924e, this.f28923e, interfaceC5083e);
        c14676e.f28922e = obj;
        return c14676e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C14676e) advert((InterfaceC5083e) obj2, (InterfaceC1719e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        this.f28924e.f29883e = ((InterfaceC1719e) this.f28922e).ad(this.f28923e);
        return Unit.INSTANCE;
    }
}
