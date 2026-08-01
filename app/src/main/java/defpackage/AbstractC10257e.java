package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC10257e {
    public static Map Signature(HashMap hashMap) {
        return DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static Object ad(List list, AbstractC10731e abstractC10731e) {
        return AbstractC5336e.advert(AbstractC6731e.ad, new C5591e(0, null, list), abstractC10731e);
    }

    public static String adcel(String str, String str2) {
        return str + str2;
    }

    public static void admob(float f, StringBuilder sb, String str) {
        sb.append((Object) C15765e.metrica(f));
        sb.append(str);
    }

    public static /* synthetic */ String ads(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DISABLED" : "WRITE_ONLY" : "READ_ONLY" : "ENABLED";
    }

    public static StringBuilder advert(Ctry ctry, String str, String str2, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(ctry);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder amazon(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    public static /* synthetic */ String applovin(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static int appmetrica(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static InterfaceC0662e billing(Class cls, String str, String str2, int i, C12232e c12232e) {
        return c12232e.purchase(new C13506e(cls, str, str2, i));
    }

    public static void inmobi(BouncyCastleProvider bouncyCastleProvider, Ctry ctry) {
        bouncyCastleProvider.addKeyInfoConverter(ctry, new C7563e(6));
    }

    public static /* synthetic */ String isPro(int i) {
        switch (i) {
            case 1:
                return "END_OF_DOCUMENT";
            case 2:
                return "DOUBLE";
            case 3:
                return "STRING";
            case 4:
                return "DOCUMENT";
            case 5:
                return "ARRAY";
            case 6:
                return "BINARY";
            case 7:
                return "UNDEFINED";
            case 8:
                return "OBJECT_ID";
            case 9:
                return "BOOLEAN";
            case 10:
                return "DATE_TIME";
            case 11:
                return "NULL";
            case 12:
                return "REGULAR_EXPRESSION";
            case 13:
                return "DB_POINTER";
            case 14:
                return "JAVASCRIPT";
            case 15:
                return "SYMBOL";
            case 16:
                return "JAVASCRIPT_WITH_SCOPE";
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return "INT32";
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return "TIMESTAMP";
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "INT64";
            case 20:
                return "DECIMAL128";
            case 21:
                return "MIN_KEY";
            case 22:
                return "MAX_KEY";
            default:
                return "null";
        }
    }

    public static StringBuilder isVip(Ctry ctry, String str, String str2, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(ctry);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    public static /* synthetic */ boolean license(int i) {
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw null;
    }

    public static HashMap loadAd(Class cls, C4207e c4207e) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c4207e);
        return hashMap;
    }

    public static /* synthetic */ boolean metrica(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw null;
    }

    public static String mopub(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ String premium(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }

    public static void pro(String str, int i, String str2) {
        AbstractC2803e.smaato(str2, str + i);
    }

    public static int purchase(C9630e c9630e, int i, int i2) {
        return (c9630e.hashCode() + i) * i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void remoteconfig(C14246e c14246e) {
        if (c14246e instanceof AutoCloseable) {
            c14246e.close();
        } else {
            if (!(c14246e instanceof ExecutorService)) {
                throw new IllegalArgumentException();
            }
            AbstractC6418e.smaato((ExecutorService) c14246e);
        }
    }

    public static void signatures(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static StringBuilder smaato(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static String startapp(String str, InterfaceC5757e interfaceC5757e) {
        return str + interfaceC5757e;
    }

    public static void subscription(Ctry ctry, String str, String str2, String str3, String str4) {
        ctry.subs(str);
        ctry.subs(str2);
        ctry.subs(str3);
        ctry.subs(str4);
    }

    public static void tapsense(BouncyCastleProvider bouncyCastleProvider, Ctry ctry) {
        bouncyCastleProvider.addKeyInfoConverter(ctry, new AbstractC6975e(C8627e.ad));
    }

    public static String yandex(String str, InterfaceC11754e interfaceC11754e) {
        return str + interfaceC11754e;
    }
}
