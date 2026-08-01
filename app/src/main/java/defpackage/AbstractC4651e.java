package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؖؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4651e {
    public static final Pattern ad = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern vip = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String ad(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder inmobi = AbstractC1786e.inmobi(j, "bytes=", "-");
        if (j2 != -1) {
            inmobi.append((j + j2) - 1);
        }
        return inmobi.toString();
    }

    public static long vip(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = vip.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
