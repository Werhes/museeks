package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۣۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10627e extends AbstractC6484e {
    public static final Parcelable.Creator<C10627e> CREATOR = new C1318e(7);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f20943e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f20944e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f20945e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f20946e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10627e) {
            C10627e c10627e = (C10627e) obj;
            if (AbstractC5729e.vip(Integer.valueOf(this.f20946e), Integer.valueOf(c10627e.f20946e)) && AbstractC5729e.vip(Integer.valueOf(this.f20944e), Integer.valueOf(c10627e.f20944e)) && AbstractC5729e.vip(Integer.valueOf(this.f20943e), Integer.valueOf(c10627e.f20943e)) && AbstractC5729e.vip(Boolean.valueOf(this.f20945e), Boolean.valueOf(c10627e.f20945e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20946e), Integer.valueOf(this.f20944e), Integer.valueOf(this.f20943e), Boolean.valueOf(this.f20945e)});
    }

    public final String toString() {
        int i = this.f20946e;
        int i2 = this.f20944e;
        int i3 = this.f20943e;
        boolean z = this.f20945e;
        StringBuilder pro = AbstractC17861e.pro(i, i2, "UwbRangingData{rawDistance=", ", rawAngleOfArrivalAzimuth=", ", rawAngleOfArrivalPolar=");
        pro.append(i3);
        pro.append(", isValidAngleOfArrivalData=");
        pro.append(z);
        pro.append("}");
        return pro.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f20946e;
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f20944e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.f20943e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(i4);
        boolean z = this.f20945e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
