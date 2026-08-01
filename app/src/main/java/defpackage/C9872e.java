package defpackage;

import android.os.Trace;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9872e {
    public final C17338e ad;
    public boolean license;
    public final Object metrica;
    public final int vip;

    public C9872e(C17338e c17338e) {
        this.ad = c17338e;
        C11498e c11498e = AbstractC9670e.ad;
        c11498e.getClass();
        this.vip = C11498e.vip.incrementAndGet(c11498e);
        this.metrica = new Object();
    }

    public final C13322e ad() {
        C13322e c13322e;
        synchronized (this.metrica) {
            if (this.license) {
                throw new IllegalStateException("Check failed.");
            }
            c13322e = (C13322e) this.ad.applovin.get();
        }
        return c13322e;
    }

    public final void license() {
        synchronized (this.metrica) {
            if (this.license) {
                throw new IllegalStateException("Check failed.");
            }
            ((C11802e) this.ad.appmetrica.get()).license();
            this.license = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final C12701e metrica(C9485e c9485e, C13783e c13783e) {
        try {
            Trace.beginSection("CXCP#CameraGraph-" + ((Object) C5060e.vip(c9485e.ad)));
            return (C12701e) ((InterfaceC11206e) new C18277e(this.ad.metrica, new C16911e(c9485e, c13783e, 11)).Signature).get();
        } finally {
            Trace.endSection();
        }
    }

    public final String toString() {
        return "CameraPipe-" + this.vip;
    }

    public final C16417e vip() {
        C16417e c16417e;
        synchronized (this.metrica) {
            if (this.license) {
                throw new IllegalStateException("Check failed.");
            }
            c16417e = (C16417e) this.ad.inmobi.get();
        }
        return c16417e;
    }
}
