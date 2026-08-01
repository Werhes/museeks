package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3432e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f3433e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3434e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0990e(PlaybackService playbackService, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f3432e = i;
        this.f3433e = playbackService;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f3432e) {
            case 0:
                return new C0990e(this.f3433e, interfaceC5083e, 0);
            case 1:
                return new C0990e(this.f3433e, interfaceC5083e, 1);
            case 2:
                return new C0990e(this.f3433e, interfaceC5083e, 2);
            case 3:
                return new C0990e(this.f3433e, interfaceC5083e, 3);
            case 4:
                return new C0990e(this.f3433e, interfaceC5083e, 4);
            case 5:
                return new C0990e(this.f3433e, interfaceC5083e, 5);
            case 6:
                return new C0990e(this.f3433e, interfaceC5083e, 6);
            default:
                return new C0990e(this.f3433e, interfaceC5083e, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f3432e) {
            case 0:
                return ((C0990e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C0990e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C0990e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C0990e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C0990e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C0990e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C0990e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0990e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        long j;
        int i = this.f3432e;
        PlaybackService playbackService = this.f3433e;
        Object obj2 = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f3434e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e ad = ((InterfaceC8018e) ((C0444e) PlaybackService.advert().f15865e.f22773e).f2491e).ad();
                    C8086e c8086e = new C8086e(playbackService, (InterfaceC5083e) r5, 19);
                    this.f3434e = 1;
                    if (AbstractC7535e.appmetrica(ad, c8086e, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f3434e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e = C14157e.f27993e;
                    long Signature = AbstractC0326e.Signature(200, EnumC15934e.MILLISECONDS);
                    this.f3434e = 1;
                    if (AbstractC16481e.metrica(Signature, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C18464e c18464e = playbackService.f36743e;
                if (c18464e == null) {
                    c18464e = null;
                }
                PlaybackService.license(playbackService, c18464e);
                C4748e c4748e = playbackService.f36750e;
                playbackService.applovin(c4748e != null ? c4748e : 0, true);
                return Unit.INSTANCE;
            case 2:
                int i4 = this.f3434e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e2 = C14157e.f27993e;
                    long Signature2 = AbstractC0326e.Signature(3, EnumC15934e.SECONDS);
                    this.f3434e = 1;
                    if (AbstractC16481e.metrica(Signature2, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                int i5 = PlaybackService.f36732e;
                playbackService.mopub().metrica = false;
                C4748e c4748e2 = playbackService.f36750e;
                playbackService.applovin(c4748e2 != null ? c4748e2 : null, true);
                return Unit.INSTANCE;
            case 3:
                int i6 = this.f3434e;
                if (i6 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC17914e interfaceC17914e = PlaybackService.advert().f15862e;
                    this.f3434e = 1;
                    if (((C10301e) interfaceC17914e).appmetrica(this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i7 = this.f3434e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    C17647e c17647e3 = C14157e.f27993e;
                    long Signature3 = AbstractC0326e.Signature(3, EnumC15934e.SECONDS);
                    this.f3434e = 1;
                    if (AbstractC16481e.metrica(Signature3, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C4748e c4748e3 = playbackService.f36750e;
                if (c4748e3 == null) {
                    c4748e3 = null;
                }
                if (c4748e3.ad().mo2088e() == 0) {
                    playbackService.mopub().metrica = false;
                    C4748e c4748e4 = playbackService.f36750e;
                    if (c4748e4 == null) {
                        c4748e4 = null;
                    }
                    playbackService.applovin(c4748e4, false);
                    C7838e advert = PlaybackService.advert();
                    C12318e c12318e = advert.f15864e;
                    if (c12318e != null) {
                        c12318e.release();
                    }
                    advert.f15864e = null;
                    playbackService.premium();
                }
                return Unit.INSTANCE;
            case 5:
                int i8 = this.f3434e;
                if (i8 == 0) {
                    AbstractC2003e.purchase(obj);
                    C14260e c14260e = PlaybackService.advert().f15860e;
                    C18464e c18464e2 = playbackService.f36743e;
                    long mo2071e = ((AbstractC11130e) (c18464e2 != null ? c18464e2 : null).f36191e).mo2071e();
                    j = mo2071e >= 0 ? mo2071e : 0L;
                    this.f3434e = 1;
                    if (c14260e.vip(j, EnumC4345e.f9475e, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 6:
                int i9 = this.f3434e;
                if (i9 == 0) {
                    AbstractC2003e.purchase(obj);
                    C14260e c14260e2 = PlaybackService.advert().f15860e;
                    C18464e c18464e3 = playbackService.f36743e;
                    long mo2071e2 = ((AbstractC11130e) (c18464e3 != null ? c18464e3 : null).f36191e).mo2071e();
                    j = mo2071e2 >= 0 ? mo2071e2 : 0L;
                    this.f3434e = 1;
                    if (c14260e2.vip(j, EnumC4345e.f9476e, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i10 = this.f3434e;
                if (i10 == 0) {
                    AbstractC2003e.purchase(obj);
                    int i11 = PlaybackService.f36732e;
                    playbackService.getClass();
                    C18478e c18478e = PlaybackService.advert().f15870e;
                    C7838e advert2 = PlaybackService.advert();
                    this.f3434e = 1;
                    c18478e.getClass();
                    Object appmetrica = AbstractC9743e.appmetrica(new C3472e(c18478e, advert2, (InterfaceC5083e) r5, 7), this);
                    Object obj3 = appmetrica;
                    if (appmetrica != obj2) {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
