package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۡٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2921e extends AbstractC16625e {

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final InterfaceC1108e f6909e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f6910e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f6911e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C0576e f6912e;

    public C2921e() {
        InterfaceC1108e c10250e;
        Boolean bool = Boolean.FALSE;
        this.f6910e = AbstractC14533e.startapp(bool);
        C16251e c16251e = C16251e.ad;
        this.f6911e = AbstractC14533e.startapp(Boolean.valueOf(!C16251e.metrica(EnumC14893e.f29517e)));
        this.f6912e = AbstractC14533e.startapp(bool);
        C4199e m4502e = C18353e.vip.m4502e();
        if (m4502e != null) {
            StringBuilder sb = new StringBuilder();
            C14027e.ad.getClass();
            sb.append(C14027e.metrica());
            sb.append("_-1337");
            InterfaceC1108e signatures = AbstractC0054e.signatures(m4502e.m1506e(AbstractC3820e.ad.vip(CachedPlaylist.class), "uid == $0", Arrays.copyOf(new Object[]{sb.toString()}, 1)));
            if (signatures != null) {
                c10250e = new C7371e(signatures, 24);
                this.f6909e = c10250e;
            }
        }
        c10250e = new C10250e(4, C10327e.f20377e);
        this.f6909e = c10250e;
    }

    /* renamed from: return, reason: not valid java name */
    public static void m1215return(C2921e c2921e, CachedTrack cachedTrack, boolean z, int i) {
        InterfaceC5083e interfaceC5083e = null;
        CachedTrack cachedTrack2 = (i & 1) != 0 ? null : cachedTrack;
        boolean z2 = (i & 2) != 0 ? false : z;
        c2921e.getClass();
        AbstractC5336e.purchase(AbstractC4608e.metrica(c2921e.vip()), AbstractC6731e.ad, 0, new C6896e(c2921e, cachedTrack2, z2, interfaceC5083e, 4), 2);
    }

    /* renamed from: else, reason: not valid java name */
    public final void m1216else(boolean z) {
        this.f6910e.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        InterfaceC3314e interfaceC3314e;
        boolean z;
        C2921e c2921e = this;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1073213151);
        int i2 = i | (c13770e2.yandex(c2921e) ? 4 : 2);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC3314e metrica = AbstractC4628e.metrica(c2921e.f6909e, C10327e.f20377e, c2921e.f27449e, c13770e2, 48, 12);
            if (((Boolean) c2921e.f6912e.getValue()).booleanValue()) {
                c13770e2.m3676strictfp(-356128509);
                boolean yandex = c13770e2.yandex(c2921e);
                Object m3681throw = c13770e2.m3681throw();
                if (yandex || m3681throw == C2987e.ad) {
                    m3681throw = new C14580e(c2921e, 1);
                    c13770e2.m3682throws(m3681throw);
                }
                interfaceC3314e = metrica;
                z = false;
                AbstractC9262e.ad((Function0) m3681throw, AbstractC16653e.license(-1374750476, new C16557e(c2921e, 0), c13770e2), null, AbstractC16653e.license(-768975694, new C16557e(c2921e, 1), c13770e2), AbstractC13328e.metrica, AbstractC13328e.license, AbstractC13328e.appmetrica, null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1797168, 0, 16260);
                c13770e2 = c13770e;
            } else {
                interfaceC3314e = metrica;
                z = false;
                c13770e2.m3676strictfp(-361560639);
            }
            c13770e2.Signature(z);
            c2921e = this;
            AbstractC13348e.ad(null, AbstractC16653e.license(1731738853, new C16557e(this, 2), c13770e2), null, null, null, 0, 0L, 0L, ((C0916e) c13770e2.adcel(AbstractC12450e.ad)).license(c13770e2), AbstractC16653e.license(-199024912, new C8937e(this, interfaceC3314e, 12), c13770e2), c13770e2, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16557e(c2921e, i, 3);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final void m1217import(C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(144263844);
        int i2 = i & 1;
        if (c13770e2.m3673protected(i2, i2 != 0)) {
            C7913e c7913e = AbstractC18007e.metrica;
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
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
            Integer valueOf = Integer.valueOf(i3);
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
            int i4 = (int) (j2 ^ (j2 >>> 32));
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
            AbstractC13501e.mopub(i4, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            AbstractC10727e metrica = AbstractC12475e.metrica(R.drawable.ic_download_outline_28, 0, c13770e2);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC5647e.vip(metrica, null, AbstractC18007e.startapp(c0115e, 36), ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, c13770e2, 440, 0);
            AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e2, R.string.cache_library_empty), null, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, AbstractC13362e.startapp(15), null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, c13770e, 24576, 0, 261098);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C16557e(this, i, 5);
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m1218instanceof(int i, C13770e c13770e, InterfaceC12864e interfaceC12864e, Function0 function0, Function0 function02) {
        int i2;
        c13770e.m3671package(-1519013394);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(AbstractC13328e.smaato) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(AbstractC13328e.amazon) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e.yandex(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e.purchase(interfaceC12864e) ? 16384 : 8192;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            AbstractC0865e.ad(interfaceC12864e, null, null, null, null, AbstractC16653e.license(623735100, new C17630e(function0, function02, 20), c13770e), c13770e, ((i2 >> 12) & 14) | 196608, 30);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7303e(this, function0, function02, interfaceC12864e, i, 7);
        }
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m1219synchronized(CachedTrack cachedTrack, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(2026203592);
        int i2 = (c13770e.yandex(cachedTrack) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            boolean yandex = c13770e.yandex(cachedTrack) | c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C12297e(cachedTrack, this);
                c13770e.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) m3681throw;
            boolean yandex2 = c13770e.yandex(this) | c13770e.yandex(cachedTrack);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C12297e(this, cachedTrack);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e2 = c13770e;
            AbstractC6401e.vip(AbstractC16653e.license(2122905430, new C17630e(this, cachedTrack, 21), c13770e), AbstractC16653e.license(-1022229579, new C14521e(cachedTrack, 4), c13770e), AbstractC12220e.advert(AbstractC18007e.metrica(AbstractC9546e.purchase(C0115e.f1276e, function0, (Function0) m3681throw2), 1.0f), 16, 6), AbstractC16653e.license(1277434995, new C14521e(cachedTrack, 5), c13770e), c13770e2, 3126, 0);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(this, cachedTrack, i, 5);
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m1220transient(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(805797713);
        int i2 = i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                C7736e c7736e = new C7736e(0, this, C2921e.class, "processAboutHint", "processAboutHint()V", 0, 0, 3);
                c13770e.m3682throws(c7736e);
                m3681throw = c7736e;
            }
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                C7736e c7736e2 = new C7736e(0, this, C2921e.class, "dismissAboutHint", "dismissAboutHint()V", 0, 0, 4);
                c13770e.m3682throws(c7736e2);
                m3681throw2 = c7736e2;
            }
            m1218instanceof(24630 | ((i2 << 12) & 458752), c13770e, interfaceC12864e, function0, (Function0) ((InterfaceC5261e) m3681throw2));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(this, interfaceC12864e, i, 7);
        }
    }
}
