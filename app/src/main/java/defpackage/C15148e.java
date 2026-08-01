package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؐٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15148e extends AbstractC6484e {
    public static final Parcelable.Creator<C15148e> CREATOR = new C1318e(19);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f29979e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C9097e f29980e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final long f29981e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f29982e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f29983e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C15541e f29984e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f29985e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C15541e f29986e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f29987e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C15541e f29988e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String f29989e;

    public C15148e(C15148e c15148e) {
        AbstractC9528e.startapp(c15148e);
        this.f29987e = c15148e.f29987e;
        this.f29982e = c15148e.f29982e;
        this.f29980e = c15148e.f29980e;
        this.f29985e = c15148e.f29985e;
        this.f29979e = c15148e.f29979e;
        this.f29989e = c15148e.f29989e;
        this.f29988e = c15148e.f29988e;
        this.f29983e = c15148e.f29983e;
        this.f29986e = c15148e.f29986e;
        this.f29981e = c15148e.f29981e;
        this.f29984e = c15148e.f29984e;
    }

    public C15148e(String str, String str2, C9097e c9097e, long j, boolean z, String str3, C15541e c15541e, long j2, C15541e c15541e2, long j3, C15541e c15541e3) {
        this.f29987e = str;
        this.f29982e = str2;
        this.f29980e = c9097e;
        this.f29985e = j;
        this.f29979e = z;
        this.f29989e = str3;
        this.f29988e = c15541e;
        this.f29983e = j2;
        this.f29986e = c15541e2;
        this.f29981e = j3;
        this.f29984e = c15541e3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f29987e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f29982e);
        AbstractC16852e.subscription(parcel, 4, this.f29980e, i);
        long j = this.f29985e;
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f29979e;
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 7, this.f29989e);
        AbstractC16852e.subscription(parcel, 8, this.f29988e, i);
        long j2 = this.f29983e;
        AbstractC16852e.isPro(parcel, 9, 8);
        parcel.writeLong(j2);
        AbstractC16852e.subscription(parcel, 10, this.f29986e, i);
        AbstractC16852e.isPro(parcel, 11, 8);
        parcel.writeLong(this.f29981e);
        AbstractC16852e.subscription(parcel, 12, this.f29984e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
