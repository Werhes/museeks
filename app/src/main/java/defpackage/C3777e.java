package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۧۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3777e extends AbstractC6484e {
    public static final Parcelable.Creator<C3777e> CREATOR = new C6153e(27);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f8376e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f8377e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3777e) {
            C3777e c3777e = (C3777e) obj;
            if (AbstractC5729e.vip(Integer.valueOf(this.f8377e), Integer.valueOf(c3777e.f8377e)) && AbstractC5729e.vip(this.f8376e, c3777e.f8376e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8377e), this.f8376e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f8377e;
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(i2);
        AbstractC16852e.remoteconfig(parcel, 2, this.f8376e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
