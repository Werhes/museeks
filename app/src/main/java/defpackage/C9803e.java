package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ۠ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9803e extends AbstractC8031e {
    public final C16172e subs;

    public C9803e(Context context, Looper looper, C2532e c2532e, C16172e c16172e, C1623e c1623e, C1623e c1623e2) {
        super(context, looper, 270, c2532e, c1623e, c1623e2);
        this.subs = c16172e;
    }

    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.AbstractC6785e
    public final Bundle advert() {
        C16172e c16172e = this.subs;
        c16172e.getClass();
        Bundle bundle = new Bundle();
        String str = c16172e.vip;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // defpackage.AbstractC6785e
    public final IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C4883e ? (C4883e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // defpackage.AbstractC6785e
    public final C1032e[] startapp() {
        return AbstractC8797e.amazon;
    }

    @Override // defpackage.AbstractC6785e
    public final boolean subscription() {
        return true;
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 203400000;
    }
}
