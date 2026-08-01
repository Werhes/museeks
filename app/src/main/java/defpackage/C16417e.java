package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۖٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16417e {
    public final C13738e ad;

    public C16417e(C13738e c13738e) {
        this.ad = c13738e;
    }

    public final InterfaceC0707e ad() {
        C13738e c13738e = this.ad;
        try {
            Trace.beginSection("getCameraBackend");
            c13738e.license.getClass();
            InterfaceC0707e ad = c13738e.ad("CXCP-Camera2");
            if (ad != null) {
                return ad;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) C10644e.ad("CXCP-Camera2"))).toString());
        } finally {
            Trace.endSection();
        }
    }
}
