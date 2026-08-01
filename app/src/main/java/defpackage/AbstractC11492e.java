package defpackage;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11492e {
    public static final C2509e ad;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C2509e c2509e;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new C2509e[0]).iterator();
                if (it.hasNext()) {
                    C2509e c2509e2 = (C2509e) it.next();
                    AbstractC2301e.admob("Expected at most one FlagsService", !it.hasNext());
                } else {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    c2509e = new Object();
                }
                ad = c2509e;
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
