package defpackage;

import android.content.Context;
import android.view.View;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14873e extends AbstractC16625e {

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public final C0576e f29450e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final C12742e f29451e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final C0576e f29452e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C17651e f29453e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C0576e f29454e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final boolean f29455e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final int f29456e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public final ArrayList f29457e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C0576e f29458e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public final C0576e f29459e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final long f29460e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final String f29461e;

    public C14873e(AudioPlaylist audioPlaylist, VKProfile vKProfile) {
        int i = audioPlaylist.isPro;
        long j = audioPlaylist.applovin;
        String str = audioPlaylist.f36509implements;
        this.f29456e = i;
        this.f29460e = j;
        this.f29461e = str;
        this.f29455e = true;
        this.f29453e = AbstractC12751e.ad();
        this.f29454e = AbstractC14533e.startapp(C9309e.vip);
        C0576e startapp = AbstractC14533e.startapp(C2280e.ad);
        this.f29458e = startapp;
        this.f29452e = AbstractC14533e.startapp(null);
        this.f29451e = new C12742e();
        this.f29457e = new ArrayList();
        Boolean bool = Boolean.FALSE;
        this.f29450e = AbstractC14533e.startapp(bool);
        this.f29459e = AbstractC14533e.startapp(bool);
        startapp.setValue(new C6123e(audioPlaylist, m3869for(audioPlaylist, vKProfile), m3870public(audioPlaylist), audioPlaylist.adcel(), audioPlaylist.adcel() != 4, m3868e(audioPlaylist)));
    }

    /* renamed from: continue, reason: not valid java name */
    public static void m3867continue(int i, C14873e c14873e, AudioTrack audioTrack, boolean z) {
        InterfaceC1686e c16482e;
        AudioPlaylist audioPlaylist;
        if ((i & 1) != 0) {
            audioTrack = null;
        }
        boolean z2 = false;
        boolean z3 = (i & 2) != 0 ? false : z;
        AudioPlaylist m3876e = c14873e.m3876e();
        if (m3876e != null) {
            int adcel = m3876e.adcel();
            if (m3876e.f36511instanceof || (adcel != 5 && adcel != 4)) {
                z2 = true;
            }
        }
        InterfaceC11578e m3875e = c14873e.m3875e();
        C6123e c6123e = m3875e instanceof C6123e ? (C6123e) m3875e : null;
        String str = (c6123e == null || (audioPlaylist = c6123e.ad) == null) ? null : audioPlaylist.subs;
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (z2) {
            AudioPlaylist m3876e2 = c14873e.m3876e();
            String signatures = m3876e2 != null ? AbstractC13406e.signatures(m3876e2) : null;
            if (signatures != null) {
                str2 = signatures;
            }
            c16482e = new C3683e(str2, str);
        } else {
            AudioPlaylist m3876e3 = c14873e.m3876e();
            String signatures2 = m3876e3 != null ? AbstractC13406e.signatures(m3876e3) : null;
            if (signatures2 != null) {
                str2 = signatures2;
            }
            c16482e = new C16482e(str2, str);
        }
        AppActivity appActivity = (AppActivity) c14873e.pro();
        String purchase = audioTrack != null ? AbstractC6914e.purchase(audioTrack) : null;
        AbstractC13201e.metrica(appActivity, c16482e, new C0086e(purchase != null ? new C1703e(purchase) : C2406e.ad, 0L, c14873e.f29457e, false, true, z3, 74));
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public static String m3868e(AudioPlaylist audioPlaylist) {
        boolean admob = AbstractC13406e.admob(audioPlaylist);
        int i = audioPlaylist.f36526try;
        String str = audioPlaylist.f36503catch;
        if (!admob && (audioPlaylist.f36521super || str == null)) {
            if (audioPlaylist.f36513native.isEmpty()) {
                str = i != 0 ? String.valueOf(i) : null;
            } else {
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                str = vKXApplication.getString(R.string.playlist_year_and_genre, AbstractC13480e.m3608try(audioPlaylist.f36513native, null, null, null, new C4526e(9), 31), Integer.valueOf(i));
            }
        }
        if (str != null) {
            return str;
        }
        VKXApplication vKXApplication2 = VKXApplication.f36528e;
        VKXApplication vKXApplication3 = vKXApplication2 != null ? vKXApplication2 : null;
        DecimalFormat decimalFormat = C5575e.ad;
        return vKXApplication3.getString(R.string.play_count, C5575e.vip(audioPlaylist.f36512interface));
    }

    /* renamed from: for, reason: not valid java name */
    public static InterfaceC8360e m3869for(AudioPlaylist audioPlaylist, VKProfile vKProfile) {
        return AbstractC13406e.amazon(audioPlaylist) ? new C8583e(audioPlaylist.f36507final) : vKProfile != null ? new C13640e(vKProfile.ad(), vKProfile.license) : C9616e.f19071e;
    }

    /* renamed from: public, reason: not valid java name */
    public static String m3870public(AudioPlaylist audioPlaylist) {
        String str;
        boolean z = audioPlaylist.f36522synchronized;
        List list = audioPlaylist.f36505default;
        if (z) {
            return AbstractC4224e.purchase(audioPlaylist.f36518return ? 1 : 5, AbstractC13406e.signatures(audioPlaylist)).f21024e.remoteconfig();
        }
        if (list.isEmpty()) {
            AlbumThumb albumThumb = audioPlaylist.f36500abstract;
            str = albumThumb != null ? albumThumb.metrica : null;
            return str == null ? BuildConfig.FLAVOR : str;
        }
        AlbumThumb albumThumb2 = (AlbumThumb) AbstractC13480e.m3604this(list);
        str = albumThumb2 != null ? albumThumb2.metrica : null;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x005a, code lost:
    
        if (r9 != 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0073, code lost:
    
        if (r1 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: volatile, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3871volatile(defpackage.C14873e r17, defpackage.AbstractC10731e r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14873e.m3871volatile(eٟٔؗ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC9019e, defpackage.AbstractC13859e
    /* renamed from: class */
    public final void mo1847class(View view) {
        super.mo1847class(view);
        C18220e metrica = AbstractC4608e.metrica(vip());
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(metrica, ExecutorC3603e.f8134e, 0, new C17019e(this, (InterfaceC5083e) null, 3), 2).mo692else(new C13553e(this, 1));
    }

    /* renamed from: const, reason: not valid java name */
    public final void m3872const(C13640e c13640e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-145642133);
        int i2 = i | (c13770e2.purchase(c13640e) ? 4 : 2);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            String str = c13640e.f27059e;
            C0115e c0115e = C0115e.f1276e;
            if (str == null || str.length() == 0) {
                c13770e2.m3676strictfp(-907679864);
                AbstractC14489e.vip(c13640e.f27060e, AbstractC18007e.metrica(AbstractC12220e.smaato(c0115e, 16, 0.0f, 2), 1.0f), ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, c13770e, 48, 0, 261112);
                c13770e2 = c13770e;
                c13770e2.Signature(false);
            } else {
                c13770e2.m3676strictfp(-907396958);
                C14544e c14544e = C5438e.f11668e;
                InterfaceC12864e smaato = AbstractC12220e.smaato(c0115e, 16, 0.0f, 2);
                C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, c14544e, c13770e2, 48);
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
                AbstractC8461e.ad(c13640e.f27059e, null, AbstractC12447e.vip(AbstractC18007e.startapp(c0115e, 64), AbstractC6549e.ad), null, null, c13770e2, 48, 2040);
                AbstractC14489e.vip(c13640e.f27060e, null, ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262138);
                c13770e2 = c13770e;
                c13770e2.Signature(true);
                c13770e2.Signature(false);
            }
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(this, c13640e, i, 19);
        }
    }

    /* renamed from: else, reason: not valid java name */
    public final void m3873else(String str, String str2, C2892e c2892e, C2892e c2892e2, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-692463889);
        int i2 = i | (c13770e2.purchase(str) ? 4 : 2) | (c13770e2.purchase(str2) ? 32 : 16) | (c13770e2.yandex(this) ? 16384 : 8192);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            long j = ((C7019e) c13770e2.adcel(AbstractC11785e.ad)).ad.Signature;
            InterfaceC12864e vip = AbstractC17113e.vip(AbstractC18007e.metrica(C0115e.f1276e, 1.0f));
            InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
            long j2 = c13770e2.f27286case;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, vip);
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
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            C5944e c5944e = new C5944e((Context) c13770e2.adcel(AbstractC2676e.vip));
            c5944e.metrica = str;
            c5944e.license(175);
            AbstractC2182e.metrica(c5944e, new C5939e(C7943e.purchase));
            C14542e ad = c5944e.ad();
            C7913e c7913e = AbstractC18007e.metrica;
            boolean appmetrica = c13770e2.appmetrica(j);
            Object m3681throw = c13770e2.m3681throw();
            if (appmetrica || m3681throw == C2987e.ad) {
                m3681throw = new C14134e(j, 7);
                c13770e2.m3682throws(m3681throw);
            }
            AbstractC8461e.ad(ad, null, AbstractC5750e.appmetrica(c7913e, (Function1) m3681throw), C16477e.ad, null, c13770e, 1572912, 1976);
            int i4 = i2 << 3;
            c13770e2 = c13770e;
            m3881switch(str, str2, c2892e, c2892e2, c13770e2, (i4 & 112) | 6 | (i4 & 896) | 27648 | (i4 & 458752));
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C0773e(this, str, str2, c2892e, c2892e2, i);
        }
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public final void m3874e(boolean z) {
        this.f29450e.setValue(Boolean.valueOf(z));
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final InterfaceC11578e m3875e() {
        return (InterfaceC11578e) this.f29458e.getValue();
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final AudioPlaylist m3876e() {
        InterfaceC11578e m3875e = m3875e();
        C6123e c6123e = m3875e instanceof C6123e ? (C6123e) m3875e : null;
        if (c6123e != null) {
            return c6123e.ad;
        }
        return null;
    }

    @Override // defpackage.AbstractC10347e
    /* renamed from: final */
    public final void mo212final(C13770e c13770e, int i) {
        c13770e.m3671package(-810107519);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C10339e appmetrica = AbstractC9083e.appmetrica(c13770e);
            if (((Boolean) this.f29459e.getValue()).booleanValue()) {
                c13770e.m3676strictfp(-491628594);
                m3879instanceof(c13770e, i2 & 14);
            } else {
                c13770e.m3676strictfp(-504829727);
            }
            c13770e.Signature(false);
            InterfaceC11578e m3875e = m3875e();
            if (AbstractC7890e.billing(m3875e, C2280e.ad)) {
                c13770e.m3676strictfp(-491484816);
                AbstractC0436e.ad(AbstractC18007e.metrica, true, 0L, c13770e, 54, 4);
                c13770e.Signature(false);
            } else {
                if (!(m3875e instanceof C6123e)) {
                    throw AbstractC1786e.loadAd(-1124230518, c13770e, false);
                }
                c13770e.m3676strictfp(-491174475);
                C6123e c6123e = (C6123e) m3875e;
                AbstractC13348e.ad(null, AbstractC16653e.license(773405030, new C4197e(22, appmetrica, c6123e, this), c13770e), null, null, null, 0, 0L, 0L, null, AbstractC16653e.license(1965899697, new C8124e(7, appmetrica, this, c6123e), c13770e), c13770e, 805306416, 509);
                c13770e.Signature(false);
            }
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4642e(this, i, 3);
        }
    }

    /* renamed from: finally, reason: not valid java name */
    public final void m3877finally(AudioTrack audioTrack, boolean z, int i, C13770e c13770e, int i2) {
        C13770e c13770e2;
        c13770e.m3671package(-1341959625);
        int i3 = (c13770e.purchase(audioTrack) ? 4 : 2) | i2 | (c13770e.billing(z) ? 32 : 16) | (c13770e.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(this) ? 2048 : 1024);
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean yandex = (i4 == 4) | c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C7036e(audioTrack, this);
                c13770e.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) m3681throw;
            boolean yandex2 = c13770e.yandex(this) | (i4 == 4);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C7036e(this, audioTrack);
                c13770e.m3682throws(m3681throw2);
            }
            c13770e2 = c13770e;
            AbstractC6401e.vip(AbstractC16653e.license(-212488983, new C17824e(i, this, audioTrack, z), c13770e), AbstractC16653e.license(-1908512342, new C11961e(audioTrack, 0), c13770e), AbstractC12220e.advert(AbstractC18007e.metrica(AbstractC9546e.purchase(C0115e.f1276e, function0, (Function0) m3681throw2), 1.0f), 16, 4), AbstractC16653e.license(-1005591764, new C11961e(audioTrack, 1), c13770e), c13770e2, 3126, 0);
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C11935e(this, audioTrack, z, i, i2);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final void m3878import(long j, C8583e c8583e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(1873064375);
        long j2 = j;
        int i2 = (i & 6) == 0 ? (c13770e2.appmetrica(j2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= c13770e2.purchase(c8583e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e2.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = 0;
        if (c13770e2.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object m3681throw = c13770e2.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                List list = c8583e.f17406e;
                C13553e c13553e = new C13553e(this, i3);
                C9122e c9122e = new C9122e();
                int i4 = 0;
                for (Object obj : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC6874e.Signature();
                        throw null;
                    }
                    MainArtist mainArtist = (MainArtist) obj;
                    String str = mainArtist.ad;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    C13553e c13553e2 = c13553e;
                    C9122e c9122e2 = c9122e;
                    int i6 = i4;
                    List list2 = list;
                    C9634e c9634e = new C9634e(new C5320e("LF/Artist/".concat(str), new C2233e(new C4282e(j2, 0L, C1812e.f4889e, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530), null, null, null), new C18070e(c13553e2, mainArtist, 17)), c9122e2.f18278e.length(), 0, 12);
                    ArrayList arrayList = c9122e2.f18277e;
                    arrayList.add(c9634e);
                    c9122e2.f18276e.add(c9634e);
                    int size = arrayList.size() - 1;
                    try {
                        c9122e2.metrica(mainArtist.metrica);
                        Unit unit = Unit.INSTANCE;
                        c9122e2.license(size);
                        if (i6 != AbstractC6874e.billing(list2)) {
                            c9122e2.metrica(" • ");
                        }
                        c13553e = c13553e2;
                        c9122e = c9122e2;
                        i3 = 0;
                        i4 = i5;
                        list = list2;
                        j2 = j;
                    } catch (Throwable th) {
                        c9122e2.license(size);
                        throw th;
                    }
                }
                m3681throw = c9122e.purchase();
                c13770e2 = c13770e;
                c13770e2.m3682throws(m3681throw);
            }
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.metrica((C10566e) m3681throw, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), 0L, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, null, null, C1839e.ad(((C7019e) c13770e2.adcel(c15492e)).vip.mopub, ((C7019e) c13770e2.adcel(c15492e)).ad.remoteconfig, 0L, null, null, 0L, 0L, null, null, 16777214), c13770e2, 48, 0, 261116);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C16309e(this, j, c8583e, i);
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m3879instanceof(C13770e c13770e, int i) {
        c13770e.m3671package(-1749433467);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C4948e(this, 4);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC9262e.ad((Function0) m3681throw, AbstractC16653e.license(-1091424195, new C4642e(this, 4), c13770e), null, AbstractC16653e.license(1478934779, new C4642e(this, 5), c13770e), AbstractC9931e.smaato, AbstractC9931e.amazon, AbstractC9931e.loadAd, null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1797168, 0, 16260);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4642e(this, i, 6);
        }
    }

    /* renamed from: return, reason: not valid java name */
    public final void m3880return(InterfaceC8360e interfaceC8360e, C13770e c13770e, int i) {
        C13770e c13770e2;
        c13770e.m3671package(-1185939548);
        int i2 = (c13770e.purchase(interfaceC8360e) ? 4 : 2) | i | (c13770e.yandex(this) ? 32 : 16);
        if (!c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c13770e2 = c13770e;
            c13770e2.m3659default();
        } else if (interfaceC8360e instanceof C8583e) {
            c13770e.m3676strictfp(76074480);
            c13770e2 = c13770e;
            m3878import(((C7019e) c13770e.adcel(AbstractC11785e.ad)).ad.admob, (C8583e) interfaceC8360e, c13770e2, (i2 << 3) & 896);
            c13770e2.Signature(false);
        } else {
            c13770e2 = c13770e;
            if (interfaceC8360e instanceof C13640e) {
                c13770e2.m3676strictfp(76230720);
                m3872const((C13640e) interfaceC8360e, c13770e2, i2 & 112);
                c13770e2.Signature(false);
            } else {
                if (!interfaceC8360e.equals(C9616e.f19071e)) {
                    throw AbstractC1786e.loadAd(-1521568501, c13770e2, false);
                }
                c13770e2.m3676strictfp(76336430);
                c13770e2.Signature(false);
            }
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(this, interfaceC8360e, i, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [eؔ۟ٓ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [eؔ۟ٓ] */
    /* renamed from: switch, reason: not valid java name */
    public final void m3881switch(String str, String str2, C2892e c2892e, C2892e c2892e2, C13770e c13770e, int i) {
        int i2;
        String str3;
        C13770e c13770e2;
        C2892e c2892e3;
        C2892e c2892e4;
        C2892e c2892e5 = c2892e;
        C2892e c2892e6 = c2892e2;
        C13770e c13770e3 = c13770e;
        c13770e3.m3671package(1642259257);
        int i3 = i & 6;
        C14486e c14486e = C14486e.ad;
        if (i3 == 0) {
            i2 = (c13770e3.purchase(c14486e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= c13770e3.purchase(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e3.purchase(str2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13770e3.yandex(c2892e5) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13770e3.yandex(c2892e6) ? 16384 : 8192;
        }
        if (c13770e3.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            C10156e c10156e = C5438e.f11682e;
            C0115e c0115e = C0115e.f1276e;
            float f = 16;
            InterfaceC12864e smaato = AbstractC12220e.smaato(c14486e.ad(c0115e, c10156e), f, 0.0f, 2);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(f), C5438e.f11678e, c13770e3, 54);
            long j = c13770e3.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e3.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, smaato);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e3.m3666import();
            if (c13770e3.f27292implements) {
                c13770e3.mopub(c7309e);
            } else {
                c13770e3.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e3, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e3, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i4);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e3, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e3, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e3, purchase, c14865e4);
            AbstractC12534e.ad(c13770e3, AbstractC5400e.billing(AbstractC18007e.license(c0115e, 72), AbstractC5400e.startapp));
            InterfaceC12864e startapp = AbstractC18007e.startapp(c0115e, 170);
            C15492e c15492e = AbstractC11785e.ad;
            int i5 = i2;
            AbstractC8461e.ad(str3, null, AbstractC12447e.vip(startapp, ((C7019e) c13770e3.adcel(c15492e)).metrica.metrica), null, null, c13770e3, ((i2 >> 3) & 14) | 48, 2040);
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.billing(4), C5438e.f11672e, c13770e3, 6);
            long j2 = c13770e3.f27286case;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e3.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e3, c0115e);
            c13770e3.m3666import();
            if (c13770e3.f27292implements) {
                c13770e3.mopub(c7309e);
            } else {
                c13770e3.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e3, ad2, c14865e);
            AbstractC2270e.yandex(c13770e3, advert2, c14865e2);
            AbstractC13501e.mopub(i6, c13770e3, c14865e3, c13770e3, c5430e);
            AbstractC2270e.yandex(c13770e3, purchase2, c14865e4);
            AbstractC14489e.vip(str2, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e3.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 2, false, 1, 0, ((C7019e) c13770e3.adcel(c15492e)).vip.billing, c13770e, ((i5 >> 6) & 14) | 48, 24960, 109560);
            C13770e c13770e4 = c13770e;
            ?? r4 = c2892e;
            r4.invoke(c13770e4, Integer.valueOf((i5 >> 9) & 14));
            ?? r5 = c2892e2;
            r5.invoke(c13770e4, Integer.valueOf((i5 >> 12) & 14));
            c13770e4.Signature(true);
            c13770e4.Signature(true);
            c2892e4 = r4;
            c2892e3 = r5;
            c13770e2 = c13770e4;
        } else {
            c13770e3.m3659default();
            c2892e4 = c2892e5;
            c2892e3 = c2892e6;
            c13770e2 = c13770e3;
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C4280e(this, str, str2, c2892e4, c2892e3, i, 4);
        }
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m3882synchronized(C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1306047016);
        int i2 = (c13770e2.yandex(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c13770e2.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            float f = 16;
            float f2 = 8;
            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC12220e.smaato(AbstractC16136e.metrica(C0115e.f1276e, AbstractC0903e.license(c13770e2).Signature, AbstractC10432e.ad), f, 0.0f, 2), 0.0f, f2, 1);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.billing(f), C5438e.f11685e, c13770e2, 6);
            long j = c13770e2.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
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
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            boolean yandex = c13770e2.yandex(this);
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C4948e(this, i3);
                c13770e2.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) m3681throw;
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            C5228e c5228e = new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C3924e c3924e = AbstractC0903e.purchase(c13770e2).metrica;
            C16005e c16005e = AbstractC10244e.ad;
            AbstractC1513e.ad(function0, c5228e, false, c3924e, AbstractC10244e.ad(AbstractC0903e.license(c13770e2).admob, AbstractC0903e.license(c13770e2).tapsense, 0L, 0L, c13770e2, 12), null, null, AbstractC12220e.metrica(0.0f, f2, 1), AbstractC9931e.metrica, c13770e, 817889280, 356);
            boolean yandex2 = c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C4948e(this, 2);
                c13770e.m3682throws(m3681throw2);
            }
            Function0 function02 = (Function0) m3681throw2;
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC1513e.ad(function02, new C5228e(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), false, AbstractC0903e.purchase(c13770e).metrica, AbstractC10244e.ad(AbstractC0903e.license(c13770e).subscription, AbstractC0903e.license(c13770e).admob, 0L, 0L, c13770e, 12), null, null, AbstractC12220e.metrica(0.0f, f2, 1), AbstractC9931e.license, c13770e, 817889280, 356);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C4642e(this, i, 0);
        }
    }

    /* renamed from: throws, reason: not valid java name */
    public final void m3883throws(C13770e c13770e, int i) {
        c13770e.m3671package(1420809827);
        int i2 = i | (c13770e.yandex(this) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            boolean booleanValue = ((Boolean) this.f29450e.getValue()).booleanValue();
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C4948e(this, 3);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC4709e.ad(booleanValue, (Function0) m3681throw, null, 0L, null, null, null, 0L, 0.0f, 0.0f, AbstractC16653e.license(2082269064, new C15623e(this, 0), c13770e), c13770e, 0, 2044);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4642e(this, i, 1);
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m3884transient(String str, C13770e c13770e, int i) {
        c13770e.m3671package(650579347);
        int i2 = i | (c13770e.purchase(str) ? 4 : 2);
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, i2 & 14, 0, 262142);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(this, str, i, 17);
        }
    }
}
