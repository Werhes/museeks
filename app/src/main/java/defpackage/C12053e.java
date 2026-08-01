package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12053e {

    /* renamed from: abstract, reason: not valid java name */
    public static final String f24112abstract;

    /* renamed from: break, reason: not valid java name */
    public static final String f24113break;

    /* renamed from: case, reason: not valid java name */
    public static final String f24114case;

    /* renamed from: catch, reason: not valid java name */
    public static final String f24115catch;

    /* renamed from: const, reason: not valid java name */
    public static final String f24116const;

    /* renamed from: continue, reason: not valid java name */
    public static final String f24117continue;

    /* renamed from: default, reason: not valid java name */
    public static final String f24118default;

    /* renamed from: else, reason: not valid java name */
    public static final String f24119else;

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public static final String f24120e;

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public static final String f24121e;

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public static final String f24122e;

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public static final String f24123e;

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public static final String f24124e;

    /* renamed from: final, reason: not valid java name */
    public static final String f24125final;

    /* renamed from: finally, reason: not valid java name */
    public static final String f24126finally;

    /* renamed from: for, reason: not valid java name */
    public static final String f24127for;

    /* renamed from: implements, reason: not valid java name */
    public static final String f24128implements;

    /* renamed from: import, reason: not valid java name */
    public static final String f24129import;

    /* renamed from: instanceof, reason: not valid java name */
    public static final String f24130instanceof;

    /* renamed from: new, reason: not valid java name */
    public static final String f24131new;

    /* renamed from: package, reason: not valid java name */
    public static final String f24132package;

    /* renamed from: private, reason: not valid java name */
    public static final String f24133private;

    /* renamed from: protected, reason: not valid java name */
    public static final String f24134protected;

    /* renamed from: public, reason: not valid java name */
    public static final String f24135public;

    /* renamed from: return, reason: not valid java name */
    public static final String f24136return;

    /* renamed from: static, reason: not valid java name */
    public static final String f24137static;

    /* renamed from: strictfp, reason: not valid java name */
    public static final String f24138strictfp;

    /* renamed from: super, reason: not valid java name */
    public static final String f24139super;

    /* renamed from: switch, reason: not valid java name */
    public static final String f24140switch;

    /* renamed from: synchronized, reason: not valid java name */
    public static final String f24141synchronized;

    /* renamed from: throw, reason: not valid java name */
    public static final C12053e f24142throw = new C12053e(new C4761e());

    /* renamed from: throws, reason: not valid java name */
    public static final String f24143throws;

    /* renamed from: transient, reason: not valid java name */
    public static final String f24144transient;

    /* renamed from: try, reason: not valid java name */
    public static final String f24145try;

    /* renamed from: volatile, reason: not valid java name */
    public static final String f24146volatile;

    /* renamed from: while, reason: not valid java name */
    public static final String f24147while;
    public final Integer Signature;
    public final CharSequence ad;
    public final AbstractC5340e adcel;
    public final Integer admob;
    public final CharSequence ads;
    public C18080e advert;
    public final Uri amazon;
    public final Integer applovin;
    public final CharSequence appmetrica;
    public final CharSequence billing;

    /* renamed from: class, reason: not valid java name */
    public final CharSequence f24148class;
    public final Integer crashlytics;

    /* renamed from: extends, reason: not valid java name */
    public final AbstractC17475e f24149extends;
    public final Integer firebase;

    /* renamed from: goto, reason: not valid java name */
    public final CharSequence f24150goto;
    public final Integer inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final CharSequence f24151interface;
    public final Integer isPro;
    public final Integer isVip;
    public final CharSequence license;
    public final Integer loadAd;
    public final CharSequence metrica;
    public final byte[] mopub;

    /* renamed from: native, reason: not valid java name */
    public final Bundle f24152native;
    public final CharSequence premium;
    public final Integer pro;
    public final CharSequence purchase;
    public final Boolean remoteconfig;
    public final Integer signatures;
    public final Integer smaato;
    public final AbstractC5340e startapp;
    public final CharSequence subs;
    public final Boolean subscription;
    public final Integer tapsense;

    /* renamed from: this, reason: not valid java name */
    public final Integer f24153this;
    public final CharSequence vip;
    public final Long yandex;

    static {
        String str = AbstractC9413e.ad;
        f24147while = Integer.toString(0, 36);
        f24145try = Integer.toString(1, 36);
        f24134protected = Integer.toString(2, 36);
        f24113break = Integer.toString(3, 36);
        f24112abstract = Integer.toString(4, 36);
        f24118default = Integer.toString(5, 36);
        f24128implements = Integer.toString(6, 36);
        f24114case = Integer.toString(8, 36);
        f24115catch = Integer.toString(9, 36);
        f24125final = Integer.toString(10, 36);
        f24139super = Integer.toString(11, 36);
        f24131new = Integer.toString(12, 36);
        f24138strictfp = Integer.toString(13, 36);
        f24133private = Integer.toString(14, 36);
        f24132package = Integer.toString(15, 36);
        f24144transient = Integer.toString(16, 36);
        f24129import = Integer.toString(17, 36);
        f24130instanceof = Integer.toString(18, 36);
        f24137static = Integer.toString(19, 36);
        f24141synchronized = Integer.toString(20, 36);
        f24136return = Integer.toString(21, 36);
        f24119else = Integer.toString(22, 36);
        f24140switch = Integer.toString(23, 36);
        f24143throws = Integer.toString(24, 36);
        f24126finally = Integer.toString(25, 36);
        f24116const = Integer.toString(26, 36);
        f24146volatile = Integer.toString(27, 36);
        f24127for = Integer.toString(28, 36);
        f24117continue = Integer.toString(29, 36);
        f24135public = Integer.toString(30, 36);
        f24124e = Integer.toString(31, 36);
        f24122e = Integer.toString(32, 36);
        f24123e = Integer.toString(33, 36);
        f24121e = Integer.toString(34, 36);
        f24120e = Integer.toString(1000, 36);
    }

    public C12053e(C4761e c4761e) {
        Boolean bool = c4761e.subscription;
        Integer num = c4761e.admob;
        Integer num2 = c4761e.f10191goto;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        case 31:
                        case 32:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                            break;
                        case 20:
                        case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                            i = 5;
                            break;
                        case Maneuver.TYPE_FORK_LEFT /* 25 */:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.ad = c4761e.ad;
        this.vip = c4761e.vip;
        this.metrica = c4761e.metrica;
        this.license = c4761e.license;
        this.appmetrica = c4761e.appmetrica;
        this.purchase = c4761e.purchase;
        this.billing = c4761e.billing;
        this.yandex = c4761e.yandex;
        this.startapp = c4761e.startapp;
        this.adcel = c4761e.adcel;
        this.mopub = c4761e.mopub;
        this.advert = c4761e.advert;
        this.smaato = c4761e.smaato;
        this.amazon = c4761e.amazon;
        this.loadAd = c4761e.loadAd;
        this.Signature = c4761e.Signature;
        this.admob = num;
        this.subscription = bool;
        this.remoteconfig = c4761e.remoteconfig;
        Integer num3 = c4761e.pro;
        this.pro = num3;
        this.signatures = num3;
        this.tapsense = c4761e.signatures;
        this.isVip = c4761e.tapsense;
        this.inmobi = c4761e.isVip;
        this.isPro = c4761e.inmobi;
        this.applovin = c4761e.isPro;
        this.ads = c4761e.applovin;
        this.premium = c4761e.ads;
        this.subs = c4761e.premium;
        this.crashlytics = c4761e.subs;
        this.firebase = c4761e.crashlytics;
        this.f24148class = c4761e.firebase;
        this.f24151interface = c4761e.f10190class;
        this.f24150goto = c4761e.f10192interface;
        this.f24153this = num2;
        this.f24149extends = c4761e.f10193native;
        this.f24152native = c4761e.f10194this;
    }

    public static C12053e vip(int i, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        C4761e c4761e = new C4761e();
        c4761e.ad = bundle.getCharSequence(f24147while);
        c4761e.vip = bundle.getCharSequence(f24145try);
        c4761e.metrica = bundle.getCharSequence(f24134protected);
        c4761e.license = bundle.getCharSequence(f24113break);
        c4761e.appmetrica = bundle.getCharSequence(f24112abstract);
        c4761e.purchase = bundle.getCharSequence(f24118default);
        c4761e.billing = bundle.getCharSequence(f24128implements);
        c4761e.amazon = (Uri) bundle.getParcelable(f24139super);
        c4761e.applovin = bundle.getCharSequence(f24119else);
        c4761e.ads = bundle.getCharSequence(f24140switch);
        c4761e.premium = bundle.getCharSequence(f24143throws);
        c4761e.firebase = bundle.getCharSequence(f24146volatile);
        c4761e.f10190class = bundle.getCharSequence(f24127for);
        c4761e.f10192interface = bundle.getCharSequence(f24135public);
        c4761e.f10194this = AbstractC9413e.Signature(bundle.getBundle(f24120e));
        String str = f24125final;
        if (bundle.containsKey(str)) {
            String str2 = f24117continue;
            byte[] bArr = null;
            Integer valueOf = bundle.containsKey(str2) ? Integer.valueOf(bundle.getInt(str2)) : null;
            if (i >= 9) {
                Bundle bundle4 = bundle.getBundle(str);
                if (bundle4 != null) {
                    IBinder binder = bundle4.getBinder(C18080e.appmetrica);
                    if (binder != null) {
                        if (binder instanceof BinderC8566e) {
                            bArr = ((BinderC8566e) binder).metrica.ad;
                        } else if (Build.VERSION.SDK_INT < 27 || (bArr = e.vip(bundle4)) == null) {
                            bArr = C4938e.ad(bundle4);
                        }
                    }
                    c4761e.vip(bArr, valueOf);
                }
            } else {
                c4761e.vip(bundle.getByteArray(str), valueOf);
            }
        }
        String str3 = f24114case;
        if (bundle.containsKey(str3) && (bundle3 = bundle.getBundle(str3)) != null) {
            c4761e.startapp = AbstractC5340e.ad(bundle3);
        }
        String str4 = f24115catch;
        if (bundle.containsKey(str4) && (bundle2 = bundle.getBundle(str4)) != null) {
            c4761e.adcel = AbstractC5340e.ad(bundle2);
        }
        String str5 = f24123e;
        if (bundle.containsKey(str5)) {
            c4761e.metrica(Long.valueOf(bundle.getLong(str5)));
        }
        String str6 = f24131new;
        if (bundle.containsKey(str6)) {
            c4761e.loadAd = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = f24138strictfp;
        if (bundle.containsKey(str7)) {
            c4761e.Signature = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = f24133private;
        if (bundle.containsKey(str8)) {
            c4761e.admob = Integer.valueOf(bundle.getInt(str8));
        }
        String str9 = f24122e;
        if (bundle.containsKey(str9)) {
            c4761e.subscription = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = f24132package;
        if (bundle.containsKey(str10)) {
            c4761e.remoteconfig = Boolean.valueOf(bundle.getBoolean(str10));
        }
        String str11 = f24144transient;
        if (bundle.containsKey(str11)) {
            c4761e.pro = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = f24129import;
        if (bundle.containsKey(str12)) {
            c4761e.signatures = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = f24130instanceof;
        if (bundle.containsKey(str13)) {
            c4761e.tapsense = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = f24137static;
        if (bundle.containsKey(str14)) {
            c4761e.isVip = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f24141synchronized;
        if (bundle.containsKey(str15)) {
            c4761e.inmobi = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = f24136return;
        if (bundle.containsKey(str16)) {
            c4761e.isPro = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = f24126finally;
        if (bundle.containsKey(str17)) {
            c4761e.subs = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = f24116const;
        if (bundle.containsKey(str18)) {
            c4761e.crashlytics = Integer.valueOf(bundle.getInt(str18));
        }
        String str19 = f24124e;
        if (bundle.containsKey(str19)) {
            c4761e.f10191goto = Integer.valueOf(bundle.getInt(str19));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f24121e);
        if (stringArrayList != null) {
            c4761e.f10193native = AbstractC17475e.remoteconfig(stringArrayList);
        }
        return new C12053e(c4761e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍَؗ, java.lang.Object] */
    public final C4761e ad() {
        ?? obj = new Object();
        obj.ad = this.ad;
        obj.vip = this.vip;
        obj.metrica = this.metrica;
        obj.license = this.license;
        obj.appmetrica = this.appmetrica;
        obj.purchase = this.purchase;
        obj.billing = this.billing;
        obj.yandex = this.yandex;
        obj.startapp = this.startapp;
        obj.adcel = this.adcel;
        obj.mopub = this.mopub;
        obj.advert = this.advert;
        obj.smaato = this.smaato;
        obj.amazon = this.amazon;
        obj.loadAd = this.loadAd;
        obj.Signature = this.Signature;
        obj.admob = this.admob;
        obj.subscription = this.subscription;
        obj.remoteconfig = this.remoteconfig;
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
        obj.firebase = this.f24148class;
        obj.f10190class = this.f24151interface;
        obj.f10192interface = this.f24150goto;
        obj.f10191goto = this.f24153this;
        obj.f10193native = this.f24149extends;
        obj.f10194this = this.f24152native;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12053e.class == obj.getClass()) {
            C12053e c12053e = (C12053e) obj;
            if (TextUtils.equals(this.ad, c12053e.ad) && TextUtils.equals(this.vip, c12053e.vip) && TextUtils.equals(this.metrica, c12053e.metrica) && TextUtils.equals(this.license, c12053e.license) && TextUtils.equals(this.appmetrica, c12053e.appmetrica) && TextUtils.equals(this.purchase, c12053e.purchase) && TextUtils.equals(this.billing, c12053e.billing) && Objects.equals(this.yandex, c12053e.yandex) && Objects.equals(this.startapp, c12053e.startapp) && Objects.equals(this.adcel, c12053e.adcel) && Arrays.equals(this.mopub, c12053e.mopub) && Objects.equals(this.smaato, c12053e.smaato) && Objects.equals(this.amazon, c12053e.amazon) && Objects.equals(this.loadAd, c12053e.loadAd) && Objects.equals(this.Signature, c12053e.Signature) && Objects.equals(this.admob, c12053e.admob) && Objects.equals(this.subscription, c12053e.subscription) && Objects.equals(this.remoteconfig, c12053e.remoteconfig) && Objects.equals(this.signatures, c12053e.signatures) && Objects.equals(this.tapsense, c12053e.tapsense) && Objects.equals(this.isVip, c12053e.isVip) && Objects.equals(this.inmobi, c12053e.inmobi) && Objects.equals(this.isPro, c12053e.isPro) && Objects.equals(this.applovin, c12053e.applovin) && TextUtils.equals(this.ads, c12053e.ads) && TextUtils.equals(this.premium, c12053e.premium) && TextUtils.equals(this.subs, c12053e.subs) && Objects.equals(this.crashlytics, c12053e.crashlytics) && Objects.equals(this.firebase, c12053e.firebase) && TextUtils.equals(this.f24148class, c12053e.f24148class) && TextUtils.equals(this.f24151interface, c12053e.f24151interface) && TextUtils.equals(this.f24150goto, c12053e.f24150goto) && Objects.equals(this.f24153this, c12053e.f24153this) && Objects.equals(this.f24149extends, c12053e.f24149extends)) {
                if ((this.f24152native == null) == (c12053e.f24152native == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, Integer.valueOf(Arrays.hashCode(this.mopub)), this.smaato, this.amazon, this.loadAd, this.Signature, this.admob, this.subscription, this.remoteconfig, this.signatures, this.tapsense, this.isVip, this.inmobi, this.isPro, this.applovin, this.ads, this.premium, this.subs, this.crashlytics, this.firebase, this.f24148class, this.f24151interface, this.f24150goto, this.f24153this, Boolean.valueOf(this.f24152native == null), this.f24149extends);
    }

    public final Bundle metrica(int i) {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.ad;
        if (charSequence != null) {
            bundle.putCharSequence(f24147while, charSequence);
        }
        CharSequence charSequence2 = this.vip;
        if (charSequence2 != null) {
            bundle.putCharSequence(f24145try, charSequence2);
        }
        CharSequence charSequence3 = this.metrica;
        if (charSequence3 != null) {
            bundle.putCharSequence(f24134protected, charSequence3);
        }
        CharSequence charSequence4 = this.license;
        if (charSequence4 != null) {
            bundle.putCharSequence(f24113break, charSequence4);
        }
        CharSequence charSequence5 = this.appmetrica;
        if (charSequence5 != null) {
            bundle.putCharSequence(f24112abstract, charSequence5);
        }
        CharSequence charSequence6 = this.purchase;
        if (charSequence6 != null) {
            bundle.putCharSequence(f24118default, charSequence6);
        }
        CharSequence charSequence7 = this.billing;
        if (charSequence7 != null) {
            bundle.putCharSequence(f24128implements, charSequence7);
        }
        Long l = this.yandex;
        if (l != null) {
            bundle.putLong(f24123e, l.longValue());
        }
        byte[] bArr = this.mopub;
        if (bArr != null) {
            String str = f24125final;
            if (i >= 9) {
                if (this.advert == null) {
                    this.advert = new C18080e(bArr);
                }
                C18080e c18080e = this.advert;
                byte[] bArr2 = c18080e.ad;
                Bundle bundle2 = new Bundle();
                bundle2.putBinder(C18080e.appmetrica, c18080e.vip);
                if (Build.VERSION.SDK_INT >= 27 && bArr2.length > 0) {
                    if (c18080e.metrica == null) {
                        c18080e.metrica = e.ad(bArr2);
                    }
                    e eVar = c18080e.metrica;
                    if (eVar != null) {
                        bundle2.putParcelable(C18080e.purchase, eVar.ad);
                        bundle.putBundle(str, bundle2);
                    }
                }
                if (c18080e.license == null) {
                    c18080e.license = new C4938e(bArr2);
                }
                C4938e c4938e = c18080e.license;
                int i2 = C4938e.vip;
                c4938e.getClass();
                bundle2.putBinder(C18080e.billing, c4938e.ad);
                bundle.putBundle(str, bundle2);
            } else if (bArr.length <= 500000) {
                bundle.putByteArray(str, bArr);
            }
        }
        Uri uri = this.amazon;
        if (uri != null) {
            bundle.putParcelable(f24139super, uri);
        }
        CharSequence charSequence8 = this.ads;
        if (charSequence8 != null) {
            bundle.putCharSequence(f24119else, charSequence8);
        }
        CharSequence charSequence9 = this.premium;
        if (charSequence9 != null) {
            bundle.putCharSequence(f24140switch, charSequence9);
        }
        CharSequence charSequence10 = this.subs;
        if (charSequence10 != null) {
            bundle.putCharSequence(f24143throws, charSequence10);
        }
        CharSequence charSequence11 = this.f24148class;
        if (charSequence11 != null) {
            bundle.putCharSequence(f24146volatile, charSequence11);
        }
        CharSequence charSequence12 = this.f24151interface;
        if (charSequence12 != null) {
            bundle.putCharSequence(f24127for, charSequence12);
        }
        CharSequence charSequence13 = this.f24150goto;
        if (charSequence13 != null) {
            bundle.putCharSequence(f24135public, charSequence13);
        }
        AbstractC5340e abstractC5340e = this.startapp;
        if (abstractC5340e != null) {
            bundle.putBundle(f24114case, abstractC5340e.metrica());
        }
        AbstractC5340e abstractC5340e2 = this.adcel;
        if (abstractC5340e2 != null) {
            bundle.putBundle(f24115catch, abstractC5340e2.metrica());
        }
        Integer num = this.loadAd;
        if (num != null) {
            bundle.putInt(f24131new, num.intValue());
        }
        Integer num2 = this.Signature;
        if (num2 != null) {
            bundle.putInt(f24138strictfp, num2.intValue());
        }
        Integer num3 = this.admob;
        if (num3 != null) {
            bundle.putInt(f24133private, num3.intValue());
        }
        Boolean bool = this.subscription;
        if (bool != null) {
            bundle.putBoolean(f24122e, bool.booleanValue());
        }
        Boolean bool2 = this.remoteconfig;
        if (bool2 != null) {
            bundle.putBoolean(f24132package, bool2.booleanValue());
        }
        Integer num4 = this.signatures;
        if (num4 != null) {
            bundle.putInt(f24144transient, num4.intValue());
        }
        Integer num5 = this.tapsense;
        if (num5 != null) {
            bundle.putInt(f24129import, num5.intValue());
        }
        Integer num6 = this.isVip;
        if (num6 != null) {
            bundle.putInt(f24130instanceof, num6.intValue());
        }
        Integer num7 = this.inmobi;
        if (num7 != null) {
            bundle.putInt(f24137static, num7.intValue());
        }
        Integer num8 = this.isPro;
        if (num8 != null) {
            bundle.putInt(f24141synchronized, num8.intValue());
        }
        Integer num9 = this.applovin;
        if (num9 != null) {
            bundle.putInt(f24136return, num9.intValue());
        }
        Integer num10 = this.crashlytics;
        if (num10 != null) {
            bundle.putInt(f24126finally, num10.intValue());
        }
        Integer num11 = this.firebase;
        if (num11 != null) {
            bundle.putInt(f24116const, num11.intValue());
        }
        Integer num12 = this.smaato;
        if (num12 != null) {
            bundle.putInt(f24117continue, num12.intValue());
        }
        Integer num13 = this.f24153this;
        if (num13 != null) {
            bundle.putInt(f24124e, num13.intValue());
        }
        AbstractC17475e abstractC17475e = this.f24149extends;
        if (!abstractC17475e.isEmpty()) {
            bundle.putStringArrayList(f24121e, new ArrayList<>(abstractC17475e));
        }
        Bundle bundle3 = this.f24152native;
        if (bundle3 != null) {
            bundle.putBundle(f24120e, bundle3);
        }
        return bundle;
    }
}
