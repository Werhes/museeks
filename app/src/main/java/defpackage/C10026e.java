package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10026e implements Parcelable {
    public static final Parcelable.Creator<C10026e> CREATOR = new C1928e(6);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Integer f19797e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Integer f19800e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public String f19801e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public Integer f19802e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public Locale f19803e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public int f19804e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public Boolean f19805e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Integer f19806e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f19807e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public CharSequence f19808e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public CharSequence f19809e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public Integer f19810e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Integer f19811e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public Integer f19812e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public Integer f19813e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public Integer f19815e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public Integer f19816e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public Integer f19817e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public Integer f19818e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Integer f19819e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public Integer f19820e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public Integer f19822e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f19823e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Integer f19824e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Integer f19825e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f19821e = 255;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f19814e = -2;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f19799e = -2;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f19798e = -2;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public Boolean f19826e = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19823e);
        parcel.writeSerializable(this.f19806e);
        parcel.writeSerializable(this.f19800e);
        parcel.writeSerializable(this.f19819e);
        parcel.writeSerializable(this.f19797e);
        parcel.writeSerializable(this.f19825e);
        parcel.writeSerializable(this.f19824e);
        parcel.writeSerializable(this.f19811e);
        parcel.writeInt(this.f19821e);
        parcel.writeString(this.f19801e);
        parcel.writeInt(this.f19814e);
        parcel.writeInt(this.f19799e);
        parcel.writeInt(this.f19798e);
        CharSequence charSequence = this.f19808e;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f19809e;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f19807e);
        parcel.writeSerializable(this.f19818e);
        parcel.writeSerializable(this.f19802e);
        parcel.writeSerializable(this.f19816e);
        parcel.writeSerializable(this.f19820e);
        parcel.writeSerializable(this.f19822e);
        parcel.writeSerializable(this.f19815e);
        parcel.writeSerializable(this.f19812e);
        parcel.writeSerializable(this.f19810e);
        parcel.writeSerializable(this.f19813e);
        parcel.writeSerializable(this.f19817e);
        parcel.writeSerializable(this.f19826e);
        parcel.writeSerializable(this.f19803e);
        parcel.writeSerializable(this.f19805e);
    }
}
