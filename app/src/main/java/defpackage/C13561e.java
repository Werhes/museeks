package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13561e extends AbstractC6484e {
    public static final Parcelable.Creator<C13561e> CREATOR = new C0928e(4);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f26865e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f26866e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f26867e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f26868e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f26869e;

    public C13561e(int i, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f26869e = str;
        this.f26867e = bArr;
        this.f26866e = bArr2;
        this.f26868e = bArr3;
        this.f26865e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13561e) {
            C13561e c13561e = (C13561e) obj;
            if (AbstractC5729e.vip(this.f26869e, c13561e.f26869e) && Arrays.equals(this.f26867e, c13561e.f26867e) && Arrays.equals(this.f26866e, c13561e.f26866e) && Arrays.equals(this.f26868e, c13561e.f26868e) && this.f26865e == c13561e.f26865e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26869e, Integer.valueOf(Arrays.hashCode(this.f26867e)), Integer.valueOf(Arrays.hashCode(this.f26866e)), Integer.valueOf(Arrays.hashCode(this.f26868e)), Integer.valueOf(this.f26865e)});
    }

    public final String toString() {
        byte[] bArr = this.f26867e;
        String arrays = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.f26868e;
        String arrays2 = bArr2 != null ? Arrays.toString(bArr2) : null;
        int i = this.f26865e;
        return AbstractC4653e.ads(AbstractC17861e.tapsense("ConnectionsDevice:<endpointId: ", this.f26869e, ", endpointInfo: ", arrays, ", connectivityBytes: "), arrays2, ", instanceType : ", i != 0 ? i != 1 ? i != 2 ? "OTHER" : "Secondary" : "Main" : "UNKNOWN", ">");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f26869e);
        byte[] bArr = this.f26867e;
        AbstractC16852e.mopub(parcel, 2, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f26866e;
        AbstractC16852e.mopub(parcel, 3, bArr2 != null ? (byte[]) bArr2.clone() : null);
        AbstractC16852e.mopub(parcel, 4, this.f26868e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f26865e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
