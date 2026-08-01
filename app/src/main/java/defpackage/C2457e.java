package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2457e implements Parcelable {
    public static final Parcelable.Creator<C2457e> CREATOR = new C1304e(12);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f6276e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f6277e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f6278e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f6279e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f6280e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int[] f6281e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f6282e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f6283e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public ArrayList f6284e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int[] f6285e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6283e);
        parcel.writeInt(this.f6279e);
        parcel.writeInt(this.f6277e);
        if (this.f6277e > 0) {
            parcel.writeIntArray(this.f6281e);
        }
        parcel.writeInt(this.f6276e);
        if (this.f6276e > 0) {
            parcel.writeIntArray(this.f6285e);
        }
        parcel.writeInt(this.f6280e ? 1 : 0);
        parcel.writeInt(this.f6282e ? 1 : 0);
        parcel.writeInt(this.f6278e ? 1 : 0);
        parcel.writeList(this.f6284e);
    }
}
