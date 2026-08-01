package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2665e implements Parcelable {
    public static final Parcelable.Creator<C2665e> CREATOR = new C1928e(13);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f6533e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C4741e[] f6534e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public ArrayList f6535e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ArrayList f6536e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f6537e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public ArrayList f6538e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public ArrayList f6539e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public ArrayList f6540e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f6538e);
        parcel.writeStringList(this.f6535e);
        parcel.writeTypedArray(this.f6534e, i);
        parcel.writeInt(this.f6537e);
        parcel.writeString(this.f6533e);
        parcel.writeStringList(this.f6540e);
        parcel.writeTypedList(this.f6539e);
        parcel.writeTypedList(this.f6536e);
    }
}
