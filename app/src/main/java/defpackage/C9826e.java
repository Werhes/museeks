package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۡۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9826e implements InterfaceC12516e {
    public final String appmetrica = UUID.randomUUID().toString();
    public final Bundle license;
    public final C18017e metrica;
    public final CastDevice vip;

    public /* synthetic */ C9826e(C12894e c12894e) {
        this.vip = (CastDevice) c12894e.f25751e;
        this.metrica = (C18017e) c12894e.f25750e;
        this.license = (Bundle) c12894e.f25752e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r3 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.C9826e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            eٍۡۧ r8 = (defpackage.C9826e) r8
            com.google.android.gms.cast.CastDevice r1 = r7.vip
            com.google.android.gms.cast.CastDevice r3 = r8.vip
            boolean r1 = defpackage.AbstractC5729e.vip(r1, r3)
            if (r1 == 0) goto L65
            android.os.Bundle r1 = r8.license
            android.os.Bundle r3 = r7.license
            if (r3 == 0) goto L58
            if (r1 != 0) goto L1f
            goto L58
        L1f:
            int r4 = r3.size()
            int r5 = r1.size()
            if (r4 == r5) goto L2a
            goto L65
        L2a:
            java.util.Set r4 = r3.keySet()
            java.util.Set r5 = r1.keySet()
            boolean r5 = r4.containsAll(r5)
            if (r5 != 0) goto L39
            goto L65
        L39:
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.get(r5)
            java.lang.Object r5 = r1.get(r5)
            boolean r5 = defpackage.AbstractC5729e.vip(r6, r5)
            if (r5 != 0) goto L3d
            goto L65
        L58:
            if (r3 != r1) goto L65
        L5a:
            java.lang.String r1 = r7.appmetrica
            java.lang.String r8 = r8.appmetrica
            boolean r8 = defpackage.AbstractC5729e.vip(r1, r8)
            if (r8 == 0) goto L65
            return r0
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9826e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.vip, this.license, 0, this.appmetrica});
    }
}
