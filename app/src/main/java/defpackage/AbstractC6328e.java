package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6328e {
    public static final Pattern ad = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean ad(C1292e c1292e) {
        c1292e.getClass();
        String amazon = c1292e.amazon(StandardCharsets.UTF_8);
        return amazon != null && amazon.startsWith("WEBVTT");
    }

    public static void license(C1292e c1292e) {
        int i = c1292e.vip;
        if (ad(c1292e)) {
            return;
        }
        c1292e.m571try(i);
        throw C15125e.ad(null, "Expected WEBVTT. Got " + c1292e.amazon(StandardCharsets.UTF_8));
    }

    public static long metrica(String str) {
        String str2 = AbstractC9413e.ad;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static float vip(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
