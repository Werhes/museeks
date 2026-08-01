package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16931e implements Parcelable {
    public static final Parcelable.Creator<C16931e> CREATOR = new C1928e(5);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f33162e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f33163e;

    public C16931e(Parcel parcel) {
        this.f33163e = parcel.createStringArrayList();
        this.f33162e = parcel.createTypedArrayList(C4741e.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f33163e);
        parcel.writeTypedList(this.f33162e);
    }
}
