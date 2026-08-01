package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؐۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15155e {
    public static final char[] ad;

    static {
        char[] cArr = new char[80];
        ad = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void ad(StringBuilder sb, int i, String str, Object obj) {
        String replace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                ad(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                ad(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        metrica(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof AbstractC7244e) {
                sb.append(": \"");
                sb.append(AbstractC18467e.appmetrica(((AbstractC7244e) obj).admob()));
                sb.append('\"');
                return;
            }
            if (obj instanceof AbstractC15319e) {
                sb.append(" {");
                vip((AbstractC15319e) obj, sb, i + 2);
                sb.append("\n");
                metrica(i, sb);
                sb.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            int i3 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            ad(sb, i3, "key", entry.getKey());
            ad(sb, i3, "value", entry.getValue());
            sb.append("\n");
            metrica(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String str2 = (String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < str2.length(); i4++) {
            char charAt2 = str2.charAt(i4);
            if (charAt2 < ' ' || charAt2 > '~') {
                replace = AbstractC18467e.appmetrica(str2.getBytes(StandardCharsets.UTF_8));
                break;
            }
            if (charAt2 == '\"') {
                z3 = true;
            } else if (charAt2 == '\'') {
                z2 = true;
            } else if (charAt2 == '\\') {
                z = true;
            }
        }
        if (z) {
            str2 = str2.replace("\\", "\\\\");
        }
        replace = z2 ? str2.replace("'", "\\'") : str2;
        if (z3) {
            replace = replace.replace("\"", "\\\"");
        }
        sb.append(replace);
        sb.append('\"');
    }

    public static void metrica(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(ad, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0184, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0192, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a4, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ba, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d2, code lost:
    
        if (r13 != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vip(defpackage.AbstractC15319e r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15155e.vip(eًٕؔ, java.lang.StringBuilder, int):void");
    }
}
