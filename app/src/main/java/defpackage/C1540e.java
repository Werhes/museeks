package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؒ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1540e extends AbstractC8031e {
    @Override // defpackage.AbstractC6785e
    public final String Signature() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // defpackage.AbstractC6785e
    public final String admob() {
        return "com.google.android.gms.phenotype.service.START";
    }

    @Override // defpackage.AbstractC6785e
    public final IInterface appmetrica(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof C18117e ? (C18117e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 5);
    }

    @Override // defpackage.AbstractC6785e
    public final C1032e[] startapp() {
        return AbstractC17540e.billing;
    }

    @Override // defpackage.AbstractC6785e, defpackage.InterfaceC2367e
    public final int vip() {
        return 9410000;
    }
}
