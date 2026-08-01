package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10467e extends AbstractC6484e {
    public static final Parcelable.Creator<C10467e> CREATOR = new C1318e(5);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f20655e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f20656e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f20657e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f20658e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f20659e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f20660e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f20661e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f20662e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f20663e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f20664e;

    public C10467e(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, boolean z3, boolean z4) {
        this.f20662e = i;
        this.f20658e = z;
        this.f20656e = z2;
        this.f20660e = str;
        this.f20655e = str2;
        this.f20664e = str3;
        this.f20663e = str4;
        this.f20659e = str5;
        this.f20661e = z3;
        this.f20657e = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10467e)) {
            return false;
        }
        C10467e c10467e = (C10467e) obj;
        return this.f20662e == c10467e.f20662e && this.f20658e == c10467e.f20658e && this.f20656e == c10467e.f20656e && TextUtils.equals(this.f20660e, c10467e.f20660e) && TextUtils.equals(this.f20655e, c10467e.f20655e) && TextUtils.equals(this.f20664e, c10467e.f20664e) && TextUtils.equals(this.f20663e, c10467e.f20663e) && TextUtils.equals(this.f20659e, c10467e.f20659e) && this.f20661e == c10467e.f20661e && this.f20657e == c10467e.f20657e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20662e), Boolean.valueOf(this.f20658e), Boolean.valueOf(this.f20656e), this.f20660e, this.f20655e, this.f20664e, this.f20663e, this.f20659e, Boolean.valueOf(this.f20661e), Boolean.valueOf(this.f20657e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f20662e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f20658e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f20656e ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 5, this.f20660e);
        AbstractC16852e.remoteconfig(parcel, 6, this.f20655e);
        AbstractC16852e.remoteconfig(parcel, 7, this.f20664e);
        AbstractC16852e.remoteconfig(parcel, 8, this.f20663e);
        AbstractC16852e.remoteconfig(parcel, 9, this.f20659e);
        AbstractC16852e.isPro(parcel, 10, 4);
        parcel.writeInt(this.f20661e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 11, 4);
        parcel.writeInt(this.f20657e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
