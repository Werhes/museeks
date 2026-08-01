package defpackage;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۢۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17352e {
    public static final C2892e ad = new C2892e(1850954627, false, new C13428e(14));

    public static final boolean ad(C2730e c2730e, C2730e c2730e2) {
        if (c2730e == null && c2730e2 == null) {
            return true;
        }
        if (c2730e == null || c2730e2 == null) {
            return false;
        }
        String str = c2730e.license;
        String str2 = c2730e2.license;
        return (str == null && str2 == null) ? AbstractC7890e.billing(Objects.toString(c2730e.ad), Objects.toString(c2730e2.ad)) && AbstractC7890e.billing(c2730e.metrica, c2730e2.metrica) && c2730e.appmetrica == c2730e2.appmetrica && c2730e.purchase == c2730e2.purchase : AbstractC7890e.billing(str, str2);
    }

    public static int[] appmetrica(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static String billing(int i, int i2, StringBuilder sb) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static final int license(C2730e c2730e) {
        if (c2730e == null) {
            return 0;
        }
        String str = c2730e.license;
        return str != null ? str.hashCode() : Objects.hash(c2730e.ad, c2730e.metrica, Boolean.valueOf(c2730e.appmetrica), Boolean.valueOf(c2730e.purchase));
    }

    public static boolean metrica(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = metrica(file2) && z;
        }
        return z;
    }

    public static boolean purchase(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        vip("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        vip("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        throw new C5234e("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), AbstractC17475e.ads(Integer.valueOf(eglGetError)));
    }

    public static Uri startapp(String str, String str2) {
        return Uri.parse(yandex(str, str2));
    }

    public static void vip(String str, boolean z) {
        if (z) {
            return;
        }
        C2171e c2171e = AbstractC17475e.f34223e;
        throw new C5234e(str, C1410e.f4222e);
    }

    public static String yandex(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        int[] appmetrica = appmetrica(str2);
        if (appmetrica[0] != -1) {
            sb.append(str2);
            billing(appmetrica[1], appmetrica[2], sb);
            return sb.toString();
        }
        int[] appmetrica2 = appmetrica(str);
        if (appmetrica[3] == 0) {
            sb.append((CharSequence) str, 0, appmetrica2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (appmetrica[2] == 0) {
            sb.append((CharSequence) str, 0, appmetrica2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = appmetrica[1];
        if (i != 0) {
            int i2 = appmetrica2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return billing(appmetrica[1] + i2, i2 + appmetrica[2], sb);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, appmetrica2[1]);
            sb.append(str2);
            int i3 = appmetrica2[1];
            return billing(i3, appmetrica[2] + i3, sb);
        }
        int i4 = appmetrica2[0] + 2;
        int i5 = appmetrica2[1];
        if (i4 >= i5 || i5 != appmetrica2[2]) {
            int lastIndexOf = str.lastIndexOf(47, appmetrica2[2] - 1);
            int i6 = lastIndexOf == -1 ? appmetrica2[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return billing(appmetrica2[1], i6 + appmetrica[2], sb);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = appmetrica2[1];
        return billing(i7, appmetrica[2] + i7 + 1, sb);
    }
}
