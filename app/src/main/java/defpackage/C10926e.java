package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10926e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f21641e;

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new AbstractC7185e(2, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10926e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f21641e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C8221e c8221e = VKXApplication.f36536e;
            if (c8221e == null) {
                c8221e = null;
            }
            this.f21641e = 1;
            Object smaato = c8221e.smaato(this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (smaato == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        VKXApplication vKXApplication = VKXApplication.f36528e;
        return AbstractC6232e.billing(C1175e.ad, vKXApplication != null ? vKXApplication : null);
    }
}
