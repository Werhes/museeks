package defpackage;

import android.media.AudioManager;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2038e {
    public final C11467e Signature;
    public final AppActivity ad;
    public final C0576e adcel;
    public final C12894e admob;
    public final C14137e advert;
    public final C2616e amazon;
    public final C0576e appmetrica;
    public final C0576e billing;
    public final C0576e license;
    public final C0576e loadAd;
    public final C0576e metrica;
    public final C6540e mopub;
    public final C0576e purchase;
    public final C12742e smaato;
    public final C0576e startapp;
    public final C12805e subscription;
    public final C0916e vip = new C0916e();
    public final C0576e yandex;

    public C2038e(AppActivity appActivity) {
        Object c12763e;
        Object c12763e2;
        this.ad = appActivity;
        EnumC9430e enumC9430e = EnumC9430e.f18768e;
        this.metrica = AbstractC14533e.startapp(enumC9430e);
        this.license = AbstractC14533e.startapp(C2968e.ad);
        this.appmetrica = AbstractC14533e.startapp(null);
        try {
            AudioManager audioManager = (AudioManager) appActivity.getSystemService(AudioManager.class);
            c12763e = audioManager != null ? Integer.valueOf(audioManager.getStreamVolume(3)) : null;
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        Integer num = (Integer) (c12763e instanceof C12763e ? null : c12763e);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        try {
            AudioManager audioManager2 = (AudioManager) this.ad.getSystemService(AudioManager.class);
            c12763e2 = audioManager2 != null ? Integer.valueOf(audioManager2.getStreamMaxVolume(3)) : null;
        } catch (Throwable th2) {
            c12763e2 = new C12763e(th2);
        }
        Integer num2 = (Integer) (c12763e2 instanceof C12763e ? null : c12763e2);
        this.purchase = AbstractC14533e.startapp(new C16875e(new C0939e(BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, BuildConfig.FLAVOR, false, null, null), 0, EnumC11342e.f22810e, BuildConfig.FLAVOR, EnumC10286e.f20305e, false, false, false, false, false, null, false, false, intValue, num2 != null ? num2.intValue() : 1));
        this.billing = AbstractC14533e.startapp(C14609e.metrica);
        this.yandex = AbstractC14533e.startapp(null);
        this.startapp = AbstractC14533e.startapp(new C13177e(0.0f, i, i, 31));
        this.adcel = AbstractC14533e.startapp(new C3177e(C10327e.f20377e, 0));
        float f = AbstractC2241e.ad;
        this.mopub = new C6540e(true, AbstractC8424e.ad);
        this.advert = AbstractC12501e.ad(0, 2, null, 5);
        this.smaato = new C12742e();
        this.amazon = new C2616e(1.0f);
        this.loadAd = AbstractC14533e.startapp(Boolean.TRUE);
        this.Signature = new C11467e(2);
        this.admob = new C12894e(14);
        this.subscription = new C12805e();
        this.metrica.setValue(enumC9430e);
        this.license.setValue(new C13621e(this));
    }

    public static void advert(C14609e c14609e) {
        C7838e c7838e = VKXApplication.f36530e;
        InterfaceC5083e interfaceC5083e = null;
        if (c7838e == null) {
            c7838e = null;
        }
        String str = c14609e.ad;
        c7838e.getClass();
        c7838e.startapp(new C5176e(c7838e, str, interfaceC5083e, 7));
    }

    public static final void purchase(C2038e c2038e, AbstractC16049e abstractC16049e) {
        C12742e c12742e = c2038e.smaato;
        c12742e.clear();
        c12742e.add(EnumC18308e.f35963e);
        boolean z = abstractC16049e instanceof AudioTrack;
        if (z) {
            AudioTrack audioTrack = (AudioTrack) abstractC16049e;
            int i = audioTrack.vip;
            long j = audioTrack.metrica;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append('_');
            sb.append(i);
            String sb2 = sb.toString();
            C4199e m4502e = C18353e.vip.m4502e();
            if ((m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{sb2}, 1))) : null) != null) {
                c12742e.add(EnumC18308e.f35962e);
            } else {
                c12742e.add(EnumC18308e.f35965e);
            }
            c12742e.add(EnumC18308e.f35968e);
            EnumC18308e enumC18308e = EnumC18308e.f35967e;
            c12742e.add(enumC18308e);
            if (audioTrack.appmetrica() == 2) {
                c12742e.remove(enumC18308e);
            }
        }
        if (!z) {
            UmaTrack umaTrack = abstractC16049e instanceof UmaTrack ? (UmaTrack) abstractC16049e : null;
            String str = umaTrack != null ? umaTrack.pro : null;
            if (str == null || str.length() == 0) {
                return;
            }
        }
        c12742e.add(EnumC18308e.f35964e);
    }

    public final void ad(C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C2892e c2892e4, Function0 function0, C13770e c13770e, int i) {
        C2892e c2892e5;
        C2892e c2892e6;
        C2892e c2892e7;
        C2892e c2892e8;
        c13770e.m3671package(-642273693);
        int i2 = i | (c13770e.yandex(function0) ? 1048576 : 524288);
        if (c13770e.m3673protected(i2 & 1, (599187 & i2) != 599186)) {
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, license, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            c2892e5 = c2892e;
            c2892e5.invoke(c13770e, 6);
            c13770e.Signature(true);
            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), 16, 0.0f, 2);
            WeakHashMap weakHashMap = C8845e.isVip;
            InterfaceC12864e billing = AbstractC5400e.billing(AbstractC3752e.vip(smaato, new C10996e(C16728e.subscription(c13770e).advert, AbstractC17113e.purchase)), AbstractC5400e.billing);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(12), C5438e.f11668e, c13770e, 54);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, billing);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            AbstractC3199e.ad.invoke(c13770e, 6);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            C5228e c5228e = new C5228e(1.0f, true);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e, 0);
            long j3 = c13770e.f27286case;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert3 = c13770e.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, c5228e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert3, c14865e2);
            AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
            C5015e c5015e = AbstractC14489e.ad;
            C15492e c15492e = AbstractC11785e.ad;
            C14815e ad3 = c5015e.ad(((C7019e) c13770e.adcel(c15492e)).vip.adcel);
            C5015e c5015e2 = AbstractC0608e.ad;
            c2892e6 = c2892e2;
            AbstractC1101e.vip(new C14815e[]{ad3, AbstractC8703e.loadAd(((C7019e) c13770e.adcel(c15492e)).ad.admob, c5015e2)}, c2892e6, c13770e, 56);
            c2892e7 = c2892e3;
            AbstractC1101e.vip(new C14815e[]{c5015e.ad(((C7019e) c13770e.adcel(c15492e)).vip.mopub), AbstractC8703e.loadAd(((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, c5015e2)}, c2892e7, c13770e, 56);
            c13770e.Signature(true);
            c13770e.m3676strictfp(390094223);
            c2892e8 = c2892e4;
            c2892e8.invoke(c13770e, 6);
            c13770e.Signature(false);
            Unit unit = Unit.INSTANCE;
            AbstractC0014e.metrica(function0, null, false, null, null, null, AbstractC16653e.license(731464165, new C8171e(18), c13770e), c13770e, ((i2 >> 18) & 14) | 1572864, 62);
            c13770e.Signature(true);
        } else {
            c2892e5 = c2892e;
            c2892e6 = c2892e2;
            c2892e7 = c2892e3;
            c2892e8 = c2892e4;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2779e(this, c2892e5, c2892e6, c2892e7, c2892e8, function0, i);
        }
    }

    public final C14609e adcel() {
        return (C14609e) this.billing.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if ((r1 != null ? r1 : null).f798throw == 5) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void amazon(defpackage.EnumC2631e r9) {
        /*
            r8 = this;
            defpackage.AbstractC7122e.ad(r9)
            ua.itaysonlab.vkx.activity.AppActivity r0 = r8.ad
            eَٕٝ r1 = r0.f36542e
            eًۘٛ r2 = new eًۘٛ
            r3 = 4
            r2.<init>(r3)
            r1.metrica(r2)
            eؙۡؓ r0 = r0.f36546e
            boolean r1 = r0.vip()
            r2 = 1
            r3 = 5
            r4 = 0
            if (r1 != 0) goto L1c
            goto L4e
        L1c:
            com.google.android.material.bottomsheet.CustomBottomSheetBehavior r1 = r0.license
            if (r1 == 0) goto L22
            r5 = r1
            goto L23
        L22:
            r5 = r4
        L23:
            int r5 = r5.f798throw
            r6 = 4
            if (r5 == r6) goto L31
            if (r1 == 0) goto L2c
            r5 = r1
            goto L2d
        L2c:
            r5 = r4
        L2d:
            int r5 = r5.f798throw
            if (r5 != r3) goto L4e
        L31:
            if (r1 == 0) goto L35
            r5 = r1
            goto L36
        L35:
            r5 = r4
        L36:
            eؔٗۙ r7 = defpackage.EnumC2631e.f6497e
            if (r9 != r7) goto L43
            if (r1 == 0) goto L3d
            goto L3e
        L3d:
            r1 = r4
        L3e:
            r7 = 0
            r1.premium(r7)
            goto L4b
        L43:
            if (r1 == 0) goto L46
            goto L47
        L46:
            r1 = r4
        L47:
            r1.premium(r2)
            r6 = r3
        L4b:
            r5.crashlytics(r6)
        L4e:
            boolean r1 = r0.vip()
            if (r1 == 0) goto L69
            eؔٗۙ r1 = defpackage.EnumC2631e.f6496e
            if (r9 != r1) goto L69
            com.google.android.material.bottomsheet.CustomBottomSheetBehavior r9 = r0.license
            if (r9 == 0) goto L5d
            goto L5e
        L5d:
            r9 = r4
        L5e:
            r9.premium(r2)
            com.google.android.material.bottomsheet.CustomBottomSheetBehavior r9 = r0.license
            if (r9 == 0) goto L66
            r4 = r9
        L66:
            r4.crashlytics(r3)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2038e.amazon(eؔٗۙ):void");
    }

    public final void appmetrica(C2892e c2892e, C2892e c2892e2, boolean z, Function0 function0, C13770e c13770e, int i) {
        C2892e c2892e3;
        boolean z2 = z;
        c13770e.m3671package(-567513447);
        int i2 = i | (c13770e.billing(z2) ? 2048 : 1024) | (c13770e.yandex(function0) ? 16384 : 8192);
        if (c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, c0115e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, license, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            c2892e.invoke(c13770e, 6);
            c13770e.Signature(true);
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC18007e.metrica(c0115e, 1.0f), 0.0f, 0.0f, 16, 0.0f, 11);
            WeakHashMap weakHashMap = C8845e.isVip;
            InterfaceC12864e billing = AbstractC5400e.billing(AbstractC3752e.vip(loadAd, new C10996e(C16728e.subscription(c13770e).advert, AbstractC17113e.purchase)), AbstractC5400e.billing);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(12), C5438e.f11668e, c13770e, 54);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, billing);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            c2892e3 = c2892e2;
            c2892e3.invoke(C3533e.ad, c13770e, 54);
            c13770e.m3676strictfp(458224636);
            c13770e.Signature(false);
            z2 = z;
            AbstractC0014e.metrica(function0, null, false, null, null, null, AbstractC16653e.license(672379291, new C16027e(z2, 2), c13770e), c13770e, ((i2 >> 12) & 14) | 1572864, 62);
            c13770e.Signature(true);
        } else {
            c2892e3 = c2892e2;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2535e(this, c2892e, c2892e3, z2, function0, i);
        }
    }

    public final void billing() {
        if (mopub().metrica == EnumC11342e.f22808e) {
            C7838e c7838e = VKXApplication.f36530e;
            (c7838e != null ? c7838e : null).adcel();
        } else {
            C7838e c7838e2 = VKXApplication.f36530e;
            (c7838e2 != null ? c7838e2 : null).smaato();
        }
    }

    public final void license(C13770e c13770e, int i) {
        c13770e.m3671package(1182034700);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C11328e c11328e = VKXApplication.f36535e;
            if (c11328e == null) {
                c11328e = null;
            }
            InterfaceC1108e ad = ((InterfaceC8018e) ((C6325e) c11328e.f22772e).f13170e).ad();
            C11328e c11328e2 = VKXApplication.f36535e;
            ((C6325e) (c11328e2 != null ? c11328e2 : null).f22772e).getClass();
            C14528e.f28724e.getClass();
            InterfaceC3314e vip = AbstractC4628e.vip(ad, C14528e.f28723e, c13770e, 0);
            C16875e mopub = mopub();
            if (((Boolean) this.loadAd.getValue()).booleanValue() || !((C10876e) vip.getValue()).f21536e) {
                c13770e.m3676strictfp(-477079146);
            } else {
                c13770e.m3676strictfp(-440776720);
                AbstractC15946e.ad(c13770e, 0);
            }
            c13770e.Signature(false);
            AbstractC6022e.vip((C9553e) this.vip.metrica.getValue(), AbstractC16653e.license(-1334696552, new C9417e(this, mopub, 2), c13770e), c13770e, 48, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C18264e(this, i);
        }
    }

    public final void loadAd(C16875e c16875e) {
        this.purchase.setValue(c16875e);
    }

    public final void metrica(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        boolean z;
        c13770e.m3671package(-1583031439);
        int i2 = i | (c13770e.purchase(interfaceC12864e) ? 4 : 2) | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C13107e c13107e = (C13107e) this.yandex.getValue();
            if (c13107e != null) {
                c13770e.m3676strictfp(-1348463859);
                boolean purchase = c13770e.purchase(c13107e);
                Object m3681throw = c13770e.m3681throw();
                Object obj = C2987e.ad;
                if (purchase || m3681throw == obj) {
                    int i3 = c13107e.ad;
                    C10479e c10479e = new C10479e(10, c13107e);
                    float f = AbstractC1742e.ad;
                    Object c16349e = new C16349e(i3, 0.0f, c10479e);
                    c13770e.m3682throws(c16349e);
                    m3681throw = c16349e;
                }
                AbstractC16904e abstractC16904e = (AbstractC16904e) m3681throw;
                Integer valueOf = Integer.valueOf(abstractC16904e.loadAd());
                boolean purchase2 = c13770e.purchase(abstractC16904e) | c13770e.purchase(c13107e);
                Object m3681throw2 = c13770e.m3681throw();
                if (purchase2 || m3681throw2 == obj) {
                    m3681throw2 = new C4870e(abstractC16904e, c13107e, null, 9);
                    c13770e.m3682throws(m3681throw2);
                }
                AbstractC17680e.license(c13770e, valueOf, (Function2) m3681throw2);
                z = false;
                AbstractC16279e.vip(abstractC16904e, interfaceC12864e, null, null, 0.0f, null, null, false, null, null, null, AbstractC16653e.license(-1252185387, new C8035e(3, c13107e), c13770e), c13770e, (i2 << 3) & 112, 24576, 16380);
            } else {
                z = false;
                c13770e.m3676strictfp(-1390825359);
            }
            c13770e.Signature(z);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C10665e(this, interfaceC12864e, i, 1);
        }
    }

    public final C16875e mopub() {
        return (C16875e) this.purchase.getValue();
    }

    public final void smaato(C14609e c14609e) {
        AbstractC16049e abstractC16049e = c14609e.vip;
        boolean z = abstractC16049e instanceof AudioTrack;
        AppActivity appActivity = this.ad;
        if (z) {
            int i = C3566e.f8039e;
            AbstractC0890e.appmetrica((AudioTrack) abstractC16049e, new C14152e(this, c14609e, 0)).signatures(appActivity);
        } else if (abstractC16049e instanceof UmaTrack) {
            AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, false, new C1695e(c14609e, this, null, 19));
        }
    }

    public final C13177e startapp() {
        return (C13177e) this.startapp.getValue();
    }

    public final void vip(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(522250942);
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            AbstractC12121e.ad(interfaceC12864e, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC3199e.metrica, c13770e, 12582918, 126);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C10665e(this, interfaceC12864e, i, 0);
        }
    }

    public final void yandex() {
        C10301e.f20325e.ad();
        this.ad.f36546e.license(false);
        this.appmetrica.setValue(null);
        amazon(EnumC2631e.f6496e);
    }
}
