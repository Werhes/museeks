package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0849e extends AbstractC6484e {
    public static final Parcelable.Creator<C0849e> CREATOR;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3231e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f3232e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f3233e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f3234e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f3235e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C15940e f3236e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public String f3237e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f3238e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f3239e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public JSONObject f3241e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f3242e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f3243e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public long[] f3244e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C10806e f3245e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public C17450e f3246e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public double f3247e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f3248e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public double f3249e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public MediaInfo f3251e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f3252e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3253e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public C15760e f3254e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final ArrayList f3240e = new ArrayList();

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final SparseArray f3250e = new SparseArray();

    static {
        AbstractC9528e.billing("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new C10765e(28);
    }

    public C0849e(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, C17450e c17450e, C15760e c15760e, C15940e c15940e, C10806e c10806e) {
        this.f3251e = mediaInfo;
        this.f3239e = j;
        this.f3234e = i;
        this.f3247e = d;
        this.f3231e = i2;
        this.f3253e = i3;
        this.f3252e = j2;
        this.f3243e = j3;
        this.f3249e = d2;
        this.f3235e = z;
        this.f3244e = jArr;
        this.f3233e = i4;
        this.f3232e = i5;
        this.f3237e = str;
        if (str != null) {
            try {
                this.f3241e = new JSONObject(this.f3237e);
            } catch (JSONException unused) {
                this.f3241e = null;
                this.f3237e = null;
            }
        } else {
            this.f3241e = null;
        }
        this.f3242e = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            yandex(arrayList);
        }
        this.f3238e = z2;
        this.f3246e = c17450e;
        this.f3254e = c15760e;
        this.f3236e = c15940e;
        this.f3245e = c10806e;
        boolean z3 = false;
        if (c10806e != null && c10806e.f21426e) {
            z3 = true;
        }
        this.f3248e = z3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023f, code lost:
    
        if (r12 != 3) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0248, code lost:
    
        if (r2 == 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01af, code lost:
    
        if (r32.f3244e != null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0461 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0390 A[Catch: JSONException -> 0x039b, TryCatch #2 {JSONException -> 0x039b, blocks: (B:320:0x036a, B:322:0x0390, B:323:0x0391), top: B:319:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, eُٖؖ] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, eٕٜۙ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int billing(org.json.JSONObject r33, int r34) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0849e.billing(org.json.JSONObject, int):int");
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof C0849e) {
                C0849e c0849e = (C0849e) obj;
                if ((this.f3241e == null) == (c0849e.f3241e == null) && this.f3239e == c0849e.f3239e && this.f3234e == c0849e.f3234e && this.f3247e == c0849e.f3247e && this.f3231e == c0849e.f3231e && this.f3253e == c0849e.f3253e && this.f3252e == c0849e.f3252e && this.f3249e == c0849e.f3249e && this.f3235e == c0849e.f3235e && this.f3233e == c0849e.f3233e && this.f3232e == c0849e.f3232e && this.f3242e == c0849e.f3242e && Arrays.equals(this.f3244e, c0849e.f3244e) && AbstractC5942e.metrica(Long.valueOf(this.f3243e), Long.valueOf(c0849e.f3243e)) && AbstractC5942e.metrica(this.f3240e, c0849e.f3240e) && AbstractC5942e.metrica(this.f3251e, c0849e.f3251e) && (((jSONObject = this.f3241e) == null || (jSONObject2 = c0849e.f3241e) == null || AbstractC18079e.ad(jSONObject, jSONObject2)) && this.f3238e == c0849e.f3238e && AbstractC5942e.metrica(this.f3246e, c0849e.f3246e) && AbstractC5942e.metrica(this.f3254e, c0849e.f3254e) && AbstractC5942e.metrica(this.f3236e, c0849e.f3236e) && AbstractC5729e.vip(this.f3245e, c0849e.f3245e) && this.f3248e == c0849e.f3248e)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3251e, Long.valueOf(this.f3239e), Integer.valueOf(this.f3234e), Double.valueOf(this.f3247e), Integer.valueOf(this.f3231e), Integer.valueOf(this.f3253e), Long.valueOf(this.f3252e), Long.valueOf(this.f3243e), Double.valueOf(this.f3249e), Boolean.valueOf(this.f3235e), Integer.valueOf(Arrays.hashCode(this.f3244e)), Integer.valueOf(this.f3233e), Integer.valueOf(this.f3232e), String.valueOf(this.f3241e), Integer.valueOf(this.f3242e), this.f3240e, Boolean.valueOf(this.f3238e), this.f3246e, this.f3254e, this.f3236e, this.f3245e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f3241e;
        this.f3237e = jSONObject == null ? null : jSONObject.toString();
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 2, this.f3251e, i);
        long j = this.f3239e;
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.f3234e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.f3247e;
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.f3231e;
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f3253e;
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.f3252e;
        AbstractC16852e.isPro(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.f3243e;
        AbstractC16852e.isPro(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.f3249e;
        AbstractC16852e.isPro(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.f3235e;
        AbstractC16852e.isPro(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC16852e.admob(parcel, 12, this.f3244e);
        int i5 = this.f3233e;
        AbstractC16852e.isPro(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.f3232e;
        AbstractC16852e.isPro(parcel, 14, 4);
        parcel.writeInt(i6);
        AbstractC16852e.remoteconfig(parcel, 15, this.f3237e);
        int i7 = this.f3242e;
        AbstractC16852e.isPro(parcel, 16, 4);
        parcel.writeInt(i7);
        AbstractC16852e.isVip(parcel, 17, this.f3240e);
        boolean z2 = this.f3238e;
        AbstractC16852e.isPro(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC16852e.subscription(parcel, 19, this.f3246e, i);
        AbstractC16852e.subscription(parcel, 20, this.f3254e, i);
        AbstractC16852e.subscription(parcel, 21, this.f3236e, i);
        AbstractC16852e.subscription(parcel, 22, this.f3245e, i);
        AbstractC16852e.ads(parcel, applovin);
    }

    public final void yandex(List list) {
        ArrayList arrayList = this.f3240e;
        arrayList.clear();
        SparseArray sparseArray = this.f3250e;
        sparseArray.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C12481e c12481e = (C12481e) list.get(i);
                arrayList.add(c12481e);
                sparseArray.put(c12481e.f24982e, Integer.valueOf(i));
            }
        }
    }
}
