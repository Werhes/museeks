package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12487e extends AbstractC6484e {
    public static final Parcelable.Creator<C12487e> CREATOR;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C4941e f24999e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C10451e f25000e = new C10451e(false);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C0669e f25001e = new C0669e(0);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f25002e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final boolean f25003e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final List f25004e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f25005e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final boolean f25006e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final boolean f25007e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final boolean f25008e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f25009e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final boolean f25010e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C10451e f25011e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C0669e f25012e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final double f25013e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final boolean f25014e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C9753e f25015e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final boolean f25016e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f25017e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f25018e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C4941e f25019e;

    static {
        new C1727e(C1727e.f4685e, C1727e.f4686e, 10000L, null, AbstractC13362e.smaato("smallIconDrawableResId"), AbstractC13362e.smaato("stopLiveStreamDrawableResId"), AbstractC13362e.smaato("pauseDrawableResId"), AbstractC13362e.smaato("playDrawableResId"), AbstractC13362e.smaato("skipNextDrawableResId"), AbstractC13362e.smaato("skipPrevDrawableResId"), AbstractC13362e.smaato("forwardDrawableResId"), AbstractC13362e.smaato("forward10DrawableResId"), AbstractC13362e.smaato("forward30DrawableResId"), AbstractC13362e.smaato("rewindDrawableResId"), AbstractC13362e.smaato("rewind10DrawableResId"), AbstractC13362e.smaato("rewind30DrawableResId"), AbstractC13362e.smaato("disconnectDrawableResId"), AbstractC13362e.smaato("notificationImageSizeDimenResId"), AbstractC13362e.smaato("castingToDeviceStringResId"), AbstractC13362e.smaato("stopLiveStreamStringResId"), AbstractC13362e.smaato("pauseStringResId"), AbstractC13362e.smaato("playStringResId"), AbstractC13362e.smaato("skipNextStringResId"), AbstractC13362e.smaato("skipPrevStringResId"), AbstractC13362e.smaato("forwardStringResId"), AbstractC13362e.smaato("forward10StringResId"), AbstractC13362e.smaato("forward30StringResId"), AbstractC13362e.smaato("rewindStringResId"), AbstractC13362e.smaato("rewind10StringResId"), AbstractC13362e.smaato("rewind30StringResId"), AbstractC13362e.smaato("disconnectStringResId"), null, false, false);
        f24999e = new C4941e("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new C18517e(29);
    }

    public C12487e(String str, ArrayList arrayList, boolean z, C9753e c9753e, boolean z2, C4941e c4941e, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, C10451e c10451e, C0669e c0669e, boolean z9, boolean z10) {
        this.f25017e = true == TextUtils.isEmpty(str) ? BuildConfig.FLAVOR : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f25009e = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f25005e = z;
        this.f25015e = c9753e == null ? new C9753e() : c9753e;
        this.f25002e = z2;
        this.f25019e = c4941e;
        this.f25018e = z3;
        this.f25013e = d;
        this.f25016e = z4;
        this.f25006e = z5;
        this.f25014e = z6;
        this.f25004e = arrayList2;
        this.f25003e = z7;
        this.f25007e = z8;
        this.f25011e = c10451e;
        this.f25012e = c0669e;
        this.f25010e = z9;
        this.f25008e = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f25017e);
        AbstractC16852e.signatures(parcel, 3, DesugarCollections.unmodifiableList(this.f25009e));
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f25005e ? 1 : 0);
        AbstractC16852e.subscription(parcel, 5, this.f25015e, i);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f25002e ? 1 : 0);
        AbstractC16852e.subscription(parcel, 7, this.f25019e, i);
        AbstractC16852e.isPro(parcel, 8, 4);
        parcel.writeInt(this.f25018e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 9, 8);
        parcel.writeDouble(this.f25013e);
        AbstractC16852e.isPro(parcel, 10, 4);
        parcel.writeInt(this.f25016e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 11, 4);
        parcel.writeInt(this.f25006e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 12, 4);
        parcel.writeInt(this.f25014e ? 1 : 0);
        AbstractC16852e.signatures(parcel, 13, DesugarCollections.unmodifiableList(this.f25004e));
        AbstractC16852e.isPro(parcel, 14, 4);
        parcel.writeInt(this.f25003e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 15, 4);
        parcel.writeInt(0);
        AbstractC16852e.isPro(parcel, 16, 4);
        parcel.writeInt(this.f25007e ? 1 : 0);
        AbstractC16852e.subscription(parcel, 17, this.f25011e, i);
        AbstractC16852e.subscription(parcel, 18, this.f25012e, i);
        AbstractC16852e.isPro(parcel, 19, 4);
        parcel.writeInt(this.f25010e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 20, 4);
        parcel.writeInt(this.f25008e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
