package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8751e extends AbstractC13965e {
    public List Signature;
    public final int adcel;
    public int admob;
    public boolean inmobi;
    public long isPro;
    public List loadAd;
    public final int mopub;
    public boolean pro;
    public boolean remoteconfig;
    public byte signatures;
    public final int startapp;
    public int subscription;
    public byte tapsense;
    public static final int[] applovin = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] ads = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] premium = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] subs = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, EnergyProfile.EVCONNECTOR_TYPE_OTHER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] crashlytics = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] firebase = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: class, reason: not valid java name */
    public static final int[] f17650class = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: interface, reason: not valid java name */
    public static final boolean[] f17651interface = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final C1292e yandex = new C1292e();
    public final ArrayList smaato = new ArrayList();
    public C6980e amazon = new C6980e(0, 4);
    public int isVip = 0;
    public final long advert = 16000000;

    public C8751e(String str, int i) {
        this.startapp = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.mopub = 0;
            this.adcel = 0;
        } else if (i == 2) {
            this.mopub = 1;
            this.adcel = 0;
        } else if (i == 3) {
            this.mopub = 0;
            this.adcel = 1;
        } else if (i != 4) {
            AbstractC2803e.smaato("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.mopub = 0;
            this.adcel = 0;
        } else {
            this.mopub = 1;
            this.adcel = 1;
        }
        advert(0);
        mopub();
        this.inmobi = true;
        this.isPro = -9223372036854775807L;
    }

    public final ArrayList adcel() {
        ArrayList arrayList = this.smaato;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C17817e metrica = ((C6980e) arrayList.get(i2)).metrica(RecyclerView.UNDEFINED_DURATION);
            arrayList2.add(metrica);
            if (metrica != null) {
                i = Math.min(i, metrica.startapp);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C17817e c17817e = (C17817e) arrayList2.get(i3);
            if (c17817e != null) {
                if (c17817e.startapp != i) {
                    c17817e = ((C6980e) arrayList.get(i3)).metrica(i);
                    c17817e.getClass();
                }
                arrayList3.add(c17817e);
            }
        }
        return arrayList3;
    }

    public final void advert(int i) {
        int i2 = this.admob;
        if (i2 == i) {
            return;
        }
        this.admob = i;
        if (i != 3) {
            mopub();
            if (i2 == 3 || i == 1 || i == 0) {
                this.loadAd = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.smaato;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C6980e) arrayList.get(i3)).billing = i;
            i3++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x01c5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:160:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // defpackage.AbstractC13965e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void billing(defpackage.C6040e r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8751e.billing(eؘۥٚ):void");
    }

    @Override // defpackage.AbstractC13965e, defpackage.InterfaceC6145e
    public final void flush() {
        super.flush();
        this.loadAd = null;
        this.Signature = null;
        advert(0);
        this.subscription = 4;
        this.amazon.yandex = 4;
        mopub();
        this.remoteconfig = false;
        this.pro = false;
        this.signatures = (byte) 0;
        this.tapsense = (byte) 0;
        this.isVip = 0;
        this.inmobi = true;
        this.isPro = -9223372036854775807L;
    }

    public final void mopub() {
        C6980e c6980e = this.amazon;
        c6980e.billing = this.admob;
        c6980e.ad.clear();
        c6980e.vip.clear();
        c6980e.metrica.setLength(0);
        c6980e.license = 15;
        c6980e.appmetrica = 0;
        c6980e.purchase = 0;
        ArrayList arrayList = this.smaato;
        arrayList.clear();
        arrayList.add(this.amazon);
    }

    @Override // defpackage.AbstractC13965e
    public final C9770e purchase() {
        List list = this.loadAd;
        this.Signature = list;
        list.getClass();
        return new C9770e(4, list);
    }

    @Override // defpackage.AbstractC13965e, defpackage.InterfaceC6145e
    public final void release() {
    }

    @Override // defpackage.AbstractC13965e
    public final boolean startapp() {
        return this.loadAd != this.Signature;
    }

    @Override // defpackage.AbstractC13965e, defpackage.InterfaceC6145e
    /* renamed from: yandex */
    public final C0598e metrica() {
        C0598e c0598e;
        C0598e metrica = super.metrica();
        if (metrica != null) {
            return metrica;
        }
        long j = this.advert;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.isPro;
        if (j2 == -9223372036854775807L || this.appmetrica - j2 < j || (c0598e = (C0598e) this.vip.pollFirst()) == null) {
            return null;
        }
        this.loadAd = Collections.EMPTY_LIST;
        this.isPro = -9223372036854775807L;
        C9770e purchase = purchase();
        long j3 = this.appmetrica;
        c0598e.f22622e = j3;
        c0598e.f2809e = purchase;
        c0598e.f2812e = j3;
        return c0598e;
    }
}
