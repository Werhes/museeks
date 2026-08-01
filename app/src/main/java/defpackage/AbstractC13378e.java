package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13378e {
    public static final char[] ad;

    static {
        char[] cArr = new char[80];
        ad = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void ad(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(ad, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x018b, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018d, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a0, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void metrica(defpackage.AbstractC4994e r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13378e.metrica(eؗٚۘ, java.lang.StringBuilder, int):void");
    }

    public static void vip(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                vip(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                vip(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        ad(i, sb);
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
        if (obj instanceof String) {
            sb.append(": \"");
            C11507e c11507e = AbstractC4002e.f8908e;
            sb.append(AbstractC15946e.license(new C11507e(((String) obj).getBytes(AbstractC0352e.ad))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4002e) {
            sb.append(": \"");
            sb.append(AbstractC15946e.license((AbstractC4002e) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC4994e) {
            sb.append(" {");
            metrica((AbstractC4994e) obj, sb, i + 2);
            sb.append("\n");
            ad(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        vip(sb, i3, "key", entry.getKey());
        vip(sb, i3, "value", entry.getValue());
        sb.append("\n");
        ad(i, sb);
        sb.append("}");
    }
}
