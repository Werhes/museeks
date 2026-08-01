package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8663e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17505e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7135e f17506e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f17507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8663e(C7135e c7135e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f17505e = i;
        this.f17506e = c7135e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f17505e) {
            case 0:
                return new C8663e(this.f17506e, interfaceC5083e, 0);
            default:
                return new C8663e(this.f17506e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f17505e) {
            case 0:
                return ((C8663e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C8663e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f17505e) {
            case 0:
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                int i = this.f17507e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f17506e.vip();
                    C7135e c7135e = this.f17506e;
                    this.f17507e = 1;
                    C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(this));
                    c13578e.tapsense();
                    synchronized (c7135e.f14611e) {
                        c7135e.f14608e = 20;
                        c7135e.f14613e = c13578e;
                        Unit unit = Unit.INSTANCE;
                    }
                    c13578e.inmobi(new C17877e(16, c7135e));
                    if (c13578e.signatures() == enumC2821e) {
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
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                int i2 = this.f17507e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C7135e c7135e2 = this.f17506e;
                    this.f17507e = 1;
                    c7135e2.getClass();
                    if (AbstractC8306e.mopub(5000L, new C8663e(c7135e2, null, 0), this) == enumC2821e2) {
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
