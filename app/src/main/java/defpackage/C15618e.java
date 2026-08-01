package defpackage;

import androidx.car.app.model.Alert;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٝۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C15618e extends C7460e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C15618e f30802e = new C7460e(1, AbstractC15064e.class, "renderCookieHeader", "renderCookieHeader(Lio/ktor/http/Cookie;)Ljava/lang/String;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        C15566e c15566e = (C15566e) obj;
        Set set = AbstractC15064e.ad;
        StringBuilder sb = new StringBuilder();
        sb.append(c15566e.f30734e);
        byte b = 61;
        sb.append('=');
        String str = c15566e.f30730e;
        int ordinal = c15566e.f30728e.ordinal();
        if (ordinal != 0) {
            int i2 = 0;
            if (ordinal == 1) {
                if (AbstractC5304e.isPro(str, '\"')) {
                    throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
                }
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (AbstractC15211e.license(charAt) || AbstractC7890e.yandex(charAt, 32) < 0 || AbstractC15064e.metrica.contains(Character.valueOf(charAt))) {
                        str = AbstractC17861e.advert('\"', "\"", str);
                        break;
                    }
                }
            } else if (ordinal != 2) {
                int i4 = 3;
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
                C16499e c16499e = C4389e.purchase;
                byte[] bytes = str.getBytes(AbstractC5508e.ad);
                int length = bytes.length;
                c16499e.getClass();
                int i5 = c16499e.license;
                AbstractC17140e.metrica(0, length, bytes.length);
                int vip = c16499e.vip(length);
                byte[] bArr = new byte[vip];
                AbstractC17140e.metrica(0, length, bytes.length);
                int vip2 = c16499e.vip(length);
                if (vip < 0) {
                    throw new IndexOutOfBoundsException(AbstractC1786e.admob(vip, "destination offset: 0, destination size: "));
                }
                if (vip2 < 0 || vip2 > vip) {
                    throw new IndexOutOfBoundsException(AbstractC1786e.Signature(vip, vip2, "The destination array does not have enough capacity, destination offset: 0, destination size: ", ", capacity needed: "));
                }
                byte[] bArr2 = c16499e.ad ? AbstractC6005e.metrica : AbstractC6005e.ad;
                int i6 = c16499e.vip ? c16499e.appmetrica : Alert.DURATION_SHOW_INDEFINITELY;
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    i = i7 + 2;
                    if (i >= length) {
                        break;
                    }
                    int min = Math.min((length - i7) / i4, i6);
                    byte b2 = b;
                    int i9 = i2;
                    while (i9 < min) {
                        int i10 = i2;
                        int i11 = bytes[i7] & 255;
                        int i12 = i7 + 2;
                        int i13 = bytes[i7 + 1] & 255;
                        i7 += 3;
                        int i14 = (i11 << 16) | (i13 << 8) | (bytes[i12] & 255);
                        bArr[i8] = bArr2[i14 >>> 18];
                        bArr[i8 + 1] = bArr2[(i14 >>> 12) & 63];
                        int i15 = i8 + 3;
                        bArr[i8 + 2] = bArr2[(i14 >>> 6) & 63];
                        i8 += 4;
                        bArr[i15] = bArr2[i14 & 63];
                        i9++;
                        i4 = i4;
                        i2 = i10;
                    }
                    int i16 = i2;
                    int i17 = i4;
                    if (min == i6 && i7 != length) {
                        int i18 = i8 + 1;
                        byte[] bArr3 = C4389e.billing;
                        bArr[i8] = bArr3[i16];
                        i8 += 2;
                        bArr[i18] = bArr3[1];
                    }
                    b = b2;
                    i4 = i17;
                    i2 = i16;
                }
                byte b3 = b;
                int i19 = i4;
                int i20 = length - i7;
                if (i20 == 1) {
                    int i21 = i7 + 1;
                    int i22 = (bytes[i7] & 255) << 4;
                    bArr[i8] = bArr2[i22 >>> 6];
                    int i23 = i8 + 2;
                    bArr[i8 + 1] = bArr2[i22 & 63];
                    if (i5 == 1 || i5 == 3) {
                        bArr[i23] = b3;
                        bArr[i8 + 3] = b3;
                    }
                    i7 = i21;
                } else if (i20 == 2) {
                    int i24 = ((bytes[i7 + 1] & 255) << 2) | ((bytes[i7] & 255) << 10);
                    bArr[i8] = bArr2[i24 >>> 12];
                    int i25 = i8 + 2;
                    bArr[i8 + 1] = bArr2[(i24 >>> 6) & 63];
                    int i26 = i8 + 3;
                    bArr[i25] = bArr2[i24 & 63];
                    if (i5 == 1 || i5 == i19) {
                        bArr[i26] = b3;
                    }
                    i7 = i;
                }
                if (i7 != length) {
                    throw new IllegalStateException("Check failed.");
                }
                str = new String(bArr, AbstractC5508e.license);
            } else {
                str = AbstractC6528e.appmetrica(str, true);
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
