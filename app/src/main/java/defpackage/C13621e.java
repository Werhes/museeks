package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۥؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13621e implements InterfaceC12031e {
    public final C2038e ad;
    public final C0576e appmetrica;
    public final C0576e license;
    public final C0576e metrica;
    public final C0576e vip;

    public C13621e(C2038e c2038e) {
        this.ad = c2038e;
        EnumC10483e enumC10483e = EnumC10483e.f20707e;
        this.vip = AbstractC14533e.startapp(enumC10483e);
        this.metrica = AbstractC14533e.startapp(enumC10483e);
        Boolean bool = Boolean.FALSE;
        this.license = AbstractC14533e.startapp(bool);
        this.appmetrica = AbstractC14533e.startapp(bool);
    }

    @Override // defpackage.InterfaceC12031e
    public final void ad(C13770e c13770e, int i) {
        C13621e c13621e;
        long j;
        c13770e.m3671package(1153530198);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C11328e c11328e = VKXApplication.f36535e;
            InterfaceC5083e interfaceC5083e = null;
            if (c11328e == null) {
                c11328e = null;
            }
            InterfaceC1108e ad = ((InterfaceC8018e) ((C6325e) c11328e.f22772e).f13170e).ad();
            C11328e c11328e2 = VKXApplication.f36535e;
            if (c11328e2 == null) {
                c11328e2 = null;
            }
            ((C6325e) c11328e2.f22772e).getClass();
            C14528e.f28724e.getClass();
            InterfaceC3314e vip = AbstractC4628e.vip(ad, C14528e.f28723e, c13770e, 0);
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            C2038e c2038e = this.ad;
            C16875e mopub = c2038e.mopub();
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw;
            Boolean bool = (Boolean) this.license.getValue();
            bool.getClass();
            EnumC10483e amazon = amazon();
            boolean yandex = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == c5170e) {
                m3681throw2 = new C9042e(this, interfaceC5083e, 0);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.appmetrica(bool, amazon, (Function2) m3681throw2, c13770e);
            boolean z = amazon() != EnumC10483e.f20707e;
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex2 || m3681throw3 == c5170e) {
                m3681throw3 = new C17762e(this, 1);
                c13770e.m3682throws(m3681throw3);
            }
            AbstractC9186e.ad(z, (Function0) m3681throw3, c13770e, 0);
            boolean booleanValue = ((Boolean) this.appmetrica.getValue()).booleanValue();
            boolean yandex3 = c13770e.yandex(this);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex3 || m3681throw4 == c5170e) {
                m3681throw4 = new C17762e(this, 2);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC9186e.ad(booleanValue, (Function0) m3681throw4, c13770e, 0);
            if (((C10876e) vip.getValue()).f21545e == EnumC5778e.f12228e) {
                c13770e.m3676strictfp(785889577);
                j = ((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob;
                c13770e.Signature(false);
            } else if (((C10876e) vip.getValue()).f21545e == EnumC5778e.f12225e && ((C10876e) vip.getValue()).f21535e == EnumC11700e.LIGHT) {
                c13770e.m3676strictfp(786168577);
                c13770e.Signature(false);
                j = C3618e.vip;
            } else {
                c13770e.m3676strictfp(786217185);
                c13770e.Signature(false);
                j = C3618e.appmetrica;
            }
            long isPro = ((C10876e) vip.getValue()).f21547e ? c2038e.Signature.isPro() : j;
            c13621e = this;
            AbstractC3577e.ad(j, isPro, AbstractC16653e.license(5312848, new C7303e(this, startapp, mopub, vip, interfaceC18435e), c13770e), c13770e, 384);
        } else {
            c13621e = this;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C12612e(c13621e, i, 2);
        }
    }

    public final void adcel(boolean z, C2892e c2892e, C2892e c2892e2, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C2892e c2892e3;
        c13770e.m3671package(1879550361);
        int i2 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.purchase(interfaceC12864e) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            Boolean valueOf = Boolean.valueOf(z);
            boolean license = c13770e.license(startapp);
            Object m3681throw = c13770e.m3681throw();
            if (license || m3681throw == C2987e.ad) {
                m3681throw = new C17028e(startapp, 0);
                c13770e.m3682throws(m3681throw);
            }
            c2892e3 = c2892e2;
            AbstractC7572e.vip(valueOf, interfaceC12864e, (Function1) m3681throw, null, "[AbsolutionNP] Menu expand", null, AbstractC16653e.license(-1379025892, new C6358e(c2892e, c2892e2, 4), c13770e), c13770e, (i2 & 14) | 1597440 | ((i2 >> 6) & 112), 40);
        } else {
            c2892e3 = c2892e2;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2535e(this, z, c2892e, c2892e3, interfaceC12864e, i, 1);
        }
    }

    public final void advert(boolean z, Function1 function1, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-947962726);
        if ((i & 6) == 0) {
            i2 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = C12563e.ad;
            long j = C3618e.startapp;
            C15492e c15492e = AbstractC3577e.ad;
            AbstractC0014e.vip(z, function1, null, false, ((C7019e) c13770e.adcel(AbstractC11785e.ad)).metrica.metrica, C12563e.license(j, ((C0896e) c13770e.adcel(c15492e)).ad, ((C0896e) c13770e.adcel(c15492e)).license, ((C0896e) c13770e.adcel(c15492e)).ad, c13770e), AbstractC7640e.license(c13770e), c2892e, c13770e, (i3 & 126) | ((i3 << 15) & 29360128), 12);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C13888e(this, z, function1, c2892e, i);
        }
    }

    public final EnumC10483e amazon() {
        return (EnumC10483e) this.vip.getValue();
    }

    public final void appmetrica(final int i, final int i2, final float f, final boolean z, C13770e c13770e, final int i3) {
        int i4;
        c13770e.m3671package(-1334066723);
        if ((i3 & 6) == 0) {
            i4 = (c13770e.license(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c13770e.license(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c13770e.metrica(f) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c13770e.yandex(this) ? 16384 : 8192;
        }
        if (c13770e.m3673protected(i4 & 1, (i4 & 8339) != 8338)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C2616e(0.0f);
                c13770e.m3682throws(m3681throw);
            }
            C2616e c2616e = (C2616e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = AbstractC17861e.adcel(c13770e);
            }
            C15274e c15274e = (C15274e) m3681throw2;
            final float purchase = (((Boolean) AbstractC13083e.vip(c15274e, c13770e, 6).getValue()).booleanValue() || ((Boolean) AbstractC12547e.appmetrica(c15274e, c13770e, 6).getValue()).booleanValue()) ? c2616e.purchase() : i;
            AbstractC18275e.metrica(AbstractC16653e.license(-607101070, new C12043e(i2, purchase, this, c15274e, c2616e), c13770e), AbstractC16653e.license(-1647392909, new Function2() { // from class: eْۢؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        InterfaceC16132e vip = AbstractC16102e.vip(f, null, BuildConfig.FLAVOR, null, c13770e2, 3072, 22);
                        AbstractC4455e abstractC4455e = AbstractC3577e.ad;
                        long j = ((C0896e) c13770e2.adcel(abstractC4455e)).metrica;
                        long j2 = ((C0896e) c13770e2.adcel(abstractC4455e)).license;
                        float f2 = 8;
                        InterfaceC12864e loadAd = AbstractC12220e.loadAd(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), f2, 22, f2, 0.0f, 8);
                        float f3 = 0;
                        boolean purchase2 = c13770e2.purchase(vip);
                        Object m3681throw3 = c13770e2.m3681throw();
                        Object obj3 = C2987e.ad;
                        if (purchase2 || m3681throw3 == obj3) {
                            m3681throw3 = new C1166e(vip, 0);
                            c13770e2.m3682throws(m3681throw3);
                        }
                        Function0 function0 = (Function0) m3681throw3;
                        Object m3681throw4 = c13770e2.m3681throw();
                        if (m3681throw4 == obj3) {
                            m3681throw4 = new C14099e(1);
                            c13770e2.m3682throws(m3681throw4);
                        }
                        AbstractC6574e.vip(function0, loadAd, j, j2, 2, f3, (Function1) m3681throw4, c13770e2, 1769472, 0);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), AbstractC16653e.license(1607282548, new Function2() { // from class: eٍؖۙ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C13770e c13770e2 = (C13770e) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                        AbstractC18275e.vip((int) purchase, i2, c13770e2, 0);
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, 438);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٌٔٗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    C13621e.this.appmetrica(i, i2, f, z, (C13770e) obj, AbstractC5190e.advert(i3 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void billing(int i, C2892e c2892e, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i2;
        c13770e.m3671package(-1203396246);
        if ((i & 6) == 0) {
            i2 = i | (c13770e.yandex(c2892e) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(16), C5438e.f11685e, c13770e, 6);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
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
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            C7913e c7913e = AbstractC18007e.vip;
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.purchase, C5438e.f11678e, c13770e, 54);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, c7913e);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            c2892e.invoke(c13770e, Integer.valueOf(i2 & 14));
            c13770e.Signature(true);
            AbstractC8141e.appmetrica(null, 0.0f, ((C0896e) c13770e.adcel(AbstractC3577e.ad)).license, c13770e, 0, 3);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0233e(this, c2892e, interfaceC12864e, i, 1);
        }
    }

    public final void license(C0939e c0939e, C2892e c2892e, C2892e c2892e2, C2892e c2892e3, C2892e c2892e4, C2892e c2892e5, C2892e c2892e6, C13770e c13770e, int i) {
        c13770e.m3671package(923320485);
        int i2 = i | (c13770e.purchase(c0939e) ? 4 : 2) | (c13770e.yandex(this) ? 8388608 : 4194304);
        if (c13770e.m3673protected(i2 & 1, (4793491 & i2) != 4793490)) {
            AbstractC9835e.appmetrica(AbstractC5400e.billing(AbstractC18007e.metrica, AbstractC5400e.startapp), c2892e, c2892e4, AbstractC16653e.license(-1666407883, new C5656e(c0939e, this), c13770e), AbstractC16653e.license(-906273644, new C5656e(this, c0939e), c13770e), c2892e3, c2892e2, c2892e6, c2892e5, c13770e, 115043760);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16219e(this, c0939e, c2892e, c2892e2, c2892e3, c2892e4, c2892e5, c2892e6, i);
        }
    }

    public final void metrica(final InterfaceC12864e interfaceC12864e, final EnumC10286e enumC10286e, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, C13770e c13770e, final int i) {
        int i2;
        boolean z8;
        boolean z9;
        c13770e.m3671package(46084757);
        if ((i & 6) == 0) {
            i2 = i | (c13770e.purchase(interfaceC12864e) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (c13770e.license(enumC10286e == null ? -1 : enumC10286e.ordinal()) ? 32 : 16) | (c13770e.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.billing(z2) ? 2048 : 1024) | (c13770e.billing(z3) ? 16384 : 8192) | (c13770e.billing(z4) ? 131072 : 65536) | (c13770e.billing(z5) ? 1048576 : 524288) | (c13770e.billing(z6) ? 8388608 : 4194304) | (c13770e.billing(z7) ? 67108864 : 33554432) | (c13770e.yandex(this) ? 536870912 : 268435456);
        if (c13770e.m3673protected(i3 & 1, (306783379 & i3) != 306783378)) {
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.purchase, C5438e.f11668e, c13770e, 54);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
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
            AbstractC2270e.yandex(c13770e, ad, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            C2038e c2038e = this.ad;
            C0115e c0115e = C0115e.f1276e;
            C5170e c5170e = C2987e.ad;
            if (z6) {
                c13770e.m3676strictfp(-297212159);
                boolean yandex = c13770e.yandex(c2038e);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == c5170e) {
                    m3681throw = new Cvolatile(0, c2038e, C2038e.class, "cycleRepeat", "cycleRepeat()V", 0, 0, 1);
                    c13770e.m3682throws(m3681throw);
                }
                AbstractC1129e.metrica(enumC10286e, (Function0) ((InterfaceC5261e) m3681throw), c13770e, (i3 >> 3) & 14);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-297035583);
                AbstractC12534e.ad(c13770e, c0115e);
                c13770e.Signature(false);
            }
            if (z5) {
                z8 = false;
                c13770e.m3676strictfp(-343969583);
            } else {
                c13770e.m3676strictfp(-296953464);
                if (z4) {
                    c13770e.m3676strictfp(-296925657);
                    boolean yandex2 = c13770e.yandex(c2038e);
                    Object m3681throw2 = c13770e.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new Cvolatile(0, c2038e, C2038e.class, "skipBackwards", "skipBackwards()V", 0, 0, 2);
                        c13770e.m3682throws(m3681throw2);
                    }
                    z8 = false;
                    AbstractC1129e.appmetrica((Function0) ((InterfaceC5261e) m3681throw2), c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(-296814553);
                    boolean yandex3 = c13770e.yandex(c2038e);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        m3681throw3 = new Cvolatile(0, c2038e, C2038e.class, "skipToPrevious", "skipToPrevious()V", 0, 0, 3);
                        c13770e.m3682throws(m3681throw3);
                    }
                    z8 = false;
                    AbstractC1129e.yandex((Function0) ((InterfaceC5261e) m3681throw3), c13770e, 0);
                    c13770e.Signature(false);
                }
            }
            c13770e.Signature(z8);
            boolean yandex4 = c13770e.yandex(c2038e);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex4 || m3681throw4 == c5170e) {
                m3681throw4 = new Cvolatile(0, c2038e, C2038e.class, "cyclePlayPause", "cyclePlayPause()V", 0, 0, 4);
                c13770e.m3682throws(m3681throw4);
            }
            int i5 = i3 >> 6;
            AbstractC1129e.vip(i5 & 1008, c13770e, (Function0) ((InterfaceC5261e) m3681throw4), z2, z3);
            if (z5) {
                z9 = false;
                c13770e.m3676strictfp(-343969583);
            } else {
                c13770e.m3676strictfp(-296479598);
                if (z4) {
                    c13770e.m3676strictfp(-296451543);
                    boolean yandex5 = c13770e.yandex(c2038e);
                    Object m3681throw5 = c13770e.m3681throw();
                    if (yandex5 || m3681throw5 == c5170e) {
                        m3681throw5 = new Cvolatile(0, c2038e, C2038e.class, "skipForwards", "skipForwards()V", 0, 0, 5);
                        c13770e.m3682throws(m3681throw5);
                    }
                    z9 = false;
                    AbstractC1129e.purchase((Function0) ((InterfaceC5261e) m3681throw5), c13770e, 0);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3676strictfp(-296342609);
                    boolean yandex6 = c13770e.yandex(c2038e);
                    Object m3681throw6 = c13770e.m3681throw();
                    if (yandex6 || m3681throw6 == c5170e) {
                        m3681throw6 = new Cvolatile(0, c2038e, C2038e.class, "skipToNext", "skipToNext()V", 0, 0, 6);
                        c13770e.m3682throws(m3681throw6);
                    }
                    z9 = false;
                    AbstractC1129e.billing((Function0) ((InterfaceC5261e) m3681throw6), c13770e, 0);
                    c13770e.Signature(false);
                }
            }
            c13770e.Signature(z9);
            if (z6) {
                c13770e.m3676strictfp(-296187857);
                boolean yandex7 = c13770e.yandex(c2038e);
                Object m3681throw7 = c13770e.m3681throw();
                if (yandex7 || m3681throw7 == c5170e) {
                    m3681throw7 = new Cvolatile(0, c2038e, C2038e.class, "cycleShuffle", "cycleShuffle()V", 0, 0, 7);
                    c13770e.m3682throws(m3681throw7);
                }
                AbstractC1129e.license((i5 & 14) | ((i3 >> 21) & 112), c13770e, (Function0) ((InterfaceC5261e) m3681throw7), z, z7);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-295963231);
                AbstractC12534e.ad(c13770e, c0115e);
                c13770e.Signature(false);
            }
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2() { // from class: eٍۢؒ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    C13621e.this.metrica(interfaceC12864e, enumC10286e, z, z2, z3, z4, z5, z6, z7, (C13770e) obj, AbstractC5190e.advert(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public final void mopub(final EnumC10483e enumC10483e, final boolean z, final boolean z2, final boolean z3, final C6540e c6540e, C13770e c13770e, final int i) {
        ?? r11;
        C5170e c5170e;
        int i2;
        C13770e c13770e2;
        C13770e c13770e3;
        Object c0638e;
        int i3;
        C13770e c13770e4;
        c13770e.m3671package(-1970470144);
        int i4 = i | (c13770e.license(enumC10483e.ordinal()) ? 4 : 2) | (c13770e.billing(z) ? 32 : 16) | (c13770e.billing(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.billing(z3) ? 2048 : 1024) | (c13770e.yandex(c6540e) ? 16384 : 8192) | (c13770e.yandex(this) ? 131072 : 65536);
        if (c13770e.m3673protected(i4 & 1, (74899 & i4) != 74898)) {
            boolean z4 = enumC10483e == EnumC10483e.f20705e;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e2 = C2987e.ad;
            if (yandex || m3681throw == c5170e2) {
                r11 = 0;
                c5170e = c5170e2;
                C0638e c0638e2 = new C0638e(1, this, C13621e.class, "switchToLyrics", "switchToLyrics(Z)V", 0, 0, 0);
                c13770e.m3682throws(c0638e2);
                m3681throw = c0638e2;
            } else {
                r11 = 0;
                c5170e = c5170e2;
            }
            int i5 = i4 >> 6;
            int i6 = i5 & 7168;
            int i7 = i6 | 384;
            advert(z4, (Function1) ((InterfaceC5261e) m3681throw), AbstractC17864e.metrica, c13770e, i7);
            C6824e ad = AbstractC10536e.ad(c13770e, r11);
            C2892e c2892e = AbstractC17864e.purchase;
            boolean yandex2 = c13770e.yandex(c6540e);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C14515e(0, c6540e);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC2241e.metrica(ad, c2892e, c6540e, null, (Function0) m3681throw2, false, AbstractC16653e.license(755205533, new C12612e(this, 3), c13770e), c13770e, (i5 & 896) | 100663344, 232);
            C2038e c2038e = this.ad;
            if (z2) {
                c13770e.m3676strictfp(1339028126);
                if (z3) {
                    c13770e.m3676strictfp(1339071061);
                    boolean yandex3 = c13770e.yandex(c2038e);
                    Object m3681throw3 = c13770e.m3681throw();
                    if (yandex3 || m3681throw3 == c5170e) {
                        C0638e c0638e3 = new C0638e(1, c2038e, C2038e.class, "openVkMixConfiguration", "openVkMixConfiguration(Z)V", 0, 0, 2);
                        c13770e.m3682throws(c0638e3);
                        m3681throw3 = c0638e3;
                    }
                    advert(false, (Function1) ((InterfaceC5261e) m3681throw3), AbstractC17864e.yandex, c13770e, i6 | 390);
                    c13770e4 = c13770e;
                } else {
                    C13770e c13770e5 = c13770e;
                    c13770e5.m3676strictfp(1286376610);
                    c13770e4 = c13770e5;
                }
                c13770e4.Signature(r11);
                c13770e4.Signature(r11);
                i2 = i6;
                c13770e3 = c13770e4;
            } else {
                if (z) {
                    i2 = i6;
                    C13770e c13770e6 = c13770e;
                    c13770e6.m3676strictfp(1286376610);
                    c13770e2 = c13770e6;
                } else {
                    c13770e.m3676strictfp(1339541083);
                    boolean z5 = enumC10483e != EnumC10483e.f20704e ? r11 : true;
                    boolean yandex4 = c13770e.yandex(this);
                    Object m3681throw4 = c13770e.m3681throw();
                    if (yandex4 || m3681throw4 == c5170e) {
                        i2 = i6;
                        C0638e c0638e4 = new C0638e(1, this, C13621e.class, "switchToQueue", "switchToQueue(Z)V", 0, 0, 3);
                        c13770e.m3682throws(c0638e4);
                        m3681throw4 = c0638e4;
                    } else {
                        i2 = i6;
                    }
                    C13770e c13770e7 = c13770e;
                    advert(z5, (Function1) ((InterfaceC5261e) m3681throw4), AbstractC17864e.startapp, c13770e7, i7);
                    c13770e2 = c13770e7;
                }
                c13770e2.Signature(r11);
                c13770e3 = c13770e2;
            }
            boolean yandex5 = c13770e3.yandex(c2038e);
            Object m3681throw5 = c13770e3.m3681throw();
            if (yandex5 || m3681throw5 == c5170e) {
                i3 = i2;
                c0638e = new C0638e(1, c2038e, C2038e.class, "openTrackMenu", "openTrackMenu(Z)V", 0, 0, 4);
                c13770e3.m3682throws(c0638e);
            } else {
                c0638e = m3681throw5;
                i3 = i2;
            }
            advert(false, (Function1) ((InterfaceC5261e) c0638e), AbstractC17864e.adcel, c13770e3, i3 | 390);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(enumC10483e, z, z2, z3, c6540e, i) { // from class: eؒ٘ؗ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f3656e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ boolean f3657e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ EnumC10483e f3658e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ boolean f3659e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ C6540e f3661e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert = AbstractC5190e.advert(1);
                    C13621e.this.mopub(this.f3658e, this.f3657e, this.f3659e, this.f3656e, this.f3661e, (C13770e) obj, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void purchase(C13177e c13177e, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-747511150);
        int i2 = (c13770e.purchase(c13177e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c13770e2 = c13770e;
            appmetrica(c13177e.ad, c13177e.vip, c13177e.license, c13177e.appmetrica, c13770e2, (i2 << 9) & 57344);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6949e(this, c13177e, i, 3);
        }
    }

    public final void smaato() {
        this.appmetrica.setValue(Boolean.FALSE);
        EnumC10483e enumC10483e = (EnumC10483e) this.metrica.getValue();
        if (enumC10483e == EnumC10483e.f20706e) {
            enumC10483e = null;
        }
        if (enumC10483e == null) {
            enumC10483e = EnumC10483e.f20707e;
        }
        this.vip.setValue(enumC10483e);
    }

    public final void startapp(C13770e c13770e, int i) {
        c13770e.m3671package(125264729);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C2038e c2038e = this.ad;
            AbstractC16049e abstractC16049e = c2038e.adcel().vip;
            if (abstractC16049e instanceof AudioTrack) {
                AudioTrack audioTrack = (AudioTrack) abstractC16049e;
                if (audioTrack.appmetrica() != 3 && audioTrack.appmetrica() != 2) {
                    c13770e.m3676strictfp(-564822203);
                    boolean yandex = c13770e.yandex(c2038e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        Object cvolatile = new Cvolatile(0, c2038e, C2038e.class, "onShareTapped", "onShareTapped()V", 0, 0, 10);
                        c13770e.m3682throws(cvolatile);
                        m3681throw = cvolatile;
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC17864e.vip, c13770e, 1572864, 62);
                    c13770e.Signature(false);
                }
            }
            c13770e.m3676strictfp(-604030135);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C12612e(this, i, 1);
        }
    }

    public final void vip(boolean z, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(39549172);
        int i2 = (c13770e.billing(z) ? 4 : 2) | i | (c13770e.yandex(this) ? 2048 : 1024);
        if (!c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            c13770e.m3659default();
        } else if (z) {
            c13770e.m3676strictfp(1388534414);
            billing(((i2 >> 3) & 896) | 54, c2892e, c13770e, interfaceC12864e);
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(1388667311);
            yandex(((i2 >> 3) & 896) | 54, c2892e, c13770e, interfaceC12864e);
            c13770e.Signature(false);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6242e(this, z, interfaceC12864e, c2892e, i, 0);
        }
    }

    public final void yandex(int i, C2892e c2892e, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i2;
        c13770e.m3671package(558183018);
        if ((i & 6) == 0) {
            i2 = i | (c13770e.yandex(c2892e) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(16), C5438e.f11672e, c13770e, 6);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
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
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            InterfaceC12864e vip = AbstractC17113e.vip(AbstractC18007e.metrica(C0115e.f1276e, 1.0f));
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.purchase, C5438e.f11668e, c13770e, 54);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, vip);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad2, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i4, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            c2892e.invoke(c13770e, Integer.valueOf(i2 & 14));
            c13770e.Signature(true);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0233e(this, c2892e, interfaceC12864e, i, 0);
        }
    }
}
