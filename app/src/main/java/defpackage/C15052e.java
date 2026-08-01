package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15052e extends AbstractC10347e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C0576e f29820e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final long f29821e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final InterfaceC8346e f29822e;

    public C15052e() {
        super(0);
        this.f29821e = AbstractC6532e.license(4293083434L);
        this.f29820e = AbstractC14533e.startapp(m3907transient());
        List singletonList = Collections.singletonList(new C5215e(R.drawable.ic_door_arrow_right_outline_28, R.string.auth2_acc_manager_entry_title, R.string.auth2_acc_manager_entry_text, null, new C15326e(this, 11), 24));
        List startapp = AbstractC6874e.startapp(new C5215e(R.drawable.ic_users_outline_28, R.string.nmenu_profiles, R.string.nmenu_profiles_desc, null, new C15326e(this, 14), 24), new C5215e(R.drawable.ic_archive_outline_28, R.string.nmenu_catalogs, R.string.nmenu_catalogs_desc, null, new C15326e(this, 0), 24), new C5215e(R.drawable.ic_statistics_outline_28, R.string.rec_screen, R.string.rec_screen_desc, null, new C15326e(this, 1), 24), new C5215e(R.drawable.ic_podcast_outline_28, R.string.nmenu_podcasts, R.string.nmenu_podcasts_desc, null, new C15326e(this, 2), 24), new C5215e(R.drawable.ic_play_cards_2_outline_28, R.string.snippets, 0, null, new C15326e(this, 3), 28));
        List startapp2 = AbstractC6874e.startapp(new C5215e(R.drawable.ic_smartphone_outline_28, R.string.nmenu_local, R.string.nmenu_local_desc, null, new C15326e(this, 4), 24), new C5215e(R.drawable.ic_help_outline_28, R.string.quickfix_title, R.string.quickfix_description, null, new C15326e(this, 5), 24), new C5215e(R.drawable.ic_services_outline_28, R.string.account_category, R.string.account_category_desc, null, new C15326e(this, 6), 24), new C5215e(R.drawable.ic_settings_outline_28, R.string.nmenu_prefs, R.string.nmenu_prefs_desc, null, new C15326e(this, 7), 24), new C5215e(R.drawable.ic_info_outline_28, R.string.nmenu_about, 0, "VK X 8.12.1_pub (99167)", new C15326e(this, 12), 20));
        SharedPreferences sharedPreferences = AbstractC6181e.ad;
        this.f29822e = AbstractC8228e.metrica(AbstractC13480e.m3584final(AbstractC13480e.m3584final(AbstractC13480e.m3584final(singletonList, startapp), startapp2), AbstractC6181e.ad(EnumC7437e.f15207e) ? Collections.singletonList(new C5215e(R.drawable.ic_bug_outline_28, R.string.dbg_title, 0, BuildConfig.FLAVOR, new C15326e(this, 13), 20)) : C13664e.f27089e));
    }

    /* renamed from: transient, reason: not valid java name */
    public static C10594e m3907transient() {
        C14027e.ad.getClass();
        String license = C14027e.license();
        String str = "@id" + C14027e.metrica();
        C8221e c8221e = VKXApplication.f36536e;
        if (c8221e == null) {
            c8221e = null;
        }
        return new C10594e(license, str, ((C18479e) c8221e.billing).adcel);
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(344978497);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC3314e license = AbstractC4628e.license((C14688e) AbstractC1831e.ad().purchase.appmetrica, c13770e, 0);
            InterfaceC3314e license2 = AbstractC4628e.license((C14688e) AbstractC1831e.ad().purchase.yandex, c13770e, 0);
            InterfaceC3314e license3 = AbstractC4628e.license((C14688e) AbstractC1831e.ad().purchase.billing, c13770e, 0);
            InterfaceC16879e interfaceC16879e = (InterfaceC16879e) c13770e.adcel(AbstractC11473e.appmetrica);
            InterfaceC0804e interfaceC0804e = (InterfaceC0804e) license.getValue();
            C1642e c1642e = C1642e.ad;
            int i3 = (AbstractC7890e.billing(interfaceC0804e, c1642e) && ((Boolean) license2.getValue()).booleanValue()) ? 2 : AbstractC7890e.billing(interfaceC0804e, c1642e) ? 3 : 1;
            AbstractC13348e.ad(null, AbstractC16653e.license(-1140133379, new C3617e(this, interfaceC16879e, i3, 0), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-1053334510, new C10844e(this, i3, license3), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16915e(this, i);
        }
    }

    @Override // defpackage.AbstractC13859e
    public final void isVip() {
        InterfaceC5083e interfaceC5083e = null;
        C9042e c9042e = new C9042e(this, interfaceC5083e, 1);
        C5981e c5981e = AbstractC15448e.ad;
        C11318e c11318e = new C11318e(new C5786e(AbstractC15448e.vip, 0), new C13301e(c9042e, interfaceC5083e, 4), 3);
        C4891e c4891e = this.f27449e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, EnumC7785e.f15779e), AbstractC4608e.metrica(c4891e));
    }

    /* renamed from: package, reason: not valid java name */
    public final void m3908package(int i, int i2, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        long j;
        long j2;
        long j3;
        int i3;
        c13770e.m3671package(-922431132);
        int i4 = i2 | (c13770e.license(AbstractC8703e.m2467class(i)) ? 4 : 2) | (c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i4 & 1, (i4 & 147) != 146)) {
            int m2467class = AbstractC8703e.m2467class(i);
            long j4 = this.f29821e;
            if (m2467class == 0) {
                c13770e.m3676strictfp(-1693048142);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription;
                c13770e.Signature(false);
            } else if (m2467class == 1) {
                c13770e.m3676strictfp(-1693045813);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.ad;
                c13770e.Signature(false);
            } else {
                if (m2467class != 2) {
                    throw AbstractC1786e.loadAd(-1693050622, c13770e, false);
                }
                c13770e.m3676strictfp(-1693044494);
                c13770e.Signature(false);
                j = j4;
            }
            int m2467class2 = AbstractC8703e.m2467class(i);
            if (m2467class2 == 0) {
                c13770e.m3676strictfp(-1693040142);
                j2 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.subscription;
                c13770e.Signature(false);
            } else if (m2467class2 == 1) {
                c13770e.m3676strictfp(-1693037790);
                j2 = AbstractC7893e.billing(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad, 48);
                c13770e.Signature(false);
            } else {
                if (m2467class2 != 2) {
                    throw AbstractC1786e.loadAd(-1693042527, c13770e, false);
                }
                c13770e.m3676strictfp(-1693035221);
                j2 = AbstractC2835e.ad(j4, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature, 48);
                c13770e.Signature(false);
            }
            int m2467class3 = AbstractC8703e.m2467class(i);
            if (m2467class3 == 0) {
                c13770e.m3676strictfp(-1693029013);
                j3 = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature;
                c13770e.Signature(false);
            } else if (m2467class3 == 1) {
                c13770e.m3676strictfp(-1693026879);
                j3 = AbstractC7893e.billing(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad, 2);
                c13770e.Signature(false);
            } else {
                if (m2467class3 != 2) {
                    throw AbstractC1786e.loadAd(-1693031400, c13770e, false);
                }
                c13770e.m3676strictfp(-1693024342);
                j3 = AbstractC2835e.ad(j4, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.Signature, 2);
                c13770e.Signature(false);
            }
            long j5 = j3;
            String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.bc_v2_m_title);
            int m2467class4 = AbstractC8703e.m2467class(i);
            if (m2467class4 == 0) {
                i3 = R.string.bc_v2_m_desc_unload;
            } else if (m2467class4 == 1) {
                i3 = R.string.bc_v2_m_desc_paid;
            } else {
                if (m2467class4 != 2) {
                    throw new C14803e(10);
                }
                i3 = R.string.bc_v2_m_desc_unpaid;
            }
            String appmetrica2 = AbstractC5297e.appmetrica(c13770e, i3);
            C3924e c3924e = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.metrica;
            C2892e license = AbstractC16653e.license(2046941952, new C15431e(j, 0), c13770e);
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C15326e(this, 10);
                c13770e.m3682throws(m3681throw);
            }
            m3910strictfp(license, appmetrica, appmetrica2, interfaceC12864e, c3924e, j5, j2, (Function0) m3681throw, c13770e, ((i4 << 18) & 234881024) | 3078);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(this, i, interfaceC12864e, i2, 0);
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m3909private(final boolean z, final int i, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i2) {
        c13770e.m3671package(-1275633405);
        int i3 = i2 | (c13770e.billing(z) ? 4 : 2) | (c13770e.license(i) ? 32 : 16) | (c13770e.yandex(this) ? 2048 : 1024);
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            final int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            AbstractC0865e.ad(interfaceC12864e, null, null, null, null, AbstractC16653e.license(-1438440971, new Function3() { // from class: eٗۦٗ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C13770e c13770e2 = (C13770e) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                        InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
                        InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                        long j = c13770e2.f27286case;
                        int i4 = (int) (j ^ (j >>> 32));
                        InterfaceC3483e advert = c13770e2.advert();
                        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, metrica);
                        InterfaceC5685e.mopub.getClass();
                        C7309e c7309e = C2721e.vip;
                        c13770e2.m3666import();
                        if (c13770e2.f27292implements) {
                            c13770e2.mopub(c7309e);
                        } else {
                            c13770e2.m3684volatile();
                        }
                        AbstractC2270e.yandex(c13770e2, license, C2721e.billing);
                        AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                        AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
                        AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                        AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
                        Boolean valueOf = Boolean.valueOf(z);
                        int i5 = startapp;
                        boolean license2 = c13770e2.license(i5);
                        Object m3681throw = c13770e2.m3681throw();
                        if (license2 || m3681throw == C2987e.ad) {
                            m3681throw = new C17028e(i5, 1);
                            c13770e2.m3682throws(m3681throw);
                        }
                        Function1 function1 = (Function1) m3681throw;
                        final C15052e c15052e = this;
                        final int i6 = i;
                        AbstractC7572e.vip(valueOf, null, function1, null, BuildConfig.FLAVOR, null, AbstractC16653e.license(-281177730, new Function4() { // from class: eًۘ٘
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                boolean booleanValue = ((Boolean) obj5).booleanValue();
                                C13770e c13770e3 = (C13770e) obj6;
                                ((Integer) obj7).getClass();
                                C0115e c0115e = C0115e.f1276e;
                                if (booleanValue) {
                                    c13770e3.m3676strictfp(-1379489718);
                                    AbstractC6574e.license(AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), 16), 0L, 0L, 0, 0.0f, c13770e3, 6, 30);
                                    c13770e3.Signature(false);
                                } else {
                                    c13770e3.m3676strictfp(-1379331680);
                                    C14544e c14544e = C5438e.f11668e;
                                    C13964e billing = AbstractC16497e.billing(4);
                                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                                    C15052e c15052e2 = C15052e.this;
                                    boolean yandex = c13770e3.yandex(c15052e2);
                                    int i7 = i6;
                                    boolean license3 = yandex | c13770e3.license(i7);
                                    Object m3681throw2 = c13770e3.m3681throw();
                                    if (license3 || m3681throw2 == C2987e.ad) {
                                        m3681throw2 = new C8779e(c15052e2, i7, 0);
                                        c13770e3.m3682throws(m3681throw2);
                                    }
                                    InterfaceC12864e mopub = AbstractC12220e.mopub(AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), 16);
                                    C8587e ad = AbstractC6451e.ad(billing, c14544e, c13770e3, 54);
                                    long j2 = c13770e3.f27286case;
                                    int i8 = (int) (j2 ^ (j2 >>> 32));
                                    InterfaceC3483e advert2 = c13770e3.advert();
                                    InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, mopub);
                                    InterfaceC5685e.mopub.getClass();
                                    C7309e c7309e2 = C2721e.vip;
                                    c13770e3.m3666import();
                                    if (c13770e3.f27292implements) {
                                        c13770e3.mopub(c7309e2);
                                    } else {
                                        c13770e3.m3684volatile();
                                    }
                                    AbstractC2270e.yandex(c13770e3, ad, C2721e.billing);
                                    AbstractC2270e.yandex(c13770e3, advert2, C2721e.purchase);
                                    AbstractC2270e.yandex(c13770e3, Integer.valueOf(i8), C2721e.adcel);
                                    AbstractC2270e.purchase(c13770e3, C2721e.mopub);
                                    AbstractC2270e.yandex(c13770e3, purchase2, C2721e.license);
                                    float f = 20;
                                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_notifications_28, 0, c13770e3), null, AbstractC18007e.startapp(c0115e, f), 0L, c13770e3, 440, 8);
                                    String appmetrica = AbstractC5297e.appmetrica(c13770e3, R.string.spark_inbox);
                                    if (1.0f <= 0.0d) {
                                        AbstractC9534e.ad("invalid weight; must be greater than zero");
                                    }
                                    AbstractC14489e.vip(appmetrica, AbstractC12220e.smaato(new C5228e(1.0f, true), 8, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e3, 0, 0, 262140);
                                    C13770e c13770e4 = c13770e3;
                                    if (i7 > 0) {
                                        c13770e4.m3676strictfp(1511452483);
                                        C15492e c15492e = AbstractC11785e.ad;
                                        AbstractC17480e.ad(null, ((C7019e) c13770e4.adcel(c15492e)).ad.ad, ((C7019e) c13770e4.adcel(c15492e)).ad.admob, AbstractC16653e.license(-1687872210, new C14362e(i7, 2), c13770e4), c13770e4, 3072);
                                        c13770e4 = c13770e4;
                                    } else {
                                        c13770e4.m3676strictfp(1491156876);
                                    }
                                    c13770e4.Signature(false);
                                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_chevron_right, 0, c13770e4), null, AbstractC18007e.startapp(c0115e, f), 0L, c13770e4, 440, 8);
                                    c13770e4.Signature(true);
                                    c13770e4.Signature(false);
                                }
                                return Unit.INSTANCE;
                            }
                        }, c13770e2), c13770e2, 1597440, 42);
                        c13770e2.Signature(true);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, 196614, 30);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11935e(this, z, i, interfaceC12864e, i2, 0);
        }
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m3910strictfp(final C2892e c2892e, final String str, final String str2, final InterfaceC12864e interfaceC12864e, final InterfaceC16154e interfaceC16154e, final long j, final long j2, final Function0 function0, C13770e c13770e, final int i) {
        int i2;
        c13770e.m3671package(-1767554794);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(c2892e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.purchase(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(interfaceC16154e) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= c13770e.appmetrica(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c13770e.appmetrica(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= c13770e.yandex(function0) ? 8388608 : 4194304;
        }
        if (c13770e.m3673protected(i2 & 1, (4793491 & i2) != 4793490)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            int i3 = i2 >> 9;
            AbstractC0865e.ad(interfaceC12864e, interfaceC16154e, AbstractC12322e.vip(j, 0L, 0L, 0L, c13770e, (i2 >> 15) & 14, 14), null, AbstractC16619e.ad(1, j2), AbstractC16653e.license(1243329416, new C12050e(function0, c2892e, str, str2, 18), c13770e), c13770e, (i3 & 14) | 196608 | (i3 & 112), 8);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eِۜۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C15052e.this.m3910strictfp(c2892e, str, str2, interfaceC12864e, interfaceC16154e, j, j2, function0, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
