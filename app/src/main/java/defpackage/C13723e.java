package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13723e extends AbstractC6484e {
    public static final Parcelable.Creator<C13723e> CREATOR = new C1318e(9);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f27175e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f27176e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public byte[] f27177e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13723e) {
            C13723e c13723e = (C13723e) obj;
            if (Arrays.equals(this.f27177e, c13723e.f27177e) && AbstractC5729e.vip(Integer.valueOf(this.f27176e), Integer.valueOf(c13723e.f27176e)) && AbstractC5729e.vip(Integer.valueOf(this.f27175e), Integer.valueOf(c13723e.f27175e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f27177e)), Integer.valueOf(this.f27176e), Integer.valueOf(this.f27175e)});
    }

    public final String toString() {
        return AbstractC17861e.smaato(this.f27175e, "}", AbstractC10257e.smaato("UwbSenderInfo{address=", Arrays.toString(this.f27177e), ", channel=", this.f27176e, ", preambleIndex="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.mopub(parcel, 1, this.f27177e);
        int i2 = this.f27176e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.f27175e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(i3);
        AbstractC16852e.ads(parcel, applovin);
    }
}
