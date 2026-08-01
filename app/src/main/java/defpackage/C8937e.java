package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۘۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8937e implements Function3 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f17901e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f17902e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17903e;

    public /* synthetic */ C8937e(C10685e c10685e, InterfaceC3314e interfaceC3314e) {
        this.f17903e = 26;
        this.f17901e = c10685e;
        this.f17902e = interfaceC3314e;
    }

    public /* synthetic */ C8937e(Object obj, Object obj2, int i) {
        this.f17903e = i;
        this.f17902e = obj;
        this.f17901e = obj2;
    }

    private final Object Signature(Object obj, Object obj2, Object obj3) {
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17902e;
        C14141e c14141e = (C14141e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
            boolean yandex = c13770e.yandex(c14141e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C8352e(c14141e, 0);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 510);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object ad(Object obj, Object obj2, Object obj3) {
        Cpublic cpublic = (Cpublic) this.f17902e;
        EnumC6916e enumC6916e = (EnumC6916e) this.f17901e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        boolean z = (intValue & 17) != 16;
        AbstractC7919e abstractC7919e = c13770e.ad;
        if (c13770e.m3673protected(intValue & 1, z)) {
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC12220e.mopub(c0115e, 16), 1.0f);
            C14544e c14544e = C5438e.f11668e;
            C17354e c17354e = AbstractC16497e.ad;
            C8587e ad = AbstractC6451e.ad(c17354e, c14544e, c13770e, 48);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = AbstractC4628e.purchase(cpublic.pro(), enumC6916e.f14176e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16268e.ad(AbstractC6845e.ad((Drawable) m3681throw, c13770e), AbstractC18007e.startapp(c0115e, 52), null, null, 0.0f, c13770e, 440, 120);
            AbstractC12534e.ad(c13770e, AbstractC18007e.smaato(c0115e, 12));
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j2 = c13770e.f27286case;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC8703e.premium(i2, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            C8587e ad3 = AbstractC6451e.ad(c17354e, C5438e.f11685e, c13770e, 0);
            long j3 = c13770e.f27286case;
            int i3 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC8703e.premium(i3, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.app_name);
            C1812e c1812e = C1812e.f4889e;
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, c1812e, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 1572864, 0, 262074);
            AbstractC14489e.vip(" 8.12.1_pub (99167)", null, C3618e.vip(0.7f, ((C7019e) c13770e.adcel(c15492e)).ad.admob), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
            c13770e.Signature(true);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 2));
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.intro_txt), null, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object adcel(Object obj, Object obj2, Object obj3) {
        AudioFollowingsUpdateInfo audioFollowingsUpdateInfo = (AudioFollowingsUpdateInfo) this.f17902e;
        Function0 function0 = (Function0) this.f17901e;
        C0283e c0283e = (C0283e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(c0283e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            C9577e c9577e = C5438e.f11678e;
            float f = 16;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e ad = c0283e.ad(AbstractC18007e.metrica(AbstractC12220e.mopub(c0115e, f), 1.0f), c9577e);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e, 48);
            long j = c13770e.f27286case;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, ad);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            C13964e billing = AbstractC16497e.billing(-16);
            boolean yandex = c13770e.yandex(audioFollowingsUpdateInfo);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C0609e(6, audioFollowingsUpdateInfo);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.vip(null, null, null, billing, null, null, false, null, (Function1) m3681throw, c13770e, 24576, 495);
            float f2 = 8;
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f2));
            AbstractC14489e.vip(audioFollowingsUpdateInfo.vip, null, 0L, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, c13770e, 0, 0, 261118);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f2));
            C3924e ad3 = AbstractC6549e.ad(f2);
            C16005e c16005e = AbstractC10244e.ad;
            AbstractC1513e.ad(function0, null, false, ad3, AbstractC10244e.ad(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob, 0L, 0L, 0L, c13770e, 14), null, null, new C16005e(f, f2, f, f2), AbstractC7518e.ad, c13770e, 817889280, 358);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object admob(Object obj, Object obj2, Object obj3) {
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17902e;
        C4944e c4944e = (C4944e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
            boolean yandex = c13770e.yandex(c4944e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C0213e(c4944e, 0);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 510);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object advert(Object obj, Object obj2, Object obj3) {
        C2921e c2921e = (C2921e) this.f17902e;
        InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            float f = 16;
            AbstractC12121e.ad(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), AbstractC6549e.vip(f, f, 0.0f, 0.0f, 12), ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(1576686389, new C9130e(c2921e, interfaceC16132e, 6), c13770e), c13770e, 12582912, 120);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object amazon(Object obj, Object obj2, Object obj3) {
        InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f17902e;
        InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f17901e;
        C13770e c13770e = (C13770e) obj2;
        ((Integer) obj3).getClass();
        float f = 8;
        C0115e c0115e = C0115e.f1276e;
        InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC12220e.loadAd(c0115e, 0.0f, f, 0.0f, 0.0f, 13), 1.0f);
        C15492e c15492e = AbstractC11785e.ad;
        InterfaceC12864e vip = AbstractC12447e.vip(metrica, ((C7019e) c13770e.adcel(c15492e)).metrica.license);
        long j = ((C3618e) interfaceC16132e.getValue()).ad;
        C5100e c5100e = AbstractC10432e.ad;
        long j2 = ((C7019e) c13770e.adcel(c15492e)).ad.premium;
        C3924e c3924e = AbstractC6549e.ad;
        float f2 = 4;
        InterfaceC12864e advert = AbstractC12220e.advert(AbstractC13201e.ad(AbstractC16136e.metrica(vip, j, c5100e), 1, j2, c3924e), f, f2);
        C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(f), C5438e.f11668e, c13770e, 54);
        long j3 = c13770e.f27286case;
        int i = (int) (j3 ^ (j3 >>> 32));
        InterfaceC3483e advert2 = c13770e.advert();
        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, advert);
        InterfaceC5685e.mopub.getClass();
        C7309e c7309e = C2721e.vip;
        c13770e.m3666import();
        if (c13770e.f27292implements) {
            c13770e.mopub(c7309e);
        } else {
            c13770e.m3684volatile();
        }
        C14865e c14865e = C2721e.billing;
        AbstractC2270e.yandex(c13770e, ad, c14865e);
        C14865e c14865e2 = C2721e.purchase;
        AbstractC2270e.yandex(c13770e, advert2, c14865e2);
        Integer valueOf = Integer.valueOf(i);
        C14865e c14865e3 = C2721e.adcel;
        AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
        C5430e c5430e = C2721e.mopub;
        AbstractC2270e.purchase(c13770e, c5430e);
        C14865e c14865e4 = C2721e.license;
        AbstractC2270e.yandex(c13770e, purchase, c14865e4);
        float f3 = 12;
        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_volume_down_24, 0, c13770e), null, AbstractC18007e.startapp(c0115e, f3), 0L, c13770e, 440, 8);
        InterfaceC12864e vip2 = AbstractC12447e.vip(c0115e, c3924e);
        C3533e c3533e = C3533e.ad;
        InterfaceC12864e metrica2 = AbstractC16136e.metrica(AbstractC18007e.license(c3533e.ad(vip2, 1.0f, true), f2), ((C3618e) interfaceC16132e2.getValue()).ad, c5100e);
        C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e, 0);
        long j4 = c13770e.f27286case;
        int i2 = (int) (j4 ^ (j4 >>> 32));
        InterfaceC3483e advert3 = c13770e.advert();
        InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, metrica2);
        c13770e.m3666import();
        if (c13770e.f27292implements) {
            c13770e.mopub(c7309e);
        } else {
            c13770e.m3684volatile();
        }
        AbstractC2270e.yandex(c13770e, ad2, c14865e);
        AbstractC2270e.yandex(c13770e, advert3, c14865e2);
        AbstractC8703e.premium(i2, c13770e, c14865e3, c13770e, c5430e);
        AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
        AbstractC17074e.ad(AbstractC16136e.metrica(c3533e.ad(AbstractC12447e.vip(c0115e, c3924e), 1.0f, true).premium(AbstractC18007e.vip), ((C7019e) c13770e.adcel(c15492e)).ad.ad, c5100e), c13770e, 0);
        AbstractC17074e.ad(c3533e.ad(AbstractC12447e.vip(c0115e, c3924e), 1.0f, true), c13770e, 0);
        c13770e.Signature(true);
        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_volume_up_24, 0, c13770e), null, AbstractC18007e.startapp(c0115e, f3), 0L, c13770e, 440, 8);
        c13770e.Signature(true);
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        C10685e c10685e = (C10685e) this.f17901e;
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f17902e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            int i = ((C3487e) interfaceC3314e.getValue()).f7756e;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(c10685e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C8570e(c10685e, 5);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC13482e.tapsense, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, AbstractC16653e.license(1521956164, new C2172e(i, 2, (byte) 0), c13770e), null, null, null, 0.0f, 0.0f, c13770e, 3078, 500);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object isVip(Object obj, Object obj2, Object obj3) {
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17902e;
        C14987e c14987e = (C14987e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
            boolean yandex = c13770e.yandex(c14987e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C17955e(23, c14987e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 510);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object license(Object obj, Object obj2, Object obj3) {
        EnumC7792e enumC7792e = (EnumC7792e) this.f17902e;
        C2892e c2892e = (C2892e) this.f17901e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            AbstractC1101e.ad(AbstractC11473e.amazon.ad(enumC7792e), c2892e, c13770e, 8);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object loadAd(Object obj, Object obj2, Object obj3) {
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17902e;
        C12688e c12688e = (C12688e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
            boolean yandex = c13770e.yandex(c12688e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C5461e(c12688e, 1);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 510);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3) {
        C5344e c5344e = (C5344e) this.f17902e;
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (!c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            c13770e.m3659default();
        } else if (((Boolean) c5344e.f11455e.getValue()).booleanValue()) {
            c13770e.m3676strictfp(1037974636);
            AbstractC0436e.ad(AbstractC12220e.adcel(C0115e.f1276e, interfaceC12123e), false, 0L, c13770e, 0, 6);
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(1038167549);
            InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
            boolean yandex = c13770e.yandex(c5344e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C6846e(0, c5344e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 510);
            c13770e.Signature(false);
        }
        return Unit.INSTANCE;
    }

    private final Object pro(Object obj, Object obj2, Object obj3) {
        C2743e c2743e = (C2743e) this.f17902e;
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC6787e interfaceC6787e = (InterfaceC6787e) c2743e.f6645e.getValue();
            boolean billing = AbstractC7890e.billing(interfaceC6787e, C8505e.ad);
            C0115e c0115e = C0115e.f1276e;
            if (billing || AbstractC7890e.billing(interfaceC6787e, C15862e.ad)) {
                c13770e.m3676strictfp(-1026851246);
                AbstractC0436e.ad(AbstractC12220e.adcel(c0115e, interfaceC12123e), false, 0L, c13770e, 0, 6);
                c13770e.Signature(false);
            } else {
                boolean z = interfaceC6787e instanceof C7331e;
                C5170e c5170e = C2987e.ad;
                if (z) {
                    c13770e.m3676strictfp(-1026688124);
                    InterfaceC12864e purchase = AbstractC5967e.purchase(AbstractC12220e.adcel(AbstractC14783e.license(c0115e, interfaceC2566e.ad(), null), interfaceC12123e).premium(AbstractC18007e.metrica), AbstractC5967e.appmetrica(c13770e), true);
                    InterfaceC4977e smaato = C15802e.smaato(((C7331e) interfaceC6787e).ad);
                    boolean yandex = c13770e.yandex(c2743e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        C11212e c11212e = new C11212e(0, c2743e, C2743e.class, "dispatchLoad", "dispatchLoad()V", 0, 0, 14);
                        c13770e.m3682throws(c11212e);
                        m3681throw = c11212e;
                    }
                    AbstractC11906e.ad(smaato, (Function0) ((InterfaceC5261e) m3681throw), purchase, false, c13770e, 0, 8);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(-1026164720);
                    InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(c0115e, interfaceC12123e), interfaceC2566e.ad(), null);
                    boolean yandex2 = c13770e.yandex(c2743e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C17955e(20, c2743e);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e, 0, 510);
                    c13770e.Signature(false);
                }
            }
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object purchase(Object obj, Object obj2, Object obj3) {
        InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f17902e;
        C10685e c10685e = (C10685e) this.f17901e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean purchase = c13770e.purchase(interfaceC16132e) | c13770e.yandex(c10685e);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = new Celse(c10685e, interfaceC16132e, 9);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC13482e.startapp, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, AbstractC13482e.adcel, null, AbstractC16653e.license(-1949179866, new C10100e(interfaceC16132e, 0), c13770e), null, 0.0f, 0.0f, c13770e, 199686, 468);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object signatures(Object obj, Object obj2, Object obj3) {
        C13679e c13679e = (C13679e) this.f17902e;
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC1662e interfaceC1662e = (InterfaceC1662e) c13679e.f27100e.getValue();
            boolean billing = AbstractC7890e.billing(interfaceC1662e, C6569e.ad);
            C0115e c0115e = C0115e.f1276e;
            if (billing || AbstractC7890e.billing(interfaceC1662e, C15766e.ad)) {
                c13770e.m3676strictfp(647876848);
                AbstractC0436e.ad(AbstractC12220e.adcel(c0115e, interfaceC12123e), false, 0L, c13770e, 0, 6);
                c13770e.Signature(false);
            } else {
                boolean z = interfaceC1662e instanceof C3719e;
                C5170e c5170e = C2987e.ad;
                if (z) {
                    c13770e.m3676strictfp(648039970);
                    InterfaceC12864e purchase = AbstractC5967e.purchase(AbstractC12220e.adcel(AbstractC14783e.license(c0115e, interfaceC2566e.ad(), null), interfaceC12123e).premium(AbstractC18007e.metrica), AbstractC5967e.appmetrica(c13770e), true);
                    InterfaceC4977e smaato = C15802e.smaato(((C3719e) interfaceC1662e).ad);
                    boolean yandex = c13770e.yandex(c13679e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        C11212e c11212e = new C11212e(0, c13679e, C13679e.class, "dispatchLoad", "dispatchLoad()V", 0, 0, 16);
                        c13770e.m3682throws(c11212e);
                        m3681throw = c11212e;
                    }
                    AbstractC11906e.ad(smaato, (Function0) ((InterfaceC5261e) m3681throw), purchase, false, c13770e, 0, 8);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(648549734);
                    InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(c0115e, interfaceC12123e), interfaceC2566e.ad(), null);
                    boolean yandex2 = c13770e.yandex(c13679e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C17955e(21, c13679e);
                        c13770e.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e, 0, 510);
                    c13770e.Signature(false);
                }
            }
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object smaato(Object obj, Object obj2, Object obj3) {
        InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17902e;
        C1856e c1856e = (C1856e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            InterfaceC12864e license = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
            boolean yandex = c13770e.yandex(c1856e);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C6846e(13, c1856e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(license, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 510);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object startapp(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        boolean z2;
        EnumC9702e enumC9702e = (EnumC9702e) this.f17902e;
        C14398e c14398e = (C14398e) this.f17901e;
        C8836e c8836e = (C8836e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(c8836e) ? 4 : 2;
        }
        boolean z3 = true;
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            if (enumC9702e == EnumC9702e.f19202e) {
                i = intValue;
                z = true;
            } else {
                i = intValue;
                z = false;
            }
            C10102e c10102e = C10102e.ad;
            C15937e c15937e = EnumC9702e.f19201e;
            InterfaceC16154e metrica = C10102e.metrica(0, c15937e.subs(), c13770e);
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = true;
            } else {
                z2 = true;
                z3 = false;
            }
            boolean yandex = c13770e.yandex(c14398e);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C2841e(c14398e, 9);
                c13770e.m3682throws(m3681throw);
            }
            int i2 = i & 14;
            AbstractC7260e.ad(c8836e, z, (Function0) m3681throw, metrica, null, z3, null, null, null, null, AbstractC9164e.Signature, c13770e, i2 | 196608, 1000);
            boolean z4 = enumC9702e == EnumC9702e.f19200e;
            boolean yandex2 = c13770e.yandex(c14398e);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C2841e(c14398e, 10);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC7260e.ad(c8836e, z4, (Function0) m3681throw2, C10102e.metrica(1, c15937e.subs(), c13770e), null, false, null, null, null, null, AbstractC9164e.admob, c13770e, i2, 1016);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object subscription(Object obj, Object obj2, Object obj3) {
        AbstractC16904e abstractC16904e = (AbstractC16904e) this.f17902e;
        C1374e c1374e = (C1374e) this.f17901e;
        InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(interfaceC12123e) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            AbstractC16279e.vip(abstractC16904e, AbstractC18007e.metrica, null, null, 0.0f, null, null, false, null, null, null, AbstractC16653e.license(290836476, new C6358e(interfaceC12123e, c1374e, 3), c13770e), c13770e, 48, 24576, 16380);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    private final Object vip(Object obj, Object obj2, Object obj3) {
        C15052e c15052e = (C15052e) this.f17902e;
        InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f17901e;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            boolean z = ((C1609e) interfaceC16132e.getValue()) == null;
            C1609e c1609e = (C1609e) interfaceC16132e.getValue();
            c15052e.m3909private(z, c1609e != null ? c1609e.f4527e : 0, AbstractC12220e.advert(C0115e.f1276e, 16, 8), c13770e, 384);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C15492e c15492e;
        boolean z;
        long appmetrica;
        boolean z2;
        switch (this.f17903e) {
            case 0:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f17902e;
                C2038e c2038e = ((C13621e) this.f17901e).ad;
                C13770e c13770e = (C13770e) obj2;
                ((Integer) obj3).getClass();
                if (((C10876e) interfaceC3314e.getValue()).f21532e) {
                    c13770e.m3676strictfp(777471045);
                    C3177e c3177e = (C3177e) c2038e.adcel.getValue();
                    C7913e c7913e = AbstractC18007e.metrica;
                    boolean yandex = c13770e.yandex(c2038e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        C0638e c0638e = new C0638e(1, c2038e, C2038e.class, "onArtworkPageChanged", "onArtworkPageChanged(I)V", 0, 0, 5);
                        c13770e.m3682throws(c0638e);
                        m3681throw = c0638e;
                    }
                    float f = 0;
                    AbstractC5960e.appmetrica(null, c3177e, (Function1) ((InterfaceC5261e) m3681throw), c7913e, false, new C16005e(f, f, f, f), null, null, true, null, c13770e, 906193926, 96);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(778205125);
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, C0115e.f1276e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(c7309e);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
                    AbstractC16049e abstractC16049e = c2038e.adcel().vip;
                    C7913e c7913e2 = AbstractC18007e.metrica;
                    AbstractC12315e.vip(abstractC16049e, c7913e2, c13770e, 48);
                    AbstractC17074e.ad(AbstractC16136e.metrica(c7913e2, C3618e.vip(0.25f, C3618e.vip), AbstractC10432e.ad), c13770e, 6);
                    c13770e.Signature(true);
                    c13770e.Signature(false);
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC2566e interfaceC2566e = (InterfaceC2566e) this.f17902e;
                C7888e c7888e = (C7888e) this.f17901e;
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e2.purchase(interfaceC12123e) ? 4 : 2;
                }
                if (c13770e2.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    InterfaceC12864e license2 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e), interfaceC2566e.ad(), null);
                    boolean yandex2 = c13770e2.yandex(c7888e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C0609e(9, c7888e);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC7023e.ad(license2, null, null, null, null, null, false, null, (Function1) m3681throw2, c13770e2, 0, 510);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C5250e c5250e = (C5250e) this.f17902e;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f17901e;
                InterfaceC12123e interfaceC12123e2 = (InterfaceC12123e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c13770e3.purchase(interfaceC12123e2) ? 4 : 2;
                }
                if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 19) != 18)) {
                    float f2 = 16;
                    AbstractC12121e.ad(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e2), AbstractC6549e.vip(f2, f2, 0.0f, 0.0f, 12), ((C7019e) c13770e3.adcel(AbstractC11785e.ad)).ad.subscription, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(-550798645, new C6949e(c5250e, interfaceC16132e, 29), c13770e3), c13770e3, 12582912, 120);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13314e c13314e = (C13314e) this.f17902e;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f17901e;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                boolean z3 = (intValue3 & 17) != 16;
                AbstractC7919e abstractC7919e = c13770e4.ad;
                if (c13770e4.m3673protected(intValue3 & 1, z3)) {
                    float f3 = 8;
                    InterfaceC12864e advert2 = AbstractC12220e.advert(AbstractC18007e.metrica, f3, 4);
                    C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e4, 48);
                    long j2 = c13770e4.f27286case;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert3 = c13770e4.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e4, advert2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e2 = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e2);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e4, ad, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e4, advert3, c14865e2);
                    Integer valueOf = Integer.valueOf(i2);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e4, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e4, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e4, purchase2, c14865e4);
                    String str = c13314e.ad;
                    String str2 = c13314e.metrica;
                    String str3 = c13314e.vip;
                    C15492e c15492e2 = AbstractC12491e.ad;
                    C6159e c6159e = new C6159e(((C6032e) c13770e4.adcel(c15492e2)).vip());
                    C0115e c0115e = C0115e.f1276e;
                    AbstractC8461e.vip(str, str3, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, 56), ((C16305e) c13770e4.adcel(AbstractC10984e.ad)).license), c6159e, null, null, c13770e4, 4096, 0, 32752);
                    InterfaceC12864e advert4 = AbstractC12220e.advert(c0115e, 12, f3);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e4, 0);
                    long j3 = c13770e4.f27286case;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert5 = c13770e4.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e4, advert4);
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e2);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e4, advert5, c14865e2);
                    AbstractC8703e.premium(i3, c13770e4, c14865e3, c13770e4, c5430e);
                    AbstractC2270e.yandex(c13770e4, purchase3, c14865e4);
                    String str4 = c13314e.vip;
                    C15492e c15492e3 = AbstractC17878e.ad;
                    C1839e c1839e = ((C10375e) c13770e4.adcel(c15492e3)).mopub;
                    if (((Boolean) interfaceC16132e2.getValue()).booleanValue()) {
                        c13770e4.m3676strictfp(920245080);
                        c15492e = c15492e2;
                        appmetrica = ((C6032e) c13770e4.adcel(c15492e)).metrica();
                        z = false;
                        c13770e4.Signature(false);
                    } else {
                        c15492e = c15492e2;
                        z = false;
                        c13770e4.m3676strictfp(920355967);
                        appmetrica = ((C6032e) c13770e4.adcel(c15492e)).appmetrica();
                        c13770e4.Signature(false);
                    }
                    boolean z4 = z;
                    AbstractC10600e.vip(str4, null, appmetrica, 0L, 0L, null, 0L, 2, false, str2.length() > 0 ? 1 : 2, 0, null, c1839e, c13770e4, 0, 48, 55290);
                    C13770e c13770e5 = c13770e4;
                    if (str2.length() > 0) {
                        c13770e5.m3676strictfp(920679142);
                        AbstractC10600e.vip(c13314e.metrica, null, ((C6032e) c13770e5.adcel(c15492e)).purchase(), 0L, 0L, null, 0L, 2, false, 1, 0, null, ((C10375e) c13770e5.adcel(c15492e3)).mopub, c13770e5, 0, 3120, 55290);
                        c13770e5 = c13770e5;
                    } else {
                        c13770e5.m3676strictfp(912091522);
                    }
                    c13770e5.Signature(z4);
                    c13770e5.Signature(true);
                    c13770e5.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C5016e c5016e = (C5016e) this.f17902e;
                InterfaceC2566e interfaceC2566e2 = (InterfaceC2566e) this.f17901e;
                InterfaceC12123e interfaceC12123e3 = (InterfaceC12123e) obj;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= c13770e6.purchase(interfaceC12123e3) ? 4 : 2;
                }
                if (c13770e6.m3673protected(intValue4 & 1, (intValue4 & 19) != 18)) {
                    InterfaceC9854e interfaceC9854e = (InterfaceC9854e) c5016e.f10697e.getValue();
                    boolean billing = AbstractC7890e.billing(interfaceC9854e, C16476e.ad);
                    C0115e c0115e2 = C0115e.f1276e;
                    if (billing) {
                        c13770e6.m3676strictfp(1556921096);
                        AbstractC0436e.ad(AbstractC12220e.adcel(c0115e2, interfaceC12123e3), false, 0L, c13770e6, 0, 6);
                        c13770e6.Signature(false);
                    } else {
                        boolean z5 = interfaceC9854e instanceof C6466e;
                        C5170e c5170e = C2987e.ad;
                        if (z5) {
                            c13770e6.m3676strictfp(1557102012);
                            InterfaceC12864e license3 = AbstractC14783e.license(AbstractC12220e.adcel(c0115e2, interfaceC12123e3).premium(AbstractC18007e.metrica), interfaceC2566e2.ad(), null);
                            boolean yandex3 = c13770e6.yandex(c5016e);
                            Object m3681throw3 = c13770e6.m3681throw();
                            if (yandex3 || m3681throw3 == c5170e) {
                                m3681throw3 = new C16345e(c5016e, 2);
                                c13770e6.m3682throws(m3681throw3);
                            }
                            AbstractC7023e.ad(license3, null, null, null, null, null, false, null, (Function1) m3681throw3, c13770e6, 0, 510);
                            c13770e6.Signature(false);
                        } else {
                            if (!(interfaceC9854e instanceof C18477e)) {
                                throw AbstractC1786e.loadAd(1020057175, c13770e6, false);
                            }
                            c13770e6.m3676strictfp(1558455875);
                            InterfaceC12864e license4 = AbstractC14783e.license(AbstractC12220e.adcel(c0115e2, interfaceC12123e3).premium(AbstractC18007e.metrica), interfaceC2566e2.ad(), null);
                            boolean yandex4 = c13770e6.yandex(c5016e) | c13770e6.yandex(interfaceC9854e);
                            Object m3681throw4 = c13770e6.m3681throw();
                            if (yandex4 || m3681throw4 == c5170e) {
                                m3681throw4 = new C12439e(c5016e, (C18477e) interfaceC9854e, 27);
                                c13770e6.m3682throws(m3681throw4);
                            }
                            AbstractC7023e.ad(license4, null, null, null, null, null, false, null, (Function1) m3681throw4, c13770e6, 0, 510);
                            c13770e6.Signature(false);
                        }
                    }
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                InterfaceC2566e interfaceC2566e3 = (InterfaceC2566e) this.f17902e;
                C13877e c13877e = (C13877e) this.f17901e;
                InterfaceC12123e interfaceC12123e4 = (InterfaceC12123e) obj;
                C13770e c13770e7 = (C13770e) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= c13770e7.purchase(interfaceC12123e4) ? 4 : 2;
                }
                if (c13770e7.m3673protected(intValue5 & 1, (intValue5 & 19) != 18)) {
                    InterfaceC12864e license5 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e4), interfaceC2566e3.ad(), null);
                    boolean yandex5 = c13770e7.yandex(c13877e);
                    Object m3681throw5 = c13770e7.m3681throw();
                    if (yandex5 || m3681throw5 == C2987e.ad) {
                        m3681throw5 = new C0609e(26, c13877e);
                        c13770e7.m3682throws(m3681throw5);
                    }
                    AbstractC7023e.ad(license5, null, null, null, null, null, false, null, (Function1) m3681throw5, c13770e7, 0, 510);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC2566e interfaceC2566e4 = (InterfaceC2566e) this.f17902e;
                C3248e c3248e = (C3248e) this.f17901e;
                InterfaceC12123e interfaceC12123e5 = (InterfaceC12123e) obj;
                C13770e c13770e8 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= c13770e8.purchase(interfaceC12123e5) ? 4 : 2;
                }
                if (c13770e8.m3673protected(intValue6 & 1, (intValue6 & 19) != 18)) {
                    InterfaceC12864e license6 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e5), interfaceC2566e4.ad(), null);
                    boolean yandex6 = c13770e8.yandex(c3248e);
                    Object m3681throw6 = c13770e8.m3681throw();
                    if (yandex6 || m3681throw6 == C2987e.ad) {
                        m3681throw6 = new C0609e(27, c3248e);
                        c13770e8.m3682throws(m3681throw6);
                    }
                    AbstractC7023e.ad(license6, null, null, null, null, null, false, null, (Function1) m3681throw6, c13770e8, 0, 510);
                } else {
                    c13770e8.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                C17399e c17399e = (C17399e) this.f17902e;
                InterfaceC2566e interfaceC2566e5 = (InterfaceC2566e) this.f17901e;
                InterfaceC12123e interfaceC12123e6 = (InterfaceC12123e) obj;
                C13770e c13770e9 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= c13770e9.purchase(interfaceC12123e6) ? 4 : 2;
                }
                boolean z6 = (intValue7 & 19) != 18;
                AbstractC7919e abstractC7919e2 = c13770e9.ad;
                if (c13770e9.m3673protected(intValue7 & 1, z6)) {
                    InterfaceC16811e interfaceC16811e = (InterfaceC16811e) c17399e.f34107e.getValue();
                    boolean billing2 = AbstractC7890e.billing(interfaceC16811e, C10786e.ad);
                    C0115e c0115e3 = C0115e.f1276e;
                    if (billing2) {
                        c13770e9.m3676strictfp(-1584562846);
                        AbstractC0436e.ad(AbstractC12220e.adcel(c0115e3, interfaceC12123e6), false, 0L, c13770e9, 0, 6);
                        c13770e9.Signature(false);
                    } else {
                        if (!(interfaceC16811e instanceof C10823e)) {
                            throw AbstractC1786e.loadAd(-1575130746, c13770e9, false);
                        }
                        c13770e9.m3676strictfp(-1584217258);
                        C10823e c10823e = (C10823e) interfaceC16811e;
                        if (c10823e.ad > 0) {
                            c13770e9.m3676strictfp(-1584201014);
                            C13964e billing3 = AbstractC16497e.billing(8);
                            InterfaceC12864e license7 = AbstractC14783e.license(c0115e3, interfaceC2566e5.ad(), null);
                            boolean yandex7 = c13770e9.yandex(interfaceC16811e) | c13770e9.yandex(c17399e);
                            Object m3681throw7 = c13770e9.m3681throw();
                            if (yandex7 || m3681throw7 == C2987e.ad) {
                                m3681throw7 = new C9041e(c10823e, c17399e, 14);
                                c13770e9.m3682throws(m3681throw7);
                            }
                            AbstractC7023e.ad(license7, null, interfaceC12123e6, billing3, null, null, false, null, (Function1) m3681throw7, c13770e9, ((intValue7 << 6) & 896) | 24576, 490);
                            c13770e9.Signature(false);
                            z2 = false;
                        } else {
                            c13770e9.m3676strictfp(-1578870812);
                            InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e6);
                            InterfaceC2747e license8 = AbstractC17074e.license(C5438e.f11676e, false);
                            long j4 = c13770e9.f27286case;
                            int i4 = (int) (j4 ^ (j4 >>> 32));
                            InterfaceC3483e advert6 = c13770e9.advert();
                            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e9, adcel);
                            InterfaceC5685e.mopub.getClass();
                            C7309e c7309e3 = C2721e.vip;
                            c13770e9.m3666import();
                            if (c13770e9.f27292implements) {
                                c13770e9.mopub(c7309e3);
                            } else {
                                c13770e9.m3684volatile();
                            }
                            C14865e c14865e5 = C2721e.billing;
                            AbstractC2270e.yandex(c13770e9, license8, c14865e5);
                            C14865e c14865e6 = C2721e.purchase;
                            AbstractC2270e.yandex(c13770e9, advert6, c14865e6);
                            Integer valueOf2 = Integer.valueOf(i4);
                            C14865e c14865e7 = C2721e.adcel;
                            AbstractC2270e.yandex(c13770e9, valueOf2, c14865e7);
                            C5430e c5430e2 = C2721e.mopub;
                            AbstractC2270e.purchase(c13770e9, c5430e2);
                            C14865e c14865e8 = C2721e.license;
                            AbstractC2270e.yandex(c13770e9, purchase4, c14865e8);
                            InterfaceC12864e smaato = AbstractC12220e.smaato(C14486e.ad.ad(c0115e3, C5438e.f11700e), 16, 0.0f, 2);
                            C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11678e, c13770e9, 54);
                            long j5 = c13770e9.f27286case;
                            int i5 = (int) (j5 ^ (j5 >>> 32));
                            InterfaceC3483e advert7 = c13770e9.advert();
                            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e9, smaato);
                            c13770e9.m3666import();
                            if (c13770e9.f27292implements) {
                                c13770e9.mopub(c7309e3);
                            } else {
                                c13770e9.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e9, ad3, c14865e5);
                            AbstractC2270e.yandex(c13770e9, advert7, c14865e6);
                            AbstractC8703e.premium(i5, c13770e9, c14865e7, c13770e9, c5430e2);
                            AbstractC2270e.yandex(c13770e9, purchase5, c14865e8);
                            z2 = false;
                            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e9, R.string.find_duplicates_nothing), null, 0L, 0L, null, C1812e.f4891e, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e9, 1572864, 0, 262078);
                            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e9, R.string.find_duplicates_nothing_text), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e9, 0, 0, 262142);
                            c13770e9 = c13770e9;
                            AbstractC1786e.isPro(c13770e9, true, true, false);
                        }
                        c13770e9.Signature(z2);
                    }
                } else {
                    c13770e9.m3659default();
                }
                return Unit.INSTANCE;
            case 8:
                InterfaceC5673e interfaceC5673e = (InterfaceC5673e) this.f17902e;
                AbstractC9512e abstractC9512e = (AbstractC9512e) this.f17901e;
                InterfaceC12123e interfaceC12123e7 = (InterfaceC12123e) obj;
                C13770e c13770e10 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= c13770e10.purchase(interfaceC12123e7) ? 4 : 2;
                }
                boolean z7 = (intValue8 & 19) != 18;
                AbstractC7919e abstractC7919e3 = c13770e10.ad;
                if (c13770e10.m3673protected(intValue8 & 1, z7)) {
                    boolean billing4 = AbstractC7890e.billing(interfaceC5673e.appmetrica(), C3214e.ad);
                    C0115e c0115e4 = C0115e.f1276e;
                    C5170e c5170e2 = C2987e.ad;
                    if (billing4) {
                        c13770e10.m3676strictfp(574655864);
                        boolean booleanValue = ((Boolean) abstractC9512e.f18867e.getValue()).booleanValue();
                        boolean yandex8 = c13770e10.yandex(abstractC9512e);
                        Object m3681throw8 = c13770e10.m3681throw();
                        if (yandex8 || m3681throw8 == c5170e2) {
                            m3681throw8 = new C6765e(abstractC9512e, 3);
                            c13770e10.m3682throws(m3681throw8);
                        }
                        AbstractC11148e.vip(booleanValue, (Function0) m3681throw8, AbstractC12220e.adcel(c0115e4, interfaceC12123e7), null, null, null, false, 0.0f, AbstractC16653e.license(1081571949, new C5925e(abstractC9512e, 1), c13770e10), c13770e10, 100663296, 248);
                        c13770e10.Signature(false);
                    } else {
                        c13770e10.m3676strictfp(576869388);
                        float f4 = 16;
                        InterfaceC12864e premium = AbstractC12220e.mopub(AbstractC12220e.adcel(c0115e4, interfaceC12123e7), f4).premium(AbstractC18007e.metrica);
                        C10156e c10156e = C5438e.f11700e;
                        InterfaceC2747e license9 = AbstractC17074e.license(c10156e, false);
                        long j6 = c13770e10.f27286case;
                        int i6 = (int) (j6 ^ (j6 >>> 32));
                        InterfaceC3483e advert8 = c13770e10.advert();
                        InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e10, premium);
                        InterfaceC5685e.mopub.getClass();
                        C7309e c7309e4 = C2721e.vip;
                        c13770e10.m3666import();
                        if (c13770e10.f27292implements) {
                            c13770e10.mopub(c7309e4);
                        } else {
                            c13770e10.m3684volatile();
                        }
                        C14865e c14865e9 = C2721e.billing;
                        AbstractC2270e.yandex(c13770e10, license9, c14865e9);
                        C14865e c14865e10 = C2721e.purchase;
                        AbstractC2270e.yandex(c13770e10, advert8, c14865e10);
                        Integer valueOf3 = Integer.valueOf(i6);
                        C14865e c14865e11 = C2721e.adcel;
                        AbstractC2270e.yandex(c13770e10, valueOf3, c14865e11);
                        C5430e c5430e3 = C2721e.mopub;
                        AbstractC2270e.purchase(c13770e10, c5430e3);
                        C14865e c14865e12 = C2721e.license;
                        AbstractC2270e.yandex(c13770e10, purchase6, c14865e12);
                        InterfaceC12864e smaato2 = AbstractC12220e.smaato(AbstractC18007e.metrica(C14486e.ad.ad(c0115e4, c10156e), 1.0f), f4, 0.0f, 2);
                        C4789e ad4 = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11678e, c13770e10, 54);
                        long j7 = c13770e10.f27286case;
                        int i7 = (int) (j7 ^ (j7 >>> 32));
                        InterfaceC3483e advert9 = c13770e10.advert();
                        InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e10, smaato2);
                        c13770e10.m3666import();
                        if (c13770e10.f27292implements) {
                            c13770e10.mopub(c7309e4);
                        } else {
                            c13770e10.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e10, ad4, c14865e9);
                        AbstractC2270e.yandex(c13770e10, advert9, c14865e10);
                        AbstractC8703e.premium(i7, c13770e10, c14865e11, c13770e10, c5430e3);
                        AbstractC2270e.yandex(c13770e10, purchase7, c14865e12);
                        AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_music_outline_28, 0, c13770e10), null, AbstractC18007e.startapp(c0115e4, 56), 0L, c13770e10, 440, 8);
                        String appmetrica2 = AbstractC5297e.appmetrica(c13770e10, R.string.auth2_qr_code_camera_permission);
                        C15492e c15492e4 = AbstractC11785e.ad;
                        AbstractC14489e.vip(appmetrica2, null, 0L, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e4)).vip.purchase, c13770e10, 0, 0, 130046);
                        AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e10, R.string.local_audio_perm), null, 0L, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e10.adcel(c15492e4)).vip.mopub, c13770e10, 0, 0, 130046);
                        boolean purchase8 = c13770e10.purchase(interfaceC5673e);
                        Object m3681throw9 = c13770e10.m3681throw();
                        if (purchase8 || m3681throw9 == c5170e2) {
                            m3681throw9 = new C15101e(0, interfaceC5673e, InterfaceC5673e.class, "launchPermissionRequest", "launchPermissionRequest()V", 0, 0, 8);
                            c13770e10.m3682throws(m3681throw9);
                        }
                        AbstractC1513e.license((Function0) ((InterfaceC5261e) m3681throw9), null, false, null, null, null, C4094e.license, c13770e10, 805306368, 510);
                        AbstractC1786e.isPro(c13770e10, true, true, false);
                    }
                } else {
                    c13770e10.m3659default();
                }
                return Unit.INSTANCE;
            case 9:
                InterfaceC2566e interfaceC2566e6 = (InterfaceC2566e) this.f17902e;
                C8606e c8606e = (C8606e) this.f17901e;
                InterfaceC12123e interfaceC12123e8 = (InterfaceC12123e) obj;
                C13770e c13770e11 = (C13770e) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= c13770e11.purchase(interfaceC12123e8) ? 4 : 2;
                }
                if (c13770e11.m3673protected(intValue9 & 1, (intValue9 & 19) != 18)) {
                    InterfaceC12864e license10 = AbstractC14783e.license(AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e8), interfaceC2566e6.ad(), null);
                    boolean yandex9 = c13770e11.yandex(c8606e);
                    Object m3681throw10 = c13770e11.m3681throw();
                    if (yandex9 || m3681throw10 == C2987e.ad) {
                        m3681throw10 = new C2109e(12, c8606e);
                        c13770e11.m3682throws(m3681throw10);
                    }
                    AbstractC7023e.ad(license10, null, null, null, null, null, false, null, (Function1) m3681throw10, c13770e11, 0, 510);
                } else {
                    c13770e11.m3659default();
                }
                return Unit.INSTANCE;
            case 10:
                C8004e c8004e = (C8004e) this.f17902e;
                EnumC6916e enumC6916e = (EnumC6916e) this.f17901e;
                InterfaceC12123e interfaceC12123e9 = (InterfaceC12123e) obj;
                C13770e c13770e12 = (C13770e) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= c13770e12.purchase(interfaceC12123e9) ? 4 : 2;
                }
                boolean z8 = (intValue10 & 19) != 18;
                AbstractC7919e abstractC7919e4 = c13770e12.ad;
                if (c13770e12.m3673protected(intValue10 & 1, z8)) {
                    InterfaceC12864e adcel2 = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e9);
                    InterfaceC2747e license11 = AbstractC17074e.license(C5438e.f11700e, false);
                    long j8 = c13770e12.f27286case;
                    int i8 = (int) (j8 ^ (j8 >>> 32));
                    InterfaceC3483e advert10 = c13770e12.advert();
                    InterfaceC12864e purchase9 = AbstractC5679e.purchase(c13770e12, adcel2);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e5 = C2721e.vip;
                    c13770e12.m3666import();
                    if (c13770e12.f27292implements) {
                        c13770e12.mopub(c7309e5);
                    } else {
                        c13770e12.m3684volatile();
                    }
                    C14865e c14865e13 = C2721e.billing;
                    AbstractC2270e.yandex(c13770e12, license11, c14865e13);
                    C14865e c14865e14 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e12, advert10, c14865e14);
                    Integer valueOf4 = Integer.valueOf(i8);
                    C14865e c14865e15 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e12, valueOf4, c14865e15);
                    C5430e c5430e4 = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e12, c5430e4);
                    C14865e c14865e16 = C2721e.license;
                    AbstractC2270e.yandex(c13770e12, purchase9, c14865e16);
                    C9577e c9577e = C5438e.f11678e;
                    C0115e c0115e5 = C0115e.f1276e;
                    InterfaceC12864e smaato3 = AbstractC12220e.smaato(c0115e5, 16, 0.0f, 2);
                    float f5 = 8;
                    C4789e ad5 = AbstractC14801e.ad(AbstractC16497e.billing(f5), c9577e, c13770e12, 54);
                    long j9 = c13770e12.f27286case;
                    int i9 = (int) (j9 ^ (j9 >>> 32));
                    InterfaceC3483e advert11 = c13770e12.advert();
                    InterfaceC12864e purchase10 = AbstractC5679e.purchase(c13770e12, smaato3);
                    c13770e12.m3666import();
                    if (c13770e12.f27292implements) {
                        c13770e12.mopub(c7309e5);
                    } else {
                        c13770e12.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e12, ad5, c14865e13);
                    AbstractC2270e.yandex(c13770e12, advert11, c14865e14);
                    AbstractC8703e.premium(i9, c13770e12, c14865e15, c13770e12, c5430e4);
                    AbstractC2270e.yandex(c13770e12, purchase10, c14865e16);
                    Object m3681throw11 = c13770e12.m3681throw();
                    if (m3681throw11 == C2987e.ad) {
                        m3681throw11 = AbstractC4628e.purchase(c8004e.pro(), enumC6916e.f14176e);
                        c13770e12.m3682throws(m3681throw11);
                    }
                    AbstractC16268e.ad(AbstractC6845e.ad((Drawable) m3681throw11, c13770e12), AbstractC12220e.loadAd(AbstractC18007e.startapp(c0115e5, 52), 0.0f, 0.0f, 0.0f, f5, 7), null, null, 0.0f, c13770e12, 440, 120);
                    String appmetrica3 = AbstractC5297e.appmetrica(c13770e12, R.string.int_lg);
                    C15492e c15492e5 = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica3, null, 0L, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e12.adcel(c15492e5)).vip.purchase, c13770e12, 0, 0, 130046);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e12, R.string.int_lg_sub), null, ((C7019e) c13770e12.adcel(c15492e5)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e12.adcel(c15492e5)).vip.mopub, c13770e12, 0, 0, 130042);
                    c13770e12.Signature(true);
                    c13770e12.Signature(true);
                } else {
                    c13770e12.m3659default();
                }
                return Unit.INSTANCE;
            case 11:
                return mopub(obj, obj2, obj3);
            case 12:
                return advert(obj, obj2, obj3);
            case 13:
                return smaato(obj, obj2, obj3);
            case 14:
                return amazon(obj, obj2, obj3);
            case 15:
                return loadAd(obj, obj2, obj3);
            case 16:
                return Signature(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return admob(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return subscription(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return pro(obj, obj2, obj3);
            case 20:
                return signatures(obj, obj2, obj3);
            case 21:
                return isVip(obj, obj2, obj3);
            case 22:
                return ad(obj, obj2, obj3);
            case 23:
                return vip(obj, obj2, obj3);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return license(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return purchase(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return billing(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return startapp(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return adcel(obj, obj2, obj3);
            default:
                C1718e c1718e = (C1718e) this.f17902e;
                C16349e c16349e = (C16349e) this.f17901e;
                InterfaceC12123e interfaceC12123e10 = (InterfaceC12123e) obj;
                C13770e c13770e13 = (C13770e) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= c13770e13.purchase(interfaceC12123e10) ? 4 : 2;
                }
                if (c13770e13.m3673protected(intValue11 & 1, (intValue11 & 19) != 18)) {
                    boolean isEmpty = c1718e.f4674e.isEmpty();
                    C0115e c0115e6 = C0115e.f1276e;
                    if (isEmpty) {
                        c13770e13.m3676strictfp(-269027277);
                        AbstractC0436e.ad(AbstractC12220e.adcel(c0115e6, interfaceC12123e10), false, 0L, c13770e13, 0, 6);
                        c13770e13.Signature(false);
                    } else {
                        c13770e13.m3676strictfp(-269896486);
                        AbstractC16279e.license(c16349e, AbstractC12220e.adcel(c0115e6, interfaceC12123e10), null, new C11726e(470), 16, null, null, false, null, null, null, AbstractC16653e.license(1714017523, new C6358e(c1718e, c16349e, 5), c13770e13), c13770e13, 196608);
                        c13770e13.Signature(false);
                    }
                } else {
                    c13770e13.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
