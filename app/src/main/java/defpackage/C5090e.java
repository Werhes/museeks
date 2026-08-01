package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5090e extends AbstractC6484e {
    public static final Parcelable.Creator<C5090e> CREATOR = new C6153e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C15924e f10923e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f10924e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f10925e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f10926e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f10927e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C13561e f10928e;

    public C5090e(String str, int i, int i2, int i3, C15924e c15924e, C13561e c13561e) {
        this.f10927e = str;
        this.f10925e = i;
        this.f10924e = i2;
        this.f10926e = i3;
        this.f10923e = c15924e;
        this.f10928e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5090e) {
            C5090e c5090e = (C5090e) obj;
            if (AbstractC5729e.vip(this.f10927e, c5090e.f10927e) && AbstractC5729e.vip(Integer.valueOf(this.f10925e), Integer.valueOf(c5090e.f10925e)) && AbstractC5729e.vip(Integer.valueOf(this.f10924e), Integer.valueOf(c5090e.f10924e)) && AbstractC5729e.vip(Integer.valueOf(this.f10926e), Integer.valueOf(c5090e.f10926e)) && AbstractC5729e.vip(this.f10923e, c5090e.f10923e) && AbstractC5729e.vip(this.f10928e, c5090e.f10928e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10927e, Integer.valueOf(this.f10925e), Integer.valueOf(this.f10924e), Integer.valueOf(this.f10926e), this.f10923e, this.f10928e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f10927e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f10925e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f10924e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f10926e);
        AbstractC16852e.subscription(parcel, 5, this.f10923e, i);
        AbstractC16852e.subscription(parcel, 6, this.f10928e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
