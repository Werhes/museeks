package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16975e {

    /* renamed from: const, reason: not valid java name */
    public static final String f33241const;

    /* renamed from: continue, reason: not valid java name */
    public static final String f33242continue;

    /* renamed from: else, reason: not valid java name */
    public static final String f33244else;

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public static final String f33245e;

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public static final String f33246e;

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public static final String f33247e;

    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public static final String f33248e;

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public static final String f33249e;

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public static final String f33250e;

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public static final String f33251e;

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public static final String f33252e;

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public static final String f33253e;

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public static final String f33254e;

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public static final String f33255e;

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public static final String f33256e;

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public static final String f33257e;

    /* renamed from: finally, reason: not valid java name */
    public static final String f33259finally;

    /* renamed from: for, reason: not valid java name */
    public static final String f33260for;

    /* renamed from: import, reason: not valid java name */
    public static final String f33262import;

    /* renamed from: instanceof, reason: not valid java name */
    public static final String f33263instanceof;

    /* renamed from: package, reason: not valid java name */
    public static final String f33265package;

    /* renamed from: public, reason: not valid java name */
    public static final String f33267public;

    /* renamed from: return, reason: not valid java name */
    public static final String f33268return;

    /* renamed from: static, reason: not valid java name */
    public static final String f33269static;

    /* renamed from: switch, reason: not valid java name */
    public static final String f33272switch;

    /* renamed from: synchronized, reason: not valid java name */
    public static final String f33273synchronized;

    /* renamed from: throws, reason: not valid java name */
    public static final String f33274throws;

    /* renamed from: transient, reason: not valid java name */
    public static final String f33275transient;

    /* renamed from: volatile, reason: not valid java name */
    public static final String f33276volatile;
    public final int Signature;

    /* renamed from: abstract, reason: not valid java name */
    public int f33277abstract;
    public final String ad;
    public final int adcel;
    public final int admob;
    public final int ads;
    public final C17750e advert;
    public final String amazon;
    public final float applovin;
    public final int appmetrica;
    public final int billing;

    /* renamed from: break, reason: not valid java name */
    public final int f33278break;

    /* renamed from: class, reason: not valid java name */
    public final int f33279class;
    public final int crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public final int f33280extends;
    public final C14754e firebase;

    /* renamed from: goto, reason: not valid java name */
    public final int f33281goto;
    public final int inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final int f33282interface;
    public final int isPro;
    public final int isVip;
    public final String license;
    public final String loadAd;
    public final AbstractC17475e metrica;
    public final String mopub;

    /* renamed from: native, reason: not valid java name */
    public final int f33283native;
    public final float premium;
    public final long pro;

    /* renamed from: protected, reason: not valid java name */
    public final int f33284protected;
    public final int purchase;
    public final C9284e remoteconfig;
    public final boolean signatures;
    public final String smaato;
    public final int startapp;
    public final byte[] subs;
    public final List subscription;
    public final int tapsense;

    /* renamed from: this, reason: not valid java name */
    public final int f33285this;

    /* renamed from: throw, reason: not valid java name */
    public final int f33286throw;

    /* renamed from: try, reason: not valid java name */
    public final int f33287try;
    public final String vip;

    /* renamed from: while, reason: not valid java name */
    public final int f33288while;
    public final int yandex;

    /* renamed from: default, reason: not valid java name */
    public static final C16975e f33243default = new C16975e(new C11445e());

    /* renamed from: implements, reason: not valid java name */
    public static final String f33261implements = Integer.toString(0, 36);

    /* renamed from: case, reason: not valid java name */
    public static final String f33239case = Integer.toString(1, 36);

    /* renamed from: catch, reason: not valid java name */
    public static final String f33240catch = Integer.toString(2, 36);

    /* renamed from: final, reason: not valid java name */
    public static final String f33258final = Integer.toString(3, 36);

    /* renamed from: super, reason: not valid java name */
    public static final String f33271super = Integer.toString(4, 36);

    /* renamed from: new, reason: not valid java name */
    public static final String f33264new = Integer.toString(5, 36);

    /* renamed from: strictfp, reason: not valid java name */
    public static final String f33270strictfp = Integer.toString(6, 36);

    /* renamed from: private, reason: not valid java name */
    public static final String f33266private = Integer.toString(7, 36);

    static {
        Integer.toString(8, 36);
        f33265package = Integer.toString(9, 36);
        f33275transient = Integer.toString(10, 36);
        f33262import = Integer.toString(11, 36);
        f33263instanceof = Integer.toString(12, 36);
        f33269static = Integer.toString(13, 36);
        f33273synchronized = Integer.toString(14, 36);
        f33268return = Integer.toString(15, 36);
        f33244else = Integer.toString(16, 36);
        f33272switch = Integer.toString(17, 36);
        f33274throws = Integer.toString(18, 36);
        f33259finally = Integer.toString(19, 36);
        f33241const = Integer.toString(20, 36);
        f33276volatile = Integer.toString(21, 36);
        f33260for = Integer.toString(22, 36);
        f33242continue = Integer.toString(23, 36);
        f33267public = Integer.toString(24, 36);
        f33257e = Integer.toString(25, 36);
        f33251e = Integer.toString(26, 36);
        f33253e = Integer.toString(27, 36);
        f33246e = Integer.toString(28, 36);
        f33245e = Integer.toString(29, 36);
        f33247e = Integer.toString(30, 36);
        f33252e = Integer.toString(31, 36);
        f33248e = Integer.toString(32, 36);
        f33255e = Integer.toString(33, 36);
        f33256e = Integer.toString(34, 36);
        f33249e = Integer.toString(35, 36);
        f33250e = Integer.toString(36, 36);
        f33254e = Integer.toString(37, 36);
    }

    public C16975e(C11445e c11445e) {
        boolean z;
        String str;
        this.ad = c11445e.ad;
        String m2547catch = AbstractC9413e.m2547catch(c11445e.license);
        this.license = m2547catch;
        if (c11445e.metrica.isEmpty() && c11445e.vip != null) {
            this.metrica = AbstractC17475e.ads(new C12016e(m2547catch, c11445e.vip));
            this.vip = c11445e.vip;
        } else if (c11445e.metrica.isEmpty() || c11445e.vip != null) {
            if (!c11445e.metrica.isEmpty() || c11445e.vip != null) {
                for (int i = 0; i < c11445e.metrica.size(); i++) {
                    if (!((C12016e) c11445e.metrica.get(i)).vip.equals(c11445e.vip)) {
                    }
                }
                z = false;
                AbstractC2301e.subscription(z);
                this.metrica = c11445e.metrica;
                this.vip = c11445e.vip;
            }
            z = true;
            AbstractC2301e.subscription(z);
            this.metrica = c11445e.metrica;
            this.vip = c11445e.vip;
        } else {
            AbstractC17475e abstractC17475e = c11445e.metrica;
            this.metrica = abstractC17475e;
            Iterator it = abstractC17475e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C12016e) abstractC17475e.get(0)).vip;
                    break;
                }
                C12016e c12016e = (C12016e) it.next();
                if (TextUtils.equals(c12016e.ad, m2547catch)) {
                    str = c12016e.vip;
                    break;
                }
            }
            this.vip = str;
        }
        this.appmetrica = c11445e.appmetrica;
        AbstractC2301e.admob("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c11445e.billing == 0 || (c11445e.purchase & 32768) != 0);
        this.purchase = c11445e.purchase;
        this.billing = c11445e.billing;
        int i2 = c11445e.yandex;
        this.yandex = i2;
        int i3 = c11445e.startapp;
        this.startapp = i3;
        this.adcel = i3 != -1 ? i3 : i2;
        this.mopub = c11445e.adcel;
        this.advert = c11445e.mopub;
        this.smaato = c11445e.advert;
        this.amazon = c11445e.smaato;
        this.loadAd = c11445e.amazon;
        this.Signature = c11445e.loadAd;
        this.admob = c11445e.Signature;
        List list = c11445e.admob;
        this.subscription = list == null ? Collections.EMPTY_LIST : list;
        C9284e c9284e = c11445e.subscription;
        this.remoteconfig = c9284e;
        this.pro = c11445e.remoteconfig;
        this.signatures = c11445e.pro;
        this.tapsense = c11445e.signatures;
        this.isVip = c11445e.tapsense;
        this.inmobi = c11445e.isVip;
        this.isPro = c11445e.inmobi;
        this.applovin = c11445e.isPro;
        int i4 = c11445e.applovin;
        this.ads = i4 == -1 ? 0 : i4;
        float f = c11445e.ads;
        this.premium = f == -1.0f ? 1.0f : f;
        this.subs = c11445e.premium;
        this.crashlytics = c11445e.subs;
        this.firebase = c11445e.crashlytics;
        this.f33279class = c11445e.firebase;
        this.f33282interface = c11445e.f23018class;
        this.f33281goto = c11445e.f23021interface;
        this.f33285this = c11445e.f23020goto;
        int i5 = c11445e.f23024this;
        this.f33283native = i5 == -1 ? 0 : i5;
        int i6 = c11445e.f23022native;
        this.f33280extends = i6 != -1 ? i6 : 0;
        this.f33286throw = c11445e.f23019extends;
        this.f33288while = c11445e.f23025throw;
        this.f33287try = c11445e.f23027while;
        this.f33284protected = c11445e.f23026try;
        int i7 = c11445e.f23023protected;
        if (i7 != 0 || c9284e == null) {
            this.f33278break = i7;
        } else {
            this.f33278break = 1;
        }
    }

    public static String metrica(C16975e c16975e) {
        char c;
        int i;
        String str;
        String str2;
        if (c16975e == null) {
            return "null";
        }
        int i2 = c16975e.appmetrica;
        AbstractC17475e abstractC17475e = c16975e.metrica;
        String str3 = c16975e.license;
        int i3 = c16975e.f33281goto;
        int i4 = c16975e.f33282interface;
        int i5 = c16975e.f33279class;
        float f = c16975e.applovin;
        C14754e c14754e = c16975e.firebase;
        float f2 = c16975e.premium;
        int i6 = c16975e.isPro;
        int i7 = c16975e.inmobi;
        int i8 = c16975e.isVip;
        int i9 = c16975e.tapsense;
        C9284e c9284e = c16975e.remoteconfig;
        String str4 = c16975e.mopub;
        int i10 = c16975e.adcel;
        String str5 = c16975e.smaato;
        String str6 = c16975e.amazon;
        int i11 = c16975e.purchase;
        C7364e c7364e = new C7364e(String.valueOf(','));
        StringBuilder inmobi = AbstractC8703e.inmobi("id=");
        inmobi.append(c16975e.ad);
        inmobi.append(", mimeType=");
        inmobi.append(c16975e.loadAd);
        if (str6 != null) {
            inmobi.append(", container=");
            inmobi.append(str6);
        }
        if (str5 != null) {
            inmobi.append(", primaryGroupId=");
            inmobi.append(str5);
        }
        if (i10 != -1) {
            inmobi.append(", bitrate=");
            inmobi.append(i10);
        }
        if (str4 != null) {
            inmobi.append(", codecs=");
            inmobi.append(str4);
        }
        if (c9284e != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < c9284e.f18506e; i12++) {
                UUID uuid = c9284e.f18507e[i12].f28264e;
                if (uuid.equals(AbstractC18394e.metrica)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC18394e.license)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC18394e.purchase)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC18394e.appmetrica)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC18394e.vip)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            c = 0;
            inmobi.append(", drm=[");
            c7364e.ad(inmobi, linkedHashSet.iterator());
            inmobi.append(']');
        } else {
            c = 0;
        }
        if (i9 != -1 && i8 != -1) {
            inmobi.append(", res=");
            inmobi.append(i9);
            inmobi.append("x");
            inmobi.append(i8);
        }
        if (i7 != -1 && i6 != -1) {
            inmobi.append(", decRes=");
            inmobi.append(i7);
            inmobi.append("x");
            inmobi.append(i6);
        }
        double d = f2;
        int i13 = AbstractC15452e.ad;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            inmobi.append(", par=");
            Object[] objArr = new Object[1];
            objArr[c] = Float.valueOf(f2);
            String str7 = AbstractC9413e.ad;
            inmobi.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (c14754e != null) {
            int i14 = c14754e.purchase;
            int i15 = c14754e.appmetrica;
            if ((i15 != -1 && i14 != -1) || c14754e.license()) {
                inmobi.append(", color=");
                if (c14754e.license()) {
                    String vip = C14754e.vip(c14754e.ad);
                    String ad = C14754e.ad(c14754e.vip);
                    String metrica = C14754e.metrica(c14754e.metrica);
                    String str8 = AbstractC9413e.ad;
                    Locale locale = Locale.US;
                    str2 = vip + "/" + ad + "/" + metrica;
                } else {
                    str2 = "NA/NA/NA";
                }
                inmobi.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + "/" + i14));
            }
        }
        if (f != -1.0f) {
            inmobi.append(", fps=");
            inmobi.append(f);
        }
        if (i5 != -1) {
            inmobi.append(", maxSubLayers=");
            inmobi.append(i5);
        }
        if (i4 != -1) {
            inmobi.append(", channels=");
            inmobi.append(i4);
        }
        if (i3 != -1) {
            inmobi.append(", sample_rate=");
            inmobi.append(i3);
        }
        if (str3 != null) {
            inmobi.append(", language=");
            inmobi.append(str3);
        }
        if (!abstractC17475e.isEmpty()) {
            inmobi.append(", labels=[");
            c7364e.ad(inmobi, AbstractC10589e.purchase(new C10612e(5), abstractC17475e).iterator());
            inmobi.append("]");
        }
        if (i2 != 0) {
            inmobi.append(", selectionFlags=[");
            String str9 = AbstractC9413e.ad;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            c7364e.ad(inmobi, arrayList.iterator());
            inmobi.append("]");
        }
        if (i11 != 0) {
            inmobi.append(", roleFlags=[");
            String str10 = AbstractC9413e.ad;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                arrayList2.add("sign");
            }
            if ((i & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            c7364e.ad(inmobi, arrayList2.iterator());
            inmobi.append("]");
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            inmobi.append(", auxiliaryTrackType=");
            int i16 = c16975e.billing;
            String str11 = AbstractC9413e.ad;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            inmobi.append(str);
        }
        return inmobi.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؑٝ, java.lang.Object] */
    public final C11445e ad() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        obj.purchase = this.purchase;
        obj.yandex = this.yandex;
        obj.startapp = this.startapp;
        obj.adcel = this.mopub;
        obj.mopub = this.advert;
        obj.advert = this.smaato;
        obj.smaato = this.amazon;
        obj.amazon = this.loadAd;
        obj.loadAd = this.Signature;
        obj.Signature = this.admob;
        obj.admob = this.subscription;
        obj.subscription = this.remoteconfig;
        obj.remoteconfig = this.pro;
        obj.pro = this.signatures;
        obj.signatures = this.tapsense;
        obj.tapsense = this.isVip;
        obj.isVip = this.inmobi;
        obj.inmobi = this.isPro;
        obj.isPro = this.applovin;
        obj.applovin = this.ads;
        obj.ads = this.premium;
        obj.premium = this.subs;
        obj.subs = this.crashlytics;
        obj.crashlytics = this.firebase;
        obj.firebase = this.f33279class;
        obj.f23018class = this.f33282interface;
        obj.f23021interface = this.f33281goto;
        obj.f23020goto = this.f33285this;
        obj.f23024this = this.f33283native;
        obj.f23022native = this.f33280extends;
        obj.f23019extends = this.f33286throw;
        obj.f23025throw = this.f33288while;
        obj.f23027while = this.f33287try;
        obj.f23026try = this.f33284protected;
        obj.f23023protected = this.f33278break;
        return obj;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C16975e.class != obj.getClass()) {
            return false;
        }
        C16975e c16975e = (C16975e) obj;
        int i2 = this.f33277abstract;
        return (i2 == 0 || (i = c16975e.f33277abstract) == 0 || i2 == i) && this.appmetrica == c16975e.appmetrica && this.purchase == c16975e.purchase && this.billing == c16975e.billing && this.yandex == c16975e.yandex && this.startapp == c16975e.startapp && this.Signature == c16975e.Signature && this.pro == c16975e.pro && this.tapsense == c16975e.tapsense && this.isVip == c16975e.isVip && this.inmobi == c16975e.inmobi && this.isPro == c16975e.isPro && this.ads == c16975e.ads && this.crashlytics == c16975e.crashlytics && this.f33279class == c16975e.f33279class && this.f33282interface == c16975e.f33282interface && this.f33281goto == c16975e.f33281goto && this.f33285this == c16975e.f33285this && this.f33283native == c16975e.f33283native && this.f33280extends == c16975e.f33280extends && this.f33286throw == c16975e.f33286throw && this.f33287try == c16975e.f33287try && this.f33284protected == c16975e.f33284protected && this.f33278break == c16975e.f33278break && Float.compare(this.applovin, c16975e.applovin) == 0 && Float.compare(this.premium, c16975e.premium) == 0 && Objects.equals(this.ad, c16975e.ad) && Objects.equals(this.vip, c16975e.vip) && this.metrica.equals(c16975e.metrica) && Objects.equals(this.mopub, c16975e.mopub) && Objects.equals(this.smaato, c16975e.smaato) && Objects.equals(this.amazon, c16975e.amazon) && Objects.equals(this.loadAd, c16975e.loadAd) && Objects.equals(this.license, c16975e.license) && Arrays.equals(this.subs, c16975e.subs) && Objects.equals(this.advert, c16975e.advert) && Objects.equals(this.firebase, c16975e.firebase) && Objects.equals(this.remoteconfig, c16975e.remoteconfig) && vip(c16975e);
    }

    public final int hashCode() {
        if (this.f33277abstract == 0) {
            String str = this.ad;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.vip;
            int hashCode2 = (this.metrica.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.license;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.appmetrica) * 31) + this.purchase) * 31) + this.billing) * 31) + this.yandex) * 31) + this.startapp) * 31;
            String str4 = this.mopub;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C17750e c17750e = this.advert;
            int hashCode5 = (hashCode4 + (c17750e == null ? 0 : c17750e.hashCode())) * 961;
            String str5 = this.smaato;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.amazon;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.loadAd;
            this.f33277abstract = ((((((((((((((((((((AbstractC1414e.license((AbstractC1414e.license((((((((((((((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.Signature) * 31) + ((int) this.pro)) * 31) + this.tapsense) * 31) + this.isVip) * 31) + this.inmobi) * 31) + this.isPro) * 31, this.applovin, 31) + this.ads) * 31, this.premium, 31) + this.crashlytics) * 31) + this.f33279class) * 31) + this.f33282interface) * 31) + this.f33281goto) * 31) + this.f33285this) * 31) + this.f33283native) * 31) + this.f33280extends) * 31) + this.f33286throw) * 31) + this.f33287try) * 31) + this.f33284protected) * 31) + this.f33278break;
        }
        return this.f33277abstract;
    }

    public final C16975e license(C16975e c16975e) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == c16975e) {
            return this;
        }
        int yandex = AbstractC8542e.yandex(this.loadAd);
        String str3 = c16975e.ad;
        C17750e c17750e = c16975e.advert;
        AbstractC17475e abstractC17475e = c16975e.metrica;
        int i3 = c16975e.f33287try;
        int i4 = c16975e.f33284protected;
        String str4 = c16975e.vip;
        if (str4 == null) {
            str4 = this.vip;
        }
        if (abstractC17475e.isEmpty()) {
            abstractC17475e = this.metrica;
        }
        if ((yandex != 3 && yandex != 1) || (str = c16975e.license) == null) {
            str = this.license;
        }
        int i5 = this.yandex;
        if (i5 == -1) {
            i5 = c16975e.yandex;
        }
        int i6 = this.startapp;
        if (i6 == -1) {
            i6 = c16975e.startapp;
        }
        String str5 = this.mopub;
        if (str5 == null) {
            String inmobi = AbstractC9413e.inmobi(yandex, c16975e.mopub);
            if (AbstractC9413e.m2568synchronized(inmobi).length == 1) {
                str5 = inmobi;
            }
        }
        String str6 = this.smaato;
        if (str6 == null) {
            str6 = c16975e.smaato;
        }
        C17750e c17750e2 = this.advert;
        if (c17750e2 != null) {
            c17750e = c17750e2.vip(c17750e);
        }
        float f = this.applovin;
        if (f == -1.0f && yandex == 2) {
            f = c16975e.applovin;
        }
        int i7 = this.appmetrica | c16975e.appmetrica;
        AbstractC17475e abstractC17475e2 = abstractC17475e;
        int i8 = c16975e.purchase | this.purchase;
        C9284e c9284e = c16975e.remoteconfig;
        ArrayList arrayList = new ArrayList();
        if (c9284e != null) {
            String str7 = c9284e.f18504e;
            C14290e[] c14290eArr = c9284e.f18507e;
            int length = c14290eArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                C14290e c14290e = c14290eArr[i10];
                int i11 = length;
                if (c14290e.f28262e != null) {
                    arrayList.add(c14290e);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        C9284e c9284e2 = this.remoteconfig;
        if (c9284e2 != null) {
            if (str2 == null) {
                str2 = c9284e2.f18504e;
            }
            int size = arrayList.size();
            C14290e[] c14290eArr2 = c9284e2.f18507e;
            String str8 = str2;
            int length2 = c14290eArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                C14290e c14290e2 = c14290eArr2[i13];
                int i14 = length2;
                if (c14290e2.f28262e != null) {
                    UUID uuid = c14290e2.f28264e;
                    i2 = i3;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i = size;
                            arrayList.add(c14290e2);
                            break;
                        }
                        i = size;
                        if (((C14290e) arrayList.get(i15)).f28264e.equals(uuid)) {
                            break;
                        }
                        i15++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i3;
                }
                i12 = i13 + 1;
                length2 = i14;
                i3 = i2;
                size = i;
            }
            str2 = str8;
        }
        int i16 = i3;
        C9284e c9284e3 = arrayList.isEmpty() ? null : new C9284e(str2, false, (C14290e[]) arrayList.toArray(new C14290e[0]));
        C11445e ad = ad();
        ad.ad = str3;
        ad.vip = str4;
        ad.metrica = AbstractC17475e.remoteconfig(abstractC17475e2);
        ad.license = str;
        ad.appmetrica = i7;
        ad.purchase = i8;
        ad.yandex = i5;
        ad.startapp = i6;
        ad.adcel = str5;
        ad.mopub = c17750e;
        ad.advert = str6;
        ad.subscription = c9284e3;
        ad.isPro = f;
        ad.f23027while = i16;
        ad.f23026try = i4;
        return new C16975e(ad);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.ad);
        sb.append(", ");
        sb.append(this.vip);
        sb.append(", ");
        sb.append(this.amazon);
        sb.append(", ");
        sb.append(this.loadAd);
        sb.append(", ");
        sb.append(this.mopub);
        sb.append(", ");
        sb.append(this.adcel);
        sb.append(", ");
        sb.append(this.license);
        sb.append(", [");
        sb.append(this.tapsense);
        sb.append(", ");
        sb.append(this.isVip);
        sb.append(", ");
        sb.append(this.applovin);
        sb.append(", ");
        sb.append(this.firebase);
        sb.append("], [");
        sb.append(this.f33282interface);
        sb.append(", ");
        return AbstractC17861e.smaato(this.f33281goto, "])", sb);
    }

    public final boolean vip(C16975e c16975e) {
        List list = this.subscription;
        if (list.size() != c16975e.subscription.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c16975e.subscription.get(i))) {
                return false;
            }
        }
        return true;
    }
}
