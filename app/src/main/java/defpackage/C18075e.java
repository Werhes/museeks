package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18075e {
    public final int ad;
    public final int appmetrica;
    public int billing;
    public final int license;
    public final int metrica;
    public boolean purchase;
    public float[] startapp;
    public final int vip;
    public int yandex;

    public C18075e(int i, int i2) {
        this.ad = Color.red(i);
        this.vip = Color.green(i);
        this.metrica = Color.blue(i);
        this.license = i;
        this.appmetrica = i2;
    }

    public final void ad() {
        if (this.purchase) {
            return;
        }
        int i = this.license;
        int purchase = AbstractC3898e.purchase(-1, 4.5f, i);
        int purchase2 = AbstractC3898e.purchase(-1, 3.0f, i);
        if (purchase != -1 && purchase2 != -1) {
            this.yandex = AbstractC3898e.startapp(-1, purchase);
            this.billing = AbstractC3898e.startapp(-1, purchase2);
            this.purchase = true;
            return;
        }
        int purchase3 = AbstractC3898e.purchase(-16777216, 4.5f, i);
        int purchase4 = AbstractC3898e.purchase(-16777216, 3.0f, i);
        if (purchase3 == -1 || purchase4 == -1) {
            this.yandex = purchase != -1 ? AbstractC3898e.startapp(-1, purchase) : AbstractC3898e.startapp(-16777216, purchase3);
            this.billing = purchase2 != -1 ? AbstractC3898e.startapp(-1, purchase2) : AbstractC3898e.startapp(-16777216, purchase4);
            this.purchase = true;
        } else {
            this.yandex = AbstractC3898e.startapp(-16777216, purchase3);
            this.billing = AbstractC3898e.startapp(-16777216, purchase4);
            this.purchase = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18075e.class == obj.getClass()) {
            C18075e c18075e = (C18075e) obj;
            if (this.appmetrica == c18075e.appmetrica && this.license == c18075e.license) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.license * 31) + this.appmetrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C18075e.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.license));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(vip()));
        sb.append("] [Population: ");
        sb.append(this.appmetrica);
        sb.append("] [Title Text: #");
        ad();
        sb.append(Integer.toHexString(this.billing));
        sb.append("] [Body Text: #");
        ad();
        sb.append(Integer.toHexString(this.yandex));
        sb.append(']');
        return sb.toString();
    }

    public final float[] vip() {
        if (this.startapp == null) {
            this.startapp = new float[3];
        }
        AbstractC3898e.ad(this.ad, this.vip, this.metrica, this.startapp);
        return this.startapp;
    }
}
