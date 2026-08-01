package defpackage;

import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0383e {
    public static final Set ad = AbstractC1660e.m664case(new Character[]{'(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    public static final boolean ad(String str) {
        if (str.length() != 0) {
            if (str.length() >= 2) {
                if (str.length() == 0) {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
                if (str.charAt(0) == '\"' && AbstractC5304e.m1858extends(str) == '\"') {
                    int i = 1;
                    do {
                        int m1865interface = AbstractC5304e.m1865interface(str, '\"', i, 4);
                        if (m1865interface == AbstractC5304e.crashlytics(str)) {
                            break;
                        }
                        int i2 = 0;
                        for (int i3 = m1865interface - 1; str.charAt(i3) == '\\'; i3--) {
                            i2++;
                        }
                        if (i2 % 2 != 0) {
                            i = m1865interface + 1;
                        }
                    } while (i < str.length());
                    return false;
                }
            }
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!ad.contains(Character.valueOf(str.charAt(i4)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final String vip(String str) {
        StringBuilder sb = new StringBuilder("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\t') {
                sb.append("\\t");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else if (charAt == '\"') {
                sb.append("\\\"");
            } else if (charAt != '\\') {
                sb.append(charAt);
            } else {
                sb.append("\\\\");
            }
        }
        sb.append("\"");
        return sb.toString();
    }
}
