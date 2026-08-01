package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11007e implements Parcelable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Parcelable f21800e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C7800e f21799e = new AbstractC11007e();
    public static final Parcelable.Creator<AbstractC11007e> CREATOR = new C6220e(1);

    public AbstractC11007e() {
        this.f21800e = null;
    }

    public AbstractC11007e(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f21800e = readParcelable == null ? f21799e : readParcelable;
    }

    public AbstractC11007e(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f21800e = parcelable == f21799e ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f21800e, i);
    }
}
