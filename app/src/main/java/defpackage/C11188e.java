package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11188e extends AbstractC16625e implements InterfaceC17156e, InterfaceC18435e {

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C0576e f22445e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C0576e f22446e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C1615e f22447e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f22448e = AbstractC9743e.vip();

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C0576e f22449e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f22450e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C1615e f22451e;

    public C11188e() {
        Boolean bool = Boolean.FALSE;
        this.f22450e = AbstractC14533e.startapp(bool);
        C16251e c16251e = C16251e.ad;
        AbstractC14533e.startapp(Boolean.valueOf(!C16251e.metrica(EnumC14893e.f29513e)));
        C5775e.ad.getClass();
        this.f22451e = AbstractC9180e.metrica(C5775e.mopub.ad());
        this.f22447e = AbstractC9180e.metrica(C5775e.adcel.ad());
        this.f22445e = AbstractC14533e.startapp(C15383e.billing);
        this.f22446e = AbstractC14533e.startapp(bool);
        this.f22449e = AbstractC14533e.startapp(bool);
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public static void m3042e(C11188e c11188e, CachedTrack cachedTrack, int i) {
        if ((i & 1) != 0) {
            cachedTrack = null;
        }
        AbstractC5336e.purchase(AbstractC4608e.metrica(c11188e.vip()), AbstractC6731e.ad, 0, new C12028e(c11188e, cachedTrack, (i & 2) == 0, null), 2);
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f22448e.f29359e;
    }

    @Override // defpackage.AbstractC10347e, defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void applovin() {
        super.applovin();
        AbstractC9743e.license(this, null);
    }

    /* renamed from: const, reason: not valid java name */
    public final void m3043const(Function0 function0, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-793580529);
        int i2 = (c13770e.yandex(function0) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC0865e.vip(function0, interfaceC12864e, false, null, null, null, null, AbstractC12475e.metrica, c13770e, (i2 & 14) | 100663344, 252);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(this, function0, interfaceC12864e, i, 28);
        }
    }

    /* renamed from: continue, reason: not valid java name */
    public final void m3044continue(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(1901768353);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(this) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC3314e license = AbstractC4628e.license(this.f22447e, c13770e, 0);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC14533e.startapp(Boolean.FALSE);
                c13770e.m3682throws(m3681throw);
            }
            InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C1672e(interfaceC3314e, 28);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC0014e.metrica((Function0) m3681throw2, interfaceC12864e, false, null, null, null, AbstractC16653e.license(-1591143613, new C18522e(0, license, interfaceC3314e, this), c13770e), c13770e, ((i2 << 3) & 112) | 1572870, 60);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(this, interfaceC12864e, i, 18);
        }
    }

    /* renamed from: else, reason: not valid java name */
    public final void m3045else(C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-521113134);
        int i2 = i & 1;
        if (c13770e.m3673protected(i2, i2 != 0)) {
            c13770e2 = c13770e;
            AbstractC0865e.metrica(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, 2), null, null, null, null, AbstractC12475e.amazon, c13770e2, 196614, 30);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C1422e(this, i, 2);
        }
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final C15383e m3046e() {
        return (C15383e) this.f22445e.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r1 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: eُؚٕ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3047e(defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11188e.m3047e(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        C11188e c11188e;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1587438653);
        int i2 = (c13770e2.yandex(this) ? 4 : 2) | i;
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e2.yandex(this);
            Object m3681throw = c13770e2.m3681throw();
            InterfaceC5083e interfaceC5083e = null;
            Object obj = C2987e.ad;
            if (yandex || m3681throw == obj) {
                m3681throw = new C5245e(this, null, 0);
                c13770e2.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e2, unit, (Function2) m3681throw);
            C15383e m3046e = m3046e();
            C4993e ad = AbstractC9735e.ad(0, 3, c13770e2);
            InterfaceC1108e interfaceC1108e = m3046e.ad;
            C10327e c10327e = C10327e.f20377e;
            C4891e c4891e = this.f27449e;
            Object metrica = AbstractC4628e.metrica(interfaceC1108e, c10327e, c4891e, c13770e2, 48, 12);
            Object metrica2 = AbstractC4628e.metrica(m3046e.metrica, c10327e, c4891e, c13770e, 48, 12);
            InterfaceC3314e metrica3 = AbstractC4628e.metrica(m3046e.vip, EnumC3988e.f8898e, c4891e, c13770e, 48, 12);
            Object appmetrica = AbstractC4628e.appmetrica(this.f22451e, c4891e, c13770e);
            Boolean bool = (Boolean) this.f22449e.getValue();
            bool.booleanValue();
            boolean yandex2 = c13770e.yandex(this) | c13770e.purchase(ad);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == obj) {
                m3681throw2 = new C7602e(this, ad, interfaceC5083e, 10);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, bool, (Function2) m3681throw2);
            if (((Boolean) this.f22446e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(-498714289);
                m3050import(c13770e, i2 & 14);
                c13770e.Signature(false);
                C2846e subscription = c13770e.subscription();
                if (subscription != null) {
                    subscription.license = new C1422e(this, i, 7);
                    return;
                }
                return;
            }
            c13770e.m3676strictfp(-511767707);
            c13770e.Signature(false);
            if (((EnumC3988e) metrica3.getValue()) != EnumC3988e.f8896e) {
                c13770e.m3676strictfp(-498458415);
                C16005e appmetrica2 = AbstractC12220e.appmetrica(0.0f, 0.0f, 0.0f, 16, 7);
                boolean yandex3 = c13770e.yandex(this) | c13770e.purchase(metrica) | c13770e.purchase(appmetrica) | c13770e.purchase(metrica2);
                Object m3681throw3 = c13770e.m3681throw();
                if (yandex3 || m3681throw3 == obj) {
                    Object c17819e = new C17819e(this, metrica, appmetrica, metrica2, 14);
                    c11188e = this;
                    c13770e.m3682throws(c17819e);
                    m3681throw3 = c17819e;
                } else {
                    c11188e = this;
                }
                AbstractC7023e.ad(null, ad, appmetrica2, null, null, null, false, null, (Function1) m3681throw3, c13770e, 384, 505);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
            } else {
                c11188e = this;
                c13770e2 = c13770e;
                c13770e2.m3676strictfp(-494034622);
                c11188e.m3050import(c13770e2, i2 & 14);
                c13770e2.Signature(false);
            }
        } else {
            c11188e = this;
            c13770e2.m3659default();
        }
        C2846e subscription2 = c13770e2.subscription();
        if (subscription2 != null) {
            subscription2.license = new C1422e(c11188e, i, 8);
        }
    }

    /* renamed from: finally, reason: not valid java name */
    public final void m3048finally(CachedTrack cachedTrack, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-1946318831);
        int i2 = (c13770e.purchase(cachedTrack) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean yandex = (i3 == 4) | c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C0151e(cachedTrack, this);
                c13770e.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) m3681throw;
            boolean yandex2 = c13770e.yandex(this) | (i3 == 4);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C0151e(this, cachedTrack);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e2 = c13770e;
            AbstractC6401e.vip(AbstractC16653e.license(1339165855, new C11828e(this, cachedTrack, 12), c13770e), AbstractC16653e.license(1582702718, new C14521e(cachedTrack, 6), c13770e), AbstractC12220e.advert(AbstractC18007e.metrica(AbstractC9546e.purchase(C0115e.f1276e, function0, (Function0) m3681throw2), 1.0f), 16, 6), AbstractC16653e.license(2069776444, new C14521e(cachedTrack, 7), c13770e), c13770e2, 3126, 0);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C15709e(this, cachedTrack, i, 23);
        }
    }

    /* renamed from: for, reason: not valid java name */
    public final void m3049for(C13770e c13770e, int i) {
        c13770e.m3671package(-2132841510);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C0889e(this, 2);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC12475e.billing, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC12475e.startapp, null, null, 0.0f, 0.0f, c13770e, 24582, 492);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1422e(this, i, 6);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final void m3050import(C13770e c13770e, int i) {
        int i2;
        C11188e c11188e;
        boolean z;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(2100768512);
        int i3 = i | (c13770e2.yandex(this) ? 4 : 2);
        if (c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            C7913e c7913e = AbstractC18007e.metrica;
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, c7913e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, license, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            C14486e c14486e = C14486e.ad;
            C10156e c10156e = C5438e.f11700e;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato = AbstractC12220e.smaato(c14486e.ad(c0115e, c10156e), 16, 0.0f, 2);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11678e, c13770e2, 54);
            long j2 = c13770e2.f27286case;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, smaato);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad, c14865e);
            AbstractC2270e.yandex(c13770e2, advert2, c14865e2);
            AbstractC13501e.mopub(i5, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            if (((Boolean) this.f22446e.getValue()).booleanValue()) {
                c13770e2.m3676strictfp(1501301358);
                AbstractC6232e.vip(null, 0L, null, c13770e2, 0, 7);
                String appmetrica = AbstractC5297e.appmetrica(c13770e2, R.string.cache_db_migration_started);
                C15492e c15492e = AbstractC11785e.ad;
                AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.smaato, c13770e, 0, 0, 130042);
                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.cache_db_migration_started_desc), null, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 0, 0, 130042);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
                i2 = i;
                c11188e = this;
            } else {
                c13770e2.m3676strictfp(1502044893);
                AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_download_outline_28, 0, c13770e2);
                C15492e c15492e2 = AbstractC11785e.ad;
                AbstractC5647e.vip(metrica, null, AbstractC18007e.startapp(c0115e, 36), ((C7019e) c13770e2.adcel(c15492e2)).ad.admob, c13770e, 440, 0);
                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.cache_empty_page_title), null, ((C7019e) c13770e.adcel(c15492e2)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e2)).vip.smaato, c13770e, 0, 0, 130042);
                AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, R.string.cache_empty_page_text), null, ((C7019e) c13770e.adcel(c15492e2)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e2)).vip.mopub, c13770e, 0, 0, 130042);
                boolean yandex = c13770e.yandex(this);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == C2987e.ad) {
                    i2 = i;
                    z = false;
                    C6317e c6317e = new C6317e(0, this, C11188e.class, "callLibrarySyncDialog", "callLibrarySyncDialog()V", 0, 0, 8);
                    c11188e = this;
                    c13770e.m3682throws(c6317e);
                    m3681throw = c6317e;
                } else {
                    i2 = i;
                    c11188e = this;
                    z = false;
                }
                c13770e2 = c13770e;
                AbstractC1513e.license((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC12475e.vip, c13770e2, 805306368, 510);
                c13770e2.Signature(z);
            }
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            i2 = i;
            c11188e = this;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C1422e(c11188e, i2, 0);
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m3051instanceof(String str, int i, Function0 function0, Function2 function2, C13770e c13770e, int i2) {
        Function0 function02;
        Function2 function22;
        c13770e.m3671package(-2090760203);
        int i3 = i2 | (c13770e.purchase(str) ? 4 : 2) | (c13770e.license(i) ? 32 : 16) | 3456;
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C10673e(17);
                c13770e.m3682throws(m3681throw);
            }
            C16005e c16005e = AbstractC10244e.ad;
            function02 = (Function0) m3681throw;
            AbstractC1513e.license(function02, null, false, null, AbstractC10244e.purchase(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob, 0L, c13770e, 13), null, AbstractC16653e.license(548190514, new C11830e(str, i), c13770e), c13770e, 805306374, 494);
            function22 = AbstractC12475e.license;
        } else {
            c13770e.m3659default();
            function02 = function0;
            function22 = function2;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7303e(this, str, i, function02, function22, i2);
        }
    }

    @Override // defpackage.AbstractC16625e, defpackage.AbstractC13859e
    public final void isVip() {
        super.isVip();
        InterfaceC5083e interfaceC5083e = null;
        int i = 14;
        C18474e c18474e = new C18474e(this, interfaceC5083e, i);
        C5981e c5981e = AbstractC15448e.ad;
        C4013e c4013e = AbstractC15448e.vip;
        C11318e c11318e = new C11318e(new C6751e(c4013e, 8), new C7602e(c18474e, interfaceC5083e, 12), 3);
        C4891e c4891e = this.f27449e;
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C6751e(c4013e, 9), new C7602e(new C5245e(this, null, 1), interfaceC5083e, i), 3), c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
    }

    /* renamed from: public, reason: not valid java name */
    public final void m3052public(InterfaceC1108e interfaceC1108e, InterfaceC1108e interfaceC1108e2, InterfaceC1108e interfaceC1108e3, C13770e c13770e, int i) {
        C11188e c11188e;
        c13770e.m3671package(1206931097);
        int i2 = i | (c13770e.yandex(interfaceC1108e) ? 4 : 2) | (c13770e.yandex(interfaceC1108e2) ? 32 : 16) | (c13770e.yandex(interfaceC1108e3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(this) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            int ordinal = ((EnumC2502e) AbstractC4628e.license(this.f22451e, c13770e, 0).getValue()).ordinal();
            Integer[] numArr = {Integer.valueOf(R.string.cache_track_selector_my_library), Integer.valueOf(R.string.cache_track_selector_manual_library), Integer.valueOf(R.string.cache_track_selector_all)};
            float f = 8;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e metrica = AbstractC18007e.metrica(AbstractC12220e.smaato(c0115e, 0.0f, f, 1), 1.0f);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e, 0);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, metrica);
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
            float f2 = 0;
            float f3 = 16;
            long j2 = C3618e.startapp;
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            InterfaceC12864e license = AbstractC13328e.license(new C5228e(1.0f, true), AbstractC13328e.billing());
            C2892e license2 = AbstractC16653e.license(1961952532, new C14362e(ordinal, 0), c13770e);
            C4280e c4280e = new C4280e(numArr, ordinal, interfaceC1108e, interfaceC1108e2, interfaceC1108e3, this);
            c11188e = this;
            AbstractC9672e.ad(ordinal, license, j2, 0L, f3, f2, f, license2, AbstractC16653e.license(-1278168749, c4280e, c13770e), c13770e, 115040640);
            c11188e.m3044continue(AbstractC12220e.loadAd(c0115e, 0.0f, 0.0f, f, 0.0f, 11), c13770e, ((i2 >> 6) & 112) | 6);
            c13770e.Signature(true);
        } else {
            c11188e = this;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(c11188e, interfaceC1108e, interfaceC1108e2, interfaceC1108e3, i, 21);
        }
    }

    /* renamed from: return, reason: not valid java name */
    public final void m3053return(C13770e c13770e, int i) {
        c13770e.m3671package(-12625588);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C0889e(this, 0);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC16429e.ad(AbstractC12475e.adcel, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC12475e.advert, null, null, 0.0f, 0.0f, c13770e, 24582, 492);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1422e(this, i, 4);
        }
    }

    @Override // defpackage.InterfaceC17156e
    public final void smaato() {
        this.f22449e.setValue(Boolean.TRUE);
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m3054switch(C13770e c13770e, int i) {
        c13770e.m3671package(-606975154);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                C6317e c6317e = new C6317e(0, this, C11188e.class, "dispatchAssetMigrationConfirmation", "dispatchAssetMigrationConfirmation()V", 0, 0, 9);
                c13770e.m3682throws(c6317e);
                m3681throw = c6317e;
            }
            AbstractC0865e.vip((Function0) ((InterfaceC5261e) m3681throw), AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, 2), false, null, null, null, null, AbstractC12475e.purchase, c13770e, 100663344, 252);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1422e(this, i, 3);
        }
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m3055synchronized(C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(105336025);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            c13770e2 = c13770e;
            AbstractC0865e.metrica(AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 16, 0.0f, 2), null, null, null, null, AbstractC16653e.license(-1025649179, new C10971e(this, 7), c13770e), c13770e2, 196614, 30);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C1422e(this, i, 1);
        }
    }

    /* renamed from: throws, reason: not valid java name */
    public final void m3056throws(CachedPlaylist cachedPlaylist, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(664043907);
        int i2 = i | (c13770e2.purchase(cachedPlaylist) ? 4 : 2) | (c13770e2.purchase(interfaceC12864e) ? 32 : 16);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object m3681throw = c13770e2.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                m3681throw = AbstractC5211e.vip(cachedPlaylist);
                c13770e2.m3682throws(m3681throw);
            }
            String str = (String) m3681throw;
            float f = 131;
            InterfaceC12864e smaato = AbstractC18007e.smaato(interfaceC12864e, f);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
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
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            C0115e c0115e = C0115e.f1276e;
            AbstractC8461e.ad(cachedPlaylist, null, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, f), AbstractC0903e.purchase(c13770e2).metrica), null, null, c13770e, 48, 2040);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 8));
            InterfaceC12864e smaato2 = AbstractC18007e.smaato(c0115e, f);
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.billing(2), C5438e.f11668e, c13770e, 54);
            long j2 = c13770e.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, smaato2);
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
            String firebase = cachedPlaylist.firebase();
            C1839e c1839e = AbstractC0903e.billing(c13770e).smaato;
            long j3 = AbstractC0903e.license(c13770e).admob;
            C1812e c1812e = C1812e.f4893e;
            AbstractC14489e.vip(firebase, null, j3, 0L, null, c1812e, null, 0L, null, 0L, 2, false, 1, 0, c1839e, c13770e, 1572864, 24960, 110522);
            if (cachedPlaylist.m4695native()) {
                c13770e.m3676strictfp(-951680122);
                AbstractC1328e.vip(AbstractC18007e.startapp(c0115e, 16), 0L, c13770e, 6, 2);
            } else {
                c13770e.m3676strictfp(-990626011);
            }
            c13770e.Signature(false);
            c13770e.Signature(true);
            String inmobi = cachedPlaylist.inmobi();
            if (inmobi == null) {
                inmobi = BuildConfig.FLAVOR;
            }
            AbstractC14489e.vip(inmobi, null, AbstractC0903e.license(c13770e).remoteconfig, 0L, null, c1812e, null, 0L, null, 0L, 2, false, 1, 0, AbstractC0903e.billing(c13770e).smaato, c13770e, 1572864, 24960, 110522);
            c13770e2 = c13770e;
            if (str.length() > 0) {
                c13770e2.m3676strictfp(-296417542);
                AbstractC14489e.vip(str, null, AbstractC0903e.license(c13770e2).remoteconfig, 0L, null, c1812e, null, 0L, null, 0L, 2, false, 1, 0, AbstractC0903e.billing(c13770e2).smaato, c13770e, 1572864, 24960, 110522);
                c13770e2 = c13770e;
            } else {
                c13770e2.m3676strictfp(-335924407);
            }
            c13770e2.Signature(false);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C4197e(this, cachedPlaylist, interfaceC12864e, i, 29);
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m3057transient(InterfaceC12864e interfaceC12864e, Function2 function2, Function2 function22, C13770e c13770e, int i) {
        Function2 function23;
        Function2 function24;
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(1267461068);
        int i2 = i | 6;
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC18007e.purchase(AbstractC12220e.smaato(c0115e, 6, 0.0f, 2), AbstractC10244e.license, 0.0f, 2);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11668e, c13770e, 48);
            long j = c13770e.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, purchase);
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
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            function23 = function2;
            function23.invoke(c13770e, 6);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e, new C5228e(1.0f, true));
            function24 = function22;
            function24.invoke(c13770e, 6);
            c13770e.Signature(true);
            interfaceC12864e2 = c0115e;
        } else {
            function23 = function2;
            function24 = function22;
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(this, interfaceC12864e2, function23, function24, i, 22);
        }
    }

    /* renamed from: volatile, reason: not valid java name */
    public final void m3058volatile(Function0 function0, C13770e c13770e, int i) {
        Function0 function02;
        C13770e c13770e2;
        c13770e.m3671package(1243752514);
        int i2 = (c13770e.yandex(function0) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            function02 = function0;
            c13770e2 = c13770e;
            AbstractC1513e.license(function02, null, false, null, null, null, AbstractC12475e.appmetrica, c13770e2, (i2 & 14) | 805306368, 510);
        } else {
            function02 = function0;
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C15709e(this, function02, i, 24);
        }
    }
}
