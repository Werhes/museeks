package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6095e extends C9831e {
    public C6095e(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", BuildConfig.FLAVOR));
    }

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public static int m2018e(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final String m2019e() {
        int m2018e;
        if (premium()) {
            return null;
        }
        char charAt = ((String) this.license).charAt(this.vip);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.vip++;
        int intValue = m2674abstract().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = m2674abstract().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = m2674abstract().intValue();
                    } else {
                        int m2018e2 = m2018e(intValue);
                        if (m2018e2 != -1) {
                            for (int i = 1; i <= 5 && (m2018e = m2018e((intValue = m2674abstract().intValue()))) != -1; i++) {
                                m2018e2 = (m2018e2 * 16) + m2018e;
                            }
                            sb.append((char) m2018e2);
                        }
                    }
                }
            }
            sb.append((char) intValue);
            intValue = m2674abstract().intValue();
        }
        return sb.toString();
    }

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public final String m2020e() {
        int i;
        int i2;
        String str = (String) this.license;
        if (premium()) {
            i2 = this.vip;
        } else {
            int i3 = this.vip;
            int charAt = str.charAt(i3);
            if (charAt == 45) {
                charAt = startapp();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i3;
            } else {
                int startapp = startapp();
                while (true) {
                    if ((startapp < 65 || startapp > 90) && ((startapp < 97 || startapp > 122) && !((startapp >= 48 && startapp <= 57) || startapp == 45 || startapp == 95))) {
                        break;
                    }
                    startapp = startapp();
                }
                i = this.vip;
            }
            this.vip = i3;
            i2 = i;
        }
        int i4 = this.vip;
        if (i2 == i4) {
            return null;
        }
        String substring = str.substring(i4, i2);
        this.vip = i2;
        return substring;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public final java.util.ArrayList m2021e() {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6095e.m2021e():java.util.ArrayList");
    }
}
