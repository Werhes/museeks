package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15435e extends AbstractC16625e {

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C1615e f30512e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final InterfaceC1108e f30513e;

    public C15435e() {
        C1615e metrica = AbstractC9180e.metrica(BuildConfig.FLAVOR);
        this.f30512e = metrica;
        this.f30513e = AbstractC7535e.smaato(new C14571e(metrica, 0), AbstractC6731e.ad);
    }

    /* renamed from: switch, reason: not valid java name */
    public static final void m3991switch(C15435e c15435e, CachedTrack cachedTrack, InterfaceC8346e interfaceC8346e) {
        AppActivity appActivity = (AppActivity) c15435e.pro();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(interfaceC8346e, 10));
        Iterator<E> it = interfaceC8346e.iterator();
        while (it.hasNext()) {
            arrayList.add(((CachedTrack) it.next()).m4723for());
        }
        C0552e c0552e = new C0552e(arrayList);
        String applovin = cachedTrack.applovin();
        InterfaceC14517e c1703e = applovin != null ? new C1703e(applovin) : C2406e.ad;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(interfaceC8346e, 10));
        Iterator<E> it2 = interfaceC8346e.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CachedTrack) it2.next()).metrica());
        }
        AbstractC13201e.metrica(appActivity, c0552e, new C0086e(c1703e, 0L, arrayList2, false, false, false, 122));
    }

    /* renamed from: else, reason: not valid java name */
    public final void m3992else(String str, Function1 function1, Function1 function12, InterfaceC12864e interfaceC12864e, boolean z, Function2 function2, Function2 function22, C17085e c17085e, C15274e c15274e, C13770e c13770e, int i) {
        boolean z2;
        C15274e c15274e2;
        C15274e c15274e3;
        boolean z3;
        c13770e.m3671package(-1136071054);
        int i2 = i | (c13770e.purchase(str) ? 4 : 2) | (c13770e.yandex(function1) ? 32 : 16) | (c13770e.yandex(function12) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(interfaceC12864e) ? 2048 : 1024) | 12607488 | (c13770e.purchase(c17085e) ? 67108864 : 33554432) | 805306368;
        if (c13770e.m3673protected(i2 & 1, (306783379 & i2) != 306783378)) {
            c13770e.m3655case();
            int i3 = i & 1;
            Object obj = C2987e.ad;
            if (i3 == 0 || c13770e.isPro()) {
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == obj) {
                    m3681throw = AbstractC17861e.adcel(c13770e);
                }
                c15274e3 = (C15274e) m3681throw;
                z3 = true;
            } else {
                c13770e.m3659default();
                z3 = z;
                c15274e3 = c15274e;
            }
            c13770e.admob();
            InterfaceC16054e interfaceC16054e = (InterfaceC16054e) c13770e.adcel(AbstractC11473e.startapp);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = new C6260e();
                c13770e.m3682throws(m3681throw2);
            }
            C6260e c6260e = (C6260e) m3681throw2;
            InterfaceC12864e license = AbstractC18366e.license(AbstractC18007e.metrica(AbstractC18007e.license(interfaceC12864e, C1299e.license), 1.0f), c6260e);
            C1839e purchase = C1839e.purchase(((C7019e) c13770e.adcel(AbstractC11785e.ad)).vip.adcel, c17085e.ad, 0L, null, null, null, 0L, 0, 0L, 16777214);
            C18466e c18466e = new C18466e(c17085e.startapp);
            C15274e c15274e4 = c15274e3;
            C4988e c4988e = new C4988e(0, 3, 119);
            int i4 = i2 & 14;
            boolean yandex = ((i2 & 896) == 256) | c13770e.yandex(interfaceC16054e) | (i4 == 4);
            Object m3681throw3 = c13770e.m3681throw();
            if (yandex || m3681throw3 == obj) {
                m3681throw3 = new C13563e(interfaceC16054e, function12, str, 0);
                c13770e.m3682throws(m3681throw3);
            }
            boolean z4 = z3;
            AbstractC0483e.license(str, function1, license, z4, purchase, c4988e, new C16636e(null, (Function1) m3681throw3, 47), true, 0, 0, null, null, c15274e4, c18466e, AbstractC16653e.license(-2077937745, new C10353e(str, z4, c15274e4, function2, function22, c17085e, 0), c13770e), c13770e, i4 | 102236160 | (i2 & 112) | 3072, 199680, 7696);
            Unit unit = Unit.INSTANCE;
            Object m3681throw4 = c13770e.m3681throw();
            if (m3681throw4 == obj) {
                m3681throw4 = new C2733e(c6260e, null, 0);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw4);
            z2 = z4;
            c15274e2 = c15274e4;
        } else {
            c13770e.m3659default();
            z2 = z;
            c15274e2 = c15274e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9305e(this, str, function1, function12, interfaceC12864e, z2, function2, function22, c17085e, c15274e2, i, 0);
        }
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-530603071);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C1615e c1615e = this.f30512e;
            C4891e c4891e = this.f27449e;
            AbstractC13348e.ad(null, AbstractC16653e.license(1673549189, new C13312e(this, AbstractC4628e.appmetrica(c1615e, c4891e, c13770e), 0), c13770e), null, null, null, 0, 0L, 0L, ((C0916e) c13770e.adcel(AbstractC12450e.ad)).license(c13770e), AbstractC16653e.license(-222449648, new C17672e(this, AbstractC4628e.metrica(this.f30513e, new C2765e(), c4891e, c13770e, 0, 12), 0), c13770e), c13770e, 805306416, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C18304e(this, i, 0);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final void m3993import(String str, String str2, C13770e c13770e, int i, int i2) {
        String str3;
        int i3;
        boolean z;
        c13770e.m3671package(-582959201);
        int i4 = i | (c13770e.purchase(str) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i4 | (c13770e.purchase(str3) ? 32 : 16);
        }
        int i6 = i3;
        if (c13770e.m3673protected(i6 & 1, (i6 & 19) != 18)) {
            String str4 = i5 != 0 ? null : str3;
            float f = 16;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e purchase = AbstractC18007e.purchase(AbstractC18007e.metrica(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 1.0f), AbstractC10244e.license, 0.0f, 2);
            float f2 = 8;
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(f2), C5438e.f11668e, c13770e, 54);
            long j = c13770e.f27286case;
            int i7 = (int) (j ^ (j >>> 32));
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
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i7), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase2, C2721e.license);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(str, null, ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, C1812e.f4889e, AbstractC16795e.vip, 0L, null, 0L, 2, false, 1, 0, ((C7019e) c13770e.adcel(c15492e)).vip.adcel, c13770e, (i6 & 14) | 14155776, 24960, 110394);
            C13770e c13770e2 = c13770e;
            if (str4 != null) {
                c13770e2.m3676strictfp(1822941488);
                String str5 = str4;
                AbstractC14489e.vip(str5, null, ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, 0L, null, C1812e.f4893e, null, 0L, null, 0L, 2, false, 1, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.adcel, c13770e, ((i6 >> 3) & 14) | 1572864, 24960, 110522);
                str3 = str5;
                c13770e2 = c13770e;
                z = false;
            } else {
                str3 = str4;
                z = false;
                c13770e2.m3676strictfp(1810153151);
            }
            c13770e2.Signature(z);
            c13770e2.Signature(true);
            AbstractC8141e.vip(AbstractC12220e.loadAd(AbstractC12220e.smaato(c0115e, f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7), 0.0f, 0L, c13770e2, 6, 6);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, i2, 4, this, str, str3);
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m3994instanceof(CachedPlaylist cachedPlaylist, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(861725301);
        int i2 = i | (c13770e2.yandex(cachedPlaylist) ? 4 : 2) | (c13770e2.yandex(this) ? 32 : 16);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            float f = 131;
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e smaato = AbstractC18007e.smaato(c0115e, f);
            boolean yandex = c13770e2.yandex(this) | c13770e2.yandex(cachedPlaylist);
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new Celse(this, cachedPlaylist, 22);
                c13770e2.m3682throws(m3681throw);
            }
            InterfaceC12864e license = AbstractC9546e.license(smaato, false, null, (Function0) m3681throw, 15);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, license);
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
            boolean purchase2 = c13770e2.purchase(cachedPlaylist.m4683class());
            Object m3681throw2 = c13770e2.m3681throw();
            if (purchase2 || m3681throw2 == c5170e) {
                m3681throw2 = AbstractC12546e.appmetrica(cachedPlaylist).f21024e.remoteconfig();
                c13770e2.m3682throws(m3681throw2);
            }
            InterfaceC12864e startapp = AbstractC18007e.startapp(c0115e, f);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC8461e.ad((String) m3681throw2, null, AbstractC12447e.vip(startapp, ((C7019e) c13770e2.adcel(c15492e)).metrica.metrica), null, null, c13770e2, 48, 2040);
            AbstractC12534e.ad(c13770e2, AbstractC18007e.license(c0115e, 8));
            AbstractC14489e.vip(cachedPlaylist.firebase(), null, ((C7019e) c13770e2.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C7019e) c13770e2.adcel(c15492e)).vip.adcel, c13770e, 0, 24960, 110586);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, 1));
            String inmobi = cachedPlaylist.inmobi();
            if (inmobi == null) {
                inmobi = BuildConfig.FLAVOR;
            }
            AbstractC14489e.vip(inmobi, null, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, ((C7019e) c13770e.adcel(c15492e)).vip.smaato, c13770e, 0, 24960, 110586);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6949e(this, cachedPlaylist, i, 27);
        }
    }

    /* renamed from: return, reason: not valid java name */
    public final void m3995return(CachedTrack cachedTrack, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(891745488);
        int i2 = (c13770e.yandex(cachedTrack) ? 4 : 2) | i | (c13770e.yandex(function0) ? 32 : 16) | (c13770e.yandex(function02) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(this) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            c13770e2 = c13770e;
            AbstractC6401e.vip(AbstractC16653e.license(-1224534946, new C17630e(this, cachedTrack, 2), c13770e), AbstractC16653e.license(-1658498627, new C14521e(cachedTrack, 0), c13770e), AbstractC12220e.advert(AbstractC18007e.metrica(AbstractC9546e.purchase(C0115e.f1276e, function02, function0), 1.0f), 16, 6), AbstractC16653e.license(1768541307, new C14521e(cachedTrack, 1), c13770e), c13770e2, 3126, 0);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(this, cachedTrack, function0, function02, i, 5);
        }
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m3996synchronized(InterfaceC8346e interfaceC8346e, C13770e c13770e, int i) {
        c13770e.m3671package(1567578629);
        int i2 = (c13770e.yandex(interfaceC8346e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC12864e metrica = AbstractC18007e.metrica(C0115e.f1276e, 1.0f);
            C16005e metrica2 = AbstractC12220e.metrica(16, 0.0f, 2);
            C13964e billing = AbstractC16497e.billing(8);
            boolean yandex = c13770e.yandex(interfaceC8346e) | c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C12439e(interfaceC8346e, this, 23);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC7023e.vip(metrica, null, metrica2, billing, null, null, false, null, (Function1) m3681throw, c13770e, 24966, 490);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6949e(this, interfaceC8346e, i, 26);
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m3997transient(C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1141847612);
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
            subscription.license = new C18304e(this, i, 2);
        }
    }
}
