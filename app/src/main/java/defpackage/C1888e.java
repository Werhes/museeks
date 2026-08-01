package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1888e implements Parcelable {
    public static final Parcelable.Creator<C1888e> CREATOR = new C1928e(16);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f5029e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f5030e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f5031e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5031e);
        parcel.writeInt(this.f5030e);
        parcel.writeInt(this.f5029e ? 1 : 0);
    }
}
