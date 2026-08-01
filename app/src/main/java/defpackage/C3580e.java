package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3580e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4320e f8104e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f8105e;

    public /* synthetic */ C3580e(C4320e c4320e, int i) {
        this.f8105e = i;
        this.f8104e = c4320e;
    }

    public /* synthetic */ C3580e(C4320e c4320e, int i, int i2) {
        this.f8105e = i2;
        this.f8104e = c4320e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String isVip;
        String isVip2;
        boolean z;
        int i = this.f8105e;
        C5170e c5170e = C2987e.ad;
        C4320e c4320e = this.f8104e;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C4320e c4320e2 = this.f8104e;
                    boolean yandex = c13770e.yandex(c4320e2);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == c5170e) {
                        C11212e c11212e = new C11212e(0, c4320e2, C4320e.class, "dismiss", "dismiss()V", 0, 0, 17);
                        c13770e.m3682throws(c11212e);
                        m3681throw = c11212e;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC9528e.billing, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (c4320e.inmobi() != null) {
                        c13770e2.m3676strictfp(578527354);
                        c13770e2.Signature(false);
                        isVip = (String) c4320e.f9436e.getValue();
                    } else {
                        isVip = AbstractC4653e.isVip(c13770e2, 578638365, R.string.upload_track_no_title, c13770e2, false);
                    }
                    AbstractC6401e.metrica(isVip, null, 0L, 0L, null, c13770e2, 48, 28);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (c4320e.inmobi() != null) {
                        c13770e3.m3676strictfp(-822377992);
                        c13770e3.Signature(false);
                        isVip2 = (String) c4320e.f9439e.getValue();
                    } else {
                        isVip2 = AbstractC4653e.isVip(c13770e3, -822266051, R.string.upload_track_no_data, c13770e3, false);
                    }
                    AbstractC14489e.vip(isVip2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262142);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                boolean z2 = (intValue4 & 3) != 2;
                AbstractC7919e abstractC7919e = c13770e4.ad;
                if (c13770e4.m3673protected(intValue4 & 1, z2)) {
                    long j = AbstractC0903e.license(c13770e4).Signature;
                    C5100e c5100e = AbstractC10432e.ad;
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC16136e.metrica(c0115e, j, c5100e), 0.0f, 0.0f, 0.0f, ((C0916e) c13770e4.adcel(AbstractC12450e.ad)).ad(c13770e4), 7);
                    float f = 16;
                    C13964e billing = AbstractC16497e.billing(f);
                    C9577e c9577e = C5438e.f11672e;
                    C4789e ad = AbstractC14801e.ad(billing, c9577e, c13770e4, 6);
                    long j2 = c13770e4.f27286case;
                    int i2 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC3483e advert = c13770e4.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e4, loadAd);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    C14865e c14865e = C2721e.billing;
                    AbstractC2270e.yandex(c13770e4, ad, c14865e);
                    C14865e c14865e2 = C2721e.purchase;
                    AbstractC2270e.yandex(c13770e4, advert, c14865e2);
                    Integer valueOf = Integer.valueOf(i2);
                    C14865e c14865e3 = C2721e.adcel;
                    AbstractC2270e.yandex(c13770e4, valueOf, c14865e3);
                    C5430e c5430e = C2721e.mopub;
                    AbstractC2270e.purchase(c13770e4, c5430e);
                    C14865e c14865e4 = C2721e.license;
                    AbstractC2270e.yandex(c13770e4, purchase, c14865e4);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e4, 0);
                    long j3 = c13770e4.f27286case;
                    int i3 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert2 = c13770e4.advert();
                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e4, c0115e);
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, ad2, c14865e);
                    AbstractC2270e.yandex(c13770e4, advert2, c14865e2);
                    AbstractC8703e.premium(i3, c13770e4, c14865e3, c13770e4, c5430e);
                    AbstractC2270e.yandex(c13770e4, purchase2, c14865e4);
                    AbstractC10560e.license(AbstractC9528e.purchase, null, AbstractC16653e.license(-1128922028, new C3580e(c4320e, 0), c13770e4), AbstractC16653e.license(21562301, new C17963e(c4320e, 3), c13770e4), 0.0f, AbstractC3338e.ad, null, null, null, c13770e4, 200070, 466);
                    AbstractC8141e.vip(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0.0f, 0L, c13770e4, 6, 6);
                    C13770e c13770e5 = c13770e4;
                    c13770e5.Signature(true);
                    AbstractC0865e.ad(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), null, null, null, null, AbstractC16653e.license(-1722030702, new C17963e(c4320e, 4), c13770e5), c13770e5, 196614, 30);
                    if (((Boolean) c4320e.f9438e.getValue()).booleanValue()) {
                        c13770e5.m3676strictfp(-2119146297);
                        AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e5, R.string.error_not_mp3_info), null, AbstractC0903e.license(c13770e5).inmobi, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e5).amazon, c13770e5, 0, 0, 131066);
                        c13770e5 = c13770e5;
                        c13770e5.Signature(false);
                    } else {
                        if (((Boolean) c4320e.f9437e.getValue()).booleanValue()) {
                            c13770e5.m3676strictfp(-2118839893);
                            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e5, R.string.error_270_info), null, AbstractC0903e.license(c13770e5).inmobi, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e5).amazon, c13770e5, 0, 0, 131066);
                            c13770e5 = c13770e5;
                            z = false;
                        } else {
                            z = false;
                            c13770e5.m3676strictfp(-2134817634);
                        }
                        c13770e5.Signature(z);
                    }
                    InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2);
                    C16005e c16005e = AbstractC10244e.ad;
                    C13770e c13770e6 = c13770e5;
                    C3134e ad3 = AbstractC10244e.ad(AbstractC0903e.license(c13770e5).admob, AbstractC0903e.license(c13770e5).tapsense, 0L, 0L, c13770e6, 12);
                    C3924e c3924e = AbstractC0903e.purchase(c13770e6).metrica;
                    C16005e c16005e2 = new C16005e(f, f, f, f);
                    boolean yandex2 = c13770e6.yandex(c4320e);
                    Object m3681throw2 = c13770e6.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new C9949e(c4320e, 2);
                        c13770e6.m3682throws(m3681throw2);
                    }
                    AbstractC1513e.ad((Function0) m3681throw2, smaato, false, c3924e, ad3, null, null, c16005e2, AbstractC9528e.adcel, c13770e6, 817889328, 356);
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e6, R.string.upload_track_info), AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e6, 48, 0, 262140);
                    c13770e6.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                c4320e.tapsense((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e7 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e7.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean yandex3 = c13770e7.yandex(c4320e);
                    Object m3681throw3 = c13770e7.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        m3681throw3 = new C9949e(c4320e, 0);
                        c13770e7.m3682throws(m3681throw3);
                    }
                    AbstractC1513e.license((Function0) m3681throw3, null, false, null, null, null, AbstractC9528e.vip, c13770e7, 805306368, 510);
                } else {
                    c13770e7.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                c4320e.isVip((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
