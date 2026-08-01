package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۢؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C9831e implements InterfaceC10371e {
    public final /* synthetic */ int ad;
    public Object appmetrica;
    public Object license;
    public int metrica;
    public int vip;

    public C9831e() {
        this.ad = 9;
        this.license = new long[10];
        this.appmetrica = new Object[10];
    }

    public /* synthetic */ C9831e(byte b, int i) {
        this.ad = i;
    }

    public C9831e(int i) {
        this.ad = 0;
        this.license = new C18274e[i];
        this.metrica = 0;
    }

    public C9831e(int i, int i2, InterfaceC8850e interfaceC8850e, InterfaceC1108e interfaceC1108e) {
        this.ad = 8;
        this.license = interfaceC1108e;
        this.vip = i;
        this.metrica = i2;
        this.appmetrica = interfaceC8850e;
    }

    public C9831e(C9730e c9730e, C0912e c0912e) {
        this.ad = 2;
        this.license = new SparseArray();
        this.appmetrica = c9730e;
        TypedArray typedArray = (TypedArray) c0912e.f3331e;
        this.vip = typedArray.getResourceId(28, 0);
        this.metrica = typedArray.getResourceId(52, 0);
    }

    public C9831e(C14154e c14154e, int i) {
        this.ad = i;
        switch (i) {
            case 5:
                this.appmetrica = c14154e;
                int i2 = c14154e.metrica;
                this.vip = i2;
                this.metrica = c14154e.license;
                this.license = new C9831e[i2];
                for (int i3 = 0; i3 < this.vip; i3++) {
                    ((C9831e[]) this.license)[i3] = new C9831e(c14154e, 4);
                }
                return;
            default:
                this.license = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
                this.vip = c14154e.appmetrica;
                this.metrica = c14154e.billing;
                this.appmetrica = c14154e.Signature;
                return;
        }
    }

    public C9831e(OutputStream outputStream, byte[] bArr) {
        this.ad = 1;
        this.appmetrica = outputStream;
        this.license = bArr;
        this.metrica = 0;
        this.vip = bArr.length;
    }

    public C9831e(CharSequence charSequence, int i, Locale locale) {
        this.ad = 10;
        this.license = charSequence;
        if (charSequence.length() < 0) {
            AbstractC5525e.ad("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            AbstractC5525e.ad("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.appmetrica = wordInstance;
        this.vip = Math.max(0, -50);
        this.metrica = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new C18452e(charSequence, i));
    }

    public C9831e(String str) {
        this.ad = 7;
        this.vip = 0;
        this.metrica = 0;
        this.appmetrica = new C5401e((byte) 0, 2);
        String trim = str.trim();
        this.license = trim;
        this.metrica = trim.length();
    }

    public static int Signature(int i, int i2) {
        return admob(i2) + tapsense(i);
    }

    public static void adcel(C9831e c9831e, C9831e c9831e2, C9831e c9831e3) {
        for (int i = 0; i < 64; i++) {
            int i2 = i * 4;
            short[] sArr = (short[]) c9831e2.license;
            short s = sArr[i2];
            int i3 = i2 + 1;
            short s2 = sArr[i3];
            short[] sArr2 = (short[]) c9831e3.license;
            short s3 = sArr2[i2];
            short s4 = sArr2[i3];
            int i4 = i + 64;
            short[] sArr3 = AbstractC9386e.ad;
            AbstractC9386e.metrica(c9831e, i2, s, s2, s3, s4, sArr3[i4]);
            int i5 = i2 + 2;
            short[] sArr4 = (short[]) c9831e2.license;
            short s5 = sArr4[i5];
            int i6 = i2 + 3;
            short s6 = sArr4[i6];
            short[] sArr5 = (short[]) c9831e3.license;
            AbstractC9386e.metrica(c9831e, i5, s5, s6, sArr5[i5], sArr5[i6], (short) (sArr3[i4] * (-1)));
        }
    }

    public static int admob(int i) {
        if (i >= 0) {
            return pro(i);
        }
        return 10;
    }

    public static int loadAd(int i, int i2) {
        return admob(i2) + tapsense(i);
    }

    /* renamed from: new, reason: not valid java name */
    public static void m2671new(C9831e c9831e, C9831e c9831e2, C9831e c9831e3, C14154e c14154e) {
        C9831e c9831e4 = new C9831e(c14154e, 4);
        C9831e c9831e5 = ((C9831e[]) c9831e2.license)[0];
        C9831e[] c9831eArr = (C9831e[]) c9831e3.license;
        adcel(c9831e, c9831e5, c9831eArr[0]);
        for (int i = 1; i < c14154e.metrica; i++) {
            adcel(c9831e4, ((C9831e[]) c9831e2.license)[i], c9831eArr[i]);
            c9831e.billing(c9831e4);
        }
        c9831e.m2710synchronized();
    }

    public static int pro(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: protected, reason: not valid java name */
    public static C9831e m2672protected(OutputStream outputStream, int i) {
        return new C9831e(outputStream, new byte[i]);
    }

    public static int remoteconfig(AbstractC6649e abstractC6649e) {
        int metrica = abstractC6649e.metrica();
        return pro(metrica) + metrica;
    }

    public static int signatures(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int subscription(int i, AbstractC6649e abstractC6649e) {
        return remoteconfig(abstractC6649e) + tapsense(i);
    }

    public static int tapsense(int i) {
        return pro(i << 3);
    }

    /* renamed from: try, reason: not valid java name */
    public static boolean m2673try(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    /* renamed from: abstract, reason: not valid java name */
    public Integer m2674abstract() {
        int i = this.vip;
        if (i == this.metrica) {
            return null;
        }
        String str = (String) this.license;
        this.vip = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    @Override // defpackage.InterfaceC10371e
    public void ad(float f, float f2, float f3, float f4) {
        yandex((byte) 3);
        applovin(4);
        float[] fArr = (float[]) this.appmetrica;
        int i = this.metrica;
        int i2 = i + 1;
        this.metrica = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.metrica = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.metrica = i4;
        fArr[i3] = f3;
        this.metrica = i + 4;
        fArr[i4] = f4;
    }

    public void ads() {
        int length = ((Object[]) this.appmetrica).length;
        if (this.metrica < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.vip;
        int i3 = length - i2;
        System.arraycopy((long[]) this.license, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.appmetrica, this.vip, objArr, 0, i3);
        int i4 = this.vip;
        if (i4 > 0) {
            System.arraycopy((long[]) this.license, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.appmetrica, 0, objArr, i3, this.vip);
        }
        this.license = jArr;
        this.appmetrica = objArr;
        this.vip = 0;
    }

    public Boolean advert(Object obj) {
        if (obj == null) {
            return null;
        }
        m2713throws();
        int i = this.vip;
        if (i == this.metrica) {
            return null;
        }
        char charAt = ((String) this.license).charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.vip++;
        return Boolean.valueOf(charAt == '1');
    }

    public synchronized void amazon() {
        this.vip = 0;
        this.metrica = 0;
        Arrays.fill((Object[]) this.appmetrica, (Object) null);
    }

    public void applovin(int i) {
        float[] fArr = (float[]) this.appmetrica;
        if (fArr.length < this.metrica + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.appmetrica = fArr2;
        }
    }

    @Override // defpackage.InterfaceC10371e
    public void appmetrica(float f, float f2) {
        yandex((byte) 1);
        applovin(2);
        float[] fArr = (float[]) this.appmetrica;
        int i = this.metrica;
        int i2 = i + 1;
        this.metrica = i2;
        fArr[i] = f;
        this.metrica = i + 2;
        fArr[i2] = f2;
    }

    public void billing(C9831e c9831e) {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.license;
            sArr[i] = (short) (sArr[i] + ((short[]) c9831e.license)[i]);
        }
    }

    /* renamed from: break, reason: not valid java name */
    public int m2675break(int i) {
        mopub(i);
        int following = ((BreakIterator) this.appmetrica).following(i);
        return (m2712throw(following + (-1)) && m2712throw(following) && !m2683extends(following)) ? m2675break(following) : following;
    }

    /* renamed from: case, reason: not valid java name */
    public String m2676case() {
        String str = (String) this.license;
        if (premium()) {
            return null;
        }
        int i = this.vip;
        char charAt = str.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int startapp = startapp();
        while (startapp != -1 && startapp != charAt) {
            startapp = startapp();
        }
        if (startapp == -1) {
            this.vip = i;
            return null;
        }
        int i2 = this.vip;
        this.vip = i2 + 1;
        return str.substring(i + 1, i2);
    }

    /* renamed from: catch, reason: not valid java name */
    public String m2677catch() {
        return m2693final(' ', false);
    }

    /* renamed from: class, reason: not valid java name */
    public void m2678class(byte b, byte[] bArr) {
        int i = this.metrica;
        int i2 = (i * PSKKeyManager.MAX_KEY_LENGTH_BYTES) / 4;
        byte[] bArr2 = new byte[i2];
        C11467e c11467e = (C11467e) this.appmetrica;
        c11467e.getClass();
        int length = bArr.length + 1;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        bArr3[bArr.length] = b;
        C16253e c16253e = (C16253e) c11467e.f23071e;
        c16253e.purchase(0, length, bArr3);
        c16253e.metrica(0, i2, bArr2);
        AbstractC7779e.license(this, bArr2, i);
    }

    @Override // defpackage.InterfaceC10371e
    public void close() {
        yandex((byte) 8);
    }

    /* renamed from: const, reason: not valid java name */
    public byte[] m2679const() {
        byte[] bArr = new byte[this.metrica];
        for (int i = 0; i < this.vip; i++) {
            C9831e c9831e = ((C9831e[]) this.license)[i];
            c9831e.isVip();
            byte[] bArr2 = new byte[384];
            for (int i2 = 0; i2 < 128; i2++) {
                short[] sArr = (short[]) c9831e.license;
                int i3 = i2 * 2;
                short s = sArr[i3];
                short s2 = sArr[i3 + 1];
                int i4 = i2 * 3;
                bArr2[i4] = (byte) s;
                bArr2[i4 + 1] = (byte) ((s >> 8) | (s2 << 4));
                bArr2[i4 + 2] = (byte) (s2 >> 4);
            }
            System.arraycopy(bArr2, 0, bArr, i * 384, 384);
        }
        return bArr;
    }

    /* renamed from: continue, reason: not valid java name */
    public void m2680continue(int i) {
        if (i >= 0) {
            m2689e(i);
        } else {
            m2687e(i);
        }
    }

    public void crashlytics() {
        if (((OutputStream) this.appmetrica) != null) {
            m2705return();
        }
    }

    /* renamed from: default, reason: not valid java name */
    public float m2681default() {
        C5401e c5401e = (C5401e) this.appmetrica;
        float subs = c5401e.subs(this.vip, this.metrica, (String) this.license);
        if (!Float.isNaN(subs)) {
            this.vip = c5401e.f11581e;
        }
        return subs;
    }

    /* renamed from: else, reason: not valid java name */
    public void m2682else(int i, int i2, String str) {
        if (i > i2) {
            AbstractC5525e.ad("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            AbstractC5525e.ad("start must be non-negative, but was " + i);
        }
        C3712e c3712e = (C3712e) this.appmetrica;
        if (c3712e == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.license).length() - i2, 64);
            int i3 = i - min;
            ((String) this.license).getChars(i3, i, cArr, 0);
            int i4 = max - min2;
            int i5 = min2 + i2;
            ((String) this.license).getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            C3712e c3712e2 = new C3712e(0);
            c3712e2.vip = max;
            c3712e2.metrica = cArr;
            c3712e2.license = length;
            c3712e2.appmetrica = i4;
            this.appmetrica = c3712e2;
            this.vip = i3;
            this.metrica = i5;
            return;
        }
        int i6 = this.vip;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > c3712e.vip - c3712e.ad()) {
            this.license = toString();
            this.appmetrica = null;
            this.vip = -1;
            this.metrica = -1;
            m2682else(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > c3712e.ad()) {
            int ad = length2 - c3712e.ad();
            int i9 = c3712e.vip;
            do {
                i9 *= 2;
            } while (i9 - c3712e.vip < ad);
            char[] cArr2 = new char[i9];
            AbstractC1660e.amazon(c3712e.metrica, cArr2, 0, 0, c3712e.license);
            int i10 = c3712e.vip;
            int i11 = c3712e.appmetrica;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            AbstractC1660e.amazon(c3712e.metrica, cArr2, i13, i11, i12 + i11);
            c3712e.metrica = cArr2;
            c3712e.vip = i9;
            c3712e.appmetrica = i13;
        }
        int i14 = c3712e.license;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = c3712e.metrica;
            AbstractC1660e.amazon(cArr3, cArr3, c3712e.appmetrica - i15, i8, i14);
            c3712e.license = i7;
            c3712e.appmetrica -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int ad2 = c3712e.ad() + i7;
            int ad3 = c3712e.ad() + i8;
            int i16 = c3712e.appmetrica;
            char[] cArr4 = c3712e.metrica;
            AbstractC1660e.amazon(cArr4, cArr4, c3712e.license, i16, ad2);
            c3712e.license += ad2 - i16;
            c3712e.appmetrica = ad3;
        } else {
            c3712e.appmetrica = c3712e.ad() + i8;
            c3712e.license = i7;
        }
        str.getChars(0, str.length(), c3712e.metrica, c3712e.license);
        c3712e.license = str.length() + c3712e.license;
    }

    /* renamed from: extends, reason: not valid java name */
    public boolean m2683extends(int i) {
        CharSequence charSequence = (CharSequence) this.license;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC7890e.billing(of, unicodeBlock) && AbstractC7890e.billing(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC7890e.billing(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && AbstractC7890e.billing(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public void m2684e(int i) {
        m2688e(i & 255);
        m2688e((i >> 8) & 255);
        m2688e((i >> 16) & 255);
        m2688e((i >> 24) & 255);
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public void m2685e(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = (byte[]) this.license;
        int i = this.vip;
        int i2 = this.metrica;
        int i3 = i - i2;
        if (i3 >= length) {
            System.arraycopy(bArr, 0, bArr2, i2, length);
            this.metrica += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i2, i3);
        int i4 = length - i3;
        this.metrica = i;
        m2705return();
        if (i4 > i) {
            ((OutputStream) this.appmetrica).write(bArr, i3, i4);
        } else {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.metrica = i4;
        }
    }

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public void m2686e(long j) {
        m2688e(((int) j) & 255);
        m2688e(((int) (j >> 8)) & 255);
        m2688e(((int) (j >> 16)) & 255);
        m2688e(((int) (j >> 24)) & 255);
        m2688e(((int) (j >> 32)) & 255);
        m2688e(((int) (j >> 40)) & 255);
        m2688e(((int) (j >> 48)) & 255);
        m2688e(((int) (j >> 56)) & 255);
    }

    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public void m2687e(long j) {
        while (((-128) & j) != 0) {
            m2688e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m2688e((int) j);
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public void m2688e(int i) {
        byte b = (byte) i;
        if (this.metrica == this.vip) {
            m2705return();
        }
        byte[] bArr = (byte[]) this.license;
        int i2 = this.metrica;
        this.metrica = i2 + 1;
        bArr[i2] = b;
    }

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public void m2689e(int i) {
        while ((i & (-128)) != 0) {
            m2688e((i & 127) | 128);
            i >>>= 7;
        }
        m2688e(i);
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public void m2690e(AbstractC6732e abstractC6732e) {
        int size = abstractC6732e.size();
        byte[] bArr = (byte[]) this.license;
        int i = this.vip;
        int i2 = this.metrica;
        int i3 = i - i2;
        if (i3 >= size) {
            abstractC6732e.yandex(0, i2, size, bArr);
            this.metrica += size;
            return;
        }
        abstractC6732e.yandex(0, i2, i3, bArr);
        int i4 = size - i3;
        this.metrica = i;
        m2705return();
        if (i4 <= i) {
            abstractC6732e.yandex(i3, 0, i4, bArr);
            this.metrica = i4;
            return;
        }
        OutputStream outputStream = (OutputStream) this.appmetrica;
        if (i3 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i3);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i4 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i4);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i5 = i3 + i4;
        if (i5 <= abstractC6732e.size()) {
            if (i4 > 0) {
                abstractC6732e.isVip(outputStream, i3, i4);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i5);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public void m2691e(int i, int i2) {
        m2689e((i << 3) | i2);
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public void m2692e(AbstractC6649e abstractC6649e) {
        m2689e(abstractC6649e.metrica());
        abstractC6649e.purchase(this);
    }

    /* renamed from: final, reason: not valid java name */
    public String m2693final(char c, boolean z) {
        String str = (String) this.license;
        if (premium()) {
            return null;
        }
        char charAt = str.charAt(this.vip);
        if ((!z && m2673try(charAt)) || charAt == c) {
            return null;
        }
        int i = this.vip;
        int startapp = startapp();
        while (startapp != -1 && startapp != c && (z || !m2673try(startapp))) {
            startapp = startapp();
        }
        return str.substring(i, this.vip);
    }

    /* renamed from: finally, reason: not valid java name */
    public void m2694finally() {
        while (true) {
            int i = this.vip;
            if (i >= this.metrica || !m2673try(((String) this.license).charAt(i))) {
                return;
            } else {
                this.vip++;
            }
        }
    }

    public void firebase(byte[] bArr) {
        int i = 0;
        while (i < this.vip) {
            C9831e c9831e = ((C9831e[]) this.license)[i];
            int i2 = i * 384;
            i++;
            byte[] admob = AbstractC12442e.admob(i2, i * 384, bArr);
            c9831e.getClass();
            for (int i3 = 0; i3 < 128; i3++) {
                int i4 = i3 * 3;
                int i5 = admob[i4] & 255;
                int i6 = admob[i4 + 1] & 255;
                int i7 = admob[i4 + 2] & 255;
                short[] sArr = (short[]) c9831e.license;
                int i8 = i3 * 2;
                sArr[i8] = (short) ((i5 | (i6 << 8)) & 4095);
                sArr[i8 + 1] = (short) (((i7 << 4) | (i6 >> 4)) & 4095);
            }
        }
    }

    /* renamed from: for, reason: not valid java name */
    public void m2695for(int i, int i2) {
        m2691e(i, 0);
        m2680continue(i2);
    }

    /* renamed from: goto, reason: not valid java name */
    public boolean m2696goto(int i) {
        CharSequence charSequence = (CharSequence) this.license;
        int i2 = this.vip + 1;
        if (i > this.metrica || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!C5188e.license()) {
                    return false;
                }
                C5188e ad = C5188e.ad();
                if (ad.metrica() != 1 || ad.vip(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: implements, reason: not valid java name */
    public C17102e m2697implements() {
        float m2681default = m2681default();
        if (Float.isNaN(m2681default)) {
            return null;
        }
        int m2708super = m2708super();
        return m2708super == 0 ? new C17102e(1, m2681default) : new C17102e(m2708super, m2681default);
    }

    /* renamed from: import, reason: not valid java name */
    public Object m2698import() {
        AbstractC2301e.subscription(this.metrica > 0);
        Object[] objArr = (Object[]) this.appmetrica;
        int i = this.vip;
        Object obj = objArr[i];
        objArr[i] = null;
        this.vip = (i + 1) % objArr.length;
        this.metrica--;
        return obj;
    }

    public boolean inmobi(char c) {
        int i = this.vip;
        boolean z = i < this.metrica && ((String) this.license).charAt(i) == c;
        if (z) {
            this.vip++;
        }
        return z;
    }

    /* renamed from: instanceof, reason: not valid java name */
    public float m2699instanceof() {
        m2713throws();
        C5401e c5401e = (C5401e) this.appmetrica;
        float subs = c5401e.subs(this.vip, this.metrica, (String) this.license);
        if (!Float.isNaN(subs)) {
            this.vip = c5401e.f11581e;
        }
        return subs;
    }

    /* renamed from: interface, reason: not valid java name */
    public int m2700interface() {
        C3712e c3712e = (C3712e) this.appmetrica;
        if (c3712e == null) {
            return ((String) this.license).length();
        }
        return (c3712e.vip - c3712e.ad()) + (((String) this.license).length() - (this.metrica - this.vip));
    }

    public boolean isPro(String str) {
        int length = str.length();
        int i = this.vip;
        boolean z = i <= this.metrica - length && ((String) this.license).substring(i, i + length).equals(str);
        if (z) {
            this.vip += length;
        }
        return z;
    }

    public void isVip() {
        for (int i = 0; i < 256; i++) {
            short s = (short) (r1[i] - 3329);
            ((short[]) this.license)[i] = (short) (s + ((s >> 15) & 3329));
        }
    }

    @Override // defpackage.InterfaceC10371e
    public void license(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        yandex((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        applovin(5);
        float[] fArr = (float[]) this.appmetrica;
        int i = this.metrica;
        int i2 = i + 1;
        this.metrica = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.metrica = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.metrica = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.metrica = i5;
        fArr[i4] = f4;
        this.metrica = i + 5;
        fArr[i5] = f5;
    }

    @Override // defpackage.InterfaceC10371e
    public void metrica(float f, float f2, float f3, float f4, float f5, float f6) {
        yandex((byte) 2);
        applovin(6);
        float[] fArr = (float[]) this.appmetrica;
        int i = this.metrica;
        int i2 = i + 1;
        this.metrica = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.metrica = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.metrica = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.metrica = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.metrica = i6;
        fArr[i5] = f5;
        this.metrica = i + 6;
        fArr[i6] = f6;
    }

    public void mopub(int i) {
        int i2 = this.vip;
        int i3 = this.metrica;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder pro = AbstractC17861e.pro(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        pro.append(i3);
        pro.append(']');
        AbstractC5525e.ad(pro.toString());
    }

    /* renamed from: native, reason: not valid java name */
    public boolean m2701native(int i) {
        mopub(i);
        if (!((BreakIterator) this.appmetrica).isBoundary(i)) {
            return false;
        }
        if (m2712throw(i) && m2712throw(i - 1) && m2712throw(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.license).length() - 1 || !(m2683extends(i) || m2683extends(i + 1));
    }

    /* renamed from: package, reason: not valid java name */
    public void m2702package() {
        short[] sArr;
        short[] sArr2 = (short[]) this.license;
        short[] sArr3 = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        System.arraycopy(sArr2, 0, sArr3, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        int i = 2;
        int i2 = 0;
        while (true) {
            sArr = AbstractC9386e.vip;
            if (i > 128) {
                break;
            }
            int i3 = 0;
            while (i3 < 256) {
                int i4 = i2 + 1;
                short s = sArr[i2];
                int i5 = i3;
                while (i5 < i3 + i) {
                    short s2 = sArr3[i5];
                    int i6 = i5 + i;
                    short s3 = (short) (sArr3[i6] + s2);
                    sArr3[i5] = (short) (s3 - ((short) (((short) ((((short) 20159) * s3) >> 26)) * 3329)));
                    short s4 = (short) (s2 - sArr3[i6]);
                    sArr3[i6] = s4;
                    sArr3[i6] = AbstractC7890e.mopub(s4 * s);
                    i5++;
                }
                i3 = i5 + i;
                i2 = i4;
            }
            i <<= 1;
        }
        for (int i7 = 0; i7 < 256; i7++) {
            sArr3[i7] = AbstractC7890e.mopub(sArr3[i7] * sArr[127]);
        }
        this.license = sArr3;
    }

    public boolean premium() {
        return this.vip == this.metrica;
    }

    /* renamed from: private, reason: not valid java name */
    public synchronized Object m2703private(long j) {
        Object obj;
        obj = null;
        while (this.metrica > 0 && j - ((long[]) this.license)[this.vip] >= 0) {
            obj = m2698import();
        }
        return obj;
    }

    /* renamed from: public, reason: not valid java name */
    public void m2704public(int i, AbstractC6649e abstractC6649e) {
        m2691e(i, 2);
        m2692e(abstractC6649e);
    }

    public synchronized void purchase(long j, Object obj) {
        if (this.metrica > 0) {
            if (j <= ((long[]) this.license)[((this.vip + r0) - 1) % ((Object[]) this.appmetrica).length]) {
                amazon();
            }
        }
        ads();
        int i = this.vip;
        int i2 = this.metrica;
        Object[] objArr = (Object[]) this.appmetrica;
        int length = (i + i2) % objArr.length;
        ((long[]) this.license)[length] = j;
        objArr[length] = obj;
        this.metrica = i2 + 1;
    }

    /* renamed from: return, reason: not valid java name */
    public void m2705return() {
        OutputStream outputStream = (OutputStream) this.appmetrica;
        if (outputStream == null) {
            throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
        outputStream.write((byte[]) this.license, 0, this.metrica);
        this.metrica = 0;
    }

    public float smaato(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        m2713throws();
        return m2681default();
    }

    public int startapp() {
        int i = this.vip;
        int i2 = this.metrica;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.vip = i3;
        if (i3 < i2) {
            return ((String) this.license).charAt(i3);
        }
        return -1;
    }

    /* renamed from: static, reason: not valid java name */
    public int m2706static(int i) {
        mopub(i);
        int preceding = ((BreakIterator) this.appmetrica).preceding(i);
        return (m2712throw(preceding) && m2696goto(preceding) && !m2683extends(preceding)) ? m2706static(preceding) : preceding;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public synchronized Object m2707strictfp() {
        return this.metrica == 0 ? null : m2698import();
    }

    public void subs(InterfaceC10371e interfaceC10371e) {
        int i = 0;
        for (int i2 = 0; i2 < this.vip; i2++) {
            byte b = ((byte[]) this.license)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.appmetrica;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                interfaceC10371e.vip(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.appmetrica;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                interfaceC10371e.appmetrica(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.appmetrica;
                interfaceC10371e.metrica(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.appmetrica;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                interfaceC10371e.ad(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.appmetrica;
                interfaceC10371e.license(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                interfaceC10371e.close();
            }
        }
    }

    /* renamed from: super, reason: not valid java name */
    public int m2708super() {
        String str = (String) this.license;
        if (premium()) {
            return 0;
        }
        if (str.charAt(this.vip) == '%') {
            this.vip++;
            return 9;
        }
        int i = this.vip;
        if (i > this.metrica - 2) {
            return 0;
        }
        try {
            int m217break = AbstractC0054e.m217break(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.vip += 2;
            return m217break;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    /* renamed from: switch, reason: not valid java name */
    public synchronized int m2709switch() {
        return this.metrica;
    }

    /* renamed from: synchronized, reason: not valid java name */
    public void m2710synchronized() {
        for (int i = 0; i < 256; i++) {
            short[] sArr = (short[]) this.license;
            short s = sArr[i];
            sArr[i] = (short) (s - ((short) (((short) ((((short) 20159) * s) >> 26)) * 3329)));
        }
    }

    /* renamed from: this, reason: not valid java name */
    public boolean m2711this(int i) {
        int i2 = this.vip + 1;
        if (i > this.metrica || i2 > i) {
            return false;
        }
        return AbstractC5542e.yandex(Character.codePointBefore((CharSequence) this.license, i));
    }

    /* renamed from: throw, reason: not valid java name */
    public boolean m2712throw(int i) {
        CharSequence charSequence = (CharSequence) this.license;
        int i2 = this.vip;
        if (i >= this.metrica || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!C5188e.license()) {
                return false;
            }
            C5188e ad = C5188e.ad();
            if (ad.metrica() != 1 || ad.vip(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: throws, reason: not valid java name */
    public boolean m2713throws() {
        m2694finally();
        int i = this.vip;
        if (i == this.metrica || ((String) this.license).charAt(i) != ',') {
            return false;
        }
        this.vip++;
        m2694finally();
        return true;
    }

    public String toString() {
        switch (this.ad) {
            case 3:
                C3712e c3712e = (C3712e) this.appmetrica;
                if (c3712e == null) {
                    return (String) this.license;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.license, 0, this.vip);
                sb.append(c3712e.metrica, 0, c3712e.license);
                char[] cArr = c3712e.metrica;
                int i = c3712e.appmetrica;
                sb.append(cArr, i, c3712e.vip - i);
                String str = (String) this.license;
                sb.append((CharSequence) str, this.metrica, str.length());
                return sb.toString();
            case 4:
                StringBuilder sb2 = new StringBuilder("[");
                int i2 = 0;
                while (true) {
                    short[] sArr = (short[]) this.license;
                    if (i2 >= sArr.length) {
                        sb2.append("]");
                        return sb2.toString();
                    }
                    sb2.append((int) sArr[i2]);
                    if (i2 != ((short[]) this.license).length - 1) {
                        sb2.append(", ");
                    }
                    i2++;
                }
            case 5:
                int i3 = this.vip;
                StringBuilder sb3 = new StringBuilder("[");
                for (int i4 = 0; i4 < i3; i4++) {
                    sb3.append(((C9831e[]) this.license)[i4].toString());
                    if (i4 != i3 - 1) {
                        sb3.append(", ");
                    }
                }
                sb3.append("]");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: transient, reason: not valid java name */
    public void m2714transient() {
        for (int i = 0; i < this.vip; i++) {
            C9831e c9831e = ((C9831e[]) this.license)[i];
            short[] sArr = (short[]) c9831e.license;
            short[] sArr2 = new short[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            System.arraycopy(sArr, 0, sArr2, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            int i2 = 1;
            for (int i3 = 128; i3 >= 2; i3 >>= 1) {
                int i4 = 0;
                while (i4 < 256) {
                    int i5 = i2 + 1;
                    short s = AbstractC9386e.ad[i2];
                    int i6 = i4;
                    while (i6 < i4 + i3) {
                        int i7 = i6 + i3;
                        short mopub = AbstractC7890e.mopub(sArr2[i7] * s);
                        sArr2[i7] = (short) (sArr2[i6] - mopub);
                        sArr2[i6] = (short) (sArr2[i6] + mopub);
                        i6++;
                    }
                    i4 = i6 + i3;
                    i2 = i5;
                }
            }
            c9831e.license = sArr2;
            c9831e.m2710synchronized();
        }
    }

    @Override // defpackage.InterfaceC10371e
    public void vip(float f, float f2) {
        yandex((byte) 0);
        applovin(2);
        float[] fArr = (float[]) this.appmetrica;
        int i = this.metrica;
        int i2 = i + 1;
        this.metrica = i2;
        fArr[i] = f;
        this.metrica = i + 2;
        fArr[i2] = f2;
    }

    /* renamed from: volatile, reason: not valid java name */
    public void m2715volatile(int i, int i2) {
        m2691e(i, 0);
        m2680continue(i2);
    }

    /* renamed from: while, reason: not valid java name */
    public boolean m2716while(int i) {
        int i2 = this.vip;
        if (i >= this.metrica || i2 > i) {
            return false;
        }
        return AbstractC5542e.yandex(Character.codePointAt((CharSequence) this.license, i));
    }

    public void yandex(byte b) {
        int i = this.vip;
        byte[] bArr = (byte[]) this.license;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.license = bArr2;
        }
        byte[] bArr3 = (byte[]) this.license;
        int i2 = this.vip;
        this.vip = i2 + 1;
        bArr3[i2] = b;
    }
}
