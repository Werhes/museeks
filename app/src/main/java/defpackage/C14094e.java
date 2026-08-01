package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٛٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14094e extends AbstractC6484e implements Comparable {
    public static final Parcelable.Creator<C14094e> CREATOR = new C18517e(10);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String[] f27860e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11665e[] f27861e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final TreeMap f27862e = new TreeMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f27863e;

    public C14094e(int i, C11665e[] c11665eArr, String[] strArr) {
        this.f27863e = i;
        this.f27861e = c11665eArr;
        for (C11665e c11665e : c11665eArr) {
            this.f27862e.put(c11665e.f23441e, c11665e);
        }
        this.f27860e = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f27863e - ((C14094e) obj).f27863e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14094e)) {
            return false;
        }
        C14094e c14094e = (C14094e) obj;
        return this.f27863e == c14094e.f27863e && AbstractC1216e.Signature(this.f27862e, c14094e.f27862e) && Arrays.equals(this.f27860e, c14094e.f27860e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f27863e);
        sb.append(", (");
        Iterator it = this.f27862e.values().iterator();
        while (it.hasNext()) {
            sb.append((C11665e) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f27860e;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f27863e);
        AbstractC16852e.tapsense(parcel, 3, this.f27861e, i);
        AbstractC16852e.pro(parcel, 4, this.f27860e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
