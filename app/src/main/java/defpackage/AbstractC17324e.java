package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.io.InputStream;
import java.text.DecimalFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۡؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17324e {
    public static final C11648e ad(C1362e c1362e) {
        Canvas canvas = AbstractC16863e.ad;
        C11648e c11648e = new C11648e();
        c11648e.ad = new Canvas(AbstractC11815e.vip(c1362e));
        return c11648e;
    }

    public static final long appmetrica(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static C7285e billing(InputStream inputStream) {
        C15420e c15420e = AbstractC6731e.ad;
        ExecutorC3603e executorC3603e = ExecutorC3603e.f8134e;
        int i = AbstractC17232e.ad;
        int i2 = AbstractC4691e.ad;
        return new C7285e(new C2331e(1, inputStream));
    }

    public static final InterfaceC12864e license(InterfaceC12864e interfaceC12864e, Function1 function1) {
        return interfaceC12864e.premium(new C5326e(function1));
    }

    public static final void metrica(AudioTrack audioTrack, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        Integer num;
        C7309e c7309e;
        boolean z;
        Integer num2;
        AudioTrack audioTrack2 = audioTrack;
        C13770e c13770e2 = c13770e;
        int i2 = audioTrack2.appmetrica;
        long j = audioTrack2.mopub;
        PodcastInfo podcastInfo = audioTrack2.isPro;
        c13770e2.m3671package(-1644179983);
        int i3 = i | (c13770e2.purchase(audioTrack2) ? 4 : 2) | (c13770e2.purchase(interfaceC12864e) ? 32 : 16);
        if (c13770e2.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            C15492e c15492e = AbstractC2676e.vip;
            Context context = (Context) c13770e2.adcel(c15492e);
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC4628e.purchase(context, R.drawable.placeholder_audio);
                c13770e2.m3682throws(m3681throw);
            }
            AbstractC10727e ad = AbstractC6845e.ad((Drawable) m3681throw, c13770e2);
            boolean appmetrica = c13770e2.appmetrica(j);
            Object m3681throw2 = c13770e2.m3681throw();
            if (appmetrica || m3681throw2 == c5170e) {
                m3681throw2 = AbstractC13510e.metrica(context, j);
                c13770e2.m3682throws(m3681throw2);
            }
            String str = (String) m3681throw2;
            boolean license = c13770e2.license(i2) | c13770e2.purchase(podcastInfo);
            Object m3681throw3 = c13770e2.m3681throw();
            if (license || m3681throw3 == c5170e) {
                m3681throw3 = Integer.valueOf(i2 - ((podcastInfo == null || (num = podcastInfo.appmetrica) == null) ? 0 : num.intValue()));
                c13770e2.m3682throws(m3681throw3);
            }
            int intValue = ((Number) m3681throw3).intValue();
            boolean license2 = c13770e2.license(intValue);
            Object m3681throw4 = c13770e2.m3681throw();
            if (license2 || m3681throw4 == c5170e) {
                DecimalFormat decimalFormat = C5575e.ad;
                m3681throw4 = AbstractC15920e.subs(intValue, false);
                c13770e2.m3682throws(m3681throw4);
            }
            String str2 = (String) m3681throw4;
            float f = 16;
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11672e, c13770e2, 6);
            long j2 = c13770e2.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e2 = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e2);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            C14544e c14544e = C5438e.f11668e;
            C8587e ad3 = AbstractC6451e.ad(AbstractC16497e.billing(f), c14544e, c13770e2, 54);
            long j3 = c13770e2.f27286case;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, c0115e);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e2);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad3, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i5, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            C5944e c5944e = new C5944e((Context) c13770e2.adcel(c15492e));
            c5944e.metrica = audioTrack2;
            c5944e.license(300);
            AbstractC8461e.vip(c5944e.ad(), null, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, 48), AbstractC6549e.ad(8)), ad, ad, null, c13770e, 36912, 0, 32736);
            AbstractC14489e.vip(audioTrack2.license, null, AbstractC0903e.license(c13770e).admob, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e, 0, 24960, 241658);
            c13770e.Signature(true);
            String str3 = podcastInfo != null ? podcastInfo.license : null;
            if (str3 == null) {
                str3 = BuildConfig.FLAVOR;
            }
            AbstractC14489e.vip(str3, AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.license(c13770e).remoteconfig, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, AbstractC0903e.billing(c13770e).amazon, c13770e, 48, 24960, 110584);
            float f2 = 2;
            C8587e ad4 = AbstractC6451e.ad(AbstractC16497e.billing(f2), c14544e, c13770e, 54);
            long j4 = c13770e.f27286case;
            int i6 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c0115e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c7309e = c7309e2;
                c13770e.mopub(c7309e);
            } else {
                c7309e = c7309e2;
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad4, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC13501e.mopub(i6, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            C7309e c7309e3 = c7309e;
            AbstractC14489e.vip(str, null, AbstractC0903e.license(c13770e).admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).amazon, c13770e, 0, 0, 131066);
            AbstractC14489e.vip(" • ", null, AbstractC0903e.license(c13770e).admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e).amazon, c13770e, 6, 0, 131066);
            c13770e2 = c13770e;
            if (intValue <= 0) {
                c13770e2.m3676strictfp(-1638372048);
                AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_check, 0, c13770e2), null, AbstractC18007e.startapp(c0115e, f), AbstractC0903e.license(c13770e2).ad, c13770e2, 440, 0);
                c13770e2.Signature(false);
                z = true;
                audioTrack2 = audioTrack;
            } else {
                if (((podcastInfo == null || (num2 = podcastInfo.appmetrica) == null) ? 0 : num2.intValue()) > 0) {
                    c13770e2.m3676strictfp(-1638018679);
                    int i7 = 6;
                    C8587e ad5 = AbstractC6451e.ad(AbstractC16497e.billing(6), c14544e, c13770e2, 54);
                    long j5 = c13770e2.f27286case;
                    int i8 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC3483e advert4 = c13770e2.advert();
                    InterfaceC12864e purchase4 = AbstractC5679e.purchase(c13770e2, c0115e);
                    c13770e2.m3666import();
                    if (c13770e2.f27292implements) {
                        c13770e2.mopub(c7309e3);
                    } else {
                        c13770e2.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e2, ad5, c14865e);
                    AbstractC2270e.yandex(c13770e2, advert4, c14865e2);
                    AbstractC13501e.mopub(i8, c13770e2, c14865e3, c13770e2, c5430e);
                    AbstractC2270e.yandex(c13770e2, purchase4, c14865e4);
                    InterfaceC12864e vip = AbstractC12447e.vip(AbstractC18007e.license(AbstractC18007e.smaato(c0115e, 72), f2), AbstractC6549e.ad);
                    float f3 = 0;
                    long j6 = AbstractC0903e.license(c13770e2).ad;
                    long j7 = AbstractC0903e.license(c13770e2).remoteconfig;
                    boolean z2 = (i3 & 14) == 4;
                    Object m3681throw5 = c13770e2.m3681throw();
                    if (z2 || m3681throw5 == c5170e) {
                        m3681throw5 = new C12908e(audioTrack, 5);
                        c13770e2.m3682throws(m3681throw5);
                    }
                    Function0 function0 = (Function0) m3681throw5;
                    Object m3681throw6 = c13770e2.m3681throw();
                    if (m3681throw6 == c5170e) {
                        m3681throw6 = new C2091e(i7);
                        c13770e2.m3682throws(m3681throw6);
                    }
                    AbstractC6574e.vip(function0, vip, j6, j7, 2, f3, (Function1) m3681throw6, c13770e, 1769472, 0);
                    audioTrack2 = audioTrack;
                    AbstractC14489e.vip(AbstractC5297e.license(R.string.book_left, new Object[]{str2}, c13770e), AbstractC18007e.metrica(c0115e, 1.0f), AbstractC0903e.license(c13770e).admob, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC0903e.billing(c13770e).amazon, c13770e, 48, 24960, 110584);
                    c13770e2 = c13770e;
                    c13770e2.Signature(true);
                    c13770e2.Signature(false);
                } else {
                    audioTrack2 = audioTrack;
                    c13770e2.m3676strictfp(-1636782182);
                    AbstractC14489e.vip(str2, null, AbstractC0903e.license(c13770e2).admob, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC0903e.billing(c13770e2).amazon, c13770e, 0, 0, 131066);
                    c13770e2 = c13770e;
                    c13770e2.Signature(false);
                }
                z = true;
            }
            c13770e2.Signature(z);
            c13770e2.Signature(z);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C10902e(audioTrack2, interfaceC12864e, i, 10);
        }
    }

    public static final long purchase(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final long vip(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }
}
