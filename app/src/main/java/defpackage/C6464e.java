package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6464e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f13369e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f13370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6464e(int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f13370e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C6464e(this.f13370e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6464e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f13369e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C11328e c11328e = VKXApplication.f36535e;
            InterfaceC5083e interfaceC5083e = null;
            if (c11328e == null) {
                c11328e = null;
            }
            C16452e c16452e = (C16452e) c11328e.f22771e;
            this.f13369e = 1;
            Object vip = ((InterfaceC8018e) c16452e.f32285e).vip(new C15338e(this.f13370e, interfaceC5083e, 13, false), this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (vip == enumC2821e) {
                return enumC2821e;
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
