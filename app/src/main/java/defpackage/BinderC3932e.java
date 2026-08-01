package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC3932e extends AbstractBinderC5235e implements InterfaceC2134e {
    public final C10873e metrica;

    public BinderC3932e(C10873e c10873e) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.metrica = c10873e;
    }

    @Override // defpackage.AbstractBinderC5235e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.metrica);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        AbstractC1757e.license(parcel);
        mo612native(readString, readString2, bundle, readLong);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.InterfaceC2134e
    public final int appmetrica() {
        return System.identityHashCode(this.metrica);
    }

    @Override // defpackage.InterfaceC2134e
    /* renamed from: native */
    public final void mo612native(String str, String str2, Bundle bundle, long j) {
        this.metrica.ad(str, str2, bundle, j);
    }
}
