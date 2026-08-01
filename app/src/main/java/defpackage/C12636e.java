package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٞۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12636e implements Parcelable {
    public static final Parcelable.Creator<C12636e> CREATOR = new C1304e(10);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC3455e f25354e;

    public void ad(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f25354e == null) {
                    this.f25354e = new BinderC7702e(this);
                }
                parcel.writeStrongBinder(this.f25354e.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
