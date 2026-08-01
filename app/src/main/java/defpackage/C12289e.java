package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12289e extends AbstractC6484e {
    public static final Parcelable.Creator<C12289e> CREATOR = new C18517e(12);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final TreeMap f24657e = new TreeMap();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f24658e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f24659e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C14094e[] f24660e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f24661e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final long f24662e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f24663e;

    public C12289e(String str, String str2, C14094e[] c14094eArr, boolean z, byte[] bArr, long j) {
        this.f24661e = str;
        this.f24658e = str2;
        this.f24660e = c14094eArr;
        this.f24663e = z;
        this.f24659e = bArr;
        this.f24662e = j;
        for (C14094e c14094e : c14094eArr) {
            this.f24657e.put(Integer.valueOf(c14094e.f27863e), c14094e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12289e)) {
            return false;
        }
        C12289e c12289e = (C12289e) obj;
        return AbstractC1216e.Signature(this.f24661e, c12289e.f24661e) && AbstractC1216e.Signature(this.f24658e, c12289e.f24658e) && this.f24657e.equals(c12289e.f24657e) && this.f24663e == c12289e.f24663e && Arrays.equals(this.f24659e, c12289e.f24659e) && this.f24662e == c12289e.f24662e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24661e, this.f24658e, this.f24657e, Boolean.valueOf(this.f24663e), this.f24659e, Long.valueOf(this.f24662e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f24661e);
        sb.append("', '");
        sb.append(this.f24658e);
        sb.append("', (");
        Iterator it = this.f24657e.values().iterator();
        while (it.hasNext()) {
            sb.append((C14094e) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f24663e);
        sb.append(", ");
        byte[] bArr = this.f24659e;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        return AbstractC10257e.mopub(sb, this.f24662e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f24661e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f24658e);
        AbstractC16852e.tapsense(parcel, 4, this.f24660e, i);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f24663e ? 1 : 0);
        AbstractC16852e.mopub(parcel, 6, this.f24659e);
        AbstractC16852e.isPro(parcel, 7, 8);
        parcel.writeLong(this.f24662e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
