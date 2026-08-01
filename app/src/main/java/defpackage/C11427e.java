package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؐؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11427e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f22965e;

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new AbstractC7185e(2, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C11427e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f22965e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C18046e c18046e = VKXApplication.f36532e;
            if (c18046e == null) {
                c18046e = null;
            }
            this.f22965e = 1;
            Object adcel = AbstractC2774e.adcel(c18046e.license, this);
            Object obj2 = EnumC2821e.f6782e;
            if (adcel != obj2) {
                adcel = Unit.INSTANCE;
            }
            if (adcel == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }
}
