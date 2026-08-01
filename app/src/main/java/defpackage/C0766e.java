package defpackage;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؑؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766e {
    public static final Pattern ad = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern license;
    public static final Pattern metrica;
    public static final Pattern vip;

    static {
        String str = AbstractC9413e.ad;
        Locale locale = Locale.US;
        vip = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        metrica = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        license = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF ad(String str) {
        String group;
        String group2;
        Matcher matcher = vip.matcher(str);
        Matcher matcher2 = metrica.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                AbstractC2803e.advert("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
