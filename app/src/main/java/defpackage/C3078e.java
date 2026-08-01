package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3078e extends AbstractC6484e {
    public static final Parcelable.Creator<C3078e> CREATOR = new C1318e(0);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f7151e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C2595e f7152e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f7153e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final long f7154e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f7155e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f7156e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final String f7157e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f7158e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final String f7159e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f7160e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f7161e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f7162e;

    public C3078e(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, C2595e c2595e) {
        this.f7160e = str;
        this.f7155e = str2;
        this.f7153e = j;
        this.f7158e = str3;
        this.f7151e = str4;
        this.f7162e = str5;
        this.f7161e = str6;
        this.f7156e = str7;
        this.f7159e = str8;
        this.f7154e = j2;
        this.f7157e = str9;
        this.f7152e = c2595e;
        if (TextUtils.isEmpty(str6)) {
            new JSONObject();
            return;
        }
        try {
            new JSONObject(str6);
        } catch (JSONException e) {
            Locale locale = Locale.ROOT;
            Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e.getMessage());
            this.f7161e = null;
            new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3078e)) {
            return false;
        }
        C3078e c3078e = (C3078e) obj;
        return AbstractC5942e.metrica(this.f7160e, c3078e.f7160e) && AbstractC5942e.metrica(this.f7155e, c3078e.f7155e) && this.f7153e == c3078e.f7153e && AbstractC5942e.metrica(this.f7158e, c3078e.f7158e) && AbstractC5942e.metrica(this.f7151e, c3078e.f7151e) && AbstractC5942e.metrica(this.f7162e, c3078e.f7162e) && AbstractC5942e.metrica(this.f7161e, c3078e.f7161e) && AbstractC5942e.metrica(this.f7156e, c3078e.f7156e) && AbstractC5942e.metrica(this.f7159e, c3078e.f7159e) && this.f7154e == c3078e.f7154e && AbstractC5942e.metrica(this.f7157e, c3078e.f7157e) && AbstractC5942e.metrica(this.f7152e, c3078e.f7152e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7160e, this.f7155e, Long.valueOf(this.f7153e), this.f7158e, this.f7151e, this.f7162e, this.f7161e, this.f7156e, this.f7159e, Long.valueOf(this.f7154e), this.f7157e, this.f7152e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f7160e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f7155e);
        AbstractC16852e.isPro(parcel, 4, 8);
        parcel.writeLong(this.f7153e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f7158e);
        AbstractC16852e.remoteconfig(parcel, 6, this.f7151e);
        AbstractC16852e.remoteconfig(parcel, 7, this.f7162e);
        AbstractC16852e.remoteconfig(parcel, 8, this.f7161e);
        AbstractC16852e.remoteconfig(parcel, 9, this.f7156e);
        AbstractC16852e.remoteconfig(parcel, 10, this.f7159e);
        AbstractC16852e.isPro(parcel, 11, 8);
        parcel.writeLong(this.f7154e);
        AbstractC16852e.remoteconfig(parcel, 12, this.f7157e);
        AbstractC16852e.subscription(parcel, 13, this.f7152e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
