package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15924e extends AbstractC6484e {
    public static final Parcelable.Creator<C15924e> CREATOR = new C18517e(15);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final String[] f31367e = {"UNKNOWN", "PHONE", "TABLET", "DISPLAY", "LAPTOP", "TV", "WATCH", "CHROMEOS", "FOLDABLE", "AUTOMOTIVE", "SPEAKER"};

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f31368e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int f31369e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C10936e f31370e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f31371e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f31372e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int f31373e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f31374e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final String f31375e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final byte[] f31376e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final byte[] f31377e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f31378e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final List f31379e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f31380e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f31381e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f31382e;

    public C15924e(long j, String str, int i, String str2, long j2, String str3, byte[] bArr, byte[] bArr2, ArrayList arrayList, int i2, byte[] bArr3, C10936e c10936e, int i3, int i4, String str4) {
        this.f31380e = j;
        this.f31374e = str;
        this.f31371e = i;
        this.f31378e = str2;
        this.f31368e = j2;
        this.f31382e = str3;
        this.f31381e = bArr;
        this.f31376e = bArr2;
        this.f31379e = arrayList;
        this.f31372e = i2;
        this.f31377e = bArr3;
        this.f31370e = c10936e;
        this.f31369e = i3;
        this.f31373e = i4;
        this.f31375e = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15924e) {
            C15924e c15924e = (C15924e) obj;
            if (AbstractC5729e.vip(Long.valueOf(this.f31380e), Long.valueOf(c15924e.f31380e)) && AbstractC5729e.vip(this.f31374e, c15924e.f31374e) && AbstractC5729e.vip(Integer.valueOf(this.f31371e), Integer.valueOf(c15924e.f31371e)) && AbstractC5729e.vip(this.f31378e, c15924e.f31378e) && AbstractC5729e.vip(this.f31382e, c15924e.f31382e) && Arrays.equals(this.f31381e, c15924e.f31381e) && Arrays.equals(this.f31376e, c15924e.f31376e) && AbstractC5729e.vip(this.f31379e, c15924e.f31379e) && AbstractC5729e.vip(Integer.valueOf(this.f31372e), Integer.valueOf(c15924e.f31372e)) && Arrays.equals(this.f31377e, c15924e.f31377e) && AbstractC5729e.vip(this.f31370e, c15924e.f31370e) && AbstractC5729e.vip(Integer.valueOf(this.f31369e), Integer.valueOf(c15924e.f31369e)) && AbstractC5729e.vip(Integer.valueOf(this.f31373e), Integer.valueOf(c15924e.f31373e)) && AbstractC5729e.vip(this.f31375e, c15924e.f31375e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f31380e), this.f31374e, Integer.valueOf(this.f31371e), this.f31378e, this.f31382e, Integer.valueOf(Arrays.hashCode(this.f31381e)), Integer.valueOf(Arrays.hashCode(this.f31376e)), this.f31379e, Integer.valueOf(this.f31372e), Integer.valueOf(Arrays.hashCode(this.f31377e)), this.f31370e, Integer.valueOf(this.f31369e), Integer.valueOf(this.f31373e), this.f31375e});
    }

    public final String toString() {
        char c;
        Long valueOf = Long.valueOf(this.f31380e);
        switch (this.f31371e) {
            case 1:
                c = 1;
                break;
            case 2:
                c = 2;
                break;
            case 3:
                c = 3;
                break;
            case 4:
                c = 4;
                break;
            case 5:
                c = 5;
                break;
            case 6:
                c = 6;
                break;
            case 7:
                c = 7;
                break;
            case 8:
                c = '\b';
                break;
            case 9:
                c = '\t';
                break;
            case 10:
                c = '\n';
                break;
            default:
                c = 0;
                break;
        }
        String str = f31367e[c];
        Long valueOf2 = Long.valueOf(this.f31368e);
        byte[] bArr = this.f31381e;
        String arrays = bArr == null ? null : Arrays.toString(bArr);
        byte[] bArr2 = this.f31376e;
        Integer valueOf3 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        Integer valueOf4 = Integer.valueOf(this.f31372e);
        byte[] bArr3 = this.f31377e;
        String arrays2 = bArr3 != null ? Arrays.toString(bArr3) : null;
        Integer valueOf5 = Integer.valueOf(this.f31369e);
        int i = this.f31373e;
        return String.format("PresenceDevice:<deviceId: %s, deviceName: %s, deviceType: %s, deviceImageUrl: %s, discoveryTimestampMillis: %s, endpointId: %s, endpointInfo: %s, bluetoothMacAddress hash: %s, actions: %s, identityType: %s, connectivityBytes hash: %s, dataElements: %s, discoveryMedium: %s, instance type %s>, Dusi: %s", valueOf, this.f31374e, str, this.f31378e, valueOf2, this.f31382e, arrays, valueOf3, this.f31379e, valueOf4, arrays2, this.f31370e, valueOf5, i != 0 ? i != 1 ? i != 2 ? "OTHER" : "Secondary" : "Main" : "UNKNOWN", this.f31375e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC3362e smaato;
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 8);
        parcel.writeLong(this.f31380e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f31374e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f31371e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f31378e);
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeLong(this.f31368e);
        AbstractC16852e.remoteconfig(parcel, 6, this.f31382e);
        byte[] bArr = this.f31381e;
        AbstractC16852e.mopub(parcel, 7, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f31376e;
        AbstractC16852e.mopub(parcel, 8, bArr2 != null ? (byte[]) bArr2.clone() : null);
        Collection collection = this.f31379e;
        if (collection == null) {
            C14476e c14476e = AbstractC3362e.f7566e;
            smaato = C0473e.f2538e;
        } else {
            C14476e c14476e2 = AbstractC3362e.f7566e;
            if (collection instanceof AbstractC14292e) {
                smaato = (AbstractC3362e) ((AbstractC14292e) collection);
                if (smaato.startapp()) {
                    Object[] array = smaato.toArray(AbstractC14292e.f28267e);
                    smaato = AbstractC3362e.smaato(array.length, array);
                }
            } else {
                Object[] array2 = collection.toArray();
                int length = array2.length;
                AbstractC1396e.loadAd(length, array2);
                smaato = AbstractC3362e.smaato(length, array2);
            }
        }
        AbstractC16852e.isVip(parcel, 9, smaato);
        AbstractC16852e.isPro(parcel, 10, 4);
        parcel.writeInt(this.f31372e);
        AbstractC16852e.mopub(parcel, 11, this.f31377e);
        AbstractC16852e.subscription(parcel, 12, this.f31370e, i);
        AbstractC16852e.isPro(parcel, 13, 4);
        parcel.writeInt(this.f31369e);
        AbstractC16852e.isPro(parcel, 14, 4);
        parcel.writeInt(this.f31373e);
        AbstractC16852e.remoteconfig(parcel, 15, this.f31375e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
