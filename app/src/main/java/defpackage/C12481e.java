package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12481e extends AbstractC6484e {
    public static final Parcelable.Creator<C12481e> CREATOR = new C10765e(26);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public double f24980e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f24981e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f24982e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f24983e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public double f24984e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public JSONObject f24985e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public MediaInfo f24986e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long[] f24987e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public double f24988e;

    public C12481e(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f24986e = mediaInfo;
        this.f24982e = i;
        this.f24981e = z;
        this.f24984e = d;
        this.f24980e = d2;
        this.f24988e = d3;
        this.f24987e = jArr;
        this.f24983e = str;
        if (str == null) {
            this.f24985e = null;
            return;
        }
        try {
            this.f24985e = new JSONObject(this.f24983e);
        } catch (JSONException unused) {
            this.f24985e = null;
            this.f24983e = null;
        }
    }

    public C12481e(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        billing(jSONObject);
    }

    public final boolean billing(JSONObject jSONObject) {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.f24986e = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.f24982e != (i = jSONObject.getInt("itemId"))) {
            this.f24982e = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.f24981e != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.f24981e = z2;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) != Double.isNaN(this.f24984e) || (!Double.isNaN(optDouble) && Math.abs(optDouble - this.f24984e) > 1.0E-7d)) {
            this.f24984e = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.f24980e) > 1.0E-7d) {
                this.f24980e = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f24988e) > 1.0E-7d) {
                this.f24988e = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.f24987e;
            if (jArr2 != null && jArr2.length == length) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.f24987e[i3] == jArr[i3]) {
                    }
                }
            }
            z3 = true;
            break;
        } else {
            jArr = null;
        }
        if (z3) {
            this.f24987e = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.f24985e = jSONObject.getJSONObject("customData");
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12481e)) {
            return false;
        }
        C12481e c12481e = (C12481e) obj;
        JSONObject jSONObject = this.f24985e;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = c12481e.f24985e;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || AbstractC18079e.ad(jSONObject, jSONObject2)) && AbstractC5942e.metrica(this.f24986e, c12481e.f24986e) && this.f24982e == c12481e.f24982e && this.f24981e == c12481e.f24981e && ((Double.isNaN(this.f24984e) && Double.isNaN(c12481e.f24984e)) || this.f24984e == c12481e.f24984e) && this.f24980e == c12481e.f24980e && this.f24988e == c12481e.f24988e && Arrays.equals(this.f24987e, c12481e.f24987e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24986e, Integer.valueOf(this.f24982e), Boolean.valueOf(this.f24981e), Double.valueOf(this.f24984e), Double.valueOf(this.f24980e), Double.valueOf(this.f24988e), Integer.valueOf(Arrays.hashCode(this.f24987e)), String.valueOf(this.f24985e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f24985e;
        this.f24983e = jSONObject == null ? null : jSONObject.toString();
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 2, this.f24986e, i);
        int i2 = this.f24982e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.f24981e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.f24984e;
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.f24980e;
        AbstractC16852e.isPro(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.f24988e;
        AbstractC16852e.isPro(parcel, 7, 8);
        parcel.writeDouble(d3);
        AbstractC16852e.admob(parcel, 8, this.f24987e);
        AbstractC16852e.remoteconfig(parcel, 9, this.f24983e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
