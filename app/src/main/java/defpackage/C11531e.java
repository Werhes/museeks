package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11531e implements Parcelable {
    public static final Parcelable.Creator<C11531e> CREATOR = new C1928e(18);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C17571e f23173e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f23174e;

    public C11531e(Parcel parcel) {
        this.f23174e = parcel.readInt();
        this.f23173e = C17571e.CREATOR.createFromParcel(parcel);
    }

    public C11531e(C17571e c17571e, int i) {
        if (TextUtils.isEmpty(c17571e.f34423e)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f23174e = i;
        this.f23173e = c17571e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f23174e + ", mDescription=" + this.f23173e + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23174e);
        this.f23173e.writeToParcel(parcel, i);
    }
}
