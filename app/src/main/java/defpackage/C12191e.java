package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12191e implements InterfaceC9391e {
    public final InterfaceC2134e ad;
    public final /* synthetic */ AppMeasurementDynamiteService vip;

    public C12191e(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC2134e interfaceC2134e) {
        this.vip = appMeasurementDynamiteService;
        this.ad = interfaceC2134e;
    }

    @Override // defpackage.InterfaceC9391e
    public final void ad(String str, String str2, Bundle bundle, long j) {
        try {
            this.ad.mo612native(str, str2, bundle, j);
        } catch (RemoteException e) {
            C6936e c6936e = this.vip.metrica;
            if (c6936e != null) {
                C13879e c13879e = c6936e.f14227e;
                C6936e.yandex(c13879e);
                c13879e.f27495e.vip(e, "Event listener threw exception");
            }
        }
    }
}
