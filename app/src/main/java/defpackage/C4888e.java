package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4888e extends AbstractC6484e {
    public static final Parcelable.Creator<C4888e> CREATOR = new C18517e(6);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f10367e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f10368e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C17206e f10369e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public byte[] f10370e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f10371e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public InterfaceC9072e f10372e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC0664e f10373e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C4681e f10374e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4888e) {
            C4888e c4888e = (C4888e) obj;
            if (AbstractC5729e.vip(this.f10372e, c4888e.f10372e) && AbstractC5729e.vip(this.f10369e, c4888e.f10369e) && AbstractC5729e.vip(this.f10368e, c4888e.f10368e) && AbstractC5729e.vip(this.f10371e, c4888e.f10371e) && AbstractC5729e.vip(Long.valueOf(this.f10367e), Long.valueOf(c4888e.f10367e)) && AbstractC5729e.vip(this.f10374e, c4888e.f10374e) && AbstractC5729e.vip(this.f10373e, c4888e.f10373e) && Arrays.equals(this.f10370e, c4888e.f10370e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10372e, this.f10369e, this.f10368e, this.f10371e, Long.valueOf(this.f10367e), this.f10374e, this.f10373e, Integer.valueOf(Arrays.hashCode(this.f10370e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        InterfaceC9072e interfaceC9072e = this.f10372e;
        AbstractC16852e.smaato(parcel, 1, interfaceC9072e == null ? null : interfaceC9072e.asBinder());
        C17206e c17206e = this.f10369e;
        AbstractC16852e.smaato(parcel, 2, c17206e == null ? null : c17206e.license);
        AbstractC16852e.remoteconfig(parcel, 3, this.f10368e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f10371e);
        long j = this.f10367e;
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeLong(j);
        AbstractC16852e.subscription(parcel, 6, this.f10374e, i);
        InterfaceC0664e interfaceC0664e = this.f10373e;
        AbstractC16852e.smaato(parcel, 7, interfaceC0664e != null ? interfaceC0664e.asBinder() : null);
        AbstractC16852e.mopub(parcel, 8, this.f10370e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
