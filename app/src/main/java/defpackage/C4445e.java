package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4445e extends AbstractC6484e implements Comparable {
    public static final Parcelable.Creator<C4445e> CREATOR = new C18517e(22);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f9648e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f9649e;

    public C4445e(int i, int i2) {
        this.f9649e = i;
        this.f9648e = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4445e c4445e = (C4445e) obj;
        int i = c4445e.f9649e;
        int i2 = this.f9649e;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c4445e.f9648e;
        int i4 = this.f9648e;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
    
        r0 = (r3 = (defpackage.C4445e) r3).f9649e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r3 = r3.f9648e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C4445e
            if (r0 == 0) goto L1c
            eًؖۢ r3 = (defpackage.C4445e) r3
            int r0 = r3.f9649e
            int r1 = r2.f9649e
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.f9648e
            int r0 = r2.f9648e
            if (r0 >= r3) goto L17
            goto L1c
        L17:
            if (r0 <= r3) goto L1a
            goto L1c
        L1a:
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4445e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f9649e * 31) + this.f9648e;
    }

    public final String toString() {
        int i = this.f9649e;
        int length = String.valueOf(i).length();
        int i2 = this.f9648e;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        sb.append("GenericDimension(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f9649e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f9648e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
