package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6734e extends AbstractC6484e {
    public static final Parcelable.Creator<C6734e> CREATOR = new C18517e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[][] f13912e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[][] f13913e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final byte[][] f13914e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f13915e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final byte[][] f13916e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[][] f13917e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int[] f13918e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f13919e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int[] f13920e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[][] f13921e;

    public C6734e(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f13919e = str;
        this.f13915e = bArr;
        this.f13913e = bArr2;
        this.f13917e = bArr3;
        this.f13912e = bArr4;
        this.f13921e = bArr5;
        this.f13920e = iArr;
        this.f13916e = bArr6;
        this.f13918e = iArr2;
        this.f13914e = bArr7;
    }

    public static List adcel(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new C4445e(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void billing(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            AbstractC9528e.startapp(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static Set startapp(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet mopub = AbstractC6100e.mopub(length);
        for (byte[] bArr2 : bArr) {
            AbstractC9528e.startapp(bArr2);
            mopub.add(Base64.encodeToString(bArr2, 3));
        }
        return mopub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        int length;
        int length2;
        if (obj instanceof C6734e) {
            C6734e c6734e = (C6734e) obj;
            if (AbstractC1216e.Signature(this.f13919e, c6734e.f13919e) && AbstractC1216e.Signature(yandex(), c6734e.yandex()) && AbstractC1216e.Signature(startapp(this.f13913e), startapp(c6734e.f13913e)) && AbstractC1216e.Signature(startapp(this.f13917e), startapp(c6734e.f13917e)) && AbstractC1216e.Signature(startapp(this.f13912e), startapp(c6734e.f13912e)) && AbstractC1216e.Signature(startapp(this.f13921e), startapp(c6734e.f13921e))) {
                int[] iArr = this.f13920e;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    obj2 = Collections.EMPTY_SET;
                } else {
                    obj2 = AbstractC6100e.mopub(length2);
                    for (int i : iArr) {
                        obj2.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = c6734e.f13920e;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    obj3 = Collections.EMPTY_SET;
                } else {
                    obj3 = AbstractC6100e.mopub(length);
                    for (int i2 : iArr2) {
                        obj3.add(Integer.valueOf(i2));
                    }
                }
                if (AbstractC1216e.Signature(obj2, obj3) && AbstractC1216e.Signature(adcel(this.f13918e), adcel(c6734e.f13918e)) && AbstractC1216e.Signature(startapp(this.f13914e), startapp(c6734e.f13914e))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.f13919e;
        sb.append(str == null ? "null" : AbstractC8647e.ads(new StringBuilder(str.length() + 2), "'", str, "'"));
        sb.append(", direct==");
        byte[] bArr = this.f13915e;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        billing(sb, "GAIA=", this.f13913e);
        sb.append(", ");
        billing(sb, "PSEUDO=", this.f13917e);
        sb.append(", ");
        billing(sb, "ALWAYS=", this.f13912e);
        sb.append(", ");
        billing(sb, "OTHER=", this.f13921e);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f13920e));
        sb.append(", ");
        billing(sb, "directs=", this.f13916e);
        sb.append(", genDims=");
        sb.append(Arrays.toString(adcel(this.f13918e).toArray()));
        sb.append(", ");
        billing(sb, "external=", this.f13914e);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f13919e);
        AbstractC16852e.mopub(parcel, 3, this.f13915e);
        AbstractC16852e.advert(parcel, 4, this.f13913e);
        AbstractC16852e.advert(parcel, 5, this.f13917e);
        AbstractC16852e.advert(parcel, 6, this.f13912e);
        AbstractC16852e.advert(parcel, 7, this.f13921e);
        AbstractC16852e.amazon(parcel, 8, this.f13920e);
        AbstractC16852e.advert(parcel, 9, this.f13916e);
        AbstractC16852e.amazon(parcel, 10, this.f13918e);
        AbstractC16852e.advert(parcel, 11, this.f13914e);
        AbstractC16852e.ads(parcel, applovin);
    }

    public final Set yandex() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.f13916e;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.f13915e;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return startapp((byte[][]) arrayList.toArray(new byte[0]));
    }
}
