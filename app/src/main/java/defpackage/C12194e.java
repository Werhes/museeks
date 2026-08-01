package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12194e extends AbstractC6484e {
    public static final Parcelable.Creator<C12194e> CREATOR = new C10765e(6);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f24488e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f24489e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f24490e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f24491e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f24492e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f24493e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f24494e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f24495e;

    public C12194e(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f24493e = i;
        this.f24490e = i2;
        this.f24489e = i3;
        this.f24492e = i4;
        this.f24488e = i5;
        this.f24495e = i6;
        this.f24494e = z;
        this.f24491e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f24493e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f24490e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f24489e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f24492e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f24488e);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f24495e);
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(this.f24494e ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 8, this.f24491e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
