package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10936e extends AbstractC6484e {
    public static final Parcelable.Creator<C10936e> CREATOR = new C18517e(9);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final List f21649e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f21650e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C3990e f21651e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C18131e f21652e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f21653e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C3156e f21654e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14455e f21655e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final List f21656e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final List f21657e;

    public C10936e(C14455e c14455e, C3990e c3990e, byte[] bArr, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, C18131e c18131e, C3156e c3156e) {
        this.f21655e = c14455e;
        this.f21651e = c3990e;
        this.f21650e = bArr;
        this.f21653e = z;
        this.f21649e = arrayList;
        this.f21657e = arrayList2;
        this.f21656e = arrayList3;
        this.f21652e = c18131e;
        this.f21654e = c3156e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10936e) {
            C10936e c10936e = (C10936e) obj;
            if (AbstractC5729e.vip(this.f21655e, c10936e.f21655e) && AbstractC5729e.vip(this.f21651e, c10936e.f21651e) && Arrays.equals(this.f21650e, c10936e.f21650e) && this.f21653e == c10936e.f21653e && AbstractC5729e.vip(this.f21649e, c10936e.f21649e) && AbstractC5729e.vip(this.f21657e, c10936e.f21657e) && AbstractC5729e.vip(this.f21656e, c10936e.f21656e) && AbstractC5729e.vip(this.f21652e, c10936e.f21652e) && AbstractC5729e.vip(this.f21654e, c10936e.f21654e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21655e, this.f21651e, Boolean.valueOf(this.f21653e), this.f21649e, this.f21657e, this.f21656e, this.f21652e, this.f21654e});
    }

    public final String toString() {
        return String.format(Locale.US, "<DataElementCollection: sequenceNumber=%s, castId=%s, deduplicationHint=%s, deduplicationHintEnabled=%s, bleGattConnectivityInfo = %s, wifiLanConnectivityInfoList = %s, bluetoothConnectivityInfoList = %s, connectivityCapability = %s, deviceType = %s>", this.f21655e, this.f21651e, Arrays.toString(this.f21650e), Boolean.valueOf(this.f21653e), this.f21649e, this.f21657e, this.f21656e, this.f21652e, this.f21654e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f21655e, i);
        AbstractC16852e.subscription(parcel, 2, this.f21651e, i);
        AbstractC16852e.mopub(parcel, 3, this.f21650e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f21653e ? 1 : 0);
        AbstractC16852e.isVip(parcel, 5, this.f21649e);
        AbstractC16852e.isVip(parcel, 6, this.f21657e);
        AbstractC16852e.isVip(parcel, 7, this.f21656e);
        AbstractC16852e.subscription(parcel, 8, this.f21652e, i);
        AbstractC16852e.subscription(parcel, 9, this.f21654e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
