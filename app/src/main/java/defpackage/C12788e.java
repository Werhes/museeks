package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12788e implements Parcelable {
    public static final Parcelable.Creator<C12788e> CREATOR = new C1304e(11);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int[] f25588e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f25589e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f25590e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f25591e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f25591e + ", mGapDir=" + this.f25589e + ", mHasUnwantedGapAfter=" + this.f25590e + ", mGapPerSpan=" + Arrays.toString(this.f25588e) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25591e);
        parcel.writeInt(this.f25589e);
        parcel.writeInt(this.f25590e ? 1 : 0);
        int[] iArr = this.f25588e;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f25588e);
        }
    }
}
