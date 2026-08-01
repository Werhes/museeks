package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParser;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16279e {
    public static final C2892e ad = new C2892e(1361481567, false, new C11049e(14));
    public static final C2892e vip = new C2892e(-2102976832, false, new C9868e(4));

    public static final void ad(AudioContentCard audioContentCard, Function0 function0, Function0 function02, boolean z, C13770e c13770e, int i) {
        int i2;
        String appmetrica;
        String str;
        Object obj = audioContentCard.purchase;
        c13770e.m3671package(-774847672);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(audioContentCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.billing(z) ? 2048 : 1024;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 1043) != 1042)) {
            int i3 = AbstractC6290e.ad[audioContentCard.billing.ordinal()];
            if (i3 == 1) {
                c13770e.m3676strictfp(1962509579);
                boolean purchase = c13770e.purchase(obj);
                Object m3681throw = c13770e.m3681throw();
                Object obj2 = C2987e.ad;
                if (purchase || m3681throw == obj2) {
                    m3681throw = (Podcast) ((C3675e) function0.invoke()).amazon.get(audioContentCard.getAd());
                    c13770e.m3682throws(m3681throw);
                }
                Podcast podcast = (Podcast) m3681throw;
                if (podcast != null) {
                    String str2 = podcast.ad;
                    c13770e.m3676strictfp(1962662068);
                    boolean purchase2 = c13770e.purchase(obj);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (purchase2 || m3681throw2 == obj2) {
                        PodcastCover podcastCover = (PodcastCover) AbstractC13480e.m3604this(podcast.purchase);
                        m3681throw2 = podcastCover != null ? podcastCover.ad("c") : null;
                        c13770e.m3682throws(m3681throw2);
                    }
                    String str3 = (String) m3681throw2;
                    if (z && (str = audioContentCard.license) != null) {
                        str2 = str;
                    }
                    if (z) {
                        c13770e.m3676strictfp(1962998449);
                        c13770e.Signature(false);
                        appmetrica = audioContentCard.ad;
                        if (appmetrica == null) {
                            appmetrica = podcast.appmetrica;
                        }
                    } else {
                        c13770e.m3676strictfp(-1599243956);
                        appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.ctx_podcast);
                        c13770e.Signature(false);
                    }
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e adcel = z ? AbstractC18007e.adcel(c0115e, 300, 250) : AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex = c13770e.yandex(podcast);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (yandex || m3681throw3 == obj2) {
                        m3681throw3 = new C14515e(9, podcast);
                        c13770e.m3682throws(m3681throw3);
                    }
                    metrica((i2 << 3) & 57344, c13770e, adcel, str3, str2, appmetrica, (Function0) m3681throw3, z);
                } else {
                    c13770e.m3676strictfp(1960846522);
                }
                c13770e.Signature(false);
                c13770e.Signature(false);
            } else {
                if (i3 != 2) {
                    throw AbstractC1786e.loadAd(-1599263494, c13770e, false);
                }
                c13770e.m3676strictfp(1963471168);
                c13770e.Signature(false);
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13888e(audioContentCard, function0, function02, z, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.InterfaceC11128e adcel(android.content.res.XmlResourceParser r24, android.content.res.Resources r25) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16279e.adcel(android.content.res.XmlResourceParser, android.content.res.Resources):eُٝؐ");
    }

    public static final AbstractC1186e advert(AbstractC1186e abstractC1186e, InterfaceC2460e interfaceC2460e) {
        return (abstractC1186e.getAnnotations().isEmpty() && interfaceC2460e.isEmpty()) ? abstractC1186e : abstractC1186e.subscription().isVip(AbstractC1660e.m675throw(abstractC1186e.smaato(), interfaceC2460e));
    }

    public static void amazon(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final boolean appmetrica(AbstractC1186e abstractC1186e, InterfaceC5021e interfaceC5021e, Set set) {
        AbstractC16232e abstractC16232e;
        InterfaceC16046e interfaceC16046e;
        if (AbstractC7890e.billing(abstractC1186e.loadAd(), interfaceC5021e)) {
            return true;
        }
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        InterfaceC2978e interfaceC2978e = advert instanceof InterfaceC2978e ? (InterfaceC2978e) advert : null;
        List mo1221e = interfaceC2978e != null ? interfaceC2978e.mo1221e() : null;
        Iterable m3580e = AbstractC13480e.m3580e(abstractC1186e.mopub());
        if (!(m3580e instanceof Collection) || !((Collection) m3580e).isEmpty()) {
            Iterator it = m3580e.iterator();
            do {
                C2320e c2320e = (C2320e) it;
                if (c2320e.f5836e.hasNext()) {
                    C9817e c9817e = (C9817e) c2320e.next();
                    int i = c9817e.ad;
                    abstractC16232e = (AbstractC16232e) c9817e.vip;
                    interfaceC16046e = mo1221e != null ? (InterfaceC16046e) AbstractC13480e.m3592native(i, mo1221e) : null;
                }
            } while (!(((interfaceC16046e == null || set == null || !set.contains(interfaceC16046e)) && !abstractC16232e.metrica()) ? appmetrica(abstractC16232e.vip(), interfaceC5021e, set) : false));
            return true;
        }
        return false;
    }

    public static final void billing(AbstractC1186e abstractC1186e, AbstractC1186e abstractC1186e2, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        if (advert instanceof InterfaceC16046e) {
            if (!AbstractC7890e.billing(abstractC1186e.loadAd(), abstractC1186e2.loadAd())) {
                linkedHashSet.add(advert);
                return;
            }
            Iterator it = ((InterfaceC16046e) advert).getUpperBounds().iterator();
            while (it.hasNext()) {
                billing((AbstractC1186e) it.next(), abstractC1186e2, linkedHashSet, set);
            }
            return;
        }
        InterfaceC4077e advert2 = abstractC1186e.loadAd().advert();
        InterfaceC2978e interfaceC2978e = advert2 instanceof InterfaceC2978e ? (InterfaceC2978e) advert2 : null;
        List mo1221e = interfaceC2978e != null ? interfaceC2978e.mo1221e() : null;
        int i = 0;
        for (AbstractC16232e abstractC16232e : abstractC1186e.mopub()) {
            int i2 = i + 1;
            InterfaceC16046e interfaceC16046e = mo1221e != null ? (InterfaceC16046e) AbstractC13480e.m3592native(i, mo1221e) : null;
            if ((interfaceC16046e == null || set == null || !set.contains(interfaceC16046e)) && !abstractC16232e.metrica() && !AbstractC13480e.ads(linkedHashSet, abstractC16232e.vip().loadAd().advert()) && !AbstractC7890e.billing(abstractC16232e.vip().loadAd(), abstractC1186e2.loadAd())) {
                billing(abstractC16232e.vip(), abstractC1186e2, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final void license(final AbstractC16904e abstractC16904e, final InterfaceC12864e interfaceC12864e, InterfaceC12123e interfaceC12123e, final InterfaceC13730e interfaceC13730e, final float f, InterfaceC3886e interfaceC3886e, C9708e c9708e, boolean z, InterfaceC14906e interfaceC14906e, InterfaceC4978e interfaceC4978e, C11644e c11644e, final C2892e c2892e, C13770e c13770e, final int i) {
        final InterfaceC12123e interfaceC12123e2;
        final InterfaceC3886e interfaceC3886e2;
        final C9708e c9708e2;
        final boolean z2;
        final InterfaceC14906e interfaceC14906e2;
        final InterfaceC4978e interfaceC4978e2;
        final C11644e c11644e2;
        InterfaceC12123e c16005e;
        C9708e c9708e3;
        InterfaceC4978e interfaceC4978e3;
        InterfaceC3886e interfaceC3886e3;
        boolean z3;
        int i2;
        C11644e ad2;
        c13770e.m3671package(-1590376023);
        int i3 = i | (c13770e.purchase(abstractC16904e) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | 384 | (c13770e.purchase(interfaceC13730e) ? 2048 : 1024) | 911761408;
        if (c13770e.m3673protected(i3 & 1, (306783379 & i3) != 306783378)) {
            c13770e.m3655case();
            int i4 = i & 1;
            EnumC17426e enumC17426e = EnumC17426e.f34146e;
            if (i4 == 0 || c13770e.isPro()) {
                float f2 = 0;
                c16005e = new C16005e(f2, f2, f2, f2);
                C9577e c9577e = C5438e.f11678e;
                C9708e license = AbstractC12176e.license(abstractC16904e, null, c13770e, (i3 & 14) | 196608, 30);
                int i5 = (-29360129) & i3;
                C14734e appmetrica = AbstractC12176e.appmetrica(abstractC16904e, enumC17426e, c13770e, (i3 & 14) | 432);
                c9708e3 = license;
                interfaceC4978e3 = C17354e.f34049e;
                interfaceC14906e2 = appmetrica;
                interfaceC3886e3 = c9577e;
                z3 = true;
                i2 = i5;
                ad2 = AbstractC8281e.ad(c13770e);
            } else {
                c13770e.m3659default();
                i2 = i3 & (-29360129);
                c16005e = interfaceC12123e;
                interfaceC3886e3 = interfaceC3886e;
                c9708e3 = c9708e;
                z3 = z;
                interfaceC14906e2 = interfaceC14906e;
                interfaceC4978e3 = interfaceC4978e;
                ad2 = c11644e;
            }
            c13770e.admob();
            InterfaceC12123e interfaceC12123e3 = c16005e;
            AbstractC0250e.ad(interfaceC12864e, abstractC16904e, interfaceC12123e3, enumC17426e, c9708e3, z3, ad2, f, interfaceC13730e, interfaceC14906e2, interfaceC3886e3, C5438e.f11668e, interfaceC4978e3, c2892e, c13770e, ((i2 >> 3) & 14) | 24576 | ((i2 << 3) & 112) | 907545984, ((i2 >> 9) & 14) | 1797504);
            interfaceC12123e2 = interfaceC12123e3;
            c9708e2 = c9708e3;
            z2 = z3;
            c11644e2 = ad2;
            interfaceC3886e2 = interfaceC3886e3;
            interfaceC4978e2 = interfaceC4978e3;
        } else {
            c13770e.m3659default();
            interfaceC12123e2 = interfaceC12123e;
            interfaceC3886e2 = interfaceC3886e;
            c9708e2 = c9708e;
            z2 = z;
            interfaceC14906e2 = interfaceC14906e;
            interfaceC4978e2 = interfaceC4978e;
            c11644e2 = c11644e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(interfaceC12864e, interfaceC12123e2, interfaceC13730e, f, interfaceC3886e2, c9708e2, z2, interfaceC14906e2, interfaceC4978e2, c11644e2, c2892e, i) { // from class: eؒۧؑ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ float f4322e;

                /* renamed from: eٕؓۥ, reason: contains not printable characters */
                public final /* synthetic */ C2892e f4323e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12123e f4324e;

                /* renamed from: eؙؔٞ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC4978e f4325e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f4326e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ boolean f4327e;

                /* renamed from: eٍۗۛ, reason: contains not printable characters */
                public final /* synthetic */ C11644e f4328e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC13730e f4329e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC14906e f4330e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ C9708e f4332e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC3886e f4333e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC16279e.license(AbstractC16904e.this, this.f4326e, this.f4324e, this.f4329e, this.f4322e, this.f4333e, this.f4332e, this.f4327e, this.f4330e, this.f4325e, this.f4328e, this.f4323e, (C13770e) obj, AbstractC5190e.advert(196609));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void metrica(int i, C13770e c13770e, InterfaceC12864e interfaceC12864e, String str, String str2, String str3, Function0 function0, boolean z) {
        int i2;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(232455887);
        if ((i & 6) == 0) {
            i2 = (c13770e2.purchase(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e2.purchase(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e2.purchase(str3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e2.yandex(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e2.billing(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!c13770e2.m3673protected(i3 & 1, (74899 & i3) != 74898)) {
            c13770e2.m3659default();
        } else if (z) {
            c13770e2.m3676strictfp(1606327746);
            AbstractC0865e.license(function0, interfaceC12864e, false, null, AbstractC12322e.yandex(((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.subscription, 0L, c13770e2, 0, 14), null, null, AbstractC16653e.license(-1767705219, new C8124e(0, str, str2, str3), c13770e2), c13770e2, ((i3 >> 9) & 14) | 100663296 | ((i3 >> 12) & 112), 236);
            c13770e2.Signature(false);
        } else {
            c13770e2.m3676strictfp(1607967367);
            AbstractC16429e.ad(AbstractC16653e.license(55612685, new C11449e(str2, 1), c13770e2), AbstractC9546e.license(interfaceC12864e, false, null, function0, 15), null, AbstractC16653e.license(-1771445334, new C11449e(str3, 2), c13770e2), AbstractC16653e.license(482846857, new C6949e(str, str2, 10), c13770e2), null, null, 0.0f, 0.0f, c13770e, 27654, 484);
            c13770e2 = c13770e;
            c13770e2.Signature(false);
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C4982e(i, interfaceC12864e, str, str2, str3, function0, z);
        }
    }

    public static List mopub(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final C7878e purchase(AbstractC1186e abstractC1186e, int i, InterfaceC16046e interfaceC16046e) {
        if ((interfaceC16046e != null ? interfaceC16046e.mo2738e() : 0) == i) {
            i = 1;
        }
        return new C7878e(i, abstractC1186e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [eٕۛٙ] */
    public static final AbstractC15728e smaato(AbstractC1186e abstractC1186e) {
        AbstractC10226e abstractC10226e;
        AbstractC15728e subscription = abstractC1186e.subscription();
        if (subscription instanceof AbstractC14773e) {
            AbstractC14773e abstractC14773e = (AbstractC14773e) subscription;
            AbstractC10226e abstractC10226e2 = abstractC14773e.f29222e;
            if (!abstractC10226e2.loadAd().getParameters().isEmpty() && abstractC10226e2.loadAd().advert() != null) {
                List parameters = abstractC10226e2.loadAd().getParameters();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C15786e((InterfaceC16046e) it.next()));
                }
                abstractC10226e2 = AbstractC14430e.mopub(abstractC10226e2, arrayList, null, 2);
            }
            AbstractC10226e abstractC10226e3 = abstractC14773e.f29221e;
            if (!abstractC10226e3.loadAd().getParameters().isEmpty() && abstractC10226e3.loadAd().advert() != null) {
                List parameters2 = abstractC10226e3.loadAd().getParameters();
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C15786e((InterfaceC16046e) it2.next()));
                }
                abstractC10226e3 = AbstractC14430e.mopub(abstractC10226e3, arrayList2, null, 2);
            }
            abstractC10226e = AbstractC1596e.ad(abstractC10226e2, abstractC10226e3);
        } else {
            if (!(subscription instanceof AbstractC10226e)) {
                throw new C14803e(10);
            }
            AbstractC10226e abstractC10226e4 = (AbstractC10226e) subscription;
            boolean isEmpty = abstractC10226e4.loadAd().getParameters().isEmpty();
            abstractC10226e = abstractC10226e4;
            if (!isEmpty) {
                InterfaceC4077e advert = abstractC10226e4.loadAd().advert();
                abstractC10226e = abstractC10226e4;
                if (advert != null) {
                    List parameters3 = abstractC10226e4.loadAd().getParameters();
                    ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C15786e((InterfaceC16046e) it3.next()));
                    }
                    abstractC10226e = AbstractC14430e.mopub(abstractC10226e4, arrayList3, null, 2);
                }
            }
        }
        return AbstractC10653e.appmetrica(abstractC10226e, AbstractC10653e.vip(subscription));
    }

    public static final boolean startapp(InterfaceC16046e interfaceC16046e, InterfaceC5021e interfaceC5021e, Set set) {
        List<AbstractC1186e> upperBounds = interfaceC16046e.getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC1186e abstractC1186e : upperBounds) {
            if (appmetrica(abstractC1186e, interfaceC16046e.mo1458e().loadAd(), set) && (interfaceC5021e == null || AbstractC7890e.billing(abstractC1186e.loadAd(), interfaceC5021e))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final defpackage.AbstractC16904e r25, defpackage.InterfaceC12864e r26, defpackage.InterfaceC12123e r27, defpackage.InterfaceC13730e r28, float r29, defpackage.C14544e r30, defpackage.C9708e r31, boolean r32, defpackage.InterfaceC14906e r33, defpackage.InterfaceC4978e r34, defpackage.C11644e r35, final defpackage.C2892e r36, defpackage.C13770e r37, final int r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16279e.vip(eٍٗٝ, eّۤۧ, eِۦۦ, eًٓؓ, float, eؘِٔ, eٍۘۢ, boolean, eٔۗؕ, eؗٙۚ, eَِؚ, eؔ۟ٓ, eٓؕۥ, int, int, int):void");
    }

    public static final AbstractC1186e yandex(InterfaceC16046e interfaceC16046e) {
        Object obj;
        interfaceC16046e.getUpperBounds().isEmpty();
        Iterator it = interfaceC16046e.getUpperBounds().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC4077e advert = ((AbstractC1186e) next).loadAd().advert();
            InterfaceC5052e interfaceC5052e = advert instanceof InterfaceC5052e ? (InterfaceC5052e) advert : null;
            if (interfaceC5052e != null && interfaceC5052e.mo1724e() != 2 && interfaceC5052e.mo1724e() != 5) {
                obj = next;
                break;
            }
        }
        AbstractC1186e abstractC1186e = (AbstractC1186e) obj;
        return abstractC1186e == null ? (AbstractC1186e) AbstractC13480e.m3591interface(interfaceC16046e.getUpperBounds()) : abstractC1186e;
    }
}
