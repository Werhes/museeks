package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7720e extends AbstractC17080e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C0193e f15662e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C0193e f15663e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C0193e f15664e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC4895e f15665e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public String f15666e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f15667e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f15668e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f15669e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C16151e f15670e;

    static {
        C0193e c0193e = new C0193e("'\\".getBytes(AbstractC5508e.ad));
        c0193e.f1410e = "'\\";
        f15664e = c0193e;
        C0193e c0193e2 = new C0193e("\"\\".getBytes(AbstractC5508e.ad));
        c0193e2.f1410e = "\"\\";
        f15663e = c0193e2;
        C0193e c0193e3 = new C0193e("{}[]:, \n\t\r\f/\\;#=".getBytes(AbstractC5508e.ad));
        c0193e3.f1410e = "{}[]:, \n\t\r\f/\\;#=";
        f15662e = c0193e3;
        new C0193e("\n\r".getBytes(AbstractC5508e.ad)).f1410e = "\n\r";
        new C0193e("*/".getBytes(AbstractC5508e.ad)).f1410e = "*/";
    }

    public C7720e(InterfaceC4895e interfaceC4895e) {
        this.f33419e = new int[32];
        this.f33418e = new String[32];
        this.f33420e = new int[32];
        this.f15669e = 0;
        if (interfaceC4895e == null) {
            throw new NullPointerException("source == null");
        }
        this.f15665e = interfaceC4895e;
        this.f15670e = interfaceC4895e.metrica();
        m4242goto(6);
    }

    public C7720e(C7720e c7720e) {
        this.f33421e = c7720e.f33421e;
        this.f33419e = (int[]) c7720e.f33419e.clone();
        this.f33418e = (String[]) c7720e.f33418e.clone();
        this.f33420e = (int[]) c7720e.f33420e.clone();
        this.f15669e = 0;
        C13197e peek = c7720e.f15665e.peek();
        this.f15665e = peek;
        this.f15670e = peek.f26204e;
        this.f15669e = c7720e.f15669e;
        this.f15667e = c7720e.f15667e;
        this.f15668e = c7720e.f15668e;
        this.f15666e = c7720e.f15666e;
        try {
            peek.admob(c7720e.f15670e.f31731e);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }

    @Override // defpackage.AbstractC17080e
    public final boolean Signature() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // defpackage.AbstractC17080e
    public final void ad() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i == 3) {
            m4242goto(1);
            this.f33420e[this.f33421e - 1] = 0;
            this.f15669e = 0;
        } else {
            throw new C14803e("Expected BEGIN_ARRAY but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
        }
    }

    @Override // defpackage.AbstractC17080e
    public final void ads() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i == 7) {
            this.f15669e = 0;
            int[] iArr = this.f33420e;
            int i2 = this.f33421e - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new C14803e("Expected null but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
    }

    @Override // defpackage.AbstractC17080e
    public final void advert() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i != 2) {
            throw new C14803e("Expected END_OBJECT but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
        }
        int i2 = this.f33421e;
        int i3 = i2 - 1;
        this.f33421e = i3;
        this.f33418e[i3] = null;
        int[] iArr = this.f33420e;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f15669e = 0;
    }

    @Override // defpackage.AbstractC17080e
    /* renamed from: break, reason: not valid java name */
    public final void mo2305break() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i == 14) {
            long tapsense = this.f15665e.tapsense(f15662e);
            C16151e c16151e = this.f15670e;
            if (tapsense == -1) {
                tapsense = c16151e.f31731e;
            }
            c16151e.skip(tapsense);
        } else if (i == 13) {
            m2311e(f15663e);
        } else if (i == 12) {
            m2311e(f15664e);
        } else if (i != 15) {
            throw new C14803e("Expected a name but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
        }
        this.f15669e = 0;
        this.f33418e[this.f33421e - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15669e = 0;
        this.f33419e[0] = 8;
        this.f33421e = 1;
        this.f15670e.ad();
        this.f15665e.close();
    }

    /* renamed from: const, reason: not valid java name */
    public final boolean m2306const(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m2313final();
        throw null;
    }

    @Override // defpackage.AbstractC17080e
    public final int crashlytics() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return 7;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: else, reason: not valid java name */
    public final int m2307else(String str, C16911e c16911e) {
        int length = ((String[]) c16911e.f33137e).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c16911e.f33137e)[i])) {
                this.f15669e = 0;
                int[] iArr = this.f33420e;
                int i2 = this.f33421e - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC17080e
    /* renamed from: extends, reason: not valid java name */
    public final int mo2308extends(C16911e c16911e) {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m2318static(this.f15666e, c16911e);
        }
        int mo1690while = this.f15665e.mo1690while((C3128e) c16911e.f33136e);
        if (mo1690while != -1) {
            this.f15669e = 0;
            this.f33418e[this.f33421e - 1] = ((String[]) c16911e.f33137e)[mo1690while];
            return mo1690while;
        }
        String str = this.f33418e[this.f33421e - 1];
        String m2319volatile = m2319volatile();
        int m2318static = m2318static(m2319volatile, c16911e);
        if (m2318static == -1) {
            this.f15669e = 15;
            this.f15666e = m2319volatile;
            this.f33418e[this.f33421e - 1] = str;
        }
        return m2318static;
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public final String m2309e(C0193e c0193e) {
        StringBuilder sb = null;
        while (true) {
            long tapsense = this.f15665e.tapsense(c0193e);
            if (tapsense == -1) {
                m4241catch("Unterminated string");
                throw null;
            }
            C16151e c16151e = this.f15670e;
            if (c16151e.Signature(tapsense) != 92) {
                if (sb == null) {
                    String mo1683e = c16151e.mo1683e(tapsense, AbstractC5508e.ad);
                    c16151e.readByte();
                    return mo1683e;
                }
                sb.append(c16151e.mo1683e(tapsense, AbstractC5508e.ad));
                c16151e.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c16151e.mo1683e(tapsense, AbstractC5508e.ad));
            c16151e.readByte();
            sb.append(m2312e());
        }
    }

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public final String m2310e() {
        long tapsense = this.f15665e.tapsense(f15662e);
        C16151e c16151e = this.f15670e;
        if (tapsense == -1) {
            return c16151e.m4132protected();
        }
        c16151e.getClass();
        return c16151e.mo1683e(tapsense, AbstractC5508e.ad);
    }

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final void m2311e(C0193e c0193e) {
        while (true) {
            long tapsense = this.f15665e.tapsense(c0193e);
            if (tapsense == -1) {
                m4241catch("Unterminated string");
                throw null;
            }
            C16151e c16151e = this.f15670e;
            if (c16151e.Signature(tapsense) != 92) {
                c16151e.skip(tapsense + 1);
                return;
            } else {
                c16151e.skip(tapsense + 1);
                m2312e();
            }
        }
    }

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public final char m2312e() {
        int i;
        InterfaceC4895e interfaceC4895e = this.f15665e;
        if (!interfaceC4895e.request(1L)) {
            m4241catch("Unterminated escape sequence");
            throw null;
        }
        C16151e c16151e = this.f15670e;
        byte readByte = c16151e.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            m4241catch("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!interfaceC4895e.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + loadAd());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte Signature = c16151e.Signature(i2);
            char c2 = (char) (c << 4);
            if (Signature >= 48 && Signature <= 57) {
                i = Signature - 48;
            } else if (Signature >= 97 && Signature <= 102) {
                i = Signature - 87;
            } else {
                if (Signature < 65 || Signature > 70) {
                    m4241catch("\\u".concat(c16151e.mo1683e(4L, AbstractC5508e.ad)));
                    throw null;
                }
                i = Signature - 55;
            }
            c = (char) (i + c2);
        }
        c16151e.skip(4L);
        return c;
    }

    /* renamed from: final, reason: not valid java name */
    public final void m2313final() {
        m4241catch("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // defpackage.AbstractC17080e
    /* renamed from: implements, reason: not valid java name */
    public final void mo2314implements() {
        int i = 0;
        do {
            int i2 = this.f15669e;
            if (i2 == 0) {
                i2 = m2315new();
            }
            if (i2 == 3) {
                m4242goto(1);
            } else if (i2 == 1) {
                m4242goto(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        throw new C14803e("Expected a value but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
                    }
                    this.f33421e--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        throw new C14803e("Expected a value but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
                    }
                    this.f33421e--;
                } else {
                    C16151e c16151e = this.f15670e;
                    if (i2 == 14 || i2 == 10) {
                        long tapsense = this.f15665e.tapsense(f15662e);
                        if (tapsense == -1) {
                            tapsense = c16151e.f31731e;
                        }
                        c16151e.skip(tapsense);
                    } else if (i2 == 9 || i2 == 13) {
                        m2311e(f15663e);
                    } else if (i2 == 8 || i2 == 12) {
                        m2311e(f15664e);
                    } else if (i2 == 17) {
                        c16151e.skip(this.f15668e);
                    } else if (i2 == 18) {
                        throw new C14803e("Expected a value but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
                    }
                }
                this.f15669e = 0;
            }
            i++;
            this.f15669e = 0;
        } while (i != 0);
        int[] iArr = this.f33420e;
        int i3 = this.f33421e - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f33418e[i3] = "null";
    }

    @Override // defpackage.AbstractC17080e
    public final int inmobi() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i == 16) {
            long j = this.f15667e;
            int i2 = (int) j;
            if (j == i2) {
                this.f15669e = 0;
                int[] iArr = this.f33420e;
                int i3 = this.f33421e - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C14803e("Expected an int but was " + this.f15667e + " at path " + loadAd(), 8, (byte) 0);
        }
        if (i == 17) {
            long j2 = this.f15668e;
            C16151e c16151e = this.f15670e;
            c16151e.getClass();
            this.f15666e = c16151e.mo1683e(j2, AbstractC5508e.ad);
        } else if (i == 9 || i == 8) {
            String m2309e = i == 9 ? m2309e(f15663e) : m2309e(f15664e);
            this.f15666e = m2309e;
            try {
                int parseInt = Integer.parseInt(m2309e);
                this.f15669e = 0;
                int[] iArr2 = this.f33420e;
                int i4 = this.f33421e - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C14803e("Expected an int but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
        }
        this.f15669e = 11;
        try {
            double parseDouble = Double.parseDouble(this.f15666e);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                throw new C14803e("Expected an int but was " + this.f15666e + " at path " + loadAd(), 8, (byte) 0);
            }
            this.f15666e = null;
            this.f15669e = 0;
            int[] iArr3 = this.f33420e;
            int i6 = this.f33421e - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new C14803e("Expected an int but was " + this.f15666e + " at path " + loadAd(), 8, (byte) 0);
        }
    }

    @Override // defpackage.AbstractC17080e
    public final double isVip() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i == 16) {
            this.f15669e = 0;
            int[] iArr = this.f33420e;
            int i2 = this.f33421e - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f15667e;
        }
        if (i == 17) {
            long j = this.f15668e;
            C16151e c16151e = this.f15670e;
            c16151e.getClass();
            this.f15666e = c16151e.mo1683e(j, AbstractC5508e.ad);
        } else if (i == 9) {
            this.f15666e = m2309e(f15663e);
        } else if (i == 8) {
            this.f15666e = m2309e(f15664e);
        } else if (i == 10) {
            this.f15666e = m2310e();
        } else if (i != 11) {
            throw new C14803e("Expected a double but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
        }
        this.f15669e = 11;
        try {
            double parseDouble = Double.parseDouble(this.f15666e);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + loadAd());
            }
            this.f15666e = null;
            this.f15669e = 0;
            int[] iArr2 = this.f33420e;
            int i3 = this.f33421e - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new C14803e("Expected a double but was " + this.f15666e + " at path " + loadAd(), 8, (byte) 0);
        }
    }

    @Override // defpackage.AbstractC17080e
    public final void license() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i == 1) {
            m4242goto(3);
            this.f15669e = 0;
        } else {
            throw new C14803e("Expected BEGIN_OBJECT but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bf, code lost:
    
        if (r1 == 4) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
    
        if (r1 != 7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c4, code lost:
    
        r22.f15668e = r2;
        r9 = 17;
        r22.f15669e = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        if (m2306const(r10) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        if (r1 != 2) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019d, code lost:
    
        if (r4 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a5, code lost:
    
        if (r13 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a9, code lost:
    
        if (r8 != r17) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ab, code lost:
    
        if (r13 != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ad, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b0, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b1, code lost:
    
        r22.f15667e = r8;
        r7.skip(r2);
        r9 = 16;
        r22.f15669e = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bc, code lost:
    
        if (r1 == 2) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /* renamed from: new, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2315new() {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7720e.m2315new():int");
    }

    @Override // defpackage.AbstractC17080e
    /* renamed from: protected, reason: not valid java name */
    public final int mo2316protected(C16911e c16911e) {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return m2307else(this.f15666e, c16911e);
        }
        int mo1690while = this.f15665e.mo1690while((C3128e) c16911e.f33136e);
        if (mo1690while != -1) {
            this.f15669e = 0;
            int[] iArr = this.f33420e;
            int i2 = this.f33421e - 1;
            iArr[i2] = iArr[i2] + 1;
            return mo1690while;
        }
        String subs = subs();
        int m2307else = m2307else(subs, c16911e);
        if (m2307else == -1) {
            this.f15669e = 11;
            this.f15666e = subs;
            this.f33420e[this.f33421e - 1] = r0[r1] - 1;
        }
        return m2307else;
    }

    /* renamed from: public, reason: not valid java name */
    public final int m2317public(boolean z) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            InterfaceC4895e interfaceC4895e = this.f15665e;
            if (!interfaceC4895e.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C16151e c16151e = this.f15670e;
            byte Signature = c16151e.Signature(j);
            if (Signature != 10 && Signature != 32 && Signature != 13 && Signature != 9) {
                c16151e.skip(j);
                if (Signature == 47) {
                    if (interfaceC4895e.request(2L)) {
                        m2313final();
                        throw null;
                    }
                } else if (Signature == 35) {
                    m2313final();
                    throw null;
                }
                return Signature;
            }
            i = i2;
        }
    }

    @Override // defpackage.AbstractC17080e
    public final void purchase() {
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i != 4) {
            throw new C14803e("Expected END_ARRAY but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
        }
        int i2 = this.f33421e;
        this.f33421e = i2 - 1;
        int[] iArr = this.f33420e;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f15669e = 0;
    }

    /* renamed from: static, reason: not valid java name */
    public final int m2318static(String str, C16911e c16911e) {
        int length = ((String[]) c16911e.f33137e).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c16911e.f33137e)[i])) {
                this.f15669e = 0;
                this.f33418e[this.f33421e - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC17080e
    public final String subs() {
        String mo1683e;
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i == 10) {
            mo1683e = m2310e();
        } else if (i == 9) {
            mo1683e = m2309e(f15663e);
        } else if (i == 8) {
            mo1683e = m2309e(f15664e);
        } else if (i == 11) {
            mo1683e = this.f15666e;
            this.f15666e = null;
        } else if (i == 16) {
            mo1683e = Long.toString(this.f15667e);
        } else {
            if (i != 17) {
                throw new C14803e("Expected a string but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
            }
            long j = this.f15668e;
            C16151e c16151e = this.f15670e;
            c16151e.getClass();
            mo1683e = c16151e.mo1683e(j, AbstractC5508e.ad);
        }
        this.f15669e = 0;
        int[] iArr = this.f33420e;
        int i2 = this.f33421e - 1;
        iArr[i2] = iArr[i2] + 1;
        return mo1683e;
    }

    public final String toString() {
        return "JsonReader(" + this.f15665e + ")";
    }

    /* renamed from: volatile, reason: not valid java name */
    public final String m2319volatile() {
        String str;
        int i = this.f15669e;
        if (i == 0) {
            i = m2315new();
        }
        if (i == 14) {
            str = m2310e();
        } else if (i == 13) {
            str = m2309e(f15663e);
        } else if (i == 12) {
            str = m2309e(f15664e);
        } else {
            if (i != 15) {
                throw new C14803e("Expected a name but was " + AbstractC0869e.crashlytics(crashlytics()) + " at path " + loadAd(), 8, (byte) 0);
            }
            str = this.f15666e;
            this.f15666e = null;
        }
        this.f15669e = 0;
        this.f33418e[this.f33421e - 1] = str;
        return str;
    }
}
