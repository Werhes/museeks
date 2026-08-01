package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۤٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13612e {
    public static final byte[] ad = {0, 0, 0, 1};
    public static final String[] vip = {BuildConfig.FLAVOR, "A", "B", "C"};
    public static final Pattern metrica = Pattern.compile("^\\D?(\\d+)$");

    public static String ad(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {vip[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = AbstractC9413e.ad;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0167, code lost:
    
        if (r12.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair metrica(java.lang.String r11, java.lang.String[] r12, defpackage.C14754e r13) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13612e.metrica(java.lang.String, java.lang.String[], eٔٗؐ):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0606 A[Catch: NumberFormatException -> 0x0610, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x0610, blocks: (B:343:0x05b9, B:345:0x05cd, B:356:0x05eb, B:359:0x0606), top: B:342:0x05b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0939  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair vip(defpackage.C16975e r33) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13612e.vip(eٌْٗ):android.util.Pair");
    }
}
