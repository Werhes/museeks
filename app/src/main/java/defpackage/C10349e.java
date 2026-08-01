package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10349e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f20426e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ EnumC11342e f20427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10349e(EnumC11342e enumC11342e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f20427e = enumC11342e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C10349e(this.f20427e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10349e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f20426e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            this.f20426e = 1;
            Object license = C16129e.license(vKXApplication, this.f20427e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (license == enumC2821e) {
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
