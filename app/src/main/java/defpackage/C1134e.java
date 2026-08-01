package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1134e extends AbstractC6484e {
    public static final Parcelable.Creator<C1134e> CREATOR = new C0928e(20);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f3701e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f3702e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f3703e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f3704e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f3705e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C12455e f3706e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C12455e f3707e;

    public C1134e(String str, String str2, String str3, String str4, String str5, C12455e c12455e, C12455e c12455e2) {
        this.f3705e = str;
        this.f3703e = str2;
        this.f3702e = str3;
        this.f3704e = str4;
        this.f3701e = str5;
        this.f3707e = c12455e;
        this.f3706e = c12455e2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f3705e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f3703e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f3702e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f3704e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f3701e);
        AbstractC16852e.subscription(parcel, 6, this.f3707e, i);
        AbstractC16852e.subscription(parcel, 7, this.f3706e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
