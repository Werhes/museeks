package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1727e extends AbstractC6484e {
    public static final Parcelable.Creator<C1727e> CREATOR;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public static final C4821e f4685e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public static final int[] f4686e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f4687e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final int f4688e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final int f4689e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f4690e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final int f4691e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final int f4692e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final int f4693e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final int f4694e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public final C13645e f4695e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final int f4696e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int[] f4697e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final int f4698e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final int f4699e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final int f4700e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final int f4701e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f4702e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final int f4703e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final int f4704e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final int f4705e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final int f4706e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final int f4707e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public final int f4708e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public final boolean f4709e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final int f4710e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final int f4711e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public final boolean f4712e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f4713e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final int f4714e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f4715e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final int f4716e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ArrayList f4717e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final int f4718e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f4719e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final int f4720e;

    static {
        C7038e c7038e = AbstractC8718e.f17583e;
        Object[] objArr = {MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING};
        for (int i = 0; i < 2; i++) {
            AbstractC8457e.mopub(i, objArr[i]);
        }
        f4685e = AbstractC8718e.Signature(2, objArr);
        f4686e = new int[]{0, 1};
        CREATOR = new C0928e(9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1727e(List list, int[] iArr, long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, IBinder iBinder, boolean z, boolean z2) {
        C13645e c13645e;
        this.f4717e = new ArrayList(list);
        this.f4697e = Arrays.copyOf(iArr, iArr.length);
        this.f4690e = j;
        this.f4713e = str;
        this.f4687e = i;
        this.f4719e = i2;
        this.f4718e = i3;
        this.f4702e = i4;
        this.f4715e = i5;
        this.f4691e = i6;
        this.f4705e = i7;
        this.f4689e = i8;
        this.f4688e = i9;
        this.f4693e = i10;
        this.f4699e = i11;
        this.f4700e = i12;
        this.f4698e = i13;
        this.f4694e = i14;
        this.f4711e = i15;
        this.f4720e = i16;
        this.f4692e = i17;
        this.f4707e = i18;
        this.f4714e = i19;
        this.f4716e = i20;
        this.f4706e = i21;
        this.f4703e = i22;
        this.f4704e = i23;
        this.f4710e = i24;
        this.f4701e = i25;
        this.f4696e = i26;
        this.f4708e = i27;
        this.f4712e = z;
        this.f4709e = z2;
        if (iBinder == null) {
            c13645e = 0;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            c13645e = queryLocalInterface instanceof C13645e ? (C13645e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider", 1);
        }
        this.f4695e = c13645e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.signatures(parcel, 2, this.f4717e);
        int[] iArr = this.f4697e;
        AbstractC16852e.amazon(parcel, 3, Arrays.copyOf(iArr, iArr.length));
        AbstractC16852e.isPro(parcel, 4, 8);
        parcel.writeLong(this.f4690e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f4713e);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f4687e);
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(this.f4719e);
        AbstractC16852e.isPro(parcel, 8, 4);
        parcel.writeInt(this.f4718e);
        AbstractC16852e.isPro(parcel, 9, 4);
        parcel.writeInt(this.f4702e);
        AbstractC16852e.isPro(parcel, 10, 4);
        parcel.writeInt(this.f4715e);
        AbstractC16852e.isPro(parcel, 11, 4);
        parcel.writeInt(this.f4691e);
        AbstractC16852e.isPro(parcel, 12, 4);
        parcel.writeInt(this.f4705e);
        AbstractC16852e.isPro(parcel, 13, 4);
        parcel.writeInt(this.f4689e);
        AbstractC16852e.isPro(parcel, 14, 4);
        parcel.writeInt(this.f4688e);
        AbstractC16852e.isPro(parcel, 15, 4);
        parcel.writeInt(this.f4693e);
        AbstractC16852e.isPro(parcel, 16, 4);
        parcel.writeInt(this.f4699e);
        AbstractC16852e.isPro(parcel, 17, 4);
        parcel.writeInt(this.f4700e);
        AbstractC16852e.isPro(parcel, 18, 4);
        parcel.writeInt(this.f4698e);
        AbstractC16852e.isPro(parcel, 19, 4);
        parcel.writeInt(this.f4694e);
        AbstractC16852e.isPro(parcel, 20, 4);
        parcel.writeInt(this.f4711e);
        AbstractC16852e.isPro(parcel, 21, 4);
        parcel.writeInt(this.f4720e);
        AbstractC16852e.isPro(parcel, 22, 4);
        parcel.writeInt(this.f4692e);
        AbstractC16852e.isPro(parcel, 23, 4);
        parcel.writeInt(this.f4707e);
        AbstractC16852e.isPro(parcel, 24, 4);
        parcel.writeInt(this.f4714e);
        AbstractC16852e.isPro(parcel, 25, 4);
        parcel.writeInt(this.f4716e);
        AbstractC16852e.isPro(parcel, 26, 4);
        parcel.writeInt(this.f4706e);
        AbstractC16852e.isPro(parcel, 27, 4);
        parcel.writeInt(this.f4703e);
        AbstractC16852e.isPro(parcel, 28, 4);
        parcel.writeInt(this.f4704e);
        AbstractC16852e.isPro(parcel, 29, 4);
        parcel.writeInt(this.f4710e);
        AbstractC16852e.isPro(parcel, 30, 4);
        parcel.writeInt(this.f4701e);
        AbstractC16852e.isPro(parcel, 31, 4);
        parcel.writeInt(this.f4696e);
        AbstractC16852e.isPro(parcel, 32, 4);
        parcel.writeInt(this.f4708e);
        C13645e c13645e = this.f4695e;
        AbstractC16852e.smaato(parcel, 33, c13645e == null ? null : c13645e.license);
        AbstractC16852e.isPro(parcel, 34, 4);
        parcel.writeInt(this.f4712e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 35, 4);
        parcel.writeInt(this.f4709e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
