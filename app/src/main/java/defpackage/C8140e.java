package defpackage;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8140e extends AbstractC11072e {
    public static final C6607e vip;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            AbstractC4533e.class.getName().equals(ad());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        vip = new C6607e(13);
    }

    public static String ad() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
