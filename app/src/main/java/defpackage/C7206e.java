package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7206e extends AbstractC6484e {
    public static final Parcelable.Creator<C7206e> CREATOR = new C6153e(28);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f14714e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f14715e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f14716e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f14717e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f14718e;

    public C7206e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f14718e = bArr;
        this.f14716e = bArr2;
        this.f14715e = bArr3;
        this.f14717e = bArr4;
        this.f14714e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7206e) {
            C7206e c7206e = (C7206e) obj;
            if (Arrays.equals(this.f14718e, c7206e.f14718e) && Arrays.equals(this.f14716e, c7206e.f14716e) && Arrays.equals(this.f14715e, c7206e.f14715e) && Arrays.equals(this.f14717e, c7206e.f14717e) && Arrays.equals(this.f14714e, c7206e.f14714e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f14718e)), Integer.valueOf(Arrays.hashCode(this.f14716e)), Integer.valueOf(Arrays.hashCode(this.f14715e)), Integer.valueOf(Arrays.hashCode(this.f14717e)), Integer.valueOf(Arrays.hashCode(this.f14714e))});
    }

    public final String toString() {
        String sb;
        byte[] bArr = this.f14718e;
        if (bArr != null && bArr.length == 6) {
            StringBuilder sb2 = new StringBuilder(18);
            int i = 0;
            for (int i2 = 0; i2 < 6; i2++) {
                byte b = bArr[i2];
                if (sb2.length() > 0) {
                    sb2.append(':');
                }
                sb2.append(String.format("%02x", Byte.valueOf(b)));
            }
            sb = sb2.toString();
            while (true) {
                int length = sb.length();
                if (i >= length) {
                    break;
                }
                char charAt = sb.charAt(i);
                if (charAt < 'a' || charAt > 'z') {
                    i++;
                } else {
                    char[] charArray = sb.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (c >= 'a' && c <= 'z') {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    sb = String.valueOf(charArray);
                }
            }
        } else {
            sb = null;
        }
        byte[] bArr2 = this.f14716e;
        Integer valueOf = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.f14715e;
        Integer valueOf2 = bArr3 == null ? null : Integer.valueOf(Arrays.hashCode(bArr3));
        byte[] bArr4 = this.f14717e;
        Integer valueOf3 = bArr4 == null ? null : Integer.valueOf(Arrays.hashCode(bArr4));
        byte[] bArr5 = this.f14714e;
        return "BleConnectivityInfo:<bleMacAddress hash: " + sb + ", bleGattCharacteristic hash: " + valueOf + ", actions hash: " + valueOf2 + ", psm hash: " + valueOf3 + ", deviceToken hash : " + (bArr5 != null ? Integer.valueOf(Arrays.hashCode(bArr5)) : null) + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        byte[] bArr = this.f14718e;
        AbstractC16852e.mopub(parcel, 1, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f14716e;
        AbstractC16852e.mopub(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone());
        byte[] bArr3 = this.f14715e;
        AbstractC16852e.mopub(parcel, 3, bArr3 == null ? null : (byte[]) bArr3.clone());
        byte[] bArr4 = this.f14717e;
        AbstractC16852e.mopub(parcel, 4, bArr4 == null ? null : (byte[]) bArr4.clone());
        byte[] bArr5 = this.f14714e;
        AbstractC16852e.mopub(parcel, 5, bArr5 != null ? (byte[]) bArr5.clone() : null);
        AbstractC16852e.ads(parcel, applovin);
    }
}
