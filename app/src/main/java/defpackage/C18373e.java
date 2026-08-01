package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18373e {
    public final String ad;
    public final C5695e adcel;
    public final float appmetrica;
    public final int billing;
    public final float license;
    public final float metrica;
    public boolean mopub;
    public final long purchase;
    public final ArrayList startapp;
    public final float vip;
    public final boolean yandex;

    public C18373e(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? BuildConfig.FLAVOR : str;
        long j2 = (i2 & 32) != 0 ? C3618e.adcel : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        boolean z2 = (i2 & 128) != 0 ? false : z;
        this.ad = str;
        this.vip = f;
        this.metrica = f2;
        this.license = f3;
        this.appmetrica = f4;
        this.purchase = j2;
        this.billing = i3;
        this.yandex = z2;
        ArrayList arrayList = new ArrayList();
        this.startapp = arrayList;
        C5695e c5695e = new C5695e(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.adcel = c5695e;
        arrayList.add(c5695e);
    }

    public static void ad(C18373e c18373e, ArrayList arrayList, C18466e c18466e) {
        if (c18373e.mopub) {
            AbstractC14070e.metrica("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C5695e) AbstractC17861e.mopub(1, c18373e.startapp)).adcel.add(new C6693e(BuildConfig.FLAVOR, arrayList, 0, c18466e, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C17149e vip() {
        if (this.mopub) {
            AbstractC14070e.metrica("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.startapp;
            if (arrayList.size() <= 1) {
                C5695e c5695e = this.adcel;
                C17149e c17149e = new C17149e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, new C15515e(c5695e.ad, c5695e.vip, c5695e.metrica, c5695e.license, c5695e.appmetrica, c5695e.purchase, c5695e.billing, c5695e.yandex, c5695e.startapp, c5695e.adcel), this.purchase, this.billing, this.yandex);
                this.mopub = true;
                return c17149e;
            }
            if (this.mopub) {
                AbstractC14070e.metrica("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C5695e c5695e2 = (C5695e) arrayList.remove(arrayList.size() - 1);
            ((C5695e) AbstractC17861e.mopub(1, arrayList)).adcel.add(new C15515e(c5695e2.ad, c5695e2.vip, c5695e2.metrica, c5695e2.license, c5695e2.appmetrica, c5695e2.purchase, c5695e2.billing, c5695e2.yandex, c5695e2.startapp, c5695e2.adcel));
        }
    }
}
