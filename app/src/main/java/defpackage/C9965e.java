package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؐٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9965e implements InterfaceC10625e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final XmlPullParserFactory f19694e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final Pattern f19688e = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Pattern f19687e = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Pattern f19690e = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final Pattern f19686e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Pattern f19693e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Pattern f19692e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Pattern f19689e = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C8970e f19691e = new C8970e(1, 30.0f, 1);

    public C9965e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f19694e = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static C15904e ad(C15904e c15904e) {
        return c15904e == null ? new C15904e() : c15904e;
    }

    public static C12434e adcel(XmlPullParser xmlPullParser) {
        String billing = AbstractC4465e.billing(xmlPullParser, "extent");
        if (billing == null) {
            return null;
        }
        Matcher matcher = f19692e.matcher(billing);
        if (!matcher.matches()) {
            AbstractC2803e.smaato("TtmlParser", "Ignoring non-pixel tts extent: ".concat(billing));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C12434e(parseInt, Integer.parseInt(group2), 8);
        } catch (NumberFormatException unused) {
            AbstractC2803e.smaato("TtmlParser", "Ignoring malformed tts extent: ".concat(billing));
            return null;
        }
    }

    public static C8970e appmetrica(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = AbstractC9413e.ad;
            AbstractC2301e.yandex(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        C8970e c8970e = f19691e;
        int i = c8970e.vip;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = c8970e.metrica;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C8970e(i, parseInt * f, i2);
    }

    public static C13500e billing(XmlPullParser xmlPullParser, C13500e c13500e, HashMap hashMap, C8970e c8970e) {
        long j;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        C15904e yandex = yandex(xmlPullParser, null);
        String str = null;
        String str2 = BuildConfig.FLAVOR;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = startapp(attributeValue, c8970e);
                    break;
                case 2:
                    j3 = startapp(attributeValue, c8970e);
                    break;
                case 3:
                    j2 = startapp(attributeValue, c8970e);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = AbstractC9413e.ad;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c13500e != null) {
            long j5 = c13500e.license;
            if (j5 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L) {
                    j2 += j5;
                }
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 == -9223372036854775807L) {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (c13500e != null) {
                long j6 = c13500e.appmetrica;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new C13500e(xmlPullParser.getName(), null, j2, j, yandex, strArr, str2, str, c13500e);
                }
            }
        }
        j = j3;
        return new C13500e(xmlPullParser.getName(), null, j2, j, yandex, strArr, str2, str, c13500e);
    }

    public static void license(String str, C15904e c15904e) {
        Matcher matcher;
        String str2 = AbstractC9413e.ad;
        char c = 65535;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f19690e;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new Exception(AbstractC17861e.smaato(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            AbstractC2803e.smaato("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new Exception(AbstractC5087e.m1746extends("Invalid expression for fontSize: '", str, "'."));
        }
        String group = matcher.group(3);
        group.getClass();
        switch (group.hashCode()) {
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                if (group.equals("%")) {
                    c = 0;
                    break;
                }
                break;
            case 3240:
                if (group.equals("em")) {
                    c = 1;
                    break;
                }
                break;
            case 3592:
                if (group.equals("px")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                c15904e.adcel = 3;
                break;
            case 1:
                c15904e.adcel = 2;
                break;
            case 2:
                c15904e.adcel = 1;
                break;
            default:
                throw new Exception(AbstractC5087e.m1746extends("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        c15904e.mopub = Float.parseFloat(group2);
    }

    public static int metrica(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f19689e.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC2803e.smaato("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            AbstractC2301e.metrica(parseInt, parseInt2, "Invalid cell resolution %s %s", z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            AbstractC2803e.smaato("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0238, code lost:
    
        if (defpackage.AbstractC4465e.startapp(r20, "metadata") != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x023a, code lost:
    
        r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0243, code lost:
    
        if (defpackage.AbstractC4465e.startapp(r20, "image") == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0245, code lost:
    
        r6 = defpackage.AbstractC4465e.billing(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0249, code lost:
    
        if (r6 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024b, code lost:
    
        r25.put(r6, r20.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025b, code lost:
    
        if (defpackage.AbstractC4465e.yandex(r20, "metadata") == false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void purchase(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.C12434e r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9965e.purchase(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, eًّّ, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long startapp(java.lang.String r13, defpackage.C8970e r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9965e.startapp(java.lang.String, eٌۛؒ):long");
    }

    public static boolean vip(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x014e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:226:0x04e0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C15904e yandex(org.xmlpull.v1.XmlPullParser r18, defpackage.C15904e r19) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9965e.yandex(org.xmlpull.v1.XmlPullParser, eٖؐۚ):eٖؐۚ");
    }

    @Override // defpackage.InterfaceC10625e
    public final /* synthetic */ void reset() {
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this */
    public final InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f19694e.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(BuildConfig.FLAVOR, new C13446e(BuildConfig.FLAVOR, -3.4028235E38f, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION));
            C12434e c12434e = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C8970e c8970e = f19691e;
            int i3 = 0;
            int i4 = 15;
            C11328e c11328e = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C13500e c13500e = (C13500e) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c8970e = appmetrica(newPullParser);
                            i4 = metrica(newPullParser);
                            c12434e = adcel(newPullParser);
                        }
                        C8970e c8970e2 = c8970e;
                        C12434e c12434e2 = c12434e;
                        int i5 = i4;
                        if (vip(name)) {
                            if ("head".equals(name)) {
                                purchase(newPullParser, hashMap, i5, c12434e2, hashMap2, hashMap3);
                            } else {
                                try {
                                    C13500e billing = billing(newPullParser, c13500e, hashMap2, c8970e2);
                                    arrayDeque.push(billing);
                                    if (c13500e != null) {
                                        if (c13500e.smaato == null) {
                                            c13500e.smaato = new ArrayList();
                                        }
                                        c13500e.smaato.add(billing);
                                    }
                                } catch (C16762e e) {
                                    AbstractC2803e.amazon("TtmlParser", "Suppressing parser error", e);
                                }
                            }
                            i4 = i5;
                            c12434e = c12434e2;
                            c8970e = c8970e2;
                        } else {
                            AbstractC2803e.advert("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i3++;
                        i4 = i5;
                        c12434e = c12434e2;
                        c8970e = c8970e2;
                    } else if (eventType == 4) {
                        c13500e.getClass();
                        C13500e ad = C13500e.ad(newPullParser.getText());
                        if (c13500e.smaato == null) {
                            c13500e.smaato = new ArrayList();
                        }
                        c13500e.smaato.add(ad);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C13500e c13500e2 = (C13500e) arrayDeque.peek();
                            c13500e2.getClass();
                            c11328e = new C11328e(c13500e2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                newPullParser.next();
            }
            c11328e.getClass();
            return c11328e;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient */
    public final void mo825transient(byte[] bArr, int i, int i2, C14033e c14033e, InterfaceC8427e interfaceC8427e) {
        AbstractC1396e.smaato(mo823this(i, i2, bArr), c14033e, interfaceC8427e);
    }
}
