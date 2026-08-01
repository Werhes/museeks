package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۤۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680e {
    public String ad;

    public /* synthetic */ C0680e(String str, boolean z) {
        this.ad = str;
    }

    public static C0680e license(C1292e c1292e) {
        String str;
        c1292e.m568protected(2);
        int ads = c1292e.ads();
        int i = ads >> 1;
        int ads2 = ((c1292e.ads() >> 3) & 31) | ((ads & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder inmobi = AbstractC8703e.inmobi(str);
        inmobi.append(i < 10 ? ".0" : ".");
        inmobi.append(i);
        return new C0680e(AbstractC8647e.isPro(ads2, ads2 < 10 ? ".0" : ".", inmobi), false);
    }

    public static void metrica(C2532e c2532e, char c, String str) {
        Object obj;
        if (c != '*') {
            if (c == 'M') {
                Iterator it = EnumC15009e.f29734e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((EnumC15009e) obj).f29736e.equals(str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                EnumC15009e enumC15009e = (EnumC15009e) obj;
                if (enumC15009e == null) {
                    throw new IllegalStateException("Invalid month: ".concat(str).toString());
                }
                c2532e.f6384e = enumC15009e;
                return;
            }
            if (c == 'Y') {
                c2532e.f6389e = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'd') {
                c2532e.f6387e = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'h') {
                c2532e.f6385e = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'm') {
                c2532e.f6386e = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 's') {
                c2532e.f6388e = Integer.valueOf(Integer.parseInt(str));
                return;
            }
            if (c == 'z') {
                if (!str.equals("GMT")) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != c) {
                    throw new IllegalStateException("Check failed.");
                }
            }
        }
    }

    public byte[] ad(byte[] bArr, int i, byte[] bArr2) {
        C7174e c7174e = C7174e.metrica;
        String str = this.ad;
        Mac mac = (Mac) c7174e.ad.isPro(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, str));
        byte[] bArr4 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArr4 = mac.doFinal();
            if (bArr4.length + i3 >= i) {
                System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eِّؔ] */
    public C17476e appmetrica(String str) {
        ?? obj = new Object();
        String str2 = this.ad;
        char charAt = str2.charAt(0);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < str2.length()) {
            try {
                if (str2.charAt(i2) == charAt) {
                    i2++;
                } else {
                    int i4 = (i + i2) - i3;
                    metrica(obj, charAt, str.substring(i, i4));
                    try {
                        charAt = str2.charAt(i2);
                        i3 = i2;
                        i2++;
                        i = i4;
                    } catch (Throwable unused) {
                        i = i4;
                        throw new IllegalStateException(AbstractC4653e.applovin(AbstractC10257e.smaato("Failed to parse date string: \"", str, "\" at index ", i, ". Pattern: \""), str2, '\"'));
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i < str.length()) {
            metrica(obj, charAt, str.substring(i));
        }
        int intValue = ((Integer) obj.f6388e).intValue();
        int intValue2 = ((Integer) obj.f6386e).intValue();
        int intValue3 = ((Integer) obj.f6385e).intValue();
        int intValue4 = ((Integer) obj.f6387e).intValue();
        EnumC15009e enumC15009e = (EnumC15009e) obj.f6384e;
        if (enumC15009e == null) {
            enumC15009e = null;
        }
        return AbstractC0187e.ad(intValue, intValue2, intValue3, intValue4, enumC15009e, ((Integer) obj.f6389e).intValue());
    }

    public byte[] vip(byte[] bArr, byte[] bArr2) {
        C7174e c7174e = C7174e.metrica;
        String str = this.ad;
        Mac mac = (Mac) c7174e.ad.isPro(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }
}
