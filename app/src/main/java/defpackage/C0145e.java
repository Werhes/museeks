package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1377e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C4837e f1378e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f1379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0145e(C4837e c4837e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f1377e = i;
        this.f1378e = c4837e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f1377e) {
            case 0:
                return new C0145e(this.f1378e, interfaceC5083e, 0);
            default:
                return new C0145e(this.f1378e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f1377e) {
            case 0:
                return ((C0145e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0145e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f1377e) {
            case 0:
                int i = this.f1379e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f1379e = 1;
                    Object ad = this.f1378e.ad(this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (ad == enumC2821e) {
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
                int i2 = this.f1379e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C4837e c4837e = this.f1378e;
                    if (((Boolean) c4837e.yandex.startapp()).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    this.f1379e = 1;
                    Object ad2 = c4837e.ad(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (ad2 == enumC2821e2) {
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
