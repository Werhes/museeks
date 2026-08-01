package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13176e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26167e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractServiceC5057e f26168e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f26169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13176e(AbstractServiceC5057e abstractServiceC5057e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f26167e = i;
        this.f26168e = abstractServiceC5057e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f26167e) {
            case 0:
                return new C13176e(this.f26168e, interfaceC5083e, 0);
            default:
                return new C13176e(this.f26168e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f26167e) {
            case 0:
                return ((C13176e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C13176e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f26167e) {
            case 0:
                int i = this.f26169e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C14137e c14137e = this.f26168e.f10874e;
                    AbstractC3002e abstractC3002e = new AbstractC3002e("_synth_", "Do not show!", C13664e.f27089e);
                    this.f26169e = 1;
                    Object metrica = c14137e.metrica(this, abstractC3002e);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (metrica == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f26169e;
                boolean z = true;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    AbstractServiceC5057e abstractServiceC5057e = this.f26168e;
                    C5923e c5923e = new C5923e(abstractServiceC5057e.f10874e, z);
                    C5845e c5845e = new C5845e(3, abstractServiceC5057e);
                    this.f26169e = 1;
                    Object ad = c5923e.ad(c5845e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (ad == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
