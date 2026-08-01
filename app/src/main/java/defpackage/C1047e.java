package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047e extends AbstractC11130e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static C1047e f3526e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static C1047e f3527e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static C1047e f3528e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f3529e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f3530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1047e(int i) {
        super(1);
        this.f3530e = i;
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: const, reason: not valid java name */
    public final int[] mo450const(int i) {
        int i2;
        switch (this.f3530e) {
            case 0:
                String str = (String) this.f22047e;
                if (str == null) {
                    str = null;
                }
                int length = str.length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f3529e;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f3529e;
                        if (breakIterator2 == null) {
                            breakIterator2 = null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return m3033e(i, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f3529e;
                    if (breakIterator3 == null) {
                        breakIterator3 = null;
                    }
                    i = breakIterator3.following(i);
                } while (i != -1);
                return null;
            case 1:
                String str2 = (String) this.f22047e;
                if (str2 == null) {
                    str2 = null;
                }
                if (str2.length() <= 0) {
                    return null;
                }
                String str3 = (String) this.f22047e;
                if (str3 == null) {
                    str3 = null;
                }
                if (i >= str3.length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m451e(i) && (!m451e(i) || (i != 0 && m451e(i - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f3529e;
                    if (breakIterator4 == null) {
                        breakIterator4 = null;
                    }
                    i = breakIterator4.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f3529e;
                if (breakIterator5 == null) {
                    breakIterator5 = null;
                }
                int following2 = breakIterator5.following(i);
                if (following2 == -1 || !m452e(following2)) {
                    return null;
                }
                return m3033e(i, following2);
            default:
                String str4 = (String) this.f22047e;
                if (str4 == null) {
                    str4 = null;
                }
                if (str4.length() <= 0) {
                    return null;
                }
                String str5 = (String) this.f22047e;
                if (str5 == null) {
                    str5 = null;
                }
                if (i >= str5.length()) {
                    return null;
                }
                if (i < 0) {
                    C12476e c12476e = (C12476e) this.f3529e;
                    if (c12476e == null) {
                        c12476e = null;
                    }
                    i2 = c12476e.vip.license(0);
                } else {
                    C12476e c12476e2 = (C12476e) this.f3529e;
                    if (c12476e2 == null) {
                        c12476e2 = null;
                    }
                    int license = c12476e2.vip.license(i);
                    i2 = m455e(license, 2) == i ? license : license + 1;
                }
                C12476e c12476e3 = (C12476e) this.f3529e;
                if (c12476e3 == null) {
                    c12476e3 = null;
                }
                if (i2 >= c12476e3.vip.purchase) {
                    return null;
                }
                return m3033e(m455e(i2, 2), m455e(i2, 1) + 1);
        }
    }

    /* renamed from: eؒٞ٘, reason: contains not printable characters */
    public boolean m451e(int i) {
        if (i < 0) {
            return false;
        }
        String str = (String) this.f22047e;
        if (str == null) {
            str = null;
        }
        if (i >= str.length()) {
            return false;
        }
        String str2 = (String) this.f22047e;
        return Character.isLetterOrDigit((str2 != null ? str2 : null).codePointAt(i));
    }

    /* renamed from: eؚٕؗ, reason: contains not printable characters */
    public boolean m452e(int i) {
        if (i <= 0 || !m451e(i - 1)) {
            return false;
        }
        String str = (String) this.f22047e;
        if (str == null) {
            str = null;
        }
        return i == str.length() || !m451e(i);
    }

    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public void m453e(String str) {
        switch (this.f3530e) {
            case 0:
                this.f22047e = str;
                BreakIterator breakIterator = (BreakIterator) this.f3529e;
                if (breakIterator == null) {
                    breakIterator = null;
                }
                breakIterator.setText(str);
                return;
            default:
                this.f22047e = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f3529e;
                if (breakIterator2 == null) {
                    breakIterator2 = null;
                }
                breakIterator2.setText(str);
                return;
        }
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public final int[] mo454e(int i) {
        int i2;
        switch (this.f3530e) {
            case 0:
                String str = (String) this.f22047e;
                if (str == null) {
                    str = null;
                }
                int length = str.length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f3529e;
                    if (breakIterator == null) {
                        breakIterator = null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f3529e;
                        if (breakIterator2 == null) {
                            breakIterator2 = null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return m3033e(preceding, i);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f3529e;
                    if (breakIterator3 == null) {
                        breakIterator3 = null;
                    }
                    i = breakIterator3.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                String str2 = (String) this.f22047e;
                if (str2 == null) {
                    str2 = null;
                }
                int length2 = str2.length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m451e(i - 1) && !m452e(i)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f3529e;
                    if (breakIterator4 == null) {
                        breakIterator4 = null;
                    }
                    i = breakIterator4.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f3529e;
                if (breakIterator5 == null) {
                    breakIterator5 = null;
                }
                int preceding2 = breakIterator5.preceding(i);
                if (preceding2 == -1 || !m451e(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !m451e(preceding2 - 1)) {
                    return m3033e(preceding2, i);
                }
                return null;
            default:
                String str3 = (String) this.f22047e;
                if (str3 == null) {
                    str3 = null;
                }
                if (str3.length() <= 0 || i <= 0) {
                    return null;
                }
                String str4 = (String) this.f22047e;
                if (str4 == null) {
                    str4 = null;
                }
                if (i > str4.length()) {
                    C12476e c12476e = (C12476e) this.f3529e;
                    if (c12476e == null) {
                        c12476e = null;
                    }
                    String str5 = (String) this.f22047e;
                    if (str5 == null) {
                        str5 = null;
                    }
                    i2 = c12476e.vip.license(str5.length());
                } else {
                    C12476e c12476e2 = (C12476e) this.f3529e;
                    if (c12476e2 == null) {
                        c12476e2 = null;
                    }
                    int license = c12476e2.vip.license(i);
                    i2 = m455e(license, 1) + 1 == i ? license : license - 1;
                }
                if (i2 < 0) {
                    return null;
                }
                return m3033e(m455e(i2, 2), m455e(i2, 1) + 1);
        }
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public int m455e(int i, int i2) {
        C12476e c12476e = (C12476e) this.f3529e;
        if (c12476e == null) {
            c12476e = null;
        }
        int startapp = c12476e.startapp(i);
        C12476e c12476e2 = (C12476e) this.f3529e;
        if (c12476e2 == null) {
            c12476e2 = null;
        }
        if (i2 != c12476e2.adcel(startapp)) {
            C12476e c12476e3 = (C12476e) this.f3529e;
            return (c12476e3 != null ? c12476e3 : null).startapp(i);
        }
        return C12476e.purchase(((C12476e) this.f3529e) != null ? r5 : null, i) - 1;
    }
}
