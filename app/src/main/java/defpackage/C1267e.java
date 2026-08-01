package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267e extends AbstractC1782e {
    public int adcel;
    public final Parcel appmetrica;
    public final int billing;
    public final SparseIntArray license;
    public int mopub;
    public final int purchase;
    public int startapp;
    public final String yandex;

    public C1267e(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C17519e(0), new C17519e(0), new C17519e(0));
    }

    public C1267e(Parcel parcel, int i, int i2, String str, C17519e c17519e, C17519e c17519e2, C17519e c17519e3) {
        super(c17519e, c17519e2, c17519e3);
        this.license = new SparseIntArray();
        this.startapp = -1;
        this.mopub = -1;
        this.appmetrica = parcel;
        this.purchase = i;
        this.billing = i2;
        this.adcel = i;
        this.yandex = str;
    }

    @Override // defpackage.AbstractC1782e
    public final C1267e ad() {
        Parcel parcel = this.appmetrica;
        int dataPosition = parcel.dataPosition();
        int i = this.adcel;
        if (i == this.purchase) {
            i = this.billing;
        }
        return new C1267e(parcel, dataPosition, i, AbstractC1786e.signatures(new StringBuilder(), this.yandex, "  "), this.ad, this.vip, this.metrica);
    }

    @Override // defpackage.AbstractC1782e
    public final boolean appmetrica(int i) {
        while (this.adcel < this.billing) {
            int i2 = this.mopub;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.adcel;
            Parcel parcel = this.appmetrica;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.mopub = parcel.readInt();
            this.adcel += readInt;
        }
        return this.mopub == i;
    }

    @Override // defpackage.AbstractC1782e
    public final void startapp(int i) {
        int i2 = this.startapp;
        SparseIntArray sparseIntArray = this.license;
        Parcel parcel = this.appmetrica;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.startapp = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }
}
