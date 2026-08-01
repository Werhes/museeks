package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ۠ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7509e implements Parcelable {
    public static final Parcelable.Creator<C7509e> CREATOR = new C1928e(14);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f15305e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final String f15306e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final int f15307e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f15308e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f15309e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int f15310e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f15311e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final boolean f15312e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f15313e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final boolean f15314e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f15315e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f15316e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f15317e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f15318e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f15319e;

    public C7509e(Parcel parcel) {
        this.f15317e = parcel.readString();
        this.f15311e = parcel.readString();
        this.f15308e = parcel.readInt() != 0;
        this.f15315e = parcel.readInt() != 0;
        this.f15305e = parcel.readInt();
        this.f15319e = parcel.readInt();
        this.f15318e = parcel.readString();
        this.f15313e = parcel.readInt() != 0;
        this.f15316e = parcel.readInt() != 0;
        this.f15309e = parcel.readInt() != 0;
        this.f15314e = parcel.readInt() != 0;
        this.f15307e = parcel.readInt();
        this.f15306e = parcel.readString();
        this.f15310e = parcel.readInt();
        this.f15312e = parcel.readInt() != 0;
    }

    public C7509e(AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e) {
        this.f15317e = abstractComponentCallbacksC17875e.getClass().getName();
        this.f15311e = abstractComponentCallbacksC17875e.f35068e;
        this.f15308e = abstractComponentCallbacksC17875e.f35075e;
        this.f15315e = abstractComponentCallbacksC17875e.f35085e;
        this.f15305e = abstractComponentCallbacksC17875e.f35104e;
        this.f15319e = abstractComponentCallbacksC17875e.f35092e;
        this.f15318e = abstractComponentCallbacksC17875e.f35089e;
        this.f15313e = abstractComponentCallbacksC17875e.f35087e;
        this.f15316e = abstractComponentCallbacksC17875e.f35071e;
        this.f15309e = abstractComponentCallbacksC17875e.f35096e;
        this.f15314e = abstractComponentCallbacksC17875e.f35090e;
        this.f15307e = abstractComponentCallbacksC17875e.f35077e.ordinal();
        this.f15306e = abstractComponentCallbacksC17875e.f35088e;
        this.f15310e = abstractComponentCallbacksC17875e.f35102e;
        this.f15312e = abstractComponentCallbacksC17875e.f35084e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f15317e);
        sb.append(" (");
        sb.append(this.f15311e);
        sb.append(")}:");
        if (this.f15308e) {
            sb.append(" fromLayout");
        }
        if (this.f15315e) {
            sb.append(" dynamicContainer");
        }
        int i = this.f15319e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f15318e;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f15313e) {
            sb.append(" retainInstance");
        }
        if (this.f15316e) {
            sb.append(" removing");
        }
        if (this.f15309e) {
            sb.append(" detached");
        }
        if (this.f15314e) {
            sb.append(" hidden");
        }
        String str2 = this.f15306e;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f15310e);
        }
        if (this.f15312e) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15317e);
        parcel.writeString(this.f15311e);
        parcel.writeInt(this.f15308e ? 1 : 0);
        parcel.writeInt(this.f15315e ? 1 : 0);
        parcel.writeInt(this.f15305e);
        parcel.writeInt(this.f15319e);
        parcel.writeString(this.f15318e);
        parcel.writeInt(this.f15313e ? 1 : 0);
        parcel.writeInt(this.f15316e ? 1 : 0);
        parcel.writeInt(this.f15309e ? 1 : 0);
        parcel.writeInt(this.f15314e ? 1 : 0);
        parcel.writeInt(this.f15307e);
        parcel.writeString(this.f15306e);
        parcel.writeInt(this.f15310e);
        parcel.writeInt(this.f15312e ? 1 : 0);
    }
}
