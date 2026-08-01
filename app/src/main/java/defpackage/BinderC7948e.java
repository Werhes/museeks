package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC7948e extends AbstractBinderC5235e implements InterfaceC9026e {
    public boolean license;
    public final AtomicReference metrica;

    public BinderC7948e() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.metrica = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /* renamed from: eًٓؓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2360e(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L2a
            java.lang.String r0 = "r"
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> Lf
            return r3
        Lf:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received: "
            java.lang.String r2 = ", "
            java.lang.String r3 = defpackage.AbstractC17861e.admob(r1, r4, r2, r3)
            java.lang.String r4 = "AM"
            android.util.Log.w(r4, r3, r0)
            throw r0
        L2a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BinderC7948e.m2360e(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // defpackage.AbstractBinderC5235e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
        AbstractC1757e.license(parcel);
        tapsense(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle remoteconfig(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.metrica;
        synchronized (atomicReference) {
            if (!this.license) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.metrica.get();
        }
        return bundle;
    }

    @Override // defpackage.InterfaceC9026e
    public final void tapsense(Bundle bundle) {
        AtomicReference atomicReference = this.metrica;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.license = true;
                } finally {
                    this.metrica.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
