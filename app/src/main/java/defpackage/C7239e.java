package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7239e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f14788e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C5799e f14789e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f14790e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7239e(C5799e c5799e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f14788e = i;
        this.f14789e = c5799e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f14788e) {
            case 0:
                return new C7239e(this.f14789e, interfaceC5083e, 0);
            default:
                return new C7239e(this.f14789e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f14788e) {
            case 0:
                return ((C7239e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7239e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f14788e) {
            case 0:
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                int i = this.f14790e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C5241e c5241e = this.f14789e.f12247e;
                    C12040e c12040e = new C12040e(8);
                    synchronized (c5241e.ad) {
                        try {
                            if (!c5241e.billing) {
                                if (AbstractC9464e.smaato("CXCP")) {
                                    Log.d("CXCP", "Camera is removed, forcing state to CLOSED.");
                                }
                                c5241e.billing = true;
                                EnumC13278e enumC13278e = EnumC13278e.f26334e;
                                c5241e.appmetrica = enumC13278e;
                                c5241e.purchase = c12040e;
                                c5241e.metrica(enumC13278e, c12040e);
                                c5241e.license = null;
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    C10503e c10503e = this.f14789e.f12253e;
                    this.f14790e = 1;
                    if (c10503e.appmetrica(this) == enumC2821e) {
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
                C5799e c5799e = this.f14789e;
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                int i2 = this.f14790e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C10503e c10503e2 = c5799e.f12253e;
                    this.f14790e = 1;
                    if (c10503e2.appmetrica(this) == enumC2821e2) {
                        return enumC2821e2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                AbstractC9743e.license(c5799e.f12251e.ad, null);
                return Unit.INSTANCE;
        }
    }
}
