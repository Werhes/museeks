package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۡؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0622e extends AbstractC6484e {
    public static final Parcelable.Creator<C0622e> CREATOR = new C1318e(18);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f2842e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f2843e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0622e)) {
            return false;
        }
        C0622e c0622e = (C0622e) obj;
        return this.f2843e == c0622e.f2843e && AbstractC5729e.vip(Boolean.valueOf(this.f2842e), Boolean.valueOf(c0622e.f2842e));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2843e), Boolean.valueOf(this.f2842e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f2843e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.f2842e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
