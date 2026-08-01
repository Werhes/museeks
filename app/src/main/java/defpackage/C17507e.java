package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17507e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7537e f34329e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34330e = 0;

    public /* synthetic */ C17507e(C7537e c7537e) {
        this.f34329e = c7537e;
    }

    public /* synthetic */ C17507e(C7537e c7537e, int i) {
        this.f34329e = c7537e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        C13770e c13770e;
        switch (this.f34330e) {
            case 0:
                C13770e c13770e2 = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    float f = 16;
                    float ad = ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).ad(c13770e2) + f;
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e, 0.0f, 0.0f, 0.0f, ad, 7);
                    C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e2, 48);
                    long j = c13770e2.f27286case;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e2.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, loadAd);
                    InterfaceC5685e.mopub.getClass();
                    Function0 function0 = C2721e.vip;
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(function0);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
                    AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e2, Integer.valueOf(i), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                    C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e2, 196608, 31);
                    C7537e c7537e = this.f34329e;
                    AbstractC16049e abstractC16049e = c7537e.f15363e;
                    AudioTrack audioTrack = abstractC16049e instanceof AudioTrack ? (AudioTrack) abstractC16049e : null;
                    String appmetrica = AbstractC5297e.appmetrica(c13770e2, (audioTrack == null || audioTrack.appmetrica() != 2) ? R.string.lyrics : R.string.lyrics_podcast);
                    AbstractC4455e abstractC4455e = AbstractC11785e.ad;
                    AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(abstractC4455e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(abstractC4455e)).vip.appmetrica, c13770e2, 48, 0, 130040);
                    C13770e c13770e3 = c13770e2;
                    AbstractC12534e.ad(c13770e3, AbstractC18007e.license(c0115e, f));
                    Object obj3 = (InterfaceC2558e) c7537e.f15364e.getValue();
                    if (obj3 instanceof C10874e) {
                        c13770e3.m3676strictfp(1450173692);
                        c7537e.isVip((C10874e) obj3, AbstractC18007e.metrica, c13770e3, 48);
                        c13770e3.Signature(false);
                        z = true;
                        c13770e = c13770e3;
                    } else {
                        boolean z2 = obj3 instanceof C0160e;
                        Object obj4 = C2987e.ad;
                        if (z2) {
                            c13770e3.m3676strictfp(1450432139);
                            C0160e c0160e = (C0160e) obj3;
                            if (1.0f <= 0.0d) {
                                AbstractC9534e.ad("invalid weight; must be greater than zero");
                            }
                            c7537e.isPro(c0160e, new C5228e(1.0f, true), c13770e3, 0);
                            AbstractC8141e.vip(null, 0.0f, 0L, c13770e3, 0, 7);
                            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2);
                            z = true;
                            InterfaceC12864e loadAd2 = AbstractC12220e.loadAd(smaato, 0.0f, f, 0.0f, 0.0f, 13);
                            C16005e c16005e = new C16005e(f, f, f, f);
                            C3924e c3924e = ((C7019e) c13770e3.adcel(abstractC4455e)).metrica.metrica;
                            boolean purchase2 = c13770e3.purchase(obj3) | c13770e3.yandex(c7537e);
                            Object m3681throw = c13770e3.m3681throw();
                            if (purchase2 || m3681throw == obj4) {
                                m3681throw = new C1708e(c0160e, c7537e, 3);
                                c13770e3.m3682throws(m3681throw);
                            }
                            AbstractC1513e.ad((Function0) m3681throw, loadAd2, false, c3924e, null, null, null, c16005e, AbstractC1129e.ad, c13770e3, 817889328, 372);
                            C13770e c13770e4 = c13770e3;
                            c13770e4.Signature(false);
                            c13770e = c13770e4;
                        } else {
                            z = true;
                            if (AbstractC7890e.billing(obj3, C5842e.INSTANCE)) {
                                c13770e3.m3676strictfp(1451451760);
                                c7537e.inmobi(AbstractC18007e.metrica, AbstractC12475e.metrica(R.drawable.ic_globe_outline_28, 0, c13770e3), AbstractC5297e.appmetrica(c13770e3, R.string.error_occurred), c13770e3, 70);
                                c13770e3.Signature(false);
                                c13770e = c13770e3;
                            } else if (AbstractC7890e.billing(obj3, C2471e.INSTANCE)) {
                                c13770e3.m3676strictfp(1451817963);
                                c7537e.inmobi(AbstractC18007e.metrica, AbstractC12475e.metrica(R.drawable.ic_clear_data_outline_28, 0, c13770e3), AbstractC5297e.appmetrica(c13770e3, R.string.lrc_not_found), c13770e3, 70);
                                c13770e3.Signature(false);
                                c13770e = c13770e3;
                            } else {
                                if (obj3 != null) {
                                    throw AbstractC1786e.loadAd(1709347165, c13770e3, false);
                                }
                                c13770e3.m3676strictfp(1452197093);
                                Unit unit = Unit.INSTANCE;
                                boolean yandex = c13770e3.yandex(c7537e);
                                Object m3681throw2 = c13770e3.m3681throw();
                                if (yandex || m3681throw2 == obj4) {
                                    m3681throw2 = new C17806e(c7537e, null, 15);
                                    c13770e3.m3682throws(m3681throw2);
                                }
                                AbstractC17680e.license(c13770e3, unit, (Function2) m3681throw2);
                                AbstractC0436e.ad(c0115e, false, 0L, c13770e3, 6, 6);
                                c13770e3.Signature(false);
                                c13770e = c13770e3;
                            }
                        }
                    }
                    c13770e.Signature(z);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f34329e.tapsense((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
