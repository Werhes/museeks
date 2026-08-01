package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۥً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2217e extends AbstractC6484e {
    public static final Parcelable.Creator<C2217e> CREATOR = new C18517e(20);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C11665e f5614e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f5615e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f5616e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f5617e;

    public C2217e(String str, String str2, C11665e c11665e, boolean z) {
        this.f5617e = str;
        this.f5615e = str2;
        this.f5614e = c11665e;
        this.f5616e = z;
    }

    public final void billing(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f5617e);
        sb.append(", ");
        sb.append(this.f5615e);
        sb.append(", ");
        this.f5614e.billing(sb);
        sb.append(", ");
        sb.append(this.f5616e);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2217e)) {
            return false;
        }
        C2217e c2217e = (C2217e) obj;
        return AbstractC1216e.Signature(this.f5617e, c2217e.f5617e) && AbstractC1216e.Signature(this.f5615e, c2217e.f5615e) && AbstractC1216e.Signature(this.f5614e, c2217e.f5614e) && this.f5616e == c2217e.f5616e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        billing(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f5617e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f5615e);
        AbstractC16852e.subscription(parcel, 4, this.f5614e, i);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f5616e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
