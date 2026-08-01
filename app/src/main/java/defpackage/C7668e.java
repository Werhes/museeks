package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7668e extends AbstractC6484e {
    public static final Parcelable.Creator<C7668e> CREATOR = new C6153e(25);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C15924e f15580e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f15581e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C7210e f15582e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f15583e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f15584e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13561e f15585e;

    public C7668e(String str, C7210e c7210e, boolean z, int i, C15924e c15924e, C13561e c13561e) {
        this.f15584e = str;
        this.f15582e = c7210e;
        this.f15581e = z;
        this.f15583e = i;
        this.f15580e = c15924e;
        this.f15585e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7668e) {
            C7668e c7668e = (C7668e) obj;
            if (AbstractC5729e.vip(this.f15584e, c7668e.f15584e) && AbstractC5729e.vip(this.f15582e, c7668e.f15582e) && AbstractC5729e.vip(Boolean.valueOf(this.f15581e), Boolean.valueOf(c7668e.f15581e)) && AbstractC5729e.vip(Integer.valueOf(this.f15583e), Integer.valueOf(c7668e.f15583e)) && AbstractC5729e.vip(this.f15580e, c7668e.f15580e) && AbstractC5729e.vip(this.f15585e, c7668e.f15585e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15584e, this.f15582e, Boolean.valueOf(this.f15581e), Integer.valueOf(this.f15583e), this.f15580e, this.f15585e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f15584e);
        AbstractC16852e.subscription(parcel, 2, this.f15582e, i);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f15581e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f15583e);
        AbstractC16852e.subscription(parcel, 5, this.f15580e, i);
        AbstractC16852e.subscription(parcel, 6, this.f15585e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
