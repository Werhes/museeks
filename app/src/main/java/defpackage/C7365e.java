package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۖۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7365e implements Parcelable {
    public static final Parcelable.Creator<C7365e> CREATOR = new C1928e(8);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f15101e;

    public C7365e(long j) {
        this.f15101e = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7365e) && this.f15101e == ((C7365e) obj).f15101e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15101e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f15101e);
    }
}
