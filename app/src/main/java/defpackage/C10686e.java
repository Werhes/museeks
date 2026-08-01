package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۧۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10686e extends AbstractC1487e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f21047e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f21048e;

    /* renamed from: eّؑۚ, reason: contains not printable characters */
    public static Bundle[] m2866e(InterfaceC13229e interfaceC13229e) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC13229e.iterator();
        while (it.hasNext()) {
            C13745e c13745e = (C13745e) it.next();
            if (c13745e != null) {
                Bundle bundle = new Bundle();
                for (C13745e c13745e2 : c13745e.firebase()) {
                    if (c13745e2.isVip()) {
                        bundle.putString(c13745e2.tapsense(), c13745e2.inmobi());
                    } else if (c13745e2.isPro()) {
                        bundle.putLong(c13745e2.tapsense(), c13745e2.applovin());
                    } else if (c13745e2.subs()) {
                        bundle.putDouble(c13745e2.tapsense(), c13745e2.crashlytics());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public static Bundle m2867e(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(m2867e((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* renamed from: eٟؑۨ, reason: contains not printable characters */
    public static AbstractC6041e m2868e(AbstractC6041e abstractC6041e, byte[] bArr) {
        C17268e ad = C17268e.ad();
        if (ad != null) {
            abstractC6041e.getClass();
            abstractC6041e.billing(bArr, bArr.length, ad);
            return abstractC6041e;
        }
        abstractC6041e.getClass();
        int length = bArr.length;
        int i = AbstractC3433e.ad;
        abstractC6041e.billing(bArr, length, C17268e.vip);
        return abstractC6041e;
    }

    /* renamed from: eٕؒ۠, reason: contains not printable characters */
    public static int m2869e(String str, C17491e c17491e) {
        for (int i = 0; i < ((C2709e) c17491e.f12709e).m1151e(); i++) {
            if (str.equals(((C2709e) c17491e.f12709e).m1159e(i).isVip())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(m2870e((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(m2870e((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(m2870e((android.os.Bundle) r3, false));
     */
    /* renamed from: eؕؑٝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap m2870e(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = m2870e(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = m2870e(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = m2870e(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10686e.m2870e(android.os.Bundle, boolean):java.util.HashMap");
    }

    /* renamed from: eّؕ۠, reason: contains not printable characters */
    public static boolean m2871e(InterfaceC3927e interfaceC3927e, int i) {
        if (i < ((C0878e) interfaceC3927e).f3274e * 64) {
            return ((1 << (i % 64)) & ((Long) ((C0878e) interfaceC3927e).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public static boolean m2872e(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public static final void m2873e(StringBuilder sb, int i, String str, C4103e c4103e) {
        if (c4103e == null) {
            return;
        }
        m2874e(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c4103e.signatures()) {
            int firebase = c4103e.firebase();
            m2877e(sb, i, "comparison_type", firebase != 1 ? firebase != 2 ? firebase != 3 ? firebase != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (c4103e.tapsense()) {
            m2877e(sb, i, "match_as_float", Boolean.valueOf(c4103e.isVip()));
        }
        if (c4103e.inmobi()) {
            m2877e(sb, i, "comparison_value", c4103e.isPro());
        }
        if (c4103e.applovin()) {
            m2877e(sb, i, "min_comparison_value", c4103e.ads());
        }
        if (c4103e.premium()) {
            m2877e(sb, i, "max_comparison_value", c4103e.subs());
        }
        m2874e(i, sb);
        sb.append("}\n");
    }

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public static final void m2874e(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public static final void m2875e(C13673e c13673e, String str, Long l) {
        List yandex = c13673e.yandex();
        int i = 0;
        while (true) {
            if (i >= yandex.size()) {
                i = -1;
                break;
            } else if (str.equals(((C13745e) yandex.get(i)).tapsense())) {
                break;
            } else {
                i++;
            }
        }
        C3271e m3639interface = C13745e.m3639interface();
        m3639interface.yandex(str);
        m3639interface.adcel(l.longValue());
        if (i < 0) {
            c13673e.smaato(m3639interface);
        } else {
            c13673e.vip();
            ((C2266e) c13673e.f12709e).m799throw(i, (C13745e) m3639interface.appmetrica());
        }
    }

    /* renamed from: eٌُۚ, reason: contains not printable characters */
    public static ArrayList m2876e(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public static final void m2877e(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m2874e(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public static final C13745e m2878e(String str, C2266e c2266e) {
        for (C13745e c13745e : c2266e.isVip()) {
            if (c13745e.tapsense().equals(str)) {
                return c13745e;
            }
        }
        return null;
    }

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public static final void m2879e(StringBuilder sb, String str, C9486e c9486e) {
        if (c9486e == null) {
            return;
        }
        m2874e(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (c9486e.inmobi() != 0) {
            m2874e(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : c9486e.isVip()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (c9486e.tapsense() != 0) {
            m2874e(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : c9486e.signatures()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (c9486e.applovin() != 0) {
            m2874e(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (C6293e c6293e : c9486e.isPro()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(c6293e.signatures() ? Integer.valueOf(c6293e.tapsense()) : null);
                sb.append(":");
                sb.append(c6293e.isVip() ? Long.valueOf(c6293e.inmobi()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (c9486e.premium() != 0) {
            m2874e(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (C5993e c5993e : c9486e.ads()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(c5993e.signatures() ? Integer.valueOf(c5993e.tapsense()) : null);
                sb.append(": [");
                Iterator it = c5993e.isVip().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        m2874e(3, sb);
        sb.append("}\n");
    }

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public static final void m2880e(Uri.Builder builder, String[] strArr, Bundle bundle, HashSet hashSet) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                m2883e(builder, str3, string, hashSet);
            }
        }
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public static final String m2881e(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public static final Serializable m2882e(C13745e c13745e) {
        if (c13745e.isVip()) {
            return c13745e.inmobi();
        }
        if (c13745e.isPro()) {
            return Long.valueOf(c13745e.applovin());
        }
        if (c13745e.subs()) {
            return Double.valueOf(c13745e.crashlytics());
        }
        if (c13745e.m3642class() > 0) {
            return m2866e(c13745e.firebase());
        }
        return null;
    }

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public static final void m2883e(Uri.Builder builder, String str, String str2, HashSet hashSet) {
        if (hashSet.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public static final Bundle m2884e(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13745e c13745e = (C13745e) it.next();
            String tapsense = c13745e.tapsense();
            if (c13745e.subs()) {
                bundle.putDouble(tapsense, c13745e.crashlytics());
            } else if (c13745e.ads()) {
                bundle.putFloat(tapsense, c13745e.premium());
            } else if (c13745e.isVip()) {
                bundle.putString(tapsense, c13745e.inmobi());
            } else if (c13745e.isPro()) {
                bundle.putLong(tapsense, c13745e.applovin());
            }
        }
        return bundle;
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public static C15541e m2885e(C6354e c6354e) {
        Object obj;
        Bundle m2867e = m2867e(c6354e.metrica, true);
        String obj2 = (!m2867e.containsKey("_o") || (obj = m2867e.get("_o")) == null) ? "app" : obj.toString();
        String smaato = AbstractC15367e.smaato(c6354e.ad, AbstractC12992e.metrica, AbstractC12992e.yandex);
        if (smaato == null) {
            smaato = c6354e.ad;
        }
        return new C15541e(smaato, new C3276e(m2867e), obj2, c6354e.vip, 0L);
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public static final Serializable m2886e(String str, C2266e c2266e) {
        C13745e m2878e = m2878e(str, c2266e);
        if (m2878e == null) {
            return null;
        }
        return m2882e(m2878e);
    }

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public static final String m2887e(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public final void m2888e(C13358e c13358e, Object obj) {
        AbstractC9528e.startapp(obj);
        c13358e.vip();
        ((C5952e) c13358e.f12709e).m2011native();
        c13358e.vip();
        ((C5952e) c13358e.f12709e).m2013throw();
        c13358e.vip();
        ((C5952e) c13358e.f12709e).m2014try();
        if (obj instanceof String) {
            c13358e.vip();
            ((C5952e) c13358e.f12709e).m2012this((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            c13358e.vip();
            ((C5952e) c13358e.f12709e).m2008extends(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            c13358e.vip();
            ((C5952e) c13358e.f12709e).m2015while(doubleValue);
        } else {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public final void m2889e(C3271e c3271e, Object obj) {
        c3271e.vip();
        ((C13745e) c3271e.f12709e).m3645native();
        c3271e.vip();
        ((C13745e) c3271e.f12709e).m3648throw();
        c3271e.vip();
        ((C13745e) c3271e.f12709e).m3649try();
        c3271e.vip();
        ((C13745e) c3271e.f12709e).m3640abstract();
        if (obj instanceof String) {
            c3271e.startapp((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c3271e.adcel(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            c3271e.vip();
            ((C13745e) c3271e.f12709e).m3650while(doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                C3271e m3639interface = C13745e.m3639interface();
                for (String str : bundle.keySet()) {
                    C3271e m3639interface2 = C13745e.m3639interface();
                    m3639interface2.yandex(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        m3639interface2.adcel(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        m3639interface2.startapp((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        m3639interface2.vip();
                        ((C13745e) m3639interface2.f12709e).m3650while(doubleValue2);
                    }
                    m3639interface.vip();
                    ((C13745e) m3639interface.f12709e).m3646protected((C13745e) m3639interface2.appmetrica());
                }
                if (((C13745e) m3639interface.f12709e).m3642class() > 0) {
                    arrayList.add((C13745e) m3639interface.appmetrica());
                }
            }
        }
        c3271e.vip();
        ((C13745e) c3271e.f12709e).m3641break(arrayList);
    }

    /* renamed from: eؕۡ۠, reason: contains not printable characters */
    public final List m2890e(InterfaceC3927e interfaceC3927e, List list) {
        int i;
        C6936e c6936e = (C6936e) this.f36443e;
        ArrayList arrayList = new ArrayList(interfaceC3927e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27495e.vip(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27495e.metrica(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: eؖؗؖ, reason: contains not printable characters */
    public final long m2891e(byte[] bArr) {
        AbstractC9528e.startapp(bArr);
        C6936e c6936e = (C6936e) this.f36443e;
        C5240e c5240e = c6936e.f14223e;
        C6936e.purchase(c5240e);
        c5240e.mo2250e();
        MessageDigest m1789e = C5240e.m1789e();
        if (m1789e != null) {
            return C5240e.m1788e(m1789e.digest(bArr));
        }
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27502e.ad("Failed to get MD5");
        return 0L;
    }

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public final C6471e m2892e(String str, C17491e c17491e, C13673e c13673e, String str2) {
        int indexOf;
        C4261e.ad();
        C6936e c6936e = (C6936e) this.f36443e;
        C10476e c10476e = c6936e.f14221e;
        if (!c10476e.m2822e(str, AbstractC17254e.f33803e)) {
            return null;
        }
        c6936e.f14215e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(c10476e.m2819e(str, AbstractC17254e.f33804e).split(",")));
        C15398e c15398e = this.f19060e;
        C0346e c0346e = c15398e.f30354e;
        C10961e c10961e = c15398e.f30382e;
        C10961e c10961e2 = c0346e.f19060e.f30382e;
        C15398e.m3939break(c10961e2);
        String m2958e = c10961e2.m2958e(str);
        Uri.Builder builder = new Uri.Builder();
        C10476e c10476e2 = ((C6936e) c0346e.f36443e).f14221e;
        builder.scheme(c10476e2.m2819e(str, AbstractC17254e.f33852for));
        if (TextUtils.isEmpty(m2958e)) {
            builder.authority(c10476e2.m2819e(str, AbstractC17254e.f33799continue));
        } else {
            String m2819e = c10476e2.m2819e(str, AbstractC17254e.f33799continue);
            StringBuilder sb = new StringBuilder(String.valueOf(m2958e).length() + 1 + String.valueOf(m2819e).length());
            sb.append(m2958e);
            sb.append(".");
            sb.append(m2819e);
            builder.authority(sb.toString());
        }
        builder.path(c10476e2.m2819e(str, AbstractC17254e.f33863public));
        m2883e(builder, "gmp_app_id", ((C2709e) c17491e.f12709e).m1176native(), hashSet);
        c10476e.m2814e();
        m2883e(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String crashlytics = ((C2709e) c17491e.f12709e).crashlytics();
        C6973e c6973e = AbstractC17254e.f33831e;
        if (c10476e.m2822e(str, c6973e)) {
            C15398e.m3939break(c10961e);
            if (c10961e.m2959e(str)) {
                crashlytics = BuildConfig.FLAVOR;
            }
        }
        m2883e(builder, "app_instance_id", crashlytics, hashSet);
        m2883e(builder, "rdid", ((C2709e) c17491e.f12709e).ads(), hashSet);
        m2883e(builder, "bundle_id", c17491e.Signature(), hashSet);
        String loadAd = c13673e.loadAd();
        String smaato = AbstractC15367e.smaato(loadAd, AbstractC12992e.yandex, AbstractC12992e.metrica);
        if (true != TextUtils.isEmpty(smaato)) {
            loadAd = smaato;
        }
        m2883e(builder, "app_event_name", loadAd, hashSet);
        m2883e(builder, "app_version", String.valueOf(((C2709e) c17491e.f12709e).m1051break()), hashSet);
        String m1104e = ((C2709e) c17491e.f12709e).m1104e();
        if (c10476e.m2822e(str, c6973e)) {
            C15398e.m3939break(c10961e);
            if (c10961e.m2960e(str) && !TextUtils.isEmpty(m1104e) && (indexOf = m1104e.indexOf(".")) != -1) {
                m1104e = m1104e.substring(0, indexOf);
            }
        }
        m2883e(builder, "os_version", m1104e, hashSet);
        m2883e(builder, "timestamp", String.valueOf(c13673e.admob()), hashSet);
        if (((C2709e) c17491e.f12709e).subs()) {
            m2883e(builder, "lat", "1", hashSet);
        }
        m2883e(builder, "privacy_sandbox_version", String.valueOf(((C2709e) c17491e.f12709e).m1162e()), hashSet);
        m2883e(builder, "trigger_uri_source", "1", hashSet);
        m2883e(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), hashSet);
        m2883e(builder, "request_uuid", str2, hashSet);
        List<C13745e> yandex = c13673e.yandex();
        Bundle bundle = new Bundle();
        for (C13745e c13745e : yandex) {
            String tapsense = c13745e.tapsense();
            if (c13745e.subs()) {
                bundle.putString(tapsense, String.valueOf(c13745e.crashlytics()));
            } else if (c13745e.ads()) {
                bundle.putString(tapsense, String.valueOf(c13745e.premium()));
            } else if (c13745e.isVip()) {
                bundle.putString(tapsense, c13745e.inmobi());
            } else if (c13745e.isPro()) {
                bundle.putString(tapsense, String.valueOf(c13745e.applovin()));
            }
        }
        m2880e(builder, c10476e.m2819e(str, AbstractC17254e.f33808e).split("\\|"), bundle, hashSet);
        List<C5952e> unmodifiableList = DesugarCollections.unmodifiableList(((C2709e) c17491e.f12709e).m1142e());
        Bundle bundle2 = new Bundle();
        for (C5952e c5952e : unmodifiableList) {
            String isVip = c5952e.isVip();
            if (c5952e.crashlytics()) {
                bundle2.putString(isVip, String.valueOf(c5952e.firebase()));
            } else if (c5952e.premium()) {
                bundle2.putString(isVip, String.valueOf(c5952e.subs()));
            } else if (c5952e.inmobi()) {
                bundle2.putString(isVip, c5952e.isPro());
            } else if (c5952e.applovin()) {
                bundle2.putString(isVip, String.valueOf(c5952e.ads()));
            }
        }
        m2880e(builder, c10476e.m2819e(str, AbstractC17254e.f33828e).split("\\|"), bundle2, hashSet);
        m2883e(builder, "dma", true != ((C2709e) c17491e.f12709e).m1100e() ? "0" : "1", hashSet);
        if (!((C2709e) c17491e.f12709e).m1092e().isEmpty()) {
            m2883e(builder, "dma_cps", ((C2709e) c17491e.f12709e).m1092e(), hashSet);
        }
        if (((C2709e) c17491e.f12709e).m1112e()) {
            C9763e m1134e = ((C2709e) c17491e.f12709e).m1134e();
            if (!m1134e.m2659this().isEmpty()) {
                m2883e(builder, "dl_gclid", m1134e.m2659this(), hashSet);
            }
            if (!m1134e.m2645extends().isEmpty()) {
                m2883e(builder, "dl_gbraid", m1134e.m2645extends(), hashSet);
            }
            if (!m1134e.m2663while().isEmpty()) {
                m2883e(builder, "dl_gs", m1134e.m2663while(), hashSet);
            }
            if (m1134e.m2654protected() > 0) {
                m2883e(builder, "dl_ss_ts", String.valueOf(m1134e.m2654protected()), hashSet);
            }
            if (!m1134e.m2639abstract().isEmpty()) {
                m2883e(builder, "mr_gclid", m1134e.m2639abstract(), hashSet);
            }
            if (!m1134e.m2648implements().isEmpty()) {
                m2883e(builder, "mr_gbraid", m1134e.m2648implements(), hashSet);
            }
            if (!m1134e.m2642catch().isEmpty()) {
                m2883e(builder, "mr_gs", m1134e.m2642catch(), hashSet);
            }
            if (m1134e.m2657super() > 0) {
                m2883e(builder, "mr_click_ts", String.valueOf(m1134e.m2657super()), hashSet);
            }
        }
        return new C6471e(currentTimeMillis, 1, builder.build().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2893e(java.util.Map r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f36443e
            eؚؖٞ r0 = (defpackage.C6936e) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L50
            java.lang.String r3 = "Date"
            java.lang.String r10 = m2881e(r3, r10)
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L50
            r3 = 0
            if (r1 < r2) goto L35
            j$.time.format.DateTimeFormatter r1 = j$.time.format.DateTimeFormatter.RFC_1123_DATE_TIME     // Catch: j$.time.format.DateTimeParseException -> L29
            j$.time.ZonedDateTime r1 = j$.time.ZonedDateTime.parse(r10, r1)     // Catch: j$.time.format.DateTimeParseException -> L29
            j$.time.Instant r1 = r1.toInstant()     // Catch: j$.time.format.DateTimeParseException -> L29
            long r1 = r1.toEpochMilli()     // Catch: j$.time.format.DateTimeParseException -> L29
            goto L36
        L29:
            eٍؙٓ r1 = r0.f14227e
            defpackage.C6936e.yandex(r1)
            eِٔۙ r1 = r1.f27495e
            java.lang.String r2 = "Unable to parse header time, time"
            r1.vip(r10, r2)
        L35:
            r1 = r3
        L36:
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 <= 0) goto L50
            eٍ٘ؖ r10 = r0.f14215e
            r10.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            r9.mo2250e()
            long r7 = r9.f21048e
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r10 != 0) goto L50
            r9.f21047e = r5
            r9.f21048e = r1
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10686e.m2893e(java.util.Map):void");
    }

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public final void m2894e(StringBuilder sb, int i, C4952e c4952e) {
        String str;
        if (c4952e == null) {
            return;
        }
        m2874e(i, sb);
        sb.append("filter {\n");
        if (c4952e.isPro()) {
            m2877e(sb, i, "complement", Boolean.valueOf(c4952e.applovin()));
        }
        if (c4952e.ads()) {
            m2877e(sb, i, "param_name", ((C6936e) this.f36443e).f14202e.vip(c4952e.premium()));
        }
        if (c4952e.signatures()) {
            int i2 = i + 1;
            C0973e tapsense = c4952e.tapsense();
            if (tapsense != null) {
                m2874e(i2, sb);
                sb.append("string_filter {\n");
                if (tapsense.signatures()) {
                    switch (tapsense.subs()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m2877e(sb, i2, "match_type", str);
                }
                if (tapsense.tapsense()) {
                    m2877e(sb, i2, "expression", tapsense.isVip());
                }
                if (tapsense.inmobi()) {
                    m2877e(sb, i2, "case_sensitive", Boolean.valueOf(tapsense.isPro()));
                }
                if (tapsense.ads() > 0) {
                    m2874e(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : tapsense.applovin()) {
                        m2874e(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m2874e(i2, sb);
                sb.append("}\n");
            }
        }
        if (c4952e.isVip()) {
            m2873e(sb, i + 1, "number_filter", c4952e.inmobi());
        }
        m2874e(i, sb);
        sb.append("}\n");
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final long m2895e(long j) {
        mo2250e();
        long j2 = this.f21048e;
        if (j2 == 0 || j == 0) {
            return 0L;
        }
        return (j2 - this.f21047e) + j;
    }

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public final String m2896e(C3179e c3179e) {
        C11586e m1127e;
        StringBuilder inmobi = AbstractC8703e.inmobi("\nbatch {\n");
        if (c3179e.applovin()) {
            m2877e(inmobi, 0, "upload_subdomain", c3179e.ads());
        }
        if (c3179e.inmobi()) {
            m2877e(inmobi, 0, "sgtm_join_id", c3179e.isPro());
        }
        for (C2709e c2709e : c3179e.signatures()) {
            if (c2709e != null) {
                m2874e(1, inmobi);
                inmobi.append("bundle {\n");
                if (c2709e.m1053catch()) {
                    m2877e(inmobi, 1, "protocol_version", Integer.valueOf(c2709e.m1081e()));
                }
                C6936e c6936e = (C6936e) this.f36443e;
                C10476e c10476e = c6936e.f14221e;
                C7269e c7269e = c6936e.f14202e;
                if (c10476e.m2822e(c2709e.signatures(), AbstractC17254e.f33833e) && c2709e.m1089e()) {
                    m2877e(inmobi, 1, "session_stitching_token", c2709e.m1091e());
                }
                m2877e(inmobi, 1, "platform", c2709e.m1084e());
                if (c2709e.isVip()) {
                    m2877e(inmobi, 1, "gmp_version", Long.valueOf(c2709e.inmobi()));
                }
                if (c2709e.isPro()) {
                    m2877e(inmobi, 1, "uploading_gmp_version", Long.valueOf(c2709e.applovin()));
                }
                if (c2709e.m1115e()) {
                    m2877e(inmobi, 1, "dynamite_version", Long.valueOf(c2709e.m1083e()));
                }
                if (c2709e.m1050abstract()) {
                    m2877e(inmobi, 1, "config_version", Long.valueOf(c2709e.m1057default()));
                }
                m2877e(inmobi, 1, "gmp_app_id", c2709e.m1176native());
                m2877e(inmobi, 1, "app_id", c2709e.signatures());
                m2877e(inmobi, 1, "app_version", c2709e.tapsense());
                if (c2709e.m1178protected()) {
                    m2877e(inmobi, 1, "app_version_major", Integer.valueOf(c2709e.m1051break()));
                }
                m2877e(inmobi, 1, "firebase_instance_id", c2709e.m1190try());
                if (c2709e.firebase()) {
                    m2877e(inmobi, 1, "dev_cert_hash", Long.valueOf(c2709e.m1054class()));
                }
                m2877e(inmobi, 1, "app_store", c2709e.m1064e());
                if (c2709e.m1161e()) {
                    m2877e(inmobi, 1, "upload_timestamp_millis", Long.valueOf(c2709e.m1109e()));
                }
                if (c2709e.m1125e()) {
                    m2877e(inmobi, 1, "start_timestamp_millis", Long.valueOf(c2709e.m1078e()));
                }
                if (c2709e.m1145e()) {
                    m2877e(inmobi, 1, "end_timestamp_millis", Long.valueOf(c2709e.m1076e()));
                }
                if (c2709e.m1157e()) {
                    m2877e(inmobi, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2709e.m1113e()));
                }
                if (c2709e.m1119e()) {
                    m2877e(inmobi, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2709e.m1075e()));
                }
                m2877e(inmobi, 1, "app_instance_id", c2709e.crashlytics());
                m2877e(inmobi, 1, "resettable_device_id", c2709e.ads());
                m2877e(inmobi, 1, "ds_id", c2709e.m1052case());
                if (c2709e.premium()) {
                    m2877e(inmobi, 1, "limited_ad_tracking", Boolean.valueOf(c2709e.subs()));
                }
                m2877e(inmobi, 1, "os_version", c2709e.m1104e());
                m2877e(inmobi, 1, "device_model", c2709e.m1135e());
                m2877e(inmobi, 1, "user_default_language", c2709e.m1166e());
                if (c2709e.m1150e()) {
                    m2877e(inmobi, 1, "time_zone_offset_minutes", Integer.valueOf(c2709e.m1065e()));
                }
                if (c2709e.m1175interface()) {
                    m2877e(inmobi, 1, "bundle_sequential_index", Integer.valueOf(c2709e.m1171goto()));
                }
                if (c2709e.m1153e()) {
                    m2877e(inmobi, 1, "delivery_index", Integer.valueOf(c2709e.m1060e()));
                }
                if (c2709e.m1059extends()) {
                    m2877e(inmobi, 1, "service_upload", Boolean.valueOf(c2709e.m1187throw()));
                }
                m2877e(inmobi, 1, "health_monitor", c2709e.m1186this());
                if (c2709e.m1063e()) {
                    m2877e(inmobi, 1, "retry_counter", Integer.valueOf(c2709e.m1080e()));
                }
                if (c2709e.m1140e()) {
                    m2877e(inmobi, 1, "consent_signals", c2709e.m1158e());
                }
                if (c2709e.m1069e()) {
                    m2877e(inmobi, 1, "is_dma_region", Boolean.valueOf(c2709e.m1100e()));
                }
                if (c2709e.m1147e()) {
                    m2877e(inmobi, 1, "core_platform_services", c2709e.m1092e());
                }
                if (c2709e.m1102e()) {
                    m2877e(inmobi, 1, "consent_diagnostics", c2709e.m1114e());
                }
                if (c2709e.m1137e()) {
                    m2877e(inmobi, 1, "target_os_version", Long.valueOf(c2709e.m1070e()));
                }
                C4261e.ad();
                if (c10476e.m2822e(c2709e.signatures(), AbstractC17254e.f33803e)) {
                    m2877e(inmobi, 1, "ad_services_version", Integer.valueOf(c2709e.m1162e()));
                    if (c2709e.m1118e() && (m1127e = c2709e.m1127e()) != null) {
                        m2874e(2, inmobi);
                        inmobi.append("attribution_eligibility_status {\n");
                        m2877e(inmobi, 2, "eligible", Boolean.valueOf(m1127e.signatures()));
                        m2877e(inmobi, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(m1127e.tapsense()));
                        m2877e(inmobi, 2, "pre_r", Boolean.valueOf(m1127e.isVip()));
                        m2877e(inmobi, 2, "r_extensions_too_old", Boolean.valueOf(m1127e.inmobi()));
                        m2877e(inmobi, 2, "adservices_extension_too_old", Boolean.valueOf(m1127e.isPro()));
                        m2877e(inmobi, 2, "ad_storage_not_allowed", Boolean.valueOf(m1127e.applovin()));
                        m2877e(inmobi, 2, "measurement_manager_disabled", Boolean.valueOf(m1127e.ads()));
                        m2874e(2, inmobi);
                        inmobi.append("}\n");
                    }
                }
                if (c2709e.m1112e()) {
                    C9763e m1134e = c2709e.m1134e();
                    m2874e(2, inmobi);
                    inmobi.append("ad_campaign_info {\n");
                    if (m1134e.m2647goto()) {
                        m2877e(inmobi, 2, "deep_link_gclid", m1134e.m2659this());
                    }
                    if (m1134e.m2652native()) {
                        m2877e(inmobi, 2, "deep_link_gbraid", m1134e.m2645extends());
                    }
                    if (m1134e.m2660throw()) {
                        m2877e(inmobi, 2, "deep_link_gad_source", m1134e.m2663while());
                    }
                    if (m1134e.m2653new()) {
                        m2877e(inmobi, 2, "deep_link_url", m1134e.m2656strictfp());
                    }
                    if (m1134e.m2662try()) {
                        m2877e(inmobi, 2, "deep_link_session_millis", Long.valueOf(m1134e.m2654protected()));
                    }
                    if (m1134e.m2640break()) {
                        m2877e(inmobi, 2, "market_referrer_gclid", m1134e.m2639abstract());
                    }
                    if (m1134e.m2644default()) {
                        m2877e(inmobi, 2, "market_referrer_gbraid", m1134e.m2648implements());
                    }
                    if (m1134e.m2641case()) {
                        m2877e(inmobi, 2, "market_referrer_gad_source", m1134e.m2642catch());
                    }
                    if (m1134e.m2646final()) {
                        m2877e(inmobi, 2, "market_referrer_click_millis", Long.valueOf(m1134e.m2657super()));
                    }
                    m2874e(2, inmobi);
                    inmobi.append("}\n");
                }
                if (c2709e.m1168final()) {
                    m2877e(inmobi, 1, "batching_timestamp_millis", Long.valueOf(c2709e.m1183super()));
                }
                if (c2709e.m1124e()) {
                    C0812e m1132e = c2709e.m1132e();
                    m2874e(2, inmobi);
                    inmobi.append("sgtm_diagnostics {\n");
                    int isPro = m1132e.isPro();
                    m2877e(inmobi, 2, "upload_type", isPro != 1 ? isPro != 2 ? isPro != 3 ? isPro != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    m2877e(inmobi, 2, "client_upload_eligibility", AbstractC1414e.pro(m1132e.signatures()));
                    int applovin = m1132e.applovin();
                    m2877e(inmobi, 2, "service_upload_eligibility", applovin != 1 ? applovin != 2 ? applovin != 3 ? applovin != 4 ? applovin != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    m2874e(2, inmobi);
                    inmobi.append("}\n");
                }
                if (c2709e.m1177new()) {
                    C15264e m1182strictfp = c2709e.m1182strictfp();
                    m2874e(2, inmobi);
                    inmobi.append("consent_info_extra {\n");
                    for (C14175e c14175e : m1182strictfp.signatures()) {
                        m2874e(3, inmobi);
                        inmobi.append("limited_data_modes {\n");
                        int tapsense = c14175e.tapsense();
                        m2877e(inmobi, 3, "type", tapsense != 1 ? tapsense != 2 ? tapsense != 3 ? tapsense != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int isVip = c14175e.isVip();
                        m2877e(inmobi, 3, "mode", isVip != 1 ? isVip != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        m2874e(3, inmobi);
                        inmobi.append("}\n");
                    }
                    m2874e(2, inmobi);
                    inmobi.append("}\n");
                }
                InterfaceC13229e<C5952e> m1142e = c2709e.m1142e();
                if (m1142e != null) {
                    for (C5952e c5952e : m1142e) {
                        if (c5952e != null) {
                            m2874e(2, inmobi);
                            inmobi.append("user_property {\n");
                            m2877e(inmobi, 2, "set_timestamp_millis", c5952e.signatures() ? Long.valueOf(c5952e.tapsense()) : null);
                            m2877e(inmobi, 2, "name", c7269e.metrica(c5952e.isVip()));
                            m2877e(inmobi, 2, "string_value", c5952e.isPro());
                            m2877e(inmobi, 2, "int_value", c5952e.applovin() ? Long.valueOf(c5952e.ads()) : null);
                            m2877e(inmobi, 2, "double_value", c5952e.crashlytics() ? Double.valueOf(c5952e.firebase()) : null);
                            m2874e(2, inmobi);
                            inmobi.append("}\n");
                        }
                    }
                }
                InterfaceC13229e<C7039e> m1192while = c2709e.m1192while();
                if (m1192while != null) {
                    for (C7039e c7039e : m1192while) {
                        if (c7039e != null) {
                            m2874e(2, inmobi);
                            inmobi.append("audience_membership {\n");
                            if (c7039e.signatures()) {
                                m2877e(inmobi, 2, "audience_id", Integer.valueOf(c7039e.tapsense()));
                            }
                            if (c7039e.applovin()) {
                                m2877e(inmobi, 2, "new_audience", Boolean.valueOf(c7039e.ads()));
                            }
                            m2879e(inmobi, "current_data", c7039e.isVip());
                            if (c7039e.inmobi()) {
                                m2879e(inmobi, "previous_data", c7039e.isPro());
                            }
                            m2874e(2, inmobi);
                            inmobi.append("}\n");
                        }
                    }
                }
                List<C2266e> m1160e = c2709e.m1160e();
                if (m1160e != null) {
                    for (C2266e c2266e : m1160e) {
                        if (c2266e != null) {
                            m2874e(2, inmobi);
                            inmobi.append("event {\n");
                            m2877e(inmobi, 2, "name", c7269e.ad(c2266e.applovin()));
                            if (c2266e.ads()) {
                                m2877e(inmobi, 2, "timestamp_millis", Long.valueOf(c2266e.premium()));
                            }
                            if (c10476e.m2822e(null, AbstractC17254e.f33810e) && c2266e.m795interface()) {
                                m2877e(inmobi, 2, "corrected_timestamp_millis", Long.valueOf(c2266e.m793goto()));
                            }
                            if (c2266e.subs()) {
                                m2877e(inmobi, 2, "previous_timestamp_millis", Long.valueOf(c2266e.crashlytics()));
                            }
                            if (c2266e.firebase()) {
                                m2877e(inmobi, 2, "count", Integer.valueOf(c2266e.m791class()));
                            }
                            if (c2266e.inmobi() != 0) {
                                m2899e(inmobi, 2, (InterfaceC13229e) c2266e.isVip());
                            }
                            m2874e(2, inmobi);
                            inmobi.append("}\n");
                        }
                    }
                }
                m2874e(1, inmobi);
                inmobi.append("}\n");
            }
        }
        inmobi.append("} // End-of-batch\n");
        return inmobi.toString();
    }

    /* renamed from: eُۨٞ, reason: contains not printable characters */
    public final boolean m2897e(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((C6936e) this.f36443e).f14215e.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public final String m2898e(C4512e c4512e) {
        StringBuilder inmobi = AbstractC8703e.inmobi("\nproperty_filter {\n");
        if (c4512e.signatures()) {
            m2877e(inmobi, 0, "filter_id", Integer.valueOf(c4512e.tapsense()));
        }
        m2877e(inmobi, 0, "property_name", ((C6936e) this.f36443e).f14202e.metrica(c4512e.isVip()));
        String m2887e = m2887e(c4512e.isPro(), c4512e.applovin(), c4512e.premium());
        if (!m2887e.isEmpty()) {
            m2877e(inmobi, 0, "filter_type", m2887e);
        }
        m2894e(inmobi, 1, c4512e.inmobi());
        inmobi.append("}\n");
        return inmobi.toString();
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final void m2899e(StringBuilder sb, int i, InterfaceC13229e interfaceC13229e) {
        if (interfaceC13229e == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = interfaceC13229e.iterator();
        while (it.hasNext()) {
            C13745e c13745e = (C13745e) it.next();
            if (c13745e != null) {
                m2874e(i2, sb);
                sb.append("param {\n");
                m2877e(sb, i2, "name", c13745e.signatures() ? ((C6936e) this.f36443e).f14202e.vip(c13745e.tapsense()) : null);
                m2877e(sb, i2, "string_value", c13745e.isVip() ? c13745e.inmobi() : null);
                m2877e(sb, i2, "int_value", c13745e.isPro() ? Long.valueOf(c13745e.applovin()) : null);
                m2877e(sb, i2, "double_value", c13745e.subs() ? Double.valueOf(c13745e.crashlytics()) : null);
                if (c13745e.m3642class() > 0) {
                    m2899e(sb, i2, c13745e.firebase());
                }
                m2874e(i2, sb);
                sb.append("}\n");
            }
        }
    }

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public final C2266e m2900e(C12036e c12036e) {
        C13673e m786extends = C2266e.m786extends();
        long j = c12036e.purchase;
        m786extends.vip();
        ((C2266e) m786extends.f12709e).m794implements(j);
        long j2 = c12036e.appmetrica;
        m786extends.vip();
        ((C2266e) m786extends.f12709e).signatures(j2);
        C3276e c3276e = c12036e.billing;
        Objects.requireNonNull(c3276e);
        Bundle bundle = c3276e.f7428e;
        for (String str : bundle.keySet()) {
            C3271e m3639interface = C13745e.m3639interface();
            m3639interface.yandex(str);
            Object obj = bundle.get(str);
            AbstractC9528e.startapp(obj);
            m2889e(m3639interface, obj);
            m786extends.smaato(m3639interface);
        }
        String str2 = c12036e.metrica;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            C3271e m3639interface2 = C13745e.m3639interface();
            m3639interface2.yandex("_o");
            m3639interface2.startapp(str2);
            m786extends.mopub((C13745e) m3639interface2.appmetrica());
        }
        return (C2266e) m786extends.appmetrica();
    }

    /* renamed from: eُٓٞ, reason: contains not printable characters */
    public final byte[] m2901e(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // defpackage.AbstractC1487e
    /* renamed from: eّٖٗ */
    public final void mo554e() {
    }

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public final Parcelable m2902e(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (C14658e unused) {
                C13879e c13879e = ((C6936e) this.f36443e).f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27502e.ad("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }
}
