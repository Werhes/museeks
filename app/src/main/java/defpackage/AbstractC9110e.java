package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۥۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9110e {
    public static final int[] ad = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] vip = {-1, 8000, AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] metrica = {64, 112, 128, 192, 224, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 384, 448, AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] license = {8000, AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] appmetrica = {5, 8, 10, 12};
    public static final int[] purchase = {6, 9, 12, 15};
    public static final int[] billing = {2, 4, 6, 8};
    public static final int[] yandex = {9, 11, 13, 16};
    public static final int[] startapp = {5, 8, 10, 12};

    public static final int ad(InterfaceC9739e interfaceC9739e) {
        return interfaceC9739e.ad().size();
    }

    public static final ViewParent appmetrica(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static int billing(C2125e c2125e, int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 3 && c2125e.purchase(); i2++) {
            i++;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += 1 << iArr[i4];
        }
        return c2125e.billing(iArr[i]) + i3;
    }

    public static C2125e license(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new C2125e(bArr.length, bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = copyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b3 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b3;
            }
        }
        C2125e c2125e = new C2125e(copyOf.length, copyOf);
        if (copyOf[0] == 31) {
            C2125e c2125e2 = new C2125e(copyOf.length, copyOf);
            while (c2125e2.vip() >= 16) {
                c2125e2.loadAd(2);
                int billing2 = c2125e2.billing(14) & 16383;
                int min = Math.min(8 - c2125e.license, 14);
                int i3 = c2125e.license;
                int i4 = (8 - i3) - min;
                byte[] bArr2 = c2125e.vip;
                int i5 = c2125e.metrica;
                byte b4 = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr2[i5]);
                bArr2[i5] = b4;
                int i6 = 14 - min;
                bArr2[i5] = (byte) (b4 | ((billing2 >>> i6) << i4));
                int i7 = i5 + 1;
                while (i6 > 8) {
                    c2125e.vip[i7] = (byte) (billing2 >>> (i6 - 8));
                    i6 -= 8;
                    i7++;
                }
                int i8 = 8 - i6;
                byte[] bArr3 = c2125e.vip;
                byte b5 = (byte) (bArr3[i7] & ((1 << i8) - 1));
                bArr3[i7] = b5;
                bArr3[i7] = (byte) (((billing2 & ((1 << i6) - 1)) << i8) | b5);
                c2125e.loadAd(14);
                c2125e.ad();
            }
        }
        c2125e.mopub(copyOf.length, copyOf);
        return c2125e;
    }

    public static int metrica(int i) {
        if (i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368) {
            return 1;
        }
        if (i == 1683496997 || i == 622876772) {
            return 2;
        }
        if (i == 1078008818 || i == -233094848) {
            return 3;
        }
        return (i == 1908687592 || i == -398277519) ? 4 : 0;
    }

    public static SharedPreferences purchase(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int vip(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9110e.vip(byte[]):int");
    }
}
