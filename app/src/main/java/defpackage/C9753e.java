package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9753e extends AbstractC6484e {
    public static final Parcelable.Creator<C9753e> CREATOR = new C10765e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f19278e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f19279e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C12712e f19280e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f19281e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9753e() {
        /*
            r5 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.regex.Pattern r1 = defpackage.AbstractC5942e.ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 20
            r1.<init>(r2)
            java.lang.String r2 = r0.getLanguage()
            r1.append(r2)
            java.lang.String r2 = r0.getCountry()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 45
            if (r3 != 0) goto L26
            r1.append(r4)
            r1.append(r2)
        L26:
            java.lang.String r0 = r0.getVariant()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L36
            r1.append(r4)
            r1.append(r0)
        L36:
            java.lang.String r0 = r1.toString()
            r1 = 0
            r2 = 0
            r5.<init>(r2, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9753e.<init>():void");
    }

    public C9753e(boolean z, String str, boolean z2, C12712e c12712e) {
        this.f19281e = z;
        this.f19279e = str;
        this.f19278e = z2;
        this.f19280e = c12712e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9753e)) {
            return false;
        }
        C9753e c9753e = (C9753e) obj;
        return this.f19281e == c9753e.f19281e && AbstractC5942e.metrica(this.f19279e, c9753e.f19279e) && this.f19278e == c9753e.f19278e && AbstractC5942e.metrica(this.f19280e, c9753e.f19280e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19281e), this.f19279e, Boolean.valueOf(this.f19278e), this.f19280e});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(this.f19281e);
        sb.append(", language=");
        sb.append(this.f19279e);
        sb.append(", androidReceiverCompatible: ");
        return AbstractC8703e.signatures(sb, this.f19278e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f19281e ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 3, this.f19279e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f19278e ? 1 : 0);
        AbstractC16852e.subscription(parcel, 5, this.f19280e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
