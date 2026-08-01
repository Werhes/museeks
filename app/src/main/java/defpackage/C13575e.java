package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13575e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26882e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f26883e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f26884e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f26885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13575e(Object obj, boolean z, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f26882e = i;
        this.f26883e = obj;
        this.f26884e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13575e(boolean z, Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f26882e = i;
        this.f26884e = z;
        this.f26883e = obj;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f26882e) {
            case 0:
                return new C13575e(this.f26884e, (C10685e) this.f26883e, interfaceC5083e, 0);
            case 1:
                return new C13575e((AudioTrack) this.f26883e, this.f26884e, interfaceC5083e, 1);
            case 2:
                return new C13575e(this.f26884e, (InterfaceC3314e) this.f26883e, interfaceC5083e, 2);
            case 3:
                return new C13575e(this.f26884e, (PlaybackService) this.f26883e, interfaceC5083e, 3);
            case 4:
                return new C13575e(this.f26884e, (RadioStation) this.f26883e, interfaceC5083e, 4);
            case 5:
                return new C13575e(this.f26884e, (InterfaceC16054e) this.f26883e, interfaceC5083e, 5);
            case 6:
                return new C13575e((C15860e) this.f26883e, this.f26884e, interfaceC5083e, 6);
            default:
                return new C13575e(this.f26884e, (C13622e) this.f26883e, interfaceC5083e, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f26882e) {
            case 0:
                return ((C13575e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C13575e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C13575e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C13575e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C13575e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C13575e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C13575e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C13575e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        long billing;
        int i = this.f26882e;
        C10566e c10566e = null;
        Object obj2 = this.f26883e;
        boolean z = this.f26884e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f26885e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    C16452e c16452e = (C16452e) AbstractC1831e.metrica().f22771e;
                    this.f26885e = 1;
                    if (((InterfaceC8018e) c16452e.f32285e).vip(new C3353e(z, r2, 18), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                AppActivity appActivity = (AppActivity) ((C10685e) obj2).pro();
                AbstractC15615e.ad(new Celse(appActivity, new C15076e(null, appActivity.getString(R.string.notification), appActivity.getString(R.string.restart_prompt), new C6571e(appActivity.getString(R.string.restart_act), new C0743e(3)), null, 113), 4));
                return Unit.INSTANCE;
            case 1:
                int i3 = this.f26885e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f26885e = 1;
                    C15420e c15420e = AbstractC6731e.ad;
                    Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C14078e(z, (AudioTrack) obj2, (InterfaceC5083e) null), this);
                    if (advert != enumC2821e) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj2;
                int i4 = this.f26885e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (z) {
                        int i5 = C4271e.f9361e;
                        if (!((Boolean) interfaceC3314e.getValue()).booleanValue()) {
                            C17647e c17647e = C14157e.f27993e;
                            EnumC15934e enumC15934e = EnumC15934e.SECONDS;
                            long convert = EnumC15934e.NANOSECONDS.f31392e.convert(1L, enumC15934e.f31392e);
                            double convert2 = convert > 0 ? convert * 0.3d : 0.3d / r1.convert(1L, r0);
                            if (Double.isNaN(convert2)) {
                                throw new IllegalArgumentException("Duration value cannot be NaN.");
                            }
                            long purchase = AbstractC1561e.purchase(convert2);
                            if (-4611686018426999999L > purchase || purchase >= 4611686018427000000L) {
                                long convert3 = EnumC15934e.MILLISECONDS.f31392e.convert(1L, enumC15934e.f31392e);
                                billing = AbstractC0326e.billing(AbstractC1561e.purchase(convert3 > 0 ? 0.3d * convert3 : 0.3d / r15.convert(1L, r0)));
                            } else {
                                billing = AbstractC0326e.yandex(purchase);
                            }
                            this.f26885e = 1;
                            if (AbstractC16481e.metrica(billing, this) == enumC2821e) {
                                return enumC2821e;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
                int i6 = C4271e.f9361e;
                interfaceC3314e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                PlaybackService playbackService = (PlaybackService) obj2;
                int i7 = this.f26885e;
                if (i7 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (z) {
                        C14260e c14260e = PlaybackService.advert().f15860e;
                        C18464e c18464e = playbackService.f36743e;
                        long mo2071e = ((AbstractC11130e) (c18464e != null ? c18464e : null).f36191e).mo2071e();
                        this.f26885e = 1;
                        if (c14260e.metrica(mo2071e, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    } else {
                        C14260e c14260e2 = PlaybackService.advert().f15860e;
                        C18464e c18464e2 = playbackService.f36743e;
                        long mo2071e2 = ((AbstractC11130e) (c18464e2 != null ? c18464e2 : 0).f36191e).mo2071e();
                        this.f26885e = 2;
                        if (c14260e2.ad(mo2071e2, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i8 = ((RadioStation) obj2).ad;
                int i9 = this.f26885e;
                if (i9 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (z) {
                        C8221e vip = AbstractC1831e.vip();
                        this.f26885e = 1;
                        C5577e c5577e = new C5577e("audio.followRadioStation", C14914e.f29577e);
                        c5577e.vip(i8, "station_id");
                        obj = vip.license(c5577e, this);
                        if (obj == enumC2821e) {
                            return enumC2821e;
                        }
                    } else {
                        C8221e vip2 = AbstractC1831e.vip();
                        this.f26885e = 2;
                        C5577e c5577e2 = new C5577e("audio.unfollowRadioStation", C17354e.f34042e);
                        c5577e2.vip(i8, "station_id");
                        obj = vip2.license(c5577e2, this);
                        if (obj == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else if (i9 == 1) {
                    AbstractC2003e.purchase(obj);
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 5:
                int i10 = this.f26885e;
                if (i10 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (z) {
                        this.f26885e = 1;
                        if (AbstractC16481e.vip(100L, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
                AbstractC4653e.startapp((InterfaceC16054e) obj2);
                return Unit.INSTANCE;
            case 6:
                C15860e c15860e = (C15860e) obj2;
                int i11 = this.f26885e;
                if (i11 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (!C12347e.license(c15860e.amazon().vip)) {
                        c10566e = AbstractC10077e.admob(c15860e.amazon());
                        if (z) {
                            int purchase2 = C12347e.purchase(c15860e.amazon().vip);
                            c15860e.metrica.invoke(C15860e.appmetrica(c15860e.amazon().ad, AbstractC9262e.metrica(purchase2, purchase2)));
                            c15860e.admob(EnumC13262e.f26311e);
                        }
                    }
                    if (c10566e == null) {
                        return Unit.INSTANCE;
                    }
                    InterfaceC17155e interfaceC17155e = c15860e.billing;
                    if (interfaceC17155e != null) {
                        C13590e yandex = AbstractC3149e.yandex(c10566e);
                        this.f26885e = 1;
                        if (((C2842e) interfaceC17155e).ad(yandex) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i12 = this.f26885e;
                if (i12 == 0) {
                    AbstractC2003e.purchase(obj);
                    C16452e c16452e2 = (C16452e) AbstractC1831e.metrica().f22771e;
                    this.f26885e = 1;
                    if (((InterfaceC8018e) c16452e2.f32285e).vip(new C3353e(z, r2, 21), this) == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                C13622e.m3624private((C13622e) obj2);
                return Unit.INSTANCE;
        }
    }
}
