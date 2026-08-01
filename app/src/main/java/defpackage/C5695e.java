package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5695e {
    public final String ad;
    public final ArrayList adcel;
    public final float appmetrica;
    public final float billing;
    public final float license;
    public final float metrica;
    public final float purchase;
    public final List startapp;
    public final float vip;
    public final float yandex;

    public C5695e(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
        str = (i & 1) != 0 ? BuildConfig.FLAVOR : str;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 1.0f : f4;
        f5 = (i & 32) != 0 ? 1.0f : f5;
        f6 = (i & 64) != 0 ? 0.0f : f6;
        f7 = (i & 128) != 0 ? 0.0f : f7;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            int i2 = AbstractC13069e.ad;
            list = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList();
        this.ad = str;
        this.vip = f;
        this.metrica = f2;
        this.license = f3;
        this.appmetrica = f4;
        this.purchase = f5;
        this.billing = f6;
        this.yandex = f7;
        this.startapp = list;
        this.adcel = arrayList;
    }
}
