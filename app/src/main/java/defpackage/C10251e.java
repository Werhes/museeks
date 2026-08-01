package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10251e implements Parcelable {
    public static final Parcelable.Creator<C10251e> CREATOR = new C1928e(9);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f20268e;

    public C10251e(int i) {
        this.f20268e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10251e) && this.f20268e == ((C10251e) obj).f20268e;
    }

    public final int hashCode() {
        return this.f20268e;
    }

    public final String toString() {
        return AbstractC1786e.pro(new StringBuilder("DefaultLazyKey(index="), this.f20268e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20268e);
    }
}
