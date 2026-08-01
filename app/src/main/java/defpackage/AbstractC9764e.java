package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9764e {
    public static final void ad(boolean z, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(41794234);
        int i2 = i | (c13770e2.billing(z) ? 4 : 2) | (c13770e2.yandex(function0) ? 32 : 16) | (c13770e2.yandex(function02) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e2, 0);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, C0115e.f1276e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            if (z) {
                c13770e2.m3676strictfp(-1306120340);
            } else {
                c13770e2.m3676strictfp(-1300292588);
                AbstractC1513e.license(function0, null, false, null, null, null, AbstractC16082e.vip, c13770e, ((i2 >> 3) & 14) | 805306368, 510);
                c13770e2 = c13770e;
            }
            c13770e2.Signature(false);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e2, new C5228e(1.0f, true));
            AbstractC1513e.ad(function02, null, false, null, null, null, null, null, AbstractC16082e.metrica, c13770e2, ((i2 >> 6) & 14) | 805306368, 510);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C4004e(z, function0, function02, i, 0);
        }
    }

    public static final Rect adcel(C10163e c10163e) {
        return new Rect(c10163e.ad, c10163e.vip, c10163e.metrica, c10163e.license);
    }

    public static final C0763e advert(Rect rect) {
        return new C0763e(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final void appmetrica(C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1332562301);
        if (c13770e2.m3673protected(i & 1, i != 0)) {
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11672e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i2 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i2), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.ota_card_title);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.ota_card_text), AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.adcel, c13770e, 48, 0, 130040);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C15584e(i, 2);
        }
    }

    public static String billing(String str) {
        if (str != null) {
            return new C9271e(str, (List) null).vip();
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static final void license(int i, C13770e c13770e, boolean z) {
        c13770e.m3671package(-1495004923);
        int i2 = (c13770e.billing(z) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            String appmetrica = AbstractC5297e.appmetrica(c13770e, z ? R.string.ota_card_disclaimer_critical : R.string.ota_card_disclaimer);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC12220e.loadAd(C0115e.f1276e, 0.0f, 16, 0.0f, 0.0f, 13), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 48, 0, 131064);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16027e(i, 8, z);
        }
    }

    public static final void metrica(String str, int i, String str2, C5228e c5228e, C13770e c13770e, int i2) {
        c13770e.m3671package(530521343);
        int i3 = i2 | (c13770e.purchase(str) ? 4 : 2) | (c13770e.license(i) ? 32 : 16) | (c13770e.purchase(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(c5228e) ? 2048 : 1024);
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C8462e(27);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC0865e.vip((Function0) m3681throw, AbstractC18007e.metrica(c5228e, 1.0f), false, null, AbstractC12322e.vip(0L, 0L, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription, 0L, c13770e, 0, 11), null, null, AbstractC16653e.license(264376500, new C10844e(str2, i, str), c13770e), c13770e, 100663686, 232);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(str, i, str2, c5228e, i2);
        }
    }

    public static final RectF mopub(C0763e c0763e) {
        return new RectF(c0763e.ad, c0763e.vip, c0763e.metrica, c0763e.license);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static final void purchase(C12781e c12781e, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        ?? r4;
        C0115e c0115e;
        float f;
        Function0 function03 = function0;
        Function0 function04 = function02;
        c13770e.m3671package(-769886139);
        int i2 = i | (c13770e.yandex(c12781e) ? 4 : 2) | (c13770e.yandex(function03) ? 32 : 16) | (c13770e.yandex(function04) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = (C5789e) c12781e.get();
                c13770e.m3682throws(m3681throw);
            }
            C5789e c5789e = (C5789e) m3681throw;
            float f2 = 16;
            float ad = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f2;
            C0115e c0115e2 = C0115e.f1276e;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e2, f2, 0.0f, f2, ad, 2);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e, 48);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, loadAd);
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
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            boolean z = c5789e.billing;
            if (z) {
                c13770e.m3676strictfp(-976656014);
                AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e2, f2));
                c13770e.Signature(false);
                f = f2;
                r4 = 0;
                c0115e = c0115e2;
            } else {
                c13770e.m3676strictfp(-976585861);
                r4 = 0;
                c0115e = c0115e2;
                f = f2;
                C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e, 196608, 31);
                c13770e.Signature(false);
            }
            appmetrica(c13770e, r4);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            if (c5789e.metrica) {
                c13770e.m3676strictfp(-976429869);
                vip(c13770e, r4);
                AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            } else {
                c13770e.m3676strictfp(-978662861);
            }
            c13770e.Signature(r4);
            String str = c5789e.vip;
            int i4 = c5789e.ad;
            String str2 = c5789e.license;
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            metrica(str, i4, str2, new C5228e(1.0f, r4), c13770e, 0);
            license(r4, c13770e, z);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            function03 = function0;
            function04 = function02;
            ad(z, function03, function04, c13770e, i2 & 1008);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C18522e(i, 14, c12781e, function03, function04);
        }
    }

    public static final C0763e smaato(RectF rectF) {
        return new C0763e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final AbstractC15728e startapp(ArrayList arrayList) {
        AbstractC10226e abstractC10226e;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (AbstractC15728e) AbstractC13480e.m3589import(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC15728e abstractC15728e = (AbstractC15728e) it.next();
            z = z || AbstractC4520e.purchase(abstractC15728e);
            if (abstractC15728e instanceof AbstractC10226e) {
                abstractC10226e = (AbstractC10226e) abstractC15728e;
            } else {
                if (!(abstractC15728e instanceof AbstractC14773e)) {
                    throw new C14803e(10);
                }
                abstractC10226e = ((AbstractC14773e) abstractC15728e).f29222e;
                z2 = true;
            }
            arrayList2.add(abstractC10226e);
        }
        if (z) {
            return C18139e.vip(EnumC16799e.f32930e, arrayList.toString());
        }
        C12983e c12983e = C12983e.ad;
        if (!z2) {
            return c12983e.vip(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC9600e.license((AbstractC15728e) it2.next()));
        }
        return AbstractC1596e.ad(c12983e.vip(arrayList2), c12983e.vip(arrayList3));
    }

    public static final void vip(C13770e c13770e, int i) {
        c13770e.m3671package(-212355961);
        int i2 = 1;
        if (c13770e.m3673protected(i & 1, i != 0)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C8462e(26);
                c13770e.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) m3681throw;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
            Resources resources = (Resources) c13770e.adcel(AbstractC2676e.metrica);
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = AbstractC16340e.ad;
            AbstractC0865e.vip(function0, metrica, false, null, AbstractC12322e.vip(0L, 0L, AbstractC6532e.vip(resources.getColor(R.color.blue_alpha, theme)), 0L, c13770e, 0, 11), null, null, AbstractC16082e.ad, c13770e, 100663734, 232);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15584e(i, i2);
        }
    }

    public static InterfaceC12864e yandex(InterfaceC12864e interfaceC12864e, C15274e c15274e) {
        return interfaceC12864e.premium(new C6149e(c15274e));
    }
}
