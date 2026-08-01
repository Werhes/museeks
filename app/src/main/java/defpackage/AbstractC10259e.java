package defpackage;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10259e {
    public static final Map license;
    public static final Map metrica;
    public static final Pattern ad = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern vip = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        metrica = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        license = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void ad(String str, C0321e c0321e, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        int i;
        int i2;
        int i3;
        int i4 = c0321e.vip;
        int length = spannableStringBuilder.length();
        String str2 = c0321e.ad;
        str2.getClass();
        int i5 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals(BuildConfig.FLAVOR)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case 2:
                for (String str3 : c0321e.license) {
                    Map map = metrica;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = license;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new C17763e(c0321e.metrica), i4, length, 33);
                break;
            case 7:
                int metrica2 = metrica(list2, str, c0321e);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C14429e.metrica);
                int i6 = c0321e.vip;
                int i7 = 0;
                int i8 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((C14429e) arrayList.get(i7)).ad.ad)) {
                        C14429e c14429e = (C14429e) arrayList.get(i7);
                        int metrica3 = metrica(list2, str, c14429e.ad);
                        if (metrica3 == i5) {
                            metrica3 = metrica2 != i5 ? metrica2 : 1;
                        }
                        int i9 = c14429e.ad.vip - i8;
                        int i10 = c14429e.vip - i8;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new C6292e(subSequence.toString(), metrica3), i6, i9, 33);
                        i8 = subSequence.length() + i8;
                        i6 = i9;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList vip2 = vip(list2, str, c0321e);
        for (int i11 = 0; i11 < vip2.size(); i11++) {
            C2139e c2139e = ((C1584e) vip2.get(i11)).f4492e;
            int i12 = c2139e.advert;
            if (i12 == -1 && c2139e.smaato == -1) {
                i = -1;
            } else {
                i = (c2139e.smaato == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i13 = c2139e.advert;
                if (i13 == -1 && c2139e.smaato == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i13 == 1 ? 1 : 0) | (c2139e.smaato == 1 ? 2 : 0);
                }
                AbstractC17190e.ad(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (c2139e.adcel == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (c2139e.mopub == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (c2139e.billing) {
                if (!c2139e.billing) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC17190e.ad(spannableStringBuilder, new ForegroundColorSpan(c2139e.purchase), i4, length);
            }
            if (c2139e.startapp) {
                if (!c2139e.startapp) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC17190e.ad(spannableStringBuilder, new BackgroundColorSpan(c2139e.yandex), i4, length);
            }
            if (c2139e.appmetrica != null) {
                AbstractC17190e.ad(spannableStringBuilder, new TypefaceSpan(c2139e.appmetrica), i4, length);
            }
            int i14 = c2139e.amazon;
            if (i14 == 1) {
                AbstractC17190e.ad(spannableStringBuilder, new AbsoluteSizeSpan((int) c2139e.loadAd, true), i4, length);
            } else if (i14 == 2) {
                AbstractC17190e.ad(spannableStringBuilder, new RelativeSizeSpan(c2139e.loadAd), i4, length);
            } else if (i14 == 3) {
                AbstractC17190e.ad(spannableStringBuilder, new RelativeSizeSpan(c2139e.loadAd / 100.0f), i4, length);
            }
            if (c2139e.admob) {
                spannableStringBuilder.setSpan(new Object(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0081, code lost:
    
        if (r6.equals("center") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
    
        if (r7.equals("start") == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void appmetrica(java.lang.String r18, defpackage.C5932e r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10259e.appmetrica(java.lang.String, eؘؙ۟):void");
    }

    public static void billing(String str, C5932e c5932e) {
        int indexOf = str.indexOf(44);
        char c = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    AbstractC2803e.smaato("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = RecyclerView.UNDEFINED_DURATION;
                    break;
            }
            c5932e.billing = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c5932e.appmetrica = AbstractC6328e.vip(str);
            c5932e.purchase = 0;
        } else {
            c5932e.appmetrica = Integer.parseInt(str);
            c5932e.purchase = 1;
        }
    }

    public static C16743e license(String str, Matcher matcher, C1292e c1292e, ArrayList arrayList) {
        C5932e c5932e = new C5932e();
        try {
            String group = matcher.group(1);
            group.getClass();
            c5932e.ad = AbstractC6328e.metrica(group);
            String group2 = matcher.group(2);
            group2.getClass();
            c5932e.vip = AbstractC6328e.metrica(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            appmetrica(group3, c5932e);
            StringBuilder sb = new StringBuilder();
            c1292e.getClass();
            String amazon = c1292e.amazon(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(amazon)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(amazon.trim());
                amazon = c1292e.amazon(StandardCharsets.UTF_8);
            }
            c5932e.metrica = purchase(str, sb.toString(), arrayList);
            return new C16743e(c5932e.ad().ad(), c5932e.ad, c5932e.vip);
        } catch (IllegalArgumentException unused) {
            AbstractC2803e.smaato("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static int metrica(List list, String str, C0321e c0321e) {
        ArrayList vip2 = vip(list, str, c0321e);
        for (int i = 0; i < vip2.size(); i++) {
            int i2 = ((C1584e) vip2.get(i)).f4492e.Signature;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01de, code lost:
    
        switch(r10) {
            case 0: goto L123;
            case 1: goto L122;
            case 2: goto L121;
            case 3: goto L120;
            default: goto L119;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e1, code lost:
    
        defpackage.AbstractC2803e.smaato("WebvttCueParser", "ignoring unsupported entity: '&" + r7 + ";'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0209, code lost:
    
        if (r6 != r15) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x020b, code lost:
    
        r3.append((java.lang.CharSequence) " ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x020e, code lost:
    
        r7 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01fa, code lost:
    
        r3.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fe, code lost:
    
        r3.append('&');
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0202, code lost:
    
        r3.append('<');
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0206, code lost:
    
        r3.append('>');
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:64:0x00a4. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString purchase(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10259e.purchase(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList vip(List list, String str, C0321e c0321e) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C2139e c2139e = (C2139e) list.get(i);
            String str2 = c0321e.ad;
            Set set = c0321e.license;
            String str3 = c0321e.metrica;
            if (c2139e.ad.isEmpty() && c2139e.vip.isEmpty() && c2139e.metrica.isEmpty() && c2139e.license.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int ad2 = C2139e.ad(C2139e.ad(C2139e.ad(0, 1073741824, c2139e.ad, str), 2, c2139e.vip, str2), 4, c2139e.license, str3);
                size = (ad2 == -1 || !set.containsAll(c2139e.metrica)) ? 0 : ad2 + (c2139e.metrica.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new C1584e(size, c2139e));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
