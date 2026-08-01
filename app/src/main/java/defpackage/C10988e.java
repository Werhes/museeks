package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10988e extends AbstractC6484e {
    public static final Parcelable.Creator<C10988e> CREATOR = C1928e.vip;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C10988e f21745e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f21746e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f21747e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11849e f21748e;

    static {
        C10988e c10988e = new C10988e(null, false);
        c10988e.f21746e = false;
        f21745e = c10988e;
    }

    public C10988e(C11849e c11849e, boolean z) {
        this.f21748e = c11849e;
        this.f21747e = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10988e)) {
            return false;
        }
        C10988e c10988e = (C10988e) obj;
        return AbstractC5729e.vip(this.f21748e, c10988e.f21748e) && this.f21746e == c10988e.f21746e && this.f21747e == c10988e.f21747e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21748e, Boolean.valueOf(this.f21746e), Boolean.valueOf(this.f21747e)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21748e);
        return AbstractC8647e.ads(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f21746e) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f21748e, i);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f21747e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
