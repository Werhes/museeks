package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5426e implements InterfaceC14444e {
    public IBinder metrica;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC14444e
    /* renamed from: eؘۗٚ, reason: contains not printable characters */
    public final void mo1913e(InterfaceC4342e interfaceC4342e, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            obtain.writeStrongInterface(interfaceC4342e);
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.metrica.transact(3001, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
