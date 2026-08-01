package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۡٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14308e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28303e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f28304e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14308e(AudioTrack audioTrack, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f28303e = i;
        this.f28304e = audioTrack;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f28303e) {
            case 0:
                return new C14308e(this.f28304e, interfaceC5083e, 0);
            case 1:
                return new C14308e(this.f28304e, interfaceC5083e, 1);
            case 2:
                return new C14308e(this.f28304e, interfaceC5083e, 2);
            default:
                return new C14308e(this.f28304e, interfaceC5083e, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f28303e) {
            case 0:
                return ((C14308e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C14308e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C14308e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C14308e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f28303e;
        int i2 = 8;
        InterfaceC5083e interfaceC5083e = null;
        AudioTrack audioTrack = this.f28304e;
        Object obj2 = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i3 = this.f28305e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f28305e = 1;
                    C15420e c15420e = AbstractC6731e.ad;
                    Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C7195e(audioTrack, interfaceC5083e, 26), this);
                    if (advert != obj2) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f28305e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C9187e c9187e = C9187e.ad;
                this.f28305e = 1;
                Object vip = c9187e.vip(audioTrack, this);
                return vip == obj2 ? obj2 : vip;
            case 2:
                int i5 = this.f28305e;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C4680e c4680e = C4680e.ad;
                this.f28305e = 1;
                Object appmetrica = AbstractC9743e.appmetrica(new C14164e(audioTrack, interfaceC5083e, i2), this);
                return appmetrica == obj2 ? obj2 : appmetrica;
            default:
                int i6 = this.f28305e;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                    return obj;
                }
                AbstractC2003e.purchase(obj);
                C4680e c4680e2 = C4680e.ad;
                this.f28305e = 1;
                Object appmetrica2 = AbstractC9743e.appmetrica(new C14164e(audioTrack, interfaceC5083e, i2), this);
                return appmetrica2 == obj2 ? obj2 : appmetrica2;
        }
    }
}
