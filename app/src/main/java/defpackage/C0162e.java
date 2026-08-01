package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f1391e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C0101e f1392e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C0101e f1393e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f1394e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f1395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0162e(PlaybackService playbackService, C0101e c0101e, C0101e c0101e2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f1391e = i;
        this.f1394e = playbackService;
        this.f1392e = c0101e;
        this.f1393e = c0101e2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f1391e) {
            case 0:
                return new C0162e(this.f1394e, this.f1392e, this.f1393e, interfaceC5083e, 0);
            default:
                return new C0162e(this.f1394e, this.f1392e, this.f1393e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f1391e) {
            case 0:
                return ((C0162e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0162e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f1391e) {
            case 0:
                int i = this.f1395e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C14260e c14260e = PlaybackService.advert().f15860e;
                    C14609e yandex = PlaybackService.advert().f15868e.yandex(new Integer(this.f1392e.vip));
                    long j = this.f1393e.purchase;
                    this.f1395e = 1;
                    Object appmetrica = c14260e.appmetrica(yandex, j, EnumC15342e.f30263e, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (appmetrica == enumC2821e) {
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
                int i2 = this.f1395e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C14260e c14260e2 = PlaybackService.advert().f15860e;
                    C11800e c11800e = PlaybackService.advert().f15868e;
                    C0101e c0101e = this.f1392e;
                    C14609e yandex2 = c11800e.yandex(new Integer(c0101e.vip));
                    C0101e c0101e2 = this.f1393e;
                    long j2 = c0101e2.purchase;
                    EnumC15342e enumC15342e = c0101e2.vip < c0101e.vip ? EnumC15342e.f30264e : EnumC15342e.f30266e;
                    this.f1395e = 1;
                    Object appmetrica2 = c14260e2.appmetrica(yandex2, j2, enumC15342e, this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (appmetrica2 == enumC2821e2) {
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
