package defpackage;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16212e {
    public static final HashSet metrica = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    public final StringBuilder ad;
    public boolean vip = false;

    public C16212e(StringBuilder sb) {
        this.ad = sb;
    }

    public static int vip(int i, String str) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void ad(Object obj, String str) {
        boolean z = this.vip;
        StringBuilder sb = this.ad;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                sb.append((sb.length() > 1000 || sb.indexOf("\n") != -1) ? '\n' : ' ');
            }
            sb.append("[CONTEXT ");
            this.vip = true;
        }
        sb.append(str);
        sb.append('=');
        if (obj == null) {
            sb.append(true);
            return;
        }
        if (metrica.contains(obj.getClass())) {
            sb.append(obj);
            return;
        }
        sb.append('\"');
        String obj2 = obj.toString();
        int i = 0;
        while (true) {
            int vip = vip(i, obj2);
            if (vip == -1) {
                sb.append((CharSequence) obj2, i, obj2.length());
                sb.append('\"');
                return;
            }
            sb.append((CharSequence) obj2, i, vip);
            i = vip + 1;
            char charAt = obj2.charAt(vip);
            if (charAt == '\t') {
                charAt = 't';
            } else if (charAt == '\n') {
                charAt = 'n';
            } else if (charAt == '\r') {
                charAt = 'r';
            } else if (charAt != '\"' && charAt != '\\') {
                sb.append((char) 65533);
            }
            sb.append("\\");
            sb.append(charAt);
        }
    }
}
