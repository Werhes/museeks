package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2680e {
    public final int ad;
    public final /* synthetic */ int appmetrica;
    public final Bundle license;
    public final int metrica;
    public final C8988e vip = new C8988e();

    public C2680e(int i, int i2, Bundle bundle, int i3) {
        this.appmetrica = i3;
        this.ad = i;
        this.metrica = i2;
        this.license = bundle;
    }

    public final boolean ad() {
        switch (this.appmetrica) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void metrica(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.vip.vip(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.metrica + " id=" + this.ad + " oneWay=" + ad() + "}";
    }

    public final void vip(C2123e c2123e) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c2123e.toString());
        }
        this.vip.ad(c2123e);
    }
}
