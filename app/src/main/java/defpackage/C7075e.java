package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7075e implements Parcelable.Creator {
    public final /* synthetic */ int ad;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eؕٚٓ] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.ad) {
            case 0:
                int m2199throw = AbstractC6532e.m2199throw(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < m2199throw) {
                    int readInt = parcel.readInt();
                    String str15 = str13;
                    switch ((char) readInt) {
                        case 2:
                            str = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case 3:
                            str2 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case 4:
                            str3 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case 5:
                            str4 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case 6:
                            str5 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case 7:
                            str6 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case '\b':
                            str7 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case '\t':
                            str8 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case '\n':
                            str9 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case 11:
                            str10 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case '\f':
                            str11 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case '\r':
                            str12 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        case 14:
                            str13 = AbstractC6532e.loadAd(parcel, readInt);
                            continue;
                        case 15:
                            str14 = AbstractC6532e.loadAd(parcel, readInt);
                            break;
                        default:
                            AbstractC6532e.m2196native(parcel, readInt);
                            break;
                    }
                    str13 = str15;
                }
                AbstractC6532e.pro(parcel, m2199throw);
                ?? obj = new Object();
                obj.f7730e = str;
                obj.f7725e = str2;
                obj.f7722e = str3;
                obj.f7728e = str4;
                obj.f7719e = str5;
                obj.f7732e = str6;
                obj.f7731e = str7;
                obj.f7726e = str8;
                obj.f7729e = str9;
                obj.f7723e = str10;
                obj.f7727e = str11;
                obj.f7721e = str12;
                obj.f7720e = str13;
                obj.f7724e = str14;
                return obj;
            default:
                int m2199throw2 = AbstractC6532e.m2199throw(parcel);
                int i = 0;
                int i2 = 0;
                while (parcel.dataPosition() < m2199throw2) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 3) {
                        i = AbstractC6532e.m2192class(parcel, readInt2);
                    } else if (c != 4) {
                        AbstractC6532e.m2196native(parcel, readInt2);
                    } else {
                        i2 = AbstractC6532e.m2192class(parcel, readInt2);
                    }
                }
                AbstractC6532e.pro(parcel, m2199throw2);
                return new C6611e(i, i2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new C3470e[i];
            default:
                return new C6611e[i];
        }
    }
}
