package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12253e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24585e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ List f24586e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC4393e f24587e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Throwable f24588e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f24589e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Throwable f24590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12253e(int i, InterfaceC5083e interfaceC5083e, List list) {
        super(3, interfaceC5083e);
        this.f24585e = i;
        this.f24586e = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC4393e interfaceC4393e = (InterfaceC4393e) obj;
        Throwable th = (Throwable) obj2;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
        switch (this.f24585e) {
            case 0:
                C12253e c12253e = new C12253e(0, interfaceC5083e, this.f24586e);
                c12253e.f24587e = interfaceC4393e;
                c12253e.f24588e = th;
                return c12253e.loadAd(Unit.INSTANCE);
            default:
                C12253e c12253e2 = new C12253e(1, interfaceC5083e, this.f24586e);
                c12253e2.f24587e = interfaceC4393e;
                c12253e2.f24588e = th;
                return c12253e2.loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f24585e) {
            case 0:
                InterfaceC4393e interfaceC4393e = this.f24587e;
                Throwable th = this.f24588e;
                int i = this.f24589e;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = this.f24590e;
                    AbstractC2003e.purchase(obj);
                    return th2;
                }
                AbstractC2003e.purchase(obj);
                Throwable purchase = AbstractC9262e.purchase(th);
                this.f24587e = null;
                this.f24588e = null;
                this.f24590e = purchase;
                this.f24589e = 1;
                Unit ad = AbstractC14421e.ad(this.f24586e, purchase, interfaceC4393e, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                return ad == enumC2821e ? enumC2821e : purchase;
            default:
                InterfaceC4393e interfaceC4393e2 = this.f24587e;
                Throwable th3 = this.f24588e;
                int i2 = this.f24589e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th4 = this.f24590e;
                    AbstractC2003e.purchase(obj);
                    return th4;
                }
                AbstractC2003e.purchase(obj);
                Throwable purchase2 = AbstractC9262e.purchase(th3);
                this.f24587e = null;
                this.f24588e = null;
                this.f24590e = purchase2;
                this.f24589e = 1;
                Unit ad2 = AbstractC14421e.ad(this.f24586e, purchase2, interfaceC4393e2, this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return ad2 == enumC2821e2 ? enumC2821e2 : purchase2;
        }
    }
}
