package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4163e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9178e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC13742e f9179e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C6540e f9180e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f9181e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4163e(InterfaceC13742e interfaceC13742e, C6540e c6540e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f9178e = i;
        this.f9179e = interfaceC13742e;
        this.f9180e = c6540e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f9178e) {
            case 0:
                C4163e c4163e = new C4163e(this.f9179e, this.f9180e, interfaceC5083e, 0);
                c4163e.f9181e = obj;
                return c4163e;
            default:
                C4163e c4163e2 = new C4163e(this.f9179e, this.f9180e, interfaceC5083e, 1);
                c4163e2.f9181e = obj;
                return c4163e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f9178e) {
            case 0:
                return ((C4163e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4163e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f9178e) {
            case 0:
                int i = this.f9182e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C13904e c13904e = new C13904e((InterfaceC18435e) this.f9181e, this.f9180e, null);
                    this.f9182e = 1;
                    Object metrica = AbstractC13406e.metrica(this.f9179e, c13904e, this);
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
                int i2 = this.f9182e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C18042e c18042e = new C18042e((InterfaceC18435e) this.f9181e, this.f9180e, (InterfaceC5083e) null, 0);
                    this.f9182e = 1;
                    Object m1364e = ((C3427e) this.f9179e).m1364e(c18042e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (m1364e == enumC2821e2) {
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
