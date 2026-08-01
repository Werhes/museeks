package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14758e extends AbstractC6484e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Integer f29188e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final PendingIntent f29189e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f29190e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f29191e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f29192e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C14758e f29187e = new C14758e(0, null, null);
    public static final Parcelable.Creator<C14758e> CREATOR = new C1318e(3);

    public C14758e(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.f29192e = i;
        this.f29190e = i2;
        this.f29189e = pendingIntent;
        this.f29191e = str;
        this.f29188e = num;
    }

    public C14758e(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }

    public static String billing(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        return "SIGN_IN_FAILED";
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        return "SERVICE_UPDATING";
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14758e)) {
            return false;
        }
        C14758e c14758e = (C14758e) obj;
        return this.f29190e == c14758e.f29190e && AbstractC5729e.vip(this.f29189e, c14758e.f29189e) && AbstractC5729e.vip(this.f29191e, c14758e.f29191e) && AbstractC5729e.vip(this.f29188e, c14758e.f29188e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29190e), this.f29189e, this.f29191e, this.f29188e});
    }

    public final String toString() {
        C11883e c11883e = new C11883e(5, this);
        c11883e.vip(billing(this.f29190e), "statusCode");
        c11883e.vip(this.f29189e, "resolution");
        c11883e.vip(this.f29191e, "message");
        c11883e.vip(this.f29188e, "clientMethodKey");
        return c11883e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f29192e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f29190e);
        AbstractC16852e.subscription(parcel, 3, this.f29189e, i);
        AbstractC16852e.remoteconfig(parcel, 4, this.f29191e);
        AbstractC16852e.Signature(parcel, 5, this.f29188e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
