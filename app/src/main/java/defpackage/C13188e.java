package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13188e implements Parcelable {
    public static final Parcelable.Creator<C13188e> CREATOR = new C1928e(12);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f26192e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f26193e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26193e);
        parcel.writeInt(this.f26192e);
    }
}
