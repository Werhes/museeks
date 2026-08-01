package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1215e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f1216e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0063e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f1215e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f1215e) {
            case 0:
                return ((C0063e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0063e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f1215e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f1216e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C5981e c5981e = AbstractC15448e.ad;
                    this.f1216e = 1;
                    if (AbstractC15448e.ad(C4315e.ad, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f1216e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C5981e c5981e2 = AbstractC15448e.ad;
                    this.f1216e = 1;
                    if (AbstractC15448e.ad(C18269e.ad, this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f1215e) {
            case 0:
                return new C0063e(1, 0, interfaceC5083e);
            default:
                return new C0063e(1, 1, interfaceC5083e);
        }
    }
}
