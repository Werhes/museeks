package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6528e {
    public static final Set ad;
    public static final ArrayList appmetrica;
    public static final Set license;
    public static final ArrayList metrica;
    public static final Set vip;

    static {
        ArrayList m3584final = AbstractC13480e.m3584final(AbstractC13480e.m3588implements(new AbstractC9848e('a', 'z'), new AbstractC9848e('A', 'Z')), new AbstractC9848e('0', '9'));
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m3584final, 10));
        Iterator it = m3584final.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        ad = AbstractC13480e.m3582e(arrayList);
        vip = AbstractC13480e.m3582e(AbstractC13480e.m3584final(AbstractC13480e.m3588implements(new AbstractC9848e('a', 'z'), new AbstractC9848e('A', 'Z')), new AbstractC9848e('0', '9')));
        AbstractC13480e.m3582e(AbstractC13480e.m3584final(AbstractC13480e.m3588implements(new AbstractC9848e('a', 'f'), new AbstractC9848e('A', 'F')), new AbstractC9848e('0', '9')));
        Set m664case = AbstractC1660e.m664case(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(m664case, 10));
        Iterator it2 = m664case.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        metrica = arrayList2;
        license = AbstractC1660e.m664case(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        AbstractC4511e.loadAd(vip, AbstractC1660e.m664case(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List startapp = AbstractC6874e.startapp('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(startapp, 10));
        Iterator it3 = startapp.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        appmetrica = arrayList3;
    }

    public static final int ad(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eَّۙ, java.lang.Object] */
    public static final String appmetrica(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = AbstractC5508e.ad.newEncoder();
        int length = str.length();
        ?? obj = new Object();
        AbstractC16540e.metrica(newEncoder, obj, str, 0, length);
        while (!obj.yandex()) {
            while (!obj.yandex()) {
                byte readByte = obj.readByte();
                Byte valueOf = Byte.valueOf(readByte);
                if (ad.contains(valueOf) || appmetrica.contains(valueOf)) {
                    sb.append((char) readByte);
                } else if (z && readByte == 32) {
                    sb.append('+');
                } else {
                    sb.append(billing(readByte));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return sb.toString();
    }

    public static final String billing(byte b) {
        int i = (b & 255) >> 4;
        int i2 = b & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }

    public static String license(int i, int i2, int i3, String str) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = AbstractC5508e.ad;
        return vip(i, i2, str, z);
    }

    public static String metrica(int i, int i2, int i3, String str) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        Charset charset = AbstractC5508e.ad;
        return vip(i, i2, str, false);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [eَّۙ, java.lang.Object] */
    public static final String purchase(String str) {
        StringBuilder sb = new StringBuilder();
        Charset charset = AbstractC5508e.ad;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (vip.contains(Character.valueOf(charAt)) || license.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
                i++;
            } else {
                int i2 = (55296 > charAt || charAt >= 57344) ? 1 : 2;
                CharsetEncoder newEncoder = charset.newEncoder();
                int i3 = i2 + i;
                ?? obj = new Object();
                AbstractC16540e.metrica(newEncoder, obj, str, i, i3);
                while (!obj.yandex()) {
                    while (!obj.yandex()) {
                        sb.append(billing(obj.readByte()));
                        Unit unit = Unit.INSTANCE;
                    }
                }
                i = i3;
            }
        }
        return sb.toString();
    }

    public static final String vip(int i, int i2, String str, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (z && charAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char charAt2 = str.charAt(i3);
                    if (z && charAt2 == '+') {
                        sb.append(' ');
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str.subSequence(i3, str.length()).toString());
                                sb2.append(", in ");
                                sb2.append((Object) str);
                                throw new Exception(AbstractC8647e.isPro(i3, " at ", sb2));
                            }
                            int i7 = i3 + 1;
                            int ad2 = ad(str.charAt(i7));
                            int ad3 = ad(str.charAt(i6));
                            if (ad2 == -1 || ad3 == -1) {
                                throw new Exception("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((ad2 * 16) + ad3);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(AbstractC6507e.advert(0, i5, 4, bArr));
                    } else {
                        sb.append(charAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            i3++;
        }
        return (i == 0 && i2 == str.length()) ? str.toString() : str.substring(i, i2);
    }
}
