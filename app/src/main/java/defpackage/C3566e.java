package defpackage;

import android.app.Activity;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3566e extends AbstractC16997e {

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public static final /* synthetic */ int f8039e = 0;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f8040e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final InterfaceC8615e f8041e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C0576e f8042e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C15867e f8043e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final InterfaceC8346e f8044e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f8045e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C0576e f8046e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C13552e f8047e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final InterfaceC8346e f8048e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C14623e f8049e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C11683e f8050e;

    public C3566e(InterfaceC8615e interfaceC8615e) {
        super(false, 3);
        C13552e c13552e;
        this.f8041e = interfaceC8615e;
        InterfaceC1133e loadAd = interfaceC8615e.loadAd();
        if (loadAd != null) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            c13552e = new C13552e(loadAd, new C17011e(i2, this, C3566e.class, "dismiss", "dismiss()V", i3, i, 4), new C17011e(i2, this, C3566e.class, "onBackPressed", "onBackPressed()V", i3, i, 5));
        } else {
            c13552e = null;
        }
        this.f8047e = c13552e;
        this.f8050e = new C11683e(R.string.menu_linked_content_list, interfaceC8615e.adcel(), new C7604e(this, 3), new C17011e(0, this, C3566e.class, "getActivity", "getActivity()Landroid/app/Activity;", 0, 0, 3));
        this.f8040e = AbstractC14533e.startapp(EnumC10826e.f21460e);
        Boolean bool = Boolean.FALSE;
        this.f8045e = AbstractC14533e.startapp(bool);
        this.f8048e = interfaceC8615e.purchase();
        this.f8049e = interfaceC8615e.inmobi();
        this.f8044e = interfaceC8615e.amazon();
        this.f8042e = AbstractC14533e.startapp(bool);
        this.f8043e = new C15867e(-1L);
        this.f8046e = AbstractC14533e.startapp(BuildConfig.FLAVOR);
    }

    @Override // defpackage.AbstractC5004e
    public final void adcel() {
        EnumC10826e enumC10826e = (EnumC10826e) this.f8040e.getValue();
        EnumC10826e enumC10826e2 = EnumC10826e.f21460e;
        if (enumC10826e == enumC10826e2) {
            super.adcel();
        } else {
            m1377this(enumC10826e2);
        }
    }

    public final void ads(final C1490e c1490e, boolean z, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(711848886);
        int i2 = i | (c13770e.purchase(c1490e) ? 4 : 2) | (c13770e.billing(z) ? 32 : 16) | (c13770e.yandex(this) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = !c1490e.metrica || z;
            C2892e c2892e = !z2 ? AbstractC6143e.vip : null;
            boolean billing = c13770e.billing(z2) | ((i2 & 14) == 4) | c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (billing || m3681throw == C2987e.ad) {
                m3681throw = new C8610e(z2, c1490e, this, 2);
                c13770e.m3682throws(m3681throw);
            }
            final int i3 = 0;
            final int i4 = 1;
            AbstractC16429e.ad(AbstractC16653e.license(-351592684, new Function2() { // from class: eٍۗٝ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, c1490e.vip), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                C1490e c1490e2 = c1490e;
                                AbstractC5647e.vip(AbstractC12475e.metrica(c1490e2.ad, 0, c13770e3), AbstractC5297e.appmetrica(c13770e3, c1490e2.vip), null, 0L, c13770e3, 8, 12);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), AbstractC9546e.license(interfaceC12864e, false, null, (Function0) m3681throw, 15), null, null, AbstractC16653e.license(1393527320, new Function2() { // from class: eٍۗٝ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            C13770e c13770e2 = (C13770e) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, c1490e.vip), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                            } else {
                                c13770e2.m3659default();
                            }
                            return Unit.INSTANCE;
                        default:
                            C13770e c13770e3 = (C13770e) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (c13770e3.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                                C1490e c1490e2 = c1490e;
                                AbstractC5647e.vip(AbstractC12475e.metrica(c1490e2.ad, 0, c13770e3), AbstractC5297e.appmetrica(c13770e3, c1490e2.vip), null, 0L, c13770e3, 8, 12);
                            } else {
                                c13770e3.m3659default();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, c13770e), c2892e, null, 0.0f, 0.0f, c13770e, 24582, 460);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6242e(this, c1490e, z, interfaceC12864e, i, 3);
        }
    }

    public final void applovin(C14623e c14623e, boolean z, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        int i2;
        C3566e c3566e = this;
        c13770e.m3671package(1783073799);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c14623e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(c3566e) ? 2048 : 1024;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = Boolean.valueOf(c3566e.f8041e.subscription());
                c13770e.m3682throws(m3681throw);
            }
            boolean booleanValue = ((Boolean) m3681throw).booleanValue();
            boolean yandex = c13770e.yandex(c3566e);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == c5170e) {
                C17011e c17011e = new C17011e(0, this, C3566e.class, "navigateToLinked", "navigateToLinked()V", 0, 0, 2);
                c3566e = this;
                c13770e.m3682throws(c17011e);
                m3681throw2 = c17011e;
            }
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC0865e.vip((Function0) ((InterfaceC5261e) m3681throw2), interfaceC12864e, booleanValue, null, AbstractC12322e.vip(0L, 0L, ((C7019e) c13770e.adcel(c15492e)).ad.f18935goto, ((C7019e) c13770e.adcel(c15492e)).ad.admob, c13770e, 0, 3), null, null, AbstractC16653e.license(-305233028, new C0941e(c14623e, c3566e, booleanValue, z), c13770e), c13770e, ((i3 >> 3) & 112) | 100663680, 232);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13888e(c3566e, c14623e, z, interfaceC12864e, i, 3);
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final void m1374class(C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-1284876804);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean z = this.f8043e.purchase() > 0;
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C7604e(this, 4);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC6143e.metrica, AbstractC9546e.license(metrica, z, null, (Function0) m3681throw, 14), null, AbstractC16653e.license(-1183554403, new C9190e(this, 3), c13770e), AbstractC6143e.license, AbstractC16653e.license(-1999601633, new C14674e(this, z, 5), c13770e), null, 0.0f, 0.0f, c13770e, 224262, 452);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13752e(this, i, 0);
        }
    }

    public final void crashlytics(C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-87253200);
        int i2 = i & 1;
        if (c13770e.m3673protected(i2, i2 != 0)) {
            float f = 16;
            InterfaceC12864e amazon = AbstractC12220e.amazon(C0115e.f1276e, f, 32, f, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e, 48);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, amazon);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            c13770e2 = c13770e;
            AbstractC6574e.license(null, 0L, 0L, 0, 0.0f, c13770e2, 0, 31);
            c13770e2.Signature(true);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9190e(this, i, 2);
        }
    }

    public final void firebase(Function0 function0, Function0 function02, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(860462146);
        int i2 = i | (c13770e2.yandex(function0) ? 4 : 2) | (c13770e2.yandex(function02) ? 32 : 16);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC12864e smaato = AbstractC12220e.smaato(C0115e.f1276e, 16, 0.0f, 2);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e2, 0);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, smaato);
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
            AbstractC1513e.license(function0, null, false, null, null, null, AbstractC6143e.appmetrica, c13770e2, (i2 & 14) | 805306368, 510);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e2, new C5228e(1.0f, true));
            AbstractC1513e.ad(function02, null, false, null, null, null, null, null, AbstractC6143e.purchase, c13770e, ((i2 >> 3) & 14) | 805306368, 510);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C10172e(this, function0, function02, i, 2);
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m1375goto() {
        if (((Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue()).booleanValue()) {
            m1377this(EnumC10826e.f21456e);
        } else {
            new C9745e().signatures(this.f10582e);
            purchase();
        }
    }

    public final void inmobi(InterfaceC8346e interfaceC8346e, boolean z, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        InterfaceC12864e interfaceC12864e2;
        C3566e c3566e = this;
        c13770e.m3671package(-1202174514);
        boolean z2 = z;
        int i2 = i | (c13770e.purchase(interfaceC8346e) ? 4 : 2) | (c13770e.billing(z2) ? 32 : 16) | (c13770e.yandex(c3566e) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e, 0);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            interfaceC12864e2 = interfaceC12864e;
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e2);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            c13770e.m3676strictfp(-190584926);
            Iterator<E> it = interfaceC8346e.iterator();
            while (it.hasNext()) {
                C1637e c1637e = (C1637e) it.next();
                if (1.0f <= 0.0d) {
                    AbstractC9534e.ad("invalid weight; must be greater than zero");
                }
                C5228e c5228e = new C5228e(1.0f, true);
                boolean purchase2 = c13770e.purchase(c1637e) | c13770e.yandex(c3566e);
                Object m3681throw = c13770e.m3681throw();
                if (purchase2 || m3681throw == C2987e.ad) {
                    m3681throw = new C5625e(c1637e, c3566e, 1);
                    c13770e.m3682throws(m3681throw);
                }
                c3566e.isVip(c1637e, z2, AbstractC9546e.license(c5228e, false, null, (Function0) m3681throw, 15), c13770e, i2 & 7280);
                c3566e = this;
                z2 = z;
            }
            c13770e.Signature(false);
            c13770e.Signature(true);
        } else {
            interfaceC12864e2 = interfaceC12864e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6242e(this, interfaceC8346e, z, interfaceC12864e2, i, 2);
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m1376interface() {
        Activity activity = this.f10582e;
        AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
        if (appActivity != null) {
            appActivity.firebase();
        }
        purchase();
    }

    public final void isPro(InterfaceC8346e interfaceC8346e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(301788189);
        int i2 = (c13770e2.purchase(interfaceC8346e) ? 4 : 2) | i | (c13770e2.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            InterfaceC3314e license = AbstractC4628e.license((C14688e) AbstractC1831e.ad().purchase.yandex, c13770e2, 0);
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(C0115e.f1276e, 0.0f, 0.0f, 0.0f, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).ad(c13770e2), 7);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e2, 48);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, loadAd);
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
            C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e2, 196608, 31);
            boolean yandex = c13770e2.yandex(this) | c13770e2.purchase(license) | ((i2 & 14) == 4);
            Object m3681throw = c13770e2.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new Cthrows(10, interfaceC8346e, this, license);
                c13770e2.m3682throws(m3681throw);
            }
            AbstractC7023e.ad(null, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e, 0, 511);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C1743e(this, interfaceC8346e, i, 14);
        }
    }

    public final void isVip(C1637e c1637e, boolean z, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C1637e c1637e2;
        long j;
        c13770e.m3671package(1769076753);
        int i2 = i | (c13770e.purchase(c1637e) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        int i3 = i2 | (c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = !c1637e.license || z;
            if (c1637e.metrica) {
                c13770e.m3676strictfp(-724279752);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
            } else {
                c13770e.m3676strictfp(-724278502);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob;
            }
            c13770e.Signature(false);
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11700e, false);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
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
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            C13964e billing = AbstractC16497e.billing(4);
            C9577e c9577e = C5438e.f11678e;
            float f = 16;
            InterfaceC12864e ad = AbstractC1376e.ad(AbstractC12220e.loadAd(C0115e.f1276e, 0.0f, f, 0.0f, f, 5), z2 ? 1.0f : 0.5f);
            C4789e ad2 = AbstractC14801e.ad(billing, c9577e, c13770e, 54);
            boolean z3 = z2;
            long j3 = c13770e.f27286case;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, ad);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i5, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            c1637e2 = c1637e;
            AbstractC1101e.ad(AbstractC8703e.loadAd(j, AbstractC0608e.ad), AbstractC16653e.license(-955640115, new C14674e(c1637e2, z3, 3), c13770e), c13770e, 56);
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            c1637e2 = c1637e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13888e(this, c1637e2, z, interfaceC12864e, i, 2);
        }
    }

    public final void premium(Function0 function0, Function0 function02, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-59216108);
        int i2 = i | (c13770e2.yandex(function0) ? 4 : 2) | (c13770e2.yandex(function02) ? 32 : 16) | (c13770e2.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            float f = 16;
            float ad = ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).ad(c13770e2) + f;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e, 0.0f, 0.0f, 0.0f, ad, 7);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11678e, c13770e2, 48);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, loadAd);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e2, 196608, 31);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.cache_remove_title);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            applovin(this.f8049e, false, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), c13770e, ((i2 << 3) & 7168) | 432);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 8));
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.cache_remove_desc_generic), AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 48, 0, 131064);
            c13770e2 = c13770e;
            AbstractC12534e.ad(c13770e2, AbstractC18007e.license(c0115e, f));
            firebase(function0, function02, c13770e2, i2 & 1022);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C10172e(this, function0, function02, i, 0);
        }
    }

    public final void subs(Function0 function0, Function0 function02, C13770e c13770e, int i) {
        Function0 function03;
        Function0 function04;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1676093299);
        int i2 = i | (c13770e2.yandex(function0) ? 4 : 2) | (c13770e2.yandex(function02) ? 32 : 16) | (c13770e2.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            float f = 16;
            float ad = ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).ad(c13770e2) + f;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e, 0.0f, 0.0f, 0.0f, ad, 7);
            C9577e c9577e = C5438e.f11678e;
            C9616e c9616e = AbstractC16497e.metrica;
            C4789e ad2 = AbstractC14801e.ad(c9616e, c9577e, c13770e2, 48);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, loadAd);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e2, 196608, 31);
            InterfaceC12864e purchase2 = AbstractC5967e.purchase(c0115e, AbstractC5967e.appmetrica(c13770e2), true);
            C4789e ad3 = AbstractC14801e.ad(c9616e, c9577e, c13770e2, 48);
            long j2 = c13770e2.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, purchase2);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad3, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase3, c14865e4);
            String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.library_remove_title);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
            c13770e2 = c13770e;
            AbstractC12534e.ad(c13770e2, AbstractC18007e.license(c0115e, f));
            applovin(this.f8049e, false, AbstractC12220e.smaato(AbstractC18007e.metrica(c0115e, 1.0f), f, 0.0f, 2), c13770e2, ((i2 << 3) & 7168) | 432);
            AbstractC12534e.ad(c13770e2, AbstractC18007e.license(c0115e, 8));
            m1374class(c13770e2, (i2 >> 6) & 14);
            AbstractC12534e.ad(c13770e2, AbstractC18007e.license(c0115e, f));
            function03 = function0;
            function04 = function02;
            firebase(function03, function04, c13770e2, i2 & 1022);
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            function03 = function0;
            function04 = function02;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C10172e(this, function03, function04, i, 1);
        }
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-1183202326);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == c5170e) {
                m3681throw2 = new C4870e(this, null, 8);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw2);
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(505837103, new C0205e(this, startapp, interfaceC18435e, 3), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9190e(this, i, 1);
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final void m1377this(EnumC10826e enumC10826e) {
        this.f8040e.setValue(enumC10826e);
    }
}
