package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9741e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f19261e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C9669e f19262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9741e(C9669e c9669e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f19262e = c9669e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C9741e(this.f19262e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9741e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f19261e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C11328e c11328e = VKXApplication.f36535e;
            if (c11328e == null) {
                c11328e = null;
            }
            C6325e c6325e = (C6325e) c11328e.f22772e;
            EnumC11700e enumC11700e = EnumC11700e.DARK;
            this.f19261e = 1;
            Object vip = ((InterfaceC8018e) c6325e.f13170e).vip(new C8231e(enumC11700e, null, 6), this);
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
        this.f19262e.m2624import(false);
        return Unit.INSTANCE;
    }
}
