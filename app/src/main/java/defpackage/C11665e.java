package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11665e extends AbstractC6484e implements Comparable {
    public static final Parcelable.Creator<C11665e> CREATOR = new C18517e(19);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f23435e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f23436e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f23437e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f23438e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final double f23439e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f23440e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f23441e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f23442e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f23443e;

    public C11665e(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.f23441e = str;
        this.f23437e = j;
        this.f23436e = z;
        this.f23439e = d;
        this.f23435e = str2;
        this.f23443e = bArr;
        this.f23442e = i;
        this.f23438e = i2;
        this.f23440e = i3;
    }

    public final void billing(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.f23441e;
        sb.append(str);
        sb.append(", ");
        int i = this.f23442e;
        if (i == 1) {
            sb.append(this.f23437e);
        } else if (i == 2) {
            sb.append(this.f23436e);
        } else if (i == 3) {
            sb.append(this.f23439e);
        } else if (i == 4) {
            sb.append("'");
            String str2 = this.f23435e;
            AbstractC9528e.startapp(str2);
            sb.append(str2);
            sb.append("'");
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append("'");
            byte[] bArr = this.f23443e;
            AbstractC9528e.startapp(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.f23438e);
        sb.append(", ");
        sb.append(this.f23440e);
        sb.append(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            eُِِ r9 = (defpackage.C11665e) r9
            java.lang.String r0 = r9.f23441e
            java.lang.String r1 = r8.f23441e
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            int r0 = r9.f23442e
            r1 = -1
            r2 = 0
            r3 = 1
            int r4 = r8.f23442e
            if (r4 >= r0) goto L18
            r0 = r1
            goto L1d
        L18:
            if (r4 == r0) goto L1c
            r0 = r3
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == 0) goto L20
            return r0
        L20:
            if (r4 == r3) goto L99
            r0 = 2
            if (r4 == r0) goto L8f
            r0 = 3
            if (r4 == r0) goto L86
            r0 = 4
            if (r4 == r0) goto L74
            r0 = 5
            if (r4 != r0) goto L59
            byte[] r9 = r9.f23443e
            byte[] r0 = r8.f23443e
            if (r0 != r9) goto L36
            goto La4
        L36:
            if (r0 != 0) goto L3a
            goto La1
        L3a:
            if (r9 != 0) goto L3e
            goto La5
        L3e:
            r4 = r2
        L3f:
            int r5 = r9.length
            int r6 = r0.length
            int r7 = java.lang.Math.min(r6, r5)
            if (r4 >= r7) goto L52
            r5 = r0[r4]
            r6 = r9[r4]
            int r5 = r5 - r6
            if (r5 == 0) goto L4f
            return r5
        L4f:
            int r4 = r4 + 1
            goto L3f
        L52:
            if (r6 >= r5) goto L55
            return r1
        L55:
            if (r6 == r5) goto L58
            return r3
        L58:
            return r2
        L59:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 20
            r1.<init>(r0)
            java.lang.String r0 = "Invalid enum value: "
            java.lang.String r0 = defpackage.AbstractC8647e.isPro(r4, r0, r1)
            r9.<init>(r0)
            throw r9
        L74:
            java.lang.String r9 = r9.f23435e
            java.lang.String r0 = r8.f23435e
            if (r0 != r9) goto L7b
            goto La4
        L7b:
            if (r0 != 0) goto L7e
            goto La1
        L7e:
            if (r9 != 0) goto L81
            goto La5
        L81:
            int r9 = r0.compareTo(r9)
            return r9
        L86:
            double r0 = r8.f23439e
            double r2 = r9.f23439e
            int r9 = java.lang.Double.compare(r0, r2)
            return r9
        L8f:
            boolean r9 = r9.f23436e
            boolean r0 = r8.f23436e
            if (r0 != r9) goto L96
            goto La4
        L96:
            if (r0 == 0) goto La1
            goto La5
        L99:
            long r4 = r8.f23437e
            long r6 = r9.f23437e
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto La2
        La1:
            return r1
        La2:
            if (r9 != 0) goto La5
        La4:
            return r2
        La5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11665e.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11665e) {
            C11665e c11665e = (C11665e) obj;
            if (AbstractC1216e.Signature(this.f23441e, c11665e.f23441e)) {
                int i = c11665e.f23442e;
                int i2 = this.f23442e;
                if (i2 == i && this.f23438e == c11665e.f23438e && this.f23440e == c11665e.f23440e) {
                    if (i2 == 1) {
                        return this.f23437e == c11665e.f23437e;
                    }
                    if (i2 == 2) {
                        return this.f23436e == c11665e.f23436e;
                    }
                    if (i2 == 3) {
                        return this.f23439e == c11665e.f23439e;
                    }
                    if (i2 == 4) {
                        return AbstractC1216e.Signature(this.f23435e, c11665e.f23435e);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f23443e, c11665e.f23443e);
                    }
                    throw new AssertionError(AbstractC8647e.isPro(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        billing(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f23441e;
        boolean z = str == null;
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        if (!z) {
            AbstractC16852e.remoteconfig(parcel, 2, str);
        }
        long j = this.f23437e;
        if (j != 0) {
            AbstractC16852e.isPro(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.f23436e) {
            AbstractC16852e.isPro(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.f23439e;
        if (d != 0.0d) {
            AbstractC16852e.isPro(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.f23435e;
        if (str2 != null) {
            AbstractC16852e.remoteconfig(parcel, 6, str2);
        }
        byte[] bArr = this.f23443e;
        if (bArr != null) {
            AbstractC16852e.mopub(parcel, 7, bArr);
        }
        int i2 = this.f23442e;
        if (i2 != 0) {
            AbstractC16852e.isPro(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.f23438e;
        if (i3 != 0) {
            AbstractC16852e.isPro(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.f23440e;
        if (i4 != 0) {
            AbstractC16852e.isPro(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        AbstractC16852e.ads(parcel, applovin);
    }
}
