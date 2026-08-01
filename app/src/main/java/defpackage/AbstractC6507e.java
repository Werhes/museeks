package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٛۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6507e extends AbstractC17414e {
    public static final void Signature(String str) {
        throw new NumberFormatException(AbstractC17861e.advert('\'', "Invalid number format: '", str));
    }

    public static boolean adcel(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String admob(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC8647e.applovin("Count 'n' must be non-negative, but was ", i, '.').toString());
        }
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return BuildConfig.FLAVOR;
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = charAt;
        }
        return new String(cArr);
    }

    public static String advert(int i, int i2, int i3, byte[] bArr) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        AbstractC17140e.metrica(i, i2, bArr.length);
        return new String(bArr, i, i2 - i, AbstractC5508e.ad);
    }

    public static boolean amazon(String str, String str2, boolean z) {
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean loadAd(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static String mopub(byte[] bArr) {
        return new String(bArr, AbstractC5508e.ad);
    }

    public static boolean pro(String str, String str2, boolean z) {
        if (!z) {
            return str.startsWith(str2);
        }
        int length = str2.length();
        return !z ? str.regionMatches(0, str2, 0, length) : str.regionMatches(z, 0, str2, 0, length);
    }

    public static String remoteconfig(String str, String str2, String str3) {
        int m1861goto = AbstractC5304e.m1861goto(str, str2, 0, false, 2);
        return m1861goto < 0 ? str : AbstractC5304e.m1874super(str, m1861goto, str2.length() + m1861goto, str3).toString();
    }

    public static Integer signatures(String str) {
        boolean z;
        int i;
        int i2;
        AbstractC15211e.ad(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        if (AbstractC7890e.yandex(charAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
            } else {
                if (charAt != '-') {
                    return null;
                }
                i4 = RecyclerView.UNDEFINED_DURATION;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static byte[] smaato(String str) {
        int length = str.length();
        AbstractC17140e.metrica(0, length, str.length());
        CharsetEncoder newEncoder = AbstractC5508e.ad.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (encode.hasArray() && encode.arrayOffset() == 0 && encode.remaining() == encode.array().length) {
            return encode.array();
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    public static String startapp(char[] cArr, int i, int i2) {
        AbstractC17140e.metrica(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static String subscription(String str, String str2, String str3, boolean z) {
        int i = 0;
        int firebase = AbstractC5304e.firebase(str, str2, 0, z);
        if (firebase < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, firebase);
            sb.append(str3);
            i = firebase + length;
            if (firebase >= str.length()) {
                break;
            }
            firebase = AbstractC5304e.firebase(str, str2, firebase + i2, z);
        } while (firebase > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static Long tapsense(String str) {
        boolean z;
        AbstractC15211e.ad(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (AbstractC7890e.yandex(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z = false;
                i = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = digit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
