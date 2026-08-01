package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8319e implements Comparable, Parcelable {
    public static final Parcelable.Creator<C8319e> CREATOR = new C1304e(13);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final String f16993e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final String f16994e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final String f16995e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f16996e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f16997e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f16998e;

    static {
        String str = AbstractC9413e.ad;
        f16994e = Integer.toString(0, 36);
        f16993e = Integer.toString(1, 36);
        f16995e = Integer.toString(2, 36);
    }

    public C8319e(int i, int i2, int i3) {
        this.f16998e = i;
        this.f16997e = i2;
        this.f16996e = i3;
    }

    public C8319e(Parcel parcel) {
        this.f16998e = parcel.readInt();
        this.f16997e = parcel.readInt();
        this.f16996e = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8319e c8319e = (C8319e) obj;
        int i = this.f16998e - c8319e.f16998e;
        if (i != 0) {
            return i;
        }
        int i2 = this.f16997e - c8319e.f16997e;
        return i2 == 0 ? this.f16996e - c8319e.f16996e : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8319e.class == obj.getClass()) {
            C8319e c8319e = (C8319e) obj;
            if (this.f16998e == c8319e.f16998e && this.f16997e == c8319e.f16997e && this.f16996e == c8319e.f16996e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f16998e * 31) + this.f16997e) * 31) + this.f16996e;
    }

    public final String toString() {
        return this.f16998e + "." + this.f16997e + "." + this.f16996e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16998e);
        parcel.writeInt(this.f16997e);
        parcel.writeInt(this.f16996e);
    }
}
