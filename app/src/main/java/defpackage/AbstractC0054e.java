package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.xml.sax.Attributes;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؓٝ */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0054e {
    public static Object Signature(InterfaceC9729e interfaceC9729e, C14326e c14326e, Object obj) {
        return interfaceC9729e.mopub().smaato(c14326e, obj);
    }

    public static boolean ad(InterfaceC16112e interfaceC16112e, Collection collection, int i, Map map) {
        interfaceC16112e.yandex().mo3328goto();
        boolean remoteconfig = interfaceC16112e.remoteconfig(collection, i, map);
        interfaceC16112e.purchase(interfaceC16112e.startapp() + 1);
        return remoteconfig;
    }

    public static boolean adcel(InterfaceC15348e interfaceC15348e) {
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC15348e.remoteconfig()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return realmcJNI.realm_is_closed(ptr$cinterop_release);
    }

    public static Object admob(InterfaceC9729e interfaceC9729e, C14326e c14326e, EnumC13734e enumC13734e) {
        return interfaceC9729e.mopub().premium(c14326e, enumC13734e);
    }

    public static int ads(Attributes attributes, int i) {
        return EnumC10880e.ad(attributes.getLocalName(i)).ordinal();
    }

    public static boolean advert(InterfaceC15034e interfaceC15034e) {
        return interfaceC15034e.adcel().isFrozen();
    }

    public static boolean amazon(InterfaceC16112e interfaceC16112e, Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= interfaceC16112e.remove(it.next());
        }
        return z;
    }

    public static int applovin(InterfaceC16154e interfaceC16154e, int i, int i2) {
        return (interfaceC16154e.hashCode() + i) * i2;
    }

    public static void appmetrica(InterfaceC15348e interfaceC15348e) {
        interfaceC15348e.mo3328goto();
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC15348e.remoteconfig()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_close(ptr$cinterop_release);
    }

    public static void billing(InterfaceC9729e interfaceC9729e, C11565e c11565e) {
        interfaceC9729e.mopub().metrica(c11565e);
    }

    /* renamed from: break */
    public static /* synthetic */ int m217break(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
    }

    /* renamed from: class */
    public static StringBuilder m218class(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    public static String crashlytics(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    /* renamed from: extends */
    public static InterfaceC12864e m219extends(C13610e c13610e, InterfaceC12864e interfaceC12864e, C9185e c9185e, InterfaceC6340e interfaceC6340e) {
        InterfaceC11288e.ad.getClass();
        C14613e c14613e = AbstractC10576e.vip;
        c13610e.getClass();
        return AbstractC5679e.metrica(interfaceC12864e, new C12122e(c9185e, interfaceC6340e.ad(), c13610e, c14613e, 2));
    }

    public static StringBuilder firebase(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    /* renamed from: goto */
    public static void m220goto(long j, C0576e c0576e) {
        c0576e.setValue(new C2152e(j));
    }

    public static boolean inmobi(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    /* renamed from: interface */
    public static StringBuilder m221interface(ConfigurableProvider configurableProvider, String str, String str2, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    public static int isPro(int i, int i2, int i3, int i4, int i5) {
        return C6697e.startapp(i + i2 + i3, i4) + i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        if (r1 == r5) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f7, code lost:
    
        if (r13 == null) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object isVip(defpackage.C1587e r10, defpackage.C9398e r11, defpackage.AbstractC16049e r12, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0054e.isVip(eٖؓؕ, eٍُۘ, eؙٖۛ, eُؑ۠):java.lang.Object");
    }

    public static void license(InterfaceC16112e interfaceC16112e) {
        interfaceC16112e.yandex().mo3328goto();
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC16112e.vip()).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_set_clear(ptr$cinterop_release);
        interfaceC16112e.purchase(interfaceC16112e.startapp() + 1);
    }

    public static Object loadAd(InterfaceC9729e interfaceC9729e, C14326e c14326e) {
        return interfaceC9729e.mopub().subscription(c14326e);
    }

    public static void metrica(InterfaceC15348e interfaceC15348e) {
        if (interfaceC15348e.isClosed()) {
            throw new IllegalStateException(AbstractC17861e.Signature("Realm has been closed and is no longer accessible: ", ((C14918e) interfaceC15348e.inmobi().f22047e).metrica));
        }
    }

    public static boolean mopub(InterfaceC15034e interfaceC15034e) {
        return interfaceC15034e.adcel().isClosed();
    }

    /* renamed from: native */
    public static /* synthetic */ String m222native(int i) {
        switch (i) {
            case 1:
                return "INT";
            case 2:
                return "BOOL";
            case 3:
                return "STRING";
            case 4:
                return "BINARY";
            case 5:
                return "TIMESTAMP";
            case 6:
                return "FLOAT";
            case 7:
                return "DOUBLE";
            case 8:
                return "DECIMAL128";
            case 9:
                return "OBJECT_ID";
            case 10:
                return "UUID";
            case 11:
                return "OBJECT";
            case 12:
                return "LIST";
            case 13:
                return "DICTIONARY";
            default:
                throw null;
        }
    }

    public static String premium(Ccatch ccatch, StringBuilder sb) {
        sb.append(ccatch.size());
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.io.Serializable] */
    public static C7567e pro(C11344e c11344e) {
        ?? obj = new Object();
        C14464e appmetrica = AbstractC17673e.appmetrica(new C6751e(c11344e.f22818e.inmobi().mo1504e(c11344e, null), 4), new C7983e(25), AbstractC17673e.vip);
        C1053e c1053e = new C1053e((InterfaceC5083e) null, (Serializable) obj, 11);
        int i = AbstractC14552e.ad;
        return new C7567e(c1053e, appmetrica, C2693e.f6576e, -2, 1);
    }

    /* renamed from: protected */
    public static /* synthetic */ int m223protected(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("pad")) {
            return 1;
        }
        if (str.equals("reflect")) {
            return 2;
        }
        if (str.equals("repeat")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(str));
    }

    public static boolean purchase(InterfaceC9729e interfaceC9729e, C14326e c14326e) {
        return interfaceC9729e.mopub().mo812extends(c14326e);
    }

    public static C17621e remoteconfig(InterfaceC15034e interfaceC15034e) {
        return interfaceC15034e.adcel().mo661throw();
    }

    public static InterfaceC1108e signatures(C14097e c14097e) {
        return c14097e.f27882e.inmobi().mo1504e(c14097e, null);
    }

    public static Set smaato(InterfaceC9729e interfaceC9729e) {
        return interfaceC9729e.mopub().admob();
    }

    public static Set startapp(InterfaceC9729e interfaceC9729e, C14326e c14326e) {
        return interfaceC9729e.mopub().inmobi(c14326e);
    }

    public static String subs(Class cls, String str) {
        return str + cls;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, io.realm.kotlin.internal.interop.realm_version_id_t] */
    public static C17621e subscription(InterfaceC15348e interfaceC15348e) {
        interfaceC15348e.mo3328goto();
        NativePointer remoteconfig = interfaceC15348e.remoteconfig();
        long new_realm_version_id_t = realmcJNI.new_realm_version_id_t();
        ?? obj = new Object();
        obj.vip = true;
        obj.ad = new_realm_version_id_t;
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) remoteconfig).getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        realmcJNI.realm_get_version_id(ptr$cinterop_release, zArr, obj.ad, obj);
        if (zArr[0]) {
            return new C17621e(realmcJNI.realm_version_id_t_version_get(obj.ad, obj));
        }
        throw new IllegalStateException("No VersionId was available. Reading the VersionId requires a valid read transaction.");
    }

    public static int tapsense(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    /* renamed from: this */
    public static void m224this(C18478e c18478e, long j) {
        c18478e.m4557this().admob();
        c18478e.m4533continue(j);
    }

    /* renamed from: throw */
    public static /* synthetic */ String m225throw(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    /* renamed from: try */
    public static /* synthetic */ String m226try(int i) {
        return i != 1 ? i != 2 ? "null" : "FIT" : "FILL";
    }

    public static boolean vip(InterfaceC16112e interfaceC16112e, Collection collection, int i, Map map) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (interfaceC16112e.signatures(it.next(), i, map)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: while */
    public static /* synthetic */ String m227while(int i) {
        return i != 1 ? i != 2 ? "null" : "Rtl" : "Ltr";
    }

    public static EnumC13734e yandex(InterfaceC9729e interfaceC9729e, C14326e c14326e) {
        return interfaceC9729e.mopub().mo810catch(c14326e);
    }
}
