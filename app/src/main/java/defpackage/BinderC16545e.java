package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ۟ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC16545e extends AbstractBinderC3782e {
    public final C17548e appmetrica;
    public final C2580e license;

    public BinderC16545e(C2580e c2580e) {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener", 5);
        this.appmetrica = new C17548e(0);
        this.license = c2580e;
    }

    /* renamed from: eٜؑ٘, reason: contains not printable characters */
    public final synchronized void m4160e(C4552e c4552e) {
        this.appmetrica.remove(c4552e.f9837e);
        this.license.ad(new C12276e(c4552e, 5));
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eًٖٕ */
    public final boolean mo687e(Parcel parcel, int i) {
        if (i == 2) {
            C15822e c15822e = (C15822e) AbstractC0923e.ad(parcel, C15822e.CREATOR);
            AbstractC0923e.vip(parcel);
            m4161e(c15822e);
            return true;
        }
        if (i == 3) {
            C4552e c4552e = (C4552e) AbstractC0923e.ad(parcel, C4552e.CREATOR);
            AbstractC0923e.vip(parcel);
            m4160e(c4552e);
            return true;
        }
        if (i == 4) {
            AbstractC0923e.vip(parcel);
            return true;
        }
        if (i != 5) {
            return false;
        }
        C16942e c16942e = (C16942e) AbstractC0923e.ad(parcel, C16942e.CREATOR);
        AbstractC0923e.vip(parcel);
        synchronized (this) {
            this.license.ad(new C12276e(c16942e, 3));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        r4.appmetrica.add(r5.f31230e);
     */
    /* renamed from: eٖۤٝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m4161e(defpackage.C15822e r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.bluetooth.BluetoothDevice r0 = r5.f31229e     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.String r0 = r5.f31230e     // Catch: java.lang.Throwable -> L1f
            r2 = 1
            if (r0 == 0) goto L14
            java.lang.String r3 = "__UNRECOGNIZED_BLUETOOTH_DEVICE__"
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 != 0) goto L21
            e٘ؕۦ r0 = r4.appmetrica     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r5.f31230e     // Catch: java.lang.Throwable -> L1f
            r0.add(r1)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r5 = move-exception
            goto L2e
        L21:
            eؔٔٓ r0 = r4.license     // Catch: java.lang.Throwable -> L1f
            eٌّؗ r1 = new eٌّؗ     // Catch: java.lang.Throwable -> L1f
            r2 = 4
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L1f
            r0.ad(r1)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)
            return
        L2e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BinderC16545e.m4161e(eَٕۤ):void");
    }
}
