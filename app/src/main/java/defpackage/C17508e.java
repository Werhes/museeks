package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17508e extends AbstractC6484e {
    public static final Parcelable.Creator<C17508e> CREATOR = new C1318e(28);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String[] f34331e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f34332e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f34333e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f34334e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f34335e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f34336e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f34337e;

    public C17508e(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.f34335e = j;
        this.f34333e = str;
        this.f34332e = j2;
        this.f34334e = z;
        this.f34331e = strArr;
        this.f34337e = z2;
        this.f34336e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17508e)) {
            return false;
        }
        C17508e c17508e = (C17508e) obj;
        return AbstractC5942e.metrica(this.f34333e, c17508e.f34333e) && this.f34335e == c17508e.f34335e && this.f34332e == c17508e.f34332e && this.f34334e == c17508e.f34334e && Arrays.equals(this.f34331e, c17508e.f34331e) && this.f34337e == c17508e.f34337e && this.f34336e == c17508e.f34336e;
    }

    public final int hashCode() {
        return this.f34333e.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeLong(this.f34335e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f34333e);
        AbstractC16852e.isPro(parcel, 4, 8);
        parcel.writeLong(this.f34332e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f34334e ? 1 : 0);
        AbstractC16852e.pro(parcel, 6, this.f34331e);
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(this.f34337e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 8, 4);
        parcel.writeInt(this.f34336e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
