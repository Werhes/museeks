package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* renamed from: eٖۥَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16624e extends Cextends {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Boolean f32578e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final Boolean f32579e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Hashtable f32580e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f32581e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Ccatch f32584e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f32586e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Vector f32585e = new Vector();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Vector f32583e = new Vector();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Vector f32582e = new Vector();

    static {
        Ctry ctry = new Ctry("2.5.4.6");
        Ctry ctry2 = new Ctry("2.5.4.10");
        Ctry ctry3 = new Ctry("2.5.4.11");
        Ctry ctry4 = new Ctry("2.5.4.12");
        Ctry ctry5 = new Ctry("2.5.4.3");
        Ctry ctry6 = new Ctry("2.5.4.5");
        Ctry ctry7 = new Ctry("2.5.4.9");
        Ctry ctry8 = new Ctry("2.5.4.7");
        Ctry ctry9 = new Ctry("2.5.4.8");
        Ctry ctry10 = new Ctry("2.5.4.4");
        Ctry ctry11 = new Ctry("2.5.4.42");
        Ctry ctry12 = new Ctry("2.5.4.43");
        Ctry ctry13 = new Ctry("2.5.4.44");
        Ctry ctry14 = new Ctry("2.5.4.45");
        Ctry ctry15 = new Ctry("2.5.4.15");
        Ctry ctry16 = new Ctry("2.5.4.17");
        Ctry ctry17 = new Ctry("2.5.4.46");
        Ctry ctry18 = new Ctry("2.5.4.65");
        Ctry ctry19 = new Ctry("1.3.6.1.5.5.7.9.1");
        Ctry ctry20 = new Ctry("1.3.6.1.5.5.7.9.2");
        Ctry ctry21 = new Ctry("1.3.6.1.5.5.7.9.3");
        Ctry ctry22 = new Ctry("1.3.6.1.5.5.7.9.4");
        Ctry ctry23 = new Ctry("1.3.6.1.5.5.7.9.5");
        Ctry ctry24 = new Ctry("1.3.36.8.3.14");
        Ctry ctry25 = new Ctry("2.5.4.16");
        new Ctry("2.5.4.54");
        Ctry ctry26 = InterfaceC2796e.f6745e;
        Ctry ctry27 = InterfaceC2796e.f6747e;
        Ctry ctry28 = InterfaceC5051e.f10790e;
        Ctry ctry29 = InterfaceC5051e.f10807e;
        Ctry ctry30 = InterfaceC5051e.f10800e;
        Ctry ctry31 = new Ctry("0.9.2342.19200300.100.1.25");
        Ctry ctry32 = new Ctry("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        f32580e = hashtable;
        Hashtable hashtable2 = new Hashtable();
        Hashtable hashtable3 = new Hashtable();
        Hashtable hashtable4 = new Hashtable();
        f32578e = new Boolean(true);
        f32579e = new Boolean(false);
        hashtable.put(ctry, "C");
        hashtable.put(ctry2, "O");
        hashtable.put(ctry4, "T");
        hashtable.put(ctry3, "OU");
        hashtable.put(ctry5, "CN");
        hashtable.put(ctry8, "L");
        hashtable.put(ctry9, "ST");
        hashtable.put(ctry6, "SERIALNUMBER");
        hashtable.put(ctry28, "E");
        hashtable.put(ctry31, "DC");
        hashtable.put(ctry32, "UID");
        hashtable.put(ctry7, "STREET");
        hashtable.put(ctry10, "SURNAME");
        hashtable.put(ctry11, "GIVENNAME");
        hashtable.put(ctry12, "INITIALS");
        hashtable.put(ctry13, "GENERATION");
        hashtable.put(ctry30, "unstructuredAddress");
        hashtable.put(ctry29, "unstructuredName");
        hashtable.put(ctry14, "UniqueIdentifier");
        hashtable.put(ctry17, "DN");
        hashtable.put(ctry18, "Pseudonym");
        hashtable.put(ctry25, "PostalAddress");
        hashtable.put(ctry24, "NameAtBirth");
        hashtable.put(ctry22, "CountryOfCitizenship");
        hashtable.put(ctry23, "CountryOfResidence");
        hashtable.put(ctry21, "Gender");
        hashtable.put(ctry20, "PlaceOfBirth");
        hashtable.put(ctry19, "DateOfBirth");
        hashtable.put(ctry16, "PostalCode");
        hashtable.put(ctry15, "BusinessCategory");
        hashtable.put(ctry26, "TelephoneNumber");
        hashtable.put(ctry27, "Name");
        hashtable2.put(ctry, "C");
        hashtable2.put(ctry2, "O");
        hashtable2.put(ctry3, "OU");
        hashtable2.put(ctry5, "CN");
        hashtable2.put(ctry8, "L");
        hashtable2.put(ctry9, "ST");
        hashtable2.put(ctry7, "STREET");
        hashtable2.put(ctry31, "DC");
        hashtable2.put(ctry32, "UID");
        hashtable3.put(ctry, "C");
        hashtable3.put(ctry2, "O");
        hashtable3.put(ctry3, "OU");
        hashtable3.put(ctry5, "CN");
        hashtable3.put(ctry8, "L");
        hashtable3.put(ctry9, "ST");
        hashtable3.put(ctry7, "STREET");
        hashtable4.put("c", ctry);
        hashtable4.put("o", ctry2);
        hashtable4.put("t", ctry4);
        hashtable4.put("ou", ctry3);
        hashtable4.put("cn", ctry5);
        hashtable4.put("l", ctry8);
        hashtable4.put("st", ctry9);
        hashtable4.put("sn", ctry6);
        hashtable4.put("serialnumber", ctry6);
        hashtable4.put("street", ctry7);
        hashtable4.put("emailaddress", ctry28);
        hashtable4.put("dc", ctry31);
        hashtable4.put("e", ctry28);
        hashtable4.put("uid", ctry32);
        hashtable4.put("surname", ctry10);
        hashtable4.put("givenname", ctry11);
        hashtable4.put("initials", ctry12);
        hashtable4.put("generation", ctry13);
        hashtable4.put("unstructuredaddress", ctry30);
        hashtable4.put("unstructuredname", ctry29);
        hashtable4.put("uniqueidentifier", ctry14);
        hashtable4.put("dn", ctry17);
        hashtable4.put("pseudonym", ctry18);
        hashtable4.put("postaladdress", ctry25);
        hashtable4.put("nameofbirth", ctry24);
        hashtable4.put("countryofcitizenship", ctry22);
        hashtable4.put("countryofresidence", ctry23);
        hashtable4.put("gender", ctry21);
        hashtable4.put("placeofbirth", ctry20);
        hashtable4.put("dateofbirth", ctry19);
        hashtable4.put("postalcode", ctry16);
        hashtable4.put("businesscategory", ctry15);
        hashtable4.put("telephonenumber", ctry26);
        hashtable4.put("name", ctry27);
    }

    public C16624e(Ccatch ccatch) {
        Vector vector;
        this.f32584e = ccatch;
        Enumeration mo170goto = ccatch.mo170goto();
        while (mo170goto.hasMoreElements()) {
            Cfinal crashlytics = Cfinal.crashlytics(((subs) mo170goto.nextElement()).billing());
            int i = 0;
            while (true) {
                subs[] subsVarArr = crashlytics.f36388e;
                if (i < subsVarArr.length) {
                    Ccatch m168class = Ccatch.m168class(subsVarArr[i].billing());
                    if (m168class.size() != 2) {
                        throw new IllegalArgumentException("badly sized pair");
                    }
                    this.f32585e.addElement(Ctry.m4669interface(m168class.mo171interface(0)));
                    subs mo171interface = m168class.mo171interface(1);
                    if (!(mo171interface instanceof Cnew) || (mo171interface instanceof C12180e)) {
                        try {
                            Vector vector2 = this.f32583e;
                            StringBuilder sb = new StringBuilder();
                            sb.append("#");
                            byte[] smaato = mo171interface.billing().smaato();
                            C2873e c2873e = AbstractC7240e.ad;
                            byte[] license = AbstractC7240e.license(0, smaato.length, smaato);
                            int length = license.length;
                            char[] cArr = new char[length];
                            for (int i2 = 0; i2 != length; i2++) {
                                cArr[i2] = (char) (license[i2] & 255);
                            }
                            sb.append(new String(cArr));
                            vector2.addElement(sb.toString());
                        } catch (IOException unused) {
                            throw new IllegalArgumentException("cannot encode value");
                        }
                    } else {
                        String yandex = ((Cnew) mo171interface).yandex();
                        if (yandex.length() <= 0 || yandex.charAt(0) != '#') {
                            vector = this.f32583e;
                        } else {
                            vector = this.f32583e;
                            yandex = "\\".concat(yandex);
                        }
                        vector.addElement(yandex);
                    }
                    this.f32582e.addElement(i != 0 ? f32578e : f32579e);
                    i++;
                }
            }
        }
    }

    public static String Signature(String str) {
        String license = AbstractC1433e.license(str.trim());
        if (license.length() > 0 && license.charAt(0) == '#') {
            try {
                subs inmobi = Cdefault.inmobi(AbstractC7240e.vip(license.length() - 1, license));
                if (inmobi instanceof Cnew) {
                    return AbstractC1433e.license(((Cnew) inmobi).yandex().trim());
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: " + e);
            }
        }
        return license;
    }

    public static C16624e admob(Object obj) {
        if (obj instanceof C16624e) {
            return (C16624e) obj;
        }
        if (obj instanceof C15466e) {
            return new C16624e(Ccatch.m168class(((C15466e) obj).f30555e));
        }
        if (obj != null) {
            return new C16624e(Ccatch.m168class(obj));
        }
        return null;
    }

    public static void loadAd(StringBuffer stringBuffer, Hashtable hashtable, Ctry ctry, String str) {
        String str2 = (String) hashtable.get(ctry);
        if (str2 == null) {
            str2 = ctry.m4673class();
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (length <= length2) {
            char charAt = stringBuffer.charAt(length);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        continue;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    public static String subscription(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [subs, final, eْٚٛ] */
    /* JADX WARN: Type inference failed for: r2v3, types: [catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        if (this.f32584e == null) {
            crashlytics crashlyticsVar = new crashlytics((byte) 0, 0);
            crashlytics crashlyticsVar2 = new crashlytics((byte) 0, 0);
            Vector vector = this.f32585e;
            if (vector.size() != 0) {
                throw null;
            }
            ?? cfinal = new Cfinal(crashlyticsVar2, true);
            cfinal.f26600e = -1;
            crashlyticsVar.appmetrica(cfinal);
            ?? ccatch = new Ccatch(crashlyticsVar);
            ccatch.f20096e = -1;
            this.f32584e = ccatch;
        }
        return this.f32584e;
    }

    @Override // defpackage.Cextends
    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        if (obj != this) {
            if ((obj instanceof C16624e) || (obj instanceof Ccatch)) {
                if (!billing().isVip(((subs) obj).billing())) {
                    try {
                        C16624e admob = admob(obj);
                        Vector vector = this.f32585e;
                        int size = vector.size();
                        Vector vector2 = admob.f32585e;
                        if (size == vector2.size()) {
                            if (size != 0) {
                                boolean[] zArr = new boolean[size];
                                if (vector.elementAt(0).equals(vector2.elementAt(0))) {
                                    i3 = 1;
                                    i = 0;
                                    i2 = size;
                                } else {
                                    i = size - 1;
                                    i2 = -1;
                                    i3 = -1;
                                }
                                while (i != i2) {
                                    Ctry ctry = (Ctry) vector.elementAt(i);
                                    String str = (String) this.f32583e.elementAt(i);
                                    for (int i4 = 0; i4 < size; i4++) {
                                        if (!zArr[i4] && ctry.isVip((Ctry) vector2.elementAt(i4))) {
                                            String str2 = (String) admob.f32583e.elementAt(i4);
                                            String Signature = Signature(str);
                                            String Signature2 = Signature(str2);
                                            if (Signature.equals(Signature2) || subscription(Signature).equals(subscription(Signature2))) {
                                                zArr[i4] = true;
                                                i += i3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.Cextends
    public final int hashCode() {
        if (this.f32581e) {
            return this.f32586e;
        }
        this.f32581e = true;
        int i = 0;
        while (true) {
            Vector vector = this.f32585e;
            if (i == vector.size()) {
                return this.f32586e;
            }
            String subscription = subscription(Signature((String) this.f32583e.elementAt(i)));
            int hashCode = vector.elementAt(i).hashCode() ^ this.f32586e;
            this.f32586e = hashCode;
            this.f32586e = hashCode ^ subscription.hashCode();
            i++;
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        int i = 0;
        while (true) {
            Vector vector2 = this.f32585e;
            if (i >= vector2.size()) {
                break;
            }
            boolean booleanValue = ((Boolean) this.f32582e.elementAt(i)).booleanValue();
            Hashtable hashtable = f32580e;
            Vector vector3 = this.f32583e;
            if (booleanValue) {
                stringBuffer2.append('+');
                loadAd(stringBuffer2, hashtable, (Ctry) vector2.elementAt(i), (String) vector3.elementAt(i));
            } else {
                stringBuffer2 = new StringBuffer();
                loadAd(stringBuffer2, hashtable, (Ctry) vector2.elementAt(i), (String) vector3.elementAt(i));
                vector.addElement(stringBuffer2);
            }
            i++;
        }
        boolean z = true;
        for (int i2 = 0; i2 < vector.size(); i2++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            stringBuffer.append(vector.elementAt(i2).toString());
        }
        return stringBuffer.toString();
    }
}
