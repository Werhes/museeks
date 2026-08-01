package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5270e implements Function4 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f11357e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f11358e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f11359e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11360e;

    public /* synthetic */ C5270e(int i, Object obj, Object obj2, Object obj3) {
        this.f11360e = i;
        this.f11358e = obj;
        this.f11357e = obj2;
        this.f11359e = obj3;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C13770e c13770e;
        boolean z;
        boolean z2;
        C13770e c13770e2;
        boolean z3;
        Function0 function0;
        int i = this.f11360e;
        Object obj5 = C2987e.ad;
        int i2 = 2;
        int i3 = 3;
        Object obj6 = this.f11359e;
        Object obj7 = this.f11357e;
        Object obj8 = this.f11358e;
        final int i4 = 1;
        final int i5 = 0;
        switch (i) {
            case 0:
                InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj8;
                final C15318e c15318e = (C15318e) obj7;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) obj6;
                InterfaceC0804e interfaceC0804e = (InterfaceC0804e) obj2;
                C13770e c13770e3 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                C10156e c10156e = C5438e.f11695e;
                C9577e c9577e = C5438e.f11678e;
                C10156e c10156e2 = C5438e.f11700e;
                boolean billing = AbstractC7890e.billing(interfaceC0804e, C3467e.ad);
                C0115e c0115e = C0115e.f1276e;
                if (billing) {
                    c13770e3.m3676strictfp(-1934299233);
                    InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                    InterfaceC2747e license = AbstractC17074e.license(c10156e2, false);
                    long j = c13770e3.f27286case;
                    int i6 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e3.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, adcel);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e3, license, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e3, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i6);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e3, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e3, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e3, purchase, c14865e4);
                    C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(16), c9577e, c13770e3, 54);
                    long j2 = c13770e3.f27286case;
                    int i7 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert2 = c13770e3.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, c0115e);
                    c13770e3.m3666import();
                    if (c13770e3.f27292implements) {
                        c13770e3.mopub(c7309e);
                    } else {
                        c13770e3.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e3, ad, c14865e);
                    AbstractC2270e.yandex(c13770e3, advert2, c14865e2);
                    AbstractC8703e.premium(i7, c13770e3, c14865e3, c13770e3, c5430e);
                    AbstractC2270e.yandex(c13770e3, purchase2, c14865e4);
                    AbstractC6574e.ad(null, 0L, 0.0f, 0L, 0, 0.0f, c13770e3, 0, 63);
                    String appmetrica = AbstractC5297e.appmetrica(c13770e3, R.string.spark_splash_loading);
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e3.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e3.adcel(c15492e)).vip.mopub, c13770e3, 0, 0, 131066);
                    AbstractC1786e.isPro(c13770e3, true, true, false);
                } else {
                    boolean z4 = interfaceC0804e instanceof C10234e;
                    C14486e c14486e = C14486e.ad;
                    if (z4) {
                        c13770e3.m3676strictfp(-1933147180);
                        int i8 = ((C10234e) interfaceC0804e).ad;
                        if (i8 == 2) {
                            c13770e3.m3676strictfp(-1933156046);
                            InterfaceC12864e adcel2 = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                            InterfaceC2747e license2 = AbstractC17074e.license(c10156e2, false);
                            long j3 = c13770e3.f27286case;
                            int i9 = (int) (j3 ^ (j3 >>> 32));
                            InterfaceC3483e advert3 = c13770e3.advert();
                            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e3, adcel2);
                            InterfaceC5685e.mopub.getClass();
                            C7309e c7309e2 = C2721e.vip;
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e2);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            C14865e c14865e5 = C2721e.billing;
                            AbstractC2270e.yandex(c13770e3, license2, c14865e5);
                            C14865e c14865e6 = C2721e.purchase;
                            AbstractC2270e.yandex(c13770e3, advert3, c14865e6);
                            Integer valueOf2 = Integer.valueOf(i9);
                            C14865e c14865e7 = C2721e.adcel;
                            AbstractC2270e.yandex(c13770e3, valueOf2, c14865e7);
                            C5430e c5430e2 = C2721e.mopub;
                            AbstractC2270e.purchase(c13770e3, c5430e2);
                            C14865e c14865e8 = C2721e.license;
                            AbstractC2270e.yandex(c13770e3, purchase3, c14865e8);
                            float f = 16;
                            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(f), c9577e, c13770e3, 54);
                            long j4 = c13770e3.f27286case;
                            int i10 = (int) (j4 ^ (j4 >>> 32));
                            InterfaceC3483e advert4 = c13770e3.advert();
                            InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e3, c0115e);
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e2);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e3, ad2, c14865e5);
                            AbstractC2270e.yandex(c13770e3, advert4, c14865e6);
                            AbstractC8703e.premium(i10, c13770e3, c14865e7, c13770e3, c5430e2);
                            AbstractC2270e.yandex(c13770e3, purchase4, c14865e8);
                            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_globe_outline_28, 0, c13770e3), null, null, AbstractC0903e.license(c13770e3).remoteconfig, c13770e3, 56, 4);
                            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, R.string.spark_splash_network), AbstractC12220e.smaato(c0115e, f, 0.0f, 2), AbstractC0903e.license(c13770e3).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e3).mopub, c13770e3, 48, 0, 130040);
                            c13770e3.Signature(true);
                            InterfaceC12864e ad3 = c14486e.ad(AbstractC18007e.metrica(AbstractC12220e.mopub(c0115e, f), 1.0f), c10156e);
                            C16005e c16005e = AbstractC10244e.ad;
                            C3134e ad4 = AbstractC10244e.ad(AbstractC0903e.license(c13770e3).admob, AbstractC0903e.license(c13770e3).tapsense, 0L, 0L, c13770e3, 12);
                            C16005e c16005e2 = new C16005e(f, f, f, f);
                            C3924e c3924e = AbstractC0903e.purchase(c13770e3).metrica;
                            boolean yandex = c13770e3.yandex(c15318e);
                            Object m3681throw = c13770e3.m3681throw();
                            if (yandex || m3681throw == obj5) {
                                final int i11 = 0;
                                m3681throw = new Function0() { // from class: eٗۡۜ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i12 = i11;
                                        C15318e c15318e2 = c15318e;
                                        switch (i12) {
                                            case 0:
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        c15318e2.pro().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                                                    } else {
                                                        c15318e2.pro().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                } catch (Throwable unused) {
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                c15318e2.f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                return Unit.INSTANCE;
                                            case 2:
                                                c15318e2.f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                return Unit.INSTANCE;
                                            default:
                                                c15318e2.m2514goto(new C5422e());
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                c13770e3.m3682throws(m3681throw);
                            }
                            AbstractC1513e.ad((Function0) m3681throw, ad3, false, c3924e, ad4, null, null, c16005e2, AbstractC0426e.ad, c13770e3, 817889280, 356);
                            c13770e2 = c13770e3;
                            c13770e2.Signature(true);
                            c13770e2.Signature(false);
                            z3 = false;
                        } else {
                            c13770e3.m3676strictfp(-1930303302);
                            InterfaceC12864e adcel3 = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                            InterfaceC2747e license3 = AbstractC17074e.license(c10156e2, false);
                            long j5 = c13770e3.f27286case;
                            int i12 = (int) (j5 ^ (j5 >>> 32));
                            InterfaceC3483e advert5 = c13770e3.advert();
                            InterfaceC12864e purchase5 = AbstractC5679e.purchase(c13770e3, adcel3);
                            InterfaceC5685e.mopub.getClass();
                            C7309e c7309e3 = C2721e.vip;
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e3);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            C14865e c14865e9 = C2721e.billing;
                            AbstractC2270e.yandex(c13770e3, license3, c14865e9);
                            C14865e c14865e10 = C2721e.purchase;
                            AbstractC2270e.yandex(c13770e3, advert5, c14865e10);
                            Integer valueOf3 = Integer.valueOf(i12);
                            C14865e c14865e11 = C2721e.adcel;
                            AbstractC2270e.yandex(c13770e3, valueOf3, c14865e11);
                            C5430e c5430e3 = C2721e.mopub;
                            AbstractC2270e.purchase(c13770e3, c5430e3);
                            C14865e c14865e12 = C2721e.license;
                            AbstractC2270e.yandex(c13770e3, purchase5, c14865e12);
                            float f2 = 16;
                            C4789e ad5 = AbstractC14801e.ad(AbstractC16497e.billing(f2), c9577e, c13770e3, 54);
                            long j6 = c13770e3.f27286case;
                            int i13 = (int) (j6 ^ (j6 >>> 32));
                            InterfaceC3483e advert6 = c13770e3.advert();
                            InterfaceC12864e purchase6 = AbstractC5679e.purchase(c13770e3, c0115e);
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e3);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e3, ad5, c14865e9);
                            AbstractC2270e.yandex(c13770e3, advert6, c14865e10);
                            AbstractC8703e.premium(i13, c13770e3, c14865e11, c13770e3, c5430e3);
                            AbstractC2270e.yandex(c13770e3, purchase6, c14865e12);
                            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_error_outline_28, 0, c13770e3), null, null, AbstractC0903e.license(c13770e3).remoteconfig, c13770e3, 56, 4);
                            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e3, R.string.spark_splash_error), AbstractC12220e.smaato(c0115e, f2, 0.0f, 2), AbstractC0903e.license(c13770e3).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e3).mopub, c13770e3, 48, 0, 130040);
                            c13770e3.Signature(true);
                            C13964e billing2 = AbstractC16497e.billing(8);
                            InterfaceC12864e ad6 = c14486e.ad(c0115e, c10156e);
                            C4789e ad7 = AbstractC14801e.ad(billing2, c9577e, c13770e3, 54);
                            long j7 = c13770e3.f27286case;
                            int i14 = (int) (j7 ^ (j7 >>> 32));
                            InterfaceC3483e advert7 = c13770e3.advert();
                            InterfaceC12864e purchase7 = AbstractC5679e.purchase(c13770e3, ad6);
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e3);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e3, ad7, c14865e9);
                            AbstractC2270e.yandex(c13770e3, advert7, c14865e10);
                            AbstractC8703e.premium(i14, c13770e3, c14865e11, c13770e3, c5430e3);
                            AbstractC2270e.yandex(c13770e3, purchase7, c14865e12);
                            AbstractC14489e.vip(AbstractC5297e.license(R.string.spark_splash_error_code, new Object[]{Integer.valueOf(i8)}, c13770e3), AbstractC12220e.smaato(c0115e, f2, 0.0f, 2), AbstractC0903e.license(c13770e3).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e3).amazon, c13770e3, 48, 0, 130040);
                            InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC12220e.mopub(c0115e, f2), 1.0f);
                            C16005e c16005e3 = AbstractC10244e.ad;
                            C3134e ad8 = AbstractC10244e.ad(AbstractC0903e.license(c13770e3).admob, AbstractC0903e.license(c13770e3).tapsense, 0L, 0L, c13770e3, 12);
                            C16005e c16005e4 = new C16005e(f2, f2, f2, f2);
                            C3924e c3924e2 = AbstractC0903e.purchase(c13770e3).metrica;
                            boolean yandex2 = c13770e3.yandex(c15318e);
                            Object m3681throw2 = c13770e3.m3681throw();
                            if (yandex2 || m3681throw2 == obj5) {
                                z2 = true;
                                final boolean z5 = true ? 1 : 0;
                                m3681throw2 = new Function0() { // from class: eٗۡۜ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i122 = z5;
                                        C15318e c15318e2 = c15318e;
                                        switch (i122) {
                                            case 0:
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        c15318e2.pro().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                                                    } else {
                                                        c15318e2.pro().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                } catch (Throwable unused) {
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                c15318e2.f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                return Unit.INSTANCE;
                                            case 2:
                                                c15318e2.f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                return Unit.INSTANCE;
                                            default:
                                                c15318e2.m2514goto(new C5422e());
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                c13770e3.m3682throws(m3681throw2);
                            } else {
                                z2 = true;
                            }
                            AbstractC1513e.ad((Function0) m3681throw2, metrica, false, c3924e2, ad8, null, null, c16005e4, AbstractC0426e.vip, c13770e3, 817889328, 356);
                            c13770e2 = c13770e3;
                            z3 = false;
                            AbstractC1786e.isPro(c13770e2, z2, z2, false);
                        }
                        c13770e2.Signature(z3);
                    } else {
                        if (!AbstractC7890e.billing(interfaceC0804e, C1642e.ad)) {
                            throw AbstractC1786e.loadAd(491801413, c13770e3, false);
                        }
                        c13770e3.m3676strictfp(-1926515722);
                        if (((Boolean) interfaceC16132e.getValue()).booleanValue()) {
                            c13770e3.m3676strictfp(-1926603142);
                            InterfaceC12864e adcel4 = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                            InterfaceC2747e license4 = AbstractC17074e.license(c10156e2, false);
                            long j8 = c13770e3.f27286case;
                            int i15 = (int) (j8 ^ (j8 >>> 32));
                            InterfaceC3483e advert8 = c13770e3.advert();
                            InterfaceC12864e purchase8 = AbstractC5679e.purchase(c13770e3, adcel4);
                            InterfaceC5685e.mopub.getClass();
                            C7309e c7309e4 = C2721e.vip;
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e4);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e3, license4, C2721e.billing);
                            AbstractC2270e.yandex(c13770e3, advert8, C2721e.purchase);
                            AbstractC2270e.yandex(c13770e3, Integer.valueOf(i15), C2721e.adcel);
                            AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                            AbstractC2270e.yandex(c13770e3, purchase8, C2721e.license);
                            AbstractC6574e.ad(null, 0L, 0.0f, 0L, 0, 0.0f, c13770e3, 0, 63);
                            c13770e = c13770e3;
                            c13770e.Signature(true);
                            z = false;
                            c13770e.Signature(false);
                        } else {
                            c13770e3.m3676strictfp(-1926142575);
                            Object m3681throw3 = c13770e3.m3681throw();
                            if (m3681throw3 == obj5) {
                                C5363e c5363e = C0353e.startapp;
                                m3681throw3 = AbstractC15792e.billing().license.pro();
                                c13770e3.m3682throws(m3681throw3);
                            }
                            String str = (String) m3681throw3;
                            Object m3681throw4 = c13770e3.m3681throw();
                            if (m3681throw4 == obj5) {
                                C5363e c5363e2 = C0353e.startapp;
                                m3681throw4 = AbstractC5304e.m1869private(AbstractC15792e.billing().appmetrica.pro(), new String[]{":"}, 6);
                                c13770e3.m3682throws(m3681throw4);
                            }
                            final List list = (List) m3681throw4;
                            InterfaceC12864e adcel5 = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                            InterfaceC2747e license5 = AbstractC17074e.license(c10156e2, false);
                            long j9 = c13770e3.f27286case;
                            int i16 = (int) (j9 ^ (j9 >>> 32));
                            InterfaceC3483e advert9 = c13770e3.advert();
                            InterfaceC12864e purchase9 = AbstractC5679e.purchase(c13770e3, adcel5);
                            InterfaceC5685e.mopub.getClass();
                            C7309e c7309e5 = C2721e.vip;
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e5);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            C14865e c14865e13 = C2721e.billing;
                            AbstractC2270e.yandex(c13770e3, license5, c14865e13);
                            C14865e c14865e14 = C2721e.purchase;
                            AbstractC2270e.yandex(c13770e3, advert9, c14865e14);
                            Integer valueOf4 = Integer.valueOf(i16);
                            C14865e c14865e15 = C2721e.adcel;
                            AbstractC2270e.yandex(c13770e3, valueOf4, c14865e15);
                            C5430e c5430e4 = C2721e.mopub;
                            AbstractC2270e.purchase(c13770e3, c5430e4);
                            C14865e c14865e16 = C2721e.license;
                            AbstractC2270e.yandex(c13770e3, purchase9, c14865e16);
                            float f3 = 16;
                            C4789e ad9 = AbstractC14801e.ad(AbstractC16497e.billing(f3), c9577e, c13770e3, 54);
                            long j10 = c13770e3.f27286case;
                            int i17 = (int) (j10 ^ (j10 >>> 32));
                            InterfaceC3483e advert10 = c13770e3.advert();
                            InterfaceC12864e purchase10 = AbstractC5679e.purchase(c13770e3, c0115e);
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e5);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e3, ad9, c14865e13);
                            AbstractC2270e.yandex(c13770e3, advert10, c14865e14);
                            AbstractC8703e.premium(i17, c13770e3, c14865e15, c13770e3, c5430e4);
                            AbstractC2270e.yandex(c13770e3, purchase10, c14865e16);
                            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_add_square_outline_28, 0, c13770e3), null, null, AbstractC0903e.license(c13770e3).remoteconfig, c13770e3, 56, 4);
                            AbstractC14489e.vip(str, AbstractC12220e.smaato(c0115e, f3, 0.0f, 2), AbstractC0903e.license(c13770e3).remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e3).mopub, c13770e3, 54, 0, 130040);
                            c13770e3.Signature(true);
                            InterfaceC12864e mopub = AbstractC12220e.mopub(c14486e.ad(c0115e, c10156e), f3);
                            C4789e ad10 = AbstractC14801e.ad(AbstractC16497e.billing(f3), c9577e, c13770e3, 54);
                            long j11 = c13770e3.f27286case;
                            int i18 = (int) (j11 ^ (j11 >>> 32));
                            InterfaceC3483e advert11 = c13770e3.advert();
                            InterfaceC12864e purchase11 = AbstractC5679e.purchase(c13770e3, mopub);
                            c13770e3.m3666import();
                            if (c13770e3.f27292implements) {
                                c13770e3.mopub(c7309e5);
                            } else {
                                c13770e3.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e3, ad10, c14865e13);
                            AbstractC2270e.yandex(c13770e3, advert11, c14865e14);
                            AbstractC8703e.premium(i18, c13770e3, c14865e15, c13770e3, c5430e4);
                            AbstractC2270e.yandex(c13770e3, purchase11, c14865e16);
                            InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                            C16005e c16005e5 = AbstractC10244e.ad;
                            C3134e ad11 = AbstractC10244e.ad(AbstractC0903e.license(c13770e3).subscription, AbstractC0903e.license(c13770e3).admob, 0L, 0L, c13770e3, 12);
                            C16005e c16005e6 = new C16005e(f3, f3, f3, f3);
                            C3924e c3924e3 = AbstractC0903e.purchase(c13770e3).metrica;
                            boolean yandex3 = c13770e3.yandex(c15318e);
                            Object m3681throw5 = c13770e3.m3681throw();
                            if (yandex3 || m3681throw5 == obj5) {
                                final int i19 = 2;
                                m3681throw5 = new Function0() { // from class: eٗۡۜ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i122 = i19;
                                        C15318e c15318e2 = c15318e;
                                        switch (i122) {
                                            case 0:
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        c15318e2.pro().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                                                    } else {
                                                        c15318e2.pro().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                } catch (Throwable unused) {
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                c15318e2.f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                return Unit.INSTANCE;
                                            case 2:
                                                c15318e2.f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                return Unit.INSTANCE;
                                            default:
                                                c15318e2.m2514goto(new C5422e());
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                c13770e3.m3682throws(m3681throw5);
                            }
                            final int i20 = 0;
                            AbstractC1513e.ad((Function0) m3681throw5, metrica2, false, c3924e3, ad11, null, null, c16005e6, AbstractC16653e.license(1602145998, new Function3() { // from class: eُِٔ
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                    switch (i20) {
                                        case 0:
                                            C13770e c13770e4 = (C13770e) obj10;
                                            int intValue = ((Integer) obj11).intValue();
                                            if (c13770e4.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                                AbstractC14489e.vip((String) list.get(1), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                            } else {
                                                c13770e4.m3659default();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            C13770e c13770e5 = (C13770e) obj10;
                                            int intValue2 = ((Integer) obj11).intValue();
                                            if (c13770e5.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                AbstractC14489e.vip((String) list.get(0), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e5, 0, 0, 262142);
                                            } else {
                                                c13770e5.m3659default();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, c13770e3), c13770e3, 817889328, 356);
                            InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                            C3134e ad12 = AbstractC10244e.ad(AbstractC0903e.license(c13770e3).admob, AbstractC0903e.license(c13770e3).tapsense, 0L, 0L, c13770e3, 12);
                            C16005e c16005e7 = new C16005e(f3, f3, f3, f3);
                            C3924e c3924e4 = AbstractC0903e.purchase(c13770e3).metrica;
                            boolean yandex4 = c13770e3.yandex(c15318e);
                            Object m3681throw6 = c13770e3.m3681throw();
                            if (yandex4 || m3681throw6 == obj5) {
                                final int i21 = 3;
                                m3681throw6 = new Function0() { // from class: eٗۡۜ
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i122 = i21;
                                        C15318e c15318e2 = c15318e;
                                        switch (i122) {
                                            case 0:
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        c15318e2.pro().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                                                    } else {
                                                        c15318e2.pro().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                } catch (Throwable unused) {
                                                }
                                                return Unit.INSTANCE;
                                            case 1:
                                                c15318e2.f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                return Unit.INSTANCE;
                                            case 2:
                                                c15318e2.f27451e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                                                return Unit.INSTANCE;
                                            default:
                                                c15318e2.m2514goto(new C5422e());
                                                return Unit.INSTANCE;
                                        }
                                    }
                                };
                                c13770e3.m3682throws(m3681throw6);
                            }
                            Function0 function02 = (Function0) m3681throw6;
                            final int i22 = 1;
                            AbstractC1513e.ad(function02, metrica3, false, c3924e4, ad12, null, null, c16005e7, AbstractC16653e.license(-248181513, new Function3() { // from class: eُِٔ
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                    switch (i22) {
                                        case 0:
                                            C13770e c13770e4 = (C13770e) obj10;
                                            int intValue = ((Integer) obj11).intValue();
                                            if (c13770e4.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                                                AbstractC14489e.vip((String) list.get(1), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                                            } else {
                                                c13770e4.m3659default();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            C13770e c13770e5 = (C13770e) obj10;
                                            int intValue2 = ((Integer) obj11).intValue();
                                            if (c13770e5.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                AbstractC14489e.vip((String) list.get(0), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e5, 0, 0, 262142);
                                            } else {
                                                c13770e5.m3659default();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, c13770e3), c13770e3, 817889328, 356);
                            c13770e = c13770e3;
                            z = false;
                            AbstractC1786e.isPro(c13770e, true, true, false);
                        }
                        c13770e.Signature(z);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC16904e abstractC16904e = (AbstractC16904e) obj7;
                C4271e c4271e = (C4271e) obj6;
                int intValue = ((Integer) obj2).intValue();
                C13770e c13770e4 = (C13770e) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                c4271e.subs((C2314e) ((C5227e) obj8).ad.get(intValue), intValue == ((C16330e) abstractC16904e.license.f17056e).purchase(), intValue, abstractC16904e.advert(), AbstractC12447e.vip(AbstractC18007e.metrica, ((C7019e) c13770e4.adcel(AbstractC11785e.ad)).metrica.license), c13770e4, (intValue2 << 3) & 896);
                return Unit.INSTANCE;
            case 2:
                C16875e c16875e = (C16875e) obj8;
                C13621e c13621e = (C13621e) obj7;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj6;
                C13770e c13770e5 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                c13621e.license(c16875e.ad, AbstractC16653e.license(209498476, new C13268e(c13621e, c16875e, i2), c13770e5), AbstractC16653e.license(-1198712275, new C18415e(c16875e, c13621e, interfaceC3314e, i5), c13770e5), AbstractC16653e.license(1688044270, new C13268e(c16875e, c13621e, i3), c13770e5), AbstractC16653e.license(425799238, new C12050e(c13621e, (C13610e) obj, (InterfaceC6340e) obj2, interfaceC3314e, 17), c13770e5), AbstractC16653e.license(-1128377232, new C18415e(c16875e, c13621e, interfaceC3314e, i4), c13770e5), AbstractC16653e.license(1758379313, new C18415e(c16875e, interfaceC3314e, c13621e), c13770e5), c13770e5, 1797552);
                return Unit.INSTANCE;
            default:
                final Function2 function2 = (Function2) obj7;
                final Function2 function22 = (Function2) obj6;
                int intValue3 = ((Integer) obj2).intValue();
                C13770e c13770e6 = (C13770e) obj3;
                ((Integer) obj4).getClass();
                final AudioStreamMix audioStreamMix = (AudioStreamMix) ((AbstractC11110e) obj8).get(intValue3);
                boolean purchase12 = c13770e6.purchase(function2) | c13770e6.purchase(audioStreamMix);
                Object m3681throw7 = c13770e6.m3681throw();
                Object obj9 = m3681throw7;
                if (purchase12 || m3681throw7 == obj5) {
                    Object obj10 = new Function0() { // from class: eؕٛؕ
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String str2;
                            String str3;
                            switch (i5) {
                                case 0:
                                    AudioStreamMix audioStreamMix2 = audioStreamMix;
                                    AudioStreamMix.Link link = audioStreamMix2.license;
                                    if (link == null || (str2 = link.ad) == null) {
                                        str2 = audioStreamMix2.ad;
                                    }
                                    function2.invoke(str2, audioStreamMix2);
                                    return Unit.INSTANCE;
                                default:
                                    AudioStreamMix audioStreamMix3 = audioStreamMix;
                                    AudioStreamMix.Link link2 = audioStreamMix3.license;
                                    if (link2 == null || (str3 = link2.ad) == null) {
                                        str3 = audioStreamMix3.ad;
                                    }
                                    function2.invoke(str3, audioStreamMix3);
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    c13770e6.m3682throws(obj10);
                    obj9 = obj10;
                }
                Function0 function03 = (Function0) obj9;
                if (AbstractC7890e.billing(audioStreamMix.appmetrica, Boolean.TRUE)) {
                    c13770e6.m3676strictfp(-855762246);
                    boolean purchase13 = c13770e6.purchase(function22) | c13770e6.purchase(audioStreamMix);
                    Object m3681throw8 = c13770e6.m3681throw();
                    Object obj11 = m3681throw8;
                    if (purchase13 || m3681throw8 == obj5) {
                        Object obj12 = new Function0() { // from class: eؕٛؕ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String str2;
                                String str3;
                                switch (i4) {
                                    case 0:
                                        AudioStreamMix audioStreamMix2 = audioStreamMix;
                                        AudioStreamMix.Link link = audioStreamMix2.license;
                                        if (link == null || (str2 = link.ad) == null) {
                                            str2 = audioStreamMix2.ad;
                                        }
                                        function22.invoke(str2, audioStreamMix2);
                                        return Unit.INSTANCE;
                                    default:
                                        AudioStreamMix audioStreamMix3 = audioStreamMix;
                                        AudioStreamMix.Link link2 = audioStreamMix3.license;
                                        if (link2 == null || (str3 = link2.ad) == null) {
                                            str3 = audioStreamMix3.ad;
                                        }
                                        function22.invoke(str3, audioStreamMix3);
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e6.m3682throws(obj12);
                        obj11 = obj12;
                    }
                    function0 = (Function0) obj11;
                    c13770e6.Signature(false);
                } else {
                    c13770e6.m3676strictfp(-855628358);
                    c13770e6.Signature(false);
                    function0 = null;
                }
                AbstractC12068e.ad(audioStreamMix, function03, function0, c13770e6, 0);
                return Unit.INSTANCE;
        }
    }
}
