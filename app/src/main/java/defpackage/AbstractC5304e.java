package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import org.conscrypt.BuildConfig;

/* renamed from: eؗۧۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5304e extends AbstractC6507e {
    /* renamed from: abstract, reason: not valid java name */
    public static String m1850abstract(int i, String str) {
        CharSequence charSequence;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static String ads(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return m1860finally(length, str);
    }

    public static String applovin(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    /* renamed from: break, reason: not valid java name */
    public static String m1851break(int i, String str) {
        CharSequence charSequence;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequence = sb;
        }
        return charSequence.toString();
    }

    /* renamed from: case, reason: not valid java name */
    public static String m1852case(String str, String str2) {
        return m1863import(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* renamed from: catch, reason: not valid java name */
    public static String m1853catch(String str, String str2) {
        return subs(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* renamed from: class, reason: not valid java name */
    public static final int m1854class(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C11241e c11241e;
        CharSequence charSequence3 = charSequence2;
        int i3 = i;
        int i4 = i2;
        if (z2) {
            int crashlytics = crashlytics(charSequence);
            if (i3 > crashlytics) {
                i3 = crashlytics;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            c11241e = new C11241e(i3, i4, -1);
        } else {
            if (i3 < 0) {
                i3 = 0;
            }
            int length = charSequence.length();
            if (i4 > length) {
                i4 = length;
            }
            c11241e = new C11241e(i3, i4, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i5 = c11241e.f22521e;
        int i6 = c11241e.f22522e;
        int i7 = c11241e.f22523e;
        if (z3 && (charSequence3 instanceof String)) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                int i8 = i7;
                while (true) {
                    String str = (String) charSequence3;
                    String str2 = (String) charSequence;
                    int length2 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i8, length2) : str.regionMatches(z, 0, str2, i8, length2))) {
                        if (i8 == i6) {
                            break;
                        }
                        i8 += i5;
                    } else {
                        return i8;
                    }
                }
            }
        } else if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            int i9 = i7;
            while (!m1862implements(charSequence3, 0, charSequence, i9, charSequence3.length(), z)) {
                if (i9 != i6) {
                    i9 += i5;
                    charSequence3 = charSequence2;
                }
            }
            return i9;
        }
        return -1;
    }

    /* renamed from: const, reason: not valid java name */
    public static CharSequence m1855const(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean license = AbstractC15211e.license(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!license) {
                    break;
                }
                length--;
            } else if (license) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static int crashlytics(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    /* renamed from: default, reason: not valid java name */
    public static C15453e m1856default(CharSequence charSequence, String[] strArr, int i) {
        m1867new(i);
        return new C15453e(charSequence, i, new C2409e(1, Arrays.asList(strArr)), 0);
    }

    /* renamed from: else, reason: not valid java name */
    public static String m1857else(String str, char c) {
        int m1865interface = m1865interface(str, c, 0, 6);
        return m1865interface == -1 ? str : str.substring(0, m1865interface);
    }

    /* renamed from: extends, reason: not valid java name */
    public static char m1858extends(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(crashlytics(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: final, reason: not valid java name */
    public static String m1859final(String str) {
        return (str.length() >= 2 && m1863import(str, "\"", false) && subs(str, "\"")) ? AbstractC5087e.m1752this(1, 1, str) : str;
    }

    /* renamed from: finally, reason: not valid java name */
    public static String m1860finally(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static final int firebase(CharSequence charSequence, String str, int i, boolean z) {
        return (z || !(charSequence instanceof String)) ? m1854class(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    /* renamed from: goto, reason: not valid java name */
    public static /* synthetic */ int m1861goto(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return firebase(charSequence, str, i, z);
    }

    /* renamed from: implements, reason: not valid java name */
    public static final boolean m1862implements(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC15211e.vip(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: import, reason: not valid java name */
    public static boolean m1863import(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? AbstractC6507e.pro((String) charSequence, (String) charSequence2, false) : m1862implements(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static boolean inmobi(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence2 instanceof String) {
            if (m1861goto(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m1854class(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: instanceof, reason: not valid java name */
    public static boolean m1864instanceof(String str, char c) {
        return str.length() > 0 && AbstractC15211e.vip(str.charAt(0), c, false);
    }

    /* renamed from: interface, reason: not valid java name */
    public static int m1865interface(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return !(charSequence instanceof String) ? m1877this(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static boolean isPro(CharSequence charSequence, char c) {
        return m1865interface(charSequence, c, 0, 2) >= 0;
    }

    public static ArrayList isVip(int i, String str) {
        AbstractC9180e.license(i, i);
        int length = str.length();
        int i2 = 0;
        ArrayList arrayList = new ArrayList((length / i) + (length % i == 0 ? 0 : 1));
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + i;
            arrayList.add(str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3).toString());
            i2 = i3;
        }
        return arrayList;
    }

    /* renamed from: native, reason: not valid java name */
    public static boolean m1866native(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC15211e.license(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: new, reason: not valid java name */
    public static final void m1867new(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Limit must be non-negative, but was ").toString());
        }
    }

    /* renamed from: package, reason: not valid java name */
    public static List m1868package(String str, char[] cArr) {
        int i = 0;
        if (cArr.length == 1) {
            return m1873strictfp(String.valueOf(cArr[0]), str, 0);
        }
        m1867new(0);
        C15453e<C15926e> c15453e = new C15453e(str, i, new C3450e(14, cArr), 0);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(new C8950e(2, c15453e), 10));
        for (C15926e c15926e : c15453e) {
            arrayList.add(str.subSequence(c15926e.f22523e, c15926e.f22522e + 1).toString());
        }
        return arrayList;
    }

    public static boolean premium(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && AbstractC15211e.vip(charSequence.charAt(crashlytics(charSequence)), c, false);
    }

    /* renamed from: private, reason: not valid java name */
    public static List m1869private(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m1873strictfp(str, charSequence, i2);
            }
        }
        C15453e<C15926e> m1856default = m1856default(charSequence, strArr, i2);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(new C8950e(2, m1856default), 10));
        for (C15926e c15926e : m1856default) {
            arrayList.add(charSequence.subSequence(c15926e.f22523e, c15926e.f22522e + 1).toString());
        }
        return arrayList;
    }

    /* renamed from: protected, reason: not valid java name */
    public static List m1870protected(String str) {
        C18504e c18504e = new C18504e(str);
        if (!c18504e.hasNext()) {
            return C13664e.f27089e;
        }
        Object next = c18504e.next();
        if (!c18504e.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c18504e.hasNext()) {
            arrayList.add(c18504e.next());
        }
        return arrayList;
    }

    /* renamed from: return, reason: not valid java name */
    public static String m1871return(String str) {
        int m1878throw = m1878throw(0, 6, str, ".");
        return m1878throw == -1 ? str : str.substring(1 + m1878throw, str.length());
    }

    /* renamed from: static, reason: not valid java name */
    public static String m1872static(String str, String str2) {
        int m1861goto = m1861goto(str, str2, 0, false, 6);
        return m1861goto == -1 ? str : str.substring(str2.length() + m1861goto, str.length());
    }

    /* renamed from: strictfp, reason: not valid java name */
    public static final List m1873strictfp(String str, CharSequence charSequence, int i) {
        m1867new(i);
        int firebase = firebase(charSequence, str, 0, false);
        if (firebase == -1 || i == 1) {
            return Collections.singletonList(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, firebase).toString());
            i3 = str.length() + firebase;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            firebase = firebase(charSequence, str, i3, false);
        } while (firebase != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean subs(CharSequence charSequence, String str) {
        return charSequence instanceof String ? AbstractC6507e.amazon((String) charSequence, str, false) : m1862implements(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* renamed from: super, reason: not valid java name */
    public static StringBuilder m1874super(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC8647e.inmobi(i2, i, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    /* renamed from: switch, reason: not valid java name */
    public static String m1875switch(String str, String str2) {
        int m1861goto = m1861goto(str, str2, 0, false, 6);
        return m1861goto == -1 ? str : str.substring(0, m1861goto);
    }

    /* renamed from: synchronized, reason: not valid java name */
    public static String m1876synchronized(char c, String str, String str2) {
        int m1883while = m1883while(str, c, 0, 6);
        return m1883while == -1 ? str2 : str.substring(m1883while + 1, str.length());
    }

    /* renamed from: this, reason: not valid java name */
    public static final int m1877this(CharSequence charSequence, char[] cArr, int i, boolean z) {
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int crashlytics = crashlytics(charSequence);
        if (i > crashlytics) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC15211e.vip(c, charAt, z)) {
                    return i;
                }
            }
            if (i == crashlytics) {
                return -1;
            }
            i++;
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public static int m1878throw(int i, int i2, String str, String str2) {
        if ((i2 & 2) != 0) {
            i = crashlytics(str);
        }
        int i3 = i;
        return !AbstractC0869e.premium(str) ? m1854class(str, str2, i3, 0, false, true) : str.lastIndexOf(str2, i3);
    }

    /* renamed from: throws, reason: not valid java name */
    public static String m1879throws(String str, char c) {
        int m1883while = m1883while(str, c, 0, 6);
        return m1883while == -1 ? str : str.substring(0, m1883while);
    }

    /* renamed from: transient, reason: not valid java name */
    public static C2167e m1880transient(String str, String[] strArr) {
        return new C2167e(m1856default(str, strArr, 0), new C17955e(5, str));
    }

    /* renamed from: try, reason: not valid java name */
    public static final int m1881try(CharSequence charSequence, char[] cArr, int i) {
        if (cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).lastIndexOf(cArr[0], i);
        }
        int crashlytics = crashlytics(charSequence);
        if (i > crashlytics) {
            i = crashlytics;
        }
        while (-1 < i) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC15211e.vip(c, charAt, false)) {
                    return i;
                }
            }
            i--;
        }
        return -1;
    }

    /* renamed from: volatile, reason: not valid java name */
    public static CharSequence m1882volatile(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return BuildConfig.FLAVOR;
        }
        while (true) {
            int i = length - 1;
            if (!AbstractC15211e.license(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i < 0) {
                return BuildConfig.FLAVOR;
            }
            length = i;
        }
    }

    /* renamed from: while, reason: not valid java name */
    public static int m1883while(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = crashlytics(str);
        }
        return !AbstractC0869e.premium(str) ? m1881try(str, new char[]{c}, i) : str.lastIndexOf(c, i);
    }
}
