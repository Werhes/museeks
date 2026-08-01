package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14290e implements Parcelable {
    public static final Parcelable.Creator<C14290e> CREATOR = new C1928e(11);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f28262e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f28263e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final UUID f28264e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f28265e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f28266e;

    public C14290e(Parcel parcel) {
        this.f28264e = new UUID(parcel.readLong(), parcel.readLong());
        this.f28263e = parcel.readString();
        String readString = parcel.readString();
        String str = AbstractC9413e.ad;
        this.f28265e = readString;
        this.f28262e = parcel.createByteArray();
    }

    public C14290e(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f28264e = uuid;
        this.f28263e = str;
        str2.getClass();
        this.f28265e = AbstractC8542e.amazon(str2);
        this.f28262e = bArr;
    }

    public final boolean ad(UUID uuid) {
        UUID uuid2 = AbstractC18394e.vip;
        UUID uuid3 = this.f28264e;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14290e)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C14290e c14290e = (C14290e) obj;
        return Objects.equals(this.f28263e, c14290e.f28263e) && Objects.equals(this.f28265e, c14290e.f28265e) && Objects.equals(this.f28264e, c14290e.f28264e) && Arrays.equals(this.f28262e, c14290e.f28262e);
    }

    public final int hashCode() {
        if (this.f28266e == 0) {
            int hashCode = this.f28264e.hashCode() * 31;
            String str = this.f28263e;
            this.f28266e = Arrays.hashCode(this.f28262e) + AbstractC1786e.advert((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f28265e);
        }
        return this.f28266e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f28264e;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f28263e);
        parcel.writeString(this.f28265e);
        parcel.writeByteArray(this.f28262e);
    }
}
