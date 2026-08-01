package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7125e extends AbstractC6484e {
    public static final Parcelable.Creator<C7125e> CREATOR = new C1318e(22);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f14599e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f14600e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f14601e;

    public C7125e(float f, float f2, float f3) {
        this.f14601e = f;
        this.f14600e = f2;
        this.f14599e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7125e)) {
            return false;
        }
        C7125e c7125e = (C7125e) obj;
        return this.f14601e == c7125e.f14601e && this.f14600e == c7125e.f14600e && this.f14599e == c7125e.f14599e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f14601e), Float.valueOf(this.f14600e), Float.valueOf(this.f14599e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeFloat(this.f14601e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeFloat(this.f14600e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeFloat(this.f14599e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
