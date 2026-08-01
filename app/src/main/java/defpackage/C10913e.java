package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.conscrypt.BuildConfig;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10913e {
    public C0912e ad;
    public boolean appmetrica;
    public StringBuilder billing;
    public int license;
    public boolean metrica;
    public EnumC16334e purchase;
    public StringBuilder startapp;
    public InterfaceC18321e vip;
    public boolean yandex;

    public static float Signature(String str) {
        int length = str.length();
        if (length != 0) {
            return loadAd(length, str);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    public static void adcel(AbstractC14697e abstractC14697e, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int ads = AbstractC0054e.ads(attributes, i);
                if (ads == 0) {
                    C6095e c6095e = new C6095e(trim);
                    ArrayList arrayList = null;
                    while (!c6095e.premium()) {
                        String m2677catch = c6095e.m2677catch();
                        if (m2677catch != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(m2677catch);
                            c6095e.m2694finally();
                        }
                    }
                    abstractC14697e.billing = arrayList;
                } else if (ads != 72) {
                    if (abstractC14697e.appmetrica == null) {
                        abstractC14697e.appmetrica = new C17619e();
                    }
                    crashlytics(abstractC14697e.appmetrica, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    C9831e c9831e = new C9831e(trim.replaceAll("/\\*.*?\\*/", BuildConfig.FLAVOR));
                    while (true) {
                        String m2693final = c9831e.m2693final(':', false);
                        c9831e.m2694finally();
                        if (!c9831e.inmobi(':')) {
                            break;
                        }
                        c9831e.m2694finally();
                        String m2693final2 = c9831e.m2693final(';', true);
                        if (m2693final2 == null) {
                            break;
                        }
                        c9831e.m2694finally();
                        if (c9831e.premium() || c9831e.inmobi(';')) {
                            if (abstractC14697e.purchase == null) {
                                abstractC14697e.purchase = new C17619e();
                            }
                            crashlytics(abstractC14697e.purchase, m2693final, m2693final2);
                            c9831e.m2694finally();
                        }
                    }
                }
            }
        }
    }

    public static ArrayList admob(String str) {
        C9831e c9831e = new C9831e(str);
        ArrayList arrayList = null;
        do {
            String m2676case = c9831e.m2676case();
            if (m2676case == null) {
                m2676case = c9831e.m2693final(',', true);
            }
            if (m2676case == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(m2676case);
            c9831e.m2713throws();
        } while (!c9831e.premium());
        return arrayList;
    }

    public static void advert(InterfaceC4644e interfaceC4644e, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC10880e.ad(attributes.getLocalName(i)) == EnumC10880e.f21552e) {
                interfaceC4644e.mopub(applovin(attributes.getValue(i)));
            }
        }
    }

    public static C18073e amazon(String str) {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C9436e c9436e = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j = j2 * 16;
                            i = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 * 16) + (charAt - '0');
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    c9436e = new C9436e(j2, i2);
                }
            }
            if (c9436e == null) {
                throw new SAXException("Bad hex colour value: ".concat(str));
            }
            long j3 = c9436e.f18775e;
            int i3 = c9436e.f18776e;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new C18073e(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new C18073e(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new SAXException("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new C18073e((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new C18073e((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            C9831e c9831e = new C9831e(str.substring(startsWith ? 5 : 4));
            c9831e.m2694finally();
            float m2681default = c9831e.m2681default();
            if (!Float.isNaN(m2681default) && c9831e.inmobi('%')) {
                m2681default = (m2681default * 256.0f) / 100.0f;
            }
            float smaato = c9831e.smaato(m2681default);
            if (!Float.isNaN(smaato) && c9831e.inmobi('%')) {
                smaato = (smaato * 256.0f) / 100.0f;
            }
            float smaato2 = c9831e.smaato(smaato);
            if (!Float.isNaN(smaato2) && c9831e.inmobi('%')) {
                smaato2 = (smaato2 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                c9831e.m2694finally();
                if (Float.isNaN(smaato2) || !c9831e.inmobi(')')) {
                    throw new SAXException("Bad rgb() colour value: ".concat(str));
                }
                return new C18073e((vip(m2681default) << 16) | (-16777216) | (vip(smaato) << 8) | vip(smaato2));
            }
            float smaato3 = c9831e.smaato(smaato2);
            c9831e.m2694finally();
            if (Float.isNaN(smaato3) || !c9831e.inmobi(')')) {
                throw new SAXException("Bad rgba() colour value: ".concat(str));
            }
            return new C18073e((vip(smaato3 * 256.0f) << 24) | (vip(m2681default) << 16) | (vip(smaato) << 8) | vip(smaato2));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) AbstractC8656e.ad.get(lowerCase);
            if (num != null) {
                return new C18073e(num.intValue());
            }
            throw new SAXException("Invalid colour keyword: ".concat(lowerCase));
        }
        C9831e c9831e2 = new C9831e(str.substring(startsWith2 ? 5 : 4));
        c9831e2.m2694finally();
        float m2681default2 = c9831e2.m2681default();
        float smaato4 = c9831e2.smaato(m2681default2);
        if (!Float.isNaN(smaato4)) {
            c9831e2.inmobi('%');
        }
        float smaato5 = c9831e2.smaato(smaato4);
        if (!Float.isNaN(smaato5)) {
            c9831e2.inmobi('%');
        }
        if (!startsWith2) {
            c9831e2.m2694finally();
            if (Float.isNaN(smaato5) || !c9831e2.inmobi(')')) {
                throw new SAXException("Bad hsl() colour value: ".concat(str));
            }
            return new C18073e(license(m2681default2, smaato4, smaato5) | (-16777216));
        }
        float smaato6 = c9831e2.smaato(smaato5);
        c9831e2.m2694finally();
        if (Float.isNaN(smaato6) || !c9831e2.inmobi(')')) {
            throw new SAXException("Bad hsla() colour value: ".concat(str));
        }
        return new C18073e((vip(smaato6 * 256.0f) << 24) | license(m2681default2, smaato4, smaato5));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0066. Please report as an issue. */
    public static Matrix applovin(String str) {
        Matrix matrix = new Matrix();
        C9831e c9831e = new C9831e(str);
        c9831e.m2694finally();
        while (!c9831e.premium()) {
            String str2 = (String) c9831e.license;
            String str3 = null;
            if (!c9831e.premium()) {
                int i = c9831e.vip;
                int charAt = str2.charAt(i);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = c9831e.startapp();
                    }
                }
                int i2 = c9831e.vip;
                while (C9831e.m2673try(charAt)) {
                    charAt = c9831e.startapp();
                }
                if (charAt == 40) {
                    c9831e.vip++;
                    str3 = str2.substring(i, i2);
                } else {
                    c9831e.vip = i;
                }
            }
            if (str3 == null) {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(str));
            }
            char c = 65535;
            switch (str3.hashCode()) {
                case -1081239615:
                    if (str3.equals("matrix")) {
                        c = 0;
                        break;
                    }
                    break;
                case -925180581:
                    if (str3.equals("rotate")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109250890:
                    if (str3.equals("scale")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109493390:
                    if (str3.equals("skewX")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109493391:
                    if (str3.equals("skewY")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1052832078:
                    if (str3.equals("translate")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c9831e.m2694finally();
                    float m2681default = c9831e.m2681default();
                    c9831e.m2713throws();
                    float m2681default2 = c9831e.m2681default();
                    c9831e.m2713throws();
                    float m2681default3 = c9831e.m2681default();
                    c9831e.m2713throws();
                    float m2681default4 = c9831e.m2681default();
                    c9831e.m2713throws();
                    float m2681default5 = c9831e.m2681default();
                    c9831e.m2713throws();
                    float m2681default6 = c9831e.m2681default();
                    c9831e.m2694finally();
                    if (!Float.isNaN(m2681default6) && c9831e.inmobi(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{m2681default, m2681default3, m2681default5, m2681default2, m2681default4, m2681default6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(str));
                    }
                case 1:
                    c9831e.m2694finally();
                    float m2681default7 = c9831e.m2681default();
                    float m2699instanceof = c9831e.m2699instanceof();
                    float m2699instanceof2 = c9831e.m2699instanceof();
                    c9831e.m2694finally();
                    if (Float.isNaN(m2681default7) || !c9831e.inmobi(')')) {
                        throw new SAXException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(m2699instanceof)) {
                        matrix.preRotate(m2681default7);
                        break;
                    } else if (!Float.isNaN(m2699instanceof2)) {
                        matrix.preRotate(m2681default7, m2699instanceof, m2699instanceof2);
                        break;
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(str));
                    }
                case 2:
                    c9831e.m2694finally();
                    float m2681default8 = c9831e.m2681default();
                    float m2699instanceof3 = c9831e.m2699instanceof();
                    c9831e.m2694finally();
                    if (!Float.isNaN(m2681default8) && c9831e.inmobi(')')) {
                        if (!Float.isNaN(m2699instanceof3)) {
                            matrix.preScale(m2681default8, m2699instanceof3);
                            break;
                        } else {
                            matrix.preScale(m2681default8, m2681default8);
                            break;
                        }
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(str));
                    }
                    break;
                case 3:
                    c9831e.m2694finally();
                    float m2681default9 = c9831e.m2681default();
                    c9831e.m2694finally();
                    if (!Float.isNaN(m2681default9) && c9831e.inmobi(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(m2681default9)), 0.0f);
                        break;
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(str));
                    }
                    break;
                case 4:
                    c9831e.m2694finally();
                    float m2681default10 = c9831e.m2681default();
                    c9831e.m2694finally();
                    if (!Float.isNaN(m2681default10) && c9831e.inmobi(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(m2681default10)));
                        break;
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(str));
                    }
                    break;
                case 5:
                    c9831e.m2694finally();
                    float m2681default11 = c9831e.m2681default();
                    float m2699instanceof4 = c9831e.m2699instanceof();
                    c9831e.m2694finally();
                    if (!Float.isNaN(m2681default11) && c9831e.inmobi(')')) {
                        if (!Float.isNaN(m2699instanceof4)) {
                            matrix.preTranslate(m2681default11, m2699instanceof4);
                            break;
                        } else {
                            matrix.preTranslate(m2681default11, 0.0f);
                            break;
                        }
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new SAXException(AbstractC5087e.m1746extends("Invalid transform list fn: ", str3, ")"));
            }
            if (c9831e.premium()) {
                return matrix;
            }
            c9831e.m2713throws();
        }
        return matrix;
    }

    public static float appmetrica(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? AbstractC1634e.billing(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? AbstractC1634e.billing(4.0f, f3, f2 - f, f) : f;
    }

    public static void billing(AbstractC14697e abstractC14697e, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                abstractC14697e.metrica = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    abstractC14697e.license = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new SAXException(AbstractC17861e.Signature("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    abstractC14697e.license = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:465:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void crashlytics(defpackage.C17619e r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10913e.crashlytics(eؚ٘ۢ, java.lang.String, java.lang.String):void");
    }

    public static void inmobi(AbstractC4240e abstractC4240e, String str) {
        int i;
        C9831e c9831e = new C9831e(str);
        c9831e.m2694finally();
        String m2677catch = c9831e.m2677catch();
        if ("defer".equals(m2677catch)) {
            c9831e.m2694finally();
            m2677catch = c9831e.m2677catch();
        }
        EnumC12770e enumC12770e = (EnumC12770e) AbstractC0797e.ad.get(m2677catch);
        c9831e.m2694finally();
        if (c9831e.premium()) {
            i = 0;
        } else {
            String m2677catch2 = c9831e.m2677catch();
            m2677catch2.getClass();
            if (m2677catch2.equals("meet")) {
                i = 1;
            } else {
                if (!m2677catch2.equals("slice")) {
                    throw new SAXException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        abstractC4240e.amazon = new C9213e(enumC12770e, i);
    }

    public static HashMap isPro(C9831e c9831e) {
        HashMap hashMap = new HashMap();
        c9831e.m2694finally();
        String m2693final = c9831e.m2693final('=', false);
        while (m2693final != null) {
            c9831e.inmobi('=');
            hashMap.put(m2693final, c9831e.m2676case());
            c9831e.m2694finally();
            m2693final = c9831e.m2693final('=', false);
        }
        return hashMap;
    }

    public static AbstractC11870e isVip(String str) {
        boolean startsWith = str.startsWith("url(");
        AbstractC11870e abstractC11870e = C18073e.f35444e;
        AbstractC11870e abstractC11870e2 = C2833e.f6807e;
        AbstractC11870e abstractC11870e3 = null;
        if (!startsWith) {
            if (str.equals("none")) {
                return abstractC11870e;
            }
            if (str.equals("currentColor")) {
                return abstractC11870e2;
            }
            try {
                return amazon(str);
            } catch (C1178e unused) {
                return null;
            }
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new C7912e(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            if (!trim2.equals("none")) {
                if (trim2.equals("currentColor")) {
                    abstractC11870e = abstractC11870e2;
                } else {
                    try {
                        abstractC11870e = amazon(trim2);
                    } catch (C1178e unused2) {
                        abstractC11870e = null;
                    }
                }
            }
            abstractC11870e3 = abstractC11870e;
        }
        return new C7912e(trim, abstractC11870e3);
    }

    public static int license(float f, float f2, float f3) {
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f8 = f7 >= 0.0f ? f7 > 1.0f ? 1.0f : f7 : 0.0f;
        float f9 = f8 <= 0.5f ? (f6 + 1.0f) * f8 : (f8 + f6) - (f6 * f8);
        float f10 = (f8 * 2.0f) - f9;
        return vip(appmetrica(f10, f9, f5 - 2.0f) * 256.0f) | (vip(appmetrica(f10, f9, f5 + 2.0f) * 256.0f) << 16) | (vip(appmetrica(f10, f9, f5) * 256.0f) << 8);
    }

    public static float loadAd(int i, String str) {
        float subs = new C5401e((byte) 0, 2).subs(0, i, str);
        if (Float.isNaN(subs)) {
            throw new SAXException(AbstractC17861e.Signature("Invalid float value: ", str));
        }
        return subs;
    }

    public static void mopub(AbstractC1375e abstractC1375e, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ads = AbstractC0054e.ads(attributes, i);
            if (ads == 9) {
                abstractC1375e.Signature = pro(trim);
            } else if (ads == 10) {
                abstractC1375e.admob = pro(trim);
            } else if (ads == 82) {
                abstractC1375e.amazon = pro(trim);
            } else if (ads == 83) {
                abstractC1375e.loadAd = pro(trim);
            }
        }
    }

    public static ArrayList pro(String str) {
        if (str.length() == 0) {
            throw new SAXException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        C9831e c9831e = new C9831e(str);
        c9831e.m2694finally();
        while (!c9831e.premium()) {
            float m2681default = c9831e.m2681default();
            if (Float.isNaN(m2681default)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) c9831e.license;
                int i = c9831e.vip;
                while (!c9831e.premium() && !C9831e.m2673try(str2.charAt(c9831e.vip))) {
                    c9831e.vip++;
                }
                String substring = str2.substring(i, c9831e.vip);
                c9831e.vip = i;
                sb.append(substring);
                throw new SAXException(sb.toString());
            }
            int m2708super = c9831e.m2708super();
            if (m2708super == 0) {
                m2708super = 1;
            }
            arrayList.add(new C17102e(m2708super, m2681default));
            c9831e.m2713throws();
        }
        return arrayList;
    }

    public static void purchase(InterfaceC6472e interfaceC6472e, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ads = AbstractC0054e.ads(attributes, i);
            if (ads != 73) {
                switch (ads) {
                    case 52:
                        C9831e c9831e = new C9831e(trim);
                        HashSet hashSet = new HashSet();
                        while (!c9831e.premium()) {
                            String m2677catch = c9831e.m2677catch();
                            if (m2677catch.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(m2677catch.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            c9831e.m2694finally();
                        }
                        interfaceC6472e.license(hashSet);
                        break;
                    case 53:
                        interfaceC6472e.yandex(trim);
                        break;
                    case 54:
                        C9831e c9831e2 = new C9831e(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!c9831e2.premium()) {
                            hashSet2.add(c9831e2.m2677catch());
                            c9831e2.m2694finally();
                        }
                        interfaceC6472e.startapp(hashSet2);
                        break;
                    case 55:
                        ArrayList admob = admob(trim);
                        interfaceC6472e.billing(admob != null ? new HashSet(admob) : new HashSet(0));
                        break;
                }
            } else {
                C9831e c9831e3 = new C9831e(trim);
                HashSet hashSet3 = new HashSet();
                while (!c9831e3.premium()) {
                    String m2677catch2 = c9831e3.m2677catch();
                    int indexOf = m2677catch2.indexOf(45);
                    if (indexOf != -1) {
                        m2677catch2 = m2677catch2.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(m2677catch2, BuildConfig.FLAVOR, BuildConfig.FLAVOR).getLanguage());
                    c9831e3.m2694finally();
                }
                interfaceC6472e.adcel(hashSet3);
            }
        }
    }

    public static C17102e remoteconfig(String str) {
        int i;
        if (str.length() == 0) {
            throw new SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            i = 9;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                i = AbstractC0054e.m217break(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid length unit specifier: ".concat(str));
            }
        } else {
            i = 1;
        }
        try {
            return new C17102e(i, loadAd(length, str));
        } catch (NumberFormatException e) {
            throw new SAXException("Invalid length value: ".concat(str), e);
        }
    }

    public static C17102e signatures(C9831e c9831e) {
        return c9831e.isPro("auto") ? new C17102e(0.0f) : c9831e.m2697implements();
    }

    public static void smaato(AbstractC16854e abstractC16854e, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ads = AbstractC0054e.ads(attributes, i);
            if (ads == 48) {
                inmobi(abstractC16854e, trim);
            } else if (ads != 80) {
                continue;
            } else {
                C9831e c9831e = new C9831e(trim);
                c9831e.m2694finally();
                float m2681default = c9831e.m2681default();
                c9831e.m2713throws();
                float m2681default2 = c9831e.m2681default();
                c9831e.m2713throws();
                float m2681default3 = c9831e.m2681default();
                c9831e.m2713throws();
                float m2681default4 = c9831e.m2681default();
                if (Float.isNaN(m2681default) || Float.isNaN(m2681default2) || Float.isNaN(m2681default3) || Float.isNaN(m2681default4)) {
                    throw new SAXException("Invalid viewBox definition - should have four numbers");
                }
                if (m2681default3 < 0.0f) {
                    throw new SAXException("Invalid viewBox. width cannot be negative");
                }
                if (m2681default4 < 0.0f) {
                    throw new SAXException("Invalid viewBox. height cannot be negative");
                }
                abstractC16854e.loadAd = new C2359e(m2681default, m2681default2, m2681default3, m2681default4);
            }
        }
    }

    public static void startapp(C18207e c18207e, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (EnumC10880e.ad(attributes.getLocalName(i)) == EnumC10880e.f21553e) {
                C9831e c9831e = new C9831e(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c9831e.m2694finally();
                while (!c9831e.premium()) {
                    float m2681default = c9831e.m2681default();
                    if (Float.isNaN(m2681default)) {
                        throw new SAXException(AbstractC5087e.m1746extends("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    c9831e.m2713throws();
                    float m2681default2 = c9831e.m2681default();
                    if (Float.isNaN(m2681default2)) {
                        throw new SAXException(AbstractC5087e.m1746extends("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    c9831e.m2713throws();
                    arrayList.add(Float.valueOf(m2681default));
                    arrayList.add(Float.valueOf(m2681default2));
                }
                c18207e.loadAd = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    c18207e.loadAd[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static String subscription(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static Float tapsense(String str) {
        try {
            float Signature = Signature(str);
            float f = 0.0f;
            if (Signature >= 0.0f) {
                f = 1.0f;
                if (Signature > 1.0f) {
                }
                return Float.valueOf(Signature);
            }
            Signature = f;
            return Float.valueOf(Signature);
        } catch (C1178e unused) {
            return null;
        }
    }

    public static int vip(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static void yandex(AbstractC7242e abstractC7242e, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ads = AbstractC0054e.ads(attributes, i);
            if (ads == 23) {
                abstractC7242e.adcel = applovin(trim);
            } else if (ads != 24) {
                if (ads != 26) {
                    if (ads != 60) {
                        continue;
                    } else {
                        try {
                            abstractC7242e.mopub = AbstractC0054e.m223protected(trim);
                        } catch (IllegalArgumentException unused) {
                            throw new SAXException(AbstractC5087e.m1746extends("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                        }
                    }
                } else if (BuildConfig.FLAVOR.equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                    abstractC7242e.advert = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                abstractC7242e.startapp = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new SAXException("Invalid value for attribute gradientUnits");
                }
                abstractC7242e.startapp = Boolean.TRUE;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [eٖٟ۠, java.lang.Object, eؕٞۨ] */
    public final void ad(String str) {
        AbstractC18098e abstractC18098e = (AbstractC18098e) this.vip;
        int size = abstractC18098e.startapp.size();
        AbstractC16408e abstractC16408e = size == 0 ? null : (AbstractC16408e) abstractC18098e.startapp.get(size - 1);
        if (abstractC16408e instanceof C3530e) {
            C3530e c3530e = (C3530e) abstractC16408e;
            c3530e.metrica = AbstractC1786e.signatures(new StringBuilder(), c3530e.metrica, str);
        } else {
            InterfaceC18321e interfaceC18321e = this.vip;
            ?? obj = new Object();
            obj.metrica = str;
            interfaceC18321e.appmetrica(obj);
        }
    }

    public final void ads(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            C1165e c1165e = new C1165e(this);
            xMLReader.setContentHandler(c1165e);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", c1165e);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SAXException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SAXException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SAXException("SVG parse error", e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x0479, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0631, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x06ed, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0910, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0b40, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:468:0x0743. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [eٖٟ۠, eؗؕ۠, eۗۜ, eٔٓؐ, eَؙٙ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v137, types: [eٖٟ۠, eؗؕ۠, eۗۜ, eٔٓؐ, eَؙٙ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v140, types: [eٖٟ۠, eۗۜ, eٔٓؐ, eَؙٙ, eؚٗؓ, eٜؖۥ] */
    /* JADX WARN: Type inference failed for: r0v143, types: [eؒ۠ٚ, eٖٟ۠, eؗؕ۠, eۗۜ, eٔٓؐ, eَؙٙ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v146, types: [eًّ۟, eٖٟ۠, eۗۜ, eٔٓؐ, eَؙٙ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v151, types: [eٖٟ۠, eٍؘؑ, eٔٓؐ, eَؙٙ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v156, types: [eؒ۠ٚ, eٖٟ۠, eؖۥٗ, eۗۜ, eٔٓؐ, eَؙٙ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v159, types: [eٖٟ۠, eؗؕ۠, eۗۜ, eٔٓؐ, eٔؗؔ, eَؙٙ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v164, types: [eٖٟ۠, eۗۜ, eٔٓؐ, eَؙٙ, eؚٗؓ, eٜؖۥ] */
    /* JADX WARN: Type inference failed for: r0v26, types: [eٖٟ۠, eؗؕ۠, eۗۜ, eٔٓؐ, eَؙٙ, eۣ٘ٛ, eؘِٗ] */
    /* JADX WARN: Type inference failed for: r0v30, types: [eٖٟ۠, eؗؕ۠, eۗۜ, eٔٓؐ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v47, types: [eٖٟ۠, eؗؕ۠, eۗۜ, eٔٓؐ, eَؙٙ, eٜؖۥ, e٘ۦۜ] */
    /* JADX WARN: Type inference failed for: r0v62, types: [eؖۦً, eٖٟ۠, eۗۜ, eؚٙٓ, eٔٓؐ] */
    /* JADX WARN: Type inference failed for: r0v65, types: [eؙُۢ, eٖٟ۠, eۗۜ, eٔٓؐ, eَؙٙ, eؚٗؓ, eٜؖۥ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eٖٟ۠, eۗۜ, eٔٓؐ, java.lang.Object, eٍؘۨ, eَؙٙ, eؚٗؓ, eٜؖۥ] */
    /* JADX WARN: Type inference failed for: r0v71, types: [eٖٟ۠, eَؚّ, eۗۜ, eٔٓؐ, eَؙٙ, eۣ٘ٛ] */
    /* JADX WARN: Type inference failed for: r0v78, types: [eٖٟ۠, eۗۜ, eٔٓؐ, eَؙٙ, eؚٗؓ, eٌؔ٘, eٜؖۥ] */
    /* JADX WARN: Type inference failed for: r0v93, types: [eٌؔۖ, eٖٟ۠, eۗۜ, eؚٙٓ, eٔٓؐ] */
    /* JADX WARN: Type inference failed for: r3v102, types: [eٖٟ۠, eؓؕۧ, eؘؘۨ, eؗؕ۠, eٔٓؐ, eَؙٙ] */
    /* JADX WARN: Type inference failed for: r3v103, types: [eٖٟ۠, eۗۜ, eٔٓؐ] */
    /* JADX WARN: Type inference failed for: r3v105, types: [eٖٟ۠, eًْۗ, eۗۜ, eٔٓؐ] */
    /* JADX WARN: Type inference failed for: r3v18, types: [eٖٟ۠, eؓؕۧ, eؗؕ۠, eٔٓؐ, eؘٕۜ, eَؙٙ] */
    /* JADX WARN: Type inference failed for: r3v29, types: [eٖٟ۠, eؓؕۧ, eؙؖ٘, eؗؕ۠, eٔٓؐ, eَؙٙ] */
    /* JADX WARN: Type inference failed for: r3v41, types: [eٖٟ۠, eؓؕۧ, eؗؕ۠, eٗۚۗ, eٔٓؐ, eَؙٙ] */
    /* JADX WARN: Type inference failed for: r3v89, types: [eٖٟ۠, eؓؕۧ, eًٛ, eؗؕ۠, eٔٓؐ, eَؙٙ] */
    /* JADX WARN: Type inference failed for: r3v90, types: [eٖٟ۠, eؓؕۧ, eًٛ, eؗؕ۠, eٔٓؐ, eَؙٙ] */
    /* renamed from: class, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2943class(java.lang.String r17, java.lang.String r18, java.lang.String r19, org.xml.sax.Attributes r20) {
        /*
            Method dump skipped, instructions count: 3076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10913e.m2943class(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void firebase() {
        C0912e c0912e = new C0912e(2);
        c0912e.f3332e = null;
        c0912e.f3331e = new C1720e(0);
        c0912e.f3333e = new HashMap();
        this.ad = c0912e;
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m2944goto(char[] cArr, int i, int i2) {
        if (this.metrica) {
            return;
        }
        if (this.appmetrica) {
            if (this.billing == null) {
                this.billing = new StringBuilder(i2);
            }
            this.billing.append(cArr, i, i2);
        } else if (this.yandex) {
            if (this.startapp == null) {
                this.startapp = new StringBuilder(i2);
            }
            this.startapp.append(cArr, i, i2);
        } else if (this.vip instanceof AbstractC2781e) {
            ad(new String(cArr, i, i2));
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m2945interface(String str) {
        if (this.metrica) {
            return;
        }
        if (this.appmetrica) {
            if (this.billing == null) {
                this.billing = new StringBuilder(str.length());
            }
            this.billing.append(str);
        } else if (this.yandex) {
            if (this.startapp == null) {
                this.startapp = new StringBuilder(str.length());
            }
            this.startapp.append(str);
        } else if (this.vip instanceof AbstractC2781e) {
            ad(str);
        }
    }

    public final void metrica(String str, String str2, String str3) {
        if (this.metrica) {
            int i = this.license - 1;
            this.license = i;
            if (i == 0) {
                this.metrica = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || BuildConfig.FLAVOR.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            EnumC16334e enumC16334e = (EnumC16334e) EnumC16334e.f32095e.get(str2);
            if (enumC16334e == null) {
                enumC16334e = EnumC16334e.f32098e;
            }
            switch (enumC16334e.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                case 20:
                case 22:
                case 23:
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                    this.vip = ((AbstractC16408e) this.vip).vip;
                    return;
                case 1:
                case 2:
                case 6:
                case 9:
                case 13:
                case 15:
                case 16:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                default:
                    return;
                case 5:
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    this.appmetrica = false;
                    if (this.billing != null) {
                        EnumC16334e enumC16334e2 = this.purchase;
                        if (enumC16334e2 == EnumC16334e.f32096e) {
                            this.ad.getClass();
                        } else if (enumC16334e2 == EnumC16334e.f32099e) {
                            this.ad.getClass();
                        }
                        this.billing.setLength(0);
                        return;
                    }
                    return;
                case 21:
                    StringBuilder sb = this.startapp;
                    if (sb != null) {
                        this.yandex = false;
                        String sb2 = sb.toString();
                        crashlytics crashlyticsVar = new crashlytics(1, 3);
                        C0912e c0912e = this.ad;
                        C6095e c6095e = new C6095e(sb2);
                        c6095e.m2694finally();
                        ((C1720e) c0912e.f3331e).vip(crashlyticsVar.subscription(c6095e));
                        this.startapp.setLength(0);
                        return;
                    }
                    return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [org.xml.sax.Attributes, java.lang.Object, eًؕ۠] */
    public final void premium(InputStream inputStream) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                ?? obj = new Object();
                obj.ad = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        firebase();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        C9831e c9831e = new C9831e(newPullParser.getText());
                        String m2677catch = c9831e.m2677catch();
                        isPro(c9831e);
                        m2677catch.equals("xml-stylesheet");
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            m2943class(newPullParser.getNamespace(), newPullParser.getName(), name, obj);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            metrica(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            m2944goto(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            m2945interface(newPullParser.getText());
                        }
                    } else if (((C5550e) this.ad.f3332e) == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            ads(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
            } catch (XmlPullParserException e) {
                throw new SAXException("XML parser problem", e);
            }
        } catch (IOException e2) {
            throw new SAXException("Stream error", e2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x009c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eٖٟ۠, eؓؕۧ, eؗؕ۠, eٔٓؐ, eَؙٙ, eٌؚ٘] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void subs(org.xml.sax.Attributes r25) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10913e.subs(org.xml.sax.Attributes):void");
    }
}
