package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10012e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f19764e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C11802e f19765e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f19766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10012e(C11802e c11802e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f19764e = i;
        this.f19765e = c11802e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f19764e) {
            case 0:
                return new C10012e(this.f19765e, interfaceC5083e, 0);
            default:
                return new C10012e(this.f19765e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f19764e) {
            case 0:
                return ((C10012e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C10012e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f19764e) {
            case 0:
                int i = this.f19766e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    Log.d("CXCP", "Cancelling CameraPipe root Job...");
                    InterfaceC10500e interfaceC10500e = this.f19765e.ad;
                    this.f19766e = 1;
                    Object purchase = AbstractC6629e.purchase(interfaceC10500e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (purchase == enumC2821e) {
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
                int i2 = this.f19766e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C10012e c10012e = new C10012e(this.f19765e, null, 0);
                this.f19766e = 1;
                Object mopub = AbstractC8306e.mopub(3000L, c10012e, this);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                return mopub == enumC2821e2 ? enumC2821e2 : mopub;
        }
    }
}
