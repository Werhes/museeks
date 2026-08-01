package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6397e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f13253e = 1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f13254e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f13255e;

    public /* synthetic */ C6397e(int i, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6397e(C7576e c7576e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f13254e = c7576e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f13253e) {
            case 0:
                return new C6397e((C7576e) this.f13254e, (InterfaceC5083e) obj3).loadAd(Unit.INSTANCE);
            default:
                ((Boolean) obj2).getClass();
                C6397e c6397e = new C6397e(3, (InterfaceC5083e) obj3);
                c6397e.f13254e = (InterfaceC3447e) obj;
                return c6397e.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f13253e) {
            case 0:
                int i = this.f13255e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C7576e c7576e = (C7576e) this.f13254e;
                    this.f13255e = 1;
                    Object metrica = C7576e.metrica(c7576e, this);
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
                InterfaceC3447e interfaceC3447e = (InterfaceC3447e) this.f13254e;
                int i2 = this.f13255e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                this.f13254e = null;
                this.f13255e = 1;
                Object appmetrica = interfaceC3447e.appmetrica(this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return appmetrica == enumC2821e2 ? enumC2821e2 : appmetrica;
        }
    }
}
