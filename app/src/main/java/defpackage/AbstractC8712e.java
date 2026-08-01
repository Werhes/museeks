package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕۗ */
/* loaded from: classes3.dex */
public abstract class AbstractC8712e {
    public final /* synthetic */ int ad = 0;
    public Object appmetrica;
    public Object license;
    public final Object metrica;
    public int vip;

    public AbstractC8712e() {
        Csuper csuper = new Csuper((char) 0, 14);
        csuper.f36469e = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        csuper.f36471e = iArr;
        csuper.f36470e = -1;
        this.metrica = csuper;
        this.appmetrica = new StringBuilder();
    }

    public AbstractC8712e(InterfaceC12321e interfaceC12321e, InterfaceC4777e interfaceC4777e, long j, long j2, long j3, long j4, long j5, int i) {
        this.license = interfaceC4777e;
        this.vip = i;
        this.metrica = new C2769e(interfaceC12321e, j, j2, j3, j4, j5);
    }

    public static /* synthetic */ void admob(AbstractC8712e abstractC8712e, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractC8712e.vip;
        }
        if ((i2 & 4) != 0) {
            str2 = BuildConfig.FLAVOR;
        }
        abstractC8712e.Signature(str, i, str2);
        throw null;
    }

    public static int applovin(InterfaceC2283e interfaceC2283e, long j, C14829e c14829e) {
        if (j == interfaceC2283e.getPosition()) {
            return 0;
        }
        c14829e.f29362e = j;
        return 1;
    }

    public static boolean signatures(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public void Signature(String str, int i, String str2) {
        String concat = str2.length() == 0 ? BuildConfig.FLAVOR : "\n".concat(str2);
        StringBuilder isPro = AbstractC8703e.isPro(str, " at path: ");
        isPro.append(((Csuper) this.metrica).crashlytics());
        isPro.append(concat);
        throw AbstractC3421e.appmetrica(isPro.toString(), remoteconfig(), i);
    }

    public int ad(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.appmetrica).append((char) (subscription(charSequence, i + 3) + (subscription(charSequence, i) << 12) + (subscription(charSequence, i + 1) << 8) + (subscription(charSequence, i + 2) << 4)));
            return i2;
        }
        this.vip = i;
        amazon();
        if (this.vip + 4 < charSequence.length()) {
            return ad(charSequence, this.vip);
        }
        admob(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public String adcel() {
        String str = (String) this.license;
        if (str == null) {
            return appmetrica();
        }
        this.license = null;
        return str;
    }

    public void ads(long j) {
        C17909e c17909e = (C17909e) this.appmetrica;
        if (c17909e == null || c17909e.ad != j) {
            C2769e c2769e = (C2769e) this.metrica;
            this.appmetrica = new C17909e(j, c2769e.ad.purchase(j), c2769e.metrica, c2769e.license, c2769e.appmetrica, c2769e.purchase);
        }
    }

    public String advert() {
        String str;
        StringBuilder sb = (StringBuilder) this.appmetrica;
        String str2 = (String) this.license;
        if (str2 != null) {
            this.license = null;
            return str2;
        }
        int premium = premium();
        if (premium >= remoteconfig().length() || premium == -1) {
            admob(this, "EOF", premium, null, 4);
            throw null;
        }
        byte vip = AbstractC7700e.vip(remoteconfig().charAt(premium));
        if (vip == 1) {
            return adcel();
        }
        if (vip != 0) {
            admob(this, "Expected beginning of the string, but got " + remoteconfig().charAt(premium), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC7700e.vip(remoteconfig().charAt(premium)) == 0) {
            premium++;
            if (premium >= remoteconfig().length()) {
                vip(this.vip, premium);
                int isPro = isPro(premium);
                if (isPro == -1) {
                    this.vip = premium;
                    vip(0, 0);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    return sb2;
                }
                premium = isPro;
                z = true;
            }
        }
        if (z) {
            vip(this.vip, premium);
            String sb3 = sb.toString();
            sb.setLength(0);
            str = sb3;
        } else {
            str = subs(this.vip, premium);
        }
        this.vip = premium;
        return str;
    }

    public void amazon() {
    }

    public abstract String appmetrica();

    public byte billing(byte b) {
        byte purchase = purchase();
        if (purchase == b) {
            return purchase;
        }
        String appmetrica = AbstractC7700e.appmetrica(b);
        int i = this.vip;
        int i2 = i - 1;
        admob(this, AbstractC17861e.subscription("Expected ", appmetrica, ", but had '", (i == remoteconfig().length() || i2 < 0) ? "EOF" : String.valueOf(remoteconfig().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    /* renamed from: class */
    public void m2471class(char c) {
        int i = this.vip;
        if (i > 0 && c == '\"') {
            try {
                this.vip = i - 1;
                String advert = advert();
                this.vip = i;
                if (AbstractC7890e.billing(advert, "null")) {
                    Signature("Expected string literal but 'null' literal was found", this.vip - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.vip = i;
                throw th;
            }
        }
        String appmetrica = AbstractC7700e.appmetrica(AbstractC7700e.vip(c));
        int i2 = this.vip;
        int i3 = i2 - 1;
        admob(this, AbstractC17861e.subscription("Expected ", appmetrica, ", but had '", (i2 == remoteconfig().length() || i3 < 0) ? "EOF" : String.valueOf(remoteconfig().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public boolean crashlytics() {
        int premium = premium();
        CharSequence remoteconfig = remoteconfig();
        if (premium >= remoteconfig.length() || premium == -1 || remoteconfig.charAt(premium) != ',') {
            return false;
        }
        this.vip++;
        return true;
    }

    public boolean firebase(boolean z) {
        int isPro = isPro(premium());
        int length = remoteconfig().length() - isPro;
        if (length >= 4 && isPro != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != remoteconfig().charAt(isPro + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || AbstractC7700e.vip(remoteconfig().charAt(isPro + 4)) != 0) {
                    if (z) {
                        this.vip = isPro + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public String inmobi(boolean z) {
        String adcel;
        byte isVip = isVip();
        if (z) {
            if (isVip != 1 && isVip != 0) {
                return null;
            }
            adcel = advert();
        } else {
            if (isVip != 1) {
                return null;
            }
            adcel = adcel();
        }
        this.license = adcel;
        return adcel;
    }

    public abstract int isPro(int i);

    public byte isVip() {
        CharSequence remoteconfig = remoteconfig();
        int i = this.vip;
        while (true) {
            int isPro = isPro(i);
            if (isPro == -1) {
                this.vip = isPro;
                return (byte) 10;
            }
            char charAt = remoteconfig.charAt(isPro);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.vip = isPro;
                return AbstractC7700e.vip(charAt);
            }
            i = isPro + 1;
        }
    }

    public void license(int i, String str) {
        if (remoteconfig().length() - i < str.length()) {
            admob(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (remoteconfig().charAt(i + i2) | ' ')) {
                admob(this, "Expected valid boolean literal prefix, but had '" + advert() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.vip = str.length() + i;
    }

    public void loadAd() {
        if (purchase() == 10) {
            return;
        }
        admob(this, "Expected EOF after parsing, but had " + remoteconfig().charAt(this.vip - 1) + " instead", 0, null, 6);
        throw null;
    }

    public abstract boolean metrica();

    public String mopub(int i, int i2, CharSequence charSequence) {
        String sb;
        StringBuilder sb2 = (StringBuilder) this.appmetrica;
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                vip(i, i2);
                int isPro = isPro(i2 + 1);
                if (isPro == -1) {
                    admob(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int i3 = isPro + 1;
                char charAt2 = remoteconfig().charAt(isPro);
                if (charAt2 == 'u') {
                    i3 = ad(remoteconfig(), i3);
                } else {
                    char c = charAt2 < 'u' ? C15413e.ad[charAt2] : (char) 0;
                    if (c == 0) {
                        admob(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb2.append(c);
                }
                i = isPro(i3);
                if (i == -1) {
                    admob(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    vip(i, i2);
                    i = isPro(i2);
                    if (i == -1) {
                        admob(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
        if (z) {
            vip(i, i2);
            sb = sb2.toString();
            sb2.setLength(0);
        } else {
            sb = subs(i, i2);
        }
        this.vip = i2 + 1;
        return sb;
    }

    public abstract int premium();

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        return applovin(r28, r9, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int pro(defpackage.InterfaceC2283e r28, defpackage.C14829e r29) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8712e.pro(eَؔؐ, eٜٔؓ):int");
    }

    public abstract byte purchase();

    public abstract CharSequence remoteconfig();

    public String smaato() {
        String advert = advert();
        if (!AbstractC7890e.billing(advert, "null") || remoteconfig().charAt(this.vip - 1) == '\"') {
            return advert;
        }
        admob(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        admob(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ab, code lost:
    
        admob(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0173, code lost:
    
        if (r8 != 1) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b9, code lost:
    
        throw new defpackage.C14803e(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ba, code lost:
    
        if (r13 == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01bc, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c1, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c4, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c5, code lost:
    
        admob(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cb, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01cc, code lost:
    
        admob(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010e, code lost:
    
        admob(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
    
        if (r11 == r1) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0131, code lost:
    
        if (r1 == r11) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
    
        if (r13 == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013f, code lost:
    
        if (r19 == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
    
        if (r2 == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:
    
        if (remoteconfig().charAt(r11) != '\"') goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        admob(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        admob(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0162, code lost:
    
        r21.vip = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        if (r20 == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0169, code lost:
    
        if (r8 != 0) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long startapp() {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8712e.startapp():long");
    }

    public String subs(int i, int i2) {
        return remoteconfig().subSequence(i, i2).toString();
    }

    public int subscription(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        admob(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract String tapsense(String str, boolean z);

    public String toString() {
        switch (this.ad) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) remoteconfig());
                sb.append("', currentPosition=");
                return AbstractC1786e.pro(sb, this.vip, ')');
            default:
                return super.toString();
        }
    }

    public void vip(int i, int i2) {
        ((StringBuilder) this.appmetrica).append(remoteconfig(), i, i2);
    }

    public abstract void yandex(char c);
}
