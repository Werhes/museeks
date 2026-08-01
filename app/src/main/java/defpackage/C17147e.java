package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17147e extends AbstractC6484e {
    public static final Parcelable.Creator<C17147e> CREATOR = new C6153e(9);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f33557e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public JSONObject f33558e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public String f33559e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f33560e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f33561e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f33562e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f33563e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f33564e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f33565e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public String f33566e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public float f33567e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f33568e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f33569e;

    public C17147e(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.f33567e = f;
        this.f33562e = i;
        this.f33560e = i2;
        this.f33565e = i3;
        this.f33557e = i4;
        this.f33569e = i5;
        this.f33568e = i6;
        this.f33563e = i7;
        this.f33566e = str;
        this.f33561e = i8;
        this.f33564e = i9;
        this.f33559e = str2;
        if (str2 == null) {
            this.f33558e = null;
            return;
        }
        try {
            this.f33558e = new JSONObject(this.f33559e);
        } catch (JSONException unused) {
            this.f33558e = null;
            this.f33559e = null;
        }
    }

    public static final int billing(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17147e)) {
            return false;
        }
        C17147e c17147e = (C17147e) obj;
        JSONObject jSONObject = this.f33558e;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = c17147e.f33558e;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || AbstractC18079e.ad(jSONObject, jSONObject2)) && this.f33567e == c17147e.f33567e && this.f33562e == c17147e.f33562e && this.f33560e == c17147e.f33560e && this.f33565e == c17147e.f33565e && this.f33557e == c17147e.f33557e && this.f33569e == c17147e.f33569e && this.f33568e == c17147e.f33568e && this.f33563e == c17147e.f33563e && AbstractC5942e.metrica(this.f33566e, c17147e.f33566e) && this.f33561e == c17147e.f33561e && this.f33564e == c17147e.f33564e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f33567e), Integer.valueOf(this.f33562e), Integer.valueOf(this.f33560e), Integer.valueOf(this.f33565e), Integer.valueOf(this.f33557e), Integer.valueOf(this.f33569e), Integer.valueOf(this.f33568e), Integer.valueOf(this.f33563e), this.f33566e, Integer.valueOf(this.f33561e), Integer.valueOf(this.f33564e), String.valueOf(this.f33558e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f33558e;
        this.f33559e = jSONObject == null ? null : jSONObject.toString();
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        float f = this.f33567e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeFloat(f);
        int i2 = this.f33562e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.f33560e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.f33565e;
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.f33557e;
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.f33569e;
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.f33568e;
        AbstractC16852e.isPro(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.f33563e;
        AbstractC16852e.isPro(parcel, 9, 4);
        parcel.writeInt(i8);
        AbstractC16852e.remoteconfig(parcel, 10, this.f33566e);
        int i9 = this.f33561e;
        AbstractC16852e.isPro(parcel, 11, 4);
        parcel.writeInt(i9);
        int i10 = this.f33564e;
        AbstractC16852e.isPro(parcel, 12, 4);
        parcel.writeInt(i10);
        AbstractC16852e.remoteconfig(parcel, 13, this.f33559e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
