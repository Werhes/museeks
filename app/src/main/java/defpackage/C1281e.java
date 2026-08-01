package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f3991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1281e(AbstractC15876e abstractC15876e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3991e = abstractC15876e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C1281e(this.f3991e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1281e) advert((InterfaceC5083e) obj2, (C11383e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        AbstractC15876e abstractC15876e = this.f3991e;
        if (abstractC15876e.mo447const().mo774e() instanceof C4227e) {
            VKXApplication.f36529e.postDelayed(new RunnableC2783e(13, abstractC15876e), 1000L);
        }
        return Unit.INSTANCE;
    }
}
