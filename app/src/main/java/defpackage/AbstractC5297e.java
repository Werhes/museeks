package defpackage;

import android.content.res.Resources;
import android.media.MediaFormat;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5297e {
    public static int license;
    public static boolean metrica;
    public static final C2892e ad = new C2892e(1918588340, false, new C2916e(3));
    public static final Object vip = new Object();

    public static boolean ad(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }

    public static final String appmetrica(C13770e c13770e, int i) {
        return ((Resources) c13770e.adcel(AbstractC2676e.metrica)).getString(i);
    }

    public static final String license(int i, Object[] objArr, C13770e c13770e) {
        return ((Resources) c13770e.adcel(AbstractC2676e.metrica)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static void metrica(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC1786e.admob(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void vip(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
