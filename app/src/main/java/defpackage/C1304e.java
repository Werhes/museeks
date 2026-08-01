package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.car.app.navigation.model.Maneuver;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304e implements Parcelable.Creator {
    public final /* synthetic */ int ad;

    public /* synthetic */ C1304e(int i) {
        this.ad = i;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [eٍْؔ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, eّٞۚ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [eًّ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [eٌؔٔ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        InterfaceC3455e interfaceC3455e = null;
        Account account = null;
        C14758e c14758e = null;
        C4670e c4670e = null;
        ArrayList arrayList = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayList3 = null;
        switch (this.ad) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                return new C2616e(parcel.readFloat());
            case 2:
                return new C16330e(parcel.readInt());
            case 3:
                return new C15867e(parcel.readLong());
            case 4:
                ?? obj = new Object();
                obj.f40e = parcel.readInt();
                obj.f37e = parcel.readInt();
                obj.f39e = parcel.readInt();
                obj.f36e = parcel.readInt();
                obj.f38e = parcel.readInt();
                return obj;
            case 5:
                return new C4820e(parcel);
            case 6:
                return new PlaybackStateCompat(parcel);
            case 7:
                return new C4206e(parcel);
            case 8:
                return new C7434e(parcel.readInt(), parcel.readFloat());
            case 9:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 10:
                ?? obj2 = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i8 = BinderC7702e.license;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC3455e.vip);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC3455e)) {
                        ?? obj3 = new Object();
                        obj3.metrica = readStrongBinder;
                        interfaceC3455e = obj3;
                    } else {
                        interfaceC3455e = (InterfaceC3455e) queryLocalInterface;
                    }
                }
                obj2.f25354e = interfaceC3455e;
                return obj2;
            case 11:
                ?? obj4 = new Object();
                obj4.f25591e = parcel.readInt();
                obj4.f25589e = parcel.readInt();
                obj4.f25590e = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj4.f25588e = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj4;
            case 12:
                ?? obj5 = new Object();
                obj5.f6283e = parcel.readInt();
                obj5.f6279e = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj5.f6277e = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj5.f6281e = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj5.f6276e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj5.f6285e = iArr3;
                    parcel.readIntArray(iArr3);
                }
                obj5.f6280e = parcel.readInt() == 1;
                obj5.f6282e = parcel.readInt() == 1;
                obj5.f6278e = parcel.readInt() == 1;
                obj5.f6284e = parcel.readArrayList(C12788e.class.getClassLoader());
                return obj5;
            case 13:
                return new C8319e(parcel);
            case 14:
                return new C10690e(parcel);
            case 15:
                int m2199throw = AbstractC6532e.m2199throw(parcel);
                int i9 = 0;
                while (parcel.dataPosition() < m2199throw) {
                    int readInt4 = parcel.readInt();
                    char c = (char) readInt4;
                    if (c == 1) {
                        z2 = AbstractC6532e.premium(parcel, readInt4);
                    } else if (c != 2) {
                        AbstractC6532e.m2196native(parcel, readInt4);
                    } else {
                        i9 = AbstractC6532e.m2192class(parcel, readInt4);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw);
                return new C9810e(z2, i9);
            case 16:
                int m2199throw2 = AbstractC6532e.m2199throw(parcel);
                int i10 = 0;
                boolean z3 = false;
                boolean z4 = false;
                IBinder iBinder = null;
                C14758e c14758e2 = null;
                while (parcel.dataPosition() < m2199throw2) {
                    int readInt5 = parcel.readInt();
                    char c2 = (char) readInt5;
                    if (c2 == 1) {
                        i10 = AbstractC6532e.m2192class(parcel, readInt5);
                    } else if (c2 == 2) {
                        iBinder = AbstractC6532e.firebase(parcel, readInt5);
                    } else if (c2 == 3) {
                        c14758e2 = (C14758e) AbstractC6532e.amazon(parcel, readInt5, C14758e.CREATOR);
                    } else if (c2 == 4) {
                        z3 = AbstractC6532e.premium(parcel, readInt5);
                    } else if (c2 != 5) {
                        AbstractC6532e.m2196native(parcel, readInt5);
                    } else {
                        z4 = AbstractC6532e.premium(parcel, readInt5);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw2);
                return new C4694e(i10, iBinder, c14758e2, z3, z4);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int m2199throw3 = AbstractC6532e.m2199throw(parcel);
                while (parcel.dataPosition() < m2199throw3) {
                    int readInt6 = parcel.readInt();
                    char c3 = (char) readInt6;
                    if (c3 == 1) {
                        i7 = AbstractC6532e.m2192class(parcel, readInt6);
                    } else if (c3 != 2) {
                        AbstractC6532e.m2196native(parcel, readInt6);
                    } else {
                        arrayList3 = AbstractC6532e.remoteconfig(parcel, readInt6, C11632e.CREATOR);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw3);
                return new C11075e(i7, arrayList3);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int m2199throw4 = AbstractC6532e.m2199throw(parcel);
                while (parcel.dataPosition() < m2199throw4) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        AbstractC6532e.m2196native(parcel, readInt7);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC6532e.amazon(parcel, readInt7, PendingIntent.CREATOR);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw4);
                return new C18262e(pendingIntent);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int m2199throw5 = AbstractC6532e.m2199throw(parcel);
                int i11 = 0;
                while (parcel.dataPosition() < m2199throw5) {
                    int readInt8 = parcel.readInt();
                    char c4 = (char) readInt8;
                    if (c4 == 1) {
                        i6 = AbstractC6532e.m2192class(parcel, readInt8);
                    } else if (c4 == 2) {
                        i11 = AbstractC6532e.m2192class(parcel, readInt8);
                    } else if (c4 != 3) {
                        AbstractC6532e.m2196native(parcel, readInt8);
                    } else {
                        intent = (Intent) AbstractC6532e.amazon(parcel, readInt8, Intent.CREATOR);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw5);
                return new C15317e(i6, i11, intent);
            case 20:
                int m2199throw6 = AbstractC6532e.m2199throw(parcel);
                long j = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri2 = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList4 = null;
                String str7 = null;
                String str8 = null;
                while (parcel.dataPosition() < m2199throw6) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str = AbstractC6532e.loadAd(parcel, readInt9);
                            break;
                        case 3:
                            str2 = AbstractC6532e.loadAd(parcel, readInt9);
                            break;
                        case 4:
                            str3 = AbstractC6532e.loadAd(parcel, readInt9);
                            break;
                        case 5:
                            str4 = AbstractC6532e.loadAd(parcel, readInt9);
                            break;
                        case 6:
                            uri2 = (Uri) AbstractC6532e.amazon(parcel, readInt9, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = AbstractC6532e.loadAd(parcel, readInt9);
                            break;
                        case '\b':
                            j = AbstractC6532e.m2194goto(parcel, readInt9);
                            break;
                        case '\t':
                            str6 = AbstractC6532e.loadAd(parcel, readInt9);
                            break;
                        case '\n':
                            arrayList4 = AbstractC6532e.remoteconfig(parcel, readInt9, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = AbstractC6532e.loadAd(parcel, readInt9);
                            break;
                        case '\f':
                            str8 = AbstractC6532e.loadAd(parcel, readInt9);
                            break;
                        default:
                            AbstractC6532e.m2196native(parcel, readInt9);
                            break;
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw6);
                return new GoogleSignInAccount(str, str2, str3, str4, uri2, str5, j, str6, arrayList4, str7, str8);
            case 21:
                int m2199throw7 = AbstractC6532e.m2199throw(parcel);
                long j2 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z5 = false;
                String str9 = null;
                while (parcel.dataPosition() < m2199throw7) {
                    int readInt10 = parcel.readInt();
                    char c5 = (char) readInt10;
                    if (c5 == 1) {
                        i12 = AbstractC6532e.m2192class(parcel, readInt10);
                    } else if (c5 == 2) {
                        str9 = AbstractC6532e.loadAd(parcel, readInt10);
                    } else if (c5 == 3) {
                        j2 = AbstractC6532e.m2194goto(parcel, readInt10);
                    } else if (c5 == 4) {
                        i13 = AbstractC6532e.m2192class(parcel, readInt10);
                    } else if (c5 != 5) {
                        AbstractC6532e.m2196native(parcel, readInt10);
                    } else {
                        z5 = AbstractC6532e.premium(parcel, readInt10);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw7);
                return new C7330e(i12, i13, j2, str9, z5);
            case 22:
                int m2199throw8 = AbstractC6532e.m2199throw(parcel);
                boolean z6 = false;
                while (parcel.dataPosition() < m2199throw8) {
                    int readInt11 = parcel.readInt();
                    char c6 = (char) readInt11;
                    if (c6 == 1) {
                        i5 = AbstractC6532e.m2192class(parcel, readInt11);
                    } else if (c6 != 2) {
                        AbstractC6532e.m2196native(parcel, readInt11);
                    } else {
                        z6 = AbstractC6532e.premium(parcel, readInt11);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw8);
                return new C4453e(i5, z6);
            case 23:
                int m2199throw9 = AbstractC6532e.m2199throw(parcel);
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < m2199throw9) {
                    int readInt12 = parcel.readInt();
                    char c7 = (char) readInt12;
                    if (c7 == 1) {
                        arrayList2 = AbstractC6532e.remoteconfig(parcel, readInt12, C1032e.CREATOR);
                    } else if (c7 == 2) {
                        z = AbstractC6532e.premium(parcel, readInt12);
                    } else if (c7 == 3) {
                        str10 = AbstractC6532e.loadAd(parcel, readInt12);
                    } else if (c7 != 4) {
                        AbstractC6532e.m2196native(parcel, readInt12);
                    } else {
                        str11 = AbstractC6532e.loadAd(parcel, readInt12);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw9);
                return new C9705e(arrayList2, z, str10, str11);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int m2199throw10 = AbstractC6532e.m2199throw(parcel);
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < m2199throw10) {
                    int readInt13 = parcel.readInt();
                    char c8 = (char) readInt13;
                    if (c8 == 1) {
                        i4 = AbstractC6532e.m2192class(parcel, readInt13);
                    } else if (c8 == 2) {
                        uri = (Uri) AbstractC6532e.amazon(parcel, readInt13, Uri.CREATOR);
                    } else if (c8 == 3) {
                        i14 = AbstractC6532e.m2192class(parcel, readInt13);
                    } else if (c8 != 4) {
                        AbstractC6532e.m2196native(parcel, readInt13);
                    } else {
                        i15 = AbstractC6532e.m2192class(parcel, readInt13);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw10);
                return new C5470e(i4, uri, i14, i15);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                int m2199throw11 = AbstractC6532e.m2199throw(parcel);
                String str12 = null;
                while (parcel.dataPosition() < m2199throw11) {
                    int readInt14 = parcel.readInt();
                    char c9 = (char) readInt14;
                    if (c9 == 1) {
                        arrayList = AbstractC6532e.admob(parcel, readInt14);
                    } else if (c9 != 2) {
                        AbstractC6532e.m2196native(parcel, readInt14);
                    } else {
                        str12 = AbstractC6532e.loadAd(parcel, readInt14);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw11);
                return new C16378e(str12, arrayList);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                int m2199throw12 = AbstractC6532e.m2199throw(parcel);
                while (parcel.dataPosition() < m2199throw12) {
                    int readInt15 = parcel.readInt();
                    char c10 = (char) readInt15;
                    if (c10 == 1) {
                        i3 = AbstractC6532e.m2192class(parcel, readInt15);
                    } else if (c10 != 2) {
                        AbstractC6532e.m2196native(parcel, readInt15);
                    } else {
                        c4670e = (C4670e) AbstractC6532e.amazon(parcel, readInt15, C4670e.CREATOR);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw12);
                return new C6419e(i3, c4670e);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                int m2199throw13 = AbstractC6532e.m2199throw(parcel);
                C4694e c4694e = null;
                while (parcel.dataPosition() < m2199throw13) {
                    int readInt16 = parcel.readInt();
                    char c11 = (char) readInt16;
                    if (c11 == 1) {
                        i2 = AbstractC6532e.m2192class(parcel, readInt16);
                    } else if (c11 == 2) {
                        c14758e = (C14758e) AbstractC6532e.amazon(parcel, readInt16, C14758e.CREATOR);
                    } else if (c11 != 3) {
                        AbstractC6532e.m2196native(parcel, readInt16);
                    } else {
                        c4694e = (C4694e) AbstractC6532e.amazon(parcel, readInt16, C4694e.CREATOR);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw13);
                return new C8302e(i2, c14758e, c4694e);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                int m2199throw14 = AbstractC6532e.m2199throw(parcel);
                int i16 = -1;
                long j3 = 0;
                long j4 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < m2199throw14) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i17 = AbstractC6532e.m2192class(parcel, readInt17);
                            break;
                        case 2:
                            i18 = AbstractC6532e.m2192class(parcel, readInt17);
                            break;
                        case 3:
                            i19 = AbstractC6532e.m2192class(parcel, readInt17);
                            break;
                        case 4:
                            j3 = AbstractC6532e.m2194goto(parcel, readInt17);
                            break;
                        case 5:
                            j4 = AbstractC6532e.m2194goto(parcel, readInt17);
                            break;
                        case 6:
                            str13 = AbstractC6532e.loadAd(parcel, readInt17);
                            break;
                        case 7:
                            str14 = AbstractC6532e.loadAd(parcel, readInt17);
                            break;
                        case '\b':
                            i20 = AbstractC6532e.m2192class(parcel, readInt17);
                            break;
                        case '\t':
                            i16 = AbstractC6532e.m2192class(parcel, readInt17);
                            break;
                        default:
                            AbstractC6532e.m2196native(parcel, readInt17);
                            break;
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw14);
                return new C11632e(i17, i18, i19, j3, j4, str13, str14, i20, i16);
            default:
                int m2199throw15 = AbstractC6532e.m2199throw(parcel);
                int i21 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < m2199throw15) {
                    int readInt18 = parcel.readInt();
                    char c12 = (char) readInt18;
                    if (c12 == 1) {
                        i = AbstractC6532e.m2192class(parcel, readInt18);
                    } else if (c12 == 2) {
                        account = (Account) AbstractC6532e.amazon(parcel, readInt18, Account.CREATOR);
                    } else if (c12 == 3) {
                        i21 = AbstractC6532e.m2192class(parcel, readInt18);
                    } else if (c12 != 4) {
                        AbstractC6532e.m2196native(parcel, readInt18);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC6532e.amazon(parcel, readInt18, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw15);
                return new C4670e(i, account, i21, googleSignInAccount);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new ParcelImpl[i];
            case 1:
                return new C2616e[i];
            case 2:
                return new C16330e[i];
            case 3:
                return new C15867e[i];
            case 4:
                return new ParcelableVolumeInfo[i];
            case 5:
                return new C4820e[i];
            case 6:
                return new PlaybackStateCompat[i];
            case 7:
                return new C4206e[i];
            case 8:
                return new C7434e[i];
            case 9:
                return new RatingCompat[i];
            case 10:
                return new C12636e[i];
            case 11:
                return new C12788e[i];
            case 12:
                return new C2457e[i];
            case 13:
                return new C8319e[i];
            case 14:
                return new C10690e[i];
            case 15:
                return new C9810e[i];
            case 16:
                return new C4694e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C11075e[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18262e[i];
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C15317e[i];
            case 20:
                return new GoogleSignInAccount[i];
            case 21:
                return new C7330e[i];
            case 22:
                return new C4453e[i];
            case 23:
                return new C9705e[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C5470e[i];
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C16378e[i];
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C6419e[i];
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C8302e[i];
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C11632e[i];
            default:
                return new C4670e[i];
        }
    }
}
