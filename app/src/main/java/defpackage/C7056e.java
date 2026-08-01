package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7056e {
    public static final C7056e adcel;
    public static final Pattern advert;
    public static final HashMap amazon;
    public static final C7056e appmetrica;
    public static final C7056e billing;
    public static final C7056e license;
    public static final C7056e loadAd;
    public static final C7056e mopub;
    public static final C7056e purchase;
    public static final C7056e smaato;
    public static final C7056e startapp;
    public static final C7056e yandex;
    public String ad;
    public int metrica;
    public int[] vip;

    static {
        C7056e c7056e = new C7056e(new int[]{64, 164, 241, 73, 206, 78, 208, 17, 163, 172, 0, 160, 201, 3, 72, 246}, "Audio error concealment absent.");
        new C7056e(new int[]{64, 164, 241, 73, 206, 78, 208, 17, 163, 172, 0, 160, 201, 3, 72, 246}, "Interleaved audio error concealment.");
        C7056e c7056e2 = new C7056e(new int[]{64, 158, 105, 248, 77, 91, 207, 17, 168, 253, 0, 128, 95, 92, 68, 43}, " Audio stream");
        C7056e c7056e3 = new C7056e(new int[]{250, 179, 17, 34, 35, 189, 210, 17, 180, 183, 0, 160, 201, 85, 252, 110}, "Content Branding");
        license = c7056e3;
        C7056e c7056e4 = new C7056e(new int[]{251, 179, 17, 34, 35, 189, 210, 17, 180, 183, 0, 160, 201, 85, 252, 110}, "Content Encryption Object");
        C7056e c7056e5 = new C7056e(new int[]{51, 38, 178, 117, 142, 102, 207, 17, 166, 217, 0, 170, 0, 98, 206, 108}, "Content Description");
        appmetrica = c7056e5;
        C7056e c7056e6 = new C7056e(new int[]{64, 82, 209, 134, 29, 49, 208, 17, 163, 164, 0, 160, 201, 3, 72, 246}, "Encoding description");
        C7056e c7056e7 = new C7056e(new int[]{64, 164, 208, 210, 7, 227, 210, 17, 151, 240, 0, 160, 201, 94, 168, 80}, "Extended Content Description");
        purchase = c7056e7;
        C7056e c7056e8 = new C7056e(new int[]{161, 220, 171, 140, 71, 169, 207, 17, 142, 228, 0, 192, 12, 32, 83, EnergyProfile.EVCONNECTOR_TYPE_OTHER}, "File header");
        billing = c7056e8;
        C7056e c7056e9 = new C7056e(new int[]{48, 38, 178, 117, 142, 102, 207, 17, 166, 217, 0, 170, 0, 98, 206, 108}, "Asf header");
        yandex = c7056e9;
        C7056e c7056e10 = new C7056e(new int[]{181, 3, 191, 95, 46, 169, 207, 17, 142, 227, 0, 192, 12, 32, 83, EnergyProfile.EVCONNECTOR_TYPE_OTHER}, "Header Extension");
        startapp = c7056e10;
        C7056e c7056e11 = new C7056e(new int[]{169, 70, 67, 124, 224, 239, 252, 75, 178, 41, 57, 62, 222, 65, 92, 133}, "Language List");
        C7056e c7056e12 = new C7056e(new int[]{234, 203, 248, 197, 175, 91, 119, 72, 132, 103, 170, 140, 68, 250, 76, 202}, "Metadata");
        adcel = c7056e12;
        C7056e c7056e13 = new C7056e(new int[]{148, 28, 35, 68, 152, 148, 209, 73, 161, 65, 29, 19, 78, 69, 112, 84}, "Metadata Library");
        mopub = c7056e13;
        advert = Pattern.compile("[a-f0-9]{8}\\-[a-f0-9]{4}\\-[a-f0-9]{4}\\-[a-f0-9]{4}\\-[a-f0-9]{12}", 2);
        C7056e c7056e14 = new C7056e(new int[]{145, 7, 220, 183, 183, 169, 207, 17, 142, 230, 0, 192, 12, 32, 83, EnergyProfile.EVCONNECTOR_TYPE_OTHER}, "Stream");
        smaato = c7056e14;
        C7056e c7056e15 = new C7056e(new int[]{206, 117, 248, 123, 141, 70, 209, 17, 141, 130, 0, 96, 151, 201, 162, 178}, "Stream bitrate properties");
        C7056e c7056e16 = new C7056e(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, "Unspecified");
        loadAd = c7056e16;
        C7056e[] c7056eArr = {c7056e, c7056e5, c7056e2, c7056e6, c7056e8, c7056e9, c7056e14, c7056e7, new C7056e(new int[]{192, 239, 25, 188, 77, 91, 207, 17, 168, 253, 0, 128, 95, 92, 68, 43}, "Video stream"), c7056e10, c7056e15, new C7056e(new int[]{48, 26, 251, 30, 98, 11, 208, 17, 163, 155, 0, 160, 201, 3, 72, 246}, "Script Command Object"), c7056e4, c7056e3, c7056e16, c7056e13, c7056e12, c7056e11};
        amazon = new HashMap(18);
        for (int i = 0; i < 18; i++) {
            C7056e c7056e17 = c7056eArr[i];
            amazon.put(c7056e17, c7056e17);
        }
    }

    public C7056e(int[] iArr) {
        this.ad = BuildConfig.FLAVOR;
        this.vip = null;
        if (iArr.length != 16) {
            throw new IllegalArgumentException("The given guidData doesn't match the GUID specification.");
        }
        int[] iArr2 = new int[16];
        this.vip = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 16);
    }

    public C7056e(int[] iArr, String str) {
        this(iArr);
        this.ad = str;
    }

    public static C7056e vip(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null");
        }
        if (!advert.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid guidData format.");
        }
        int[] iArr = new int[16];
        int[] iArr2 = {3, 2, 1, 0, 5, 4, 7, 6, 8, 9, 10, 11, 12, 13, 14, 15};
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) != '-') {
                iArr[iArr2[i2]] = Integer.parseInt(str.substring(i, i + 2), 16);
                i++;
                i2++;
            }
            i++;
        }
        return new C7056e(iArr);
    }

    public final byte[] ad() {
        int length = this.vip.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (this.vip[i] & 255);
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7056e)) {
            return false;
        }
        int[] iArr = this.vip;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int[] iArr3 = ((C7056e) obj).vip;
        int[] iArr4 = new int[iArr3.length];
        System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
        return Arrays.equals(iArr2, iArr4);
    }

    public final int hashCode() {
        if (this.metrica == -1) {
            int[] iArr = this.vip;
            int length = iArr.length;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = (i * 31) + iArr2[i2];
            }
            this.metrica = i;
        }
        return this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        byte[] ad = ad();
        String[] strArr = new String[ad.length];
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < ad.length; i++) {
            sb2.delete(0, sb2.length());
            sb2.append(Integer.toHexString(ad[i] & 255));
            if (sb2.length() == 1) {
                sb2.insert(0, "0");
            }
            strArr[i] = sb2.toString();
        }
        sb.append(strArr[3]);
        sb.append(strArr[2]);
        sb.append(strArr[1]);
        sb.append(strArr[0]);
        sb.append('-');
        sb.append(strArr[5]);
        sb.append(strArr[4]);
        sb.append('-');
        sb.append(strArr[7]);
        sb.append(strArr[6]);
        sb.append('-');
        sb.append(strArr[8]);
        sb.append(strArr[9]);
        sb.append('-');
        sb.append(strArr[10]);
        sb.append(strArr[11]);
        sb.append(strArr[12]);
        sb.append(strArr[13]);
        sb.append(strArr[14]);
        sb.append(strArr[15]);
        return sb.toString();
    }
}
