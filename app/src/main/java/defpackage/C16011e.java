package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16011e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f31535e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16049e f31536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16011e(AbstractC16049e abstractC16049e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f31536e = abstractC16049e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C16011e(this.f31536e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16011e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f31535e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            this.f31535e = 1;
            Object appmetrica = C16129e.appmetrica(vKXApplication, this.f31536e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (appmetrica == enumC2821e) {
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
