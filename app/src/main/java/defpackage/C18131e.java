package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۥ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18131e extends AbstractC6484e {
    public static final Parcelable.Creator<C18131e> CREATOR = new C18517e(18);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f35537e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f35538e;

    public C18131e(boolean z, boolean z2) {
        this.f35538e = z;
        this.f35537e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18131e)) {
            return false;
        }
        C18131e c18131e = (C18131e) obj;
        return this.f35538e == c18131e.f35538e && this.f35537e == c18131e.f35537e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f35538e), Boolean.valueOf(this.f35537e)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UwbConnectivityCapability<S-STS: " + this.f35538e + ", P-STS: " + this.f35537e + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f35538e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f35537e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
