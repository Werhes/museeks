package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2324e extends AbstractC8031e {
    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // defpackage.AbstractC6785e
    public final IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof C0563e ? (C0563e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 0);
    }

    @Override // defpackage.AbstractC6785e
    public final boolean isPro() {
        return true;
    }

    @Override // defpackage.AbstractC6785e
    public final C1032e[] startapp() {
        return AbstractC5032e.metrica;
    }

    @Override // defpackage.AbstractC6785e
    public final boolean subscription() {
        return true;
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 17895000;
    }
}
